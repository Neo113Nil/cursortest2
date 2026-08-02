package l60;

import U50.j;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.nativecontrol.CopyClipboardData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7886d implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f72920a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f72921b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72922c;

    public C7886d(@NotNull Context context, @NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f72920a = context;
        this.f72921b = moshi;
        this.f72922c = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "copy_clipboard";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Object systemService = this.f72920a.getSystemService("clipboard");
        String str = null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
            str = text.toString();
        }
        this.f72922c.Y(str);
        Moshi moshi = this.f72921b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            str2 = moshi.c(CopyClipboardData.class).toJson(new CopyClipboardData(str));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return new NativeResult.Success(str2);
    }
}

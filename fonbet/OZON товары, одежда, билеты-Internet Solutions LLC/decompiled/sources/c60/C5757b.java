package c60;

import H30.q;
import U50.d;
import U50.j;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.deeplink.OpenDeeplinkData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: c60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5757b implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56618a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f56619b;

    public C5757b(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f56618a = context;
        this.f56619b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "open_deeplink";
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
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        OpenDeeplinkData openDeeplinkData = (OpenDeeplinkData) q.a(this.f56619b, parameterJson, OpenDeeplinkData.class);
        if ((openDeeplinkData != null ? openDeeplinkData.getDeeplink() : null) == null) {
            L80.a.a("OpenDeeplinkBridgeInterface", "data?.deeplink == null");
            return new NativeResult.Error("data?.deeplink == null", null, 2, null);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(openDeeplinkData.getDeeplink()));
        intent.setFlags(268435456);
        Context context = this.f56618a;
        if (context.getPackageManager() == null) {
            L80.a.a("OpenDeeplinkBridgeInterface", "packageManager == null");
            return new NativeResult.Error("packageManager == null", null, 2, null);
        }
        try {
            context.startActivity(intent);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (ActivityNotFoundException e11) {
            L80.a.b("OpenDeeplinkBridgeInterface", "Не удается открыть диплинк без имени пакета приложения");
            L80.a.g(e11);
            return new NativeResult.Error("Не удается открыть диплинк без имени пакета приложения " + e11, null, 2, null);
        }
    }
}

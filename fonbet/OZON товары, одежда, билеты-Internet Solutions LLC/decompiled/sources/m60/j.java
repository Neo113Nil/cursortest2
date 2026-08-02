package m60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class j implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74523a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74524b;

    public j(@NotNull S80.b navigation, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74523a = navigation;
        this.f74524b = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "copy_to_clipboard";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            String string = new JSONObject(parameterJson).getString("text_to_copy");
            this.f74524b.x(string);
            S80.b bVar = this.f74523a;
            Intrinsics.f(string);
            bVar.C0("OZON_LABEL", string);
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.c("NavigationCopyToClip", null, e11);
            return new NativeResult.Error("error copy text", null, 2, null);
        }
    }
}

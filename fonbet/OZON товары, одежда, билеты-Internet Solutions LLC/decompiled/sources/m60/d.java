package m60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class d implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f74509a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74510b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f74511c;

    public d(@NotNull Function0<Unit> reloadWebViewCallback, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(reloadWebViewCallback, "reloadWebViewCallback");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74509a = reloadWebViewCallback;
        this.f74510b = fintechAnalyticInteractor;
        this.f74511c = function0;
    }

    private final NativeResult.Success a() {
        Function0<String> function0 = this.f74511c;
        this.f74510b.r0(function0 != null ? function0.invoke() : null);
        this.f74509a.invoke();
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.DEFAULT;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "force_reload_webview";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(a());
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return a();
    }
}

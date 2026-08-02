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
public final class v implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f74583a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74584b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f74585c;

    public v(@NotNull Function0<Unit> refreshCallback, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(refreshCallback, "refreshCallback");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74583a = refreshCallback;
        this.f74584b = fintechAnalyticInteractor;
        this.f74585c = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "refresh_tab";
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
        Function0<String> function0 = this.f74585c;
        this.f74584b.U(function0 != null ? function0.invoke() : null);
        try {
            this.f74583a.invoke();
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.b("NavigationLoadPendingTabs", "error = " + e11);
            return new NativeResult.Error("Ошибка при рефреше", null, 2, null);
        }
    }
}

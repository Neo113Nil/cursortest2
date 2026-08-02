package m60;

import Ae.C0;
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
public final class p implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f74571b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74572c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f74573d;

    public p(@NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74570a = fintechNavigation;
        this.f74571b = fintechSettings;
        this.f74572c = fintechAnalyticInteractor;
        this.f74573d = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "load_pending_tabs";
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
        if (this.f74571b.m()) {
            return new NativeResult.Error("Загрузка табов отключена в настройках дебага", NativeResult.Error.a.SDK_ERROR);
        }
        Function0<String> function0 = this.f74573d;
        this.f74572c.P1(function0 != null ? function0.invoke() : null);
        try {
            C0 r02 = this.f74570a.r0();
            if (r02 != null) {
                r02.tryEmit(Boolean.TRUE);
            }
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.b("NavigationLoadPendingTabs", "error = " + e11);
            return new NativeResult.Error("Ошибка при рефреше", null, 2, null);
        }
    }
}

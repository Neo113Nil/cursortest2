package m60;

import Ae.C0;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class t implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74577a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74578b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f74579c;

    public t(@NotNull S80.b fintechNavigation, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74577a = fintechNavigation;
        this.f74578b = fintechAnalyticInteractor;
        this.f74579c = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "recreate";
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
        long optLong = new JSONObject(parameterJson).optLong("timeout");
        Function0<String> function0 = this.f74579c;
        this.f74578b.V(optLong, function0 != null ? function0.invoke() : null);
        try {
            C0 c02 = this.f74577a.c0();
            if (c02 != null) {
                c02.tryEmit(Long.valueOf(optLong));
            }
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.b("NavigationRecreate", "error = " + e11);
            return new NativeResult.Error("Ошибка при пересоздании", null, 2, null);
        }
    }
}

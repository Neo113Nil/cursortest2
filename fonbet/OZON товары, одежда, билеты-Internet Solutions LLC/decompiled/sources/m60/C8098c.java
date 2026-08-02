package m60;

import android.os.Handler;
import android.os.Looper;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: m60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8098c implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74507a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<String> f74508b;

    public C8098c(@NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74507a = fintechAnalyticInteractor;
        this.f74508b = function0;
    }

    private final NativeResult.Success a(WeakReference weakReference) {
        Function0<String> function0 = this.f74508b;
        this.f74507a.g(function0 != null ? function0.invoke() : null);
        new Handler(Looper.getMainLooper()).post(new N.r(weakReference, 4));
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.DEFAULT;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "clear_cache";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(a(weakReference));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return a(weakReference);
    }
}

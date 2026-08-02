package k60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class w implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f71007a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f71008b;

    public w(@NotNull InterfaceC9791a mirPayWalletManager, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f71007a = mirPayWalletManager;
        this.f71008b = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "start_mirpayapp_update";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        androidx.fragment.app.r parentFragmentActivity;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f71008b.n1();
        if (weakReference == null || (fintechWebView = weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null) {
            return;
        }
        this.f71007a.b(parentFragmentActivity);
    }
}

package l60;

import L30.i;
import android.view.Window;
import androidx.fragment.app.r;
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

/* renamed from: l60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7883a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f72907a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72908b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f72909c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f72910d;

    public C7883a(@NotNull i fintechLockScreenManager, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0, Function0<String> function02) {
        Intrinsics.checkNotNullParameter(fintechLockScreenManager, "fintechLockScreenManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f72907a = fintechLockScreenManager;
        this.f72908b = fintechAnalyticInteractor;
        this.f72909c = function0;
        this.f72910d = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "phone_screen_lock";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        Window window;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function0<String> function0 = this.f72909c;
        this.f72908b.h(function0 != null ? function0.invoke() : null, this.f72910d.invoke());
        try {
            boolean z11 = new JSONObject(parameterJson).getBoolean("enable");
            if (weakReference == null || (fintechWebView = weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null || (window = parentFragmentActivity.getWindow()) == null) {
                return;
            }
            this.f72907a.c(window, z11);
        } catch (Exception e11) {
            L80.a.c("AutoLockBridgeInterface", null, e11);
        }
    }
}

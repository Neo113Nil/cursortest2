package l60;

import android.view.Window;
import androidx.fragment.app.r;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7889g implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L30.h f72928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72929b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f72930c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f72931d;

    public C7889g(@NotNull L30.h brightness, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0, Function0<String> function02) {
        Intrinsics.checkNotNullParameter(brightness, "brightness");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f72928a = brightness;
        this.f72929b = fintechAnalyticInteractor;
        this.f72930c = function0;
        this.f72931d = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "reset_brightness";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function0<String> function0 = this.f72930c;
        this.f72929b.p0(function0 != null ? function0.invoke() : null, this.f72931d.invoke());
        if (weakReference == null || (fintechWebView = weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null) {
            return;
        }
        Window window = parentFragmentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        this.f72928a.b(window);
    }
}

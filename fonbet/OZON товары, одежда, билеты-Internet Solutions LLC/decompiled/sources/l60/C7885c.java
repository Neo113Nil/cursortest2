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
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7885c implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L30.h f72916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72917b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f72918c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f72919d;

    public C7885c(@NotNull L30.h brightness, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0, Function0<String> function02) {
        Intrinsics.checkNotNullParameter(brightness, "brightness");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f72916a = brightness;
        this.f72917b = fintechAnalyticInteractor;
        this.f72918c = function0;
        this.f72919d = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "set_brightness";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            double d11 = new JSONObject(parameterJson).getDouble("percent");
            InterfaceC6618a interfaceC6618a = this.f72917b;
            Function0<String> function0 = this.f72918c;
            float f7 = (float) d11;
            interfaceC6618a.c(Float.valueOf(f7), function0 != null ? function0.invoke() : null, this.f72919d.invoke());
            if (weakReference == null || (fintechWebView = weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null) {
                return;
            }
            L30.h hVar = this.f72916a;
            Window window = parentFragmentActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            hVar.a(window, f7);
        } catch (Exception e11) {
            L80.a.c("BrightnessBridgeInterface", null, e11);
        }
    }
}

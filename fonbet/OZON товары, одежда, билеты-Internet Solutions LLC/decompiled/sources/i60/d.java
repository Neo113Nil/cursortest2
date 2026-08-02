package i60;

import L3.p;
import U50.j;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.g;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.keyboard.KeyboardShow;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class d extends V50.a<KeyboardShow> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f65916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f65916b = "show";
    }

    @Override // V50.a
    @NotNull
    public final Class<KeyboardShow> b() {
        return KeyboardShow.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, j callback) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        KeyboardShow value = (KeyboardShow) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ns.b.c("Inputmode: ", value.getInputMode(), "KeyboardShowBridgeInterface");
        if (weakReference == null || (fintechWebView = (FintechWebView) weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null || !(parentFragmentActivity instanceof g)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new p(parentFragmentActivity, 3));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f65916b;
    }
}

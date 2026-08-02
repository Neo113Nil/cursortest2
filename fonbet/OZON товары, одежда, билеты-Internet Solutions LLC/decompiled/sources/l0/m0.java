package l0;

import S0.InterfaceC3967k;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.K0;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f72119a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f72119a;
    }

    @NotNull
    public static final InterfaceC7976A b(InterfaceC3967k interfaceC3967k) {
        Z1.d dVar = (Z1.d) interfaceC3967k.m(K0.e());
        boolean q11 = interfaceC3967k.q(dVar.g());
        Object C11 = interfaceC3967k.C();
        if (q11 || C11 == InterfaceC3967k.a.a()) {
            C11 = m0.C.b(new l0(dVar));
            interfaceC3967k.x(C11);
        }
        return (InterfaceC7976A) C11;
    }
}

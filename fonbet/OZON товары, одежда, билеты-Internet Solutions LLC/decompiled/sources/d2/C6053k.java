package d2;

import D1.InterfaceC2801g;
import S0.A0;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6053k {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, C6030G c6030g, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C6030G c6030g2;
        C6030G c6030g3;
        Z1.s sVar;
        boolean n11;
        boolean z11;
        int i14;
        int i15;
        Z1.s sVar2;
        Object obj;
        boolean F11;
        Object C11;
        boolean F12;
        Object C12;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-2032877254);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            c6030g2 = c6030g;
            i13 |= u11.n(c6030g2) ? 32 : 16;
            if ((i11 & 384) == 0) {
                i13 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                c6030g3 = i16 == 0 ? new C6030G(true) : c6030g2;
                View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
                Z1.d dVar = (Z1.d) u11.m(K0.e());
                sVar = (Z1.s) u11.m(K0.k());
                AbstractC3984t l11 = u11.l();
                InterfaceC3978p0 l12 = n1.l(c4912a, u11);
                UUID uuid = (UUID) C5503f.c(new Object[0], null, C6050h.f61049b, u11, 3072, 6);
                n11 = u11.n(view) | u11.n(dVar);
                Object C13 = u11.C();
                if (!n11 || C13 == InterfaceC3967k.a.a()) {
                    z11 = true;
                    i14 = i13;
                    i15 = 32;
                    sVar2 = sVar;
                    DialogC6032I dialogC6032I = new DialogC6032I(function0, c6030g3, view, sVar2, dVar, uuid);
                    dialogC6032I.f(l11, new C4912a(true, 488261145, new C6049g(l12)));
                    u11.x(dialogC6032I);
                    obj = dialogC6032I;
                } else {
                    i14 = i13;
                    obj = C13;
                    i15 = 32;
                    z11 = true;
                    sVar2 = sVar;
                }
                DialogC6032I dialogC6032I2 = (DialogC6032I) obj;
                F11 = u11.F(dialogC6032I2);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C6044b(dialogC6032I2);
                    u11.x(C11);
                }
                S0.Q.c(dialogC6032I2, (Function1) C11, u11);
                F12 = u11.F(dialogC6032I2) | ((i14 & 14) != 4 ? z11 : false) | ((i14 & 112) != i15 ? z11 : false) | u11.n(sVar2);
                C12 = u11.C();
                if (!F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C6045c(dialogC6032I2, function0, c6030g3, sVar2);
                    u11.x(C12);
                }
                u11.g((Function0) C12);
            } else {
                u11.j();
                c6030g3 = c6030g2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new C6046d(function0, c6030g3, c4912a, i11, i12));
                return;
            }
            return;
        }
        c6030g2 = c6030g;
        if ((i11 & 384) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i16 == 0) {
        }
        View view2 = (View) u11.m(AndroidCompositionLocals_androidKt.h());
        Z1.d dVar2 = (Z1.d) u11.m(K0.e());
        sVar = (Z1.s) u11.m(K0.k());
        AbstractC3984t l112 = u11.l();
        InterfaceC3978p0 l122 = n1.l(c4912a, u11);
        UUID uuid2 = (UUID) C5503f.c(new Object[0], null, C6050h.f61049b, u11, 3072, 6);
        n11 = u11.n(view2) | u11.n(dVar2);
        Object C132 = u11.C();
        if (n11) {
        }
        z11 = true;
        i14 = i13;
        i15 = 32;
        sVar2 = sVar;
        DialogC6032I dialogC6032I3 = new DialogC6032I(function0, c6030g3, view2, sVar2, dVar2, uuid2);
        dialogC6032I3.f(l112, new C4912a(true, 488261145, new C6049g(l122)));
        u11.x(dialogC6032I3);
        obj = dialogC6032I3;
        DialogC6032I dialogC6032I22 = (DialogC6032I) obj;
        F11 = u11.F(dialogC6032I22);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new C6044b(dialogC6032I22);
        u11.x(C11);
        S0.Q.c(dialogC6032I22, (Function1) C11, u11);
        F12 = u11.F(dialogC6032I22) | ((i14 & 14) != 4 ? z11 : false) | ((i14 & 112) != i15 ? z11 : false) | u11.n(sVar2);
        C12 = u11.C();
        if (!F12) {
        }
        C12 = new C6045c(dialogC6032I22, function0, c6030g3, sVar2);
        u11.x(C12);
        u11.g((Function0) C12);
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void b(androidx.compose.ui.e eVar, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1177876616);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C6051i c6051i = C6051i.f61050a;
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            int i13 = (((((i12 << 3) & 112) | (((i12 >> 3) & 14) | 384)) << 6) & 896) | 6;
            u11.i();
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, c6051i, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            c4912a.invoke(u11, Integer.valueOf((i13 >> 6) & 14));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C6052j(eVar, c4912a, i11));
        }
    }
}

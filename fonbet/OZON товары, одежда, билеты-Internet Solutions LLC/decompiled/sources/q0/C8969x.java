package q0;

import B0.C2510t;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import d2.C6054l;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import u0.C9896e;
import u0.EnumC9909s;

/* renamed from: q0.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8969x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C6041S f81372a = new C6041S(14, false, false);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8950e f81373b;

    static {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        j11 = C7807Z.f72251e;
        j12 = C7807Z.f72248b;
        j13 = C7807Z.f72248b;
        j14 = C7807Z.f72248b;
        long o11 = C7807Z.o(0.38f, j14);
        j15 = C7807Z.f72248b;
        f81373b = new C8950e(j11, j12, j13, o11, C7807Z.o(0.38f, j15));
    }

    public static final void a(@NotNull C8950e c8950e, androidx.compose.ui.e eVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        C3969l u11 = interfaceC3967k.u(-921259293);
        if ((((u11.n(c8950e) ? 4 : 2) | i11 | (u11.n(eVar) ? 32 : 16)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.foundation.e.b(S8.b.c(eVar, C8959n.g(), A0.h.b(C8959n.c()), 28), c8950e.a(), y0.a());
            androidx.compose.ui.e c11 = z.c(T.h(M.c(b11, EnumC9909s.Max), 0.0f, C8959n.h(), 1), z.b(u11), 14);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, c11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            c4912a.invoke(C9896e.f99653a, u11, 54);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C8962q(c8950e, eVar, c4912a, i11));
        }
    }

    @SuppressLint({"ComposableLambdaParameterPosition"})
    public static final void b(@NotNull String str, boolean z11, @NotNull C8950e c8950e, androidx.compose.ui.e eVar, @NotNull Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(791018367);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(c8950e) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        int i13 = i12;
        if ((74899 & i13) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            d.b e11 = C8959n.e();
            int i14 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(C8959n.d());
            boolean z12 = ((i13 & 112) == 32) | ((458752 & i13) == 131072);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C8963r(z11, function0);
                u11.x(C11);
            }
            androidx.compose.ui.e h11 = T.h(a0.p(a0.e(androidx.compose.foundation.i.c(eVar, z11, str, null, (Function0) C11, 4), 1.0f), C8959n.b(), C8959n.f(), C8959n.a(), C8959n.f()), C8959n.d(), 0.0f, 2);
            Y b11 = X.b(n11, e11, u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, h11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(554568909);
            u11.k();
            K1.T i15 = C8959n.i(z11 ? c8950e.c() : c8950e.b());
            e.a aVar = androidx.compose.ui.e.f40358c0;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            c3969l = u11;
            C2510t.b(str, new LayoutWeightElement(1.0f, true), i15, null, 0, false, 1, 0, null, c3969l, (i13 & 14) | 1572864, 440);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C8964s(str, z11, c8950e, eVar, function0, i11));
        }
    }

    public static final void c(@NotNull C8956k c8956k, @NotNull Function0 function0, androidx.compose.ui.e eVar, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0 function02;
        androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(712057293);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c8956k) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function02 = function0;
            i12 |= u11.F(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i12 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            boolean n11 = u11.n((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())) | u11.n(context);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C8950e c8950e = f81373b;
                long a11 = c8950e.a();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int i13 = C7811b0.i(a11);
                int color = obtainStyledAttributes.getColor(0, i13);
                obtainStyledAttributes.recycle();
                if (color != i13) {
                    a11 = C7811b0.b(color);
                }
                long j11 = a11;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long c11 = c8950e.c();
                int i14 = C7811b0.i(c11);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, i14)) : null;
                if (valueOf != null && valueOf.intValue() != i14) {
                    c11 = C7811b0.b(valueOf.intValue());
                }
                long j12 = c11;
                long b11 = c8950e.b();
                int i15 = C7811b0.i(b11);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, i15)) : null;
                if (valueOf2 != null && valueOf2.intValue() != i15) {
                    b11 = C7811b0.b(valueOf2.intValue());
                }
                long j13 = b11;
                C8950e c8950e2 = new C8950e(j11, j12, j12, j13, j13);
                u11.x(c8950e2);
                C11 = c8950e2;
            }
            d(c8956k, function02, eVar2, (C8950e) C11, function1, u11, (i12 & 1022) | ((i12 << 3) & 57344));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C8965t(c8956k, function0, eVar, function1, i11));
        }
    }

    public static final void d(@NotNull C8956k c8956k, @NotNull Function0 function0, androidx.compose.ui.e eVar, @NotNull C8950e c8950e, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0 function02;
        C8956k c8956k2;
        C3969l u11 = interfaceC3967k.u(1447189339);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c8956k) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(c8950e) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            function02 = function0;
            c8956k2 = c8956k;
        } else {
            function02 = function0;
            C6054l.a(c8956k, function02, f81372a, a1.c.c(795909757, new C8967v(c8950e, eVar, function1), u11), u11, (i12 & 14) | 3456 | (i12 & 112), 0);
            c8956k2 = c8956k;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C8968w(c8956k2, function02, eVar, c8950e, function1, i11));
        }
    }
}

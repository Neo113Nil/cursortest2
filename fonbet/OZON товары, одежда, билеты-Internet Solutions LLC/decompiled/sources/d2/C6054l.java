package d2;

import B1.V;
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
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6054l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.O f61055a = new S0.O(a.f61057b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f61056b = 0;

    /* renamed from: d2.l$a */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61057b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull InterfaceC6040Q interfaceC6040Q, Function0 function0, C6041S c6041s, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function0 function02;
        C6041S c6041s2;
        Function0 function03;
        Object C11;
        int i14;
        int i15;
        int i16;
        boolean F11;
        Object C12;
        boolean F12;
        Object C13;
        boolean F13;
        Object C14;
        boolean F14;
        Object C15;
        boolean F15;
        Object C16;
        boolean F16;
        Object C17;
        int I11;
        Function0 function04;
        J0 m02;
        InterfaceC6040Q interfaceC6040Q2 = interfaceC6040Q;
        C3969l u11 = interfaceC3967k.u(-830247068);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC6040Q2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function02 = function0;
            i13 |= u11.F(function02) ? 32 : 16;
            if ((i11 & 384) != 0) {
                c6041s2 = c6041s;
                i13 |= u11.n(c6041s2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                c6041s2 = c6041s;
            }
            if ((i11 & 3072) == 0) {
                i13 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                function03 = i17 == 0 ? null : function02;
                View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
                Z1.d dVar = (Z1.d) u11.m(K0.e());
                String str = (String) u11.m(f61055a);
                Z1.s sVar = (Z1.s) u11.m(K0.k());
                AbstractC3984t l11 = u11.l();
                InterfaceC3978p0 l12 = n1.l(c4912a, u11);
                UUID uuid = (UUID) C5503f.c(new Object[0], null, v.f61083b, u11, 3072, 6);
                C11 = u11.C();
                if (C11 != InterfaceC3967k.a.a()) {
                    i14 = i13;
                    i16 = 256;
                    i15 = 32;
                    C6034K c6034k = new C6034K(function03, c6041s2, view, dVar, interfaceC6040Q2, uuid);
                    interfaceC6040Q2 = interfaceC6040Q2;
                    c6034k.h(l11, new C4912a(true, 1302892335, new z(c6034k, l12)));
                    u11.x(c6034k);
                    C11 = c6034k;
                } else {
                    i14 = i13;
                    i15 = 32;
                    i16 = 256;
                }
                C6034K c6034k2 = (C6034K) C11;
                int i18 = i14 & 112;
                int i19 = i14 & 896;
                F11 = u11.F(c6034k2) | (i18 != i15) | (i19 != i16) | u11.n(str) | u11.n(sVar);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C6056n(c6034k2, function03, c6041s, str, sVar);
                    u11.x(C12);
                }
                S0.Q.c(c6034k2, (Function1) C12, u11);
                F12 = u11.F(c6034k2) | (i18 != i15) | (i19 != i16) | u11.n(str) | u11.n(sVar);
                C13 = u11.C();
                if (!F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C6057o(c6034k2, function03, c6041s, str, sVar);
                    u11.x(C13);
                }
                u11.g((Function0) C13);
                F13 = u11.F(c6034k2) | ((i14 & 14) == 4);
                C14 = u11.C();
                if (!F13 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new C6059q(c6034k2, interfaceC6040Q2);
                    u11.x(C14);
                }
                S0.Q.c(interfaceC6040Q2, (Function1) C14, u11);
                F14 = u11.F(c6034k2);
                C15 = u11.C();
                if (!F14 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new C6060r(c6034k2, null);
                    u11.x(C15);
                }
                S0.Q.e(u11, c6034k2, (Function2) C15);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                F15 = u11.F(c6034k2);
                C16 = u11.C();
                if (!F15 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new C6061s(c6034k2);
                    u11.x(C16);
                }
                androidx.compose.ui.e a11 = androidx.compose.ui.layout.c.a(aVar, (Function1) C16);
                F16 = u11.F(c6034k2) | u11.n(sVar);
                C17 = u11.C();
                if (!F16 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new C6062t(c6034k2, sVar);
                    u11.x(C17);
                }
                V v11 = (V) C17;
                I11 = u11.I();
                A0 d11 = u11.d();
                androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, a11);
                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f11 = T7.E.f(u11, v11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                u11.f();
                function04 = function03;
            } else {
                u11.j();
                function04 = function02;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new C6063u(interfaceC6040Q2, function04, c6041s, c4912a, i11, i12));
                return;
            }
            return;
        }
        function02 = function0;
        if ((i11 & 384) != 0) {
        }
        if ((i11 & 3072) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i17 == 0) {
        }
        View view2 = (View) u11.m(AndroidCompositionLocals_androidKt.h());
        Z1.d dVar2 = (Z1.d) u11.m(K0.e());
        String str2 = (String) u11.m(f61055a);
        Z1.s sVar2 = (Z1.s) u11.m(K0.k());
        AbstractC3984t l112 = u11.l();
        InterfaceC3978p0 l122 = n1.l(c4912a, u11);
        UUID uuid2 = (UUID) C5503f.c(new Object[0], null, v.f61083b, u11, 3072, 6);
        C11 = u11.C();
        if (C11 != InterfaceC3967k.a.a()) {
        }
        C6034K c6034k22 = (C6034K) C11;
        int i182 = i14 & 112;
        int i192 = i14 & 896;
        F11 = u11.F(c6034k22) | (i182 != i15) | (i192 != i16) | u11.n(str2) | u11.n(sVar2);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new C6056n(c6034k22, function03, c6041s, str2, sVar2);
        u11.x(C12);
        S0.Q.c(c6034k22, (Function1) C12, u11);
        F12 = u11.F(c6034k22) | (i182 != i15) | (i192 != i16) | u11.n(str2) | u11.n(sVar2);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new C6057o(c6034k22, function03, c6041s, str2, sVar2);
        u11.x(C13);
        u11.g((Function0) C13);
        F13 = u11.F(c6034k22) | ((i14 & 14) == 4);
        C14 = u11.C();
        if (!F13) {
        }
        C14 = new C6059q(c6034k22, interfaceC6040Q2);
        u11.x(C14);
        S0.Q.c(interfaceC6040Q2, (Function1) C14, u11);
        F14 = u11.F(c6034k22);
        C15 = u11.C();
        if (!F14) {
        }
        C15 = new C6060r(c6034k22, null);
        u11.x(C15);
        S0.Q.e(u11, c6034k22, (Function2) C15);
        e.a aVar2 = androidx.compose.ui.e.f40358c0;
        F15 = u11.F(c6034k22);
        C16 = u11.C();
        if (!F15) {
        }
        C16 = new C6061s(c6034k22);
        u11.x(C16);
        androidx.compose.ui.e a112 = androidx.compose.ui.layout.c.a(aVar2, (Function1) C16);
        F16 = u11.F(c6034k22) | u11.n(sVar2);
        C17 = u11.C();
        if (!F16) {
        }
        C17 = new C6062t(c6034k22, sVar2);
        u11.x(C17);
        V v112 = (V) C17;
        I11 = u11.I();
        A0 d112 = u11.d();
        androidx.compose.ui.e f72 = androidx.compose.ui.c.f(u11, a112);
        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f112 = T7.E.f(u11, v112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        u11.f();
        function04 = function03;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final int b(C6041S c6041s, boolean z11) {
        return (c6041s.e() && z11) ? c6041s.d() | 8192 : (!c6041s.e() || z11) ? c6041s.d() : c6041s.d() & (-8193);
    }

    public static final boolean c(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}

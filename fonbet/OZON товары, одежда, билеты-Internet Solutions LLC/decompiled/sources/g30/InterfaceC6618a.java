package g30;

import Kk.C3532b;
import android.content.Intent;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h30.InterfaceC6794b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o30.EnumC8636a;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* renamed from: g30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6618a {

    /* renamed from: g30.a$a, reason: collision with other inner class name */
    public static final class C1033a {
        public static /* synthetic */ void b(InterfaceC6618a interfaceC6618a, boolean z11, String str, String str2, int i11) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            interfaceC6618a.t(str, str2, z11);
        }

        public static /* synthetic */ void c(InterfaceC6618a interfaceC6618a, boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, int i11) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 32) != 0) {
                num = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            interfaceC6618a.t1(z11, z12, str, str2, str3, num, str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0);
        }

        public static /* synthetic */ void d(InterfaceC6618a interfaceC6618a, boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, int i11) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            interfaceC6618a.q0(z11, z12, str, str2, str3, num, str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0);
        }

        public static /* synthetic */ void e(InterfaceC6618a interfaceC6618a, boolean z11, boolean z12, String str, String str2, String str3, String str4, int i11) {
            boolean z13;
            String str5;
            String str6;
            boolean z14;
            String str7;
            String str8;
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 32) != 0) {
                z13 = z11;
                str5 = str;
                str6 = str3;
                z14 = z12;
                str7 = str2;
                str8 = null;
            } else {
                z13 = z11;
                str5 = str;
                str6 = str3;
                z14 = z12;
                str7 = str2;
                str8 = str4;
            }
            interfaceC6618a.C0(str5, str7, str6, str8, z13, z14);
        }

        public static /* synthetic */ void g(InterfaceC6618a interfaceC6618a, String str, String str2, String str3, int i11) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            boolean z11 = (i11 & 4) != 0;
            if ((i11 & 16) != 0) {
                str3 = null;
            }
            interfaceC6618a.B(str, str2, str3, z11);
        }

        public static /* synthetic */ void i(InterfaceC6618a interfaceC6618a, String str, boolean z11, String str2, String str3, int i11) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            interfaceC6618a.E(str, str2, str3, z11);
        }
    }

    /* renamed from: g30.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f63725a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f63726b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63727c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63728d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63729e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63730f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63731g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63732h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final EnumC1034a f63733i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: g30.a$b$a, reason: collision with other inner class name */
        public static final class EnumC1034a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC1034a[] $VALUES;
            public static final EnumC1034a ALLOWED;
            public static final EnumC1034a DENIED;
            public static final EnumC1034a UNKNOWN;

            static {
                EnumC1034a enumC1034a = new EnumC1034a("ALLOWED", 0);
                ALLOWED = enumC1034a;
                EnumC1034a enumC1034a2 = new EnumC1034a("DENIED", 1);
                DENIED = enumC1034a2;
                EnumC1034a enumC1034a3 = new EnumC1034a(FraudMonInfo.UNKNOWN, 2);
                UNKNOWN = enumC1034a3;
                EnumC1034a[] enumC1034aArr = {enumC1034a, enumC1034a2, enumC1034a3};
                $VALUES = enumC1034aArr;
                $ENTRIES = Xc.b.a(enumC1034aArr);
            }

            private EnumC1034a() {
                throw null;
            }

            public static EnumC1034a valueOf(String str) {
                return (EnumC1034a) Enum.valueOf(EnumC1034a.class, str);
            }

            public static EnumC1034a[] values() {
                return (EnumC1034a[]) $VALUES.clone();
            }
        }

        public b(boolean z11, boolean z12, EnumC1034a cameraPermission, EnumC1034a pushPermission, EnumC1034a callsPermission, EnumC1034a geoPermission, EnumC1034a contactPermission, EnumC1034a bioPermission) {
            EnumC1034a motionPermission = EnumC1034a.ALLOWED;
            Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
            Intrinsics.checkNotNullParameter(pushPermission, "pushPermission");
            Intrinsics.checkNotNullParameter(callsPermission, "callsPermission");
            Intrinsics.checkNotNullParameter(geoPermission, "geoPermission");
            Intrinsics.checkNotNullParameter(contactPermission, "contactPermission");
            Intrinsics.checkNotNullParameter(bioPermission, "bioPermission");
            Intrinsics.checkNotNullParameter(motionPermission, "motionPermission");
            this.f63725a = z11;
            this.f63726b = z12;
            this.f63727c = cameraPermission;
            this.f63728d = pushPermission;
            this.f63729e = callsPermission;
            this.f63730f = geoPermission;
            this.f63731g = contactPermission;
            this.f63732h = bioPermission;
            this.f63733i = motionPermission;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f63725a == bVar.f63725a && this.f63726b == bVar.f63726b && this.f63727c == bVar.f63727c && this.f63728d == bVar.f63728d && this.f63729e == bVar.f63729e && this.f63730f == bVar.f63730f && this.f63731g == bVar.f63731g && this.f63732h == bVar.f63732h && this.f63733i == bVar.f63733i;
        }

        public final int hashCode() {
            return this.f63733i.hashCode() + ((this.f63732h.hashCode() + ((this.f63731g.hashCode() + ((this.f63730f.hashCode() + ((this.f63729e.hashCode() + ((this.f63728d.hashCode() + ((this.f63727c.hashCode() + C3532b.a(Boolean.hashCode(this.f63725a) * 31, 31, this.f63726b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "SessionAnalyticData(isUserCanBeUltra=" + this.f63725a + ", isUltra=" + this.f63726b + ", cameraPermission=" + this.f63727c + ", pushPermission=" + this.f63728d + ", callsPermission=" + this.f63729e + ", geoPermission=" + this.f63730f + ", contactPermission=" + this.f63731g + ", bioPermission=" + this.f63732h + ", motionPermission=" + this.f63733i + ")";
        }
    }

    void A(String str, String str2);

    void A0(String str, boolean z11);

    void A1(int i11, @NotNull String str);

    void B(String str, String str2, String str3, boolean z11);

    void B0(@NotNull b bVar);

    void B1(int i11, boolean z11);

    void C();

    void C0(String str, String str2, String str3, String str4, boolean z11, boolean z12);

    void C1(String str, @NotNull LinkedHashMap linkedHashMap);

    void D(@NotNull String str, String str2, boolean z11);

    void D0(String str, String str2, String str3);

    void D1();

    void E(@NotNull String str, String str2, String str3, boolean z11);

    void E0(String str, @NotNull ArrayList arrayList);

    void E1(String str, String str2, String str3);

    void F(int i11, @NotNull String str);

    void F0(@NotNull String str);

    void F1(Exception exc);

    void G(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11);

    void G0(@NotNull String str);

    void G1(boolean z11);

    void H(@NotNull String str, boolean z11);

    void H0(String str);

    void H1();

    void I(String str, String str2, String str3);

    void I0();

    void I1();

    void J(String str, String str2, boolean z11);

    void J0(String str, String str2, String str3, boolean z11, boolean z12);

    void J1(String str, String str2);

    void K(@NotNull String str, boolean z11, @NotNull List<String> list, String str2, Long l11);

    void K0(int i11, String str);

    void K1(@NotNull String str, String str2);

    void L();

    void L0(String str, String str2);

    void L1(Boolean bool, Integer num);

    void M(@NotNull String str, String str2);

    void M0(boolean z11, String str, String str2, String str3, String str4, Double d11, Double d12);

    void M1(String str, Exception exc);

    void N(@NotNull String str, String str2, String str3, String str4);

    void N0(long j11, boolean z11);

    void N1(@NotNull String str, String str2, Integer num, String str3);

    void O(String str, String str2, Integer num, String str3);

    void O0(String str, String str2, String str3);

    void O1(Integer num);

    void P(@NotNull String str, @NotNull String str2);

    void P0(int i11, String str, boolean z11);

    void P1(String str);

    void Q();

    void Q0();

    void Q1(String str, @NotNull String str2, boolean z11, String str3, @NotNull Map map);

    void R(@NotNull String str, boolean z11);

    void R0(String str, String str2, String str3);

    void R1(boolean z11);

    void S(int i11, @NotNull String str, String str2, boolean z11);

    void S0(@NotNull String str, boolean z11, long j11, long j12, String str2, b bVar, @NotNull D80.a aVar);

    void S1(String str);

    void T();

    void T0(String str, String str2);

    void T1(@NotNull String str, String str2, boolean z11);

    void U(String str);

    void U0(int i11, boolean z11);

    void U1(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    void V(long j11, String str);

    void V0(int i11, String str, @NotNull String str2);

    void V1(String str, boolean z11);

    void W(@NotNull String str, Boolean bool, String str2, Integer num);

    void W0(int i11);

    void W1(String str, @NotNull Map map, boolean z11);

    void X(@NotNull EnumC8636a enumC8636a);

    void X0(String str, String str2, boolean z11, boolean z12, boolean z13);

    void X1(String str, String str2, boolean z11, String str3, String str4, String str5, String str6, String str7);

    void Y(String str);

    void Y0(String str, String str2, Integer num, @NotNull String str3, String str4);

    void Y1(long j11, @NotNull String str, int i11, @NotNull String str2, int i12, boolean z11, boolean z12, boolean z13, String str3, @NotNull String str4, String str5, String str6);

    void Z(boolean z11);

    void Z0(@NotNull LinkedHashMap linkedHashMap);

    void Z1(Exception exc, boolean z11);

    void a(@NotNull String str);

    void a0(@NotNull String str, String str2);

    void a1(long j11, @NotNull String str, String str2);

    void a2(@NotNull String str, boolean z11);

    String b();

    void b0(Integer num);

    void b1();

    void b2();

    void c(Float f7, String str, String str2);

    void c0(@NotNull String str, String str2, boolean z11);

    void c1(@NotNull String str, @NotNull String str2);

    void c2(int i11, String str, @NotNull String str2);

    void d(String str, String str2);

    void d0(String str, @NotNull String str2);

    void d1(@NotNull Intent intent);

    void d2();

    void e(Boolean bool);

    void e0(String str);

    void e1(boolean z11, boolean z12, boolean z13, String str, U30.d dVar, String str2);

    void f();

    void f0(String str, String str2, String str3, boolean z11);

    void f1(String str, boolean z11);

    void g(String str);

    void g0();

    void g1(@NotNull String str);

    void h(String str, String str2);

    void h0(long j11, @NotNull String str, String str2);

    void h1(int i11, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    void i(@NotNull String str, boolean z11);

    void i0(@NotNull String str, String str2, boolean z11);

    void i1(@NotNull LinkedHashMap linkedHashMap);

    void j(@NotNull String str, int i11, boolean z11, boolean z12, @NotNull String str2, int i12, Integer num, List<String> list, Integer num2);

    void j0(@NotNull String str);

    void j1(String str);

    void k(Integer num);

    void k0(String str, String str2);

    void k1(String str);

    void l(Integer num, @NotNull String str, String str2);

    void l0(@NotNull String str);

    void l1(int i11, String str, @NotNull String str2);

    void m(String str, String str2);

    void m0(String str);

    void m1();

    void n(@NotNull String str, String str2);

    void n0(@NotNull String str);

    void n1();

    void o(boolean z11);

    void o0(@NotNull String str, String str2, boolean z11);

    void o1(@NotNull String str, String str2, @NotNull Map map, boolean z11);

    void p();

    void p0(String str, String str2);

    void p1(String str, @NotNull String str2);

    void q(long j11, String str, String str2);

    void q0(boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, boolean z13);

    void q1();

    void r();

    void r0(String str);

    void r1(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16);

    void s();

    void s0(String str);

    void s1();

    void t(String str, String str2, boolean z11);

    void t0(String str);

    void t1(boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, boolean z13);

    void u(@NotNull String str);

    void u0(String str, String str2, Boolean bool, boolean z11);

    void u1(String str, String str2, Integer num, String str3);

    void v(@NotNull String str, @NotNull String str2, boolean z11);

    void v0(boolean z11);

    void v1(@NotNull String str);

    void w(@NotNull InterfaceC6794b interfaceC6794b);

    void w0(String str, String str2, Integer num, String str3, @NotNull String str4);

    void w1(String str);

    void x(String str);

    void x0(boolean z11, String str, Long l11);

    void x1(int i11, String str, @NotNull String str2);

    void y(@NotNull String str, String str2, String str3, boolean z11, String str4, String str5, Integer num, Integer num2, Integer num3, Long l11);

    void y0(String str, boolean z11);

    void y1(int i11);

    void z();

    void z0(String str, String str2, @NotNull String str3);

    void z1(String str, boolean z11, boolean z12);
}

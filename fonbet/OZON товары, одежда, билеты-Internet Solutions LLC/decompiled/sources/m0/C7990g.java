package m0;

import S0.A1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import k1.C7465k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7990g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C8011q0<Float> f73753a = C8004n.c(0.0f, null, 7);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8011q0<Z1.h> f73754b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f73755c = 0;

    static {
        int i11 = l1.f73821b;
        f73754b = C8004n.c(0.0f, Z1.h.a(0.1f), 3);
        C7465k.a(0.5f, 0.5f);
        P9.a.a(0.5f, 0.5f);
    }

    @NotNull
    public static final A1 a(float f7, H h11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 2) != 0) {
            h11 = f73754b;
        }
        return c(Z1.h.a(f7), W0.e(), h11, null, (i12 & 4) != 0 ? "DpAnimation" : "borderWidth", interfaceC3967k, ((i11 << 3) & 896) | ((i11 << 6) & 57344), 8);
    }

    @NotNull
    public static final A1 b(float f7, InterfaceC8002m interfaceC8002m, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13 = i12 & 2;
        C8011q0<Float> c8011q0 = f73753a;
        if (i13 != 0) {
            interfaceC8002m = c8011q0;
        }
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (interfaceC8002m == c8011q0) {
            interfaceC3967k.o(1125598679);
            boolean z11 = (((i11 & 896) ^ 384) > 256 && interfaceC3967k.q(0.01f)) || (i11 & 384) == 256;
            Object C11 = interfaceC3967k.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = C8004n.c(0.0f, Float.valueOf(0.01f), 3);
                interfaceC3967k.x(C11);
            }
            interfaceC8002m = (C8011q0) C11;
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1125708605);
            interfaceC3967k.k();
        }
        InterfaceC8002m interfaceC8002m2 = interfaceC8002m;
        int i14 = i11 << 3;
        return c(Float.valueOf(f7), W0.b(), interfaceC8002m2, Float.valueOf(0.01f), str2, interfaceC3967k, (i11 & 14) | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 0);
    }

    @NotNull
    public static final A1 c(Object obj, @NotNull U0 u02, InterfaceC8002m interfaceC8002m, Float f7, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 8) != 0) {
            f7 = null;
        }
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(null, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new C7980b(obj, u02, f7);
            interfaceC3967k.x(C12);
        }
        C7980b c7980b = (C7980b) C12;
        InterfaceC3978p0 l11 = n1.l(null, interfaceC3967k);
        if (f7 != null && (interfaceC8002m instanceof C8011q0)) {
            C8011q0 c8011q0 = (C8011q0) interfaceC8002m;
            if (!Intrinsics.d(c8011q0.h(), f7)) {
                interfaceC8002m = new C8011q0(c8011q0.f(), c8011q0.g(), f7);
            }
        }
        InterfaceC3978p0 l12 = n1.l(interfaceC8002m, interfaceC3967k);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = ze.k.a(-1, 6, null);
            interfaceC3967k.x(C13);
        }
        ze.h hVar = (ze.h) C13;
        boolean F11 = interfaceC3967k.F(hVar) | ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.F(obj)) || (i11 & 6) == 4);
        Object C14 = interfaceC3967k.C();
        if (F11 || C14 == InterfaceC3967k.a.a()) {
            C14 = new C7986e(hVar, obj);
            interfaceC3967k.x(C14);
        }
        int i13 = S0.Q.f25307b;
        interfaceC3967k.g((Function0) C14);
        boolean F12 = interfaceC3967k.F(hVar) | interfaceC3967k.F(c7980b) | interfaceC3967k.n(l12) | interfaceC3967k.n(l11);
        Object C15 = interfaceC3967k.C();
        if (F12 || C15 == InterfaceC3967k.a.a()) {
            Object c7988f = new C7988f(hVar, c7980b, l12, l11, null);
            interfaceC3967k.x(c7988f);
            C15 = c7988f;
        }
        S0.Q.e(interfaceC3967k, hVar, (Function2) C15);
        A1 a12 = (A1) interfaceC3978p0.getValue();
        return a12 == null ? c7980b.g() : a12;
    }
}

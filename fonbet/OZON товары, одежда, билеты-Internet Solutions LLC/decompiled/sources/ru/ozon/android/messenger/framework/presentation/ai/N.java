package ru.ozon.android.messenger.framework.presentation.ai;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import a1.C4912a;
import android.view.View;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import u0.C9915y;
import v0.C10164d;

/* loaded from: classes10.dex */
public final class N {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01a1 A[LOOP:1: B:173:0x016e->B:185:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, @NotNull List items, boolean z11, @NotNull v0.I scrollState, @NotNull d.a.C1558a bubbleSettings, @NotNull C9915y paddingValues, @NotNull Function0 scrollBoundaryBottomPxProvider, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.presentation.common.view.recycler.u uVar, ru.ozon.android.messenger.framework.logger.b bVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a b11;
        C5179b.l g10;
        int i13;
        int i14;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(bubbleSettings, "bubbleSettings");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(scrollBoundaryBottomPxProvider, "scrollBoundaryBottomPxProvider");
        C3969l u11 = interfaceC3967k.u(-499042525);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(items) : u11.F(items) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(scrollState) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(bubbleSettings) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(paddingValues) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(scrollBoundaryBottomPxProvider) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(dVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= (134217728 & i11) == 0 ? u11.n(uVar) : u11.F(uVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= (i11 & 1073741824) == 0 ? u11.n(bVar) : u11.F(bVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-895922396);
            if (uVar != null) {
                ru.ozon.android.messenger.framework.presentation.common.view.recycler.z.a(scrollState, uVar, 50, u11, ((i12 >> 9) & 14) | 384);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            List list = items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z12 = true;
                        z13 = false;
                        break;
                    }
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = ((ru.ozon.android.messenger.framework.presentation.models.q) it.next()).b();
                    if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                        Iterator<T> it2 = b12.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z12 = true;
                                z14 = false;
                                break;
                            }
                            ru.ozon.android.messenger.framework.presentation.models.g c11 = ((ru.ozon.android.messenger.framework.presentation.models.u) it2.next()).c();
                            ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c cVar = c11 instanceof ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c ? (ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c) c11 : null;
                            if (cVar == null || (b11 = cVar.b()) == null) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (b11.e()) {
                                    z15 = true;
                                    if (!z15) {
                                        z14 = z12;
                                        break;
                                    }
                                }
                            }
                            z15 = false;
                            if (!z15) {
                            }
                        }
                    } else {
                        z14 = false;
                        z12 = true;
                    }
                    if (z14) {
                        z13 = z12;
                        break;
                    }
                }
            } else {
                z13 = false;
                z12 = true;
            }
            boolean z16 = (z11 || !z13) ? false : z12;
            u11.o(-895904110);
            if (z16) {
                u11.o(769764000);
                u11.o(1987199302);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = S0.f89345a;
                    u11.x(C11);
                }
                g10 = (S0) C11;
                u11.k();
                u11.k();
            } else {
                g10 = C5179b.g();
            }
            C5179b.l lVar = g10;
            Object b13 = Pk0.h.b(u11, -895899566);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = n1.f(null, D1.f25195a);
                u11.x(b13);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) b13;
            Object b14 = Pk0.h.b(u11, -895897163);
            if (b14 == InterfaceC3967k.a.a()) {
                b14 = new c1.w();
                u11.x(b14);
            }
            c1.w wVar = (c1.w) b14;
            u11.k();
            u11.o(-895889325);
            int i15 = i12 & 112;
            boolean F11 = ((i12 & 896) == 256) | (i15 == 32 || ((i12 & 64) != 0 && u11.F(items))) | ((57344 & i12) == 16384) | u11.F(dVar) | ((1879048192 & i12) == 536870912 || ((i12 & 1073741824) != 0 && u11.F(bVar))) | ((i12 & 7168) == 2048) | ((3670016 & i12) == 1048576);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                i13 = i12;
                i14 = i15;
                C9452z c9452z = new C9452z(items, z11, bubbleSettings, dVar, bVar, scrollState, wVar, scrollBoundaryBottomPxProvider, interfaceC3978p0);
                u11.x(c9452z);
                C12 = c9452z;
            } else {
                i13 = i12;
                i14 = i15;
            }
            u11.k();
            C10164d.a(eVar, scrollState, paddingValues, lVar, null, null, false, (Function1) C12, u11, (i13 & 14) | ((i13 >> 6) & 112) | ((i13 >> 9) & 896), 232);
            c3969l = u11;
            ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o oVar = (ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o) interfaceC3978p0.getValue();
            if (oVar != null) {
                c3969l.o(-895849863);
                Object C13 = c3969l.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new A(interfaceC3978p0);
                    c3969l.x(C13);
                }
                c3969l.k();
                ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.p.a(oVar, items, dVar, bubbleSettings, wVar, bVar, (Function0) C13, c3969l, i14 | 1597440 | ((i13 >> 15) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 12) & 458752));
            }
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new B(eVar, items, z11, scrollState, bubbleSettings, paddingValues, scrollBoundaryBottomPxProvider, dVar, uVar, bVar, i11));
        }
    }

    public static final void b(e.a aVar, @NotNull ru.ozon.android.messenger.framework.presentation.models.e blockItem, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, InterfaceC3967k interfaceC3967k, int i11) {
        ru.ozon.android.messenger.blocks.chat.common.h<?, ru.ozon.android.messenger.framework.presentation.models.g> f7;
        Function2<InterfaceC3967k, Integer, Unit> b11;
        Intrinsics.checkNotNullParameter(blockItem, "blockItem");
        C3969l u11 = interfaceC3967k.u(-988094251);
        int i12 = i11 | 6 | (u11.n(blockItem) ? 32 : 16) | (u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(bVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            int d11 = blockItem.d();
            ru.ozon.android.messenger.framework.data.b a11 = dVar.a();
            u11.o(432413792);
            Function2<InterfaceC3967k, Integer, Unit> function2 = null;
            if (a11 == null) {
                f7 = null;
            } else {
                u11.o(432415032);
                boolean r11 = ((i12 & 7168) == 2048) | u11.r(d11) | u11.F(dVar);
                Object C11 = u11.C();
                if (r11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new D(bVar, d11, dVar);
                    u11.x(C11);
                }
                u11.k();
                f7 = ru.ozon.android.messenger.framework.data.d.f(a11, d11, (Function0) C11);
            }
            u11.k();
            if (f7 != null && (b11 = f7.b(aVar, blockItem.b(), blockItem.c(), dVar)) != null) {
                function2 = b11;
            } else if (f7 != null) {
                function2 = f7.a(aVar, blockItem.b(), dVar);
            }
            if (function2 != null) {
                u11.o(520502359);
                function2.invoke(u11, 0);
                u11.k();
            } else {
                u11.o(520554966);
                ru.ozon.android.messenger.framework.presentation.search.composable.E.a(androidx.compose.foundation.layout.a0.e(aVar, 1.0f), dVar, blockItem, u11, ((i12 << 3) & 896) | ((i12 >> 3) & 112) | 6);
                u11.k();
            }
        }
        e.a aVar2 = aVar;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C(aVar2, blockItem, dVar, bVar, i11));
        }
    }

    public static final void c(androidx.compose.ui.e eVar, ru.ozon.android.messenger.framework.presentation.models.q qVar, d.a.C1558a c1558a, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, v0.I i11, c1.w wVar, Function1 function1, Function0 function0, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        d.a.C1558a c1558a2;
        boolean z11;
        Function0 function02;
        ArrayList arrayList;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(1334606960);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= (i12 & 64) == 0 ? u11.n(qVar) : u11.F(qVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            c1558a2 = c1558a;
            i13 |= u11.n(c1558a2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            c1558a2 = c1558a;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.F(dVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i13 |= (32768 & i12) == 0 ? u11.n(bVar) : u11.F(bVar) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= u11.n(i11) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= u11.n(wVar) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= u11.F(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= u11.F(function0) ? 67108864 : 33554432;
        }
        if ((38347923 & i13) == 38347922 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar.c();
            ru.ozon.android.messenger.framework.presentation.models.s sVar = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c11 : null;
            boolean z13 = sVar != null && sVar.p();
            ArrayList b11 = ru.ozon.android.messenger.framework.presentation.models.f.b(qVar);
            List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = qVar.b();
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator<T> it = b12.iterator();
                while (it.hasNext()) {
                    if (((ru.ozon.android.messenger.framework.presentation.models.u) it.next()).c() instanceof ru.ozon.android.messenger.blocks.messagetext.f) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            boolean z14 = z13 && z11;
            boolean z15 = !z13 && z11;
            int i14 = i13;
            AbstractC7799Q a11 = ru.ozon.android.messenger.utils.compose.a.a(c1558a2.b(), u11, 0);
            Object C11 = u11.C();
            boolean z16 = z15;
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a12 = ((S0.D) C11).a();
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(eVar, 1.0f);
            boolean z17 = z14;
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, e11);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            e.a aVar = androidx.compose.ui.e.f40358c0;
            String id2 = qVar.c().getId();
            u11.o(985108638);
            boolean F11 = u11.F(view);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new G(view);
                u11.x(C12);
            }
            Function0 function03 = (Function0) C12;
            u11.k();
            u11.o(985112793);
            boolean z18 = (i14 & 112) == 32 || ((i14 & 64) != 0 && u11.F(qVar));
            Object C13 = u11.C();
            if (z18 || C13 == InterfaceC3967k.a.a()) {
                C13 = new H(qVar);
                u11.x(C13);
            }
            Function0 function04 = (Function0) C13;
            u11.k();
            androidx.compose.ui.e a14 = c5187j.a(aVar, z13 ? InterfaceC6250b.a.f() : InterfaceC6250b.a.h());
            if (z13) {
                function02 = function04;
                a14 = a14.l0(androidx.compose.foundation.e.a(androidx.compose.foundation.layout.T.e(aVar, c1558a.d()), a11, c1558a.c().a(), 4));
            } else {
                function02 = function04;
            }
            if (z17) {
                androidx.compose.ui.e a15 = androidx.compose.ui.layout.c.a(aVar, new K(wVar, id2));
                arrayList = b11;
                z12 = false;
                a14 = a14.l0(x1.L.b(a15, id2, new M(function03, a12, i11, id2, function0, function1, function02, z13, null)));
            } else {
                arrayList = b11;
                z12 = false;
            }
            C4912a c12 = a1.c.c(-1229436126, new I(a14, arrayList, dVar, bVar), u11);
            if (z16) {
                u11.o(474310142);
                Unit unit = Unit.f71690a;
                u11.o(985133813);
                boolean F12 = u11.F(view);
                Object C14 = u11.C();
                if (F12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new E(view, null);
                    u11.x(C14);
                }
                u11.k();
                androidx.compose.ui.e b13 = x1.L.b(aVar, unit, (Function2) C14);
                B1.V f13 = C5185h.f(InterfaceC6250b.a.o(), z12);
                int I12 = u11.I();
                S0.A0 d12 = u11.d();
                androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, b13);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a16);
                } else {
                    u11.e();
                }
                Function2 f15 = T7.E.f(u11, f13, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, f15);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                I0.W.a(null, a1.c.c(-654573190, new F(c12), u11), u11, 48);
                u11.f();
                u11.k();
            } else {
                u11.o(474817054);
                c12.invoke(u11, 6);
                u11.k();
            }
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new J(eVar, qVar, c1558a, dVar, bVar, i11, wVar, function1, function0, i12));
        }
    }
}

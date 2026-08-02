package ru.ozon.debugMenu.internal.core.ui.widgets.toggle;

import A0.h;
import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import Nk.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l0.h0;
import l1.C7807Z;
import m0.C7990g;
import m0.C8004n;
import m0.F;
import m0.T0;
import m3.C8060b;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import t0.p;
import t0.q;
import u0.InterfaceC9893b;
import y20.C10833a;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a_\u0010\u001b\u001a\u00020\b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"", "isToggled", "Landroidx/compose/ui/e;", "modifier", "isEnabled", "Lt0/q;", "interactionSource", "Lkotlin/Function1;", "", "onCheckedChange", "DebugMenuToggle", "(ZLandroidx/compose/ui/e;ZLt0/q;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lu0/b;", "Le1/b;", "alignment", "isIconVisible", "Lq1/b;", "icon", "Ll1/Z;", "knobBackgroundColor", "iconColor", "LZ1/h;", "knobSize", "knobPadding", "iconModifier", "Knob-djLK_5M", "(Lu0/b;Le1/b;ZLq1/b;JJFFLandroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/k;II)V", "Knob", "backgroundColorState", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuToggleKt {
    public static final void DebugMenuToggle(boolean z11, e eVar, boolean z12, q qVar, Function1<? super Boolean, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        long b11;
        interfaceC3967k.o(-99685231);
        e eVar2 = (i12 & 2) != 0 ? e.f40358c0 : eVar;
        boolean z13 = (i12 & 4) != 0 ? true : z12;
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(-31397959);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            qVar2 = qVar;
        }
        Function1<? super Boolean, Unit> function12 = (i12 & 16) != 0 ? null : function1;
        if (!z11 && z13) {
            interfaceC3967k.o(-31390357);
            b11 = C10833a.a(interfaceC3967k).e();
            interfaceC3967k.k();
        } else if (z11 || z13) {
            interfaceC3967k.o(-31385471);
            b11 = C10833a.a(interfaceC3967k).b();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-31387544);
            b11 = C10833a.a(interfaceC3967k).d();
            interfaceC3967k.k();
        }
        A1 a11 = h0.a(b11, C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.d(), 2), "BackgroundColorAnimation", interfaceC3967k, 384, 8);
        e a12 = b.a(eVar2, DebugMenuToggleTestTags.Container);
        float f7 = 2;
        e b12 = androidx.compose.foundation.e.b(a0.k(T.h(a12, 0.0f, f7, 1), 44, 28), DebugMenuToggle$lambda$1(a11), h.e());
        interfaceC3967k.o(-31366568);
        boolean z14 = ((((57344 & i11) ^ 24576) > 16384 && interfaceC3967k.n(function12)) || (i11 & 24576) == 16384) | ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.p(z11)) || (i11 & 6) == 4);
        Object C12 = interfaceC3967k.C();
        if (z14 || C12 == InterfaceC3967k.a.a()) {
            C12 = new DebugMenuToggleKt$DebugMenuToggle$2$1(function12, z11);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        e b13 = i.b(b12, qVar2, null, z13, null, null, (Function0) C12, 24);
        V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, b13);
        InterfaceC2801g.f5440U.getClass();
        Function0 a13 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a13);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        C5187j c5187j = C5187j.f39515a;
        d f13 = z11 ? InterfaceC6250b.a.f() : InterfaceC6250b.a.h();
        interfaceC3967k.o(-1736530542);
        AbstractC8972b a14 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_lock_closed_filled, interfaceC3967k, 0);
        interfaceC3967k.k();
        m1644KnobdjLK_5M(c5187j, f13, !z13, a14, C10833a.a(interfaceC3967k).j(), C10833a.a(interfaceC3967k).k(), 24, f7, null, null, interfaceC3967k, 14155782, 384);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    private static final long DebugMenuToggle$lambda$1(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0083  */
    /* renamed from: Knob-djLK_5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1644KnobdjLK_5M(InterfaceC9893b interfaceC9893b, InterfaceC6250b targetAlignment, boolean z11, AbstractC8972b abstractC8972b, long j11, long j12, float f7, float f11, e eVar, e eVar2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int I11;
        C3969l c3969l;
        e eVar3;
        e eVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(705304921);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(targetAlignment) ? 32 : 16;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 4) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(abstractC8972b) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 8) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.s(j11) ? 16384 : 8192;
            }
            if ((i12 & 16) == 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i13 |= u11.s(j12) ? 131072 : 65536;
            }
            if ((i12 & 32) == 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i13 |= u11.q(f7) ? 1048576 : 524288;
            }
            if ((i12 & 64) == 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i13 |= u11.q(f11) ? 8388608 : 4194304;
            }
            i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i14 == 0) {
                i13 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i13 |= u11.n(eVar) ? 67108864 : 33554432;
            }
            int i18 = i13;
            i15 = i12 & 256;
            if (i15 == 0) {
                i16 = i15;
                i17 = i18 | 805306368;
            } else {
                if ((i11 & 805306368) == 0) {
                    i16 = i15;
                    i18 |= u11.n(eVar2) ? 536870912 : 268435456;
                } else {
                    i16 = i15;
                }
                i17 = i18;
            }
            if ((i17 & 306783379) == 306783378 || !u11.b()) {
                e eVar5 = i14 == 0 ? e.f40358c0 : eVar;
                e eVar6 = i16 == 0 ? e.f40358c0 : eVar2;
                T0 animationSpec = C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.d(), 2);
                Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
                Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
                u11.o(-200610522);
                d dVar = (d) targetAlignment;
                d dVar2 = new d(((Number) C7990g.b(dVar.b(), animationSpec, "KnobAlignmentAnimation", u11, 3072, 20).getValue()).floatValue(), ((Number) C7990g.b(dVar.c(), animationSpec, "KnobAlignmentAnimation", u11, 3072, 20).getValue()).floatValue());
                u11.k();
                e a11 = interfaceC9893b.a(androidx.compose.foundation.e.b(a0.j(T.f(b.a(eVar5, DebugMenuToggleTestTags.Knob), f11), f7), j11, h.e()), dVar2);
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f13 = c.f(u11, a11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f14 = E.f(u11, f12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f14);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                G.c(z11, C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.e()), A20.a.b(), A20.a.a(), null, a1.c.c(-884317381, new DebugMenuToggleKt$Knob$1$1(eVar6, abstractC8972b, j12), u11), u11, ((i17 >> 6) & 14) | 196608, 16);
                c3969l = u11;
                c3969l.f();
                eVar3 = eVar6;
                eVar4 = eVar5;
            } else {
                u11.j();
                eVar4 = eVar;
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new DebugMenuToggleKt$Knob$2(interfaceC9893b, targetAlignment, z11, abstractC8972b, j11, j12, f7, f11, eVar4, eVar3, i11, i12));
                return;
            }
            return;
        }
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 == 0) {
        }
        int i182 = i13;
        i15 = i12 & 256;
        if (i15 == 0) {
        }
        if ((i17 & 306783379) == 306783378) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        T0 animationSpec2 = C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.d(), 2);
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        Intrinsics.checkNotNullParameter(animationSpec2, "animationSpec");
        u11.o(-200610522);
        d dVar3 = (d) targetAlignment;
        d dVar22 = new d(((Number) C7990g.b(dVar3.b(), animationSpec2, "KnobAlignmentAnimation", u11, 3072, 20).getValue()).floatValue(), ((Number) C7990g.b(dVar3.c(), animationSpec2, "KnobAlignmentAnimation", u11, 3072, 20).getValue()).floatValue());
        u11.k();
        e a112 = interfaceC9893b.a(androidx.compose.foundation.e.b(a0.j(T.f(b.a(eVar5, DebugMenuToggleTestTags.Knob), f11), f7), j11, h.e()), dVar22);
        V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f132 = c.f(u11, a112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f142 = E.f(u11, f122, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f142);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        G.c(z11, C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.e()), A20.a.b(), A20.a.a(), null, a1.c.c(-884317381, new DebugMenuToggleKt$Knob$1$1(eVar6, abstractC8972b, j12), u11), u11, ((i17 >> 6) & 14) | 196608, 16);
        c3969l = u11;
        c3969l.f();
        eVar3 = eVar6;
        eVar4 = eVar5;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}

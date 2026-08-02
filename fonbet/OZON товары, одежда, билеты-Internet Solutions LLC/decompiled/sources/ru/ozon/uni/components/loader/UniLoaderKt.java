package ru.ozon.uni.components.loader;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import P0.Z0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "Lru/ozon/uni/components/loader/UniLoaderSize;", "size", "", "UniLoader-3IgeMak", "(Landroidx/compose/ui/e;JLru/ozon/uni/components/loader/UniLoaderSize;LS0/k;II)V", "UniLoader", "LZ1/h;", "outerSize", "innerSize", "strokeWidth", "BasicLoader-FandsMM", "(Landroidx/compose/ui/e;JFFFLS0/k;I)V", "BasicLoader", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniLoaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BasicLoader-FandsMM, reason: not valid java name */
    public static final void m1923BasicLoaderFandsMM(e eVar, long j11, float f7, float f11, float f12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1532097038);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.q(f12) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            e n11 = a0.n(eVar, f7);
            V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, n11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            Z0.a(a0.n(e.f40358c0, f11), j11, f12, 0L, 1, u11, (i12 & 112) | ((i12 >> 6) & 896), 8);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniLoaderKt$BasicLoader$2(eVar, j11, f7, f11, f12, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* renamed from: UniLoader-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1924UniLoader3IgeMak(e eVar, long j11, UniLoaderSize uniLoaderSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        UniLoaderSize uniLoaderSize2;
        UniLoaderSize uniLoaderSize3;
        e eVar2;
        long j13;
        UniLoaderSize uniLoaderSize4;
        e eVar3;
        J0 m02;
        int i14;
        C3969l u11 = interfaceC3967k.u(1307790894);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                j12 = j11;
                if (u11.s(j12)) {
                    i14 = 32;
                    i13 |= i14;
                }
            } else {
                j12 = j11;
            }
            i14 = 16;
            i13 |= i14;
        } else {
            j12 = j11;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            uniLoaderSize2 = uniLoaderSize;
            i13 |= u11.n(uniLoaderSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if (i15 != 0) {
                        eVar = e.f40358c0;
                    }
                    if ((i12 & 2) != 0) {
                        j12 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary();
                        i13 &= -113;
                    }
                    if (i16 != 0) {
                        uniLoaderSize3 = UniLoaderSize.Size300;
                        eVar2 = eVar;
                        j13 = j12;
                        u11.j0();
                        P9.a.b(eVar2, "loader");
                        m1923BasicLoaderFandsMM(eVar2, j13, uniLoaderSize3.getOuterSize(), uniLoaderSize3.getInnerSize(), uniLoaderSize3.getStrokeWidth(), u11, i13 & 112);
                        uniLoaderSize4 = uniLoaderSize3;
                        eVar3 = eVar2;
                        j12 = j13;
                    }
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                }
                j13 = j12;
                uniLoaderSize3 = uniLoaderSize2;
                eVar2 = eVar;
                u11.j0();
                P9.a.b(eVar2, "loader");
                m1923BasicLoaderFandsMM(eVar2, j13, uniLoaderSize3.getOuterSize(), uniLoaderSize3.getInnerSize(), uniLoaderSize3.getStrokeWidth(), u11, i13 & 112);
                uniLoaderSize4 = uniLoaderSize3;
                eVar3 = eVar2;
                j12 = j13;
            } else {
                u11.j();
                eVar3 = eVar;
                uniLoaderSize4 = uniLoaderSize2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new UniLoaderKt$UniLoader$1(eVar3, j12, uniLoaderSize4, i11, i12));
                return;
            }
            return;
        }
        uniLoaderSize2 = uniLoaderSize;
        if ((i13 & 147) == 146) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i16 != 0) {
        }
        j13 = j12;
        uniLoaderSize3 = uniLoaderSize2;
        eVar2 = eVar;
        u11.j0();
        P9.a.b(eVar2, "loader");
        m1923BasicLoaderFandsMM(eVar2, j13, uniLoaderSize3.getOuterSize(), uniLoaderSize3.getInnerSize(), uniLoaderSize3.getStrokeWidth(), u11, i13 & 112);
        uniLoaderSize4 = uniLoaderSize3;
        eVar3 = eVar2;
        j12 = j13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}

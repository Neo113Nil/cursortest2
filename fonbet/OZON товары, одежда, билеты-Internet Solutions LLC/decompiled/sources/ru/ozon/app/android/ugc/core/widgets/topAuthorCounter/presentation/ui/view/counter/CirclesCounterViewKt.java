package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.counter;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.CounterDTO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "config", "", "lineAnimationProgress", "circleAnimationProgress", "", "CirclesCounterView", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;FFLS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirclesCounterViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CirclesCounterView(@NotNull e modifier, CounterDTO.CirclesConfigDTO circlesConfigDTO, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        float f12;
        int i14;
        float f13;
        J0 m02;
        float f14;
        float f15;
        IconDTO copy;
        boolean z11;
        boolean z12;
        IconDTO copy2;
        CounterDTO.CirclesConfigDTO circlesConfigDTO2 = circlesConfigDTO;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(1087282018);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(circlesConfigDTO2) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            f12 = f7;
            i13 |= u11.q(f12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                f13 = f11;
                i13 |= u11.q(f13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    if (i15 != 0) {
                        f12 = 1.0f;
                    }
                    float f16 = i14 != 0 ? 1.0f : f13;
                    if (circlesConfigDTO2 != null || circlesConfigDTO2.getTotalCount() <= 0) {
                        float f17 = f12;
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new CirclesCounterViewKt$CirclesCounterView$1(modifier, circlesConfigDTO, f17, f16, i11, i12));
                            return;
                        }
                        return;
                    }
                    V f18 = C5185h.f(InterfaceC6250b.a.h(), false);
                    int I11 = u11.I();
                    A0 d11 = u11.d();
                    e f19 = c.f(u11, modifier);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f21 = E.f(u11, f18, u11, d11);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f21);
                    }
                    F1.b(u11, f19, InterfaceC2801g.a.f());
                    u11.o(-983523455);
                    float f22 = f12;
                    int i16 = i13;
                    boolean z13 = 0;
                    CirclesProgressLineKt.m1526CirclesProgressLineaoAMqTM(circlesConfigDTO2.getTotalCount(), circlesConfigDTO2.getProgressCount(), f22, circlesConfigDTO2.getActiveLineGradientColor(), circlesConfigDTO2.getInactiveLineBackgroundColor(), circlesConfigDTO2.getActiveIcon().getSize() != null ? r13.getSizeShape() : 0, u11, i13 & 896);
                    e e11 = a0.e(e.f40358c0, 1.0f);
                    Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.l(), u11, 6);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f23 = c.f(u11, e11);
                    Function0 a12 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f23, InterfaceC2801g.a.f());
                    u11.o(-1267254027);
                    int totalCount = circlesConfigDTO2.getTotalCount();
                    int i17 = 0;
                    while (i17 < totalCount) {
                        IconDTO.IconSize size = circlesConfigDTO2.getActiveIcon().getSize();
                        float sizeShape = size != null ? size.getSizeShape() : z13;
                        boolean z14 = i17 < circlesConfigDTO2.getProgressCount() ? true : z13;
                        boolean z15 = (circlesConfigDTO2.getProgressCount() == 0 && i17 == 0) ? true : z13;
                        boolean z16 = (circlesConfigDTO2.getProgressCount() == circlesConfigDTO2.getTotalCount() && i17 == circlesConfigDTO2.getTotalCount() + (-1)) ? true : z13;
                        AbstractC7799Q gradient = TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrHighDemandDelivery(), u11, UniGradientToken.$stable);
                        i17++;
                        copy = r18.copy((r34 & 1) != 0 ? r18.size : null, (r34 & 2) != 0 ? r18.hasShape : null, (r34 & 4) != 0 ? r18.shape : null, (r34 & 8) != 0 ? r18.text : String.valueOf(i17), (r34 & 16) != 0 ? r18.icon : null, (r34 & 32) != 0 ? r18.backgroundImage : null, (r34 & 64) != 0 ? r18.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r18.textColor : null, (r34 & 256) != 0 ? r18.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r18.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r18.borderWidth : null, (r34 & 2048) != 0 ? r18.isBorderInside : null, (r34 & 4096) != 0 ? r18.hasParanja : null, (r34 & 8192) != 0 ? r18.getContext() : null, (r34 & 16384) != 0 ? r18.getTestInfo() : null, (r34 & 32768) != 0 ? ((!z14 || z16) ? circlesConfigDTO2.getInactiveIcon() : circlesConfigDTO2.getActiveIcon()).getTrackingInfo() : null);
                        e.a aVar = e.f40358c0;
                        e n11 = a0.n(aVar, sizeShape);
                        V f24 = C5185h.f(InterfaceC6250b.a.e(), z13);
                        int I13 = u11.I();
                        int i18 = totalCount;
                        A0 d13 = u11.d();
                        e f25 = c.f(u11, n11);
                        Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a13);
                        } else {
                            u11.e();
                        }
                        Function2 f26 = E.f(u11, f24, u11, d13);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                            a.d(I13, u11, I13, f26);
                        }
                        F1.b(u11, f25, InterfaceC2801g.a.f());
                        C5187j c5187j = C5187j.f39515a;
                        int i19 = IconDTO.$stable;
                        DsIconAtomKt.DsIconAtom(copy, null, u11, i19, 2);
                        u11.o(471394279);
                        if (z15) {
                            float f27 = 2;
                            e n12 = a0.n(aVar, sizeShape - f27);
                            u11.o(471398593);
                            boolean n13 = u11.n(gradient);
                            Object C11 = u11.C();
                            if (n13 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new CirclesCounterViewKt$CirclesCounterView$2$1$1$1$1$1$1(gradient, f27);
                                u11.x(C11);
                            }
                            u11.k();
                            z11 = false;
                            C8392m.a(n12, (Function1) C11, u11, 0);
                        } else {
                            z11 = false;
                        }
                        u11.k();
                        u11.o(471408488);
                        if (z16) {
                            e b12 = c5187j.b(aVar);
                            V f28 = C5185h.f(InterfaceC6250b.a.o(), z11);
                            int I14 = u11.I();
                            A0 d14 = u11.d();
                            e f29 = c.f(u11, b12);
                            Function0 a14 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a14);
                            } else {
                                u11.e();
                            }
                            Function2 f31 = E.f(u11, f28, u11, d14);
                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                                a.d(I14, u11, I14, f31);
                            }
                            F1.b(u11, f29, InterfaceC2801g.a.f());
                            copy2 = r17.copy((r34 & 1) != 0 ? r17.size : null, (r34 & 2) != 0 ? r17.hasShape : null, (r34 & 4) != 0 ? r17.shape : null, (r34 & 8) != 0 ? r17.text : String.valueOf(i17), (r34 & 16) != 0 ? r17.icon : null, (r34 & 32) != 0 ? r17.backgroundImage : null, (r34 & 64) != 0 ? r17.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r17.textColor : null, (r34 & 256) != 0 ? r17.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r17.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r17.borderWidth : null, (r34 & 2048) != 0 ? r17.isBorderInside : null, (r34 & 4096) != 0 ? r17.hasParanja : null, (r34 & 8192) != 0 ? r17.getContext() : null, (r34 & 16384) != 0 ? r17.getTestInfo() : null, (r34 & 32768) != 0 ? circlesConfigDTO.getActiveIcon().getTrackingInfo() : null);
                            u11.o(1728076221);
                            boolean z17 = (i16 & 7168) == 2048;
                            Object C12 = u11.C();
                            if (z17 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new CirclesCounterViewKt$CirclesCounterView$2$1$1$1$1$2$1$1(f16);
                                u11.x(C12);
                            }
                            u11.k();
                            e a15 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C12);
                            z12 = false;
                            DsIconAtomKt.DsIconAtom(copy2, a15, u11, i19, 0);
                            u11.f();
                        } else {
                            z12 = z11;
                        }
                        u11.k();
                        u11.f();
                        circlesConfigDTO2 = circlesConfigDTO;
                        totalCount = i18;
                        z13 = z12;
                    }
                    u11.k();
                    u11.f();
                    Unit unit = Unit.f71690a;
                    u11.k();
                    u11.f();
                    f14 = f16;
                    f15 = f22;
                } else {
                    u11.j();
                    f15 = f12;
                    f14 = f13;
                }
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new CirclesCounterViewKt$CirclesCounterView$3(modifier, circlesConfigDTO, f15, f14, i11, i12));
                    return;
                }
                return;
            }
            f13 = f11;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            if (circlesConfigDTO2 != null) {
            }
            float f172 = f12;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        f12 = f7;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        f13 = f11;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        if (circlesConfigDTO2 != null) {
        }
        float f1722 = f12;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}

package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import G1.i;
import P0.p2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import V1.h;
import Z1.b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.android.composerCommonViewKit.R$string;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu0/b;", "", "index", "", "AdultOverlay", "(Lu0/b;ILS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdultOverlayKt {
    public static final void AdultOverlay(@NotNull InterfaceC9893b interfaceC9893b, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(interfaceC9893b, "<this>");
        C3969l u11 = interfaceC3967k.u(471614185);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(interfaceC9893b) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
            e b11 = interfaceC9893b.b(aVar);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e f13 = T.f(aVar, 8);
            P9.a.b(f13, "adultOverlay" + i11);
            u11.o(-1543788378);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation.AdultOverlayKt$AdultOverlay$1$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation.AdultOverlayKt$AdultOverlay$1$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $iconPlaceable;
                        final /* synthetic */ m0 $textPlaceable;
                        final /* synthetic */ Y $this_Layout;
                        final /* synthetic */ int $width;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var, int i11, Y y11, m0 m0Var2) {
                            super(1);
                            this.$iconPlaceable = m0Var;
                            this.$width = i11;
                            this.$this_Layout = y11;
                            this.$textPlaceable = m0Var2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.d(this.$iconPlaceable, InterfaceC6250b.a.g().a(this.$iconPlaceable.u0(), this.$width, this.$this_Layout.getLayoutDirection()), 0, 0.0f);
                            m0 m0Var = this.$textPlaceable;
                            if (m0Var != null) {
                                layout.d(m0Var, InterfaceC6250b.a.g().a(this.$textPlaceable.u0(), this.$width, this.$this_Layout.getLayoutDirection()), this.$iconPlaceable.l0(), 0.0f);
                            }
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        m0 a02 = measurables.get(0).a0(j11);
                        int j12 = b.j(j11) - a02.l0();
                        if (j12 < 0) {
                            j12 = 0;
                        }
                        m0 a03 = measurables.get(1).O(b.k(j11)) <= j12 ? measurables.get(1).a0(j11) : null;
                        int max = Math.max(a02.u0(), a03 != null ? a03.u0() : 0);
                        z02 = Layout.z0(max, a02.l0() + (a03 != null ? a03.l0() : 0), kotlin.collections.U.c(), new AnonymousClass1(a02, max, Layout, a03));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, f13);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, v11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            UniTheme uniTheme = UniTheme.INSTANCE;
            long graphicPrimaryOnLight = uniTheme.getColors(u11, UniTheme.$stable).getGraphicPrimaryOnLight();
            P9.a.b(aVar, "adultIcon" + i11);
            uniTheme.getIcons();
            u11.B(-1732297917);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_non_visibility_filled, "ic_m_non_visibility_filled", u11, 48);
            u11.K();
            P0.E.a(uniPainterResource, null, aVar, graphicPrimaryOnLight, u11, 48);
            e j11 = T.j(aVar, 0.0f, 4, 0.0f, 0.0f, 13);
            P9.a.b(j11, "adultText" + i11);
            c3969l = u11;
            p2.b(i.a(u11, R$string.common_message_adult), j11, graphicPrimaryOnLight, 0L, 0L, h.a(3), 0L, 3, false, 0, 0, uniTheme.getTypography().getCompact400Small(), c3969l, 0, 48, 62968);
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new AdultOverlayKt$AdultOverlay$2(interfaceC9893b, i11, i12));
        }
    }
}

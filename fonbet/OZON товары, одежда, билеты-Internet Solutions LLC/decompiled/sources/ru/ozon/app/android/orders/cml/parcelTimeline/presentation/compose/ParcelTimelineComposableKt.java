package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import G1.b;
import S0.A0;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.J0;
import S0.Q;
import Sc.o;
import Z1.d;
import a00.C4911f;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import androidx.fragment.app.ComponentCallbacksC5392m;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.j;
import i1.C6988h;
import i1.C6994n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b \u0010!\u001a9\u0010)\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010,\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-\u001a%\u0010/\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020*H\u0002¢\u0006\u0004\b/\u00100¨\u00062²\u0006\u000e\u00101\u001a\u00020*8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "item", "Lkotlin/Function1;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/compose/ParcelTimelineUpdateEvent;", "", "onHeaderClick", "ParcelTimelineComposable", "(Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;", "section", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "connector", "", "isLastElement", "ParcelTimelineHeader", "(Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;ZLS0/k;I)V", "isVisible", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelineStepVO;", "step", "isLastStep", "ParcelTimelineStep", "(ZLru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelineStepVO;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;ZLS0/k;I)V", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "point", "ParcelTimelinePoint", "(Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;LS0/k;I)V", "", "color", "ColorPoint", "(Ljava/lang/String;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "ParcelTimelineConnector", "(Landroidx/compose/ui/e;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;LS0/k;I)V", "Ll1/Z;", "LZ1/h;", "thickness", "dashLength", "gapLength", "dashedVerticalLine-aBf7M2Q", "(Landroidx/compose/ui/e;JFFF)Landroidx/compose/ui/e;", "dashedVerticalLine", "", "sectionIndex", "getSectionBottomLine", "(Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;I)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "stepIndex", "getStepBottomLine", "(Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;II)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "navigationBarPadding", "orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParcelTimelineComposableKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParcelTimelineDTO.SectionDTO.ConnectorStyle.values().length];
            try {
                iArr[ParcelTimelineDTO.SectionDTO.ConnectorStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParcelTimelineDTO.SectionDTO.ConnectorStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ColorPoint(String str, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(-1043444693);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(str, u11, i12 & 14);
            u11.o(2029309125);
            long graphicActionPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.n(T.h(e.f40358c0, 6, 0.0f, 2), ParcelTimelineConstants.INSTANCE.m865getCOLOR_POINT_SIZE_DPD9Ej5fM()), h.e()), graphicActionPrimary, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ParcelTimelineComposableKt$ColorPoint$1(str, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [S0.k, S0.l] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    public static final void ParcelTimelineComposable(@NotNull ParcelTimelineVO item, @NotNull Function1<? super ParcelTimelineUpdateEvent, Unit> onHeaderClick, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        InterfaceC3972m0 interfaceC3972m0;
        boolean z11;
        List<ParcelTimelineVO.SectionVO.TimelineStepVO> steps;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onHeaderClick, "onHeaderClick");
        ?? u11 = interfaceC3967k.u(-1481903018);
        int i12 = (i11 & 6) == 0 ? (u11.F(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onHeaderClick) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            d dVar = (d) u11.m(K0.e());
            ComponentCallbacksC5392m c11 = ((C4911f) u11.m(f.d())).c();
            u11.o(-1271535788);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(1);
                u11.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m02 = (InterfaceC3972m0) C11;
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(-1271533448);
            boolean F11 = u11.F(c11);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ParcelTimelineComposableKt$ParcelTimelineComposable$1$1(c11, interfaceC3972m02, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar, b.a(u11, UniColors.LAYER_FLOOR_1.getResId()), y0.a());
            e h11 = T.h(b11, 16, 0.0f, 2);
            boolean z12 = false;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            E.a(u11, a0.e(a0.f(aVar, 11), 1.0f));
            u11.o(1575792578);
            int i14 = 0;
            for (Object obj : item.getSections()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ParcelTimelineVO.SectionVO sectionVO = (ParcelTimelineVO.SectionVO) obj;
                ParcelTimelineHeader(sectionVO, onHeaderClick, getSectionBottomLine(item, i14), (C7714v.P(item.getSections()) == i14 && ((steps = ((ParcelTimelineVO.SectionVO) C7714v.X(item.getSections())).getSteps()) == null || steps.isEmpty())) ? true : z12, u11, i13 & 112);
                List<ParcelTimelineVO.SectionVO.TimelineStepVO> steps2 = sectionVO.getSteps();
                if (steps2 == null) {
                    steps2 = K.f71697a;
                }
                u11.o(1575807231);
                ?? r52 = z12;
                for (Object obj2 : steps2) {
                    int i16 = r52 + 1;
                    if (r52 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO = (ParcelTimelineVO.SectionVO.TimelineStepVO) obj2;
                    boolean z13 = (C7714v.P(item.getSections()) == i14 && C7714v.P(steps2) == r52) ? true : z12;
                    if (sectionVO.getUiState() != ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED) {
                        interfaceC3972m0 = interfaceC3972m02;
                        z11 = true;
                    } else {
                        interfaceC3972m0 = interfaceC3972m02;
                        z11 = false;
                    }
                    ParcelTimelineStep(z11, timelineStepVO, getStepBottomLine(item, i14, r52), z13, u11, IconDTO.$stable << 3);
                    interfaceC3972m02 = interfaceC3972m0;
                    r52 = i16;
                    z12 = false;
                    i14 = i14;
                }
                u11.k();
                i14 = i15;
            }
            u11.k();
            E.a(u11, a0.n(e.f40358c0, Z1.h.a(dVar.B(interfaceC3972m02.getIntValue())).d()));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ParcelTimelineComposableKt$ParcelTimelineComposable$3(item, onHeaderClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ParcelTimelineConnector(e eVar, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(-343677787);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(connectorVO) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (connectorVO == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ParcelTimelineComposableKt$ParcelTimelineConnector$1(eVar, connectorVO, i11));
                    return;
                }
                return;
            }
            C7807Z c7807z = TokenParserKt.tokenToColor(connectorVO.getColor(), u11, 0);
            u11.o(-932724052);
            long graphicStrokeSticky = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicStrokeSticky() : c7807z.w();
            u11.k();
            int i13 = WhenMappings.$EnumSwitchMapping$0[connectorVO.getStyle().ordinal()];
            if (i13 == 1) {
                u11.o(-932718860);
                b11 = androidx.compose.foundation.e.b(eVar, graphicStrokeSticky, y0.a());
                C5185h.a(a0.c(a0.r(b11, 2)), u11, 0);
                u11.k();
            } else {
                if (i13 != 2) {
                    u11.o(-932721314);
                    u11.k();
                    throw new o();
                }
                u11.o(-932712299);
                C5185h.a(a0.e(j.a(m864dashedVerticalLineaBf7M2Q$default(eVar, graphicStrokeSticky, 0.0f, 0.0f, 0.0f, 14, null), -1.0f), 1.0f), u11, 0);
                u11.k();
            }
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new ParcelTimelineComposableKt$ParcelTimelineConnector$2(eVar, connectorVO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ParcelTimelineHeader(ParcelTimelineVO.SectionVO sectionVO, Function1<? super ParcelTimelineUpdateEvent, Unit> function1, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar;
        e.a aVar2;
        List<ParcelTimelineVO.SectionVO.TimelineStepVO> steps;
        C3969l u11 = interfaceC3967k.u(-1003727669);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(sectionVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(connectorVO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            ParcelTimelineVO.SectionVO.SectionHeaderVO header = sectionVO.getHeader();
            float f7 = sectionVO.getUiState() == ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED ? 180.0f : 0.0f;
            boolean z12 = (sectionVO.getUiState() == ParcelTimelineDTO.SectionDTO.SectionUIState.DISABLED || (steps = sectionVO.getSteps()) == null || steps.isEmpty()) ? false : true;
            e.a aVar3 = e.f40358c0;
            e u12 = a0.u(a0.e(aVar3, 1.0f), 3);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, u12);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = T7.E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            e b11 = c5187j.b(aVar3);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, b11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            ParcelTimelineVO.SectionVO.TimelinePointVO point = header.getPoint();
            int i14 = IconDTO.$stable;
            ParcelTimelinePoint(point, u11, i14);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            ParcelTimelineConnector(T.j(new LayoutWeightElement(1.0f, true), 11, 0.0f, 0.0f, 0.0f, 14), connectorVO, u11, (i13 >> 3) & 112);
            u11.f();
            ParcelTimelineConstants parcelTimelineConstants = ParcelTimelineConstants.INSTANCE;
            e j11 = T.j(aVar3, parcelTimelineConstants.m870getCONTENT_PADDING_START_DPD9Ej5fM(), 0.0f, 0.0f, z11 ? 0 : parcelTimelineConstants.m869getCONTENT_PADDING_BOTTOM_DPD9Ej5fM(), 6);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f15 = c.f(u11, j11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h11);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            float f16 = 4;
            e j12 = T.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 2, f16, 0.0f, 9);
            C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f17 = c.f(u11, j12);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 g11 = K00.b.g(u11, a15, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, g11);
            }
            F1.b(u11, f17, InterfaceC2801g.a.f());
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I15 = u11.I();
            A0 d15 = u11.d();
            e f18 = c.f(u11, aVar3);
            Function0 a17 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a17);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d15);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                a.d(I15, u11, I15, h12);
            }
            F1.b(u11, f18, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(header.getTitle(), null, u11, 0, 2);
            IconDTO chevron = header.getChevron();
            u11.o(1950811856);
            if (chevron != null) {
                e j13 = T.j(new VerticalAlignElement(InterfaceC6250b.a.i()), f16, 0.0f, 0.0f, 0.0f, 14);
                f16 = f16;
                DsIconAtomKt.DsIconAtom(chevron, C6994n.a(j13, f7), u11, i14, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
            TextDTO subtitle = header.getSubtitle();
            u11.o(-1303367953);
            if (subtitle == null) {
                aVar = aVar3;
            } else {
                aVar = aVar3;
                DsTextAtomKt.DsTextAtom(subtitle, T.j(aVar, 0.0f, f16, 0.0f, 6, 5), u11, 48, 0);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            BadgeDTO badge = header.getBadge();
            u11.o(597785461);
            if (badge == null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                DsBadgeAtomKt.DsBadgeAtom(badge, T.j(aVar, 8, 3, 0.0f, 0.0f, 12), null, u11, 48, 4);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            e c11 = P.c(c5187j.b(aVar2), 0.0f, -5, 1);
            String obj = header.getTitle().getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            e a18 = Q1.a(c11, obj);
            u11.o(329602795);
            boolean F11 = u11.F(header);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ParcelTimelineComposableKt$ParcelTimelineHeader$1$3$1(header);
                u11.x(C11);
            }
            u11.k();
            e c12 = I1.o.c(a18, false, (Function1) C11);
            u11.o(329611413);
            boolean F12 = u11.F(sectionVO) | ((i13 & 112) == 32);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ParcelTimelineComposableKt$ParcelTimelineHeader$1$4$1(sectionVO, function1);
                u11.x(C12);
            }
            u11.k();
            C5185h.a(i.b(c12, null, null, z12, null, null, (Function0) C12, 24), u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ParcelTimelineComposableKt$ParcelTimelineHeader$2(sectionVO, function1, connectorVO, z11, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ParcelTimelinePoint(ParcelTimelineVO.SectionVO.TimelinePointVO timelinePointVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1319871729);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(timelinePointVO) : u11.F(timelinePointVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else if (timelinePointVO.getIcon() != null) {
            u11.o(1241514668);
            DsIconAtomKt.DsIconAtom(timelinePointVO.getIcon(), null, u11, IconDTO.$stable, 2);
            u11.k();
        } else {
            u11.o(1241564113);
            ColorPoint(timelinePointVO.getColor(), u11, 0);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ParcelTimelineComposableKt$ParcelTimelinePoint$1(timelinePointVO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ParcelTimelineStep(boolean z11, ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO, boolean z12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z13;
        C3969l u11 = interfaceC3967k.u(-1873334299);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(timelineStepVO) : u11.F(timelineStepVO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(connectorVO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            z13 = z11;
        } else {
            z13 = z11;
            G.c(z13, null, null, null, null, a1.c.c(-1211889139, new ParcelTimelineComposableKt$ParcelTimelineStep$1(z12, timelineStepVO, connectorVO), u11), u11, (i12 & 14) | 196608, 30);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ParcelTimelineComposableKt$ParcelTimelineStep$2(z13, timelineStepVO, connectorVO, z12, i11));
        }
    }

    /* renamed from: dashedVerticalLine-aBf7M2Q, reason: not valid java name */
    private static final e m863dashedVerticalLineaBf7M2Q(e eVar, long j11, float f7, float f11, float f12) {
        return androidx.compose.ui.draw.c.c(a0.r(eVar, f7), new ParcelTimelineComposableKt$dashedVerticalLine$1(f7, f11, f12, j11));
    }

    /* renamed from: dashedVerticalLine-aBf7M2Q$default, reason: not valid java name */
    static /* synthetic */ e m864dashedVerticalLineaBf7M2Q$default(e eVar, long j11, float f7, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = ParcelTimelineConstants.INSTANCE.m868getCONNECTOR_WIDTH_DPD9Ej5fM();
        }
        float f13 = f7;
        if ((i11 & 4) != 0) {
            f11 = ParcelTimelineConstants.INSTANCE.m867getCONNECTOR_LENGTH_DPD9Ej5fM();
        }
        float f14 = f11;
        if ((i11 & 8) != 0) {
            f12 = ParcelTimelineConstants.INSTANCE.m866getCONNECTOR_INTERVAL_DPD9Ej5fM();
        }
        return m863dashedVerticalLineaBf7M2Q(eVar, j11, f13, f14, f12);
    }

    private static final ParcelTimelineVO.SectionVO.ConnectorVO getSectionBottomLine(ParcelTimelineVO parcelTimelineVO, int i11) {
        ParcelTimelineVO.SectionVO.SectionHeaderVO header;
        ParcelTimelineVO.SectionVO.TimelinePointVO point;
        List<ParcelTimelineVO.SectionVO.TimelineStepVO> steps;
        ParcelTimelineVO.SectionVO.TimelinePointVO point2;
        ParcelTimelineVO.SectionVO sectionVO = parcelTimelineVO.getSections().get(i11);
        if (sectionVO.getUiState() != ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED && (steps = sectionVO.getSteps()) != null && !steps.isEmpty()) {
            ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO = (ParcelTimelineVO.SectionVO.TimelineStepVO) C7714v.M(sectionVO.getSteps());
            if (timelineStepVO == null || (point2 = timelineStepVO.getPoint()) == null) {
                return null;
            }
            return point2.getTopLine();
        }
        ParcelTimelineVO.SectionVO sectionVO2 = (ParcelTimelineVO.SectionVO) C7714v.Q(i11 + 1, parcelTimelineVO.getSections());
        if (sectionVO2 == null || (header = sectionVO2.getHeader()) == null || (point = header.getPoint()) == null) {
            return null;
        }
        return point.getTopLine();
    }

    private static final ParcelTimelineVO.SectionVO.ConnectorVO getStepBottomLine(ParcelTimelineVO parcelTimelineVO, int i11, int i12) {
        ParcelTimelineVO.SectionVO.SectionHeaderVO header;
        ParcelTimelineVO.SectionVO.TimelinePointVO point;
        ParcelTimelineVO.SectionVO.TimelinePointVO point2;
        ParcelTimelineVO.SectionVO sectionVO = parcelTimelineVO.getSections().get(i11);
        List<ParcelTimelineVO.SectionVO.TimelineStepVO> steps = sectionVO.getSteps();
        if (steps != null && !steps.isEmpty() && C7714v.P(sectionVO.getSteps()) != i12) {
            ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO = (ParcelTimelineVO.SectionVO.TimelineStepVO) C7714v.Q(i12 + 1, sectionVO.getSteps());
            if (timelineStepVO == null || (point2 = timelineStepVO.getPoint()) == null) {
                return null;
            }
            return point2.getTopLine();
        }
        ParcelTimelineVO.SectionVO sectionVO2 = (ParcelTimelineVO.SectionVO) C7714v.Q(i11 + 1, parcelTimelineVO.getSections());
        if (sectionVO2 == null || (header = sectionVO2.getHeader()) == null || (point = header.getPoint()) == null) {
            return null;
        }
        return point.getTopLine();
    }
}

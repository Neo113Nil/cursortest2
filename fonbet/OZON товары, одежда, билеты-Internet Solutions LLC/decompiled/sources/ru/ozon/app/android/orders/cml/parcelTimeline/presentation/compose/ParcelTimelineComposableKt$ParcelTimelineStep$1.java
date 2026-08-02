package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import m3.C8060b;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ParcelTimelineComposableKt$ParcelTimelineStep$1 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ParcelTimelineVO.SectionVO.ConnectorVO $connector;
    final /* synthetic */ boolean $isLastStep;
    final /* synthetic */ ParcelTimelineVO.SectionVO.TimelineStepVO $step;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelTimelineComposableKt$ParcelTimelineStep$1(boolean z11, ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO) {
        super(3);
        this.$isLastStep = z11;
        this.$step = timelineStepVO;
        this.$connector = connectorVO;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        e.a aVar = e.f40358c0;
        e e11 = a0.e(aVar, 1.0f);
        boolean z11 = this.$isLastStep;
        ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO = this.$step;
        ParcelTimelineVO.SectionVO.ConnectorVO connectorVO = this.$connector;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, e11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        e b11 = C5187j.f39515a.b(aVar);
        C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I12 = interfaceC3967k.I();
        A0 d13 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, b11);
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
        Function2 c11 = P.c(interfaceC3967k, a12, interfaceC3967k, d13);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            a.d(c11, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        ParcelTimelineComposableKt.ParcelTimelinePoint(timelineStepVO.getPoint(), interfaceC3967k, IconDTO.$stable);
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
        }
        ParcelTimelineComposableKt.ParcelTimelineConnector(T.j(new LayoutWeightElement(1.0f, true), 11, 0.0f, 0.0f, 0.0f, 14), connectorVO, interfaceC3967k, 0);
        interfaceC3967k.f();
        e e12 = a0.e(aVar, 1.0f);
        ParcelTimelineConstants parcelTimelineConstants = ParcelTimelineConstants.INSTANCE;
        e j11 = T.j(e12, parcelTimelineConstants.m870getCONTENT_PADDING_START_DPD9Ej5fM(), 0.0f, 0.0f, z11 ? 0 : parcelTimelineConstants.m869getCONTENT_PADDING_BOTTOM_DPD9Ej5fM(), 6);
        Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k, 0);
        int I13 = interfaceC3967k.I();
        A0 d14 = interfaceC3967k.d();
        e f13 = c.f(interfaceC3967k, j11);
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a14);
        } else {
            interfaceC3967k.e();
        }
        Function2 f14 = C3173b.f(interfaceC3967k, b12, interfaceC3967k, d14);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I13))) {
            a.d(f14, I13, interfaceC3967k, I13);
        }
        F1.b(interfaceC3967k, f13, InterfaceC2801g.a.f());
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I14 = interfaceC3967k.I();
        A0 d15 = interfaceC3967k.d();
        e f15 = c.f(interfaceC3967k, layoutWeightElement);
        Function0 a16 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a16);
        } else {
            interfaceC3967k.e();
        }
        Function2 c12 = P.c(interfaceC3967k, a15, interfaceC3967k, d15);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I14))) {
            a.d(c12, I14, interfaceC3967k, I14);
        }
        F1.b(interfaceC3967k, f15, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(timelineStepVO.getTitle(), androidx.compose.foundation.layout.P.c(aVar, 0.0f, -2, 1), interfaceC3967k, 48, 0);
        TextDTO subtitle = timelineStepVO.getSubtitle();
        interfaceC3967k.o(630823905);
        if (subtitle != null) {
            DsTextAtomKt.DsTextAtom(subtitle, T.j(aVar, 0.0f, 2, 0.0f, 6, 5), interfaceC3967k, 48, 0);
            Unit unit = Unit.f71690a;
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        BadgeDTO badge = timelineStepVO.getBadge();
        interfaceC3967k.o(-2041874159);
        if (badge != null) {
            float f16 = 8;
            DsBadgeAtomKt.DsBadgeAtom(badge, androidx.compose.foundation.layout.P.c(T.j(aVar, f16, 0.0f, 0.0f, f16, 6), 0.0f, -3, 1), null, interfaceC3967k, 48, 4);
            Unit unit2 = Unit.f71690a;
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.f();
    }
}

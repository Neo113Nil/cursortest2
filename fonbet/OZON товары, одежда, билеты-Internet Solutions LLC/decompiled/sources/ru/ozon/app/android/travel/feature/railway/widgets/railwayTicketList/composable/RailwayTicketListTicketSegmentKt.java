package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import A0.h;
import B1.I;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Z1.d;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import e1.InterfaceC6250b;
import e2.C6267k;
import e2.C6271o;
import e2.C6281y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation.RailwayTicketListVI;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "segment", "", "RailwayTicketListTicketSegment", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;LS0/k;I)V", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTicketListTicketSegmentKt {
    public static final void RailwayTicketListTicketSegment(@NotNull RailwayTicketListVI.TicketSegmentVI segment, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        InterfaceC3978p0 interfaceC3978p0;
        C6271o c6271o;
        InterfaceC3978p0 interfaceC3978p02;
        Intrinsics.checkNotNullParameter(segment, "segment");
        C3969l u11 = interfaceC3967k.u(1036421997);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(segment) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            long bgSecondary = uniTheme.getColors(u11, i13).getBgSecondary();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e f7 = T.f(androidx.compose.foundation.e.b(e11, bgSecondary, h.b(dsSpacings.m1845getDp16D9Ej5fM())), dsSpacings.m1845getDp16D9Ej5fM());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, f7);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            B.a(GZ.e.c(u11, f11, aVar, 1.0f), C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), 0, 0, null, a1.c.c(-1799148302, new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$1(segment), u11), u11, 1572870, 56);
            E.a(u11, a0.f(aVar, dsSpacings.m1861getDp8D9Ej5fM()));
            e e12 = a0.e(aVar, 1.0f);
            u11.o(-1003410150);
            u11.o(212064437);
            u11.k();
            d dVar = (d) u11.m(K0.e());
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C6281y(dVar);
                u11.x(C11);
            }
            final C6281y c6281y = (C6281y) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new C6267k();
                u11.x(C12);
            }
            C6267k c6267k = (C6267k) C12;
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C13);
            }
            final InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C13;
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new C6271o(c6267k);
                u11.x(C14);
            }
            final C6271o c6271o2 = (C6271o) C14;
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = n1.f(Unit.f71690a, n1.h());
                u11.x(C15);
            }
            final InterfaceC3978p0 interfaceC3978p04 = (InterfaceC3978p0) C15;
            final int i14 = 257;
            boolean F11 = u11.F(c6281y) | u11.r(257);
            Object C16 = u11.C();
            if (F11 || C16 == InterfaceC3967k.a.a()) {
                C16 = new V() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable.RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$2

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable.RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ List $measurables;
                        final /* synthetic */ C6281y $measurer;
                        final /* synthetic */ Map $placeableMap;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C6281y c6281y, List list, Map map) {
                            super(1);
                            this.$measurer = c6281y;
                            this.$measurables = list;
                            this.$placeableMap = map;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a aVar) {
                            this.$measurer.e(aVar, this.$measurables, this.$placeableMap);
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y y11, List<? extends U> list, long j11) {
                        W z02;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        InterfaceC3978p0.this.getValue();
                        long f12 = c6281y.f(j11, y11.getLayoutDirection(), c6271o2, list, linkedHashMap, i14);
                        interfaceC3978p03.getValue();
                        z02 = y11.z0((int) (f12 >> 32), (int) (f12 & 4294967295L), kotlin.collections.U.c(), new AnonymousClass1(c6281y, list, linkedHashMap));
                        return z02;
                    }
                };
                interfaceC3978p0 = interfaceC3978p04;
                c6271o = c6271o2;
                interfaceC3978p02 = interfaceC3978p03;
                u11.x(C16);
            } else {
                interfaceC3978p0 = interfaceC3978p04;
                c6271o = c6271o2;
                interfaceC3978p02 = interfaceC3978p03;
            }
            V v11 = (V) C16;
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$3(interfaceC3978p02, c6271o);
                u11.x(C17);
            }
            Function0 function0 = (Function0) C17;
            boolean F12 = u11.F(c6281y);
            Object C18 = u11.C();
            if (F12 || C18 == InterfaceC3967k.a.a()) {
                C18 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$4(c6281y);
                u11.x(C18);
            }
            I.a(o.c(e12, false, (Function1) C18), a1.c.c(1200550679, new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$5(interfaceC3978p0, c6267k, function0, segment), u11), v11, u11, 48);
            u11.k();
            E.a(u11, a0.f(aVar, dsSpacings.m1842getDp12D9Ej5fM()));
            RailwayTicketListDottedDividerKt.m1440RailwayTicketListDottedDividerRPmYEkk(a0.e(aVar, 1.0f), uniTheme.getColors(u11, i13).getGraphicNeutral(), u11, 6);
            E.a(u11, a0.f(aVar, dsSpacings.m1842getDp12D9Ej5fM()));
            B.a(a0.e(aVar, 1.0f), C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), 0, 0, null, a1.c.c(203852507, new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$3(segment), u11), u11, 1572870, 56);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$2(segment, i11));
        }
    }
}

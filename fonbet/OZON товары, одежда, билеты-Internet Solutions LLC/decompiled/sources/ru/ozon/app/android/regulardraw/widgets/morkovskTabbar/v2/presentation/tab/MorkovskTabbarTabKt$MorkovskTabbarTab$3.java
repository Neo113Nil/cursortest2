package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I0.C3173b;
import J0.P;
import J0.u3;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.l;
import Z1.d;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import e3.C6285b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m3.C8060b;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.uni.atoms.data.TestInfo;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskTabbarTabKt$MorkovskTabbarTab$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ MorkovskTabbarTabController $controller;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<b, Unit> $onAtomAction;
    final /* synthetic */ MorkovskTabbarVI.Tab $state;
    final /* synthetic */ l $tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MorkovskTabbarVI.Tab.Layout.values().length];
            try {
                iArr[MorkovskTabbarVI.Tab.Layout.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MorkovskTabbarVI.Tab.Layout.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MorkovskTabbarTabKt$MorkovskTabbarTab$3(e eVar, MorkovskTabbarVI.Tab tab, l lVar, Function1<? super b, Unit> function1, MorkovskTabbarTabController morkovskTabbarTabController) {
        super(2);
        this.$modifier = eVar;
        this.$state = tab;
        this.$tokenizedAnalytics = lVar;
        this.$onAtomAction = function1;
        this.$controller = morkovskTabbarTabController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MorkovskTabbarVI.Tab tab;
        MorkovskTabbarTabController morkovskTabbarTabController;
        C5187j c5187j;
        long j11;
        InterfaceC3967k interfaceC3967k2;
        boolean z11;
        long j12;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e eVar = this.$modifier;
        MorkovskTabbarVI.Tab tab2 = this.$state;
        l lVar = this.$tokenizedAnalytics;
        Function1<b, Unit> function1 = this.$onAtomAction;
        MorkovskTabbarTabController morkovskTabbarTabController2 = this.$controller;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, eVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        Boolean bool = null;
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
        C5187j c5187j2 = C5187j.f39515a;
        e.a aVar = e.f40358c0;
        e tabBackground = MorkovskTabbarTabBackgroundKt.tabBackground(aVar);
        interfaceC3967k.o(244737607);
        boolean n11 = interfaceC3967k.n(tab2) | interfaceC3967k.F(lVar) | interfaceC3967k.n(function1);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new MorkovskTabbarTabKt$MorkovskTabbarTab$3$1$1$1(tab2, function1, lVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e d13 = a0.d(i.c(tabBackground, false, null, null, (Function0) C11, 7));
        TestInfo testInfo = tab2.getTestInfo();
        String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
        if (automatizationId == null) {
            automatizationId = "";
        }
        e a12 = Q1.a(d13, automatizationId);
        V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I12 = interfaceC3967k.I();
        A0 d14 = interfaceC3967k.d();
        e f13 = c.f(interfaceC3967k, a12);
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
        Function2 d15 = C2454a.d(interfaceC3967k, f12, interfaceC3967k, d14);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            a.d(d15, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f13, InterfaceC2801g.a.f());
        e h11 = T.h(a0.c(M.c(c5187j2.a(aVar, InterfaceC6250b.a.e()), EnumC9909s.Min)), 6, 0.0f, 2);
        int i12 = WhenMappings.$EnumSwitchMapping$0[tab2.getLayout().ordinal()];
        if (i12 == 1) {
            tab = tab2;
            morkovskTabbarTabController = morkovskTabbarTabController2;
            c5187j = c5187j2;
            interfaceC3967k.o(-394121972);
            e j13 = T.j(h11, 0.0f, 4, 0.0f, 8, 5);
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), interfaceC3967k, 48);
            int I13 = interfaceC3967k.I();
            A0 d16 = interfaceC3967k.d();
            e f14 = c.f(interfaceC3967k, j13);
            Function0 a15 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a15);
            } else {
                interfaceC3967k.e();
            }
            Function2 c11 = P.c(interfaceC3967k, a14, interfaceC3967k, d16);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I13))) {
                a.d(c11, I13, interfaceC3967k, I13);
            }
            F1.b(interfaceC3967k, f14, InterfaceC2801g.a.f());
            d dVar = (d) interfaceC3967k.m(K0.e());
            String image = tab.getImage();
            j11 = C7807Z.f72255i;
            e m942previewBackgroundRPmYEkk = PreviewKt.m942previewBackgroundRPmYEkk(aVar, j11, interfaceC3967k, 54);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            e l02 = m942previewBackgroundRPmYEkk.l0(new LayoutWeightElement(1.0f, true));
            interfaceC3967k.o(-1233722189);
            boolean n12 = interfaceC3967k.n(dVar);
            Object C12 = interfaceC3967k.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new MorkovskTabbarTabKt$MorkovskTabbarTab$3$1$2$1$1$1(dVar);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            Ag0.e.a(image, l02, (Function1) C12, null, null, 0.0f, null, interfaceC3967k, 3072, 240);
            u3.b(tab.getTitle(), null, G1.b.a(interfaceC3967k, R$color.tabbar_vertical_title), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, RegularDrawTypographyKt.getText_10_14_W500(), interfaceC3967k, 0, 3120, 55290);
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.f();
            interfaceC3967k2.k();
            Unit unit = Unit.f71690a;
        } else {
            if (i12 != 2) {
                throw U7.l.c(interfaceC3967k, -394122794);
            }
            interfaceC3967k.o(-394083349);
            e j14 = T.j(h11, 0.0f, 8, 0.0f, 10, 5);
            Y b11 = X.b(C5179b.n(2), InterfaceC6250b.a.i(), interfaceC3967k, 54);
            int I14 = interfaceC3967k.I();
            A0 d17 = interfaceC3967k.d();
            e f15 = c.f(interfaceC3967k, j14);
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
            Function2 f16 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d17);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I14))) {
                a.d(f16, I14, interfaceC3967k, I14);
            }
            F1.b(interfaceC3967k, f15, InterfaceC2801g.a.f());
            String image2 = tab2.getImage();
            j12 = C7807Z.f72255i;
            Ag0.e.a(image2, a0.c(a0.r(PreviewKt.m942previewBackgroundRPmYEkk(aVar, j12, interfaceC3967k, 54), 35)), null, null, null, 0.0f, null, interfaceC3967k, 3072, 244);
            c5187j = c5187j2;
            tab = tab2;
            morkovskTabbarTabController = morkovskTabbarTabController2;
            u3.b(tab2.getTitle(), null, G1.b.a(interfaceC3967k, R$color.tabbar_horizontal_title), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, RegularDrawTypographyKt.getText_18_18_W600(), interfaceC3967k, 0, 3120, 55290);
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.f();
            interfaceC3967k2.k();
            Unit unit2 = Unit.f71690a;
        }
        interfaceC3967k2.f();
        interfaceC3967k2.o(244829457);
        if (tab.getIndicator() != null) {
            MorkovskTabbarVI.Tab.Indicator indicator = tab.getIndicator();
            interfaceC3967k2.o(244834562);
            if (morkovskTabbarTabController == null) {
                z11 = false;
            } else {
                z11 = false;
                bool = (Boolean) C6285b.c(morkovskTabbarTabController.getAnimateIndicatorAppearance(), interfaceC3967k2, 0).getValue();
                bool.getClass();
            }
            interfaceC3967k2.k();
            if (bool != null) {
                z11 = bool.booleanValue();
            }
            interfaceC3967k2.o(244838507);
            boolean n13 = interfaceC3967k2.n(morkovskTabbarTabController);
            Object C13 = interfaceC3967k2.C();
            if (n13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new MorkovskTabbarTabKt$MorkovskTabbarTab$3$1$4$1(morkovskTabbarTabController);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            MorkovskTabbarTabIndicatorKt.MorkovskTabbarIndicator(c5187j, indicator, z11, (Function0) C13, interfaceC3967k2, 6);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}

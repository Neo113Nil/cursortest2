package ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.presentation;

import A0.h;
import B1.InterfaceC2547p;
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
import Tg.b;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e1.d;
import e3.i;
import i1.C6988h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/presentation/SupportPremiumCellsWithHeaderVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "SupportPremiumCellsWithHeaderWidgetContent", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/presentation/SupportPremiumCellsWithHeaderVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportPremiumCellsWithHeaderWidgetContentKt {
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [androidx.compose.ui.e, e1.d$a] */
    /* JADX WARN: Type inference failed for: r6v26 */
    public static final void SupportPremiumCellsWithHeaderWidgetContent(@NotNull SupportPremiumCellsWithHeaderVI state, @NotNull Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        float f7;
        float f11;
        int i13;
        float f12;
        float f13;
        float f14;
        float f15;
        C3969l c3969l;
        float f16;
        ?? r62;
        float f17;
        float f18;
        int i14;
        long j11;
        float f19;
        e b12;
        Function1<? super b, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(720603088);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i15 = i12;
        if ((i15 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            float m1867getDpD9Ej5fM = Paddings.PADDING_100.m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM2 = Paddings.PADDING_300.m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM3 = Paddings.PADDING_350.m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM4 = Paddings.PADDING_500.m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM5 = Paddings.PADDING_1000.m1867getDpD9Ej5fM();
            float f21 = 24;
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(861950174);
            if (tokenizedEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-796982088);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SupportPremiumCellsWithHeaderWidgetContentKt$SupportPremiumCellsWithHeaderWidgetContent$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            String backgroundColor = state.getBackgroundColor();
            u11.o(861957401);
            boolean n11 = u11.n(backgroundColor);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = C7807Z.m(C7811b0.b(StyleParser.INSTANCE.parseColor(context, state.getBackgroundColor(), UniColors.BG_DARK_KEY.getResId())));
                u11.x(C12);
            }
            long w11 = ((C7807Z) C12).w();
            u11.k();
            String cellsBackgroundColor = state.getCellsBackgroundColor();
            u11.o(861965641);
            boolean n12 = u11.n(cellsBackgroundColor);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = C7807Z.m(C7811b0.b(StyleParser.INSTANCE.parseColor(context, state.getCellsBackgroundColor(), UniColors.BG_ACTION_PRIMARY.getResId())));
                u11.x(C13);
            }
            long w12 = ((C7807Z) C13).w();
            u11.k();
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(aVar2, 1.0f), h.b(f21)), w11, y0.a());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f22 = c.f(u11, b11);
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
            e c11 = GZ.e.c(u11, f22, aVar2, 1.0f);
            V f23 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f24 = c.f(u11, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f25 = E.f(u11, f23, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f25);
            }
            F1.b(u11, f24, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            String backgroundImage = state.getBackgroundImage();
            u11.o(-204975740);
            if (backgroundImage == null) {
                f11 = m1867getDpD9Ej5fM;
                c3969l = u11;
                i13 = 0;
                f15 = m1867getDpD9Ej5fM2;
                f14 = m1867getDpD9Ej5fM3;
                f7 = m1867getDpD9Ej5fM5;
                f12 = f21;
                f13 = m1867getDpD9Ej5fM4;
            } else {
                f7 = m1867getDpD9Ej5fM5;
                f11 = m1867getDpD9Ej5fM;
                i13 = 0;
                f12 = f21;
                f13 = m1867getDpD9Ej5fM4;
                f14 = m1867getDpD9Ej5fM3;
                f15 = m1867getDpD9Ej5fM2;
                C8366G.a(ru.ozon.pikazon.compose.painter.f.a(backgroundImage, null, null, null, u11, 0, 14), null, c5187j.b(aVar2), InterfaceC6250b.a.e(), InterfaceC2547p.a.b(), 0.0f, null, u11, 27696, 96);
                c3969l = u11;
                Unit unit2 = Unit.f71690a;
            }
            c3969l.k();
            ImageDTO image = state.getImage();
            c3969l.o(-204963322);
            if (image != null) {
                DsImageAtomKt.DsImageAtom(image, P.b(c5187j.a(aVar2, InterfaceC6250b.a.n()), -f13, f7), c3969l, i13, i13);
                Unit unit3 = Unit.f71690a;
            }
            c3969l.k();
            e e11 = a0.e(aVar2, 1.0f);
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, i13);
            int I13 = c3969l.I();
            A0 d13 = c3969l.d();
            e f26 = c.f(c3969l, e11);
            Function0 a15 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a15);
            } else {
                c3969l.e();
            }
            Function2 g11 = K00.b.g(c3969l, a14, c3969l, d13);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                a.d(I13, c3969l, I13, g11);
            }
            e j12 = T.j(GZ.e.c(c3969l, f26, aVar2, 1.0f), f13, f13, f13, 0.0f, 8);
            C5194q a16 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, i13);
            int I14 = c3969l.I();
            A0 d14 = c3969l.d();
            e f27 = c.f(c3969l, j12);
            Function0 a17 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a17);
            } else {
                c3969l.e();
            }
            Function2 g12 = K00.b.g(c3969l, a16, c3969l, d14);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I14))) {
                a.d(I14, c3969l, I14, g12);
            }
            F1.b(c3969l, f27, InterfaceC2801g.a.f());
            d.b i16 = InterfaceC6250b.a.i();
            e e12 = a0.e(aVar2, 1.0f);
            Y b13 = X.b(C5179b.f(), i16, c3969l, 48);
            int I15 = c3969l.I();
            A0 d15 = c3969l.d();
            e f28 = c.f(c3969l, e12);
            Function0 a18 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a18);
            } else {
                c3969l.e();
            }
            Function2 h11 = Cm.e.h(c3969l, b13, c3969l, d15);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I15))) {
                a.d(I15, c3969l, I15, h11);
            }
            F1.b(c3969l, f28, InterfaceC2801g.a.f());
            TextDTO titleLeft = state.getTitleLeft();
            c3969l.o(-619027854);
            if (titleLeft == null) {
                f16 = 1.0f;
            } else {
                f16 = 1.0f;
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                DsTextAtomKt.DsTextAtom(titleLeft, new LayoutWeightElement(1.0f, i13), c3969l, i13, i13);
                Unit unit4 = Unit.f71690a;
            }
            c3969l.k();
            TextDTO titleMid = state.getTitleMid();
            c3969l.o(-619022516);
            if (titleMid == null) {
                r62 = 0;
            } else {
                r62 = 0;
                DsTextAtomKt.DsTextAtom(titleMid, a0.x(aVar2, null, 3), c3969l, 48, i13);
                Unit unit5 = Unit.f71690a;
            }
            c3969l.k();
            ImageDTO titleRightImage = state.getTitleRightImage();
            c3969l.o(-619017160);
            if (titleRightImage != null) {
                DsImageAtomKt.DsImageAtom(state.getTitleRightImage(), r62, c3969l, i13, 2);
                Unit unit6 = Unit.f71690a;
            }
            c3969l.k();
            c3969l.f();
            TextDTO subtitle = state.getSubtitle();
            c3969l.o(1175492037);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, a0.x(aVar2, r62, 3), c3969l, 48, i13);
                Unit unit7 = Unit.f71690a;
            }
            c3969l.k();
            u0.E.a(c3969l, a0.f(aVar2, f15));
            BadgeDTO badge = state.getBadge();
            c3969l.o(1175498680);
            if (badge == null) {
                i14 = i13;
                f17 = f14;
                f18 = f16;
                u11 = c3969l;
                j11 = w12;
                f19 = f11;
            } else {
                f17 = f14;
                f18 = f16;
                u11 = c3969l;
                i14 = i13;
                j11 = w12;
                f19 = f11;
                DsBadgeAtomKt.DsBadgeAtom(badge, null, function1, u11, (i15 << 3) & 896, 2);
                Unit unit8 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            u0.E.a(u11, a0.f(aVar2, f17));
            b12 = androidx.compose.foundation.e.b(C6988h.a(T.f(a0.e(aVar2, f18), f19), h.b(f12)), j11, y0.a());
            C5194q a19 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, i14);
            int I16 = u11.I();
            A0 d16 = u11.d();
            e f29 = c.f(u11, b12);
            Function0 a21 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a21);
            } else {
                u11.e();
            }
            Function2 g13 = K00.b.g(u11, a19, u11, d16);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I16))) {
                a.d(I16, u11, I16, g13);
            }
            F1.b(u11, f29, InterfaceC2801g.a.f());
            u11.o(1175514565);
            Iterator<T> it = state.getCells().iterator();
            while (it.hasNext()) {
                DsCellAtomKt.DsCellAtom((CellDTO) it.next(), null, function1, u11, CellDTO.$stable | ((i15 << 3) & 896), 2);
            }
            actionHandler = function1;
            u11.k();
            u11.f();
            u11.f();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SupportPremiumCellsWithHeaderWidgetContentKt$SupportPremiumCellsWithHeaderWidgetContent$3(state, actionHandler, i11));
        }
    }
}

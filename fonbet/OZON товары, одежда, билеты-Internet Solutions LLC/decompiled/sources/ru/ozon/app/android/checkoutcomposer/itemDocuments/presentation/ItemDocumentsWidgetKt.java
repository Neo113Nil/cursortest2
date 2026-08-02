package ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.l;
import Z1.d;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import n0.C8385f;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation.ItemDocumentsVO;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.Spacings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;
import u0.EnumC9909s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0010\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InputDocumentsWidget", "(Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;", "documents", "LZ1/h;", "startPadding", "endPadding", "DocumentsList-T43hY1o", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;FFLS0/k;I)V", "DocumentsList", "document", "Landroidx/compose/ui/e;", "modifier", "DocumentItem", "(Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemDocumentsWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void DocumentItem(ItemDocumentsVO.DocumentVO documentVO, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long graphicNeutral;
        CornerRadius cornerRadius;
        int i13;
        C3969l u11 = interfaceC3967k.u(665400893);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(documentVO) : u11.F(documentVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            AspectDTO aspect = documentVO.getAspect();
            boolean z11 = (aspect != null ? aspect.getState() : null) == AspectDTO.AspectState.SELECTED;
            float px = (z11 ? Spacings.SPACING_2 : Spacings.SPACING_1).getPx();
            if (z11) {
                u11.o(1376414584);
                graphicNeutral = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary();
                u11.k();
            } else {
                u11.o(1376471934);
                graphicNeutral = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral();
                u11.k();
            }
            AspectDTO aspect2 = documentVO.getAspect();
            if (aspect2 == null || (cornerRadius = aspect2.getRadius()) == null) {
                cornerRadius = CornerRadius.RADIUS_500;
            }
            e g10 = T.g(C8385f.c(px, graphicNeutral, a0.r(a0.c(eVar), 230), h.b(cornerRadius.m1866getDpD9Ej5fM())), Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_400.m1867getDpD9Ej5fM());
            u11.o(-371218631);
            boolean z12 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(documentVO))) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ItemDocumentsWidgetKt$DocumentItem$1$1(documentVO, function1);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(g10, null, null, false, null, null, (Function0) C11, 28);
            int i14 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(Paddings.PADDING_200.m1867getDpD9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO text = documentVO.getText();
            u11.o(-1538185713);
            if (text == null) {
                i13 = 2;
            } else {
                i13 = 2;
                DsTextAtomKt.DsTextAtom(text, null, u11, 0, 2);
            }
            u11.k();
            TextDTO subtext = documentVO.getSubtext();
            u11.o(-1538182987);
            if (subtext != null) {
                DsTextAtomKt.DsTextAtom(subtext, null, u11, 0, i13);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemDocumentsWidgetKt$DocumentItem$3(documentVO, function1, eVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DocumentsList-T43hY1o, reason: not valid java name */
    public static final void m567DocumentsListT43hY1o(List<ItemDocumentsVO.DocumentVO> list, Function1<? super AtomAction, Unit> function1, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1017144584);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            d0 b11 = z.b(u11);
            u11.o(-1150753549);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new LinkedHashMap();
                u11.x(C11);
            }
            Map map = (Map) C11;
            u11.k();
            u11.o(-1150751489);
            boolean n11 = u11.n(list);
            Object C12 = u11.C();
            int i13 = 0;
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                Iterator<ItemDocumentsVO.DocumentVO> it = list.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    AspectDTO aspect = it.next().getAspect();
                    if ((aspect != null ? aspect.getState() : null) == AspectDTO.AspectState.SELECTED) {
                        break;
                    } else {
                        i14++;
                    }
                }
                C12 = Integer.valueOf(i14);
                u11.x(C12);
            }
            int intValue = ((Number) C12).intValue();
            u11.k();
            float v12 = ((d) u11.m(K0.e())).v1(f7);
            Integer valueOf = Integer.valueOf(intValue);
            u11.o(-1150743335);
            boolean r11 = u11.r(intValue) | u11.F(map) | u11.n(b11) | u11.q(v12);
            Object C13 = u11.C();
            if (r11 || C13 == InterfaceC3967k.a.a()) {
                Object itemDocumentsWidgetKt$DocumentsList$1$1 = new ItemDocumentsWidgetKt$DocumentsList$1$1(intValue, map, b11, v12, null);
                u11.x(itemDocumentsWidgetKt$DocumentsList$1$1);
                C13 = itemDocumentsWidgetKt$DocumentsList$1$1;
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C13);
            e.a aVar = e.f40358c0;
            e a11 = M.a(z.a(T.j(a0.e(aVar, 1.0f), 0.0f, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), b11), EnumC9909s.Max);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            E.a(u11, a0.r(aVar, f7));
            u11.o(1052061939);
            for (Object obj : list) {
                int i15 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ItemDocumentsVO.DocumentVO documentVO = (ItemDocumentsVO.DocumentVO) obj;
                e.a aVar2 = e.f40358c0;
                u11.o(1469751077);
                boolean F11 = u11.F(map) | u11.r(i13);
                Object C14 = u11.C();
                if (F11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new ItemDocumentsWidgetKt$DocumentsList$2$1$1$1(map, i13);
                    u11.x(C14);
                }
                u11.k();
                DocumentItem(documentVO, function1, androidx.compose.ui.layout.c.a(aVar2, (Function1) C14), u11, AspectDTO.$stable | AtomAction.$stable | (i12 & 112));
                u11.o(1052072841);
                if (i13 != C7714v.P(list)) {
                    E.a(u11, a0.r(aVar2, Paddings.PADDING_300.m1867getDpD9Ej5fM()));
                }
                u11.k();
                i13 = i15;
            }
            u11.k();
            E.a(u11, a0.r(e.f40358c0, f11));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemDocumentsWidgetKt$DocumentsList$3(list, function1, f7, f11, i11));
        }
    }

    public static final void InputDocumentsWidget(@NotNull ItemDocumentsVO state, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        int i13;
        e eVar;
        CommonCellSettings.LayoutPadding bottomPadding;
        Z1.h dp;
        CommonCellSettings.LayoutPadding rightPadding;
        Z1.h dp2;
        CommonCellSettings.LayoutPadding topPadding;
        Z1.h dp3;
        CommonCellSettings.LayoutPadding leftPadding;
        Z1.h dp4;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1814241904);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-767584598);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ItemDocumentsWidgetKt$InputDocumentsWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            float m1867getDpD9Ej5fM = Paddings.PADDING_500.m1867getDpD9Ej5fM();
            ru.ozon.app.android.checkoutgeo.checkout.data.Paddings paddings = state.getPaddings();
            float d11 = (paddings == null || (leftPadding = paddings.getLeftPadding()) == null || (dp4 = CommonCellSettingsKt.getDp(leftPadding)) == null) ? m1867getDpD9Ej5fM : dp4.d();
            ru.ozon.app.android.checkoutgeo.checkout.data.Paddings paddings2 = state.getPaddings();
            float d12 = (paddings2 == null || (topPadding = paddings2.getTopPadding()) == null || (dp3 = CommonCellSettingsKt.getDp(topPadding)) == null) ? m1867getDpD9Ej5fM : dp3.d();
            ru.ozon.app.android.checkoutgeo.checkout.data.Paddings paddings3 = state.getPaddings();
            float d13 = (paddings3 == null || (rightPadding = paddings3.getRightPadding()) == null || (dp2 = CommonCellSettingsKt.getDp(rightPadding)) == null) ? m1867getDpD9Ej5fM : dp2.d();
            ru.ozon.app.android.checkoutgeo.checkout.data.Paddings paddings4 = state.getPaddings();
            if (paddings4 != null && (bottomPadding = paddings4.getBottomPadding()) != null && (dp = CommonCellSettingsKt.getDp(bottomPadding)) != null) {
                m1867getDpD9Ej5fM = dp.d();
            }
            float f7 = m1867getDpD9Ej5fM;
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            e j11 = T.j(b11, 0.0f, d12, 0.0f, f7, 5);
            int i15 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(Paddings.PADDING_300.m1867getDpD9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d14 = u11.d();
            e f11 = c.f(u11, j11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            float f12 = d13;
            e j12 = T.j(GZ.e.c(u11, f11, aVar2, 1.0f), d11, 0.0f, f12, 0.0f, 10);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I12 = u11.I();
            A0 d15 = u11.d();
            e f13 = c.f(u11, j12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d15);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            TextDTO title = state.getTitle();
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(title, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u11, 0, 0);
            IconButtonV3DTO rightIcon = state.getRightIcon();
            u11.o(739195765);
            if (rightIcon == null) {
                i13 = 0;
            } else {
                i13 = 0;
                DsIconButtonAtomKt.DsIconButtonAtom(rightIcon, null, false, function1, u11, IconButtonV3DTO.$stable | ((i14 << 6) & 7168), 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
            TextDTO subtitle = state.getSubtitle();
            u11.o(-927625488);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, j12, u11, i13, i13);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            List<ItemDocumentsVO.DocumentVO> documents = state.getDocuments();
            u11.o(-927619734);
            if (documents != null) {
                m567DocumentsListT43hY1o(documents, function1, d11, f12, u11, i14 & 112);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            CellDTO warning = state.getWarning();
            u11.o(-927611304);
            if (warning == null) {
                actionHandler = function1;
                eVar = j12;
            } else {
                DsCellAtomKt.DsCellAtom(warning, j12, function1, u11, CellDTO.$stable | ((i14 << 3) & 896), 0);
                eVar = j12;
                actionHandler = function1;
                u11 = u11;
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            TextDTO infoText = state.getInfoText();
            u11.o(-927604432);
            if (infoText != null) {
                DsTextAtomKt.DsTextAtom(infoText, eVar, u11, i13, i13);
                Unit unit5 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemDocumentsWidgetKt$InputDocumentsWidget$3(state, actionHandler, i11));
        }
    }
}

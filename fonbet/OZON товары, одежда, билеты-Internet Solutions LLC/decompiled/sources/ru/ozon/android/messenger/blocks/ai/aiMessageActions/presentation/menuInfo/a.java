package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonStyle;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import v0.C10164d;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo.a$a, reason: collision with other inner class name */
    static final class C1457a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextDTO f84040b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f84041c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f84042d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1457a(TextDTO textDTO, Function0<Unit> function0, int i11) {
            super(2);
            this.f84040b = textDTO;
            this.f84041c = function0;
            this.f84042d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f84042d | 1);
            a.a(this.f84040b, this.f84041c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TextDTO textDTO, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1352653682);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e h11 = T.h(e11, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 2);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, h11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            androidx.compose.ui.e j11 = T.j(aVar, dsSpacings.m1853getDp32D9Ej5fM(), dsSpacings.m1848getDp20D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 8);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(textDTO, j11.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), u11, i12 & 14, 0);
            androidx.compose.ui.e j12 = T.j(aVar, 0.0f, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, dsSpacings.m1859getDp6D9Ej5fM(), 5);
            AbstractC8972b a12 = G1.e.a(R$drawable.ic_s_cross_filled, u11, 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            DsIconButtonKt.DsIconButton(a12, new DsIconButtonStyle(uniTheme.getColors(u11, i13).getBgOverlap(), uniTheme.getColors(u11, i13).getGraphicSecondary(), dsSpacings.m1853getDp32D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), null, null, 32, null), A0.h.e(), j12, null, false, null, false, null, function0, u11, (i12 << 24) & 1879048192, 496);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C1457a(textDTO, function0, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, @NotNull AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, @NotNull Function2 onMenuItemClick, @NotNull Function1 onMenuItemViewEvent, @NotNull Function0 onClose, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(menuInfo, "menuInfo");
        Intrinsics.checkNotNullParameter(onMenuItemClick, "onMenuItemClick");
        Intrinsics.checkNotNullParameter(onMenuItemViewEvent, "onMenuItemViewEvent");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        C3969l u11 = interfaceC3967k.u(-381082745);
        int i12 = i11 | (u11.n(eVar) ? 4 : 2) | (u11.n(menuInfo) ? 32 : 16) | (u11.F(onMenuItemClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onMenuItemViewEvent) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onClose) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            a(menuInfo.getTitle(), onClose, u11, (i12 >> 9) & 112);
            u11.o(-1674446113);
            boolean F11 = u11.F(menuInfo) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new e(menuInfo, onMenuItemClick, onMenuItemViewEvent);
                u11.x(C11);
            }
            u11.k();
            C10164d.a(null, null, null, null, null, null, false, (Function1) C11, u11, 0, 255);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(eVar, menuInfo, onMenuItemClick, onMenuItemViewEvent, onClose, i11));
        }
    }

    public static final void d(AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem, boolean z11, Function2 function2, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(-100282094);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(menuItem) : u11.F(menuItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-1951726516);
            boolean F11 = ((i12 & 7168) == 2048) | u11.F(menuItem);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(function1, menuItem);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            u11.o(-1951722835);
            boolean F12 = u11.F(menuItem) | ((i12 & 896) == 256);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new h(function2, menuItem);
                u11.x(C12);
            }
            u11.k();
            androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(aVar2, false, null, null, (Function0) C12, 7);
            TestInfo testInfo = menuItem.getTestInfo();
            if (testInfo != null) {
                c11 = c11.l0(Q1.a(aVar2, testInfo.getAutomatizationId()));
            }
            androidx.compose.ui.e eVar = c11;
            CellDTO.CellText cellText = new CellDTO.CellText(menuItem.getTitle().getText(), menuItem.getTitle().getTextColor(), menuItem.getTitle().getTypographyToken(), false, menuItem.getTitle().getMaxLines(), menuItem.getTitle().getTruncatingMode(), 8, null);
            TextDTO subtitle = menuItem.getSubtitle();
            CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(cellText, subtitle != null ? new CellDTO.CellText(subtitle.getText(), subtitle.getTextColor(), subtitle.getTypographyToken(), false, subtitle.getMaxLines(), subtitle.getTruncatingMode(), 8, null) : null, null, null, null, null, 60, null);
            IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
            IconDTO.IconShape iconShape = IconDTO.IconShape.SHAPE_NONE;
            UniTheme uniTheme = UniTheme.INSTANCE;
            CellDTO.RightBlock rightBlock = new CellDTO.RightBlock(null, null, null, null, null, null, null, new IconDTO(iconSize, null, iconShape, null, new CommonAtomIconDTO(uniTheme.getIconTokens().getIc_m_chevron_right_filled().getId(), uniTheme.getColorTokens().getGraphicTertiary().getId()), null, null, null, null, null, null, null, null, null, null, null, 65514, null), null, null, null, null, 3967, null);
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_350;
            DsCellAtomKt.DsCellAtom(new CellDTO(centerBlock, new CellDTO.Settings(layoutPadding2, layoutPadding2, layoutPadding, layoutPadding, Boolean.valueOf(z12), null, null, null, null, null, null, 2016, null), null, rightBlock, null, 20, null), eVar, null, u11, CellDTO.$stable, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new i(menuItem, z12, function2, function1, i11));
        }
    }
}

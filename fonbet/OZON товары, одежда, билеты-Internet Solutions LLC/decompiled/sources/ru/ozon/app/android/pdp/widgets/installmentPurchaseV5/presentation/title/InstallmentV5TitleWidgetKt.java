package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.title;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "InstallmentPurchaseV5TitleWidget", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/compose/ui/e;", "modifier", "InstallmentPurchaseTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "InstallmentPurchaseTitleWithBadge", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5TitleWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstallmentPurchaseTitle(TextDTO textDTO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1488974862);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            DsTextAtomKt.DsTextAtom(textDTO, eVar, u11, i13 & 126, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5TitleWidgetKt$InstallmentPurchaseTitle$1(textDTO, eVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentPurchaseTitleWithBadge(TextDTO textDTO, BadgeDTO badgeDTO, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        BadgeDTO badgeDTO2;
        int i14;
        e eVar2;
        Function1<? super AtomAction, Unit> function12;
        e eVar3;
        int I11;
        C3969l u11 = interfaceC3967k.u(1812857852);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            badgeDTO2 = badgeDTO;
            i13 |= u11.n(badgeDTO2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i11 & 3072) == 0) {
                        i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    }
                }
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
                    Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, eVar3);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, h11);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    e.a aVar = e.f40358c0;
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                    }
                    DsTextAtomKt.DsTextAtom(textDTO, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u11, i13 & 14, 0);
                    DsBadgeAtomKt.DsBadgeAtom(badgeDTO2, T.j(aVar, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14), function12, u11, (i13 >> 3) & 910, 0);
                    u11.f();
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InstallmentV5TitleWidgetKt$InstallmentPurchaseTitleWithBadge$2(textDTO, badgeDTO, eVar3, function1, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i12 & 8) != 0) {
            }
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            Y b112 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, eVar3);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h112);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            e.a aVar2 = e.f40358c0;
            if (1.0f <= 0.0d) {
            }
        }
        badgeDTO2 = badgeDTO;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i12 & 8) != 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        Y b1122 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, eVar3);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h1122);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        e.a aVar22 = e.f40358c0;
        if (1.0f <= 0.0d) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentPurchaseV5TitleWidget(@NotNull InstallmentPurchaseV5VO.Title state, Function1<? super t, Unit> function1, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        Unit unit;
        t tokenizedEvent;
        e b11;
        boolean z11;
        Object C11;
        String automatizationId;
        BadgeDTO badge;
        TestInfo testInfo;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1998961860);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 != 0) {
                    u11.o(-1065551068);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = InstallmentV5TitleWidgetKt$InstallmentPurchaseV5TitleWidget$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    u11.k();
                    function12 = (Function1) C12;
                }
                InstallmentPurchaseV5VO.CommonVO common = state.getCommon();
                unit = null;
                tokenizedEvent = common == null ? common.getTokenizedEvent() : null;
                u11.o(-1065548312);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-157254557);
                    boolean F11 = ((i13 & 112) == 32) | u11.F(tokenizedEvent);
                    Object C13 = u11.C();
                    if (F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new InstallmentV5TitleWidgetKt$InstallmentPurchaseV5TitleWidget$2$1$1(function12, tokenizedEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C13, u11, 6);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                C7807Z c7807z = TokenParserKt.tokenToColor(state.getBackground(), u11, 0);
                u11.o(-1065544192);
                long layerFloor1 = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                u11.k();
                b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
                float m1867getDpD9Ej5fM = state.getTopPadding().m1867getDpD9Ej5fM();
                Paddings paddings = Paddings.PADDING_500;
                e j11 = T.j(b11, paddings.m1867getDpD9Ej5fM(), m1867getDpD9Ej5fM, paddings.m1867getDpD9Ej5fM(), 0.0f, 8);
                u11.o(-1065533206);
                z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new InstallmentV5TitleWidgetKt$InstallmentPurchaseV5TitleWidget$rootModifier$1$1(state, actionHandler);
                    u11.x(C11);
                }
                u11.k();
                e b12 = androidx.compose.foundation.i.b(j11, null, null, false, null, null, (Function0) C11, 28);
                InstallmentPurchaseV5VO.CommonVO common2 = state.getCommon();
                automatizationId = (common2 != null || (testInfo = common2.getTestInfo()) == null) ? null : testInfo.getAutomatizationId();
                if (automatizationId == null) {
                    automatizationId = "";
                }
                e a11 = Q1.a(b12, automatizationId);
                badge = state.getBadge();
                u11.o(-1065527948);
                if (badge != null) {
                    InstallmentPurchaseTitleWithBadge(state.getTitle(), state.getBadge(), a11, actionHandler, u11, (i13 << 3) & 7168, 0);
                    unit = Unit.f71690a;
                }
                u11.k();
                if (unit == null) {
                    InstallmentPurchaseTitle(state.getTitle(), a11, u11, 0, 0);
                }
            } else {
                u11.j();
            }
            Function1<? super t, Unit> function13 = function12;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new InstallmentV5TitleWidgetKt$InstallmentPurchaseV5TitleWidget$4(state, function13, actionHandler, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        InstallmentPurchaseV5VO.CommonVO common3 = state.getCommon();
        unit = null;
        if (common3 == null) {
        }
        u11.o(-1065548312);
        if (tokenizedEvent != null) {
        }
        u11.k();
        C7807Z c7807z2 = TokenParserKt.tokenToColor(state.getBackground(), u11, 0);
        u11.o(-1065544192);
        if (c7807z2 != null) {
        }
        u11.k();
        b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
        float m1867getDpD9Ej5fM2 = state.getTopPadding().m1867getDpD9Ej5fM();
        Paddings paddings2 = Paddings.PADDING_500;
        e j112 = T.j(b11, paddings2.m1867getDpD9Ej5fM(), m1867getDpD9Ej5fM2, paddings2.m1867getDpD9Ej5fM(), 0.0f, 8);
        u11.o(-1065533206);
        z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new InstallmentV5TitleWidgetKt$InstallmentPurchaseV5TitleWidget$rootModifier$1$1(state, actionHandler);
        u11.x(C11);
        u11.k();
        e b122 = androidx.compose.foundation.i.b(j112, null, null, false, null, null, (Function0) C11, 28);
        InstallmentPurchaseV5VO.CommonVO common22 = state.getCommon();
        if (common22 != null) {
        }
        if (automatizationId == null) {
        }
        e a112 = Q1.a(b122, automatizationId);
        badge = state.getBadge();
        u11.o(-1065527948);
        if (badge != null) {
        }
        u11.k();
        if (unit == null) {
        }
        Function1<? super t, Unit> function132 = function12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}

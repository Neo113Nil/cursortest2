package ru.ozon.app.android.partnerBanks.presentation.compose;

import D1.InterfaceC2801g;
import Ej.b;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import WZ.l;
import WZ.t;
import Z1.h;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "state", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "PartnersBanksWidget", "(Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "PartnersBanksContent", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartnersBanksWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PartnersBanksContent(PartnerBanksVO partnerBanksVO, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        boolean z11;
        Object C11;
        TestInfo testInfo;
        int I11;
        TextDTO title;
        List<PartnerBanksDTO.BankIcon> icons;
        Function1<? super AtomAction, Unit> function14;
        String image;
        String a11;
        BadgeDTO badge;
        Function1<? super AtomAction, Unit> function15;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1692156413);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(partnerBanksVO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            if ((i11 & 48) == 0) {
                i13 |= u11.n(eVar2) ? 32 : 16;
            }
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 == 0) {
                    u11.o(648935909);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = PartnersBanksWidgetKt$PartnersBanksContent$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    function13 = (Function1) C12;
                    u11.k();
                } else {
                    function13 = function12;
                }
                boolean z12 = partnerBanksVO.getAction() == null;
                u11.o(648942630);
                z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new PartnersBanksWidgetKt$PartnersBanksContent$2$1(partnerBanksVO, function13);
                    u11.x(C11);
                }
                u11.k();
                e b11 = i.b(eVar2, null, null, z12, null, null, (Function0) C11, 24);
                testInfo = partnerBanksVO.getTestInfo();
                if (testInfo != null || (r2 = testInfo.getAutomatizationId()) == null) {
                    String str = "PartnersBankView";
                }
                e a12 = Q1.a(b11, str);
                Y b12 = X.b(C5179b.n(2), InterfaceC6250b.a.i(), u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, a12);
                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 h11 = Cm.e.h(u11, b12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                title = partnerBanksVO.getTitle();
                u11.o(1650683436);
                if (title != null) {
                    DsTextAtomKt.DsTextAtom(title, null, u11, 0, 2);
                }
                u11.k();
                icons = partnerBanksVO.getIcons();
                u11.o(1650686541);
                if (icons != null) {
                    function14 = function13;
                } else {
                    int iconsSize = partnerBanksVO.getIconsSize();
                    u11.o(703687021);
                    boolean r11 = u11.r(iconsSize);
                    Object C13 = u11.C();
                    if (r11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = h.a(partnerBanksVO.getIconsSize());
                        u11.x(C13);
                    }
                    float d12 = ((h) C13).d();
                    u11.k();
                    int iconsPadding = partnerBanksVO.getIconsPadding();
                    u11.o(703690483);
                    boolean r12 = u11.r(iconsPadding);
                    Object C14 = u11.C();
                    if (r12 || C14 == InterfaceC3967k.a.a()) {
                        C14 = h.a(partnerBanksVO.getIconsPadding());
                        u11.x(C14);
                    }
                    float d13 = ((h) C14).d();
                    u11.k();
                    u11.o(1650693971);
                    int i15 = 0;
                    for (Object obj : icons) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        PartnerBanksDTO.BankIcon bankIcon = (PartnerBanksDTO.BankIcon) obj;
                        e o11 = bankIcon.getCustomIconSize() != null ? a0.o(e.f40358c0, r6.getWidth(), r6.getHeigh()) : T.f(a0.n(e.f40358c0, d12), d13);
                        if (!p.a(u11) || (image = bankIcon.getDarkImage()) == null) {
                            image = bankIcon.getImage();
                        }
                        Function1<? super AtomAction, Unit> function16 = function13;
                        e eVar3 = o11;
                        C3969l c3969l = u11;
                        PikazonImagePainter a14 = f.a(image, null, null, null, c3969l, 0, 14);
                        TestInfo testInfo2 = bankIcon.getTestInfo();
                        if (testInfo2 == null || (a11 = testInfo2.getAutomatizationId()) == null) {
                            a11 = b.a(i15, "PartnerBanksIcon_");
                        }
                        u11 = c3969l;
                        C8366G.a(a14, null, Q1.a(eVar3, a11), null, null, 0.0f, null, u11, 48, 120);
                        i15 = i16;
                        function13 = function16;
                    }
                    function14 = function13;
                    u11.k();
                }
                u11.k();
                badge = partnerBanksVO.getBadge();
                u11.o(1650721389);
                if (badge != null) {
                    DsBadgeAtomKt.DsBadgeAtom(badge, null, null, u11, 0, 6);
                }
                u11.k();
                u11.f();
                function15 = function14;
            } else {
                u11.j();
                function15 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new PartnersBanksWidgetKt$PartnersBanksContent$4(partnerBanksVO, eVar, function15, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        if (partnerBanksVO.getAction() == null) {
        }
        u11.o(648942630);
        z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new PartnersBanksWidgetKt$PartnersBanksContent$2$1(partnerBanksVO, function13);
        u11.x(C11);
        u11.k();
        e b112 = i.b(eVar2, null, null, z12, null, null, (Function0) C11, 24);
        testInfo = partnerBanksVO.getTestInfo();
        if (testInfo != null) {
        }
        String str2 = "PartnersBankView";
        e a122 = Q1.a(b112, str2);
        Y b122 = X.b(C5179b.n(2), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, a122);
        Function0 a132 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b122, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        title = partnerBanksVO.getTitle();
        u11.o(1650683436);
        if (title != null) {
        }
        u11.k();
        icons = partnerBanksVO.getIcons();
        u11.o(1650686541);
        if (icons != null) {
        }
        u11.k();
        badge = partnerBanksVO.getBadge();
        u11.o(1650721389);
        if (badge != null) {
        }
        u11.k();
        u11.f();
        function15 = function14;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void PartnersBanksWidget(@NotNull PartnerBanksVO state, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        PartnerBanksVO partnerBanksVO;
        e eVar2;
        Function1<? super AtomAction, Unit> function12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-417187236);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = 4 & i12;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = function1;
            eVar2 = eVar;
            partnerBanksVO = state;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            if (i15 != 0) {
                u11.o(-1780728420);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = PartnersBanksWidgetKt$PartnersBanksWidget$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            Function1<? super AtomAction, Unit> function13 = function1;
            l lVar = (l) u11.m(b00.f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-1780725218);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(2138778777);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new PartnersBanksWidgetKt$PartnersBanksWidget$2$1$1(lVar, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            PartnersBanksContent(state, eVar3, function13, u11, i13 & 1022, 0);
            partnerBanksVO = state;
            eVar2 = eVar3;
            function12 = function13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PartnersBanksWidgetKt$PartnersBanksWidget$3(partnerBanksVO, eVar2, function12, i11, i12));
        }
    }
}

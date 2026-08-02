package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

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
import WZ.t;
import Z1.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.CustomTextAtomKt;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.compose.MorkovskCurrencyBadgeKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;", "banner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "LotteryBanner", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "", "imagePath", "BannerImage", "(Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryBannerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BannerImage(String str, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        String str2;
        C3969l u11 = interfaceC3967k.u(-1525215799);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(str) ? 4 : 2) | i11;
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
            str2 = str;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            j11 = C7807Z.f72255i;
            str2 = str;
            Ag0.e.a(str2, C5182e.a(a0.e(PreviewKt.m942previewBackgroundRPmYEkk(eVar, j11, u11, ((i13 >> 3) & 14) | 48), 1.0f), 3.41f, false), null, null, null, 0.0f, null, u11, (i13 & 14) | 3072, 244);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryBannerKt$BannerImage$1(str2, eVar, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LotteryBanner(@NotNull LotteryInformationVI.Banner banner, @NotNull Function1<? super AtomAction, Unit> actionHandler, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        t tokenizedEvent;
        int I11;
        int I12;
        J0 m02;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1562350763);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(banner) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i13;
            if ((i14 & 147) == 146 || !u11.b()) {
                e eVar3 = i15 == 0 ? e.f40358c0 : eVar2;
                tokenizedEvent = banner.getTokenizedEvent();
                u11.o(-1800870337);
                if (tokenizedEvent != null) {
                    AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, eVar3);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                String imagePath = banner.getImagePath();
                e.a aVar = e.f40358c0;
                BannerImage(imagePath, T.j(c5187j.a(aVar, InterfaceC6250b.a.m()), 0.0f, 0.0f, 0.0f, ((d) u11.m(K0.e())).u1() * 14, 7), u11, 0, 0);
                e a12 = c5187j.a(aVar, InterfaceC6250b.a.b());
                Y b11 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, a12);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h11);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                u11.o(-1282853486);
                if (banner.getSubtitle() != null) {
                    CustomTextAtomKt.CustomTextAtom(banner.getSubtitle(), RegularDrawTypographyKt.getText_12_14_W500(), null, u11, 0, 4);
                }
                u11.k();
                u11.o(-1282847076);
                if (banner.getTicketsAmount() != null) {
                    MorkovskCurrencyBadgeVO ticketsAmount = banner.getTicketsAmount();
                    u11.o(-1282842304);
                    boolean z11 = (i14 & 112) == 32;
                    Object C11 = u11.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new LotteryBannerKt$LotteryBanner$2$1$1$1(actionHandler);
                        u11.x(C11);
                    }
                    u11.k();
                    MorkovskCurrencyBadgeKt.MorkovskCurrencyBadge(ticketsAmount, null, (Function1) C11, u11, AtomAction.$stable, 2);
                }
                u11.k();
                u11.f();
                u11.f();
                eVar2 = eVar3;
            } else {
                u11.j();
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new LotteryBannerKt$LotteryBanner$3(banner, actionHandler, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 147) == 146) {
        }
        if (i15 == 0) {
        }
        tokenizedEvent = banner.getTokenizedEvent();
        u11.o(-1800870337);
        if (tokenizedEvent != null) {
        }
        u11.k();
        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, eVar3);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        String imagePath2 = banner.getImagePath();
        e.a aVar2 = e.f40358c0;
        BannerImage(imagePath2, T.j(c5187j2.a(aVar2, InterfaceC6250b.a.m()), 0.0f, 0.0f, 0.0f, ((d) u11.m(K0.e())).u1() * 14, 7), u11, 0, 0);
        e a122 = c5187j2.a(aVar2, InterfaceC6250b.a.b());
        Y b112 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f132 = c.f(u11, a122);
        Function0 a132 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h112);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        u11.o(-1282853486);
        if (banner.getSubtitle() != null) {
        }
        u11.k();
        u11.o(-1282847076);
        if (banner.getTicketsAmount() != null) {
        }
        u11.k();
        u11.f();
        u11.f();
        eVar2 = eVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}

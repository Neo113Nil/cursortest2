package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import J0.u3;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import U7.i;
import WZ.t;
import Z1.d;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import l1.C7807Z;
import n1.C8416i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.CustomBadgeAtomKt;
import ru.ozon.app.android.regulardraw.ui.CustomTextAtomKt;
import ru.ozon.app.android.regulardraw.ui.FontScaleKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import u0.C9896e;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo;", "mainInfo", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "LotteryActiveMainInfo", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;", "items", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LeftInfoBlock", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "item", "LeftInfoBlockItem", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryActiveMainInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[LOOP:0: B:36:0x00e6->B:38:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LeftInfoBlock(List<LotteryInformationVI.ActiveMainInfo.Item> list, BadgeDTO badgeDTO, Function1<? super b, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        BadgeDTO badgeDTO2;
        Function1<? super b, Unit> function12;
        int i14;
        e eVar2;
        int I11;
        Iterator<T> it;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-2005979703);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            badgeDTO2 = badgeDTO;
            i13 |= u11.n(badgeDTO2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i11 & 384) == 0) {
                    i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    C5194q a11 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), u11, 6);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, eVar4);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = K00.b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    i.b(u11, f7, 624711547);
                    it = list.iterator();
                    while (it.hasNext()) {
                        LeftInfoBlockItem((LotteryInformationVI.ActiveMainInfo.Item) it.next(), null, u11, 0, 2);
                    }
                    u11.k();
                    float f11 = 1;
                    CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO2, T.j(e.f40358c0, 0.0f, 4, 0.0f, 0.0f, 13), null, RegularDrawTypographyKt.getText_12_14_W600(), T.b(3, f11, 0.0f, f11, 4), 7, function12, u11, ((i13 >> 3) & 14) | 196656 | ((i13 << 12) & 3670016), 4);
                    u11.f();
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new LotteryActiveMainInfoKt$LeftInfoBlock$2(list, badgeDTO, function1, eVar3, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            C5194q a112 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), u11, 6);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, eVar4);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = K00.b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            i.b(u11, f72, 624711547);
            it = list.iterator();
            while (it.hasNext()) {
            }
            u11.k();
            float f112 = 1;
            CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO2, T.j(e.f40358c0, 0.0f, 4, 0.0f, 0.0f, 13), null, RegularDrawTypographyKt.getText_12_14_W600(), T.b(3, f112, 0.0f, f112, 4), 7, function12, u11, ((i13 >> 3) & 14) | 196656 | ((i13 << 12) & 3670016), 4);
            u11.f();
            eVar3 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        badgeDTO2 = badgeDTO;
        if ((i12 & 4) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        C5194q a1122 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, eVar4);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = K00.b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        i.b(u11, f722, 624711547);
        it = list.iterator();
        while (it.hasNext()) {
        }
        u11.k();
        float f1122 = 1;
        CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO2, T.j(e.f40358c0, 0.0f, 4, 0.0f, 0.0f, 13), null, RegularDrawTypographyKt.getText_12_14_W600(), T.b(3, f1122, 0.0f, f1122, 4), 7, function12, u11, ((i13 >> 3) & 14) | 196656 | ((i13 << 12) & 3670016), 4);
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LeftInfoBlockItem(LotteryInformationVI.ActiveMainInfo.Item item, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        t tokenizedEvent;
        int I11;
        int I12;
        Object C11;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1939599346);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                tokenizedEvent = item.getTokenizedEvent();
                u11.o(949525013);
                if (tokenizedEvent != null) {
                    AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                C5194q a11 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, eVar3);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = K00.b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                CustomTextAtomKt.CustomTextAtom(item.getTitle(), RegularDrawTypographyKt.getText_12_14_W500(), null, u11, 0, 4);
                e.a aVar = e.f40358c0;
                e i15 = a0.i(aVar, 24);
                V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f12 = c.f(u11, i15);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 f13 = E.f(u11, f11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                EnumC9909s enumC9909s = EnumC9909s.Min;
                e b11 = M.b(aVar, enumC9909s);
                u11.o(-1680799645);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = LotteryActiveMainInfoKt$LeftInfoBlockItem$2$1$1$1.INSTANCE;
                    u11.x(C11);
                }
                u11.k();
                c3969l = u11;
                u3.b(item.getSubtitle(), o.c(b11, false, (Function1) C11), G1.b.a(u11, R$color.lottery_information_main_info_item_outline_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, K1.T.c(RegularDrawTypographyKt.getText_24_24_W800(), 0L, 0L, null, null, null, 0L, null, new C8416i(((d) u11.m(K0.e())).v1((float) 2.6d), 0.0f, 0, 0, null, 30), 0L, null, null, 16760831), c3969l, 0, 0, 65528);
                u3.b(item.getSubtitle(), M.b(aVar, enumC9909s), G1.b.a(c3969l, R$color.lottery_information_main_info_item_subtitle_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_24_24_W800(), c3969l, 48, 0, 65528);
                c3969l.f();
                c3969l.f();
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new LotteryActiveMainInfoKt$LeftInfoBlockItem$3(item, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        tokenizedEvent = item.getTokenizedEvent();
        u11.o(949525013);
        if (tokenizedEvent != null) {
        }
        u11.k();
        C5194q a112 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, eVar3);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = K00.b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        CustomTextAtomKt.CustomTextAtom(item.getTitle(), RegularDrawTypographyKt.getText_12_14_W500(), null, u11, 0, 4);
        e.a aVar2 = e.f40358c0;
        e i152 = a0.i(aVar2, 24);
        V f112 = C5185h.f(InterfaceC6250b.a.e(), false);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f122 = c.f(u11, i152);
        Function0 a132 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        EnumC9909s enumC9909s2 = EnumC9909s.Min;
        e b112 = M.b(aVar2, enumC9909s2);
        u11.o(-1680799645);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        c3969l = u11;
        u3.b(item.getSubtitle(), o.c(b112, false, (Function1) C11), G1.b.a(u11, R$color.lottery_information_main_info_item_outline_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, K1.T.c(RegularDrawTypographyKt.getText_24_24_W800(), 0L, 0L, null, null, null, 0L, null, new C8416i(((d) u11.m(K0.e())).v1((float) 2.6d), 0.0f, 0, 0, null, 30), 0L, null, null, 16760831), c3969l, 0, 0, 65528);
        u3.b(item.getSubtitle(), M.b(aVar2, enumC9909s2), G1.b.a(c3969l, R$color.lottery_information_main_info_item_subtitle_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_24_24_W800(), c3969l, 48, 0, 65528);
        c3969l.f();
        c3969l.f();
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LotteryActiveMainInfo(@NotNull LotteryInformationVI.ActiveMainInfo mainInfo, e eVar, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super b, Unit> function12;
        Function1<? super b, Unit> function13;
        t tokenizedEvent;
        boolean z11;
        Object C11;
        int I11;
        long j11;
        e eVar3;
        int I12;
        LotteryInformationVI.ActiveMainInfo activeMainInfo;
        int I13;
        J0 m02;
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        C3969l u11 = interfaceC3967k.u(891857648);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(mainInfo) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(1612395933);
                        Object C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = LotteryActiveMainInfoKt$LotteryActiveMainInfo$1$1.INSTANCE;
                            u11.x(C12);
                        }
                        function13 = (Function1) C12;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    tokenizedEvent = mainInfo.getTokenizedEvent();
                    u11.o(1612397152);
                    if (tokenizedEvent != null) {
                        AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                        Unit unit = Unit.f71690a;
                    }
                    u11.k();
                    e e11 = a0.e(a0.t(eVar4, 0.0f, 482, 1), 1.0f);
                    EnumC9909s enumC9909s = EnumC9909s.Min;
                    e a11 = M.a(e11, enumC9909s);
                    u11.o(1612405030);
                    boolean z12 = (i13 & 14) == 4;
                    int i16 = i13 & 896;
                    z11 = z12 | (i16 == 256);
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new LotteryActiveMainInfoKt$LotteryActiveMainInfo$3$1(mainInfo, function13);
                        u11.x(C11);
                    }
                    u11.k();
                    e b11 = androidx.compose.foundation.i.b(a11, null, null, false, null, null, (Function0) C11, 28);
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, b11);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    C5187j c5187j = C5187j.f39515a;
                    e.a aVar = e.f40358c0;
                    e j12 = T.j(aVar, 113, 0.0f, 0.0f, 0.0f, 14);
                    j11 = C7807Z.f72253g;
                    e a13 = C5182e.a(c5187j.a(a0.e(PreviewKt.m942previewBackgroundRPmYEkk(j12, j11, u11, 54), 1.0f), InterfaceC6250b.a.n()), 1.0f, false);
                    Function1<? super b, Unit> function14 = function13;
                    eVar3 = eVar4;
                    Ag0.e.a(mainInfo.getImagePath(), a13, null, null, null, 0.0f, null, u11, 3072, 244);
                    e e12 = a0.e(aVar, 1.0f);
                    C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I12 = u11.I();
                    A0 d12 = u11.d();
                    e f13 = c.f(u11, e12);
                    Function0 a15 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a15);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = K00.b.g(u11, a14, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, g10);
                    }
                    F1.b(u11, f13, InterfaceC2801g.a.f());
                    C9896e c9896e = C9896e.f99653a;
                    if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp > 420) {
                        u11.o(1875428974);
                        u0.E.a(u11, c9896e.a(aVar, true));
                        u11.k();
                    } else {
                        u11.o(1875493547);
                        u0.E.a(u11, a0.f(aVar, 16));
                        u11.k();
                    }
                    activeMainInfo = mainInfo;
                    FontScaleKt.FixedFontScale(0.0f, a1.c.c(-263681185, new LotteryActiveMainInfoKt$LotteryActiveMainInfo$4$1$1(activeMainInfo, function14), u11), u11, 48, 1);
                    e l02 = T.j(c9896e.a(M.a(a0.e(a0.t(aVar, 0.0f, 334, 1), 1.0f), enumC9909s), true), 0.0f, 0.0f, 0.0f, h.f(((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp - 340, new IntRange(0, 16, 1)), 7).l0(new HorizontalAlignElement(InterfaceC6250b.a.g()));
                    C5194q a16 = C5193p.a(C5179b.a(), InterfaceC6250b.a.k(), u11, 6);
                    I13 = u11.I();
                    A0 d13 = u11.d();
                    e f14 = c.f(u11, l02);
                    Function0 a17 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a17);
                    } else {
                        u11.e();
                    }
                    Function2 g11 = K00.b.g(u11, a16, u11, d13);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                        a.d(I13, u11, I13, g11);
                    }
                    F1.b(u11, f14, InterfaceC2801g.a.f());
                    u0.E.a(u11, a0.h(c9896e.a(aVar, true), 20, 0.0f, 2));
                    LotteryTicketsPurchaseTimerKt.TicketsPurchaseTimer(activeMainInfo.getTicketsPurchaseTimerData(), a0.e(aVar, 1.0f), function14, u11, i16 | 48, 0);
                    function12 = function14;
                    u11.f();
                    u11.f();
                    u11.f();
                } else {
                    u11.j();
                    activeMainInfo = mainInfo;
                    eVar3 = eVar2;
                }
                Function1<? super b, Unit> function15 = function12;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new LotteryActiveMainInfoKt$LotteryActiveMainInfo$5(activeMainInfo, eVar3, function15, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            tokenizedEvent = mainInfo.getTokenizedEvent();
            u11.o(1612397152);
            if (tokenizedEvent != null) {
            }
            u11.k();
            e e112 = a0.e(a0.t(eVar4, 0.0f, 482, 1), 1.0f);
            EnumC9909s enumC9909s2 = EnumC9909s.Min;
            e a112 = M.a(e112, enumC9909s2);
            u11.o(1612405030);
            if ((i13 & 14) == 4) {
            }
            int i162 = i13 & 896;
            z11 = z12 | (i162 == 256);
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new LotteryActiveMainInfoKt$LotteryActiveMainInfo$3$1(mainInfo, function13);
            u11.x(C11);
            u11.k();
            e b112 = androidx.compose.foundation.i.b(a112, null, null, false, null, null, (Function0) C11, 28);
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, b112);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            e.a aVar2 = e.f40358c0;
            e j122 = T.j(aVar2, 113, 0.0f, 0.0f, 0.0f, 14);
            j11 = C7807Z.f72253g;
            e a132 = C5182e.a(c5187j2.a(a0.e(PreviewKt.m942previewBackgroundRPmYEkk(j122, j11, u11, 54), 1.0f), InterfaceC6250b.a.n()), 1.0f, false);
            Function1<? super b, Unit> function142 = function13;
            eVar3 = eVar4;
            Ag0.e.a(mainInfo.getImagePath(), a132, null, null, null, 0.0f, null, u11, 3072, 244);
            e e122 = a0.e(aVar2, 1.0f);
            C5194q a142 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f132 = c.f(u11, e122);
            Function0 a152 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g102 = K00.b.g(u11, a142, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, g102);
            F1.b(u11, f132, InterfaceC2801g.a.f());
            C9896e c9896e2 = C9896e.f99653a;
            if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp > 420) {
            }
            activeMainInfo = mainInfo;
            FontScaleKt.FixedFontScale(0.0f, a1.c.c(-263681185, new LotteryActiveMainInfoKt$LotteryActiveMainInfo$4$1$1(activeMainInfo, function142), u11), u11, 48, 1);
            e l022 = T.j(c9896e2.a(M.a(a0.e(a0.t(aVar2, 0.0f, 334, 1), 1.0f), enumC9909s2), true), 0.0f, 0.0f, 0.0f, h.f(((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp - 340, new IntRange(0, 16, 1)), 7).l0(new HorizontalAlignElement(InterfaceC6250b.a.g()));
            C5194q a162 = C5193p.a(C5179b.a(), InterfaceC6250b.a.k(), u11, 6);
            I13 = u11.I();
            A0 d132 = u11.d();
            e f142 = c.f(u11, l022);
            Function0 a172 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g112 = K00.b.g(u11, a162, u11, d132);
            if (!u11.t()) {
            }
            a.d(I13, u11, I13, g112);
            F1.b(u11, f142, InterfaceC2801g.a.f());
            u0.E.a(u11, a0.h(c9896e2.a(aVar2, true), 20, 0.0f, 2));
            LotteryTicketsPurchaseTimerKt.TicketsPurchaseTimer(activeMainInfo.getTicketsPurchaseTimerData(), a0.e(aVar2, 1.0f), function142, u11, i162 | 48, 0);
            function12 = function142;
            u11.f();
            u11.f();
            u11.f();
            Function1<? super b, Unit> function152 = function12;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        tokenizedEvent = mainInfo.getTokenizedEvent();
        u11.o(1612397152);
        if (tokenizedEvent != null) {
        }
        u11.k();
        e e1122 = a0.e(a0.t(eVar4, 0.0f, 482, 1), 1.0f);
        EnumC9909s enumC9909s22 = EnumC9909s.Min;
        e a1122 = M.a(e1122, enumC9909s22);
        u11.o(1612405030);
        if ((i13 & 14) == 4) {
        }
        int i1622 = i13 & 896;
        z11 = z12 | (i1622 == 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new LotteryActiveMainInfoKt$LotteryActiveMainInfo$3$1(mainInfo, function13);
        u11.x(C11);
        u11.k();
        e b1122 = androidx.compose.foundation.i.b(a1122, null, null, false, null, null, (Function0) C11, 28);
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, b1122);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        C5187j c5187j22 = C5187j.f39515a;
        e.a aVar22 = e.f40358c0;
        e j1222 = T.j(aVar22, 113, 0.0f, 0.0f, 0.0f, 14);
        j11 = C7807Z.f72253g;
        e a1322 = C5182e.a(c5187j22.a(a0.e(PreviewKt.m942previewBackgroundRPmYEkk(j1222, j11, u11, 54), 1.0f), InterfaceC6250b.a.n()), 1.0f, false);
        Function1<? super b, Unit> function1422 = function13;
        eVar3 = eVar4;
        Ag0.e.a(mainInfo.getImagePath(), a1322, null, null, null, 0.0f, null, u11, 3072, 244);
        e e1222 = a0.e(aVar22, 1.0f);
        C5194q a1422 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I12 = u11.I();
        A0 d1222 = u11.d();
        e f1322 = c.f(u11, e1222);
        Function0 a1522 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g1022 = K00.b.g(u11, a1422, u11, d1222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g1022);
        F1.b(u11, f1322, InterfaceC2801g.a.f());
        C9896e c9896e22 = C9896e.f99653a;
        if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp > 420) {
        }
        activeMainInfo = mainInfo;
        FontScaleKt.FixedFontScale(0.0f, a1.c.c(-263681185, new LotteryActiveMainInfoKt$LotteryActiveMainInfo$4$1$1(activeMainInfo, function1422), u11), u11, 48, 1);
        e l0222 = T.j(c9896e22.a(M.a(a0.e(a0.t(aVar22, 0.0f, 334, 1), 1.0f), enumC9909s22), true), 0.0f, 0.0f, 0.0f, h.f(((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp - 340, new IntRange(0, 16, 1)), 7).l0(new HorizontalAlignElement(InterfaceC6250b.a.g()));
        C5194q a1622 = C5193p.a(C5179b.a(), InterfaceC6250b.a.k(), u11, 6);
        I13 = u11.I();
        A0 d1322 = u11.d();
        e f1422 = c.f(u11, l0222);
        Function0 a1722 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g1122 = K00.b.g(u11, a1622, u11, d1322);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, g1122);
        F1.b(u11, f1422, InterfaceC2801g.a.f());
        u0.E.a(u11, a0.h(c9896e22.a(aVar22, true), 20, 0.0f, 2));
        LotteryTicketsPurchaseTimerKt.TicketsPurchaseTimer(activeMainInfo.getTicketsPurchaseTimerData(), a0.e(aVar22, 1.0f), function1422, u11, i1622 | 48, 0);
        function12 = function1422;
        u11.f();
        u11.f();
        u11.f();
        Function1<? super b, Unit> function1522 = function12;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}

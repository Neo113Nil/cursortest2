package ru.ozon.app.android.regulardraw.ui.currencyBadge.compose;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "item", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "MorkovskCurrencyBadge", "(Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "size", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/compose/BadgeSizes;", "getBadgeSizes", "(Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;)Lru/ozon/app/android/regulardraw/ui/currencyBadge/compose/BadgeSizes;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskCurrencyBadgeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MorkovskCurrencyBadgeVO.Size.values().length];
            try {
                iArr[MorkovskCurrencyBadgeVO.Size.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MorkovskCurrencyBadgeVO.Size.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MorkovskCurrencyBadge(@NotNull MorkovskCurrencyBadgeVO item, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        boolean n13;
        Object C13;
        int I11;
        int I12;
        e eVar3;
        Function1<? super AtomAction, Unit> function14;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-1313675152);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
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
                    function13 = i14 != 0 ? null : function12;
                    Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                    MorkovskCurrencyBadgeVO.Size size = item.getSize();
                    u11.o(-1069274027);
                    n11 = u11.n(size);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = getBadgeSizes(item.getSize());
                        u11.x(C11);
                    }
                    BadgeSizes badgeSizes = (BadgeSizes) C11;
                    u11.k();
                    String bgColor = item.getBgColor();
                    u11.o(-1069271193);
                    n12 = u11.n(bgColor);
                    C12 = u11.C();
                    if (!n12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getBgColor(), context)));
                        u11.x(C12);
                    }
                    long w11 = ((C7807Z) C12).w();
                    u11.k();
                    String textColor = item.getTextColor();
                    u11.o(-1069267989);
                    n13 = u11.n(textColor);
                    C13 = u11.C();
                    if (!n13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getTextColor(), context)));
                        u11.x(C13);
                    }
                    long w12 = ((C7807Z) C13).w();
                    u11.k();
                    u11.o(-1069262547);
                    e x11 = a0.x(eVar4, null, 3);
                    if (function13 == null && item.getAtomAction() != null) {
                        u11.o(-880091967);
                        boolean z11 = ((i13 & 14) == 4 || ((i13 & 8) != 0 && u11.F(item))) | ((i13 & 896) == 256);
                        Object C14 = u11.C();
                        if (z11 || C14 == InterfaceC3967k.a.a()) {
                            C14 = new MorkovskCurrencyBadgeKt$MorkovskCurrencyBadge$1$1$1(function13, item);
                            u11.x(C14);
                        }
                        u11.k();
                        x11 = i.b(x11, null, null, false, null, null, (Function0) C14, 28);
                    }
                    u11.k();
                    d.b i16 = InterfaceC6250b.a.i();
                    int i17 = C5179b.f39454h;
                    float f7 = 2;
                    Y b11 = X.b(C5179b.n((-badgeSizes.getRightImageWidth()) / f7), i16, u11, 48);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, x11);
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
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    e.a aVar = e.f40358c0;
                    e i18 = T.i(androidx.compose.foundation.e.b(a0.h(aVar, badgeSizes.getBadgeHeight(), 0.0f, 2), w11, h.b(badgeSizes.getBgRadius())), badgeSizes.getLeftPadding(), badgeSizes.getHorizontalPadding(), badgeSizes.getRightImageWidth() / f7, badgeSizes.getHorizontalPadding());
                    V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I12 = u11.I();
                    A0 d12 = u11.d();
                    e f13 = c.f(u11, i18);
                    Function0 a12 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f14 = E.f(u11, f12, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, f14);
                    }
                    F1.b(u11, f13, InterfaceC2801g.a.f());
                    Function1<? super AtomAction, Unit> function15 = function13;
                    e eVar5 = eVar4;
                    u3.b(item.getValue(), null, w12, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, badgeSizes.getTextStyle(), u11, 0, 3120, 55290);
                    u11 = u11;
                    u11.f();
                    u11.o(-880058474);
                    if (item.getImage().length() > 0) {
                        Ag0.e.a(item.getImage(), a0.o(aVar, badgeSizes.getRightImageWidth(), badgeSizes.getRightImageHeight()), null, null, null, 0.0f, null, u11, 3072, 244);
                    }
                    u11.k();
                    u11.f();
                    eVar3 = eVar5;
                    function14 = function15;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    function14 = function12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new MorkovskCurrencyBadgeKt$MorkovskCurrencyBadge$3(item, eVar3, function14, i11, i12));
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
            Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            MorkovskCurrencyBadgeVO.Size size2 = item.getSize();
            u11.o(-1069274027);
            n11 = u11.n(size2);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = getBadgeSizes(item.getSize());
            u11.x(C11);
            BadgeSizes badgeSizes2 = (BadgeSizes) C11;
            u11.k();
            String bgColor2 = item.getBgColor();
            u11.o(-1069271193);
            n12 = u11.n(bgColor2);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getBgColor(), context2)));
            u11.x(C12);
            long w112 = ((C7807Z) C12).w();
            u11.k();
            String textColor2 = item.getTextColor();
            u11.o(-1069267989);
            n13 = u11.n(textColor2);
            C13 = u11.C();
            if (!n13) {
            }
            C13 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getTextColor(), context2)));
            u11.x(C13);
            long w122 = ((C7807Z) C13).w();
            u11.k();
            u11.o(-1069262547);
            e x112 = a0.x(eVar4, null, 3);
            if (function13 == null && item.getAtomAction() != null) {
            }
            u11.k();
            d.b i162 = InterfaceC6250b.a.i();
            int i172 = C5179b.f39454h;
            float f72 = 2;
            Y b112 = X.b(C5179b.n((-badgeSizes2.getRightImageWidth()) / f72), i162, u11, 48);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, x112);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h112);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            e.a aVar2 = e.f40358c0;
            e i182 = T.i(androidx.compose.foundation.e.b(a0.h(aVar2, badgeSizes2.getBadgeHeight(), 0.0f, 2), w112, h.b(badgeSizes2.getBgRadius())), badgeSizes2.getLeftPadding(), badgeSizes2.getHorizontalPadding(), badgeSizes2.getRightImageWidth() / f72, badgeSizes2.getHorizontalPadding());
            V f122 = C5185h.f(InterfaceC6250b.a.e(), false);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f132 = c.f(u11, i182);
            Function0 a122 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 f142 = E.f(u11, f122, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, f142);
            F1.b(u11, f132, InterfaceC2801g.a.f());
            Function1<? super AtomAction, Unit> function152 = function13;
            e eVar52 = eVar4;
            u3.b(item.getValue(), null, w122, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, badgeSizes2.getTextStyle(), u11, 0, 3120, 55290);
            u11 = u11;
            u11.f();
            u11.o(-880058474);
            if (item.getImage().length() > 0) {
            }
            u11.k();
            u11.f();
            eVar3 = eVar52;
            function14 = function152;
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
        Context context22 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        MorkovskCurrencyBadgeVO.Size size22 = item.getSize();
        u11.o(-1069274027);
        n11 = u11.n(size22);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = getBadgeSizes(item.getSize());
        u11.x(C11);
        BadgeSizes badgeSizes22 = (BadgeSizes) C11;
        u11.k();
        String bgColor22 = item.getBgColor();
        u11.o(-1069271193);
        n12 = u11.n(bgColor22);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getBgColor(), context22)));
        u11.x(C12);
        long w1122 = ((C7807Z) C12).w();
        u11.k();
        String textColor22 = item.getTextColor();
        u11.o(-1069267989);
        n13 = u11.n(textColor22);
        C13 = u11.C();
        if (!n13) {
        }
        C13 = C7807Z.m(C7811b0.b(UtilKt.parseColor(item.getTextColor(), context22)));
        u11.x(C13);
        long w1222 = ((C7807Z) C13).w();
        u11.k();
        u11.o(-1069262547);
        e x1122 = a0.x(eVar4, null, 3);
        if (function13 == null && item.getAtomAction() != null) {
        }
        u11.k();
        d.b i1622 = InterfaceC6250b.a.i();
        int i1722 = C5179b.f39454h;
        float f722 = 2;
        Y b1122 = X.b(C5179b.n((-badgeSizes22.getRightImageWidth()) / f722), i1622, u11, 48);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, x1122);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h1122);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        e.a aVar22 = e.f40358c0;
        e i1822 = T.i(androidx.compose.foundation.e.b(a0.h(aVar22, badgeSizes22.getBadgeHeight(), 0.0f, 2), w1122, h.b(badgeSizes22.getBgRadius())), badgeSizes22.getLeftPadding(), badgeSizes22.getHorizontalPadding(), badgeSizes22.getRightImageWidth() / f722, badgeSizes22.getHorizontalPadding());
        V f1222 = C5185h.f(InterfaceC6250b.a.e(), false);
        I12 = u11.I();
        A0 d1222 = u11.d();
        e f1322 = c.f(u11, i1822);
        Function0 a1222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f1422 = E.f(u11, f1222, u11, d1222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f1422);
        F1.b(u11, f1322, InterfaceC2801g.a.f());
        Function1<? super AtomAction, Unit> function1522 = function13;
        e eVar522 = eVar4;
        u3.b(item.getValue(), null, w1222, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, badgeSizes22.getTextStyle(), u11, 0, 3120, 55290);
        u11 = u11;
        u11.f();
        u11.o(-880058474);
        if (item.getImage().length() > 0) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar522;
        function14 = function1522;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final BadgeSizes getBadgeSizes(MorkovskCurrencyBadgeVO.Size size) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i11 == 1) {
            CurrencyBadgeDefaults currencyBadgeDefaults = CurrencyBadgeDefaults.INSTANCE;
            return new BadgeSizes(currencyBadgeDefaults.m936getRightImageWidthDefaultD9Ej5fM(), currencyBadgeDefaults.m934getRightImageHeightDefaultD9Ej5fM(), currencyBadgeDefaults.m930getBadgeHeightDefaultD9Ej5fM(), currencyBadgeDefaults.m940getTextMarginLeftDefaultD9Ej5fM(), currencyBadgeDefaults.m938getTextHorizontalPaddingDefaultD9Ej5fM(), currencyBadgeDefaults.m932getBgRadiusDefaultD9Ej5fM(), RegularDrawTypographyKt.getText_20_20_W500(), null);
        }
        if (i11 != 2) {
            throw new o();
        }
        CurrencyBadgeDefaults currencyBadgeDefaults2 = CurrencyBadgeDefaults.INSTANCE;
        return new BadgeSizes(currencyBadgeDefaults2.m937getRightImageWidthSmallD9Ej5fM(), currencyBadgeDefaults2.m935getRightImageHeightSmallD9Ej5fM(), currencyBadgeDefaults2.m931getBadgeHeightSmallD9Ej5fM(), currencyBadgeDefaults2.m941getTextMarginLeftSmallD9Ej5fM(), currencyBadgeDefaults2.m939getTextHorizontalPaddingSmallD9Ej5fM(), currencyBadgeDefaults2.m933getBgRadiusSmallD9Ej5fM(), RegularDrawTypographyKt.getText_12_12_W500(), null);
    }
}

package ru.ozon.app.android.travel.molecules.view.priceCard;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
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
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardComposeVO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.price.DsPriceAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "PriceCardComposeView", "(Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceCardComposeViewKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceCardComposeView(@NotNull PriceCardComposeVO item, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function12;
        int i14;
        e eVar2;
        boolean z11;
        Object C11;
        e b11;
        PriceCardComposeVO.SettingsVO settings;
        int I11;
        int I12;
        int I13;
        TextDTO subtitle;
        IconDTO icon;
        CornerRadius cornerRadius;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1609427394);
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
            function12 = function1;
            i13 |= u11.F(function12) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    if (i15 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        eVar2 = e.f40358c0;
                    }
                    Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                    PriceCardComposeVO.SettingsVO settings2 = item.getSettings();
                    float px = (settings2 != null || (cornerRadius = settings2.getCornerRadius()) == null) ? 0 : cornerRadius.getPx();
                    Integer parseColor = StyleParser.INSTANCE.parseColor(context, item.getBackgroundColor());
                    long b12 = C7811b0.b(parseColor != null ? parseColor.intValue() : 0);
                    u11.o(-1707713583);
                    z11 = ((i13 & 112) == 32) | ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.n(item)));
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new PriceCardComposeViewKt$PriceCardComposeView$onClickAction$1$1(item, function12);
                        u11.x(C11);
                    }
                    Function0 function0 = (Function0) C11;
                    u11.k();
                    b11 = androidx.compose.foundation.e.b(C6988h.a(eVar2, h.b(px)), b12, y0.a());
                    e l02 = b11.l0(item.getIsClickable() ? i.c(e.f40358c0, false, null, null, function0, 7) : e.f40358c0);
                    settings = item.getSettings();
                    if (settings != null || (r6 = T.i(e.f40358c0, settings.getLeftPadding().m1867getDpD9Ej5fM(), settings.getTopPadding().m1867getDpD9Ej5fM(), settings.getRightPadding().m1867getDpD9Ej5fM(), settings.getBottomPadding().m1867getDpD9Ej5fM())) == null) {
                        e eVar3 = e.f40358c0;
                    }
                    e l03 = l02.l0(eVar3);
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, l03);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    d.b i16 = InterfaceC6250b.a.i();
                    e.a aVar = e.f40358c0;
                    Y b13 = X.b(C5179b.f(), i16, u11, 48);
                    I12 = u11.I();
                    A0 d12 = u11.d();
                    e f13 = c.f(u11, aVar);
                    Function0 a12 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b13, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f13, InterfaceC2801g.a.f());
                    e x11 = a0.x(aVar, null, 3);
                    C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I13 = u11.I();
                    A0 d13 = u11.d();
                    e f14 = c.f(u11, x11);
                    Function0 a14 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a14);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a13, u11, d13);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                        a.d(I13, u11, I13, g10);
                    }
                    F1.b(u11, f14, InterfaceC2801g.a.f());
                    DsPriceAtomKt.DsPriceAtom(null, item.getPrice(), u11, PriceDTO.$stable << 3, 1);
                    subtitle = item.getSubtitle();
                    u11.o(441004287);
                    if (subtitle != null) {
                        DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                        Unit unit = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    icon = item.getIcon();
                    u11.o(336045472);
                    if (icon != null) {
                        DsIconAtomKt.DsIconAtom(icon, null, u11, IconDTO.$stable, 2);
                        Unit unit2 = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    u11.f();
                } else {
                    u11.j();
                }
                e eVar4 = eVar2;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new PriceCardComposeViewKt$PriceCardComposeView$3(item, function12, eVar4, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            PriceCardComposeVO.SettingsVO settings22 = item.getSettings();
            float px2 = (settings22 != null || (cornerRadius = settings22.getCornerRadius()) == null) ? 0 : cornerRadius.getPx();
            Integer parseColor2 = StyleParser.INSTANCE.parseColor(context2, item.getBackgroundColor());
            long b122 = C7811b0.b(parseColor2 != null ? parseColor2.intValue() : 0);
            u11.o(-1707713583);
            if ((i13 & 14) != 4) {
            }
            z11 = ((i13 & 112) == 32) | ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.n(item)));
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new PriceCardComposeViewKt$PriceCardComposeView$onClickAction$1$1(item, function12);
            u11.x(C11);
            Function0 function02 = (Function0) C11;
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(eVar2, h.b(px2)), b122, y0.a());
            e l022 = b11.l0(item.getIsClickable() ? i.c(e.f40358c0, false, null, null, function02, 7) : e.f40358c0);
            settings = item.getSettings();
            if (settings != null) {
            }
            e eVar32 = e.f40358c0;
            e l032 = l022.l0(eVar32);
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, l032);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            d.b i162 = InterfaceC6250b.a.i();
            e.a aVar2 = e.f40358c0;
            Y b132 = X.b(C5179b.f(), i162, u11, 48);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f132 = c.f(u11, aVar2);
            Function0 a122 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b132, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, h112);
            F1.b(u11, f132, InterfaceC2801g.a.f());
            e x112 = a0.x(aVar2, null, 3);
            C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I13 = u11.I();
            A0 d132 = u11.d();
            e f142 = c.f(u11, x112);
            Function0 a142 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a132, u11, d132);
            if (!u11.t()) {
            }
            a.d(I13, u11, I13, g102);
            F1.b(u11, f142, InterfaceC2801g.a.f());
            DsPriceAtomKt.DsPriceAtom(null, item.getPrice(), u11, PriceDTO.$stable << 3, 1);
            subtitle = item.getSubtitle();
            u11.o(441004287);
            if (subtitle != null) {
            }
            u11.k();
            u11.f();
            icon = item.getIcon();
            u11.o(336045472);
            if (icon != null) {
            }
            u11.k();
            u11.f();
            u11.f();
            e eVar42 = eVar2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function12 = function1;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        Context context22 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        PriceCardComposeVO.SettingsVO settings222 = item.getSettings();
        float px22 = (settings222 != null || (cornerRadius = settings222.getCornerRadius()) == null) ? 0 : cornerRadius.getPx();
        Integer parseColor22 = StyleParser.INSTANCE.parseColor(context22, item.getBackgroundColor());
        long b1222 = C7811b0.b(parseColor22 != null ? parseColor22.intValue() : 0);
        u11.o(-1707713583);
        if ((i13 & 14) != 4) {
        }
        z11 = ((i13 & 112) == 32) | ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.n(item)));
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new PriceCardComposeViewKt$PriceCardComposeView$onClickAction$1$1(item, function12);
        u11.x(C11);
        Function0 function022 = (Function0) C11;
        u11.k();
        b11 = androidx.compose.foundation.e.b(C6988h.a(eVar2, h.b(px22)), b1222, y0.a());
        e l0222 = b11.l0(item.getIsClickable() ? i.c(e.f40358c0, false, null, null, function022, 7) : e.f40358c0);
        settings = item.getSettings();
        if (settings != null) {
        }
        e eVar322 = e.f40358c0;
        e l0322 = l0222.l0(eVar322);
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, l0322);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        d.b i1622 = InterfaceC6250b.a.i();
        e.a aVar22 = e.f40358c0;
        Y b1322 = X.b(C5179b.f(), i1622, u11, 48);
        I12 = u11.I();
        A0 d1222 = u11.d();
        e f1322 = c.f(u11, aVar22);
        Function0 a1222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1322, u11, d1222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h1122);
        F1.b(u11, f1322, InterfaceC2801g.a.f());
        e x1122 = a0.x(aVar22, null, 3);
        C5194q a1322 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I13 = u11.I();
        A0 d1322 = u11.d();
        e f1422 = c.f(u11, x1122);
        Function0 a1422 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1322, u11, d1322);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, g1022);
        F1.b(u11, f1422, InterfaceC2801g.a.f());
        DsPriceAtomKt.DsPriceAtom(null, item.getPrice(), u11, PriceDTO.$stable << 3, 1);
        subtitle = item.getSubtitle();
        u11.o(441004287);
        if (subtitle != null) {
        }
        u11.k();
        u11.f();
        icon = item.getIcon();
        u11.o(336045472);
        if (icon != null) {
        }
        u11.k();
        u11.f();
        u11.f();
        e eVar422 = eVar2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}

package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.Paddings;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;", "searchBar", "Landroidx/compose/ui/e;", "modifier", "", "searchText", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onClear", "SearchBar", "(Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;Landroidx/compose/ui/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchBarKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBar(@NotNull BrandListDTO.SearchBar searchBar, e eVar, @NotNull String searchText, @NotNull Function1<? super String, Unit> onValueChange, @NotNull Function0<Unit> onClear, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean n11;
        Object C11;
        P1 p12;
        Object C12;
        r rVar;
        boolean n12;
        Object C13;
        int I11;
        IconDTO searchIcon;
        e eVar3;
        Intrinsics.checkNotNullParameter(searchBar, "searchBar");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onClear, "onClear");
        C3969l u11 = interfaceC3967k.u(1795742271);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(searchBar) : u11.F(searchBar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.n(searchText) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(onValueChange) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.F(onClear) ? 16384 : 8192;
            }
            i14 = i13;
            if ((i14 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                C7807Z c7807z = TokenParserKt.tokenToColor(searchBar.getBackgroundColor(), u11, 0);
                u11.o(-214983868);
                long clearLightKey300 = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey300() : c7807z.w();
                u11.k();
                CornerRadius cornerRadius = searchBar.getCornerRadius();
                Object name = cornerRadius == null ? cornerRadius.name() : null;
                u11.o(-214980524);
                n11 = u11.n(name);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    CornerRadius cornerRadius2 = searchBar.getCornerRadius();
                    h parseRadiusToken = TokenParserKt.parseRadiusToken(cornerRadius2 == null ? cornerRadius2.name() : null);
                    C11 = h.a(parseRadiusToken == null ? parseRadiusToken.d() : UniTheme.INSTANCE.getRadii().getNone());
                    u11.x(C11);
                }
                float d11 = ((h) C11).d();
                u11.k();
                UniTheme uniTheme = UniTheme.INSTANCE;
                int i16 = UniTheme.$stable;
                long textLightKey = uniTheme.getColors(u11, i16).getTextLightKey();
                long textSecondaryOnDark = uniTheme.getColors(u11, i16).getTextSecondaryOnDark();
                T compact500Medium = uniTheme.getTypography().getCompact500Medium();
                float f7 = 40;
                p12 = (P1) u11.m(K0.o());
                u11.o(-214967083);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new r();
                    u11.x(C12);
                }
                rVar = (r) C12;
                u11.k();
                Unit unit = Unit.f71690a;
                u11.o(-214965272);
                n12 = u11.n(p12);
                C13 = u11.C();
                if (!n12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new SearchBarKt$SearchBar$1$1(rVar, p12, null);
                    u11.x(C13);
                }
                u11.k();
                Q.e(u11, unit, (Function2) C13);
                e b11 = androidx.compose.foundation.e.b(a0.f(eVar4, f7), clearLightKey300, A0.h.b(d11));
                Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d12 = u11.d();
                e f11 = c.f(u11, b11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h11 = Cm.e.h(u11, b12, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                searchIcon = searchBar.getSearchIcon();
                u11.o(-286676099);
                if (searchIcon == null) {
                    DsIconAtomKt.DsIconAtom(searchIcon, androidx.compose.foundation.layout.T.h(e.f40358c0, uniTheme.getPaddings().getPadding400(), 0.0f, 2), u11, IconDTO.$stable, 0);
                }
                u11.k();
                e.a aVar = e.f40358c0;
                e f12 = a0.f(androidx.compose.foundation.layout.T.j(aVar, 0.0f, uniTheme.getPaddings().getPadding300(), 0.0f, 0.0f, 13), f7);
                if (1.0f > 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                e eVar5 = eVar4;
                CustomTextFieldKt.m969CustomTextFieldfWhpE4E(i.a(f12.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), rVar), searchBar.getPlaceholder(), T.c(compact500Medium, textLightKey, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), textSecondaryOnDark, searchText, onValueChange, u11, (i14 << 6) & 516096, 0);
                IconDTO crossIcon = searchBar.getCrossIcon();
                u11.o(-286651946);
                if (crossIcon != null) {
                    u11.o(-286651150);
                    if (searchText.length() > 0) {
                        e h12 = androidx.compose.foundation.layout.T.h(aVar, Paddings.INSTANCE.m963getHorizontalPaddingsD9Ej5fM(), 0.0f, 2);
                        u11.o(212058216);
                        boolean n13 = u11.n(p12) | ((57344 & i14) == 16384);
                        Object C14 = u11.C();
                        if (n13 || C14 == InterfaceC3967k.a.a()) {
                            C14 = new SearchBarKt$SearchBar$2$2$1$1(onClear, rVar, p12);
                            u11.x(C14);
                        }
                        u11.k();
                        DsIconAtomKt.DsIconAtom(crossIcon, androidx.compose.foundation.i.c(h12, false, null, null, (Function0) C14, 7), u11, IconDTO.$stable, 0);
                    }
                    u11.k();
                }
                u11.k();
                u11.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new SearchBarKt$SearchBar$3(searchBar, eVar3, searchText, onValueChange, onClear, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        i14 = i13;
        if ((i14 & 9363) == 9362) {
        }
        if (i15 == 0) {
        }
        C7807Z c7807z2 = TokenParserKt.tokenToColor(searchBar.getBackgroundColor(), u11, 0);
        u11.o(-214983868);
        if (c7807z2 != null) {
        }
        u11.k();
        CornerRadius cornerRadius3 = searchBar.getCornerRadius();
        if (cornerRadius3 == null) {
        }
        u11.o(-214980524);
        n11 = u11.n(name);
        C11 = u11.C();
        if (!n11) {
        }
        CornerRadius cornerRadius22 = searchBar.getCornerRadius();
        h parseRadiusToken2 = TokenParserKt.parseRadiusToken(cornerRadius22 == null ? cornerRadius22.name() : null);
        C11 = h.a(parseRadiusToken2 == null ? parseRadiusToken2.d() : UniTheme.INSTANCE.getRadii().getNone());
        u11.x(C11);
        float d112 = ((h) C11).d();
        u11.k();
        UniTheme uniTheme2 = UniTheme.INSTANCE;
        int i162 = UniTheme.$stable;
        long textLightKey2 = uniTheme2.getColors(u11, i162).getTextLightKey();
        long textSecondaryOnDark2 = uniTheme2.getColors(u11, i162).getTextSecondaryOnDark();
        T compact500Medium2 = uniTheme2.getTypography().getCompact500Medium();
        float f72 = 40;
        p12 = (P1) u11.m(K0.o());
        u11.o(-214967083);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        rVar = (r) C12;
        u11.k();
        Unit unit2 = Unit.f71690a;
        u11.o(-214965272);
        n12 = u11.n(p12);
        C13 = u11.C();
        if (!n12) {
        }
        C13 = new SearchBarKt$SearchBar$1$1(rVar, p12, null);
        u11.x(C13);
        u11.k();
        Q.e(u11, unit2, (Function2) C13);
        e b112 = androidx.compose.foundation.e.b(a0.f(eVar4, f72), clearLightKey300, A0.h.b(d112));
        Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d122 = u11.d();
        e f112 = c.f(u11, b112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b122, u11, d122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        searchIcon = searchBar.getSearchIcon();
        u11.o(-286676099);
        if (searchIcon == null) {
        }
        u11.k();
        e.a aVar2 = e.f40358c0;
        e f122 = a0.f(androidx.compose.foundation.layout.T.j(aVar2, 0.0f, uniTheme2.getPaddings().getPadding300(), 0.0f, 0.0f, 13), f72);
        if (1.0f > 0.0d) {
        }
    }
}

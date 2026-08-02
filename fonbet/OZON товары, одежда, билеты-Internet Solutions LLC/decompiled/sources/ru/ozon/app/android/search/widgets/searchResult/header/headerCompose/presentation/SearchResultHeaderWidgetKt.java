package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import GZ.g;
import J0.u3;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Vg.e;
import W10.c;
import WZ.l;
import WZ.t;
import Z1.d;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.TextStyles;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0016\u001a3\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "item", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModel", "LGZ/g;", "router", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "favoriteEntityComposeDelegateFactory", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "SearchResultHeaderWidget-SI6GP0Y", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;LGZ/g;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;LVg/e$a;LW10/c;LS0/k;I)V", "SearchResultHeaderWidget", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "colors", "HeaderText", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;LS0/k;I)V", "TotalFoundText", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "SearchOriginalText", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;LGZ/g;LWZ/l;LS0/k;I)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultHeaderWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeaderText(SearchResultHeaderVI searchResultHeaderVI, SearchResultHeaderColors searchResultHeaderColors, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1975026448);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(searchResultHeaderVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(searchResultHeaderColors) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            String header = searchResultHeaderVI.getHeader();
            if (header != null && !h.K(header)) {
                c3969l = u11;
                u3.b(searchResultHeaderVI.getHeader(), T.j(e.f40358c0, 0.0f, UniTheme.INSTANCE.getPaddings().getPadding300(), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, 0L, 2, false, 3, 0, null, K1.T.c(TextStyles.INSTANCE.getHeadL(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getTitle(), u11, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), c3969l, 0, 3120, 55292);
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new SearchResultHeaderWidgetKt$HeaderText$1(searchResultHeaderVI, searchResultHeaderColors, i11));
                    return;
                }
                return;
            }
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchOriginalText(SearchResultHeaderVI searchResultHeaderVI, SearchResultHeaderColors searchResultHeaderColors, g gVar, l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(518217350);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(searchResultHeaderVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(searchResultHeaderColors) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(gVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(lVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            String searchOriginalText = searchResultHeaderVI.getSearchOriginalText();
            if (searchOriginalText != null && !h.K(searchOriginalText)) {
                String searchOriginalText2 = searchResultHeaderVI.getSearchOriginalText();
                K1.T c11 = K1.T.c(TextStyles.INSTANCE.getBodyM(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getDidYouMean(), u11, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
                e.a aVar = e.f40358c0;
                u11.o(-161820554);
                boolean F11 = u11.F(searchResultHeaderVI) | u11.F(lVar) | u11.F(gVar);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SearchResultHeaderWidgetKt$SearchOriginalText$1$1(searchResultHeaderVI, lVar, gVar);
                    u11.x(C11);
                }
                u11.k();
                c3969l = u11;
                u3.b(searchOriginalText2, i.c(aVar, false, null, null, (Function0) C11, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11, c3969l, 0, 0, 65532);
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new SearchResultHeaderWidgetKt$SearchOriginalText$2(searchResultHeaderVI, searchResultHeaderColors, gVar, lVar, i11));
                    return;
                }
                return;
            }
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* renamed from: SearchResultHeaderWidget-SI6GP0Y, reason: not valid java name */
    public static final void m979SearchResultHeaderWidgetSI6GP0Y(@NotNull SearchResultHeaderVI item, @NotNull MinifyLinkViewModel minifyLinkViewModel, @NotNull g router, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, @NotNull FavoriteEntityComposeDelegateFactory favoriteEntityComposeDelegateFactory, e.a aVar, @NotNull c trackingData, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        boolean F11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(minifyLinkViewModel, "minifyLinkViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(favoriteEntityComposeDelegateFactory, "favoriteEntityComposeDelegateFactory");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C3969l u11 = interfaceC3967k.u(-335116263);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(minifyLinkViewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(router) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(favoriteEntityInteractor) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(favoriteEntityComposeDelegateFactory) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            if ((262144 & i11) == 0) {
                F11 = u11.n(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            } else {
                F11 = u11.F(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            }
            i12 |= F11 ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(trackingData) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
        } else {
            boolean isSelect = AppTypeResolver.INSTANCE.isSelect((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
            l lVar = (l) u11.m(f.e());
            u11.o(-813076825);
            boolean p11 = u11.p(isSelect);
            Object C11 = u11.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = SearchResultHeaderColors.INSTANCE.from(isSelect);
                u11.x(C11);
            }
            SearchResultHeaderColors searchResultHeaderColors = (SearchResultHeaderColors) C11;
            u11.k();
            t tokenizedEvent = item.getTokenizedEvent();
            u11.o(-813073907);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
                u11.o(1784503816);
                boolean F12 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new SearchResultHeaderWidgetKt$SearchResultHeaderWidget$1$1$1(lVar, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                e3.i.a(aVar2, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar3, 1.0f), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getBackground(), u11, UniColorToken.$stable), y0.a());
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            androidx.compose.ui.e j11 = T.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((Context) u11.m(AndroidCompositionLocals_androidKt.d())).getResources().getDimension(R$dimen.default_margin) / ((d) u11.m(K0.e())).g(), 0.0f, ((Context) u11.m(AndroidCompositionLocals_androidKt.d())).getResources().getDimension(R$dimen.default_margin) / ((d) u11.m(K0.e())).g(), 0.0f, 10);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, j11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            int i14 = i13 & 14;
            int i15 = i13 & 910;
            CategoryTitleKt.CategoryTitle(item, isSelect, router, lVar, searchResultHeaderColors, u11, i15);
            HeaderText(item, searchResultHeaderColors, u11, i14);
            TotalFoundText(item, searchResultHeaderColors, u11, i14);
            SearchOriginalText(item, searchResultHeaderColors, router, lVar, u11, i15);
            u11 = u11;
            u11.f();
            d.b l11 = InterfaceC6250b.a.l();
            UniTheme uniTheme = UniTheme.INSTANCE;
            androidx.compose.ui.e j12 = T.j(aVar3, 0.0f, uniTheme.getPaddings().getPadding300(), uniTheme.getPaddings().getPadding500(), 0.0f, 9);
            Y b13 = X.b(C5179b.f(), l11, u11, 48);
            int I13 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, j12);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h12);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            int i16 = i13 >> 3;
            FavoriteButtonKt.m978FavoriteButtonoVahEfE(item.getId(), item.getFavoriteEntityButton(), favoriteEntityInteractor, favoriteEntityComposeDelegateFactory, aVar, u11, (i16 & 57344) | (i16 & 8064) | 32768);
            ShareIconKt.ShareIcon(item, minifyLinkViewModel, lVar, searchResultHeaderColors, trackingData, u11, (i13 & 126) | ((i13 >> 6) & 57344));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SearchResultHeaderWidgetKt$SearchResultHeaderWidget$3(item, minifyLinkViewModel, router, favoriteEntityInteractor, favoriteEntityComposeDelegateFactory, aVar, trackingData, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TotalFoundText(SearchResultHeaderVI searchResultHeaderVI, SearchResultHeaderColors searchResultHeaderColors, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(409979489);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(searchResultHeaderVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(searchResultHeaderColors) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            String totalFound = searchResultHeaderVI.getTotalFound();
            if (totalFound != null && !h.K(totalFound)) {
                String searchOriginalText = searchResultHeaderVI.getSearchOriginalText();
                c3969l = u11;
                u3.b(searchResultHeaderVI.getTotalFound(), T.e(androidx.compose.ui.e.f40358c0, (searchOriginalText == null || h.K(searchOriginalText)) ? T.b(0.0f, 0.0f, 0.0f, UniTheme.INSTANCE.getPaddings().getPadding300(), 7) : T.b(0.0f, UniTheme.INSTANCE.getPaddings().getPadding400(), 0.0f, 0.0f, 13)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, K1.T.c(TextStyles.INSTANCE.getBodyM(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getSubtitle(), u11, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), c3969l, 0, 0, 65532);
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new SearchResultHeaderWidgetKt$TotalFoundText$1(searchResultHeaderVI, searchResultHeaderColors, i11));
                    return;
                }
                return;
            }
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}

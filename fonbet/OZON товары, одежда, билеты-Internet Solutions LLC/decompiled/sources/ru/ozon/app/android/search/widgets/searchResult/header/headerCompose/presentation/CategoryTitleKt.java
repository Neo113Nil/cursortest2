package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import GZ.g;
import J0.u3;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.i;
import androidx.compose.material.Q;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.TextStyles;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "item", "", "isSelect", "LGZ/g;", "router", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "colors", "", "CategoryTitle", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;ZLGZ/g;LWZ/l;Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;LS0/k;I)V", "LK1/T;", "GetTextStyleForLink", "(ZLru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;LS0/k;I)LK1/T;", "GetTextStyleForDefaultText", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryTitleKt {
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryTitle(@NotNull SearchResultHeaderVI item, boolean z11, @NotNull g router, @NotNull l tokenizedAnalytics, @NotNull SearchResultHeaderColors colors, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        T GetTextStyleForDefaultText;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(colors, "colors");
        C3969l u11 = interfaceC3967k.u(-343447280);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(router) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(tokenizedAnalytics) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(colors) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            String categoryTitle = item.getCategoryTitle();
            if (categoryTitle != null && !h.K(categoryTitle)) {
                boolean z12 = false;
                boolean z13 = item.getCategoryDeeplink() != null;
                if (z13 && !z11) {
                    z12 = true;
                }
                u11.o(974188524);
                boolean p11 = u11.p(z12);
                Object C11 = u11.C();
                if (p11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = z12 ? p.a() : null;
                    u11.x(C11);
                }
                q qVar = (q) C11;
                u11.k();
                int i13 = i12;
                String categoryTitle2 = item.getCategoryTitle();
                if (z13) {
                    u11.o(135267606);
                    GetTextStyleForDefaultText = GetTextStyleForLink(z11, colors, u11, ((i13 >> 9) & 112) | ((i13 >> 3) & 14));
                    u11.k();
                } else {
                    u11.o(135342223);
                    GetTextStyleForDefaultText = GetTextStyleForDefaultText(z11, colors, u11, ((i13 >> 9) & 112) | ((i13 >> 3) & 14));
                    u11.k();
                }
                T t2 = GetTextStyleForDefaultText;
                e.a aVar = e.f40358c0;
                UniTheme uniTheme = UniTheme.INSTANCE;
                e j11 = androidx.compose.foundation.layout.T.j(aVar, 0.0f, uniTheme.getPaddings().getPadding300(), 0.0f, 0.0f, 13);
                InterfaceC8369J f7 = z12 ? Q.f(3, uniTheme.getColors(u11, UniTheme.$stable).getBgActionSecondary()) : null;
                u11.o(974213417);
                boolean F11 = u11.F(item) | u11.F(tokenizedAnalytics) | u11.F(router);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new CategoryTitleKt$CategoryTitle$2$1(item, tokenizedAnalytics, router);
                    u11.x(C12);
                }
                u11.k();
                c3969l = u11;
                u3.b(categoryTitle2, i.b(j11, qVar, f7, z13, null, null, (Function0) C12, 24), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t2, c3969l, 0, 3120, 55292);
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new CategoryTitleKt$CategoryTitle$3(item, z11, router, tokenizedAnalytics, colors, i11));
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

    private static final T GetTextStyleForDefaultText(boolean z11, SearchResultHeaderColors searchResultHeaderColors, InterfaceC3967k interfaceC3967k, int i11) {
        T c11;
        interfaceC3967k.o(-764234158);
        if (z11) {
            interfaceC3967k.o(1232210304);
            c11 = T.c(TextStyles.INSTANCE.getOzonTextAppearanceBody500medium(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getCategory(), interfaceC3967k, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1232306714);
            c11 = T.c(TextStyles.INSTANCE.getBodyM(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getCategory(), interfaceC3967k, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return c11;
    }

    private static final T GetTextStyleForLink(boolean z11, SearchResultHeaderColors searchResultHeaderColors, InterfaceC3967k interfaceC3967k, int i11) {
        T c11;
        V1.i iVar;
        interfaceC3967k.o(217739116);
        if (z11) {
            interfaceC3967k.o(189031010);
            T ozonTextAppearanceBody500medium = TextStyles.INSTANCE.getOzonTextAppearanceBody500medium();
            long themedColor = UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getCategory(), interfaceC3967k, UniColorToken.$stable);
            iVar = V1.i.f27916c;
            c11 = T.c(ozonTextAppearanceBody500medium, themedColor, 0L, null, null, null, 0L, iVar, null, 0L, null, null, 16773118);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(189190846);
            c11 = T.c(TextStyles.INSTANCE.getBodyL(), UniCompositionLocalKt.getThemedColor(searchResultHeaderColors.getCategory(), interfaceC3967k, UniColorToken.$stable), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return c11;
    }
}

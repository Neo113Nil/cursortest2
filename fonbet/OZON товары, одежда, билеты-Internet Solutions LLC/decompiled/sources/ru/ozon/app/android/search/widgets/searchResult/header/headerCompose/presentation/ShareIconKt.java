package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import G1.e;
import J0.T0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import W10.c;
import WZ.l;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a?\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "item", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "colors", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "ShareIcon", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;LWZ/l;Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;LW10/c;LS0/k;I)V", "Landroid/app/Activity;", "activity", "", "message", "share", "(Landroid/app/Activity;Ljava/lang/String;)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShareIconKt {
    public static final void ShareIcon(@NotNull SearchResultHeaderVI item, @NotNull MinifyLinkViewModel minifyLinkViewModel, @NotNull l tokenizedAnalytics, @NotNull SearchResultHeaderColors colors, @NotNull c trackingData, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String shareLink;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(minifyLinkViewModel, "minifyLinkViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C3969l u11 = interfaceC3967k.u(-1762270360);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(minifyLinkViewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(tokenizedAnalytics) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(colors) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(trackingData) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            String shareText = item.getShareText();
            if (shareText != null && !h.K(shareText) && (shareLink = item.getShareLink()) != null && !h.K(shareLink)) {
                AbstractC8972b a11 = e.a(R$drawable.ic_m_share_universal_filled, u11, 0);
                long themedColor = UniCompositionLocalKt.getThemedColor(colors.getShareTint(), u11, UniColorToken.$stable);
                androidx.compose.ui.e j11 = T.j(androidx.compose.ui.e.f40358c0, UniTheme.INSTANCE.getPaddings().getPadding400(), 0.0f, 0.0f, 0.0f, 14);
                u11.o(-457242036);
                boolean F11 = u11.F(item) | u11.F(tokenizedAnalytics) | u11.F(minifyLinkViewModel) | u11.F(trackingData) | u11.F(context);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    ShareIconKt$ShareIcon$1$1 shareIconKt$ShareIcon$1$1 = new ShareIconKt$ShareIcon$1$1(item, minifyLinkViewModel, trackingData, tokenizedAnalytics, context);
                    u11.x(shareIconKt$ShareIcon$1$1);
                    C11 = shareIconKt$ShareIcon$1$1;
                }
                u11.k();
                T0.a(a11, null, i.c(j11, false, null, null, (Function0) C11, 7), themedColor, u11, 48);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ShareIconKt$ShareIcon$2(item, minifyLinkViewModel, tokenizedAnalytics, colors, trackingData, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void share(Activity activity, String str) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(str);
        aVar.c(R$string.common_action_share);
        aVar.h();
    }
}

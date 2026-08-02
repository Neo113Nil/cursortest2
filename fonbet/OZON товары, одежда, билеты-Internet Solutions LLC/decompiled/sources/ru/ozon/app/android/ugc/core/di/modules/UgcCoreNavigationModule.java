package ru.ozon.app.android.ugc.core.di.modules;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.deeplink.ApparelSocialDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.ReviewCommentsBottomSheetDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.ReviewContentDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.ReviewGalleryV2DeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.SingleReviewBottomSheetDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.SingleReviewDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.SingleReviewV3DeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.SocialProfileDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.SocialProfileSubscribersDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.TopAuthorsLandingDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.TopAuthorsOnboardingDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/di/modules/UgcCoreNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet", "()Ljava/util/Set;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcCoreNavigationModule {

    @NotNull
    public static final UgcCoreNavigationModule INSTANCE = new UgcCoreNavigationModule();

    private UgcCoreNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet() {
        return e0.b(new SingleReviewDeeplinkHandler(), new SingleReviewV3DeeplinkHandler(), new SingleReviewBottomSheetDeeplinkHandler(), new ReviewGalleryV2DeeplinkHandler(), new ReviewCommentsBottomSheetDeeplinkHandler(), new ReviewContentDeeplinkHandler(), new SocialProfileSubscribersDeeplinkHandler(), new SocialProfileDeeplinkHandler(), new ApparelSocialDeeplinkHandler(), new TopAuthorsLandingDeeplinkHandler(), new TopAuthorsOnboardingDeeplinkHandler());
    }
}

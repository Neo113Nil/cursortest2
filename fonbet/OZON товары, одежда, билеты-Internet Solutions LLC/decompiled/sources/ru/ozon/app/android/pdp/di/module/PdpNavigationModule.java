package ru.ozon.app.android.pdp.di.module;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.deeplink.AllReviewsDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.AwardsDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.ComparisonDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.ComparisonListsDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.GalleryFullViewDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.OzonCardLandingDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.PdpBottomSheetDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.PdpWholesaleModalDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.Photo360DeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.SimilarProductsDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.TilesDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.WholeSaleModal3PDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/di/module/PdpNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet", "()Ljava/util/Set;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpNavigationModule {

    @NotNull
    public static final PdpNavigationModule INSTANCE = new PdpNavigationModule();

    private PdpNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet() {
        return e0.b(new ComparisonDeeplinkHandler(), new ComparisonListsDeeplinkHandler(), new OzonCardLandingDeeplinkHandler(), new TilesDeeplinkHandler(), new AllReviewsDeeplinkHandler(), new Photo360DeeplinkHandler(), new AwardsDeeplinkHandler(), new GalleryFullViewDeeplinkHandler(), new PdpBottomSheetDeeplinkHandler(), new PdpWholesaleModalDeeplinkHandler(), new WholeSaleModal3PDeeplinkHandler(), new SimilarProductsDeeplinkHandler());
    }
}

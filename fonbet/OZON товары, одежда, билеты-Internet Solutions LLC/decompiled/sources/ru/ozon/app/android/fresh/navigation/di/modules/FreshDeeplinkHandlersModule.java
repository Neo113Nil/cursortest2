package ru.ozon.app.android.fresh.navigation.di.modules;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.deeplinks.AddressEditDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.AddressPopupDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.AddressSuggestionsDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.CharityAddressDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.ClickConditionsDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.DeliveryTariffDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FaqFreshDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FeedbackCurtainDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshAIDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshAIHistoryDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshFaqDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshProfileDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshTabOnboardingDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.GeoCourierInfoDeeplinkHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.ReviewsMediaGalleryDeeplinkHandler;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/modules/FreshDeeplinkHandlersModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)Ljava/util/Set;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshDeeplinkHandlersModule {

    @NotNull
    public static final FreshDeeplinkHandlersModule INSTANCE = new FreshDeeplinkHandlersModule();

    private FreshDeeplinkHandlersModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        return e0.b(new FeedbackCurtainDeeplinkHandler(), new AddressEditDeeplinkHandler(), new AddressSuggestionsDeeplinkHandler(), new FreshTabOnboardingDeeplinkHandler(domainsInteractor), new FreshFaqDeeplinkHandler(domainsInteractor), new AddressPopupDeeplinkHandler(), new DeliveryTariffDeeplinkHandler(), new CharityAddressDeeplinkHandler(), new ClickConditionsDeeplinkHandler(), new FaqFreshDeeplinkHandler(), new FreshProfileDeeplinkHandler(), new ReviewsMediaGalleryDeeplinkHandler(), new GeoCourierInfoDeeplinkHandler(), new FreshAIDeeplinkHandler(), new FreshAIHistoryDeeplinkHandler());
    }
}

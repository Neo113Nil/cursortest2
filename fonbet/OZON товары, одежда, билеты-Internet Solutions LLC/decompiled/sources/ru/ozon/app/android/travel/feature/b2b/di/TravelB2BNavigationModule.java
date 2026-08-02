package ru.ozon.app.android.travel.feature.b2b.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.b2b.deeplink.CreateEmployeeFromCheckoutDeeplinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.EmployeeDeeplinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.TravelCallbackFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.TravelCommonB2BDeeplinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.TravelCompanyDocumentsDeepLinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.TravelDocumentsToEmailDeeplinkHandler;
import ru.ozon.app.android.travel.feature.b2b.deeplink.TravelReportDocumentDeepLinkHandler;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/di/TravelB2BNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenBehavior", "LHZ/a;", "deeplinkHandlersCache", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;LHZ/a;)Ljava/util/Set;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelB2BNavigationModule {

    @NotNull
    public static final TravelB2BNavigationModule INSTANCE = new TravelB2BNavigationModule();

    private TravelB2BNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenBehavior, @NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenBehavior, "fullScreenBehavior");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        return e0.b(new TravelCompanyDocumentsDeepLinkHandler(authDestinationInterceptor), new TravelReportDocumentDeepLinkHandler(authDestinationInterceptor), new TravelDocumentsToEmailDeeplinkHandler(authDestinationInterceptor), new TravelCallbackFormDeeplinkHandler(), new CreateEmployeeFromCheckoutDeeplinkHandler(authDestinationInterceptor), new EmployeeDeeplinkHandler(authDestinationInterceptor, fullScreenBehavior), new TravelCommonB2BDeeplinkHandler(fullScreenBehavior, deeplinkHandlersCache));
    }
}

package ru.ozon.app.android.cml.delivery.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.navigation.handlers.BoxListDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.FaqDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.OrderDraftDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.ParticipantPhoneDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.PassportDetailsDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.RegionSearchDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.SecureDealCurtainDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.SelectCategoryDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.SelectParcelDescriptionDeeplinkHandler;
import ru.ozon.app.android.cml.delivery.navigation.handlers.SetDeclaredValueDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/di/CmlDeliveryNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandler", "()Ljava/util/Set;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlDeliveryNavigationModule {
    @NotNull
    public final Set<a> provideDeeplinkHandler() {
        return e0.b(new ParticipantPhoneDeeplinkHandler(), new OrderDraftDeeplinkHandler(), new RegionSearchDeeplinkHandler(), new BoxListDeeplinkHandler(), new FaqDeeplinkHandler(), new SelectCategoryDeeplinkHandler(), new SetDeclaredValueDeeplinkHandler(), new SelectParcelDescriptionDeeplinkHandler(), new SecureDealCurtainDeeplinkHandler(), new PassportDetailsDeeplinkHandler());
    }
}

package ru.ozon.app.android.geo.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.deeplink.AddressBookDeeplinkHandler;
import ru.ozon.app.android.geo.deeplink.AddressMapDeeplinkHandler;
import ru.ozon.app.android.geo.deeplink.AddressMapPageDeeplinkHandler;
import ru.ozon.app.android.geo.deeplink.CheckoutMapComposerDeeplinkHandler;
import ru.ozon.app.android.geo.deeplink.EditAddressAndRecipientModalDeeplinkHandler;
import ru.ozon.app.android.geo.deeplink.MiniAddressBookDeeplinkHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/geo/di/GeoNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "LIZ/a;", "provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)Ljava/util/Set;", "provideDeeplinkHandlersSet", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeoNavigationModule {

    @NotNull
    public static final GeoNavigationModule INSTANCE = new GeoNavigationModule();

    private GeoNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsRelease(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        return e0.b(new CheckoutMapComposerDeeplinkHandler(featureChecker), new AddressMapDeeplinkHandler(), new AddressMapPageDeeplinkHandler(), new AddressBookDeeplinkHandler(), new MiniAddressBookDeeplinkHandler(), new EditAddressAndRecipientModalDeeplinkHandler());
    }
}

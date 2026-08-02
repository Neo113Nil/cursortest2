package ru.ozon.app.android.travel.feature.entry.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelLinkGenerator;
import ru.ozon.app.android.travel.feature.entry.R$id;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001f\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabIdResolverImpl;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabIdResolver;", "<init>", "()V", "tabIds", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "", "resolveFromUrl", "tabUrl", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonTravelTabIdResolverImpl implements OzonTravelTabIdResolver {

    @NotNull
    private final Map<String, Integer> tabIds;

    public OzonTravelTabIdResolverImpl() {
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        this.tabIds = U.j(new Pair(linkGenerator.travelMain().toString(), Integer.valueOf(R$id.menu_travel)), new Pair(linkGenerator.travelTickets().toString(), Integer.valueOf(R$id.menu_tickets)), new Pair(linkGenerator.travelMainHotel().toString(), Integer.valueOf(R$id.menu_hotel)), new Pair(TravelLinkGenerator.INSTANCE.travelSupport().toString(), Integer.valueOf(R$id.menu_travel_support)));
    }

    @Override // ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabIdResolver
    public int resolveFromUrl(@NotNull String tabUrl) {
        Intrinsics.checkNotNullParameter(tabUrl, "tabUrl");
        Integer num = this.tabIds.get(tabUrl);
        return num != null ? num.intValue() : tabUrl.hashCode();
    }
}

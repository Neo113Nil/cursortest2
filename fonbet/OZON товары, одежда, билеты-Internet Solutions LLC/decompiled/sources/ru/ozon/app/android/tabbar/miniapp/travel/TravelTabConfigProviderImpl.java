package ru.ozon.app.android.tabbar.miniapp.travel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.R$id;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001f\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigProviderImpl;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigProvider;", "<init>", "()V", "tabIds", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "", "getTabId", "tabUrl", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabConfigProviderImpl implements TravelTabConfigProvider {

    @NotNull
    private final Map<String, Integer> tabIds;

    public TravelTabConfigProviderImpl() {
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        this.tabIds = U.j(new Pair(MiniAppExtKt.appendTravel(linkGenerator.travelMain()).toString(), Integer.valueOf(R$id.menu_travel)), new Pair(MiniAppExtKt.appendTravel(linkGenerator.travelTickets()).toString(), Integer.valueOf(R$id.menu_tickets)), new Pair(MiniAppExtKt.appendTravel(TravelLinkGenerator.INSTANCE.travelSupport()).toString(), Integer.valueOf(R$id.menu_travel_support)));
    }

    @Override // ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigProvider
    public int getTabId(@NotNull String tabUrl) {
        Intrinsics.checkNotNullParameter(tabUrl, "tabUrl");
        Integer num = this.tabIds.get(tabUrl);
        return num != null ? num.intValue() : tabUrl.hashCode();
    }
}

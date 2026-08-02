package ru.ozon.app.android.travel.feature.entry.data;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.travel.feature.entry.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/data/OzonTravelFallbackTabConfigProviderImpl;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelFallbackTabConfigProvider;", "<init>", "()V", "provideTabs", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonTravelFallbackTabConfigProviderImpl implements OzonTravelFallbackTabConfigProvider {
    @Override // ru.ozon.app.android.travel.feature.entry.data.OzonTravelFallbackTabConfigProvider
    @NotNull
    public TabConfigResponse provideTabs() {
        String string = StringProvider.getString(R$string.travel_common_name);
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = linkGenerator.travelMain().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        TabConfigDTO tabConfigDTO = new TabConfigDTO(string, "ic_m_tabbar_travel", bottomNavigationBehavior, uri, null, null, null, 112, null);
        String string2 = StringProvider.getString(R$string.travel_common_hotels_android);
        String uri2 = linkGenerator.travelMainHotel().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        TabConfigDTO tabConfigDTO2 = new TabConfigDTO(string2, "ic_m_tabbar_hotels", bottomNavigationBehavior, uri2, null, null, null, 112, null);
        String string3 = StringProvider.getString(R$string.travel_common_tickets_android);
        String uri3 = linkGenerator.travelTickets().toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        TabConfigDTO tabConfigDTO3 = new TabConfigDTO(string3, "ic_m_tabbar_ticket", bottomNavigationBehavior, uri3, null, null, null, 112, null);
        String string4 = StringProvider.getString(R$string.travel_common_chat_android);
        BottomNavigationBehavior bottomNavigationBehavior2 = BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT;
        String builder = MiniAppExtKt.appendTravelAndTcrm(linkGenerator.chat()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return new TabConfigResponse(null, C7714v.b0(tabConfigDTO, tabConfigDTO2, tabConfigDTO3, new TabConfigDTO(string4, "ic_m_tabbar_chat", bottomNavigationBehavior2, builder, null, null, null, 112, null)));
    }
}

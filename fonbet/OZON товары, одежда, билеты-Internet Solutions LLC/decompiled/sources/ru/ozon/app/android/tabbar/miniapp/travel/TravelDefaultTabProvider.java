package ru.ozon.app.android.tabbar.miniapp.travel;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.R$string;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/travel/TravelDefaultTabProvider;", "", "<init>", "()V", "getDefaultTabConfig", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelDefaultTabProvider {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TabConfigResponse getDefaultTabConfig() {
        String string = StringProvider.getString(R$string.back_ozon);
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT;
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = linkGenerator.closeMiniApp().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        TabConfigDTO tabConfigDTO = new TabConfigDTO(string, "ic_m_tab_back", bottomNavigationBehavior, uri, null, null, null, 112, null);
        String string2 = StringProvider.getString(R$string.travel_common_name);
        BottomNavigationBehavior bottomNavigationBehavior2 = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        String builder = MiniAppExtKt.appendTravel(linkGenerator.travelMain()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        TabConfigDTO tabConfigDTO2 = new TabConfigDTO(string2, "ic_m_plane", bottomNavigationBehavior2, builder, null, null, null, 112, null);
        String string3 = StringProvider.getString(R$string.travel_common_tickets_android);
        String builder2 = MiniAppExtKt.appendTravel(linkGenerator.travelTickets()).toString();
        Intrinsics.checkNotNullExpressionValue(builder2, "toString(...)");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        TabConfigDTO tabConfigDTO3 = new TabConfigDTO(string3, "ic_m_ticket", bottomNavigationBehavior2, builder2, objArr2, null, objArr, 112, null);
        String string4 = StringProvider.getString(R$string.travel_common_chat_android);
        String builder3 = MiniAppExtKt.appendTravelAndTcrm(linkGenerator.chat()).toString();
        Intrinsics.checkNotNullExpressionValue(builder3, "toString(...)");
        String str = "ic_m_dialog";
        TabConfigAnimations tabConfigAnimations = null;
        Object[] objArr3 = 0 == true ? 1 : 0;
        return new TabConfigResponse(null, C7714v.b0(tabConfigDTO, tabConfigDTO2, tabConfigDTO3, new TabConfigDTO(string4, str, bottomNavigationBehavior, builder3, 0 == true ? 1 : 0, tabConfigAnimations, objArr3, 112, null)));
    }
}

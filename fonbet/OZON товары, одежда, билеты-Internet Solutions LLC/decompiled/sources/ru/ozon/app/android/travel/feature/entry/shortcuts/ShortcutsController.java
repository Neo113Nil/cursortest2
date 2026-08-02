package ru.ozon.app.android.travel.feature.entry.shortcuts;

import Nk.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.travel.feature.entry.R$drawable;
import ru.ozon.app.android.travel.feature.entry.R$string;
import ru.ozon.app.android.travel.utils.extensions.ContextExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/shortcuts/ShortcutsController;", "", "<init>", "()V", "populateShortcuts", "", "context", "Landroid/content/Context;", "generateTravelShortCuts", "", "Landroid/content/pm/ShortcutInfo;", "appendCampaignParam", "Landroid/net/Uri;", "category", "", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShortcutsController {
    private final Uri appendCampaignParam(Uri uri, String str) {
        Uri build = uri.buildUpon().appendQueryParameter("mwc_campaign", a.b("oztravel_shortcut_", str)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final List<ShortcutInfo> generateTravelShortCuts(Context context) {
        ShortcutInfo.Builder icon = new ShortcutInfo.Builder(context, "flights").setRank(1).setShortLabel(StringProvider.getString(R$string.tx_flights_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.tx_flights_shortcut_long_label_android)).setIcon(Icon.createWithResource(context, R$drawable.ic_travel_shortcut_flight));
        Intent className = new Intent().setAction("android.intent.action.VIEW").setClassName(context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity");
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        return C7714v.b0(icon.setIntent(className.setData(appendCampaignParam(linkGenerator.travelMainFlight(), "avia"))).setCategories(e0.h("actions.intent.OPEN_APP_FEATURE")).build(), new ShortcutInfo.Builder(context, "hotels").setRank(2).setShortLabel(StringProvider.getString(R$string.tx_hotels_and_apartments_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.tx_hotels_and_apartments_shortcut_long_label_android)).setIcon(Icon.createWithResource(context, R$drawable.ic_travel_shortcut_hotels)).setIntent(new Intent().setAction("android.intent.action.VIEW").setClassName(context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity").setData(appendCampaignParam(linkGenerator.travelMainHotel(), "hotel"))).setCategories(e0.h("actions.intent.OPEN_APP_FEATURE")).build(), new ShortcutInfo.Builder(context, "railway").setRank(3).setShortLabel(StringProvider.getString(R$string.tx_railway_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.tx_railway_shortcut_long_label_android)).setIcon(Icon.createWithResource(context, R$drawable.ic_travel_shortcut_rail)).setIntent(new Intent().setAction("android.intent.action.VIEW").setClassName(context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity").setData(appendCampaignParam(linkGenerator.travelMainRailway(), "railway"))).setCategories(e0.h("actions.intent.OPEN_APP_FEATURE")).build(), new ShortcutInfo.Builder(context, "tours").setRank(4).setShortLabel(StringProvider.getString(R$string.tx_tours_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.tx_tours_shortcut_long_label_android)).setIcon(Icon.createWithResource(context, R$drawable.ic_travel_shortcut_tours)).setIntent(new Intent().setAction("android.intent.action.VIEW").setClassName(context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity").setData(appendCampaignParam(linkGenerator.travelMainTour(), "tour"))).setCategories(e0.h("actions.intent.OPEN_APP_FEATURE")).build(), new ShortcutInfo.Builder(context, "orderList").setRank(5).setShortLabel(StringProvider.getString(R$string.tx_orders_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.tx_orders_shortcut_long_label_android)).setIcon(Icon.createWithResource(context, R$drawable.ic_travel_shortcut_orders)).setIntent(new Intent().setAction("android.intent.action.VIEW").setClassName(context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity").setData(appendCampaignParam(linkGenerator.travelTickets(), "orderList"))).setCategories(e0.h("actions.intent.OPEN_APP_FEATURE")).build());
    }

    public final void populateShortcuts(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        int maxShortcutCountPerActivity = ContextExtensionsKt.isUsingPixelLauncher(context) ? 4 : shortcutManager.getMaxShortcutCountPerActivity();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
        Intrinsics.checkNotNullExpressionValue(dynamicShortcuts, "getDynamicShortcuts(...)");
        List<ShortcutInfo> list = dynamicShortcuts;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
        for (Object obj : list) {
            linkedHashMap2.put(((ShortcutInfo) obj).getId(), obj);
        }
        linkedHashMap.putAll(linkedHashMap2);
        List<ShortcutInfo> generateTravelShortCuts = generateTravelShortCuts(context);
        int h12 = U.h(C7714v.z(generateTravelShortCuts, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
        for (Object obj2 : generateTravelShortCuts) {
            linkedHashMap3.put(((ShortcutInfo) obj2).getId(), obj2);
        }
        linkedHashMap.putAll(linkedHashMap3);
        try {
            shortcutManager.setDynamicShortcuts(C7714v.K0(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.entry.shortcuts.ShortcutsController$populateShortcuts$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t11) {
                    return Vc.a.b(Integer.valueOf(((ShortcutInfo) t2).getRank()), Integer.valueOf(((ShortcutInfo) t11).getRank()));
                }
            }, linkedHashMap.values()), maxShortcutCountPerActivity));
        } catch (IllegalArgumentException e11) {
            Lm0.a.f17149a.e(e11);
        } catch (IllegalStateException e12) {
            Lm0.a.f17149a.e(e12);
        }
    }
}

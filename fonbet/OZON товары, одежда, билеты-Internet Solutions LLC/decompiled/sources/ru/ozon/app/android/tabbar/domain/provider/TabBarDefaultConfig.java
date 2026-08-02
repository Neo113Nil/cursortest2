package ru.ozon.app.android.tabbar.domain.provider;

import NZ.h;
import Tc.d;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.R$string;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.LocalTabConfig;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.text.StringProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/domain/provider/TabBarDefaultConfig;", "", "config", "Lru/ozon/app/android/tabbar/data/TabConfig;", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/tabbar/data/TabConfig;)V", "getConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "MAIN", "SELECT", "TEEN", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabBarDefaultConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TabBarDefaultConfig[] $VALUES;
    public static final TabBarDefaultConfig MAIN;
    public static final TabBarDefaultConfig SELECT;
    public static final TabBarDefaultConfig TEEN;

    @NotNull
    private final TabConfig config;

    private static final /* synthetic */ TabBarDefaultConfig[] $values() {
        return new TabBarDefaultConfig[]{MAIN, SELECT, TEEN};
    }

    static {
        int i11 = R$id.menu_main;
        d builder = new d();
        Integer valueOf = Integer.valueOf(R$id.menu_main);
        TabLinkGenerator tabLinkGenerator = TabLinkGenerator.INSTANCE;
        builder.put(valueOf, tabLinkGenerator.getHome());
        builder.put(Integer.valueOf(R$id.menu_bank), tabLinkGenerator.getBankTab());
        builder.put(Integer.valueOf(R$id.menu_cart), tabLinkGenerator.getCart());
        builder.put(Integer.valueOf(R$id.menu_profile), tabLinkGenerator.getCabinet());
        builder.put(Integer.valueOf(R$id.menu_express), tabLinkGenerator.getExpress());
        builder.put(Integer.valueOf(R$id.menu_catalog), tabLinkGenerator.getCategory());
        builder.put(Integer.valueOf(R$id.menu_favorites), tabLinkGenerator.getFavorites());
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        MAIN = new TabBarDefaultConfig("MAIN", 0, new LocalTabConfig(new h(i11, builder.u())));
        int i12 = R$id.menu_main;
        d builder2 = new d();
        builder2.put(Integer.valueOf(R$id.menu_main), tabLinkGenerator.getHome());
        builder2.put(Integer.valueOf(R$id.menu_bank), tabLinkGenerator.getBankTab());
        builder2.put(Integer.valueOf(R$id.menu_cart), tabLinkGenerator.getCart());
        builder2.put(Integer.valueOf(R$id.menu_profile), tabLinkGenerator.getCabinet());
        builder2.put(Integer.valueOf(R$id.menu_catalog), tabLinkGenerator.getCategory());
        builder2.put(Integer.valueOf(R$id.menu_favorites), tabLinkGenerator.getFavorites());
        Intrinsics.checkNotNullParameter(builder2, "builder");
        SELECT = new TabBarDefaultConfig("SELECT", 1, new LocalTabConfig(new h(i12, builder2.u())));
        int i13 = R$id.menu_main;
        String string = StringProvider.getString(R$string.tabs_menu_main);
        String home = tabLinkGenerator.getHome();
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        List b02 = C7714v.b0(new BottomNavigationItem(i13, "menu_teen_home_selector", string, null, home, null, bottomNavigationBehavior, null, 168, null), new BottomNavigationItem(R$id.menu_teen_swipes, "menu_teen_swipes_selector", StringProvider.getString(R$string.tabs_teen_swipes), null, tabLinkGenerator.getTeenSwipes(), null, bottomNavigationBehavior, null, 168, null), new BottomNavigationItem(R$id.menu_favorites, "menu_teen_favs_selector", StringProvider.getString(R$string.tabs_teen_favs), null, tabLinkGenerator.getFavorites(), null, bottomNavigationBehavior, null, 168, null), new BottomNavigationItem(R$id.menu_cart, "menu_teen_cart_selector", StringProvider.getString(R$string.common_menu_cart), null, tabLinkGenerator.getCart(), null, bottomNavigationBehavior, null, 168, null), new BottomNavigationItem(R$id.menu_profile, "menu_teen_profile_selector", StringProvider.getString(R$string.common_menu_profile), null, tabLinkGenerator.getCabinet(), null, bottomNavigationBehavior, null, 168, null));
        ActiveColorsConfig activeColorsConfig = new ActiveColorsConfig("textLightKey", null, null, null, 14, null);
        int i14 = R$id.menu_main;
        d builder3 = new d();
        builder3.put(Integer.valueOf(R$id.menu_main), tabLinkGenerator.getHome());
        builder3.put(Integer.valueOf(R$id.menu_teen_swipes), tabLinkGenerator.getTeenSwipes());
        builder3.put(Integer.valueOf(R$id.menu_cart), tabLinkGenerator.getCart());
        builder3.put(Integer.valueOf(R$id.menu_favorites), tabLinkGenerator.getFavorites());
        builder3.put(Integer.valueOf(R$id.menu_profile), tabLinkGenerator.getCabinet());
        Intrinsics.checkNotNullParameter(builder3, "builder");
        TEEN = new TabBarDefaultConfig("TEEN", 2, new RemoteTabConfig(b02, activeColorsConfig, BottomNavigationConfig.TEENS, new h(i14, builder3.u())));
        TabBarDefaultConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TabBarDefaultConfig(String str, int i11, TabConfig tabConfig) {
        this.config = tabConfig;
    }

    public static TabBarDefaultConfig valueOf(String str) {
        return (TabBarDefaultConfig) Enum.valueOf(TabBarDefaultConfig.class, str);
    }

    public static TabBarDefaultConfig[] values() {
        return (TabBarDefaultConfig[]) $VALUES.clone();
    }

    @NotNull
    public final TabConfig getConfig() {
        return this.config;
    }
}

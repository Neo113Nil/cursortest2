package ru.ozon.app.android.tabbar.miniapp.fresh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.tabbar.R$string;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.flags.FreshFavInTabbarVisibleFlag;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshDefaultTabs;", "", "mapper", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "getData", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FreshDefaultTabs {

    @NotNull
    private static final TabConfigDTO cartTab;

    @NotNull
    private static final TabConfigDTO catalogueTab;

    @NotNull
    private static final TabConfigDTO favoriteTab;

    @NotNull
    private static final TabConfigDTO freshHomeTab;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FreshTabConfigMapper mapper;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String string = StringProvider.getString(R$string.tabs_menu_fresh_main);
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String builder = MiniAppExtKt.appendExpress(linkGenerator.express()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        freshHomeTab = new TabConfigDTO(string, "ic_m_food", bottomNavigationBehavior, builder, null, null, null, 112, null);
        String string2 = StringProvider.getString(R$string.common_menu_catalog);
        String builder2 = MiniAppExtKt.appendExpress(linkGenerator.category()).toString();
        Intrinsics.checkNotNullExpressionValue(builder2, "toString(...)");
        int i11 = 112;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TabConfigAnimations tabConfigAnimations = null;
        catalogueTab = new TabConfigDTO(string2, "ic_m_tab_catalog", bottomNavigationBehavior, builder2, 0 == true ? 1 : 0, tabConfigAnimations, 0 == true ? 1 : 0, i11, defaultConstructorMarker);
        String string3 = StringProvider.getString(R$string.common_menu_cart);
        String builder3 = MiniAppExtKt.appendExpress(linkGenerator.cart()).toString();
        Intrinsics.checkNotNullExpressionValue(builder3, "toString(...)");
        cartTab = new TabConfigDTO(string3, "ic_m_cart", bottomNavigationBehavior, builder3, 0 == true ? 1 : 0, tabConfigAnimations, 0 == true ? 1 : 0, i11, defaultConstructorMarker);
        String string4 = StringProvider.getString(R$string.common_menu_favorites);
        String builder4 = MiniAppExtKt.appendExpress(linkGenerator.favorites()).toString();
        Intrinsics.checkNotNullExpressionValue(builder4, "toString(...)");
        favoriteTab = new TabConfigDTO(string4, "ic_m_tab_favourites", bottomNavigationBehavior, builder4, 0 == true ? 1 : 0, tabConfigAnimations, 0 == true ? 1 : 0, i11, defaultConstructorMarker);
    }

    public FreshDefaultTabs(@NotNull FreshTabConfigMapper mapper, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.mapper = mapper;
        this.featureChecker = featureChecker;
    }

    @NotNull
    public final FreshTabData getData() {
        TabConfigDTO tabConfigDTO = freshHomeTab;
        TabConfigDTO tabConfigDTO2 = catalogueTab;
        TabConfigDTO tabConfigDTO3 = cartTab;
        TabConfigDTO tabConfigDTO4 = favoriteTab;
        ArrayList m02 = C7714v.m0(tabConfigDTO, tabConfigDTO2, tabConfigDTO3, tabConfigDTO4);
        if (!this.featureChecker.isEnabled(FreshFavInTabbarVisibleFlag.INSTANCE)) {
            m02.remove(tabConfigDTO4);
        }
        List<BottomNavigationItem> mapToModels = this.mapper.mapToModels(m02);
        return new FreshTabData(mapToModels, this.mapper.getTabNavigatorConfig(mapToModels), new ActiveColorsConfig(null, null, null, null, 15, null));
    }
}

package ru.ozon.app.android.tabbar.domain.provider;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fintech.navigation.FintechNavigation;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/tabbar/domain/provider/TabConfigProviderImpl;", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "appType", "Lru/ozon/app/android/utils/AppType;", "teensModeService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "tabDeeplinks", "", "", "", "getTabDeeplinks", "()Ljava/util/Map;", "getDefaultTabConfig", "Lru/ozon/app/android/tabbar/data/TabConfig;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigProviderImpl implements TabConfigProvider {

    @NotNull
    private final AppType appType;

    @NotNull
    private final Map<String, Integer> tabDeeplinks;

    @NotNull
    private final TeensModeService teensModeService;

    public TabConfigProviderImpl(@NotNull AppType appType, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.appType = appType;
        this.teensModeService = teensModeService;
        TabLinkGenerator tabLinkGenerator = TabLinkGenerator.INSTANCE;
        Pair pair = new Pair(tabLinkGenerator.getHome(), Integer.valueOf(R$id.menu_main));
        Pair pair2 = new Pair(tabLinkGenerator.getCategory(), Integer.valueOf(R$id.menu_catalog));
        Pair pair3 = new Pair(tabLinkGenerator.getExpress(), Integer.valueOf(R$id.menu_express));
        Pair pair4 = new Pair(tabLinkGenerator.getCart(), Integer.valueOf(R$id.menu_cart));
        Pair pair5 = new Pair(tabLinkGenerator.getFavorites(), Integer.valueOf(R$id.menu_favorites));
        Pair pair6 = new Pair(tabLinkGenerator.getCabinet(), Integer.valueOf(R$id.menu_profile));
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        Pair pair7 = new Pair(linkGenerator.social().toString(), Integer.valueOf(R$id.menu_social));
        Pair pair8 = new Pair(linkGenerator.travelMain().toString(), Integer.valueOf(R$id.menu_travel));
        Pair pair9 = new Pair(linkGenerator.travelMainGeneral().toString(), Integer.valueOf(R$id.menu_travel));
        Pair pair10 = new Pair(linkGenerator.travelMainFlight().toString(), Integer.valueOf(R$id.menu_travel));
        Pair pair11 = new Pair(linkGenerator.categoryClothes().toString(), Integer.valueOf(R$id.menu_clothes));
        Pair pair12 = new Pair(linkGenerator.elevenNovember().toString(), Integer.valueOf(R$id.menu_eleven_november));
        Pair pair13 = new Pair(linkGenerator.bankTab().toString(), Integer.valueOf(R$id.menu_bank));
        FintechNavigation fintechNavigation = FintechNavigation.INSTANCE;
        this.tabDeeplinks = U.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair(fintechNavigation.bankTabModal().toString(), Integer.valueOf(R$id.menu_bank)), new Pair(fintechNavigation.bankTabFull().toString(), Integer.valueOf(R$id.menu_bank)), new Pair(tabLinkGenerator.getRkoTab(), Integer.valueOf(R$id.menu_bank)), new Pair(linkGenerator.searchTab().toString(), Integer.valueOf(R$id.menu_search_tab)), new Pair(linkGenerator.globalTab().toString(), Integer.valueOf(R$id.menu_global_tab)), new Pair(linkGenerator.superEconom().toString(), Integer.valueOf(R$id.menu_super_econom_tab)), new Pair(linkGenerator.superEconomNew().toString(), Integer.valueOf(R$id.menu_super_econom_tab)), new Pair(linkGenerator.boutiqueTab().toString(), Integer.valueOf(R$id.menu_boutique_tab)), new Pair(linkGenerator.apparelMainTab().toString(), Integer.valueOf(R$id.menu_boutique_tab)), new Pair(tabLinkGenerator.getTeenSwipes(), Integer.valueOf(R$id.menu_teen_swipes)));
    }

    @Override // ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider
    @NotNull
    public TabConfig getDefaultTabConfig() {
        return ((this.appType == AppType.f94580BX && this.teensModeService.isTeensModeOn()) ? TabBarDefaultConfig.TEEN : this.appType == AppType.SELECT ? TabBarDefaultConfig.SELECT : TabBarDefaultConfig.MAIN).getConfig();
    }

    @Override // ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider
    @NotNull
    public Map<String, Integer> getTabDeeplinks() {
        return this.tabDeeplinks;
    }
}

package ru.ozon.app.android.tabbar.feature.configurator;

import U7.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.domain.flags.SellerMiniappDisabled;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollMainPageListFlag;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BottomNavigationScrollConfigurator$hideTabBarOnScrollMainPageTypes$2 extends AbstractC7737t implements Function0<Set<? extends String>> {
    final /* synthetic */ FeatureService $featureService;
    final /* synthetic */ BottomNavigationScrollConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomNavigationScrollConfigurator$hideTabBarOnScrollMainPageTypes$2(FeatureService featureService, BottomNavigationScrollConfigurator bottomNavigationScrollConfigurator) {
        super(0);
        this.$featureService = featureService;
        this.this$0 = bottomNavigationScrollConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<? extends String> mapToSet;
        String stringKey = this.$featureService.getStringKey(HideTabBarOnScrollMainPageListFlag.INSTANCE);
        if (this.$featureService.getBooleanKey(SellerMiniappDisabled.INSTANCE)) {
            stringKey = d.e(stringKey, ",seller");
        }
        mapToSet = this.this$0.mapToSet(stringKey);
        return mapToSet;
    }
}

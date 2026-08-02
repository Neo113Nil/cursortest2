package ru.ozon.app.android.tabbar.feature.configurator;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollTravelPageListFlag;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BottomNavigationScrollConfigurator$hideTabBarOnScrollTravelPageTypes$2 extends AbstractC7737t implements Function0<Set<? extends String>> {
    final /* synthetic */ FeatureService $featureService;
    final /* synthetic */ BottomNavigationScrollConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomNavigationScrollConfigurator$hideTabBarOnScrollTravelPageTypes$2(BottomNavigationScrollConfigurator bottomNavigationScrollConfigurator, FeatureService featureService) {
        super(0);
        this.this$0 = bottomNavigationScrollConfigurator;
        this.$featureService = featureService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<? extends String> mapToSet;
        mapToSet = this.this$0.mapToSet(this.$featureService.getStringKey(HideTabBarOnScrollTravelPageListFlag.INSTANCE));
        return mapToSet;
    }
}

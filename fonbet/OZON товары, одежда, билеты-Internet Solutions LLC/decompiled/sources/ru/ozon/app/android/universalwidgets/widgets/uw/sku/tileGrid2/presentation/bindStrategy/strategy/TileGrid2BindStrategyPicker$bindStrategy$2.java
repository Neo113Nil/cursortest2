package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.BadgeOnboardingDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2BindStrategyPicker$bindStrategy$2 extends AbstractC7737t implements Function0<TileGrid2BindStrategy> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ boolean $isThin;
    final /* synthetic */ TileGrid2BaseViewBinding $viewBinding;
    final /* synthetic */ TileGrid2BindStrategyPicker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BindStrategyPicker$bindStrategy$2(TileGrid2BindStrategyPicker tileGrid2BindStrategyPicker, TileGrid2BaseViewBinding tileGrid2BaseViewBinding, FeatureChecker featureChecker, boolean z11) {
        super(0);
        this.this$0 = tileGrid2BindStrategyPicker;
        this.$viewBinding = tileGrid2BaseViewBinding;
        this.$featureChecker = featureChecker;
        this.$isThin = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2BindStrategy invoke() {
        ComposerReferences composerReferences;
        BadgeOnboardingDelegate badgeOnboardingDelegate;
        InterfaceC4008j interfaceC4008j;
        TileGrid2BindStrategy createBindStrategy;
        TileGrid2BindStrategyPicker tileGrid2BindStrategyPicker = this.this$0;
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.$viewBinding;
        composerReferences = tileGrid2BindStrategyPicker.refs;
        badgeOnboardingDelegate = this.this$0.badgeOnboardingDelegate;
        interfaceC4008j = this.this$0.brandLogoDelegateLazy;
        createBindStrategy = tileGrid2BindStrategyPicker.createBindStrategy(tileGrid2BaseViewBinding, composerReferences, badgeOnboardingDelegate, interfaceC4008j, this.$featureChecker, this.$isThin);
        return createBindStrategy;
    }
}

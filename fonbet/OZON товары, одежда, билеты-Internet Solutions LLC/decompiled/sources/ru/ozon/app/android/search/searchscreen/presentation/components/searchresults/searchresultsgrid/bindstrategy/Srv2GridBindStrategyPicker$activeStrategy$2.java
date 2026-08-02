package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridBindStrategy;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Srv2GridBindStrategyPicker$activeStrategy$2 extends AbstractC7737t implements Function0<Srv2GridBindStrategy> {
    final /* synthetic */ WidgetSearchResultsGridBinding $viewBinding;
    final /* synthetic */ Srv2GridBindStrategyPicker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Srv2GridBindStrategyPicker$activeStrategy$2(Srv2GridBindStrategyPicker srv2GridBindStrategyPicker, WidgetSearchResultsGridBinding widgetSearchResultsGridBinding) {
        super(0);
        this.this$0 = srv2GridBindStrategyPicker;
        this.$viewBinding = widgetSearchResultsGridBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Srv2GridBindStrategy invoke() {
        ComposerReferences composerReferences;
        ButtonsBinder buttonsBinder;
        AdultDelegate adultDelegate;
        Srv2GridBindStrategy createBindStrategy;
        Srv2GridBindStrategyPicker srv2GridBindStrategyPicker = this.this$0;
        WidgetSearchResultsGridBinding widgetSearchResultsGridBinding = this.$viewBinding;
        composerReferences = srv2GridBindStrategyPicker.refs;
        buttonsBinder = this.this$0.buttonsBinder;
        adultDelegate = this.this$0.getAdultDelegate();
        createBindStrategy = srv2GridBindStrategyPicker.createBindStrategy(widgetSearchResultsGridBinding, composerReferences, buttonsBinder, adultDelegate);
        return createBindStrategy;
    }
}

package ru.ozon.app.android.ugc.widgets.rateItemsV2.di;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.core.RateItemsV2Mapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class RateItemsV2Component$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<RateItemsV2ViewModel>> {
    final /* synthetic */ RateItemsV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2Component$Companion$create$1$1$viewModelProvider$2(RateItemsV2Component$Companion$create$1$1 rateItemsV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = rateItemsV2Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateItemsV2ViewModel invoke$lambda$0(RateItemsV2Component$Companion$create$1$1 rateItemsV2Component$Companion$create$1$1) {
        AndroidPlatformComponentApi androidPlatformComponentApi;
        ActionComponentApi actionComponentApi;
        NetworkComponentApi networkComponentApi;
        androidPlatformComponentApi = rateItemsV2Component$Companion$create$1$1.androidPlatformComponentApi;
        AppType appType = androidPlatformComponentApi.getAppType();
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = rateItemsV2Component$Companion$create$1$1.getComposerWidgetAsyncComponentApi().getComposerAsyncWidgetRepository();
        RateItemsV2Mapper mapper = rateItemsV2Component$Companion$create$1$1.getMapper();
        actionComponentApi = rateItemsV2Component$Companion$create$1$1.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        l tokenizedAnalytics = rateItemsV2Component$Companion$create$1$1.getTokenizedAnalytics();
        networkComponentApi = rateItemsV2Component$Companion$create$1$1.networkComponentApi;
        return new RateItemsV2ViewModel(appType, composerAsyncWidgetRepository, mapper, actionRepository, tokenizedAnalytics, networkComponentApi.getFeatureChecker());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<RateItemsV2ViewModel> invoke() {
        final RateItemsV2Component$Companion$create$1$1 rateItemsV2Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.di.a
            @Override // Pc.a
            public final Object get() {
                RateItemsV2ViewModel invoke$lambda$0;
                invoke$lambda$0 = RateItemsV2Component$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(RateItemsV2Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}

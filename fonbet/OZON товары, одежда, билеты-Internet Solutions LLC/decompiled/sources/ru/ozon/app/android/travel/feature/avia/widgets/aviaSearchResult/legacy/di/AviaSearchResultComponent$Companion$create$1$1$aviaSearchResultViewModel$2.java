package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewModel$2 extends AbstractC7737t implements Function0<Pc.a<AviaSearchResultViewModel>> {
    final /* synthetic */ AviaSearchResultComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewModel$2(AviaSearchResultComponent$Companion$create$1$1 aviaSearchResultComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = aviaSearchResultComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaSearchResultViewModel invoke$lambda$0(AviaSearchResultComponent$Companion$create$1$1 aviaSearchResultComponent$Companion$create$1$1) {
        AviaSearchResultApi aviaSearchResultApi;
        ActionComponentApi actionComponentApi;
        aviaSearchResultApi = aviaSearchResultComponent$Companion$create$1$1.aviaSearchResultApi;
        Intrinsics.checkNotNullExpressionValue(aviaSearchResultApi, "access$getAviaSearchResultApi$p(...)");
        actionComponentApi = aviaSearchResultComponent$Companion$create$1$1.actionComponentApi;
        return new AviaSearchResultViewModel(aviaSearchResultApi, actionComponentApi.getActionRepository(), aviaSearchResultComponent$Companion$create$1$1.getAviaSearchResultV3Mapper(), AviaSearchResultModule.INSTANCE.providePreloaderAnimator$avia_prodGoogleAllVendorsRelease());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AviaSearchResultViewModel> invoke() {
        final AviaSearchResultComponent$Companion$create$1$1 aviaSearchResultComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.a
            @Override // Pc.a
            public final Object get() {
                AviaSearchResultViewModel invoke$lambda$0;
                invoke$lambda$0 = AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewModel$2.invoke$lambda$0(AviaSearchResultComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}

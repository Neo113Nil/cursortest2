package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Srv2GridDefaultViewStateBinder$onAttach$1$onCreate$1 extends AbstractC7737t implements Function1<AdultImagesModel, Unit> {
    final /* synthetic */ Srv2GridDefaultViewStateBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Srv2GridDefaultViewStateBinder$onAttach$1$onCreate$1(Srv2GridDefaultViewStateBinder srv2GridDefaultViewStateBinder) {
        super(1);
        this.this$0 = srv2GridDefaultViewStateBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdultImagesModel adultImagesModel) {
        invoke2(adultImagesModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdultImagesModel adultImagesModel) {
        if (Intrinsics.d(adultImagesModel.getImageItems(), this.this$0.getViewBinding().gallerySwipeView.getItems())) {
            return;
        }
        this.this$0.getViewBinding().gallerySwipeView.bind(adultImagesModel);
        this.this$0.showOnboardingIfNeed(adultImagesModel);
    }
}

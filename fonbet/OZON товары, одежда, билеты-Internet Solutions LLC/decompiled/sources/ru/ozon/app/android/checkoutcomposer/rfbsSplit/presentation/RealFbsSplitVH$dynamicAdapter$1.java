package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.yandexsearchsheet.ShowYandexSearchSheetAction;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RealFbsSplitVH$dynamicAdapter$1 extends AbstractC7737t implements Function1<YandexSearchSheetFragment.Data, Unit> {
    final /* synthetic */ RealFbsSplitVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealFbsSplitVH$dynamicAdapter$1(RealFbsSplitVH realFbsSplitVH) {
        super(1);
        this.this$0 = realFbsSplitVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(YandexSearchSheetFragment.Data data) {
        invoke2(data);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(YandexSearchSheetFragment.Data it) {
        YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        ShowYandexSearchSheetAction showYandexSearchSheetAction = new ShowYandexSearchSheetAction(it, 1000, this.this$0.getTrackingData());
        yandexSearchSheetSharedViewModel = this.this$0.yandexSearchSheetSharedViewModel;
        if (yandexSearchSheetSharedViewModel.showYandexSearchSheet(showYandexSearchSheetAction)) {
            return;
        }
        YandexSearchSheetFragment.Companion companion = YandexSearchSheetFragment.INSTANCE;
        composerReferences = this.this$0.ref;
        ComponentCallbacksC5392m j11 = composerReferences.getContainer().j();
        composerReferences2 = this.this$0.ref;
        companion.show(showYandexSearchSheetAction, j11, composerReferences2.getContainer().k());
    }
}

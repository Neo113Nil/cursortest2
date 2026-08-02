package ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation;

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
final class RfbsAddressInfoVH$dynamicAdapter$1 extends AbstractC7737t implements Function1<YandexSearchSheetFragment.Data, Unit> {
    final /* synthetic */ ComposerReferences $ref;
    final /* synthetic */ RfbsAddressInfoVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RfbsAddressInfoVH$dynamicAdapter$1(RfbsAddressInfoVH rfbsAddressInfoVH, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = rfbsAddressInfoVH;
        this.$ref = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(YandexSearchSheetFragment.Data data) {
        invoke2(data);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(YandexSearchSheetFragment.Data it) {
        YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        ShowYandexSearchSheetAction showYandexSearchSheetAction = new ShowYandexSearchSheetAction(it, 1000, this.this$0.getTrackingData());
        yandexSearchSheetSharedViewModel = this.this$0.yandexSearchSheetSharedViewModel;
        if (yandexSearchSheetSharedViewModel.showYandexSearchSheet(showYandexSearchSheetAction)) {
            return;
        }
        YandexSearchSheetFragment.INSTANCE.show(showYandexSearchSheetAction, this.$ref.getContainer().j(), this.$ref.getContainer().k());
    }
}

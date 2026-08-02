package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import Sc.o;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetWannaDiscountV2Binding;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Result;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "events", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/concurrent/LinkedBlockingQueue;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WannaDiscountV2ViewHolder$onAttach$1 extends AbstractC7737t implements Function1<LinkedBlockingQueue<WannaDiscountV2Result>, Unit> {
    final /* synthetic */ WannaDiscountV2ViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder$onAttach$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Intent, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Intent sendResultToTargetFragment) {
            Intrinsics.checkNotNullParameter(sendResultToTargetFragment, "$this$sendResultToTargetFragment");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewHolder$onAttach$1(WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder) {
        super(1);
        this.this$0 = wannaDiscountV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkedBlockingQueue<WannaDiscountV2Result> linkedBlockingQueue) {
        invoke2(linkedBlockingQueue);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkedBlockingQueue<WannaDiscountV2Result> linkedBlockingQueue) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding;
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding2;
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding3;
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding4;
        int i11;
        WannaDiscountV2VO boundedData = this.this$0.getBoundedData();
        ButtonV3Atom.LargeButton sendButton = boundedData != null ? boundedData.getSendButton() : null;
        ArrayList arrayList = new ArrayList();
        linkedBlockingQueue.drainTo(arrayList);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WannaDiscountV2Result wannaDiscountV2Result = (WannaDiscountV2Result) next;
            if (wannaDiscountV2Result instanceof WannaDiscountV2Result.SendDiscountSuccess) {
                WannaDiscountV2Result.SendDiscountSuccess sendDiscountSuccess = (WannaDiscountV2Result.SendDiscountSuccess) wannaDiscountV2Result;
                this.this$0.showMessage(sendDiscountSuccess.getMessage(), sendDiscountSuccess.getNotificationButton() != null ? new Action(sendDiscountSuccess.getNotificationButton().getTitle(), false, new WannaDiscountV2ViewHolder$onAttach$1$1$1(this.this$0, wannaDiscountV2Result), 2, null) : null);
                composerReferences = this.this$0.refs;
                ComposerExtKt.sendResultToTargetFragment(composerReferences.getContainer(), 1703, AnonymousClass2.INSTANCE);
                composerReferences2 = this.this$0.refs;
                composerReferences2.getNavigator().popBackStack();
            } else if (wannaDiscountV2Result instanceof WannaDiscountV2Result.SendDiscountError) {
                this.this$0.showErrorMessage(StringProvider.getString(R$string.common_universal_network_error));
            } else if (wannaDiscountV2Result instanceof WannaDiscountV2Result.PriceError) {
                WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder = this.this$0;
                widgetWannaDiscountV2Binding = wannaDiscountV2ViewHolder.binding;
                TextFieldCellView wannaDiscountUserPriceInput = widgetWannaDiscountV2Binding.wannaDiscountUserPriceInput;
                Intrinsics.checkNotNullExpressionValue(wannaDiscountUserPriceInput, "wannaDiscountUserPriceInput");
                wannaDiscountV2ViewHolder.showError(wannaDiscountUserPriceInput, ((WannaDiscountV2Result.PriceError) wannaDiscountV2Result).getMessage(), 0, "priceErrorLabel");
                this.this$0.bindSendButton(sendButton, false);
            } else if (wannaDiscountV2Result instanceof WannaDiscountV2Result.QuantityError) {
                WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder2 = this.this$0;
                widgetWannaDiscountV2Binding2 = wannaDiscountV2ViewHolder2.binding;
                TextFieldCellView wannaDiscountUserQuantityInput = widgetWannaDiscountV2Binding2.wannaDiscountUserQuantityInput;
                Intrinsics.checkNotNullExpressionValue(wannaDiscountUserQuantityInput, "wannaDiscountUserQuantityInput");
                wannaDiscountV2ViewHolder2.showError(wannaDiscountUserQuantityInput, ((WannaDiscountV2Result.QuantityError) wannaDiscountV2Result).getMessage(), 0, "quantityErrorLabel");
                this.this$0.bindSendButton(sendButton, false);
            } else if (wannaDiscountV2Result instanceof WannaDiscountV2Result.PriceSuccess) {
                WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder3 = this.this$0;
                widgetWannaDiscountV2Binding3 = wannaDiscountV2ViewHolder3.binding;
                TextFieldCellView wannaDiscountUserPriceInput2 = widgetWannaDiscountV2Binding3.wannaDiscountUserPriceInput;
                Intrinsics.checkNotNullExpressionValue(wannaDiscountUserPriceInput2, "wannaDiscountUserPriceInput");
                wannaDiscountV2ViewHolder3.hideError(wannaDiscountUserPriceInput2, 0);
                this.this$0.bindSendButton(sendButton, ((WannaDiscountV2Result.PriceSuccess) wannaDiscountV2Result).getButtonEnabled());
            } else if (wannaDiscountV2Result instanceof WannaDiscountV2Result.QuantitySuccess) {
                WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder4 = this.this$0;
                widgetWannaDiscountV2Binding4 = wannaDiscountV2ViewHolder4.binding;
                TextFieldCellView wannaDiscountUserQuantityInput2 = widgetWannaDiscountV2Binding4.wannaDiscountUserQuantityInput;
                Intrinsics.checkNotNullExpressionValue(wannaDiscountUserQuantityInput2, "wannaDiscountUserQuantityInput");
                i11 = this.this$0.dp8;
                wannaDiscountV2ViewHolder4.hideError(wannaDiscountUserQuantityInput2, i11);
                this.this$0.bindSendButton(sendButton, ((WannaDiscountV2Result.QuantitySuccess) wannaDiscountV2Result).getButtonEnabled());
            } else {
                if (!(wannaDiscountV2Result instanceof WannaDiscountV2Result.UpdateDiscount)) {
                    throw new o();
                }
                WannaDiscountV2VO boundedData2 = this.this$0.getBoundedData();
                if (boundedData2 != null) {
                    boundedData2.setDiscounts(((WannaDiscountV2Result.UpdateDiscount) wannaDiscountV2Result).getDiscounts());
                }
                this.this$0.bindDiscounts(((WannaDiscountV2Result.UpdateDiscount) wannaDiscountV2Result).getDiscounts());
            }
        }
    }
}

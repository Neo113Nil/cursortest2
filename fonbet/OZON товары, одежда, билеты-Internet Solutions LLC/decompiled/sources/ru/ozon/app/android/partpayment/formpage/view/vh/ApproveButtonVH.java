package ru.ozon.app.android.partpayment.formpage.view.vh;

import EI.a;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldApproveButtonBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/ApproveButtonVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "", "onButtonClicked", "Lkotlin/Function2;", "", "onErrorFoundClicked", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldApproveButtonBinding;", "bindingSelectorAddresses", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldApproveButtonBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApproveButtonVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldApproveButtonBinding bindingSelectorAddresses;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function1<DynamicFormFieldVH, Unit> onButtonClicked;
    private final Function2<DynamicFormFieldVH, String, Unit> onErrorFoundClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApproveButtonVH(@NotNull View containerView, @NotNull Function1<? super DynamicFormFieldVH, Unit> onButtonClicked, Function2<? super DynamicFormFieldVH, ? super String, Unit> function2) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
        this.containerView = containerView;
        this.onButtonClicked = onButtonClicked;
        this.onErrorFoundClicked = function2;
        ItemDynamicFormFieldApproveButtonBinding bind = ItemDynamicFormFieldApproveButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.bindingSelectorAddresses = bind;
        bind.finishBtn.setOnClickListener(new a(this, 7));
        bind.errorBtn.setOnClickListener(new EJ.a(this, 5));
        bind.descriptionTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ApproveButtonVH approveButtonVH, View view) {
        approveButtonVH.onButtonClicked.invoke(approveButtonVH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ApproveButtonVH approveButtonVH, View view) {
        String errorFoundDeeplink;
        Function2<DynamicFormFieldVH, String, Unit> function2;
        FormPageVO.Field field = approveButtonVH.getField();
        FormPageVO.Field.ApproveButton approveButton = field instanceof FormPageVO.Field.ApproveButton ? (FormPageVO.Field.ApproveButton) field : null;
        if (approveButton == null || (errorFoundDeeplink = approveButton.getErrorFoundDeeplink()) == null || (function2 = approveButtonVH.onErrorFoundClicked) == null) {
            return;
        }
        function2.invoke(approveButtonVH, errorFoundDeeplink);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.ApproveButton approveButton = (FormPageVO.Field.ApproveButton) item;
        this.bindingSelectorAddresses.finishBtn.setText(approveButton.getTitle());
        this.bindingSelectorAddresses.finishBtn.setContentDescription(approveButton.getTitle());
        this.bindingSelectorAddresses.finishBtn.setEnabled(approveButton.getIsEnabled());
        AppCompatTextView descriptionTv = this.bindingSelectorAddresses.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextViewExtKt.setTextOrGone(descriptionTv, approveButton.getDescription());
        this.bindingSelectorAddresses.descriptionTv.setContentDescription(approveButton.getDescription());
        AppCompatTextView errorBtn = this.bindingSelectorAddresses.errorBtn;
        Intrinsics.checkNotNullExpressionValue(errorBtn, "errorBtn");
        ViewExtKt.showOrGone(errorBtn, Boolean.valueOf(approveButton.getShowErrorBtn()));
    }
}

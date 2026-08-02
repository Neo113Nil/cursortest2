package ru.ozon.app.android.partpayment.formpage.view.vh;

import Cw.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldUploadButtonBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/UploadButtonVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/MeasureVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "", "onButtonClicked", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "onViewMeasured", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldUploadButtonBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldUploadButtonBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UploadButtonVH extends DynamicFormFieldVH implements MeasureVH {

    @NotNull
    private final ItemDynamicFormFieldUploadButtonBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function1<DynamicFormFieldVH, Unit> onButtonClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UploadButtonVH(@NotNull View containerView, @NotNull Function1<? super DynamicFormFieldVH, Unit> onButtonClicked) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
        this.containerView = containerView;
        this.onButtonClicked = onButtonClicked;
        ItemDynamicFormFieldUploadButtonBinding bind = ItemDynamicFormFieldUploadButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.finishBtn.setOnClickListener(new b(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(UploadButtonVH uploadButtonVH, View view) {
        uploadButtonVH.onButtonClicked.invoke(uploadButtonVH);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.UploadPhotoButton uploadPhotoButton = (FormPageVO.Field.UploadPhotoButton) item;
        this.binding.finishBtn.setText(uploadPhotoButton.getTitle());
        this.binding.finishBtn.setContentDescription(uploadPhotoButton.getTitle());
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.MeasureVH
    public void onViewMeasured(@NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Integer valueOf = Integer.valueOf(((parent.getHeight() - this.itemView.getTop()) - this.itemView.getHeight()) + i11);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (intValue != i11) {
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, intValue, 0, 0);
            this.itemView.requestLayout();
        }
    }
}

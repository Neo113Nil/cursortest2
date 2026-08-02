package ru.ozon.app.android.travel.molecules.view.commonInput.v1.view;

import IW.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsTextInputBinding;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J-\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonDateInputView;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/AbstractCommonInputView;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "item", "", "updateValue", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;)V", "bindError", "icon", "bindOrGoneRightIcon", "(Ljava/lang/Integer;)V", "bindOrGoneLeftIcon", "Lkotlin/Function1;", "", "onDateInputClicked", "bind", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsTextInputBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsTextInputBinding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonDateInputView extends AbstractCommonInputView<CommonInputVO.DateCommonInputVO> {

    @NotNull
    private final ViewCommonInputsTextInputBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonDateInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(Function1 function1, CommonInputVO.DateCommonInputVO dateCommonInputVO, View view) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(dateCommonInputVO.getId()));
        }
    }

    public final void bind(@NotNull CommonInputVO.DateCommonInputVO item, Function1<? super Long, Unit> onDateInputClicked) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.binding.commonInputTextInputEt;
        appCompatTextView.setText(item.getValue());
        appCompatTextView.setFocusable(false);
        appCompatTextView.setEnabled(item.getIsEnabled());
        appCompatTextView.setOnClickListener(new a(6, onDateInputClicked, item));
        appCompatTextView.setContentDescription(item.getPlaceholder());
        bindError(item);
        TravelTextInputLayout travelTextInputLayout = this.binding.commonInputTextInputMtil;
        travelTextInputLayout.setHint(item.getPlaceholder());
        travelTextInputLayout.setEnabled(item.getIsEnabled());
        bindOrGoneLeftIcon(item.getLeftIcon());
        bindOrGoneRightIcon(item.getRightIcon());
    }

    public void bindError(@NotNull CommonInputVO.DateCommonInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.binding.commonInputTextInputErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
        this.binding.commonInputTextInputMtil.setShowError(item.getIsErrorVisible());
    }

    protected void bindOrGoneLeftIcon(Integer icon) {
        if (icon != null) {
            TravelTextInputLayout.showLeftImageView$default(this.binding.commonInputTextInputMtil, icon.intValue(), null, 2, null);
        } else {
            this.binding.commonInputTextInputMtil.hideLeftImageView();
        }
    }

    protected void bindOrGoneRightIcon(Integer icon) {
        if (icon != null) {
            TravelTextInputLayout.showRightImageView$default(this.binding.commonInputTextInputMtil, icon.intValue(), null, 2, null);
        } else {
            this.binding.commonInputTextInputMtil.hideRightImageView();
        }
    }

    public void updateValue(@NotNull CommonInputVO.DateCommonInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputTextInputEt.setText(item.getValue());
    }

    public /* synthetic */ CommonDateInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonDateInputView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCommonInputsTextInputBinding inflate = ViewCommonInputsTextInputBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}

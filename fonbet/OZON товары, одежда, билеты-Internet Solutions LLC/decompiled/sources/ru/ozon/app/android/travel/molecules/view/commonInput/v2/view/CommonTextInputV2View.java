package ru.ozon.app.android.travel.molecules.view.commonInput.v2.view;

import Em0.c;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsV2EditInputBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010\u0012J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b+\u0010\u0012J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0018\u00108\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/AbstractCommonInputV2View;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "item", "bindError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "icon", "bindOrGoneRightIcon", "(Ljava/lang/Integer;)V", "bindOrGoneLeftIcon", "", "inputIsFocused", "()Z", "showMaskPattern", "hideMaskPattern", "Landroid/text/TextWatcher;", "textWatcher", "setTextWatcher", "(Landroid/text/TextWatcher;)V", "LEm0/c;", "formatWatcher", "setFormatWatcher", "(LEm0/c;)V", "", "getValue", "()Ljava/lang/String;", "isTurnOnErrorLogic", "bind", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Z)V", "bindOrGone", "updatePlaceholder", "Landroid/text/InputFilter;", "inputFilter", "setInputFilter", "(Landroid/text/InputFilter;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2EditInputBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2EditInputBinding;", "getBinding", "()Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2EditInputBinding;", "iconColor", "I", "Landroid/text/TextWatcher;", "_formatWatcher", "LEm0/c;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonTextInputV2View extends AbstractCommonInputV2View<CommonInputV2VO.TextInputV2> {
    private c _formatWatcher;

    @NotNull
    private final ViewCommonInputsV2EditInputBinding binding;
    private final int iconColor;
    private TextWatcher textWatcher;

    public /* synthetic */ CommonTextInputV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public static /* synthetic */ void bind$default(CommonTextInputV2View commonTextInputV2View, CommonInputV2VO.TextInputV2 textInputV2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        commonTextInputV2View.bind(textInputV2, z11);
    }

    public final void bind(@NotNull CommonInputV2VO.TextInputV2 item, boolean isTurnOnErrorLogic) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatEditText editTextInputView = this.binding.commonInputV2TextInputMtil.getEditTextInputView();
        editTextInputView.setInputType(item.getInputType());
        Integer maxLength = item.getMaxLength();
        if (maxLength != null) {
            editTextInputView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength.intValue())});
        }
        editTextInputView.setText(item.getValue());
        editTextInputView.setSelection(getValue().length());
        editTextInputView.setEnabled(item.getIsEnabled());
        editTextInputView.setImeOptions(item.getImeOptions());
        if (item.getIsMultiline()) {
            editTextInputView.setMaxLines(Integer.MAX_VALUE);
            editTextInputView.setHorizontallyScrolling(false);
        } else {
            editTextInputView.setMaxLines(1);
            editTextInputView.setHorizontallyScrolling(true);
        }
        TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2 = this.binding.commonInputV2TextInputMtil;
        travelEditTextInputLayoutV2.setMaskPattern(item.getMaskPattern());
        travelEditTextInputLayoutV2.setHint(item.getPlaceholder());
        travelEditTextInputLayoutV2.setEnabled(item.getIsEnabled());
        editTextInputView.setContentDescription(item.getPlaceholder());
        if (isTurnOnErrorLogic) {
            bindError(item);
        }
        bindOrGoneLeftIcon(item.getLeftIcon());
        bindOrGoneRightIcon(item.getRightIcon());
    }

    public void bindError(@NotNull CommonInputV2VO.TextInputV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputV2TextInputMtil.setShowError(item.getIsErrorVisible());
        AppCompatTextView appCompatTextView = this.binding.commonInputV2TextInputErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
    }

    public final void bindOrGone(CommonInputV2VO.TextInputV2 item) {
        setVisibility(item == null ? 8 : 0);
        if (item != null) {
            bind$default(this, item, false, 2, null);
        }
    }

    protected void bindOrGoneLeftIcon(Integer icon) {
        if (icon != null) {
            this.binding.commonInputV2TextInputMtil.showLeftImageView(icon.intValue(), Integer.valueOf(this.iconColor));
        } else {
            this.binding.commonInputV2TextInputMtil.hideLeftImageView();
        }
    }

    protected void bindOrGoneRightIcon(Integer icon) {
        if (icon != null) {
            this.binding.commonInputV2TextInputMtil.showRightImageView(icon.intValue(), Integer.valueOf(this.iconColor));
        } else {
            this.binding.commonInputV2TextInputMtil.hideRightImageView();
        }
    }

    @NotNull
    public final ViewCommonInputsV2EditInputBinding getBinding() {
        return this.binding;
    }

    @NotNull
    public final String getValue() {
        return String.valueOf(this.binding.commonInputV2TextInputMtil.getEditTextInputView().getText());
    }

    public final void hideMaskPattern() {
        this.binding.commonInputV2TextInputMtil.hideMaskPatternView();
    }

    public final boolean inputIsFocused() {
        return this.binding.commonInputV2TextInputMtil.getEditTextInputView().isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            this.binding.commonInputV2TextInputMtil.getEditTextInputView().addTextChangedListener(textWatcher);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            this.binding.commonInputV2TextInputMtil.getEditTextInputView().removeTextChangedListener(textWatcher);
        }
        super.onDetachedFromWindow();
    }

    public final void setFormatWatcher(c formatWatcher) {
        AppCompatEditText editTextInputView = this.binding.commonInputV2TextInputMtil.getEditTextInputView();
        c cVar = this._formatWatcher;
        if (cVar != null) {
            cVar.e();
        }
        this._formatWatcher = null;
        if (formatWatcher == null) {
            return;
        }
        formatWatcher.c(editTextInputView);
        formatWatcher.d(editTextInputView.getText());
        this._formatWatcher = formatWatcher;
    }

    public final void setInputFilter(@NotNull InputFilter inputFilter) {
        Intrinsics.checkNotNullParameter(inputFilter, "inputFilter");
        this.binding.commonInputV2TextInputMtil.getEditTextInputView().setFilters(new InputFilter[]{inputFilter});
    }

    public final void setTextWatcher(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.textWatcher = textWatcher;
    }

    public final void showMaskPattern() {
        this.binding.commonInputV2TextInputMtil.showMaskPatternView();
    }

    public final void updatePlaceholder(@NotNull CommonInputV2VO.TextInputV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputV2TextInputMtil.setHint(item.getPlaceholder());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTextInputV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconColor = ThemeExtKt.themeColor(context, R$attr.graphicTertiary);
        this.binding = ViewCommonInputsV2EditInputBinding.inflate(LayoutInflater.from(context), this);
    }
}

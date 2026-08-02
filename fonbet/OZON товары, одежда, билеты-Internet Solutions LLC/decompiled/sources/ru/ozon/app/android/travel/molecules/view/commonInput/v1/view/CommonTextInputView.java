package ru.ozon.app.android.travel.molecules.view.commonInput.v1.view;

import Em0.c;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsEditInputBinding;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0011\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010\u0012J#\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020'2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0-¢\u0006\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/AbstractCommonInputView;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "item", "updateValue", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)V", "bindError", "icon", "bindOrGoneRightIcon", "(Ljava/lang/Integer;)V", "bindOrGoneLeftIcon", "Landroid/text/TextWatcher;", "textWatcher", "setTextWatcher", "(Landroid/text/TextWatcher;)V", "LEm0/c;", "formatWatcher", "setFormatWatcher", "(LEm0/c;)V", "getFormatWatcher", "()LEm0/c;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "", "isTurnOnErrorLogic", "bind", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;Z)V", "bindOrGone", "isNeedFocus", "Lkotlin/Function0;", "onFinish", "setFocus", "(ZLkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsEditInputBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsEditInputBinding;", "getBinding", "()Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsEditInputBinding;", "Landroid/text/TextWatcher;", "_formatWatcher", "LEm0/c;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonTextInputView extends AbstractCommonInputView<CommonInputVO.TextCommonInputVO> {
    private c _formatWatcher;

    @NotNull
    private final ViewCommonInputsEditInputBinding binding;
    private TextWatcher textWatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonTextInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bind$default(CommonTextInputView commonTextInputView, CommonInputVO.TextCommonInputVO textCommonInputVO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        commonTextInputView.bind(textCommonInputVO, z11);
    }

    public final void bind(@NotNull CommonInputVO.TextCommonInputVO item, boolean isTurnOnErrorLogic) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatEditText appCompatEditText = this.binding.commonInputTextInputEt;
        appCompatEditText.setInputType(item.getInputType());
        Integer maxLength = item.getMaxLength();
        if (maxLength != null) {
            appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength.intValue())});
        }
        appCompatEditText.setText(item.getValue());
        appCompatEditText.setSelection(getValue().length());
        appCompatEditText.setEnabled(item.getIsEnabled());
        appCompatEditText.setImeOptions(item.getImeOptions());
        if (item.getIsMultiline()) {
            appCompatEditText.setMaxLines(Integer.MAX_VALUE);
            appCompatEditText.setHorizontallyScrolling(false);
        } else {
            appCompatEditText.setMaxLines(1);
            appCompatEditText.setHorizontallyScrolling(true);
        }
        TravelTextInputLayout travelTextInputLayout = this.binding.commonInputTextInputMtil;
        travelTextInputLayout.setHint(item.getPlaceholder());
        travelTextInputLayout.setEnabled(item.getIsEnabled());
        appCompatEditText.setContentDescription(item.getPlaceholder());
        if (isTurnOnErrorLogic) {
            bindError(item);
        }
        bindOrGoneLeftIcon(item.getLeftIcon());
        bindOrGoneRightIcon(item.getRightIcon());
    }

    public void bindError(@NotNull CommonInputVO.TextCommonInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputTextInputMtil.setShowError(item.getIsErrorVisible());
        AppCompatTextView appCompatTextView = this.binding.commonInputTextInputErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
    }

    public final void bindOrGone(CommonInputVO.TextCommonInputVO item) {
        setVisibility(item == null ? 8 : 0);
        if (item != null) {
            bind$default(this, item, false, 2, null);
        }
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

    @NotNull
    public final ViewCommonInputsEditInputBinding getBinding() {
        return this.binding;
    }

    /* renamed from: getFormatWatcher, reason: from getter */
    public final c get_formatWatcher() {
        return this._formatWatcher;
    }

    @NotNull
    public final String getValue() {
        return String.valueOf(this.binding.commonInputTextInputEt.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            this.binding.commonInputTextInputEt.addTextChangedListener(textWatcher);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            this.binding.commonInputTextInputEt.removeTextChangedListener(textWatcher);
        }
        super.onDetachedFromWindow();
    }

    public final void setFocus(boolean isNeedFocus, @NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if (isNeedFocus) {
            final AppCompatEditText appCompatEditText = this.binding.commonInputTextInputEt;
            Intrinsics.f(appCompatEditText);
            if (!appCompatEditText.isLaidOut() || appCompatEditText.isLayoutRequested()) {
                appCompatEditText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView$setFocus$lambda$11$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        AppCompatEditText.this.requestFocus();
                        Intrinsics.f(AppCompatEditText.this);
                        KeyboardUtilsKt.showKeyboard(AppCompatEditText.this);
                        onFinish.invoke();
                    }
                });
                return;
            }
            appCompatEditText.requestFocus();
            KeyboardUtilsKt.showKeyboard(appCompatEditText);
            onFinish.invoke();
        }
    }

    public final void setFormatWatcher(c formatWatcher) {
        AppCompatEditText appCompatEditText = this.binding.commonInputTextInputEt;
        c cVar = this._formatWatcher;
        if (cVar != null) {
            cVar.e();
        }
        this._formatWatcher = null;
        if (formatWatcher == null) {
            return;
        }
        formatWatcher.c(appCompatEditText);
        formatWatcher.d(appCompatEditText.getText());
        this._formatWatcher = formatWatcher;
    }

    public final void setTextWatcher(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.textWatcher = textWatcher;
    }

    public void updateValue(@NotNull CommonInputVO.TextCommonInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatEditText appCompatEditText = this.binding.commonInputTextInputEt;
        Integer valueOf = Integer.valueOf(appCompatEditText.getSelectionStart());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue > item.getValue().length()) {
            valueOf = null;
        }
        int intValue2 = valueOf != null ? valueOf.intValue() : item.getValue().length();
        appCompatEditText.setText(item.getValue());
        appCompatEditText.setSelection(intValue2);
    }

    public /* synthetic */ CommonTextInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTextInputView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCommonInputsEditInputBinding inflate = ViewCommonInputsEditInputBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final void updateValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.binding.commonInputTextInputEt.setText(value);
    }
}

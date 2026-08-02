package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.OtpMaskFormatter;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpInputManager;", "", "inputView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "formatter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter;", "<init>", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter;)V", "otpTextWatcher", "Landroid/text/TextWatcher;", "otpSent", "", "setupMaskInput", "", FormPageDTO.Field.FIELD_TYPE_MASK, "", "onOtpCompleted", "Lkotlin/Function1;", "removeMaskInput", "clearAndReset", "detach", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpInputManager {

    @NotNull
    private final OtpMaskFormatter formatter;

    @NotNull
    private final OzonTextInputLayout inputView;
    private boolean otpSent;
    private TextWatcher otpTextWatcher;

    public OtpInputManager(@NotNull OzonTextInputLayout inputView, @NotNull OtpMaskFormatter formatter) {
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.inputView = inputView;
        this.formatter = formatter;
    }

    public final void clearAndReset() {
        this.otpSent = false;
    }

    public final void detach() {
        removeMaskInput();
    }

    public final void removeMaskInput() {
        TextWatcher textWatcher = this.otpTextWatcher;
        if (textWatcher != null) {
            this.inputView.getInputViewGroup().getInputView().removeTextChangedListener(textWatcher);
            this.otpTextWatcher = null;
        }
        this.inputView.setKeyboardType(OzonTextInputLayoutModel.KeyboardType.TEXT);
        this.inputView.getInputViewGroup().getInputView().setFilters(new InputFilter[0]);
        this.formatter.reset();
        this.otpSent = false;
    }

    public final void setupMaskInput(@NotNull final String mask, @NotNull final Function1<? super String, Unit> onOtpCompleted) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(onOtpCompleted, "onOtpCompleted");
        if (this.otpTextWatcher != null) {
            removeMaskInput();
        }
        this.otpSent = false;
        this.formatter.reset();
        this.inputView.getInputViewGroup().getInputView().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(mask.length())});
        this.otpTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.OtpInputManager$setupMaskInput$2
            private boolean skipChange;

            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable otp) {
                OtpMaskFormatter otpMaskFormatter;
                OtpMaskFormatter otpMaskFormatter2;
                boolean z11;
                Intrinsics.checkNotNullParameter(otp, "otp");
                if (this.skipChange) {
                    return;
                }
                int selectionEnd = Selection.getSelectionEnd(otp);
                otpMaskFormatter = OtpInputManager.this.formatter;
                OtpMaskFormatter.OtpFormatResult formatByMask = otpMaskFormatter.formatByMask(otp.toString(), mask, selectionEnd);
                this.skipChange = true;
                otp.replace(0, otp.length(), formatByMask.getFormattedText());
                Selection.setSelection(otp, formatByMask.getCursorPosition());
                this.skipChange = false;
                otpMaskFormatter2 = OtpInputManager.this.formatter;
                int maskLength = otpMaskFormatter2.getMaskLength(mask);
                String formattedText = formatByMask.getFormattedText();
                StringBuilder sb2 = new StringBuilder();
                int length = formattedText.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = formattedText.charAt(i11);
                    if (Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                if (sb3.length() >= maskLength) {
                    z11 = OtpInputManager.this.otpSent;
                    if (!z11) {
                        OtpInputManager.this.otpSent = true;
                        onOtpCompleted.invoke(sb3);
                        return;
                    }
                }
                if (sb3.length() < maskLength) {
                    OtpInputManager.this.otpSent = false;
                }
            }
        };
        this.inputView.getInputViewGroup().getInputView().addTextChangedListener(this.otpTextWatcher);
    }
}

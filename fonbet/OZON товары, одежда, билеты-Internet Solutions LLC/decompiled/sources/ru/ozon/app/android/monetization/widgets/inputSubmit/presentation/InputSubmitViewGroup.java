package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.R$id;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010 R\u001b\u0010)\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getInputText", "()Ljava/lang/String;", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "", "bindTextField", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;)V", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;", "inputSubmitVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "textWatcher", "setTextWatcher", "(Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;)V", "error", "showError", "(Ljava/lang/String;)V", "hideError", "()V", "text", "setInputText", "errorColor$delegate", "LSc/j;", "getErrorColor", "()I", "errorColor", "textField", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getInputView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "inputView", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputSubmitViewGroup extends LinearLayout {

    @NotNull
    private final ButtonV3View button;

    /* renamed from: errorColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorColor;

    @NotNull
    private final TextFieldCellView textField;

    public /* synthetic */ InputSubmitViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindTextField(TextFieldCellView textFieldCellView, InputSubmitVO.TextArea textArea) {
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setInputLabelText(textArea.getPlaceholder());
        textFieldCellView.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        textFieldCellView.setTruncateOnLostFocus(true);
    }

    private final int getErrorColor() {
        return ((Number) this.errorColor.getValue()).intValue();
    }

    private final String getInputText() {
        Editable text = getInputView().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    private final OzonTextInput getInputView() {
        return this.textField.getMainView().getInputViewGroup().getInputView();
    }

    public final void bind(@NotNull InputSubmitVO inputSubmitVO, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(inputSubmitVO, "inputSubmitVO");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        TestInfo testInfo = inputSubmitVO.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        bindTextField(this.textField, inputSubmitVO.getTextArea());
        ButtonV3HolderKt.bind(this.button, inputSubmitVO.getButton(), onAction);
    }

    public final void hideError() {
        TextFieldCellView textFieldCellView = this.textField;
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.getAddonView().setText((CharSequence) null);
    }

    public final void setInputText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.d(getInputText(), text)) {
            return;
        }
        getInputView().setText(text);
    }

    public final void setTextWatcher(@NotNull OzonTextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        getInputView().addTextChangedListener(textWatcher);
    }

    public final void showError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        TextFieldCellView textFieldCellView = this.textField;
        textFieldCellView.getAddonView().setText(error);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        textFieldCellView.getAddonView().setTextColor(getErrorColor());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSubmitViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.errorColor = k.b(new InputSubmitViewGroup$errorColor$2(context));
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        textFieldCellView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        this.textField = textFieldCellView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        buttonV3View.setId(R$id.submitButtonView);
        layoutParams.setMarginStart(dimens.getDP_16());
        layoutParams.setMarginEnd(dimens.getDP_16());
        buttonV3View.setLayoutParams(layoutParams);
        this.button = buttonV3View;
        setId(R$id.overlayButtonRoot);
        setOrientation(1);
        addView(textFieldCellView);
        addView(buttonV3View);
    }
}

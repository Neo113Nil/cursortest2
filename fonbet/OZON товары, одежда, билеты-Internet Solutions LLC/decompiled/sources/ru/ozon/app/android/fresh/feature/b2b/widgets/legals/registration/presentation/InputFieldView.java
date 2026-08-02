package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import JC.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.ViewType;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.InputFieldView;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationVI;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020\u0007*\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0014\u0010\u001d\u001a\u00020\u0007*\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010'\u001a\u00020\u0007*\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0014\u0010\u001d\u001a\u00020\u0007*\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\f\u0010,\u001a\u00020\u0007*\u00020\u0016H\u0002J\f\u0010,\u001a\u00020\u0007*\u00020\u0018H\u0002J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputFieldView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "onClickListener", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "boundData", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "inputType", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "getInputType", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTv", "fieldContainer", "Landroid/widget/FrameLayout;", "input", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/android/textArea/TextAreaView;", "overlayView", "Landroid/view/View;", "checkBox", "Lru/ozon/uni/android/cell/CellView;", "bind", "field", "getInputText", "setInputText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "showError", "errorText", "disableInput", "getInputData", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputData;", "bindOrGone", "inputDto", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "isCheckboxMarked", "", "hideError", "onCheckboxClicked", "isSelected", "readOnly", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class InputFieldView extends LinearLayout {
    private RegistrationVI.FieldVI boundData;

    @NotNull
    private final CellView checkBox;

    @NotNull
    private final FrameLayout fieldContainer;

    @NotNull
    private final TextFieldCellView input;

    @NotNull
    private final View overlayView;

    @NotNull
    private final TextAtomV2View subtitleTv;

    @NotNull
    private final TextAreaView textArea;

    @NotNull
    private final TextAtomV2View titleTv;
    public static final int $stable = 8;
    private static final int horizontalPadding = UiExtKt.toPx(Paddings.PADDING_500.getPx());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.TEXT_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFieldView(@NotNull Context context, @NotNull final Function1<? super String, Unit> onClickListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        this.titleTv = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        this.subtitleTv = textAtomV2View2;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.fieldContainer = frameLayout;
        final TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = horizontalPadding;
        layoutParams.setMargins(i11, 0, i11, 0);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        SmartLabel addonView = textFieldCellView.getAddonView();
        Dimens dimens = Dimens.INSTANCE;
        addonView.setPadding(dimens.getDP_16(), dimens.getDP_4(), 0, 0);
        textFieldCellView.getMainView().getInputViewGroup().getInputView().addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.InputFieldView$input$lambda$4$lambda$3$lambda$2$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                InputFieldView.this.hideError(textFieldCellView);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        textFieldCellView.setLayoutParams(layoutParams);
        this.input = textFieldCellView;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i11, 0, i11, 0);
        TextAreaView.INSTANCE.doOnTextChanged(textAreaView, new InputFieldView$textArea$1$1$1(this, textAreaView));
        textAreaView.setLayoutParams(layoutParams2);
        this.textArea = textAreaView;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(i11, 0, i11, 0);
        view.setLayoutParams(layoutParams3);
        view.setClickable(true);
        view.setFocusable(true);
        view.setVisibility(8);
        view.setOnClickListener(new View.OnClickListener() { // from class: hv.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InputFieldView.overlayView$lambda$9$lambda$8(Function1.this, this, view2);
            }
        });
        this.overlayView = view;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.getLeftBlock().getCheckBoxView().setOnClickListener(new c(1, this, cellView));
        this.checkBox = cellView;
        setOrientation(1);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(frameLayout);
        addView(cellView);
        frameLayout.addView(textFieldCellView);
        frameLayout.addView(textAreaView);
        frameLayout.addView(view);
    }

    private final void bindOrGone(TextFieldCellView textFieldCellView, RegistrationVI.FieldVI.InputVI inputVI) {
        if (inputVI == null || inputVI.getViewType() != ViewType.INPUT) {
            ViewExtKt.gone(textFieldCellView);
        } else {
            bind(textFieldCellView, inputVI);
            ViewExtKt.show(textFieldCellView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkBox$lambda$11$lambda$10(InputFieldView inputFieldView, CellView cellView, View view) {
        RegistrationVI.FieldVI.InputVI input;
        boolean z11 = false;
        boolean z12 = cellView.getLeftBlock().getCheckBoxView().getState() == CheckBoxDTO.CheckboxStatus.SELECTED;
        RegistrationVI.FieldVI fieldVI = inputFieldView.boundData;
        if (fieldVI != null && (input = fieldVI.getInput()) != null && input.getReadOnly()) {
            z11 = true;
        }
        inputFieldView.onCheckboxClicked(z12, z11);
    }

    private final ViewType getInputType() {
        RegistrationVI.FieldVI.InputVI input;
        RegistrationVI.FieldVI fieldVI = this.boundData;
        if (fieldVI == null || (input = fieldVI.getInput()) == null) {
            return null;
        }
        return input.getViewType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        RegistrationVI.FieldVI.InputVI input;
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        RegistrationVI.FieldVI fieldVI = this.boundData;
        textFieldCellView.setLabelText((fieldVI == null || (input = fieldVI.getInput()) == null) ? null : input.getCaption());
    }

    private final boolean isCheckboxMarked() {
        if (this.checkBox.getVisibility() == 8) {
            return false;
        }
        return this.checkBox.getLeftBlock().getCheckBoxView().isChecked();
    }

    private final void onCheckboxClicked(boolean isSelected, boolean readOnly) {
        if (this.textArea.getInputHasFocus() || this.input.hasFocus()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            inputMethodManager.hideSoftInputFromWindow(this.input.getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(this.textArea.getWindowToken(), 0);
            this.textArea.clearFocus();
            this.input.clearFocus();
        }
        if (!isSelected) {
            this.input.setInputState(readOnly ? OzonTextInputLayoutModel.State.DISABLED : OzonTextInputLayoutModel.State.DEFAULT);
            this.textArea.setState(readOnly ? TextAreaView.State.READ_ONLY : TextAreaView.State.DEFAULT);
        } else {
            hideError(this.input);
            hideError(this.textArea);
            this.input.setInputState(OzonTextInputLayoutModel.State.DISABLED);
            this.textArea.setState(TextAreaView.State.DISABLED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void overlayView$lambda$9$lambda$8(Function1 function1, InputFieldView inputFieldView, View view) {
        function1.invoke(inputFieldView.getInputText());
    }

    public final void bind(@NotNull RegistrationVI.FieldVI field) {
        Intrinsics.checkNotNullParameter(field, "field");
        TextHolderKt.bindOrGone$default(this.titleTv, field.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTv, field.getSubtitle(), null, 2, null);
        bindOrGone(this.input, field.getInput());
        bindOrGone(this.textArea, field.getInput());
        CellHolderKt.bindOrGone$default(this.checkBox, field.getCheckbox(), null, 2, null);
        View view = this.overlayView;
        RegistrationVI.FieldVI.InputVI input = field.getInput();
        boolean z11 = false;
        if (input != null && input.getIsAddress()) {
            z11 = true;
        }
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(view, Boolean.valueOf(z11));
        this.boundData = field;
    }

    public final void disableInput() {
        this.checkBox.getLeftBlock().getCheckBoxView().setCheckboxState(CheckBoxDTO.CheckboxStatus.SELECTED);
        if (getInputType() == ViewType.INPUT) {
            hideError(this.input);
            this.input.setInputState(OzonTextInputLayoutModel.State.DISABLED);
        } else if (getInputType() == ViewType.TEXT_AREA) {
            hideError(this.textArea);
            this.textArea.setState(TextAreaView.State.READ_ONLY);
        }
    }

    @NotNull
    public final InputData getInputData() {
        return new InputData(getInputText(), isCheckboxMarked());
    }

    @NotNull
    public final String getInputText() {
        String inputText;
        ViewType inputType = getInputType();
        int i11 = inputType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        return i11 != 1 ? (i11 == 2 && (inputText = this.textArea.getInputText()) != null) ? inputText : "" : String.valueOf(this.input.getInputText());
    }

    public final void setInputText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (getInputType() == ViewType.INPUT) {
            this.input.setInputText(value);
        } else if (getInputType() == ViewType.TEXT_AREA) {
            this.textArea.setInputText(value);
        }
    }

    public final void showError(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        if (getInputType() == ViewType.INPUT) {
            this.input.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
            this.input.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
            TextFieldCellView textFieldCellView = this.input;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
            this.input.setLabelText(errorText);
            return;
        }
        if (getInputType() == ViewType.TEXT_AREA) {
            this.textArea.setState(TextAreaView.State.DEFAULT);
            this.textArea.setStatus(TextAreaView.Status.ERROR);
            TextAreaView textAreaView = this.textArea;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textAreaView.setCaptionColor(Integer.valueOf(ResourceExtKt.color(context2, UniColors.TEXT_NEGATIVE.getResId())));
            this.textArea.setCaption(errorText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextAreaView textAreaView) {
        RegistrationVI.FieldVI.InputVI input;
        textAreaView.setStatus(TextAreaView.Status.NEUTRAL);
        RegistrationVI.FieldVI fieldVI = this.boundData;
        textAreaView.setCaption((fieldVI == null || (input = fieldVI.getInput()) == null) ? null : input.getCaption());
    }

    private final void bindOrGone(TextAreaView textAreaView, RegistrationVI.FieldVI.InputVI inputVI) {
        if (inputVI != null && inputVI.getViewType() == ViewType.TEXT_AREA) {
            bind(textAreaView, inputVI);
            ViewExtKt.show(textAreaView);
        } else {
            ViewExtKt.gone(textAreaView);
        }
    }

    private final void bind(TextFieldCellView textFieldCellView, RegistrationVI.FieldVI.InputVI inputVI) {
        textFieldCellView.setVisibility(0);
        String value = inputVI.getValue();
        if (value != null) {
            textFieldCellView.setInputText(value);
        }
        textFieldCellView.setInputLabelText(inputVI.getPlaceholder());
        textFieldCellView.setLabelText(inputVI.getCaption());
        textFieldCellView.setInputState(inputVI.getReadOnly() ? OzonTextInputLayoutModel.State.DISABLED : OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputStatus(inputVI.getReadOnly() ? OzonTextInputLayoutModel.Status.READONLY : OzonTextInputLayoutModel.Status.NEUTRAL);
        OzonTextInput inputView = textFieldCellView.getMainView().getInputViewGroup().getInputView();
        InputFilter[] filters = inputView.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        inputView.setFilters((InputFilter[]) C7705l.U(filters, new InputFilter.LengthFilter(inputVI.getMaxLength())));
        textFieldCellView.setInputKeyboardType(inputVI.getKeyboardType());
    }

    private final void bind(TextAreaView textAreaView, RegistrationVI.FieldVI.InputVI inputVI) {
        textAreaView.setVisibility(0);
        textAreaView.setInputText(inputVI.getValue());
        textAreaView.setLabel(inputVI.getPlaceholder());
        textAreaView.setCaption(inputVI.getCaption());
        textAreaView.setStatus(TextAreaView.Status.NEUTRAL);
        textAreaView.setState(inputVI.getReadOnly() ? TextAreaView.State.READ_ONLY : TextAreaView.State.DEFAULT);
        textAreaView.setMaxLength(inputVI.getMaxLength());
        textAreaView.setHasInfoIcon(false);
    }
}

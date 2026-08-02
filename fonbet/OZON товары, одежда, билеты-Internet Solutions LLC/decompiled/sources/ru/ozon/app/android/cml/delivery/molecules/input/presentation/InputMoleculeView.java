package ru.ozon.app.android.cml.delivery.molecules.input.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DelayedActionTextWatcher;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DigitalInputTextWatcher;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.MoneyInputTextWatcher;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.RawTextWatcher;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.label.data.LabelAddonWrapperPreset;
import ru.ozon.uni.android.cell.label.data.SmartLabelPresets;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\u0010R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010B\u001a\u00020@2\u0006\u0010A\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "item", "", "inputValue", "", "bindInput", "(Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Ljava/lang/String;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "config", "", "debounce", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bindEditText", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction;)V", "bindLabel", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;)V", "filterIsDigit", "(Ljava/lang/String;)Ljava/lang/String;", "hideKeyboard", "()V", "removeFocus", "bind", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/MoneyInputTextWatcher;", "moneyTextWatcher$delegate", "LSc/j;", "getMoneyTextWatcher", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/MoneyInputTextWatcher;", "moneyTextWatcher", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/RawTextWatcher;", "rawTextWatcher$delegate", "getRawTextWatcher", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/RawTextWatcher;", "rawTextWatcher", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DigitalInputTextWatcher;", "digitalTextWatcher$delegate", "getDigitalTextWatcher", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DigitalInputTextWatcher;", "digitalTextWatcher", "Lkotlin/Function1;", "onTextChanged", "Lkotlin/jvm/functions/Function1;", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "setOnTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "onDelayedAction", "Lkotlin/jvm/functions/Function2;", "getOnDelayedAction", "()Lkotlin/jvm/functions/Function2;", "setOnDelayedAction", "(Lkotlin/jvm/functions/Function2;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "executingAction", "Z", "getExecutingAction", "()Z", "setExecutingAction", "(Z)V", "input", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "getInput", "()Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputMoleculeView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final TextFieldPreset inputPreset = new TextFieldPreset(TextInputStyle.INSTANCE.createInput600Style(), new LabelAddonWrapperPreset(MainAddonSettings.copy$default(MainAddonWrapperSettings.INSTANCE.getVerticalEnd500Compact(), null, null, null, null, null, 0, 0, new LayoutPadding.zero(), null, null, 895, null), SmartLabelPresets.INSTANCE.getLeadingSubtitle300()));

    /* renamed from: digitalTextWatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j digitalTextWatcher;
    private boolean executingAction;

    @NotNull
    private final TextFieldCellView input;

    /* renamed from: moneyTextWatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j moneyTextWatcher;
    private Function2<? super String, ? super AtomAction, Unit> onDelayedAction;
    private Function1<? super String, Unit> onTextChanged;

    /* renamed from: rawTextWatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rawTextWatcher;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView$Companion;", "", "<init>", "()V", "", "INPUT_LABEL_LOCATOR", "Ljava/lang/String;", "ACCEPTED_MONEY_LETTERS", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InputMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindEditText(TextFieldCellView textFieldCellView, InputMoleculeVO.InputConfig inputConfig, Long l11, AtomAction atomAction) {
        Integer maxLength = inputConfig.getMaxLength();
        OzonTextInputLayoutExtKt.getEditText(textFieldCellView.getMainView()).setFilters(maxLength != null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength.intValue())} : new InputFilter[0]);
        if (inputConfig instanceof InputMoleculeVO.InputConfig.Money) {
            OzonTextInputLayout mainView = textFieldCellView.getMainView();
            MoneyInputTextWatcher moneyTextWatcher = getMoneyTextWatcher();
            moneyTextWatcher.setOnTextChange(new InputMoleculeView$bindEditText$2$1$1(this));
            moneyTextWatcher.setDelayedAction(new InputMoleculeView$bindEditText$2$1$2(atomAction, this));
            if (l11 != null) {
                moneyTextWatcher.setDebounce(l11.longValue());
            }
            moneyTextWatcher.setMaxLength(((InputMoleculeVO.InputConfig.Money) inputConfig).getMaxLength());
            OzonTextInputLayoutExtKt.getEditText(mainView).setKeyListener(DigitsKeyListener.getInstance("0123456789\u2009.,"));
            mainView.setTextWatcher(moneyTextWatcher);
            return;
        }
        if (inputConfig instanceof InputMoleculeVO.InputConfig.RawText) {
            OzonTextInputLayout mainView2 = textFieldCellView.getMainView();
            RawTextWatcher rawTextWatcher = getRawTextWatcher();
            rawTextWatcher.setOnTextChange(new InputMoleculeView$bindEditText$3$1$1(this));
            OzonTextInputLayoutExtKt.getEditText(mainView2).setInputType(16385);
            mainView2.setTextWatcher(rawTextWatcher);
            return;
        }
        if (!(inputConfig instanceof InputMoleculeVO.InputConfig.Digital)) {
            throw new o();
        }
        OzonTextInputLayout mainView3 = textFieldCellView.getMainView();
        DigitalInputTextWatcher digitalTextWatcher = getDigitalTextWatcher();
        digitalTextWatcher.setOnTextChange(new InputMoleculeView$bindEditText$4$1$1(this));
        InputMoleculeVO.InputConfig.Digital digital = (InputMoleculeVO.InputConfig.Digital) inputConfig;
        digitalTextWatcher.updateMask(digital.getMask());
        OzonTextInputLayoutExtKt.getEditText(mainView3).setKeyListener(DigitsKeyListener.getInstance(digitalTextWatcher.getAcceptedLetters(digital)));
        mainView3.setTextWatcher(digitalTextWatcher);
    }

    private final void bindInput(InputMoleculeVO item, String inputValue) {
        TextFieldCellView textFieldCellView = this.input;
        String placeholder = item.getPlaceholder();
        if (placeholder == null) {
            placeholder = "";
        }
        textFieldCellView.setInputLabelText(placeholder);
        OzonTextInputLayoutModel.State state = item.getState();
        if (state != null) {
            textFieldCellView.setInputState(state);
        }
        textFieldCellView.setInputStatus(item.getStatus());
        textFieldCellView.setInputKeyboardType(item.getConfig().getKeyboardType());
        textFieldCellView.inputCanReset(true);
        bindLabel(textFieldCellView, item);
        bindEditText(textFieldCellView, item.getConfig(), Long.valueOf(item.getDebounce()), item.getAction());
        if (inputValue != null) {
            textFieldCellView.setInputText(inputValue);
        }
    }

    private final void bindLabel(TextFieldCellView textFieldCellView, InputMoleculeVO inputMoleculeVO) {
        String message = inputMoleculeVO.getMessage();
        if (message == null || message.length() == 0) {
            textFieldCellView.getAddonView().setContentDescription("");
            textFieldCellView.setLabelText(null);
            textFieldCellView.getAddonView().setVisibility(8);
        } else {
            Context context = textFieldCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, inputMoleculeVO.getMessageColor().getResId()), 0.0f, 2, null);
            textFieldCellView.getAddonView().setContentDescription("inputLabel");
            textFieldCellView.setLabelText(inputMoleculeVO.getMessage());
            textFieldCellView.getAddonView().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String filterIsDigit(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private final DigitalInputTextWatcher getDigitalTextWatcher() {
        return (DigitalInputTextWatcher) this.digitalTextWatcher.getValue();
    }

    private final MoneyInputTextWatcher getMoneyTextWatcher() {
        return (MoneyInputTextWatcher) this.moneyTextWatcher.getValue();
    }

    private final RawTextWatcher getRawTextWatcher() {
        return (RawTextWatcher) this.rawTextWatcher.getValue();
    }

    public final void bind(@NotNull InputMoleculeVO item, String inputValue) {
        Intrinsics.checkNotNullParameter(item, "item");
        setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(item.getCommon()));
        ViewExtKt.updatePadding(this, item.getLeftPadding(), item.getTopPadding(), item.getRightPadding(), item.getBottomPadding());
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackgroundColor(styleParser.parseColor(context, backgroundColor, R$color.layer_floor_1));
        }
        bindInput(item, inputValue);
    }

    @NotNull
    public final TextFieldCellView getInput() {
        return this.input;
    }

    public final Function2<String, AtomAction, Unit> getOnDelayedAction() {
        return this.onDelayedAction;
    }

    public final Function1<String, Unit> getOnTextChanged() {
        return this.onTextChanged;
    }

    public final void hideKeyboard() {
        KeyboardUtilsKt.hideKeyboard(OzonTextInputLayoutExtKt.getEditText(this.input.getMainView()));
    }

    public final void removeFocus() {
        OzonTextInputLayoutExtKt.getEditText(this.input.getMainView()).clearFocus();
    }

    public final void setExecutingAction(boolean z11) {
        DelayedActionTextWatcher delayedActionTextWatcher = OzonTextInputLayoutExtKt.getDelayedActionTextWatcher(this.input.getMainView());
        if (delayedActionTextWatcher != null) {
            delayedActionTextWatcher.setExecutingAction(z11);
        }
        this.executingAction = z11;
    }

    public final void setOnDelayedAction(Function2<? super String, ? super AtomAction, Unit> function2) {
        this.onDelayedAction = function2;
    }

    public final void setOnTextChanged(Function1<? super String, Unit> function1) {
        this.onTextChanged = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.moneyTextWatcher = LazyUtilsKt.unsafeLazy(InputMoleculeView$moneyTextWatcher$2.INSTANCE);
        this.rawTextWatcher = LazyUtilsKt.unsafeLazy(InputMoleculeView$rawTextWatcher$2.INSTANCE);
        this.digitalTextWatcher = LazyUtilsKt.unsafeLazy(InputMoleculeView$digitalTextWatcher$2.INSTANCE);
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setId(View.generateViewId());
        textFieldCellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textFieldCellView.setPreset(inputPreset);
        textFieldCellView.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        addView(textFieldCellView);
        this.input = textFieldCellView;
    }
}

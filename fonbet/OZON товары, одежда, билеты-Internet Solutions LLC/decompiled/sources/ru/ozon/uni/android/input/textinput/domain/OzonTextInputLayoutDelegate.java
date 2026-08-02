package ru.ozon.uni.android.input.textinput.domain;

import Dk0.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.method.TextKeyListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.input.textinput.ui.TextInputGroupView;
import ru.ozon.uni.android.input.textinput.ui.buttons.InputActionButtonsContainer;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import y7.C10856g;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+J%\u0010/\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u00020(¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0002¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0002¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0002¢\u0006\u0004\b9\u00106J\u0017\u0010:\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0002¢\u0006\u0004\b:\u00106J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010\u001fJ\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020(H\u0002¢\u0006\u0004\bD\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010Q\u001a\u00020(2\u0006\u0010P\u001a\u00020(8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010+R\"\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e\u0018\u00010V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lru/ozon/uni/android/input/textinput/domain/OzonTextInputLayoutDelegate;", "", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "container", "Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "inputViewGroup", "Ly7/g;", "bgDrawable", "Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;", "actionButtonsContainer", "<init>", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;Ly7/g;Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;)V", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "style", "", "setStyle", "(Lru/ozon/uni/android/input/textinput/data/TextInputStyle;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "setStatus", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "setState", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;)V", "", "text", "setInputText", "(Ljava/lang/CharSequence;)V", "", "setLabelText", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "type", "setKeyboardType", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "action", "setKeyboardAction", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;)V", "", "flag", "canCopy", "(Z)V", "canReset", "Lkotlin/Function0;", "clickListener", "hasInfo", "(ZLkotlin/jvm/functions/Function0;)V", "hidePassword", "hasPassword", "(ZZ)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "configureLabel", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;)V", "configureInput", "configureStrokeBG", "configureOffset", "setActionButtons", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "buttonModel", "processAction", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;)V", "addTextToClipboard", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Password;", "handlePasswordButtonClick", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Password;)V", "hasFocus", "truncateOnFocusLost", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "Ly7/g;", "Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;", "actionButtonClickListener", "Lkotlin/jvm/functions/Function0;", "currentState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextInputStateConfigurator;", "stateConfigurator", "Lru/ozon/uni/android/input/textinput/domain/OzonTextInputStateConfigurator;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "truncateOnLostFocus", "Z", "getTruncateOnLostFocus$uni_release", "()Z", "setTruncateOnLostFocus$uni_release", "Lkotlin/Function1;", "getOnFocusChangeListener", "()Lkotlin/jvm/functions/Function1;", "onFocusChangeListener", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzonTextInputLayoutDelegate {
    private Function0<Unit> actionButtonClickListener;

    @NotNull
    private final InputActionButtonsContainer actionButtonsContainer;

    @NotNull
    private final C10856g bgDrawable;

    @NotNull
    private final OzonTextInputLayout container;
    private OzonTextInputUIModel currentState;

    @NotNull
    private final TextInputGroupView inputViewGroup;

    @NotNull
    private final OzonTextInputStateConfigurator stateConfigurator;
    private boolean truncateOnLostFocus;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.input.textinput.domain.OzonTextInputLayoutDelegate$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<OzonTextInputUIModel.ActionButton, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OzonTextInputUIModel.ActionButton actionButton) {
            invoke2(actionButton);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OzonTextInputUIModel.ActionButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OzonTextInputLayoutDelegate.this.processAction(it);
        }
    }

    public OzonTextInputLayoutDelegate(@NotNull OzonTextInputLayout container, @NotNull TextInputGroupView inputViewGroup, @NotNull C10856g bgDrawable, @NotNull InputActionButtonsContainer actionButtonsContainer) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(inputViewGroup, "inputViewGroup");
        Intrinsics.checkNotNullParameter(bgDrawable, "bgDrawable");
        Intrinsics.checkNotNullParameter(actionButtonsContainer, "actionButtonsContainer");
        this.container = container;
        this.inputViewGroup = inputViewGroup;
        this.bgDrawable = bgDrawable;
        this.actionButtonsContainer = actionButtonsContainer;
        this.stateConfigurator = new OzonTextInputStateConfigurator(inputViewGroup.getInputView().hasFocus(), new OzonTextInputLayoutDelegate$stateConfigurator$1(this));
        inputViewGroup.getInputView().setOnFocusChangeListener(new a(this, 0));
        actionButtonsContainer.setActionButtonClickListener(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OzonTextInputLayoutDelegate ozonTextInputLayoutDelegate, View view, boolean z11) {
        ozonTextInputLayoutDelegate.stateConfigurator.onFocusChange(z11);
        Function1<Boolean, Unit> onFocusChangeListener = ozonTextInputLayoutDelegate.getOnFocusChangeListener();
        if (onFocusChangeListener != null) {
            onFocusChangeListener.invoke(Boolean.valueOf(z11));
        }
    }

    private final void addTextToClipboard(String text) {
        if (h.K(text)) {
            return;
        }
        Object systemService = this.container.getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(text, text));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInput(OzonTextInputUIModel state) {
        if (!Intrinsics.d(this.inputViewGroup.getInputView().getTransformationMethod(), state.getTransformationMethod())) {
            int selectionEnd = this.inputViewGroup.getInputView().getSelectionEnd();
            this.inputViewGroup.getInputView().setTransformationMethod(state.getTransformationMethod());
            if (String.valueOf(this.inputViewGroup.getInputText()).length() >= selectionEnd) {
                this.inputViewGroup.getInputView().setSelection(selectionEnd);
            }
        }
        this.inputViewGroup.setIconVisibility(state.getHasLockImage() ? 0 : 8);
        this.inputViewGroup.setInputFocusableInTouchMode(state.getIsActive());
        this.inputViewGroup.setInputFocus(state.getHasFocus());
        this.inputViewGroup.setInputTextAppearance(state.getStyle().getInputStyle());
        if (this.inputViewGroup.getKeyboardAction() != state.getKeyboardAction()) {
            this.inputViewGroup.setKeyboardAction(state.getKeyboardAction());
            this.inputViewGroup.setInputType(state.getKeyboardType());
        } else if (this.inputViewGroup.getInputType() != state.getKeyboardType()) {
            this.inputViewGroup.setInputType(state.getKeyboardType());
        }
        this.inputViewGroup.setInputText(state.getInputText());
        if (Selection.getSelectionEnd(state.getInputText()) < 0) {
            this.inputViewGroup.getInputView().setSelection(state.getInputText().length());
        }
        this.inputViewGroup.setInputTextColor(state.getTextInputColor());
        this.inputViewGroup.setInputAlpha(state.getInputAlpha());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureLabel(OzonTextInputUIModel state) {
        boolean z11 = state.getStyle().getHasLabel() && !h.K(state.getLabelText());
        Editable inputText = this.inputViewGroup.getInputText();
        boolean K11 = inputText != null ? true ^ h.K(inputText) : false;
        if (!z11) {
            this.inputViewGroup.setLabelVisibility(8);
            return;
        }
        this.inputViewGroup.setLabelVisibility(0);
        this.inputViewGroup.setLabelText(state.getLabelText());
        if (K11 && z11) {
            this.inputViewGroup.setLabelTextAppearance(state.getStyle().getWithInputLabelStyle());
            this.inputViewGroup.moveLabelUpToInput();
            return;
        }
        if (!this.inputViewGroup.getInputHasFocused() && z11 && !K11) {
            this.inputViewGroup.setLabelTextAppearance(state.getStyle().getWithoutInputLabelStyle());
            this.inputViewGroup.centringLabel();
        } else if (this.inputViewGroup.getInputHasFocused() && z11 && !K11) {
            this.inputViewGroup.setLabelTextAppearance(state.getStyle().getWithInputLabelStyle());
            this.inputViewGroup.moveLabelUpToInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureOffset(OzonTextInputUIModel state) {
        OzonTextInputUIModel ozonTextInputUIModel = this.currentState;
        if (Intrinsics.d(ozonTextInputUIModel != null ? ozonTextInputUIModel.getStyle() : null, state.getStyle())) {
            return;
        }
        TextInputGroupView textInputGroupView = this.inputViewGroup;
        ViewGroup.LayoutParams layoutParams = textInputGroupView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMarginStart(state.getStyle().getLeftOffset());
        bVar.f41595B = state.getStyle().getRightOffset();
        textInputGroupView.setLayoutParams(bVar);
        InputActionButtonsContainer inputActionButtonsContainer = this.actionButtonsContainer;
        ViewGroup.LayoutParams layoutParams2 = inputActionButtonsContainer.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.setMarginEnd(state.getStyle().getRightOffset());
        inputActionButtonsContainer.setLayoutParams(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureStrokeBG(OzonTextInputUIModel state) {
        C10856g c10856g = this.bgDrawable;
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c10856g.y(UniGlobalConfigKt.getRoundCornersFlag(context) ? TextInputStyle.INSTANCE.getInputRoundedCornerRadius$uni_release() : state.getStyle().getCornerRadius());
        Context context2 = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.bgDrawable.I(state.getBorderSize(), ThemeExtKt.themeColor(context2, state.getBorderColor()));
    }

    private final Function1<Boolean, Unit> getOnFocusChangeListener() {
        if (this.truncateOnLostFocus) {
            return new OzonTextInputLayoutDelegate$onFocusChangeListener$1(this);
        }
        return null;
    }

    private final void handlePasswordButtonClick(OzonTextInputUIModel.ActionButton.Password buttonModel) {
        this.stateConfigurator.hasPassword(true, !buttonModel.getHidePassword());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAction(OzonTextInputUIModel.ActionButton buttonModel) {
        String obj;
        String str = "";
        if (buttonModel instanceof OzonTextInputUIModel.ActionButton.Copy) {
            Editable inputText = this.inputViewGroup.getInputText();
            if (inputText != null && (obj = inputText.toString()) != null) {
                str = obj;
            }
            addTextToClipboard(str);
            return;
        }
        if (buttonModel instanceof OzonTextInputUIModel.ActionButton.Password) {
            handlePasswordButtonClick((OzonTextInputUIModel.ActionButton.Password) buttonModel);
            return;
        }
        if (!(buttonModel instanceof OzonTextInputUIModel.ActionButton.Info)) {
            if (buttonModel instanceof OzonTextInputUIModel.ActionButton.Reset) {
                this.inputViewGroup.setInputText("");
            }
        } else {
            Function0<Unit> function0 = this.actionButtonClickListener;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActionButtons(OzonTextInputUIModel state) {
        List<OzonTextInputUIModel.ActionButton> actionButtons = state.getActionButtons();
        OzonTextInputUIModel ozonTextInputUIModel = this.currentState;
        if (Intrinsics.d(actionButtons, ozonTextInputUIModel != null ? ozonTextInputUIModel.getActionButtons() : null)) {
            return;
        }
        if (state.getActionButtons().isEmpty()) {
            ViewExtKt.gone(this.actionButtonsContainer);
        } else {
            ViewExtKt.show(this.actionButtonsContainer);
            this.actionButtonsContainer.setButtons(state.getActionButtons());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void truncateOnFocusLost(boolean hasFocus) {
        OzonTextInput inputView = this.inputViewGroup.getInputView();
        inputView.setKeyListener(hasFocus ? TextKeyListener.getInstance() : null);
        inputView.setFocusable(true);
        inputView.setFocusableInTouchMode(true);
        inputView.requestLayout();
    }

    public final void canCopy(boolean flag) {
        this.stateConfigurator.canCopy(flag);
    }

    public final void canReset(boolean flag) {
        this.stateConfigurator.canReset(flag);
    }

    public final void hasInfo(boolean flag, Function0<Unit> clickListener) {
        this.stateConfigurator.hasInfo(flag);
        if (!flag) {
            clickListener = null;
        }
        this.actionButtonClickListener = clickListener;
    }

    public final void hasPassword(boolean flag, boolean hidePassword) {
        this.stateConfigurator.hasPassword(flag, hidePassword);
    }

    public final void setInputText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.stateConfigurator.onInputTextSetted(text);
    }

    public final void setKeyboardAction(@NotNull OzonTextInputLayoutModel.KeyboardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.stateConfigurator.onSetKeyboardAction(action);
    }

    public final void setKeyboardType(@NotNull OzonTextInputLayoutModel.KeyboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.stateConfigurator.onSetKeyboardType(type);
    }

    public final void setLabelText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.stateConfigurator.onLabelTextSetted(text);
    }

    public final void setState(@NotNull OzonTextInputLayoutModel.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.stateConfigurator.onStateChanged(state);
    }

    public final void setStatus(@NotNull OzonTextInputLayoutModel.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.stateConfigurator.onStatusChanged(status);
    }

    public final void setStyle(@NotNull TextInputStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.stateConfigurator.onStyleChange(style);
    }

    public final void setTruncateOnLostFocus$uni_release(boolean z11) {
        this.truncateOnLostFocus = z11;
        if (z11) {
            truncateOnFocusLost(this.inputViewGroup.getInputView().hasFocus());
        }
    }
}

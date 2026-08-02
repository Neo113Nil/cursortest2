package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import B90.C2618u;
import Bi.b;
import Dc0.m;
import Dc0.n;
import android.content.Context;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailView;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010#\u001a\u00020\u001fH\u0014JP\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u001d2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!J\u0006\u0010,\u001a\u00020+J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020+J\u0006\u0010/\u001a\u00020\u001fJ\u0006\u00100\u001a\u00020\u001fJ\u000e\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(J\u0006\u00102\u001a\u00020\u001fJ.\u00103\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\b\u00104\u001a\u0004\u0018\u000105H\u0002J$\u00106\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J \u00107\u001a\u00020\u001f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!2\u0006\u0010%\u001a\u00020&H\u0002J,\u00108\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J$\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020;2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J\u0014\u0010<\u001a\u00020\u001f*\u00020=2\u0006\u0010>\u001a\u00020=H\u0002J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010B\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020+H\u0002J\b\u0010C\u001a\u00020\u001fH\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\b\u0010E\u001a\u00020\u001fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "changeEmailTitleView", "emailAndOtpInput", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "errorTextView", "cellAgreeView", "Lru/ozon/uni/android/cell/CellView;", "primaryButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "secondaryButton", "otpFormatter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter;", "otpInputManager", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpInputManager;", "enabledButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onChangeEmailTitleClick", "Lkotlin/Function0;", "onCheckboxClick", "onDetachedFromWindow", "bind", "item", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;", "timerState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$TimerState;", "actionHandler", "onOtpCompleted", "", "getEmail", "showError", "message", "clearInputAndError", "clearInput", "updateTimer", "rebindPrimaryButton", "setupChangeEmailTitleView", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "setupEmailAndOtpInput", "setupCheckbox", "setupButtons", "setupInput", "input", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "placeBelow", "Landroid/view/View;", "anchor", "processLinksInCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "setError", "prepareClearOnNextFocus", "clearError", "hideKeyboard", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> buttonActionHandler;

    @NotNull
    private final CellView cellAgreeView;

    @NotNull
    private final TextAtomV2View changeEmailTitleView;

    @NotNull
    private final OzonTextInputLayout emailAndOtpInput;
    private ButtonV3DTO enabledButton;

    @NotNull
    private final TextAtomV2View errorTextView;
    private Function0<Unit> onChangeEmailTitleClick;
    private Function0<Unit> onCheckboxClick;

    @NotNull
    private final OtpMaskFormatter otpFormatter;

    @NotNull
    private final OtpInputManager otpInputManager;

    @NotNull
    private final ButtonV3View primaryButton;

    @NotNull
    private final ButtonV3View secondaryButton;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int PADDING_16 = UiExtKt.toPx(Paddings.PADDING_500.getPx());
    private static final int PADDING_8 = UiExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int PADDING_2 = UiExtKt.toPx(Paddings.PADDING_100.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailView$Companion;", "", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChangeEmailView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$23(ChangeEmailView changeEmailView, View view) {
        Function0<Unit> function0 = changeEmailView.onChangeEmailTitleClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$24(ChangeEmailView changeEmailView, View view) {
        Function0<Unit> function0 = changeEmailView.onCheckboxClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        this.emailAndOtpInput.setStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        ViewExtKt.gone(this.errorTextView);
        this.errorTextView.setText((CharSequence) null);
    }

    private final void hideKeyboard() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.emailAndOtpInput.getWindowToken(), 0);
    }

    private final void placeBelow(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.f41638j = view2.getId();
            bVar.f41636i = -1;
        }
    }

    private final void prepareClearOnNextFocus() {
        final OzonTextInput inputView = this.emailAndOtpInput.getInputViewGroup().getInputView();
        final View.OnFocusChangeListener onFocusChangeListener = inputView.getOnFocusChangeListener();
        inputView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Ju.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ChangeEmailView.prepareClearOnNextFocus$lambda$32(OzonTextInput.this, onFocusChangeListener, this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareClearOnNextFocus$lambda$32(OzonTextInput ozonTextInput, View.OnFocusChangeListener onFocusChangeListener, ChangeEmailView changeEmailView, View view, boolean z11) {
        ozonTextInput.setOnFocusChangeListener(onFocusChangeListener);
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (z11) {
            changeEmailView.clearInputAndError();
        }
    }

    private final CellDTO processLinksInCell(CellDTO cell, Context context) {
        return CellDTO.copy$default(cell, CellDTO.CenterBlock.copy$default(cell.getCenterBlock(), CellDTO.CellText.copy$default(cell.getCenterBlock().getTitle(), OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, cell.getCenterBlock().getTitle().getText(), null, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textAction)), null, null, 13, null), null, null, true, null, null, 54, null), null, null, null, null, null, 62, null), null, null, null, null, 30, null);
    }

    private final void setError(String message) {
        this.emailAndOtpInput.setState(OzonTextInputLayoutModel.State.DEFAULT);
        this.emailAndOtpInput.setStatus(OzonTextInputLayoutModel.Status.ERROR);
        this.errorTextView.setText(message);
        this.errorTextView.setVisibility(0);
    }

    private final void setupButtons(ChangeEmailVO item, ChangeEmailViewModel.TimerState timerState, Function1<? super AtomAction, Unit> actionHandler) {
        ButtonV3DTO buttonV3DTO;
        ButtonV3DTO button;
        ButtonV3DTO button2;
        ChangeEmailVO.ButtonVO buttonVO = (ChangeEmailVO.ButtonVO) C7714v.Q(0, item.getButtons());
        this.enabledButton = (buttonVO == null || (button2 = buttonVO.getButton()) == null) ? null : ButtonV3DTO.copy$default(button2, null, null, null, "", null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, 130999, null);
        this.buttonActionHandler = actionHandler;
        if (timerState.getRemainingSeconds() > 0) {
            ChangeEmailVO.ButtonVO buttonVO2 = (ChangeEmailVO.ButtonVO) C7714v.Q(0, item.getButtons());
            buttonV3DTO = (buttonVO2 == null || (button = buttonVO2.getButton()) == null) ? null : ButtonV3DTO.copy$default(button, null, null, null, timerState.getFormattedTime(), null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 130999, null);
        } else {
            buttonV3DTO = this.enabledButton;
        }
        ButtonV3HolderKt.bindOrGone(this.primaryButton, buttonV3DTO, actionHandler);
        ButtonV3View buttonV3View = this.secondaryButton;
        ChangeEmailVO.ButtonVO buttonVO3 = (ChangeEmailVO.ButtonVO) C7714v.Q(1, item.getButtons());
        ButtonV3HolderKt.bindOrGone(buttonV3View, buttonVO3 != null ? buttonVO3.getButton() : null, actionHandler);
    }

    private final void setupChangeEmailTitleView(ChangeEmailVO item, Function1<? super AtomAction, Unit> actionHandler, CommonControlSettings common) {
        CommonControlSettings common2;
        AtomActionDTO action;
        if (item.getSubtitle() != null) {
            placeBelow(this.changeEmailTitleView, this.subtitleView);
        } else {
            placeBelow(this.changeEmailTitleView, this.titleView);
        }
        TextAtomV2View textAtomV2View = this.changeEmailTitleView;
        ChangeEmailVO.ChangeEmailInputVO changeEmail = item.getChangeEmail();
        ChangeEmailView$setupChangeEmailTitleView$1$1 changeEmailView$setupChangeEmailTitleView$1$1 = null;
        TextHolderKt.bindOrGone$default(textAtomV2View, changeEmail != null ? changeEmail.getTitle() : null, null, 2, null);
        ChangeEmailVO.ChangeEmailInputVO changeEmail2 = item.getChangeEmail();
        if (changeEmail2 != null && (common2 = changeEmail2.getCommon()) != null && (action = common2.getAction()) != null) {
            changeEmailView$setupChangeEmailTitleView$1$1 = new ChangeEmailView$setupChangeEmailTitleView$1$1(actionHandler, action, common);
        }
        this.onChangeEmailTitleClick = changeEmailView$setupChangeEmailTitleView$1$1;
    }

    private final void setupCheckbox(Function0<Unit> onCheckboxClick, ChangeEmailVO item) {
        CellDTO cellDTO;
        this.onCheckboxClick = onCheckboxClick;
        CellDTO cell = item.getCell();
        if (cell != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellDTO = processLinksInCell(cell, context);
        } else {
            cellDTO = null;
        }
        CellHolderKt.bindOrGone$default(this.cellAgreeView, cellDTO, null, 2, null);
        if (cellDTO == null || !OzonSpannableStringKt.hasClickableSpan(cellDTO.getCenterBlock().getTitle().getText())) {
            return;
        }
        this.cellAgreeView.getCenterBlock().getTitleView().setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setupEmailAndOtpInput(ChangeEmailVO item, Function1<? super String, Unit> onOtpCompleted) {
        if (item.getChangeEmail() != null) {
            placeBelow(this.emailAndOtpInput, this.changeEmailTitleView);
        } else if (item.getSubtitle() != null) {
            placeBelow(this.emailAndOtpInput, this.subtitleView);
        } else {
            placeBelow(this.emailAndOtpInput, this.titleView);
        }
        List<ChangeEmailVO.InputVO> inputs = item.getInputs();
        if (inputs == null || inputs.isEmpty()) {
            this.emailAndOtpInput.setVisibility(8);
            hideKeyboard();
            return;
        }
        this.emailAndOtpInput.setVisibility(0);
        ChangeEmailVO.InputVO inputVO = (ChangeEmailVO.InputVO) C7714v.M(item.getInputs());
        if (inputVO != null) {
            setupInput(inputVO, onOtpCompleted);
        }
    }

    private final void setupInput(ChangeEmailVO.InputVO input, Function1<? super String, Unit> onOtpCompleted) {
        OzonTextInputLayout ozonTextInputLayout = this.emailAndOtpInput;
        String obj = input.getPlaceholder().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        ozonTextInputLayout.setLabelText(obj);
        if (input.getMaskOtp() != null) {
            this.emailAndOtpInput.setStyle(TextInputStyle.INSTANCE.createInput600AccentStyle());
            this.emailAndOtpInput.setKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
            this.otpInputManager.setupMaskInput(input.getMaskOtp(), new ChangeEmailView$setupInput$1(this, onOtpCompleted));
        } else {
            this.emailAndOtpInput.setStyle(TextInputStyle.INSTANCE.createInput600Style());
            this.otpInputManager.removeMaskInput();
        }
        clearInputAndError();
    }

    public final void bind(@NotNull ChangeEmailVO item, @NotNull ChangeEmailViewModel.TimerState timerState, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super String, Unit> onOtpCompleted, Function0<Unit> onCheckboxClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(timerState, "timerState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onOtpCompleted, "onOtpCompleted");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        ChangeEmailVO.ChangeEmailInputVO changeEmail = item.getChangeEmail();
        setupChangeEmailTitleView(item, actionHandler, changeEmail != null ? changeEmail.getCommon() : null);
        setupEmailAndOtpInput(item, onOtpCompleted);
        setupCheckbox(onCheckboxClick, item);
        setupButtons(item, timerState, actionHandler);
    }

    public final void clearInput() {
        this.otpInputManager.clearAndReset();
        prepareClearOnNextFocus();
    }

    public final void clearInputAndError() {
        this.emailAndOtpInput.getInputViewGroup().getInputView().setText("");
        this.otpInputManager.clearAndReset();
        clearError();
    }

    @NotNull
    public final String getEmail() {
        String obj;
        Editable text = this.emailAndOtpInput.getInputViewGroup().getInputView().getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.otpInputManager.detach();
    }

    public final void rebindPrimaryButton() {
        ButtonV3DTO buttonV3DTO = this.enabledButton;
        if (buttonV3DTO != null) {
            ButtonV3HolderKt.bindOrGone(this.primaryButton, buttonV3DTO, this.buttonActionHandler);
        }
        this.primaryButton.setStyle(this.primaryButton.getStyle());
    }

    public final void showError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        hideKeyboard();
        setError(message);
        prepareClearOnNextFocus();
    }

    public final void updateTimer(@NotNull ChangeEmailViewModel.TimerState timerState) {
        Intrinsics.checkNotNullParameter(timerState, "timerState");
        this.primaryButton.setSubtitle(timerState.getFormattedTime());
        this.primaryButton.setDisabled(timerState.getRemainingSeconds() > 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChangeEmailView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.changeEmailTitle, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, 0 == true ? 1 : 0);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.changeEmailSubtitle, 0, -2);
        d12.f41638j = textAtomV2View.getId();
        d12.f41656t = 0;
        d12.f41658v = 0;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, attributeSet2, i12, i13, 0 == true ? 1 : 0);
        ConstraintLayout.b d13 = b.d(textAtomV2View3, R$id.changeEmailTitleView, 0, -2);
        d13.f41638j = textAtomV2View2.getId();
        d13.f41656t = 0;
        d13.f41658v = 0;
        textAtomV2View3.setLayoutParams(d13);
        textAtomV2View3.setTextIsSelectable(false);
        addView(textAtomV2View3);
        this.changeEmailTitleView = textAtomV2View3;
        OzonTextInputLayout ozonTextInputLayout = new OzonTextInputLayout(context, attributeSet2, i12, i13, 0 == true ? 1 : 0);
        ozonTextInputLayout.setId(R$id.emailAndOtpInput);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = textAtomV2View2.getId();
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        int i14 = PADDING_16;
        bVar.setMarginStart(i14);
        bVar.setMarginEnd(i14);
        int i15 = PADDING_8;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i15;
        ozonTextInputLayout.setLayoutParams(bVar);
        ozonTextInputLayout.setStyle(TextInputStyle.INSTANCE.createInput600Style());
        ozonTextInputLayout.setKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        addView(ozonTextInputLayout);
        this.emailAndOtpInput = ozonTextInputLayout;
        TextAtomV2View textAtomV2View4 = new TextAtomV2View(context, attributeSet2, i12, i13, 0 == true ? 1 : 0);
        ConstraintLayout.b d14 = b.d(textAtomV2View4, R$id.emailAndOtpInputError, 0, -2);
        d14.f41638j = ozonTextInputLayout.getId();
        d14.f41656t = 0;
        d14.f41658v = 0;
        d14.setMarginStart(i14);
        d14.setMarginEnd(i14);
        ((ViewGroup.MarginLayoutParams) d14).topMargin = PADDING_2;
        textAtomV2View4.setLayoutParams(d14);
        textAtomV2View4.setTextAppearance(R$style.OzonTextAppearance_Body_300xsmall);
        textAtomV2View4.setTextColor(ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()));
        ViewExtKt.gone(textAtomV2View4);
        addView(textAtomV2View4);
        this.errorTextView = textAtomV2View4;
        int i16 = 0;
        AttributeSet attributeSet3 = null;
        CellView cellView = new CellView(context, attributeSet3, i12, i16, 0 == true ? 1 : 0, 30, null);
        cellView.setId(R$id.cellAgreeView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = textAtomV2View4.getId();
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        cellView.setLayoutParams(bVar2);
        addView(cellView);
        this.cellAgreeView = cellView;
        int i17 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet3, i12, i16, i17, defaultConstructorMarker);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.primaryButton, 0, -2);
        e11.f41638j = cellView.getId();
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.setMarginStart(i14);
        e11.setMarginEnd(i14);
        ((ViewGroup.MarginLayoutParams) e11).topMargin = i14;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.primaryButton = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, attributeSet3, i12, i16, i17, defaultConstructorMarker);
        ConstraintLayout.b e12 = C2618u.e(buttonV3View2, R$id.secondaryButton, 0, -2);
        e12.f41638j = buttonV3View.getId();
        e12.f41656t = 0;
        e12.f41658v = 0;
        e12.setMarginStart(i14);
        e12.setMarginEnd(i14);
        ((ViewGroup.MarginLayoutParams) e12).topMargin = i15;
        e12.f41642l = 0;
        buttonV3View2.setLayoutParams(e12);
        addView(buttonV3View2);
        this.secondaryButton = buttonV3View2;
        OtpMaskFormatter otpMaskFormatter = new OtpMaskFormatter();
        this.otpFormatter = otpMaskFormatter;
        this.otpInputManager = new OtpInputManager(ozonTextInputLayout, otpMaskFormatter);
        setPadding(0, i14, 0, 0);
        textAtomV2View3.setOnClickListener(new m(this, 4));
        cellView.getLeftBlock().getCheckBoxView().setOnClickListener(new n(this, 4));
    }
}

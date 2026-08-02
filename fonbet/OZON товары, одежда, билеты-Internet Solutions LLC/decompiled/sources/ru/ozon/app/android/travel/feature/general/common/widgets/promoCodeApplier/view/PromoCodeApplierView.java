package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.view;

import Bi.a;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data.PromoCodeApplierDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierFocusChangeListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001dJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\u00020\u0012*\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u00020\u0012*\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010'\u001a\u00020\u0012*\u00020\r2\u0006\u0010(\u001a\u00020 H\u0002J\f\u0010)\u001a\u00020\u0012*\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/view/PromoCodeApplierView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTAV", "textFieldCellView", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "buttonB", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "sendClickEvent", "Lkotlin/Function0;", "", "inputView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getInputView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "focusChangeListener", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierFocusChangeListener;", "bind", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCurrentPromoAndClearFocus", "", "clearWatcher", "addFocusChangeListener", "removeFocusChangeListener", "inputField", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;", "bindInputField", "showError", "errorText", "hideError", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeApplierView extends LinearLayout {

    @NotNull
    private final ButtonV3View buttonB;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final PromoCodeApplierFocusChangeListener focusChangeListener;
    private Function0<Unit> sendClickEvent;

    @NotNull
    private final TextAtomV2View subtitleTAV;

    @NotNull
    private final TextFieldCellView textFieldCellView;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeApplierView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View2);
        this.subtitleTAV = textAtomV2View2;
        final TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        layoutParams.leftMargin = px2;
        layoutParams.rightMargin = px2;
        textFieldCellView.setLayoutParams(layoutParams);
        textFieldCellView.inputCanReset(true);
        textFieldCellView.getMainView().setTextWatcher(new OzonTextWatcher() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.view.PromoCodeApplierView$textFieldCellView$1$2
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable input) {
                super.afterTextChanged(input);
                PromoCodeApplierView.this.hideError(textFieldCellView);
            }
        });
        this.textFieldCellView = textFieldCellView;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px2;
        layoutParams2.leftMargin = px2;
        layoutParams2.rightMargin = px2;
        layoutParams2.bottomMargin = px2;
        buttonV3View.setLayoutParams(layoutParams2);
        this.buttonB = buttonV3View;
        this.focusChangeListener = new PromoCodeApplierFocusChangeListener(getInputView(), new PromoCodeApplierView$focusChangeListener$1(this));
        setOrientation(1);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(textFieldCellView);
        addView(buttonV3View);
        getInputView().setOnClickListener(new Il.a(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(PromoCodeApplierView promoCodeApplierView, View view) {
        Function0<Unit> function0 = promoCodeApplierView.sendClickEvent;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void bindInputField(TextFieldCellView textFieldCellView, PromoCodeApplierVO.InputVO inputVO) {
        textFieldCellView.clearFocus();
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputLabelText(inputVO.getLabel());
        textFieldCellView.setInputText(inputVO.getValue());
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setLabelText(null);
    }

    private final OzonTextInput getInputView() {
        return this.textFieldCellView.getMainView().getInputViewGroup().getInputView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    private final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ThemeExtKt.themeColor(context, R$attr.textNegative), 0.0f, 2, null);
        textFieldCellView.setLabelText(str);
    }

    public final void addFocusChangeListener() {
        getInputView().getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusChangeListener);
    }

    public final void bind(@NotNull PromoCodeApplierVO state, @NotNull Function0<Unit> sendClickEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sendClickEvent, "sendClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.sendClickEvent = sendClickEvent;
        TextHolderKt.bind$default(this.titleTAV, state.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTAV, state.getSubtitle(), null, 2, null);
        bind(this.textFieldCellView, state.getInput());
        ButtonV3HolderKt.bind(this.buttonB, state.getButton(), actionHandler);
    }

    public final void clearWatcher() {
        this.textFieldCellView.getMainView().setTextWatcher(null);
    }

    @NotNull
    public final String getCurrentPromoAndClearFocus() {
        clearFocus();
        return h.z0(String.valueOf(this.textFieldCellView.getInputText())).toString();
    }

    public final void removeFocusChangeListener() {
        ViewTreeObserver viewTreeObserver = getInputView().getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
        }
    }

    private final void bind(TextFieldCellView textFieldCellView, PromoCodeApplierVO.InputVO inputVO) {
        bindInputField(textFieldCellView, inputVO);
        if (inputVO.getStatus() != PromoCodeApplierDTO.Status.ERROR || inputVO.getError() == null) {
            return;
        }
        showError(textFieldCellView, inputVO.getError());
    }
}

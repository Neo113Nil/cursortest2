package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeView;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DelayedActionTextWatcher;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainUpdate;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainVO;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.view.InputCurtainView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001bJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u0015J\u001c\u0010\"\u001a\u00020\u0015*\u00020\r2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/view/InputCurtainView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "inputView", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "getInputView", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "saveButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;", "inputValue", "", "buttonActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindUpdate", "update", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainUpdate;", "onAttach", "onDetach", "bindOrGone", "subtitle", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputCurtainView extends LinearLayout {

    @NotNull
    private final InputMoleculeView inputView;

    @NotNull
    private final ButtonV3View saveButton;

    @NotNull
    private final VerticalAtomsLayout subtitleLayout;

    @NotNull
    private final TextAtomV2View titleTv;

    public /* synthetic */ InputCurtainView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindOrGone(VerticalAtomsLayout verticalAtomsLayout, List<TextDTO> list) {
        if (list == null) {
            ViewExtKt.gone(verticalAtomsLayout);
            return;
        }
        AtomsAdapter adapter = verticalAtomsLayout.getAdapter();
        if (adapter != null) {
            Context context = verticalAtomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            adapter.bind(context, list);
        }
        ViewExtKt.show(verticalAtomsLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$10(InputCurtainView inputCurtainView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        inputCurtainView.inputView.hideKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$11(View.OnFocusChangeListener onFocusChangeListener, InputCurtainView inputCurtainView, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (z11) {
            return;
        }
        inputCurtainView.inputView.hideKeyboard();
    }

    public final void bind(@NotNull InputCurtainVO item, String inputValue, @NotNull Function1<? super AtomAction, Unit> buttonActionHandler) {
        List<TextDTO> subtitle;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(buttonActionHandler, "buttonActionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1));
        TextHolderKt.bindOrGone$default(this.titleTv, item.getTitle(), null, 2, null);
        bindOrGone(this.subtitleLayout, item.getSubtitle());
        InputMoleculeView inputMoleculeView = this.inputView;
        int dp8 = (item.getTitle() == null && ((subtitle = item.getSubtitle()) == null || subtitle.isEmpty())) ? 0 : Dimens.INSTANCE.getDp8();
        ViewGroup.LayoutParams layoutParams = inputMoleculeView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, dp8, 0, 0);
        inputMoleculeView.bind(item.getInput(), inputValue);
        ButtonV3HolderKt.bind(this.saveButton, item.getSaveButton(), buttonActionHandler);
    }

    public final void bindUpdate(@NotNull InputCurtainUpdate update) {
        Intrinsics.checkNotNullParameter(update, "update");
        TextFieldCellView input = this.inputView.getInput();
        input.setLabelText(update.getMessage());
        Context context = input.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(input, ResourceExtKt.color(context, update.getMessageColor().getResId()), 0.0f, 2, null);
        input.setInputStatus(update.getStatus());
        this.saveButton.setDataText(update.getDataText());
    }

    @NotNull
    public final InputMoleculeView getInputView() {
        return this.inputView;
    }

    public final void onAttach() {
        OzonTextInputLayoutExtKt.getEditText(this.inputView.getInput().getMainView()).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Tp.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean onAttach$lambda$10;
                onAttach$lambda$10 = InputCurtainView.onAttach$lambda$10(InputCurtainView.this, textView, i11, keyEvent);
                return onAttach$lambda$10;
            }
        });
        final View.OnFocusChangeListener onFocusChangeListener = OzonTextInputLayoutExtKt.getEditText(this.inputView.getInput().getMainView()).getOnFocusChangeListener();
        OzonTextInputLayoutExtKt.getEditText(this.inputView.getInput().getMainView()).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Tp.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                InputCurtainView.onAttach$lambda$11(onFocusChangeListener, this, view, z11);
            }
        });
    }

    public final void onDetach() {
        OzonTextInputLayout mainView = this.inputView.getInput().getMainView();
        DelayedActionTextWatcher delayedActionTextWatcher = OzonTextInputLayoutExtKt.getDelayedActionTextWatcher(mainView);
        if (delayedActionTextWatcher != null) {
            delayedActionTextWatcher.onDetach();
        }
        mainView.setTextWatcher(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnFocusChangeListener(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnEditorActionListener(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCurtainView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDp24();
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTv = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dimens.getDp4();
        verticalAtomsLayout.setLayoutParams(layoutParams2);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        this.subtitleLayout = verticalAtomsLayout;
        InputMoleculeView inputMoleculeView = new InputMoleculeView(context, attributeSet2, i12, 6, null);
        inputMoleculeView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = dimens.getDp8();
        inputMoleculeView.setLayoutParams(layoutParams3);
        this.inputView = inputMoleculeView;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i12, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = dimens.getDp16();
        layoutParams4.bottomMargin = dimens.getDp10();
        layoutParams4.setMarginStart(dimens.getDp16());
        layoutParams4.setMarginEnd(dimens.getDp16());
        buttonV3View.setLayoutParams(layoutParams4);
        this.saveButton = buttonV3View;
        setOrientation(1);
        addView(textAtomV2View);
        addView(verticalAtomsLayout);
        addView(inputMoleculeView);
        addView(buttonV3View);
    }
}

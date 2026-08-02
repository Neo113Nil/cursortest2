package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import Eb0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textInputView", "Lru/ozon/uni/android/textArea/TextAreaView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "isCodeInput", "", "isValueSet", "bind", "", "item", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "actionHandler", "Lkotlin/Function1;", "", "setupTextInput", "textInput", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "setupSpacers", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputFormView extends LinearLayout {

    @NotNull
    private final ButtonV3View buttonView;
    private boolean isCodeInput;
    private boolean isValueSet;

    @NotNull
    private final TextAreaView textInputView;

    @NotNull
    private final TextAtomV2View textView;
    public static final int $stable = 8;
    private static final int bottomMargin = ResourceExtKt.toPx(16);

    public /* synthetic */ InputFormView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6(Function1 function1, InputFormView inputFormView, View view) {
        String inputText = inputFormView.textInputView.getInputText();
        if (inputText == null) {
            inputText = "";
        }
        function1.invoke(inputText);
    }

    private final void setupSpacers(InputFormVO.Spacers spacers) {
        setPadding(spacers.getLeft(), 0, spacers.getRight(), spacers.getBottom() + bottomMargin);
        TextAtomV2View textAtomV2View = this.textView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = spacers.getTopTitle();
        textAtomV2View.setLayoutParams(marginLayoutParams);
        TextAreaView textAreaView = this.textInputView;
        ViewGroup.LayoutParams layoutParams2 = textAreaView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = spacers.getTopTextArea();
        textAreaView.setLayoutParams(marginLayoutParams2);
        ButtonV3View buttonV3View = this.buttonView;
        ViewGroup.LayoutParams layoutParams3 = buttonV3View.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = spacers.getTopButton();
        buttonV3View.setLayoutParams(marginLayoutParams3);
    }

    private final void setupTextInput(InputFormVO.TextArea textInput) {
        TextAreaView textAreaView = this.textInputView;
        textAreaView.setMaxLength(textInput.getMaxInputLength());
        textAreaView.setMinLines(textInput.getMinRows());
        textAreaView.setMaxLines(textInput.getMaxRows());
        if (!this.isValueSet) {
            textAreaView.setInputText(textInput.getValue());
            this.isValueSet = true;
        }
        textAreaView.setLabel(textInput.getPlaceholder());
        textAreaView.setCaption(textInput.getCaption());
        textAreaView.setStatus(textInput.getStatus());
    }

    public final void bind(@NotNull InputFormVO item, @NotNull Function1<? super String, Unit> actionHandler) {
        AtomActionDTO action;
        String link;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CommonControlSettings common = item.getButton().getCommon();
        boolean z11 = false;
        if (common != null && (action = common.getAction()) != null && (link = action.getLink()) != null) {
            z11 = h.t(link, "applyOrderDiscountCode", false);
        }
        this.isCodeInput = z11;
        TextHolderKt.bindOrGone$default(this.textView, item.getTitle(), null, 2, null);
        ButtonV3HolderKt.bind$default(this.buttonView, item.getButton(), null, 2, null);
        this.buttonView.setOnClickListener(new a(5, actionHandler, this));
        setupTextInput(item.getTextArea());
        setupSpacers(item.getSpacers());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFormView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.inputFormTextView);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setId(R$id.inputFormTextAreaView);
        textAreaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAreaView.setHasInfoIcon(false);
        addView(textAreaView);
        this.textInputView = textAreaView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(R$id.inputFormButtonView);
        buttonV3View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        setId(R$id.inputForm);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        textAreaView.setState(TextAreaView.State.ACTIVE);
        TextAreaView.INSTANCE.doOnTextChanged(textAreaView, new InputFormView$1$1(textAreaView, this));
    }
}

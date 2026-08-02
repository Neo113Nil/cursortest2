package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.DrawableExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationVO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.view.PersonalInfoVerificationView;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J5\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u0019j\u0002`\u001b¢\u0006\u0004\b\u001d\u0010\u001eR6\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0014\u0010;\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104¨\u0006="}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/view/PersonalInfoVerificationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "", "inputType", "", "initInput", "(Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;Ljava/lang/String;)V", "clearInput", "(Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "item", "", "isPatronymicCheckBoxSelected", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onPatronymicSelectionChange", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;ZLkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "onInputValueChange", "Lkotlin/jvm/functions/Function2;", "getOnInputValueChange", "()Lkotlin/jvm/functions/Function2;", "setOnInputValueChange", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "activeInput", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "getActiveInput", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "setActiveInput", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "subtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "surnameInput", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "nameInput", "patronymicInput", "Lru/ozon/uni/android/cell/CellView;", "patronymicSettingsCell", "Lru/ozon/uni/android/cell/CellView;", "birthDateInput", "passportInput", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationView extends LinearLayout {
    private static final float containerCornerRadius = Dimens.INSTANCE.getDp16();
    private OzonTextInputLayout activeInput;

    @NotNull
    private final InputMoleculeView birthDateInput;

    @NotNull
    private final InputMoleculeView nameInput;
    private Function2<? super String, ? super String, Unit> onInputValueChange;

    @NotNull
    private final InputMoleculeView passportInput;

    @NotNull
    private final InputMoleculeView patronymicInput;

    @NotNull
    private final CellView patronymicSettingsCell;

    @NotNull
    private final VerticalAtomsLayout subtitleLayout;

    @NotNull
    private final InputMoleculeView surnameInput;

    @NotNull
    private final TextAtomV2View titleTv;

    public /* synthetic */ PersonalInfoVerificationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void clearInput(InputMoleculeView inputMoleculeView) {
        inputMoleculeView.setOnTextChanged(null);
        OzonTextInputLayoutExtKt.getEditText(inputMoleculeView.getInput().getMainView()).setOnFocusChangeListener(null);
    }

    private final void initInput(final InputMoleculeView inputMoleculeView, String str) {
        inputMoleculeView.setOnTextChanged(new PersonalInfoVerificationView$initInput$1(this, str));
        final View.OnFocusChangeListener onFocusChangeListener = OzonTextInputLayoutExtKt.getEditText(inputMoleculeView.getInput().getMainView()).getOnFocusChangeListener();
        OzonTextInputLayoutExtKt.getEditText(inputMoleculeView.getInput().getMainView()).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jq.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PersonalInfoVerificationView.initInput$lambda$13(onFocusChangeListener, inputMoleculeView, this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInput$lambda$13(View.OnFocusChangeListener onFocusChangeListener, InputMoleculeView inputMoleculeView, PersonalInfoVerificationView personalInfoVerificationView, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (!z11) {
            KeyboardUtilsKt.hideKeyboard(OzonTextInputLayoutExtKt.getEditText(inputMoleculeView.getInput().getMainView()));
        } else {
            ViewParent parent = view.getParent().getParent();
            personalInfoVerificationView.activeInput = parent instanceof OzonTextInputLayout ? (OzonTextInputLayout) parent : null;
        }
    }

    public final void bind(@NotNull PersonalInfoVerificationVO item, boolean isPatronymicCheckBoxSelected, @NotNull Function1<? super AtomAction, Unit> onPatronymicSelectionChange) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onPatronymicSelectionChange, "onPatronymicSelectionChange");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getFormBackgroundColor(), R$color.layer_floor_1);
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(parseColor));
        }
        TextHolderKt.bind$default(this.titleTv, item.getTitle(), null, 2, null);
        AtomsAdapter adapter = this.subtitleLayout.getAdapter();
        if (adapter != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            adapter.bind(context2, item.getSubtitle());
        }
        this.surnameInput.bind(item.getSurnameInput(), item.getSurnameInput().getValue());
        this.nameInput.bind(item.getNameInput(), item.getNameInput().getValue());
        InputMoleculeView inputMoleculeView = this.patronymicInput;
        inputMoleculeView.setVisibility(!isPatronymicCheckBoxSelected ? 0 : 8);
        inputMoleculeView.bind(item.getPatronymicInput(), item.getPatronymicInput().getValue());
        CellHolderKt.bind(this.patronymicSettingsCell, item.getPatronymicSettingsCell(), onPatronymicSelectionChange);
        this.birthDateInput.bind(item.getBirthDateInput(), item.getBirthDateInput().getValue());
        this.passportInput.bind(item.getPassportInput(), item.getPassportInput().getValue());
    }

    public final OzonTextInputLayout getActiveInput() {
        return this.activeInput;
    }

    public final Function2<String, String, Unit> getOnInputValueChange() {
        return this.onInputValueChange;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initInput(this.surnameInput, "INPUT_SURNAME");
        initInput(this.nameInput, "INPUT_NAME");
        initInput(this.patronymicInput, "INPUT_PATRONYMIC");
        initInput(this.birthDateInput, "INPUT_BIRTH_DATE");
        initInput(this.passportInput, "INPUT_PASSPORT");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        clearInput(this.surnameInput);
        clearInput(this.nameInput);
        clearInput(this.patronymicInput);
        clearInput(this.birthDateInput);
        clearInput(this.passportInput);
        super.onDetachedFromWindow();
    }

    public final void setOnInputValueChange(Function2<? super String, ? super String, Unit> function2) {
        this.onInputValueChange = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoVerificationView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDp16();
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
        InputMoleculeView inputMoleculeView = new InputMoleculeView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        inputMoleculeView.setId(View.generateViewId());
        inputMoleculeView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.surnameInput = inputMoleculeView;
        InputMoleculeView inputMoleculeView2 = new InputMoleculeView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        inputMoleculeView2.setId(View.generateViewId());
        inputMoleculeView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.nameInput = inputMoleculeView2;
        InputMoleculeView inputMoleculeView3 = new InputMoleculeView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        inputMoleculeView3.setId(View.generateViewId());
        inputMoleculeView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.patronymicInput = inputMoleculeView3;
        AttributeSet attributeSet3 = null;
        int i14 = 0;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMarginStart(dimens.getDp16());
        layoutParams3.setMarginEnd(dimens.getDp16());
        cellView.setLayoutParams(layoutParams3);
        this.patronymicSettingsCell = cellView;
        int i15 = 6;
        InputMoleculeView inputMoleculeView4 = new InputMoleculeView(context, attributeSet3, i14, i15, defaultConstructorMarker2);
        inputMoleculeView4.setId(View.generateViewId());
        inputMoleculeView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.birthDateInput = inputMoleculeView4;
        InputMoleculeView inputMoleculeView5 = new InputMoleculeView(context, attributeSet3, i14, i15, defaultConstructorMarker2);
        inputMoleculeView5.setId(View.generateViewId());
        inputMoleculeView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.passportInput = inputMoleculeView5;
        setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        gradientDrawable.setShape(0);
        float f7 = containerCornerRadius;
        DrawableExtKt.setCornerRadius(gradientDrawable, f7, f7, f7, f7);
        setBackground(gradientDrawable);
        addView(textAtomV2View);
        addView(verticalAtomsLayout);
        addView(inputMoleculeView);
        addView(inputMoleculeView2);
        addView(inputMoleculeView3);
        addView(cellView);
        addView(inputMoleculeView4);
        addView(inputMoleculeView5);
    }
}

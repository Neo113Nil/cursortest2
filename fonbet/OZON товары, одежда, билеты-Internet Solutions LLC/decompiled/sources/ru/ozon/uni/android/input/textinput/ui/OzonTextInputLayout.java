package ru.ozon.uni.android.input.textinput.ui;

import EX.c;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.domain.OzonTextInputLayoutDelegate;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.buttons.InputActionButtonsContainer;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import y7.C10856g;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010%\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J)\u00102\u001a\u00020\r2\u0006\u0010,\u001a\u00020+2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\r2\u0006\u00104\u001a\u00020+2\b\b\u0002\u00105\u001a\u00020+H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:R*\u0010<\u001a\u00020$2\u0006\u0010;\u001a\u00020$8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010'R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0017\u0010V\u001a\u00020U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR$\u0010]\u001a\u00020+2\u0006\u0010;\u001a\u00020+8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010.¨\u0006_"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "type", "setKeyboardType", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "action", "setKeyboardAction", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;)V", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "style", "setStyle", "(Lru/ozon/uni/android/input/textinput/data/TextInputStyle;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "setStatus", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "setState", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;)V", "", "text", "setLabelText", "(Ljava/lang/String;)V", "", "setInputText", "(Ljava/lang/CharSequence;)V", "", "flag", "canCopy", "(Z)V", "canReset", "Lkotlin/Function0;", "clickListener", "hasInfo", "(ZLkotlin/jvm/functions/Function0;)V", "isActive", "hidePassword", "hasPassword", "(ZZ)V", "Landroid/text/Editable;", "getInputText", "()Landroid/text/Editable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "viewHeight", "I", "currentStyle", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "textWatcher", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "getTextWatcher", "()Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "setTextWatcher", "(Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;)V", "Ly7/g;", "bgDrawable", "Ly7/g;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextInputLayoutDelegate;", "delegate", "Lru/ozon/uni/android/input/textinput/domain/OzonTextInputLayoutDelegate;", "Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;", "actionButtonsContainer", "Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;", "Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "inputViewGroup", "Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "getInputViewGroup", "()Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "getTruncateOnLostFocus$uni_release", "()Z", "setTruncateOnLostFocus$uni_release", "truncateOnLostFocus", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class OzonTextInputLayout extends ConstraintLayout implements AtomLocatableView {

    @NotNull
    private final InputActionButtonsContainer actionButtonsContainer;

    @NotNull
    private final C10856g bgDrawable;

    @NotNull
    private TextInputStyle currentStyle;

    @NotNull
    private final OzonTextInputLayoutDelegate delegate;

    @NotNull
    private final TextInputGroupView inputViewGroup;

    @NotNull
    private String locatorTag;
    private OzonTextWatcher textWatcher;
    private int viewHeight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout$Companion;", "", "<init>", "()V", "INPUT_LOCATABLE_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(OzonTextInputLayout ozonTextInputLayout, View view) {
        ozonTextInputLayout.inputViewGroup.getInputView().requestFocus();
    }

    public void canCopy(boolean flag) {
        this.delegate.canCopy(flag);
    }

    public void canReset(boolean flag) {
        this.delegate.canReset(flag);
    }

    public Editable getInputText() {
        return this.inputViewGroup.getInputText();
    }

    @NotNull
    public final TextInputGroupView getInputViewGroup() {
        return this.inputViewGroup;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final OzonTextWatcher getTextWatcher() {
        return this.textWatcher;
    }

    public void hasInfo(boolean flag, Function0<Unit> clickListener) {
        this.delegate.hasInfo(flag, clickListener);
    }

    public void hasPassword(boolean isActive, boolean hidePassword) {
        this.delegate.hasPassword(isActive, isActive);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.viewHeight, View.MeasureSpec.getMode(widthMeasureSpec)));
    }

    public void setInputText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.delegate.setInputText(text);
    }

    public void setKeyboardAction(@NotNull OzonTextInputLayoutModel.KeyboardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.delegate.setKeyboardAction(action);
    }

    public void setKeyboardType(@NotNull OzonTextInputLayoutModel.KeyboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.delegate.setKeyboardType(type);
    }

    public void setLabelText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.delegate.setLabelText(text);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public void setState(@NotNull OzonTextInputLayoutModel.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.delegate.setState(state);
    }

    public void setStatus(@NotNull OzonTextInputLayoutModel.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.delegate.setStatus(status);
    }

    public void setStyle(@NotNull TextInputStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.viewHeight = style.getHeight();
        this.delegate.setStyle(style);
        requestLayout();
    }

    public final void setTextWatcher(OzonTextWatcher ozonTextWatcher) {
        this.textWatcher = ozonTextWatcher;
    }

    public final void setTruncateOnLostFocus$uni_release(boolean z11) {
        this.delegate.setTruncateOnLostFocus$uni_release(z11);
    }

    public /* synthetic */ OzonTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "input";
        this.currentStyle = TextInputStyle.INSTANCE.createInput600Style();
        C10856g c10856g = new C10856g();
        this.bgDrawable = c10856g;
        c10856g.E(Paint.Style.STROKE);
        int i12 = Y.f42258g;
        setBackground(c10856g);
        TextInputGroupView textInputGroupView = new TextInputGroupView(context, null, 0, 6, null);
        textInputGroupView.setId(R$id.inputTextGroup);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -1);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41657u = R$id.inputActionButtons;
        bVar.f41598E = 0.0f;
        addView(textInputGroupView, bVar);
        this.inputViewGroup = textInputGroupView;
        InputActionButtonsContainer inputActionButtonsContainer = new InputActionButtonsContainer(context, null, 0, 6, null);
        inputActionButtonsContainer.setId(R$id.inputActionButtons);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -1);
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.f41655s = R$id.inputTextGroup;
        bVar2.f41598E = 1.0f;
        inputActionButtonsContainer.setPadding(UiExtKt.toPx(4), 0, 0, 0);
        addView(inputActionButtonsContainer, bVar2);
        this.actionButtonsContainer = inputActionButtonsContainer;
        setOnClickListener(new c(this, 1));
        this.delegate = new OzonTextInputLayoutDelegate(this, textInputGroupView, c10856g, inputActionButtonsContainer);
        textInputGroupView.getInputView().addTextChangedListener(new TextWatcher() { // from class: ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                OzonTextInputLayout.this.setInputText(s11 != null ? s11 : "");
                OzonTextWatcher textWatcher = OzonTextInputLayout.this.getTextWatcher();
                if (textWatcher != null) {
                    textWatcher.afterTextChanged(s11);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
                OzonTextWatcher textWatcher = OzonTextInputLayout.this.getTextWatcher();
                if (textWatcher != null) {
                    textWatcher.beforeTextChanged(s11, start, count, after);
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
                OzonTextWatcher textWatcher = OzonTextInputLayout.this.getTextWatcher();
                if (textWatcher != null) {
                    textWatcher.onTextChanged(s11, start, before, count);
                }
            }
        });
        setStyle(this.currentStyle);
        setContentDescription(getLocatorTag());
        setFocusableInTouchMode(false);
        setFocusable(false);
    }
}

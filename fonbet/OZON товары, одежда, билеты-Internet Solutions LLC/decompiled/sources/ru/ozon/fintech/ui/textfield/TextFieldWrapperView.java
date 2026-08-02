package ru.ozon.fintech.ui.textfield;

import G.g;
import H30.z;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/textfield/TextFieldWrapperView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/textfield/TextFieldWrapperState;", "textField", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldWrapperView extends FrameLayout {
    private TextFieldWrapperState state;

    @NotNull
    private final TextFieldCellView textField;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$15$lambda$13(TextFieldWrapperView textFieldWrapperView, String icon, AddonSide position, String color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(color, "color");
        Context context = textFieldWrapperView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, icon);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = textFieldWrapperView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context2, color);
        textFieldWrapperView.textField.setLabelIcon(iconResByToken, position, Integer.valueOf(mapColor != null ? mapColor.intValue() : R.color.oz_semantic_text_secondary));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$15$lambda$14(TextFieldWrapperView textFieldWrapperView, final TextFieldWrapperState textFieldWrapperState, final Function2 onClick, final String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        textFieldWrapperView.textField.getMainView().setTextWatcher(new OzonTextWatcher() { // from class: ru.ozon.fintech.ui.textfield.TextFieldWrapperView$bindState$1$14$1
            private String searchFor = "";

            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                String obj = h.z0(String.valueOf(s11)).toString();
                if (Intrinsics.d(obj, this.searchFor)) {
                    return;
                }
                this.searchFor = obj;
                onClick.invoke(g.c(actionId, ProductContainerDTO.RATIO_DELIMITER, obj), Boolean.valueOf(textFieldWrapperState.getCloseOnClick()));
            }
        });
        return Unit.f71690a;
    }

    public final void bindState(@NotNull final TextFieldWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        TextFieldPreset textFieldPreset = state.getTextFieldPreset();
        if (textFieldPreset != null) {
            this.textField.setPreset(textFieldPreset);
        }
        OzonTextInputLayoutModel.State inputState = state.getInputState();
        if (inputState != null) {
            this.textField.setInputState(inputState);
        }
        OzonTextInputLayoutModel.Status inputStatus = state.getInputStatus();
        if (inputStatus != null) {
            this.textField.setInputStatus(inputStatus);
        }
        OzonTextInputLayoutModel.KeyboardType inputKeyboardType = state.getInputKeyboardType();
        if (inputKeyboardType != null) {
            this.textField.setInputKeyboardType(inputKeyboardType);
        }
        OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction = state.getInputKeyboardAction();
        if (inputKeyboardAction != null) {
            this.textField.setInputKeyboardAction(inputKeyboardAction);
        }
        String inputTitle = state.getInputTitle();
        if (inputTitle != null) {
            this.textField.setInputLabelText(inputTitle);
        }
        String inputValue = state.getInputValue();
        if (inputValue != null) {
            this.textField.setInputText(inputValue);
        }
        String labelText = state.getLabelText();
        if (labelText != null) {
            this.textField.setLabelText(labelText);
        }
        String labelTextColor = state.getLabelTextColor();
        if (labelTextColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context, labelTextColor);
            if (mapColor != null) {
                TextFieldCellApi.DefaultImpls.setLabelColor$default(this.textField, androidx.core.content.a.getColor(getContext(), mapColor.intValue()), 0.0f, 2, null);
            }
        }
        Boolean isInputCopyEnabled = state.isInputCopyEnabled();
        if (isInputCopyEnabled != null) {
            this.textField.inputCanCopy(isInputCopyEnabled.booleanValue());
        }
        Boolean isInputProtected = state.isInputProtected();
        if (isInputProtected != null) {
            this.textField.setEnabled(isInputProtected.booleanValue());
        }
        Boolean isInputResetEnabled = state.isInputResetEnabled();
        if (isInputResetEnabled != null) {
            this.textField.inputCanReset(isInputResetEnabled.booleanValue());
        }
        E30.g.b(new InterfaceC6511n() { // from class: ru.ozon.fintech.ui.textfield.a
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit bindState$lambda$15$lambda$13;
                bindState$lambda$15$lambda$13 = TextFieldWrapperView.bindState$lambda$15$lambda$13(TextFieldWrapperView.this, (String) obj, (AddonSide) obj2, (String) obj3);
                return bindState$lambda$15$lambda$13;
            }
        }, state.getLabelIcon(), state.getLabelIconPosition(), state.getLabelIconColor());
        E30.g.a(new Function2() { // from class: ru.ozon.fintech.ui.textfield.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit bindState$lambda$15$lambda$14;
                bindState$lambda$15$lambda$14 = TextFieldWrapperView.bindState$lambda$15$lambda$14(TextFieldWrapperView.this, state, (Function2) obj, (String) obj2);
                return bindState$lambda$15$lambda$14;
            }
        }, state.getOnClick(), state.getActionId());
        z.a(this, state.getPaddings());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextFieldWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        this.textField = textFieldCellView;
        setTag("TextFieldWrapperView");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textFieldCellView);
    }
}

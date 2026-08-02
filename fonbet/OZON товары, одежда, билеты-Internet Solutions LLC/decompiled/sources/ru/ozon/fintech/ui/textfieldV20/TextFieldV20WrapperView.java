package ru.ozon.fintech.ui.textfieldV20;

import E30.g;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import i70.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Keep
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperState;", "getState", "()Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperState;", "setState", "(Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperState;)V", "textField", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "textWatcher", "ru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperView$textWatcher$1", "Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperView$textWatcher$1;", "searchFor", "", "onTextChanged", "", "searchText", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldV20WrapperView extends WidgetFrameLayout {

    @NotNull
    private String searchFor;
    private TextFieldV20WrapperState state;

    @NotNull
    private final TextFieldCellView textField;

    @NotNull
    private final TextFieldV20WrapperView$textWatcher$1 textWatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldV20WrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$15$lambda$14(TextFieldV20WrapperView textFieldV20WrapperView, String icon, AddonSide position, String color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(color, "color");
        Context context = textFieldV20WrapperView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, icon);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = textFieldV20WrapperView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context2, color);
        textFieldV20WrapperView.textField.setLabelIcon(iconResByToken, position, Integer.valueOf(mapColor != null ? mapColor.intValue() : R.color.oz_semantic_text_secondary));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String searchText) {
        Common common;
        if (Intrinsics.d(searchText, this.searchFor)) {
            return;
        }
        setCurrentVersionStamp(getCurrentVersionStamp() + 1);
        this.searchFor = searchText;
        TextFieldV20WrapperState textFieldV20WrapperState = this.state;
        if (textFieldV20WrapperState == null || (common = textFieldV20WrapperState.getCommon()) == null) {
            return;
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.TEXT_CHANGED, null, searchText, null, null, null, null, null, null, null, null, null, Integer.valueOf(getCurrentVersionStamp()), null, null, null, null, null, null, 2080744, null));
    }

    public final void bindState(@NotNull TextFieldV20WrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getVersionStamp() == null || state.getVersionStamp().intValue() >= getCurrentVersionStamp()) {
            Integer versionStamp = state.getVersionStamp();
            setCurrentVersionStamp(versionStamp != null ? versionStamp.intValue() : getCurrentVersionStamp());
            Common common = state.getCommon();
            TextFieldV20WrapperState textFieldV20WrapperState = this.state;
            CbottomExtKt.applyCbottomLayoutParams(this, common, textFieldV20WrapperState != null ? textFieldV20WrapperState.getCommon() : null);
            Common common2 = state.getCommon();
            TextFieldV20WrapperState textFieldV20WrapperState2 = this.state;
            CbottomExtKt.applyCbottomBackground(this, common2, textFieldV20WrapperState2 != null ? textFieldV20WrapperState2.getCommon() : null);
            Common common3 = state.getCommon();
            TextFieldV20WrapperState textFieldV20WrapperState3 = this.state;
            CbottomExtKt.applyClickListener$default(this, common3, textFieldV20WrapperState3 != null ? textFieldV20WrapperState3.getCommon() : null, null, 4, null);
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
                    TextFieldCellApi.DefaultImpls.setLabelColor$default(this.textField, a.getColor(getContext(), mapColor.intValue()), 0.0f, 2, null);
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
            g.b(new h(this, 1), state.getLabelIcon(), state.getLabelIconPosition(), state.getLabelIconColor());
            this.textField.getMainView().setTextWatcher(this.textWatcher);
        }
    }

    public final TextFieldV20WrapperState getState() {
        return this.state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.textField;
    }

    public final void setState(TextFieldV20WrapperState textFieldV20WrapperState) {
        this.state = textFieldV20WrapperState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldV20WrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public TextFieldV20WrapperState getState() {
        return this.state;
    }

    public /* synthetic */ TextFieldV20WrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v1, types: [ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView$textWatcher$1] */
    public TextFieldV20WrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        this.textField = textFieldCellView;
        this.textWatcher = new OzonTextWatcher() { // from class: ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView$textWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                TextFieldV20WrapperView.this.onTextChanged(String.valueOf(s11));
            }
        };
        this.searchFor = "";
        setTag("TextFieldV20WrapperView");
        textFieldCellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(textFieldCellView);
    }
}

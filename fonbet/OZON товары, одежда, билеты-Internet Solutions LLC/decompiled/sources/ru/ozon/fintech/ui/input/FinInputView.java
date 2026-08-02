package ru.ozon.fintech.ui.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniColors;

@Keep
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0011\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/input/FinInputView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inputView", "Lru/ozon/fintech/ui/input/InputView;", "state", "Lru/ozon/fintech/ui/input/FinInputState;", "newTextChanged", "", "textWatcher", "ru/ozon/fintech/ui/input/FinInputView$textWatcher$1", "Lru/ozon/fintech/ui/input/FinInputView$textWatcher$1;", "onTextChanged", "", "inputText", "bindState", "updateNewState", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinInputView extends WidgetFrameLayout {

    @NotNull
    private static final String FIRST_ICON = "firstIcon";

    @NotNull
    private static final String SECOND_ICON = "secondIcon";

    @NotNull
    private final InputView inputView;

    @NotNull
    private String newTextChanged;
    private FinInputState state;

    @NotNull
    private final FinInputView$textWatcher$1 textWatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(FinInputView finInputView) {
        Common common;
        FinInputState finInputState = finInputView.state;
        if (finInputState != null && (common = finInputState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, FIRST_ICON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136, null));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(FinInputView finInputView) {
        Common common;
        FinInputState finInputState = finInputView.state;
        if (finInputState != null && (common = finInputState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, SECOND_ICON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136, null));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String inputText) {
        Common common;
        if (Intrinsics.d(inputText, this.newTextChanged)) {
            return;
        }
        setCurrentVersionStamp(getCurrentVersionStamp() + 1);
        this.newTextChanged = inputText;
        FinInputState finInputState = this.state;
        if (finInputState == null || (common = finInputState.getCommon()) == null) {
            return;
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.TEXT_CHANGED, null, inputText, null, null, null, null, null, null, null, null, null, Integer.valueOf(getCurrentVersionStamp()), null, null, null, null, null, null, 2080744, null));
    }

    private final void updateNewState(FinInputState state) {
        Integer num;
        Integer num2;
        Integer num3;
        Editable text;
        String value = state.getValue();
        if (value == null) {
            value = "";
        }
        this.newTextChanged = value;
        InputView inputView = this.inputView;
        inputView.setSize(state.getSize());
        Integer maxLength = state.getMaxLength();
        inputView.setMaxLength(maxLength != null ? maxLength.intValue() : inputView.getMaxLength());
        inputView.getInputTextView().removeTextChangedListener(this.textWatcher);
        String value2 = state.getValue();
        inputView.setInputText(value2 != null ? value2 : "");
        inputView.setCaption(state.getCaption());
        inputView.setCaptionMaxLines(3);
        inputView.setMaxInputLines(1);
        inputView.setLabel(state.getLabel());
        inputView.setLabelPosition(state.getLabelPosition());
        inputView.setTheme(state.getTheme());
        inputView.setInputMode(state.getInputMode());
        inputView.setInputMask(state.getInputMask());
        inputView.setPlaceHolder(state.getPlaceholder());
        String firstIcon = state.getFirstIcon();
        if (firstIcon != null) {
            Context context = inputView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = TokensExtKt.getIconResByToken(context, firstIcon);
        } else {
            num = null;
        }
        inputView.setFirstIconToken(num);
        String secondIcon = state.getSecondIcon();
        if (secondIcon != null) {
            Context context2 = inputView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = TokensExtKt.getIconResByToken(context2, secondIcon);
        } else {
            num2 = null;
        }
        inputView.setSecondIconToken(num2);
        String captionColor = state.getCaptionColor();
        if (captionColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context3 = inputView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            num3 = Integer.valueOf(styleParser.parseColor(context3, captionColor, UniColors.TEXT_SECONDARY.getResId()));
        } else {
            num3 = null;
        }
        inputView.setCaptionColor(num3);
        inputView.setState(state.getState());
        inputView.setStatus(state.getStatus());
        inputView.getInputTextView().setSingleLine(true);
        inputView.getInputTextView().setHorizontallyScrolling(true);
        inputView.getInputTextView().setEllipsize(null);
        inputView.getInputTextView().addTextChangedListener(this.textWatcher);
        FinInputState finInputState = this.state;
        if ((finInputState != null ? finInputState.getState() : null) != state.getState() && state.getState() == InputView.State.ACTIVE) {
            this.inputView.getInputTextView().requestFocus();
            if (this.inputView.getInputTextView().length() > 0 && (text = this.inputView.getInputTextView().getText()) != null) {
                this.inputView.getInputTextView().setSelection(text.length());
            }
        }
        this.state = state;
    }

    public final void bindState(@NotNull FinInputState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getVersionStamp() == null || state.getVersionStamp().intValue() >= getCurrentVersionStamp()) {
            Integer versionStamp = state.getVersionStamp();
            setCurrentVersionStamp(versionStamp != null ? versionStamp.intValue() : getCurrentVersionStamp());
            Common common = state.getCommon();
            FinInputState finInputState = this.state;
            CbottomExtKt.applyCbottomLayoutParams(this, common, finInputState != null ? finInputState.getCommon() : null);
            Common common2 = state.getCommon();
            FinInputState finInputState2 = this.state;
            CbottomExtKt.applyCbottomBackground(this, common2, finInputState2 != null ? finInputState2.getCommon() : null);
            Common common3 = state.getCommon();
            FinInputState finInputState3 = this.state;
            CbottomExtKt.applyClickListener$default(this, common3, finInputState3 != null ? finInputState3.getCommon() : null, null, 4, null);
            updateNewState(state);
        }
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    public View provideActualWidget() {
        return null;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v2, types: [ru.ozon.fintech.ui.input.FinInputView$textWatcher$1] */
    public FinInputView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InputView inputView = new InputView(context, null, 0, 6, null);
        this.inputView = inputView;
        this.newTextChanged = "";
        this.textWatcher = new TextWatcher() { // from class: ru.ozon.fintech.ui.input.FinInputView$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                FinInputView.this.onTextChanged(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
            }
        };
        setTag("FinInputView");
        inputView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(inputView);
        inputView.setFirstIconClickListener(new A90.c(this, 2));
        inputView.setSecondIconClickListener(new A90.d(this, 3));
    }
}

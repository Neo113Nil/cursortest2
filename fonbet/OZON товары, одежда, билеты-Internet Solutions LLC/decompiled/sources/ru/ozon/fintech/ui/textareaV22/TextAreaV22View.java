package ru.ozon.fintech.ui.textareaV22;

import H30.e;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.input.TextAreaAction;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Keep
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0011\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/textareaV22/TextAreaV22View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inputView", "Lru/ozon/fintech/ui/input/InputView;", "state", "Lru/ozon/fintech/ui/textareaV22/TextAreaV22State;", "newTextChanged", "", "textWatcher", "ru/ozon/fintech/ui/textareaV22/TextAreaV22View$textWatcher$1", "Lru/ozon/fintech/ui/textareaV22/TextAreaV22View$textWatcher$1;", "onTextChanged", "", "inputText", "bindState", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaV22View extends WidgetFrameLayout {

    @NotNull
    private static final String COPY = "copy";

    @NotNull
    private static final String INFO = "info";

    @NotNull
    private final InputView inputView;

    @NotNull
    private String newTextChanged;
    private TextAreaV22State state;

    @NotNull
    private final TextAreaV22View$textWatcher$1 textWatcher;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAreaAction.values().length];
            try {
                iArr[TextAreaAction.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAreaAction.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaV22View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(TextAreaV22View textAreaV22View, Context context, TextAreaAction action) {
        Common common;
        Common common2;
        Intrinsics.checkNotNullParameter(action, "action");
        int i11 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i11 == 1) {
            TextAreaV22State textAreaV22State = textAreaV22View.state;
            if (textAreaV22State != null && (common = textAreaV22State.getCommon()) != null) {
                common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, INFO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136, null));
            }
        } else if (i11 == 2) {
            String name = context.getApplicationInfo().name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            e.b(context, name, textAreaV22View.inputView.getInputText());
            TextAreaV22State textAreaV22State2 = textAreaV22View.state;
            if (textAreaV22State2 != null && (common2 = textAreaV22State2.getCommon()) != null) {
                common2.getActionListener().invoke(new ActionResult2UI(common2.getCbottomId(), common2.getWidgetId(), ActionResult2UI.Type.CLICK, COPY, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136, null));
            }
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
        TextAreaV22State textAreaV22State = this.state;
        if (textAreaV22State == null || (common = textAreaV22State.getCommon()) == null) {
            return;
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.TEXT_CHANGED, null, inputText, null, null, null, null, null, null, null, null, null, Integer.valueOf(getCurrentVersionStamp()), null, null, null, null, null, null, 2080744, null));
    }

    public final void bindState(@NotNull TextAreaV22State state) {
        Integer num;
        Editable text;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getVersionStamp() == null || state.getVersionStamp().intValue() >= getCurrentVersionStamp()) {
            Integer versionStamp = state.getVersionStamp();
            setCurrentVersionStamp(versionStamp != null ? versionStamp.intValue() : getCurrentVersionStamp());
            String value = state.getValue();
            if (value == null) {
                value = "";
            }
            this.newTextChanged = value;
            Common common = state.getCommon();
            TextAreaV22State textAreaV22State = this.state;
            CbottomExtKt.applyCbottomLayoutParams(this, common, textAreaV22State != null ? textAreaV22State.getCommon() : null);
            Common common2 = state.getCommon();
            TextAreaV22State textAreaV22State2 = this.state;
            CbottomExtKt.applyCbottomBackground(this, common2, textAreaV22State2 != null ? textAreaV22State2.getCommon() : null);
            Common common3 = state.getCommon();
            TextAreaV22State textAreaV22State3 = this.state;
            CbottomExtKt.applyClickListener$default(this, common3, textAreaV22State3 != null ? textAreaV22State3.getCommon() : null, null, 4, null);
            InputView inputView = this.inputView;
            inputView.setStyle(InputView.Style.TEXTAREA);
            inputView.setHasInfoIcon(state.getHasInfoIcon());
            Boolean bottomBar = state.getBottomBar();
            inputView.setBottomBar(bottomBar != null ? bottomBar.booleanValue() : false);
            inputView.setCounter(state.getCounter());
            inputView.getInputTextView().removeTextChangedListener(this.textWatcher);
            String value2 = state.getValue();
            inputView.setInputText(value2 != null ? value2 : "");
            inputView.setCaption(state.getCaption());
            inputView.setCaptionMaxLines(3);
            inputView.setLabel(state.getLabel());
            inputView.setPlaceHolder(state.getPlaceholder());
            inputView.setInputMode(InputView.InputMode.TEXT);
            String captionColor = state.getCaptionColor();
            if (captionColor != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = inputView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                num = Integer.valueOf(styleParser.parseColor(context, captionColor, UniColors.TEXT_SECONDARY.getResId()));
            } else {
                num = null;
            }
            inputView.setCaptionColor(num);
            Integer rows = state.getRows();
            inputView.setRows(rows != null ? rows.intValue() : 1);
            Boolean isResize = state.isResize();
            inputView.setResize(isResize != null ? isResize.booleanValue() : false);
            Boolean disableClearButton = state.getDisableClearButton();
            inputView.setDisabledTextAreaClearButton(disableClearButton != null ? disableClearButton.booleanValue() : false);
            inputView.setStatus(state.getStatus());
            inputView.getInputTextView().addTextChangedListener(this.textWatcher);
            inputView.setState(state.getState());
            TextAreaV22State textAreaV22State4 = this.state;
            if ((textAreaV22State4 != null ? textAreaV22State4.getState() : null) != state.getState() && state.getState() == InputView.State.ACTIVE) {
                this.inputView.getInputTextView().requestFocus();
                if (this.inputView.getInputTextView().length() > 0 && (text = this.inputView.getInputTextView().getText()) != null) {
                    this.inputView.getInputTextView().setSelection(text.length());
                }
                this.inputView.getInputTextView().setTextIsSelectable(false);
            }
            this.state = state;
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
    public TextAreaV22View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextAreaV22View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v2, types: [ru.ozon.fintech.ui.textareaV22.TextAreaV22View$textWatcher$1] */
    public TextAreaV22View(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InputView inputView = new InputView(context, null, 0, 6, null);
        this.inputView = inputView;
        this.newTextChanged = "";
        this.textWatcher = new TextWatcher() { // from class: ru.ozon.fintech.ui.textareaV22.TextAreaV22View$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                TextAreaV22View.this.onTextChanged(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
            }
        };
        setTag("TextAreaV22View");
        inputView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(inputView);
        inputView.setInfoTextAreaIconClickListener(new Function1() { // from class: ru.ozon.fintech.ui.textareaV22.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$3;
                _init_$lambda$3 = TextAreaV22View._init_$lambda$3(TextAreaV22View.this, context, (TextAreaAction) obj);
                return _init_$lambda$3;
            }
        });
    }
}

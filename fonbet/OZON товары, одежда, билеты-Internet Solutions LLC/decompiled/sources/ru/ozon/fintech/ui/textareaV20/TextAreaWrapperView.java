package ru.ozon.fintech.ui.textareaV20;

import B30.o;
import C.D;
import Q90.l;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR4\u0010\u001e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperState;", "state", "", "bindState", "(Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperState;)V", "Landroid/view/View;", "provideActualWidget", "()Landroid/view/View;", "Lru/ozon/fintech/ui/utils/WidgetState;", "provideWidgetState", "()Lru/ozon/fintech/ui/utils/WidgetState;", "Lru/ozon/uni/android/textArea/TextAreaView;", "bxTextArea", "Lru/ozon/uni/android/textArea/TextAreaView;", "Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperState;", "", "newTextChanged", "Ljava/lang/String;", "Lkotlin/Function4;", "", "textChanged", "Lfd/o;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "internalOzonTextInput$delegate", "LSc/j;", "getInternalOzonTextInput", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "internalOzonTextInput", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaWrapperView extends WidgetFrameLayout {

    @NotNull
    private static final String INFO = "info";

    @NotNull
    private final TextAreaView bxTextArea;

    /* renamed from: internalOzonTextInput$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j internalOzonTextInput;

    @NotNull
    private String newTextChanged;
    private TextAreaWrapperState state;

    @NotNull
    private final InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> textChanged;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(TextAreaWrapperView textAreaWrapperView) {
        Common common;
        TextAreaWrapperState textAreaWrapperState = textAreaWrapperView.state;
        if (textAreaWrapperState != null && (common = textAreaWrapperState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, INFO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136, null));
        }
        return Unit.f71690a;
    }

    private final OzonTextInput getInternalOzonTextInput() {
        return (OzonTextInput) this.internalOzonTextInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OzonTextInput internalOzonTextInput_delegate$lambda$2(TextAreaWrapperView textAreaWrapperView) {
        return (OzonTextInput) textAreaWrapperView.bxTextArea.findViewById(R.id.inputEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textChanged$lambda$1(TextAreaWrapperView textAreaWrapperView, CharSequence charSequence, int i11, int i12, int i13) {
        TextAreaWrapperState textAreaWrapperState;
        Common common;
        String obj = h.z0(String.valueOf(charSequence)).toString();
        if (!Intrinsics.d(obj, textAreaWrapperView.newTextChanged) && (textAreaWrapperState = textAreaWrapperView.state) != null && (common = textAreaWrapperState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.TEXT_CHANGED, null, obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097128, null));
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if ((r1.intValue() != -1) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindState(@NotNull TextAreaWrapperState state) {
        Integer num;
        OzonTextInput internalOzonTextInput;
        Intrinsics.checkNotNullParameter(state, "state");
        String inputText = state.getInputText();
        if (inputText == null) {
            inputText = "";
        }
        this.newTextChanged = inputText;
        Common common = state.getCommon();
        TextAreaWrapperState textAreaWrapperState = this.state;
        Integer num2 = null;
        CbottomExtKt.applyCbottomLayoutParams(this, common, textAreaWrapperState != null ? textAreaWrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        TextAreaWrapperState textAreaWrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, textAreaWrapperState2 != null ? textAreaWrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        TextAreaWrapperState textAreaWrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, textAreaWrapperState3 != null ? textAreaWrapperState3.getCommon() : null, null, 4, null);
        TextAreaView textAreaView = this.bxTextArea;
        textAreaView.setState(state.getState());
        textAreaView.setStatus(state.getStatus());
        Boolean hasBottomBar = state.getHasBottomBar();
        textAreaView.setHasBottomBar(hasBottomBar != null ? hasBottomBar.booleanValue() : false);
        Boolean hasInfoIcon = state.getHasInfoIcon();
        textAreaView.setHasInfoIcon(hasInfoIcon != null ? hasInfoIcon.booleanValue() : false);
        Boolean hasCounter = state.getHasCounter();
        textAreaView.setHasCounter(hasCounter != null ? hasCounter.booleanValue() : false);
        String currentCountColor = state.getCurrentCountColor();
        if (currentCountColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textAreaView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = Integer.valueOf(Integer.valueOf(styleParser.parseColor(context, currentCountColor, -1)).intValue());
        }
        num = null;
        textAreaView.setCurrentCountColor(num);
        Integer maxLength = state.getMaxLength();
        if (maxLength != null) {
            textAreaView.setMaxLength(maxLength.intValue());
        }
        textAreaView.setInputText(state.getInputText());
        Integer minLines = state.getMinLines();
        if (minLines != null) {
            textAreaView.setMinLines(minLines.intValue());
        }
        Integer maxLines = state.getMaxLines();
        if (maxLines != null) {
            textAreaView.setMaxLines(maxLines.intValue());
        }
        Boolean scrollbarEnabled = state.getScrollbarEnabled();
        if (scrollbarEnabled != null) {
            textAreaView.setScrollbarEnabled(scrollbarEnabled.booleanValue());
        }
        textAreaView.setHasActionIcon(true);
        textAreaView.setCaption(state.getCaption());
        String captionColor = state.getCaptionColor();
        if (captionColor != null) {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = textAreaView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer valueOf = Integer.valueOf(Integer.valueOf(styleParser2.parseColor(context2, captionColor, -1)).intValue());
            if (valueOf.intValue() != -1) {
                num2 = valueOf;
            }
        }
        textAreaView.setCaptionColor(num2);
        textAreaView.setLabel(state.getLabel());
        if (state.getState() == TextAreaView.State.ACTIVE && (internalOzonTextInput = getInternalOzonTextInput()) != null) {
            internalOzonTextInput.requestFocus();
        }
        this.state = state;
        TextAreaView.INSTANCE.doOnTextChanged(this.bxTextArea, this.textChanged);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.bxTextArea;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextAreaWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAreaWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        this.bxTextArea = textAreaView;
        this.newTextChanged = "";
        this.textChanged = new InterfaceC6512o() { // from class: ru.ozon.fintech.ui.textareaV20.a
            @Override // fd.InterfaceC6512o
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit textChanged$lambda$1;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                int intValue3 = ((Integer) obj4).intValue();
                textChanged$lambda$1 = TextAreaWrapperView.textChanged$lambda$1(TextAreaWrapperView.this, (CharSequence) obj, intValue, intValue2, intValue3);
                return textChanged$lambda$1;
            }
        };
        this.internalOzonTextInput = k.a(n.PUBLICATION, new o(this, 6));
        setTag("TextAreaWrapperView");
        textAreaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(textAreaView);
        textAreaView.setInfoClickListener(new l(this, 4));
        textAreaView.setClipToOutline(true);
        textAreaView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline != null) {
                    if ((view != null ? Integer.valueOf(view.getWidth()) : null) != null) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.c(12.0f));
                    }
                }
            }
        });
        textAreaView.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.oz_semantic_bg_secondary));
    }
}

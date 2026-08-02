package ru.ozon.fintech.ui.textatomV20;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import ja.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperState;", "provideWidgetState", "()Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperState;", "Landroid/view/View;", "provideActualWidget", "()Landroid/view/View;", "state", "", "bindState", "(Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperState;)V", "Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperState;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lkotlin/Function1;", "", "", "spanClickListener", "Lkotlin/jvm/functions/Function1;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAtomV20WrapperView extends WidgetFrameLayout {

    @NotNull
    private final Function1<String, Object> spanClickListener;
    private TextAtomV20WrapperState state;

    @NotNull
    private final TextAtomView textAtomView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gravity.values().length];
            try {
                iArr[Gravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gravity.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomV20WrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String spanClickListener$lambda$1(TextAtomV20WrapperView textAtomV20WrapperView, String spanText) {
        Common common;
        Intrinsics.checkNotNullParameter(spanText, "spanText");
        TextAtomV20WrapperState textAtomV20WrapperState = textAtomV20WrapperView.state;
        if (textAtomV20WrapperState != null && (common = textAtomV20WrapperState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.URL_CLICK, null, null, spanText, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097112, null));
        }
        return spanText;
    }

    public final void bindState(@NotNull TextAtomV20WrapperState state) {
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        TextAtomV20WrapperState textAtomV20WrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, textAtomV20WrapperState != null ? textAtomV20WrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        TextAtomV20WrapperState textAtomV20WrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, textAtomV20WrapperState2 != null ? textAtomV20WrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        TextAtomV20WrapperState textAtomV20WrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, textAtomV20WrapperState3 != null ? textAtomV20WrapperState3.getCommon() : null, null, 4, null);
        this.state = state;
        TextAtomHolderKt.bind$default(this.textAtomView, state.getTextAtomDTO(), null, 2, null);
        TextAtomView textAtomView = this.textAtomView;
        int i12 = WhenMappings.$EnumSwitchMapping$0[state.getGravity().ordinal()];
        if (i12 == 1) {
            i11 = 8388627;
        } else if (i12 == 2) {
            i11 = 8388629;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = 17;
        }
        textAtomView.setGravity(i11);
        TextAtom textAtomDTO = state.getTextAtomDTO();
        if (OzonSpannableStringKt.hasClickableSpan(textAtomDTO.getText())) {
            OzonUrlSpan.INSTANCE.setOnUrlSpanClick(textAtomDTO.getText(), this.textAtomView, this.spanClickListener);
        }
        if (state.getEllipsize() != null) {
            this.textAtomView.setEllipsize(state.getEllipsize());
        }
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.textAtomView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomV20WrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public TextAtomV20WrapperState getState() {
        return this.state;
    }

    public /* synthetic */ TextAtomV20WrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomV20WrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.spanClickListener = new v(this, 1);
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        this.textAtomView = textAtomView;
        setTag("TextAtomV20WrapperView");
        textAtomView.setId(R.id.text_atom);
        textAtomView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(textAtomView);
    }
}

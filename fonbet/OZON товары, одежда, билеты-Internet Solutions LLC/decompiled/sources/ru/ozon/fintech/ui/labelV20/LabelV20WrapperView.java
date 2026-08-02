package ru.ozon.fintech.ui.labelV20;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import ha0.C6903a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/labelV20/LabelV20WrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/ui/labelV20/LabelV20WrapperState;", "provideWidgetState", "()Lru/ozon/fintech/ui/labelV20/LabelV20WrapperState;", "Landroid/view/View;", "provideActualWidget", "()Landroid/view/View;", "state", "", "bindState", "(Lru/ozon/fintech/ui/labelV20/LabelV20WrapperState;)V", "linkColor", "I", "Lru/ozon/fintech/ui/labelV20/LabelV20WrapperState;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomV2View", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lkotlin/Function1;", "", "", "spanClickListener", "Lkotlin/jvm/functions/Function1;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LabelV20WrapperView extends WidgetFrameLayout {
    private final int linkColor;

    @NotNull
    private final Function1<String, Object> spanClickListener;
    private LabelV20WrapperState state;

    @NotNull
    private final TextAtomV2View textAtomV2View;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelV20WrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String spanClickListener$lambda$1(LabelV20WrapperView labelV20WrapperView, String spanText) {
        Common common;
        Intrinsics.checkNotNullParameter(spanText, "spanText");
        LabelV20WrapperState labelV20WrapperState = labelV20WrapperView.state;
        if (labelV20WrapperState != null && (common = labelV20WrapperState.getCommon()) != null) {
            common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.URL_CLICK, null, null, spanText, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097112, null));
        }
        return spanText;
    }

    public final void bindState(@NotNull LabelV20WrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        LabelV20WrapperState labelV20WrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, labelV20WrapperState != null ? labelV20WrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        LabelV20WrapperState labelV20WrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, labelV20WrapperState2 != null ? labelV20WrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        LabelV20WrapperState labelV20WrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, labelV20WrapperState3 != null ? labelV20WrapperState3.getCommon() : null, null, 4, null);
        this.state = state;
        this.textAtomV2View.setTextIsSelectable(false);
        TextHolderKt.bind$default(this.textAtomV2View, state.getTextDTO(), null, 2, null);
        if (!OzonSpannableStringKt.hasClickableSpan(state.getTextDTO().getText())) {
            this.textAtomV2View.setMovementMethod(null);
            return;
        }
        Object[] spans = state.getTextDTO().getText().getSpans(0, state.getTextDTO().getText().length(), OzonUrlSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            OzonUrlSpan ozonUrlSpan = (OzonUrlSpan) obj;
            ozonUrlSpan.setLinkColor(Integer.valueOf(this.linkColor));
            ozonUrlSpan.setOnClick(this.textAtomV2View, this.spanClickListener);
        }
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelV20WrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public LabelV20WrapperState getState() {
        return this.state;
    }

    public /* synthetic */ LabelV20WrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelV20WrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.linkColor = a.getColor(context, R.color.oz_blue);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        this.textAtomV2View = textAtomV2View;
        this.spanClickListener = new C6903a(this, 0);
        setTag("LabelV20WrapperView");
        textAtomV2View.setId(R.id.text_atom);
        textAtomV2View.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(textAtomV2View);
    }
}

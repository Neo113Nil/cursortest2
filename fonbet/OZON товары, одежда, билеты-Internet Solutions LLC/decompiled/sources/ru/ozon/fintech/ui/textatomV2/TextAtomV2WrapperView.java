package ru.ozon.fintech.ui.textatomV2;

import H30.z;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import k70.C7602c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "state", "", "bindState", "(Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;)V", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lkotlin/Function1;", "", "", "spanClickListener", "Lkotlin/jvm/functions/Function1;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAtomV2WrapperView extends FrameLayout {

    @NotNull
    private final Function1<String, Object> spanClickListener;
    private TextAtomV2WrapperState state;

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
    public TextAtomV2WrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String spanClickListener$lambda$1(TextAtomV2WrapperView textAtomV2WrapperView, String spanText) {
        Function2<String, Boolean, Unit> onClick;
        Intrinsics.checkNotNullParameter(spanText, "spanText");
        TextAtomV2WrapperState textAtomV2WrapperState = textAtomV2WrapperView.state;
        if (textAtomV2WrapperState != null && (onClick = textAtomV2WrapperState.getOnClick()) != null) {
            onClick.invoke(spanText, Boolean.valueOf(textAtomV2WrapperState.getCloseOnClick()));
        }
        return spanText;
    }

    public final void bindState(@NotNull TextAtomV2WrapperState state) {
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        TextAtomHolderKt.bind$default(this.textAtomView, state.getTextAtomDTO(), null, 2, null);
        TextAtomView textAtomView = this.textAtomView;
        int i12 = WhenMappings.$EnumSwitchMapping$0[state.getGravity().ordinal()];
        if (i12 == 1) {
            i11 = 8388611;
        } else if (i12 == 2) {
            i11 = 8388613;
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
        this.textAtomView.setEllipsize(state.getEllipsize());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomV2WrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextAtomV2WrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomV2WrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.spanClickListener = new C7602c(this, 1);
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        this.textAtomView = textAtomView;
        setTag("TextAtomV2WrapperView");
        textAtomView.setId(R.id.text_atom);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textAtomView);
    }
}

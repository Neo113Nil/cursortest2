package ru.ozon.fintech.ui.textatom;

import H30.z;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/textatom/TextAtomWrapperView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/textatom/TextAtomWrapperState;", "textAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAtomWrapperView extends FrameLayout {
    private TextAtomWrapperState state;

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
    public TextAtomWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull TextAtomWrapperState state) {
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextAtomWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        this.textAtomView = textAtomView;
        setTag("TextAtomWrapperView");
        textAtomView.setId(R.id.text_atom);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textAtomView);
    }
}

package ru.ozon.fintech.ui.separator;

import C.D;
import H30.z;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/ui/separator/SeparatorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/separator/SeparatorState;", "root", "Landroid/view/View;", "bindState", "", "setRounded", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorView extends FrameLayout {

    @NotNull
    private View root;
    private SeparatorState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setRounded() {
        this.root.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.separator.SeparatorView$setRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                SeparatorState separatorState;
                View view2;
                Integer radius;
                separatorState = SeparatorView.this.state;
                int d11 = D.d((separatorState == null || (radius = separatorState.getRadius()) == null) ? 0 : radius.intValue());
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                view2 = SeparatorView.this.root;
                view2.setTag(new Pair("radius", Integer.valueOf(d11)));
            }
        });
    }

    public final void bindState(@NotNull SeparatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        View view = this.root;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        view.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        ViewGroup.LayoutParams layoutParams = this.root.getLayoutParams();
        Float height = state.getHeight();
        layoutParams.height = height != null ? D.c(height.floatValue()) : 0;
        this.root.setLayoutParams(layoutParams);
        setRounded();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View view = new View(context);
        this.root = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.root);
        this.root.setClipToOutline(true);
        setRounded();
    }
}

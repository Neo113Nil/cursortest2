package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutParams", "scaledLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$p;)Landroidx/recyclerview/widget/RecyclerView$p;", "generateDefaultLayoutParams", "()Landroidx/recyclerview/widget/RecyclerView$p;", "Landroid/view/ViewGroup$LayoutParams;", "lp", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$p;", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$p;", "", "ratio", "F", "getRatio", "()F", "setRatio", "(F)V", "getHorizontalSpace", "()I", "horizontalSpace", "getVerticalSpace", "verticalSpace", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrustFactorLayoutManager extends LinearLayoutManager {
    private float ratio;

    public /* synthetic */ TrustFactorLayoutManager(Context context, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? false : z11);
    }

    private final int getHorizontalSpace() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    private final int getVerticalSpace() {
        return (getWidth() - getPaddingTop()) - getPaddingBottom();
    }

    private final RecyclerView.p scaledLayoutParams(RecyclerView.p layoutParams) {
        int orientation = getOrientation();
        if (orientation == 0) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) ((getHorizontalSpace() * this.ratio) + 0.5d);
            return layoutParams;
        }
        if (orientation != 1) {
            return layoutParams;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) ((getVerticalSpace() * this.ratio) + 0.5d);
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateDefaultLayoutParams() {
        RecyclerView.p generateDefaultLayoutParams = super.generateDefaultLayoutParams();
        Intrinsics.checkNotNullExpressionValue(generateDefaultLayoutParams, "generateDefaultLayoutParams(...)");
        return scaledLayoutParams(generateDefaultLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams lp) {
        RecyclerView.p generateLayoutParams = super.generateLayoutParams(lp);
        Intrinsics.checkNotNullExpressionValue(generateLayoutParams, "generateLayoutParams(...)");
        return scaledLayoutParams(generateLayoutParams);
    }

    public final void setRatio(float f7) {
        this.ratio = f7;
    }

    public TrustFactorLayoutManager(Context context, int i11, boolean z11) {
        super(context, i11, z11);
        this.ratio = 0.75f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attrs) {
        RecyclerView.p generateLayoutParams = super.generateLayoutParams(context, attrs);
        Intrinsics.checkNotNullExpressionValue(generateLayoutParams, "generateLayoutParams(...)");
        return scaledLayoutParams(generateLayoutParams);
    }
}

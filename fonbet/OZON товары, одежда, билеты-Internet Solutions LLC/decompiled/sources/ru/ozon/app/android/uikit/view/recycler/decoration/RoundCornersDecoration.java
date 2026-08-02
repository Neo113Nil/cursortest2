package ru.ozon.app.android.uikit.view.recycler.decoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/decoration/RoundCornersDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "", "radius", "Landroid/content/Context;", "context", "orientation", "spaceAtTheBottom", "", "useDrawOver", "<init>", "(ILandroid/content/Context;IIZ)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "width", "height", "Landroid/graphics/RectF;", "getRectToClip", "(Landroidx/recyclerview/widget/RecyclerView;II)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "F", "rectToClip", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "childRect", "Landroid/graphics/Rect;", "offsetRect", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class RoundCornersDecoration extends CustomDividerDecoration {

    @NotNull
    private final Rect childRect;

    @NotNull
    private final Rect offsetRect;

    @NotNull
    private final Path path;
    private final float radius;

    @NotNull
    private final RectF rectToClip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornersDecoration(int i11, @NotNull Context context, int i12, int i13, boolean z11) {
        super(context, i12, i13, z11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.radius = i11;
        this.rectToClip = new RectF();
        this.childRect = new Rect();
        this.offsetRect = new Rect();
        this.path = new Path();
    }

    private final RectF getRectToClip(RecyclerView parent, int width, int height) {
        View findViewByPosition;
        View findViewByPosition2;
        RecyclerView.g adapter = parent.getAdapter();
        RectF rectF = null;
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        Intrinsics.f(valueOf);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            rectF = this.rectToClip;
            RecyclerView.o layoutManager = parent.getLayoutManager();
            if (layoutManager == null || (findViewByPosition2 = layoutManager.findViewByPosition(0)) == null) {
                rectF.left = -800.0f;
                Unit unit = Unit.f71690a;
            } else {
                parent.getDecoratedBoundsWithMargins(findViewByPosition2, this.childRect);
                getItemOffsets(this.offsetRect, findViewByPosition2, parent, new RecyclerView.A());
                float f7 = this.childRect.left + this.offsetRect.left;
                rectF.left = f7;
                if (f7 < (-this.radius)) {
                    rectF.left = -800.0f;
                }
            }
            rectF.top = Math.max(0, this.childRect.top + this.offsetRect.top);
            rectF.bottom = Math.min(height, this.childRect.bottom - this.offsetRect.bottom);
            RecyclerView.o layoutManager2 = parent.getLayoutManager();
            if (layoutManager2 != null && (findViewByPosition = layoutManager2.findViewByPosition(intValue - 1)) != null) {
                parent.getDecoratedBoundsWithMargins(findViewByPosition, this.childRect);
                getItemOffsets(this.offsetRect, findViewByPosition, parent, new RecyclerView.A());
                float f11 = this.childRect.right - this.offsetRect.right;
                rectF.right = f11;
                float f12 = width;
                if (f11 > this.radius + f12) {
                    rectF.right = f12 + 800.0f;
                }
                return rectF;
            }
            rectF.right = width + 800.0f;
            Unit unit2 = Unit.f71690a;
        }
        return rectF;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration, androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c11, parent, state);
        RectF rectToClip = getRectToClip(parent, c11.getWidth(), c11.getHeight());
        if (rectToClip != null) {
            this.path.reset();
            Path path = this.path;
            float f7 = this.radius;
            path.addRoundRect(rectToClip, f7, f7, Path.Direction.CW);
            c11.clipPath(this.path);
        }
    }
}

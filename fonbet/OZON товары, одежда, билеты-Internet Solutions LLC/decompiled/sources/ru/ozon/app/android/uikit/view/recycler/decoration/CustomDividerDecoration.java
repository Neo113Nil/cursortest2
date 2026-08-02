package ru.ozon.app.android.uikit.view.recycler.decoration;

import Lm0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001;B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b(\u0010&J)\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00042\u0010\u0010,\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*H\u0004¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0014\u00109\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "", "orientation", "spaceAtTheBottom", "", "useDrawOver", "<init>", "(Landroid/content/Context;IIZ)V", "", "setOrientation", "(I)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "child", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "startDividerOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "endDividerOffset", "topDividerOffset", "bottomDividerOffset", "canvas", "drawVertical", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "drawHorizontal", "drawBoth", "pos", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "adapter", "isValidPos", "(ILandroidx/recyclerview/widget/RecyclerView$g;)Z", "I", "Z", "Landroid/graphics/drawable/Drawable;", "divider", "Landroid/graphics/drawable/Drawable;", "getDivider", "()Landroid/graphics/drawable/Drawable;", "setDivider", "(Landroid/graphics/drawable/Drawable;)V", "mOrientation", "mBounds", "Landroid/graphics/Rect;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class CustomDividerDecoration extends RecyclerView.n {
    private Drawable divider;

    @NotNull
    private final Rect mBounds;
    private int mOrientation;
    private final int spaceAtTheBottom;
    private final boolean useDrawOver;

    @NotNull
    private static final int[] ATTRS = {R.attr.listDivider};

    public /* synthetic */ CustomDividerDecoration(Context context, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? false : z11);
    }

    private final void setOrientation(int orientation) {
        if (orientation != 0 && orientation != 1 && orientation != 2) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.mOrientation = orientation;
    }

    public int bottomDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return 0;
    }

    protected void drawBoth(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        canvas.save();
        if (parent.getClipToPadding()) {
            canvas.clipRect(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getWidth() - parent.getPaddingRight(), parent.getHeight() - parent.getPaddingBottom());
        }
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            Intrinsics.f(childAt);
            if (drawFor(parent, childAt)) {
                RecyclerView.o layoutManager = parent.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                }
                int round = Math.round(childAt.getTranslationX()) + this.mBounds.right;
                Drawable drawable = this.divider;
                Intrinsics.f(drawable);
                int intrinsicWidth = round - drawable.getIntrinsicWidth();
                Rect rect = this.mBounds;
                int i12 = rect.top;
                int i13 = rect.bottom;
                Drawable drawable2 = this.divider;
                Intrinsics.f(drawable2);
                drawable2.setBounds(intrinsicWidth, i12, round, i13);
                Drawable drawable3 = this.divider;
                Intrinsics.f(drawable3);
                drawable3.draw(canvas);
                Rect rect2 = this.mBounds;
                int i14 = rect2.right;
                int i15 = rect2.left;
                int round2 = Math.round(childAt.getTranslationY()) + rect2.bottom;
                Drawable drawable4 = this.divider;
                Intrinsics.f(drawable4);
                int intrinsicHeight = round2 - drawable4.getIntrinsicHeight();
                Drawable drawable5 = this.divider;
                Intrinsics.f(drawable5);
                drawable5.setBounds(i15, intrinsicHeight, i14, round2);
                Drawable drawable6 = this.divider;
                Intrinsics.f(drawable6);
                drawable6.draw(canvas);
            }
        }
        canvas.restore();
    }

    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return true;
    }

    protected void drawHorizontal(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        int height;
        int i11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        canvas.save();
        if (parent.getClipToPadding()) {
            i11 = parent.getPaddingTop();
            height = parent.getHeight() - parent.getPaddingBottom();
            canvas.clipRect(parent.getPaddingLeft(), i11, parent.getWidth() - parent.getPaddingRight(), height);
        } else {
            height = parent.getHeight();
            i11 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = parent.getChildAt(i12);
            Intrinsics.f(childAt);
            if (drawFor(parent, childAt)) {
                RecyclerView.o layoutManager = parent.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                }
                int round = Math.round(childAt.getTranslationX()) + this.mBounds.right;
                Drawable drawable = this.divider;
                Intrinsics.f(drawable);
                int intrinsicWidth = round - drawable.getIntrinsicWidth();
                int i13 = topDividerOffset(parent, childAt) + i11;
                int bottomDividerOffset = height - bottomDividerOffset(parent, childAt);
                Drawable drawable2 = this.divider;
                Intrinsics.f(drawable2);
                drawable2.setBounds(intrinsicWidth, i13, round, bottomDividerOffset);
                Drawable drawable3 = this.divider;
                Intrinsics.f(drawable3);
                drawable3.draw(canvas);
            }
        }
        canvas.restore();
    }

    protected void drawVertical(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        int width;
        int i11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        canvas.save();
        if (parent.getClipToPadding()) {
            i11 = parent.getPaddingLeft();
            width = parent.getWidth() - parent.getPaddingRight();
            canvas.clipRect(i11, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
        } else {
            width = parent.getWidth();
            i11 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = parent.getChildAt(i12);
            Intrinsics.f(childAt);
            if (drawFor(parent, childAt)) {
                parent.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                int round = Math.round(childAt.getTranslationY()) + this.mBounds.bottom;
                Drawable drawable = this.divider;
                Intrinsics.f(drawable);
                int intrinsicHeight = round - drawable.getIntrinsicHeight();
                Drawable drawable2 = this.divider;
                Intrinsics.f(drawable2);
                drawable2.setBounds(startDividerOffset(parent, childAt) + i11, topDividerOffset(parent, childAt) + intrinsicHeight, width - endDividerOffset(parent, childAt), round - bottomDividerOffset(parent, childAt));
                Drawable drawable3 = this.divider;
                Intrinsics.f(drawable3);
                drawable3.draw(canvas);
            }
        }
        canvas.restore();
    }

    public int endDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View child, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.divider == null || !drawFor(parent, child)) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (parent.getAdapter() != null) {
            int i15 = this.mOrientation;
            if (i15 != 1) {
                if (i15 != 2) {
                    i12 = 0;
                } else {
                    Drawable drawable = this.divider;
                    Intrinsics.f(drawable);
                    i12 = drawable.getIntrinsicHeight();
                    GridLayoutManager gridLayoutManager = null;
                    if ((this.spaceAtTheBottom != 0 ? this : null) != null) {
                        RecyclerView.o layoutManager = parent.getLayoutManager();
                        GridLayoutManager gridLayoutManager2 = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                        if (gridLayoutManager2 != null) {
                            int childAdapterPosition = parent.getChildAdapterPosition(child);
                            RecyclerView.g adapter = parent.getAdapter();
                            Intrinsics.f(adapter);
                            if (childAdapterPosition >= adapter.getItemCount() - gridLayoutManager2.g()) {
                                int childAdapterPosition2 = parent.getChildAdapterPosition(child);
                                RecyclerView.g adapter2 = parent.getAdapter();
                                Intrinsics.f(adapter2);
                                if (childAdapterPosition2 <= adapter2.getItemCount() - 1) {
                                    gridLayoutManager = gridLayoutManager2;
                                }
                            }
                            if (gridLayoutManager != null) {
                                i13 = this.spaceAtTheBottom;
                                i12 += i13;
                            }
                        }
                    }
                }
                i14 = this.mOrientation;
                if (i14 != 0 || i14 == 2) {
                    Drawable drawable2 = this.divider;
                    Intrinsics.f(drawable2);
                    i11 = drawable2.getIntrinsicWidth();
                } else {
                    i11 = 0;
                }
            } else {
                Drawable drawable3 = this.divider;
                Intrinsics.f(drawable3);
                i12 = drawable3.getIntrinsicHeight();
                if (this.spaceAtTheBottom != 0) {
                    int childAdapterPosition3 = parent.getChildAdapterPosition(child);
                    RecyclerView.g adapter3 = parent.getAdapter();
                    Intrinsics.f(adapter3);
                    if (childAdapterPosition3 == adapter3.getItemCount() - 1) {
                        i13 = this.spaceAtTheBottom;
                        i12 += i13;
                    }
                }
                i14 = this.mOrientation;
                if (i14 != 0) {
                }
                Drawable drawable22 = this.divider;
                Intrinsics.f(drawable22);
                i11 = drawable22.getIntrinsicWidth();
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        outRect.set(0, 0, i11, i12);
    }

    protected final boolean isValidPos(int pos, RecyclerView.g<? extends RecyclerView.C> adapter) {
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (pos >= 0 && pos < itemCount) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.useDrawOver || parent.getLayoutManager() == null || this.divider == null) {
            return;
        }
        int i11 = this.mOrientation;
        if (i11 == 0) {
            drawHorizontal(c11, parent);
        } else if (i11 == 1) {
            drawVertical(c11, parent);
        } else {
            if (i11 != 2) {
                return;
            }
            drawBoth(c11, parent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.useDrawOver || parent.getLayoutManager() == null || this.divider == null) {
            return;
        }
        int i11 = this.mOrientation;
        if (i11 == 0) {
            drawHorizontal(c11, parent);
        } else if (i11 == 1) {
            drawVertical(c11, parent);
        } else {
            if (i11 != 2) {
                return;
            }
            drawBoth(c11, parent);
        }
    }

    public final void setDivider(Drawable drawable) {
        this.divider = drawable;
    }

    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return 0;
    }

    public int topDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return 0;
    }

    public CustomDividerDecoration(@NotNull Context context, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.spaceAtTheBottom = i12;
        this.useDrawOver = z11;
        this.mBounds = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.divider = drawable;
        if (drawable == null) {
            a.f17149a.w("@android:attr/listDivider was not set in the theme used for this DetailsDecoration. Please set that attribute all call setDrawable()", new Object[0]);
        }
        obtainStyledAttributes.recycle();
        setOrientation(i11);
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes12.dex */
public final class n extends RecyclerView.n {
    public static final int[] e = {R.attr.listDivider};
    public Drawable b;
    public final int c;
    public final Rect d = new Rect();

    @SuppressLint({"UnknownNullness"})
    public n(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() == null || this.b == null) {
            return;
        }
        int i3 = this.c;
        int i4 = 0;
        Rect rect = this.d;
        if (i3 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.b.setBounds(i2, round - this.b.getIntrinsicHeight(), width, round);
                this.b.draw(canvas);
                i4++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i4 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i4);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.b.setBounds(round2 - this.b.getIntrinsicWidth(), i, round2, height);
            this.b.draw(canvas);
            i4++;
        }
        canvas.restore();
    }
}

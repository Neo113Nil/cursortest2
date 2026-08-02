package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lzb extends erf {
    public ShapeDrawable a;
    public final int b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public final Rect h = new Rect();

    public lzb(Context context) {
        TypedArray Y = m6k.Y(context, null, pjf.C, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.c = w3a.x(context, Y, 0).getDefaultColor();
        this.b = Y.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.e = Y.getDimensionPixelOffset(2, 0);
        this.f = Y.getDimensionPixelOffset(1, 0);
        this.g = Y.getBoolean(4, true);
        Y.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i = this.c;
        this.c = i;
        this.a = shapeDrawable;
        shapeDrawable.setTint(i);
        this.d = 1;
    }

    public final boolean f(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        l adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.g);
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        rect.set(0, 0, 0, 0);
        if (f(recyclerView, view)) {
            int i = this.d;
            int i2 = this.b;
            if (i == 1) {
                rect.bottom = i2;
            } else if (recyclerView.getLayoutDirection() == 1) {
                rect.left = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    @Override // defpackage.erf
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        int height;
        int i;
        boolean z;
        int i2;
        int i3;
        int width;
        int i4;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i5 = this.d;
        int i6 = this.b;
        int i7 = 0;
        int i8 = this.f;
        int i9 = this.e;
        Rect rect = this.h;
        if (i5 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i4 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i4, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i4 = 0;
            }
            z = recyclerView.getLayoutDirection() == 1;
            int i10 = i4 + (z ? i8 : i9);
            if (z) {
                i8 = i9;
            }
            int i11 = width - i8;
            int childCount = recyclerView.getChildCount();
            while (i7 < childCount) {
                View childAt = recyclerView.getChildAt(i7);
                if (f(recyclerView, childAt)) {
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, rect);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.a.setBounds(i10, round - i6, i11, round);
                    this.a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.a.draw(canvas);
                }
                i7++;
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
        int i12 = i + i9;
        int i13 = height - i8;
        z = recyclerView.getLayoutDirection() == 1;
        int childCount2 = recyclerView.getChildCount();
        while (i7 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i7);
            if (f(recyclerView, childAt2)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX());
                if (z) {
                    i3 = rect.left + round2;
                    i2 = i3 + i6;
                } else {
                    i2 = round2 + rect.right;
                    i3 = i2 - i6;
                }
                this.a.setBounds(i3, i12, i2, i13);
                this.a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.a.draw(canvas);
            }
            i7++;
        }
        canvas.restore();
    }
}

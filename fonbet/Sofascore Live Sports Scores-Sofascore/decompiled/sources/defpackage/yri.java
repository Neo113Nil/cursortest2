package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yri extends xrh {
    @Override // defpackage.xrh
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) this.e;
        canvas.getClass();
        m itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.f()) {
            canvas.save();
            int childCount = recyclerView.getChildCount() - 1;
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                int childCount2 = i2 >= recyclerView.getChildCount() ? recyclerView.getChildCount() - 1 : i2;
                View childAt = recyclerView.getChildAt(i);
                u childViewHolder = recyclerView.getChildViewHolder(childAt);
                u childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount2));
                if (childViewHolder.getItemViewType() != 1 && childViewHolder2.getItemViewType() != 1) {
                    Rect rect = this.d;
                    recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    int b = wzb.b(childAt.getTranslationY()) + rect.bottom;
                    shapeDrawable.setBounds(0, (b - shapeDrawable.getIntrinsicHeight()) - this.c, recyclerView.getWidth(), b);
                    shapeDrawable.draw(canvas);
                }
                i = i2;
            }
            canvas.restore();
        }
    }
}

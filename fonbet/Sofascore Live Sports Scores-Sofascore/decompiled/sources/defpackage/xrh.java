package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class xrh extends erf {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Rect d;
    public final Object e;

    public xrh(Context context, int i, int i2) {
        int color = context.getColor(R.color.n_lv_4);
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        this.b = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.e = shapeDrawable;
        this.d = new Rect();
        this.c = context.getResources().getDimensionPixelSize(R.dimen.divider_thickness);
        this.e = shapeDrawable;
        shapeDrawable.setTint(color);
    }

    public static Pair g(RecyclerView recyclerView) {
        ArrayList arrayList;
        ArrayList arrayList2;
        l adapter = recyclerView.getAdapter();
        g7 g7Var = adapter instanceof g7 ? (g7) adapter : null;
        int i = 0;
        int size = (g7Var == null || (arrayList2 = g7Var.g) == null) ? 0 : arrayList2.size();
        if (g7Var != null && (arrayList = g7Var.h) != null) {
            i = arrayList.size();
        }
        return new Pair(Integer.valueOf(size), Integer.valueOf(i));
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        Rect rect = this.d;
        ShapeDrawable shapeDrawable = (ShapeDrawable) this.e;
        canvas.getClass();
        m itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.f()) {
            int save = canvas.save();
            try {
                int i2 = 0;
                if (recyclerView.getClipToPadding()) {
                    i = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i = 0;
                }
                recyclerView.getLayoutDirection();
                Pair g = g(recyclerView);
                int intValue = ((Number) g.a).intValue();
                int childCount = (recyclerView.getChildCount() - ((Number) g.b).intValue()) - 1;
                if (childCount >= 0) {
                    while (true) {
                        View childAt = recyclerView.getChildAt(i2);
                        if (recyclerView.getChildViewHolder(childAt).getAbsoluteAdapterPosition() >= this.b + intValue) {
                            recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                            int b = rect.bottom + wzb.b(childAt.getTranslationY());
                            shapeDrawable.setBounds(i, (b - shapeDrawable.getIntrinsicHeight()) - this.c, width, b);
                            shapeDrawable.draw(canvas);
                        }
                        if (i2 == childCount) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        rect.getClass();
        qrfVar.getClass();
        switch (i) {
            case 0:
                u childViewHolder = recyclerView.getChildViewHolder(view);
                l adapter = recyclerView.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                Pair g = g(recyclerView);
                int intValue = ((Number) g.a).intValue();
                int intValue2 = (itemCount - ((Number) g.b).intValue()) - 1;
                rect.set(0, 0, 0, 0);
                int i4 = intValue + i3;
                int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                if (i4 <= absoluteAdapterPosition && absoluteAdapterPosition < intValue2) {
                    rect.bottom = ((ShapeDrawable) this.e).getIntrinsicHeight() + i2;
                    break;
                }
                break;
            default:
                if (recyclerView.getChildViewHolder(view).getLayoutPosition() == i3) {
                    rect.bottom = i2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.erf
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                canvas.getClass();
                recyclerView.getClass();
                qrfVar.getClass();
                if (recyclerView.getLayoutManager() != null) {
                    f(canvas, recyclerView);
                    break;
                }
                break;
            default:
                Paint paint = (Paint) this.e;
                canvas.getClass();
                recyclerView.getClass();
                qrfVar.getClass();
                Iterator it = new tsk(recyclerView).iterator();
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        break;
                    } else {
                        View view = (View) uskVar.next();
                        if (recyclerView.getChildViewHolder(view).getAbsoluteAdapterPosition() == this.b) {
                            Rect rect = this.d;
                            recyclerView.getDecoratedBoundsWithMargins(view, rect);
                            float strokeWidth = rect.bottom - paint.getStrokeWidth();
                            float f = rect.right;
                            canvas2 = canvas;
                            canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, strokeWidth, f, strokeWidth, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        canvas = canvas2;
                    }
                }
        }
    }

    public xrh(Context context, int i) {
        context.getClass();
        this.b = i;
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.n_lv_4));
        paint.setStrokeWidth(ao2.s(1, context));
        this.e = paint;
        this.c = ao2.s(8, context);
        this.d = new Rect();
    }
}

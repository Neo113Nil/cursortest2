package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hla extends erf {
    public final long a;
    public final int b;
    public final Paint c;
    public final Paint d;
    public final int e;
    public final int f;
    public final String g;
    public final Rect h;
    public final Rect i;

    public hla(Context context, long j) {
        Typeface typeface;
        context.getClass();
        this.a = j;
        int color = context.getColor(R.color.error);
        this.b = color;
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(ao2.s(1, context));
        this.c = paint;
        Paint paint2 = new Paint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_regular, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint2.setTypeface(typeface);
        paint2.setColor(this.b);
        paint2.setTextSize(ao2.H(13, context));
        this.d = paint2;
        this.e = ao2.s(8, context);
        this.f = ao2.s(4, context);
        String string = context.getString(R.string.new_messages);
        string.getClass();
        this.g = string;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        paint2.getTextBounds(string, 0, string.length(), rect);
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        rect.getClass();
        qrfVar.getClass();
        u childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder.getLayoutPosition() > 0) {
            int itemViewType = childViewHolder.getItemViewType();
            ehc[] ehcVarArr = ehc.a;
            if (itemViewType != 0) {
                if ((childViewHolder instanceof d2 ? (d2) childViewHolder : null) != null) {
                    long j = this.a;
                    if (j <= 0 || ((d2) childViewHolder).d().getTimestamp() != j) {
                        return;
                    }
                    rect.bottom = this.h.height() + this.e + this.f;
                }
            }
        }
    }

    @Override // defpackage.erf
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        Canvas canvas2;
        canvas.getClass();
        recyclerView.getClass();
        qrfVar.getClass();
        Iterator it = new tsk(recyclerView).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            View view = (View) uskVar.next();
            u childViewHolder = recyclerView.getChildViewHolder(view);
            if (childViewHolder.getAbsoluteAdapterPosition() > 0) {
                int itemViewType = childViewHolder.getItemViewType();
                ehc[] ehcVarArr = ehc.a;
                if (itemViewType != 0) {
                    if ((childViewHolder instanceof d2 ? (d2) childViewHolder : null) != null) {
                        long j = this.a;
                        if (j > 0 && ((d2) childViewHolder).d().getTimestamp() == j) {
                            Rect rect = this.i;
                            recyclerView.getDecoratedBoundsWithMargins(view, rect);
                            int i = rect.bottom;
                            int i2 = this.e;
                            float width = recyclerView.getWidth() / 2.0f;
                            float f = i - i2;
                            float exactCenterY = this.h.exactCenterY() + f;
                            Paint paint = this.c;
                            float strokeWidth = exactCenterY - paint.getStrokeWidth();
                            float f2 = this.f;
                            float centerX = (width - r3.centerX()) - f2;
                            float f3 = i2;
                            canvas2 = canvas;
                            canvas2.drawLine(f3, strokeWidth, centerX, strokeWidth, paint);
                            canvas2.drawText(this.g, centerX, f, this.d);
                            canvas2.drawLine(width + r3.centerX() + f2, strokeWidth, recyclerView.getWidth() - f3, strokeWidth, paint);
                            canvas = canvas2;
                        }
                    }
                }
            }
            canvas2 = canvas;
            canvas = canvas2;
        }
    }
}

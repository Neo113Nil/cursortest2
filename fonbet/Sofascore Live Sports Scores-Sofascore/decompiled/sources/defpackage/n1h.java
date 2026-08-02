package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n1h extends View {
    public int a;
    public List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Paint i;
    public final Rect j;
    public final Paint k;
    public final Path l;
    public final RectF m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public ArrayList q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1h(Context context) {
        super(context, null, 0);
        Typeface typeface;
        context.getClass();
        this.a = 100;
        this.b = km5.a;
        this.c = ao2.v(8, context);
        this.d = ao2.v(1, context);
        this.e = ao2.v(4, context);
        this.f = ao2.v(4, context);
        this.g = ao2.v(1, context);
        this.h = ao2.H(12, context);
        Paint paint = new Paint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setTextSize(this.h);
        paint.setColor(context.getColor(R.color.n_lv_1));
        paint.setTextAlign(Paint.Align.CENTER);
        this.i = paint;
        this.j = new Rect();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.k = paint2;
        this.l = new Path();
        RectF rectF = new RectF();
        float textSize = paint.getTextSize() + (this.g * 2.0f) + this.f;
        rectF.top = textSize;
        rectF.bottom = textSize + this.c;
        this.m = rectF;
        float f = this.e;
        this.n = new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f};
        this.o = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.p = new float[]{f, f, f, f, f, f, f, f};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Throwable th;
        Paint paint = this.k;
        Path path = this.l;
        RectF rectF = this.m;
        canvas.getClass();
        super.onDraw(canvas);
        ArrayList arrayList = this.q;
        Paint paint2 = this.i;
        int i = 0;
        if (arrayList == null) {
            int width = getWidth();
            int i2 = b.i(this.b);
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = this.d;
            int paddingLeft = ((width - (i2 * i3)) - getPaddingLeft()) - getPaddingRight();
            List list = this.b;
            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            int i4 = 0;
            m1h m1hVar = null;
            while (it.hasNext()) {
                l1h l1hVar = (l1h) it.next();
                int i5 = (l1hVar.a * paddingLeft) / this.a;
                String str = l1hVar.b;
                Iterator it2 = it;
                int i6 = i3;
                paint2.getTextBounds(str, i, str.length(), this.j);
                float width2 = r11.width() / 2.0f;
                float f2 = i4;
                float f3 = (i5 / 2.0f) + f2;
                if (f3 < width2) {
                    f3 = width2;
                }
                float f4 = paddingLeft - width2;
                float f5 = f3 > f4 ? f4 : f3;
                float l = yid.l(m1hVar != null ? Float.valueOf(m1hVar.f) : null);
                float f6 = (f5 - f2) - width2;
                if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || l >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && l > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f6 += l;
                    }
                } else if (m1hVar != null) {
                    m1hVar.f += f6;
                }
                m1hVar = new m1h(l1hVar, i4, i5, f5, f6, ((i4 + i5) - f5) - width2);
                i4 += i5 + i6;
                arrayList2.add(m1hVar);
                it = it2;
                i3 = i6;
                i = 0;
            }
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            th = null;
            this.q = arrayList2;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            th = null;
        }
        float paddingLeft2 = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int save = canvas.save();
        canvas.translate(paddingLeft2, paddingTop);
        try {
            ArrayList arrayList3 = this.q;
            if (arrayList3 != null) {
                Iterator it3 = arrayList3.iterator();
                int i7 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw th;
                    }
                    m1h m1hVar2 = (m1h) next;
                    l1h l1hVar2 = m1hVar2.a;
                    rectF.left = m1hVar2.b;
                    rectF.right = r12 + m1hVar2.c;
                    path.reset();
                    if (this.b.size() == 1) {
                        path.addRoundRect(rectF, this.p, Path.Direction.CW);
                    } else if (i7 == 0) {
                        path.addRoundRect(rectF, this.n, Path.Direction.CW);
                    } else if (i7 == b.i(this.b)) {
                        path.addRoundRect(rectF, this.o, Path.Direction.CW);
                    } else {
                        path.addRect(rectF, Path.Direction.CW);
                    }
                    paint.setColor(getContext().getColor(l1hVar2.c));
                    canvas.drawPath(path, paint);
                    if (m1hVar2.e >= f && m1hVar2.f >= f) {
                        canvas.drawText(l1hVar2.b, m1hVar2.d, paint2.getTextSize() + this.g, paint2);
                    }
                    i7 = i8;
                }
            }
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            Context context = getContext();
            context.getClass();
            int v = ao2.v(176, context);
            if (size < v) {
                size = v;
            }
            size = getPaddingRight() + getPaddingLeft() + size;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + (this.g * 2) + this.h + this.f + this.c;
        if (mode2 == Integer.MIN_VALUE ? paddingBottom <= size2 : mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        if (getWidth() != size) {
            this.q = null;
        }
        setMeasuredDimension(size, size2);
    }
}

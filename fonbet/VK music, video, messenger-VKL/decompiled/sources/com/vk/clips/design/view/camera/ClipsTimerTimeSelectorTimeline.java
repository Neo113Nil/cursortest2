package com.vk.clips.design.view.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.dpg0;
import xsna.e43;
import xsna.epx;
import xsna.gpt0;
import xsna.iah0;
import xsna.j5g;
import xsna.m33;
import xsna.mc30;
import xsna.n8g;
import xsna.s3q0;
import xsna.xq;
import xsna.z8s;

/* compiled from: ClipsTimerTimeSelectorTimeline.kt */
/* loaded from: classes16.dex */
public final class ClipsTimerTimeSelectorTimeline extends View implements mc30.a {
    public c A;
    public float B;
    public float C;
    public a D;
    public int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final int k;
    public final int l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final Drawable p;
    public final mc30 q;
    public final ArrayList<Integer> r;
    public final dpg0 s;
    public final TextPaint t;
    public int u;
    public final TextPaint v;
    public final String w;
    public final TextPaint x;
    public final TextPaint y;
    public float z;

    /* compiled from: ClipsTimerTimeSelectorTimeline.kt */
    public static final class a {
        public final b a;
        public final b b;
        public final b c;
        public final b d;

        public a() {
            this(null, null, null, null);
        }

        public static a a(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i) {
            if ((i & 1) != 0) {
                bVar = aVar.a;
            }
            if ((i & 2) != 0) {
                bVar2 = aVar.b;
            }
            if ((i & 4) != 0) {
                bVar3 = aVar.c;
            }
            if ((i & 8) != 0) {
                bVar4 = aVar.d;
            }
            aVar.getClass();
            return new a(bVar, bVar2, bVar3, bVar4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            b bVar = this.a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.b;
            int hashCode2 = (hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            b bVar3 = this.c;
            int hashCode3 = (hashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
            b bVar4 = this.d;
            return hashCode3 + (bVar4 != null ? bVar4.hashCode() : 0);
        }

        public final String toString() {
            return "LabelPositions(start=" + this.a + ", end=" + this.b + ", thumb=" + this.c + ", recorded=" + this.d + ')';
        }

        public a(b bVar, b bVar2, b bVar3, b bVar4) {
            this.a = bVar;
            this.b = bVar2;
            this.c = bVar3;
            this.d = bVar4;
        }
    }

    /* compiled from: ClipsTimerTimeSelectorTimeline.kt */
    public static final class b {
        public final float a;
        public final float b;

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LabelState(xCoord=");
            sb.append(this.a);
            sb.append(", width=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: ClipsTimerTimeSelectorTimeline.kt */
    public interface c {
        void onChanged(float f);
    }

    public ClipsTimerTimeSelectorTimeline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 15000;
        this.c = iah0.a(5);
        this.d = iah0.a(r15);
        iah0.a(8);
        this.e = iah0.a(4);
        this.f = iah0.a(18);
        this.g = iah0.a(2);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        float f = 14;
        this.k = iah0.a(f);
        this.l = iah0.a(f);
        Paint paint = new Paint(1);
        this.m = paint;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        Paint paint3 = new Paint(1);
        this.o = paint3;
        this.p = m33.a(R.drawable.bg_story_progress_shadow, e43.a);
        this.q = new mc30(this);
        this.r = e43.a(0);
        this.s = new dpg0(m33.a(R.drawable.thumb_clips_time_select, e43.a), iah0.a(16));
        TextPaint textPaint = new TextPaint(1);
        this.t = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.v = textPaint2;
        this.w = "0:00";
        TextPaint textPaint3 = new TextPaint(1);
        this.x = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.y = textPaint4;
        this.D = new a(null, null, null, null);
        paint.setColor(n8g.l(-1, 112));
        paint2.setColor(-1);
        paint3.setColor(getContext().getColor(R.color.vk_sky_300));
        textPaint.setColor(-1);
        Context context2 = getContext();
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(14.0f);
        com.vk.typography.b.j(textPaint, context2, fontFamily, valueOf, 8);
        textPaint.setShadowLayer(iah0.b(4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha24));
        textPaint3.setColor(-1);
        com.vk.typography.b.j(textPaint3, getContext(), fontFamily, valueOf, 8);
        textPaint3.setShadowLayer(iah0.b(4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha24));
        textPaint4.setColor(paint.getColor());
        com.vk.typography.b.j(textPaint4, getContext(), fontFamily, valueOf, 8);
        textPaint4.setShadowLayer(iah0.b(4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha24));
        textPaint2.setColor(paint3.getColor());
        com.vk.typography.b.j(textPaint2, getContext(), fontFamily, valueOf, 8);
        textPaint2.setShadowLayer(iah0.b(4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha24));
        this.z = getMinSelectableValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getOneSecondProgress() : getMinSelectableValue() + getOneSecondProgress();
    }

    public static float a(b bVar, b bVar2) {
        if (bVar == null || bVar2 == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = bVar.a;
        float f2 = bVar.b * 1.5f;
        float f3 = f2 + f;
        float f4 = bVar2.a;
        if (f3 <= f4) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return 1 - ((f4 - f) / f2);
    }

    private final String getEndLabel() {
        int i = this.b / 1000;
        gpt0 gpt0Var = gpt0.a;
        return z8s.a(i);
    }

    private final float getMinSelectableValue() {
        return this.u / this.b;
    }

    private final float getOneSecondProgress() {
        return TimeUnit.SECONDS.toMillis(1L) / this.b;
    }

    private final String getRecordedLabel() {
        int i = this.u / 1000;
        gpt0 gpt0Var = gpt0.a;
        return z8s.a(i);
    }

    private final int getSlideArea() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.k;
    }

    private final String getThumbLabel() {
        int i = (int) ((this.b * this.z) / 1000);
        gpt0 gpt0Var = gpt0.a;
        return z8s.a(i);
    }

    @Override // xsna.mc30.a
    public final void b(float f, float f2) {
        ViewParent parent;
        float abs = Math.abs(f) + this.B;
        this.B = abs;
        if (abs > this.c && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        float slideArea = ((int) (((int) (this.z * getSlideArea())) + f)) / getSlideArea();
        if (getMinSelectableValue() + getOneSecondProgress() > slideArea || slideArea > 1.0f) {
            return;
        }
        this.z = slideArea;
        invalidate();
        c cVar = this.A;
        if (cVar != null) {
            cVar.onChanged(this.z);
        }
    }

    public final float getCurrentValue() {
        return this.z;
    }

    public final int getMaxDurationMs() {
        return this.b;
    }

    public final c getOnSelectedChangeListener() {
        return this.A;
    }

    public final int getRecordedLengthMs() {
        return this.u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.p.draw(canvas);
        int i = this.u;
        float f3 = this.e;
        ArrayList<Integer> arrayList = this.r;
        float f4 = this.d;
        if (i > 0) {
            for (Pair pair : j5g.Y0(arrayList)) {
                float width2 = (getWidth() * ((Number) pair.j()).intValue()) / this.b;
                RectF rectF = this.j;
                rectF.set((getWidth() * ((Number) pair.i()).intValue()) / this.b, getPaddingTop() + f4, width2 - this.g, f4 + f3 + getPaddingTop());
                float f5 = this.C;
                canvas.drawRoundRect(rectF, f5, f5, this.o);
            }
        }
        RectF rectF2 = this.i;
        rectF2.set(getMinSelectableValue() * width, getPaddingTop() + f4, getWidth(), f3 + f4 + getPaddingTop());
        RectF rectF3 = this.h;
        rectF3.set(rectF2);
        rectF3.right = getWidth();
        if (this.z > this.u / this.b) {
            f = getMinSelectableValue() * width;
            f2 = this.z * width;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (f != f2) {
            rectF2.left = f;
            rectF2.right = f2;
            float f6 = this.C;
            canvas.drawRoundRect(rectF2, f6, f6, this.n);
        }
        if (getMinSelectableValue() * width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            rectF3.left = rectF2.left;
        }
        float f7 = this.C;
        canvas.drawRoundRect(rectF3, f7, f7, this.m);
        String thumbLabel = getThumbLabel();
        TextPaint textPaint = this.t;
        float measureText = textPaint.measureText(thumbLabel);
        float paddingLeft = getPaddingLeft();
        int width3 = getWidth();
        float f8 = 2;
        float f9 = (width * this.z) - (measureText / f8);
        if (f9 >= paddingLeft) {
            paddingLeft = width3 - measureText;
            if (f9 <= paddingLeft) {
                paddingLeft = f9;
            }
        }
        this.D = a.a(this.D, null, null, new b(paddingLeft, measureText), null, 11);
        String thumbLabel2 = getThumbLabel();
        float f10 = rectF3.bottom + f4;
        float f11 = this.f;
        canvas.drawText(thumbLabel2, paddingLeft, f10 + f11, textPaint);
        String recordedLabel = getRecordedLabel();
        TextPaint textPaint2 = this.v;
        float measureText2 = textPaint2.measureText(recordedLabel);
        float width4 = getWidth() - measureText2;
        float width5 = ((getWidth() * this.u) / this.b) - (measureText2 / f8);
        float f12 = 0;
        if (width5 < f12) {
            width5 = f12;
        } else if (width5 > width4 - measureText2) {
            width5 = -1.0f;
        }
        if (this.u > 0 && width5 != -1.0f) {
            a a2 = a.a(this.D, null, null, null, new b(width5, measureText2), 7);
            this.D = a2;
            float a3 = a(a2.d, a2.c);
            String recordedLabel2 = getRecordedLabel();
            float f13 = rectF3.bottom + f4 + f11;
            float f14 = 255;
            float f15 = 1;
            float f16 = a3 * 3;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            textPaint2.setAlpha((int) ((f15 - f16) * f14));
            s3q0 s3q0Var = s3q0.a;
            canvas.drawText(recordedLabel2, width5, f13, textPaint2);
        }
        if (arrayList.size() <= 1) {
            TextPaint textPaint3 = this.x;
            String str = this.w;
            a a4 = a.a(this.D, new b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textPaint3.measureText(str)), null, null, null, 14);
            this.D = a4;
            float a5 = a(a4.a, a4.c);
            float f17 = rectF3.bottom + f4 + f11;
            float f18 = a5 * 3;
            textPaint3.setAlpha((int) ((1 - (f18 <= 1.0f ? f18 : 1.0f)) * 255));
            s3q0 s3q0Var2 = s3q0.a;
            canvas.drawText(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f17, textPaint3);
        }
        String endLabel = getEndLabel();
        TextPaint textPaint4 = this.y;
        float measureText3 = textPaint4.measureText(endLabel);
        float f19 = rectF3.right - measureText3;
        a a6 = a.a(this.D, null, new b(f19, measureText3), null, null, 13);
        this.D = a6;
        float a7 = a(a6.d, a6.b);
        a aVar = this.D;
        float a8 = a(aVar.c, aVar.b);
        if (a7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            String endLabel2 = getEndLabel();
            float f20 = rectF3.bottom + f4 + f11;
            float f21 = 255;
            float f22 = a8 * f8;
            if (f22 > 0.5f) {
                f22 = 0.5f;
            }
            textPaint4.setAlpha((int) ((0.5f - f22) * f21));
            s3q0 s3q0Var3 = s3q0.a;
            canvas.drawText(endLabel2, f19, f20, textPaint4);
        }
        float slideArea = getSlideArea() * this.z;
        int i2 = this.k;
        float centerY = rectF3.centerY();
        float f23 = (int) (slideArea + (i2 / 2));
        float f24 = i2 / 1.7f;
        float f25 = this.l / 1.7f;
        dpg0 dpg0Var = this.s;
        dpg0Var.setBounds((int) (f23 - f24), (int) (centerY - f25), (int) (f24 + f23), (int) (f25 + centerY));
        dpg0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingBottom = (int) (this.l + this.d + this.f + getPaddingBottom() + getPaddingTop());
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE ? paddingBottom >= size : mode == 1073741824) {
            paddingBottom = size;
        }
        this.p.setBounds(0, 0, getMeasuredWidth(), paddingBottom);
        this.C = paddingBottom / 2.0f;
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        if (!isEnabled()) {
            invalidate();
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if ((action == 1 || action == 3) && (cVar = this.A) != null) {
            cVar.onChanged(this.z);
        }
        this.q.a(motionEvent);
        return true;
    }

    public final void setMaxDurationMs(int i) {
        if (i != this.b) {
            this.b = i;
            invalidate();
        }
    }

    public final void setOnSelectedChangeListener(c cVar) {
        this.A = cVar;
    }

    public final void setRecordedLengthMs(int i) {
        this.u = i;
    }
}

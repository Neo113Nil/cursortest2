package com.vk.clips.viewer.impl.feed.view.subs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.cm2;
import xsna.drm0;
import xsna.eld;
import xsna.f4m;
import xsna.hb6;
import xsna.iah0;
import xsna.j5g;
import xsna.o1n0;

/* compiled from: ClipsCanvasSubtitleView.kt */
/* loaded from: classes17.dex */
public final class ClipsCanvasSubtitleView extends cm2 {
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final RectF l;
    public float m;
    public float n;
    public final RectF o;
    public final TextPaint p;
    public final Paint q;
    public StaticLayout r;
    public String s;
    public ValueAnimator t;
    public final o1n0 u;

    public ClipsCanvasSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = iah0.a(8);
        this.i = iah0.a(4);
        this.j = iah0.a(2);
        this.k = iah0.a(r3);
        this.l = new RectF();
        this.o = new RectF();
        TextPaint textPaint = new TextPaint();
        this.p = textPaint;
        Paint paint = new Paint();
        this.q = paint;
        this.u = new o1n0(this);
        int defaultTextColor = getDefaultTextColor();
        int defaultBackgroundColor = getDefaultBackgroundColor();
        textPaint.setColor(defaultTextColor);
        paint.setColor(defaultBackgroundColor);
        f4m.v(getResources().getDimensionPixelSize(R.dimen.subtitles_bottom_margin), this);
        textPaint.setTextSize(getResources().getDimension(R.dimen.clips_subs_text_size));
        setRenderItems(null);
    }

    public final void a() {
        String str = this.s;
        if (getWidth() == 0 || str == null || str.length() == 0) {
            this.r = null;
            return;
        }
        int width = getWidth();
        int i = this.h * 2;
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), this.p, ((width - i) - getPaddingStart()) - getPaddingEnd()).build();
        this.r = build;
        int lineCount = build.getLineCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            float lineMax = build.getLineMax(i2);
            if (lineMax > f) {
                f = lineMax;
            }
        }
        float f2 = i + f;
        float height = (this.i * 2.0f) + build.getHeight();
        float height2 = (getHeight() - height) - getPaddingBottom();
        this.u.b.set(getPaddingStart(), height2, f2, height + height2);
        float height3 = build.getHeight();
        RectF rectF = this.o;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, height3);
        if (rectF.equals(this.l)) {
            return;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(100L);
        this.t = ofFloat;
        ofFloat.addUpdateListener(new hb6(this, 1));
        ValueAnimator valueAnimator2 = this.t;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new eld(this));
        }
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        StaticLayout staticLayout = this.r;
        if (staticLayout != null) {
            canvas.translate(getPaddingStart(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            RectF rectF = this.l;
            float height = rectF.height() + this.j + this.i + this.m;
            float width = rectF.width();
            int i = this.h;
            float f = width + (i * 2) + this.n;
            canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (canvas.getHeight() - height) - getPaddingBottom());
            float f2 = this.k;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, height, f2, f2, this.q);
            canvas.restore();
            float height2 = ((canvas.getHeight() - rectF.height()) - (getPaddingBottom() + r4)) - this.m;
            canvas.save();
            canvas.translate(i, height2);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int textSize = (int) ((this.p.getTextSize() * 8) + this.i + this.j + getPaddingTop() + getPaddingBottom());
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            textSize = Math.max(textSize, size);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(textSize, 1073741824));
        a();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.u.a = onClickListener;
    }

    @Override // one.video.view.subtitles.BaseSubtitleView
    public void setRenderItems(List<? extends SubtitleRenderItem> list) {
        String str = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((SubtitleRenderItem) it.next()).b;
                String W = str2 != null ? drm0.W(str2, "\n") : null;
                if (W != null) {
                    arrayList.add(W);
                }
            }
            str = j5g.g0(arrayList, "\n", null, null, 0, null, 62);
        }
        this.s = str;
        if (str == null || str.length() == 0) {
            this.l.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.o.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        a();
        if (getWidth() > 0) {
            invalidate();
        }
    }
}

package com.vk.photos.common.ui.tags;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.PhotoTag;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import java.util.ArrayList;
import java.util.List;
import xsna.an10;
import xsna.b780;
import xsna.drm0;
import xsna.iah0;
import xsna.n8g;
import xsna.wq;

/* compiled from: TagsSuggestionsOverlayView.kt */
/* loaded from: classes14.dex */
public final class TagsSuggestionsOverlayView extends View implements b780 {
    public static final float[] w = new float[0];
    public static final int[] x = new int[0];
    public static final int y = iah0.a(44);
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final BlurMaskFilter i;
    public final int j;
    public final int k;
    public final int l;
    public float m;
    public float n;
    public float o;
    public int p;
    public int q;
    public StaticLayout r;
    public final ArrayList<PhotoTag> s;
    public float[] t;
    public int[] u;
    public boolean v;

    /* compiled from: TagsSuggestionsOverlayView.kt */
    public static final class a {
    }

    public TagsSuggestionsOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static int a(float f, int i) {
        return n8g.l(i, an10.b(Color.alpha(i) * f));
    }

    public static int c(float f, int i, int i2, int i3) {
        if (i2 != 0 || i3 != 1) {
            if (i2 == i3) {
                if (i3 == 2) {
                    return a(0.4f, i);
                }
            } else {
                if (i3 == 1) {
                    return a((1 - f) + 0.4f, i);
                }
                if (i3 == 2) {
                    return a(f, i);
                }
            }
        }
        return i;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        this.p = 0;
        this.q = 0;
        requestLayout();
        invalidate();
    }

    public final int getConfirmedTagsCount() {
        int i = 0;
        for (int i2 : this.u) {
            int i3 = 1;
            if ((i2 & MinElf.PN_XNUM) != 1) {
                i3 = 0;
            }
            i += i3;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int length = this.t.length;
        ArrayList<PhotoTag> arrayList = this.s;
        if (length != arrayList.size() * 4) {
            throw new IllegalStateException("coords.size != tags.size * 4");
        }
        if (this.u.length != arrayList.size()) {
            throw new IllegalStateException("confirmed.size != tags.size");
        }
        int i4 = 2;
        float f = this.e / 2;
        canvas.save();
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = MinElf.PN_XNUM;
            if (i6 >= size) {
                break;
            }
            if ((this.u[i6] & MinElf.PN_XNUM) == 1) {
                float[] fArr = this.t;
                int i7 = i6 * 4;
                canvas.clipOutRect(fArr[i7] + f, fArr[i7 + 2] + f, fArr[i7 + 1] - f, fArr[i7 + 3] - f);
            }
            i6++;
        }
        float f2 = this.o;
        int i8 = this.j;
        int a2 = a(f2, i8);
        Paint paint = this.c;
        paint.setColor(a2);
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), paint);
        canvas.restore();
        int size2 = arrayList.size();
        while (i5 < size2) {
            float[] fArr2 = this.t;
            int i9 = i5 * 4;
            float f3 = fArr2[i9];
            float f4 = fArr2[i9 + 1];
            float f5 = fArr2[i9 + 2];
            float f6 = fArr2[i9 + 3];
            int i10 = this.u[i5];
            int i11 = i10 >> 16;
            int i12 = i10 & i;
            if (i11 == i4 && i12 == 1) {
                paint.setColor(a(this.n, i8));
                i2 = i12;
                i3 = i11;
                canvas.drawRect(f3 + f, f5 + f, f4 - f, f6 - f, paint);
            } else {
                i2 = i12;
                i3 = i11;
            }
            Paint paint2 = paint;
            int c = c(this.m, this.g, i3, i2);
            Paint paint3 = this.b;
            paint3.setColor(c);
            paint3.setMaskFilter(this.i);
            float f7 = this.h;
            int i13 = i5;
            canvas.drawRoundRect(f3, f5, f4, f6, f7, f7, paint3);
            paint3.setColor(c(this.m, this.f, i3, i2));
            paint3.setMaskFilter(null);
            float f8 = this.h;
            canvas.drawRoundRect(f3, f5, f4, f6, f8, f8, paint3);
            StaticLayout staticLayout = this.r;
            if (staticLayout != null && arrayList.size() == 1 && this.v) {
                float a3 = wq.a(f4, f3, 2.0f, f3);
                float b = iah0.b(8.0f) + f6;
                canvas.save();
                canvas.translate(a3, b);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            i5 = i13 + 1;
            paint = paint2;
            i4 = 2;
            i = MinElf.PN_XNUM;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint;
        int i3;
        if (this.p == 0 || this.q == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float min = Math.min(size / this.p, size2 / this.q);
        int b = (int) (iah0.b(0.5f) + (this.p * min));
        int b2 = (int) (iah0.b(0.5f) + (this.q * min));
        int min2 = Math.min(b, size);
        int min3 = Math.min(b2, size2);
        int length = this.t.length;
        ArrayList<PhotoTag> arrayList = this.s;
        if (length != arrayList.size() * 4) {
            throw new IllegalStateException("coords.size != tags.size * 4");
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            PhotoTag photoTag = arrayList.get(i4);
            double d = 100.0f;
            double d2 = min2;
            float f = (float) ((photoTag.h / d) * d2);
            int i5 = i4;
            double d3 = min3;
            int i6 = min3;
            float f2 = (float) ((photoTag.j / d) * d3);
            float f3 = (float) ((photoTag.i / d) * d2);
            float f4 = (float) ((photoTag.k / d) * d3);
            float abs = Math.abs(f3 - f);
            float f5 = y;
            if (abs < f5) {
                i3 = 2;
                float f6 = (f5 - abs) / 2;
                f -= f6;
                f3 += f6;
            } else {
                i3 = 2;
            }
            float abs2 = Math.abs(f4 - f2);
            if (abs2 < f5) {
                float f7 = (f5 - abs2) / i3;
                f4 += f7;
                f2 -= f7;
            }
            float[] fArr = this.t;
            int i7 = i5 * 4;
            fArr[i7] = f;
            fArr[i7 + 1] = f3;
            fArr[i7 + 2] = f2;
            fArr[i7 + 3] = f4;
            i4 = i5 + 1;
            min3 = i6;
        }
        int i8 = min3;
        StaticLayout staticLayout = null;
        if (arrayList.size() == 1) {
            String str = arrayList.get(0).f;
            if (str.length() > 0) {
                float f8 = min2 / 3.0f;
                float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    textPaint = this.d;
                    if (i9 >= 2) {
                        break;
                    }
                    int L = drm0.L(str, ' ', i10, 4);
                    if (L < 0) {
                        L = str.length();
                    }
                    f9 = Math.max(f9, textPaint.measureText((CharSequence) str, i10, L));
                    i10 = L + 1;
                    if (L == str.length()) {
                        break;
                    } else {
                        i9++;
                    }
                }
                int min4 = (int) Math.min(f8, f9);
                staticLayout = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, min4).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(min4).setIncludePad(false).setMaxLines(2).build();
            }
        }
        this.r = staticLayout;
        setMeasuredDimension(min2, i8);
    }

    public final void setBorderInactiveAlpha(float f) {
        this.m = f;
        invalidate();
    }

    public final void setBordersBackgroundAlpha(float f) {
        this.n = f;
        invalidate();
    }

    public final void setConfirmedTag(PhotoTag photoTag) {
        int indexOf = this.s.indexOf(photoTag);
        if (indexOf >= 0) {
            this.u[indexOf] = 65537;
        }
    }

    public final void setDeclinedTag(PhotoTag photoTag) {
        int indexOf = this.s.indexOf(photoTag);
        if (indexOf >= 0) {
            this.u[indexOf] = 131074;
        }
    }

    public final void setNameVisible(boolean z) {
        this.v = z;
        invalidate();
    }

    public final void setOverlayAlpha(float f) {
        this.o = f;
        invalidate();
    }

    public final void setTagTextAlpha(float f) {
        int a2 = a(f, this.k);
        TextPaint textPaint = this.d;
        textPaint.setColor(a2);
        textPaint.setShadowLayer(iah0.b(2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(1.0f), a(f, this.l));
        invalidate();
    }

    public final void setTags(List<PhotoTag> list) {
        ArrayList<PhotoTag> arrayList = this.s;
        arrayList.clear();
        arrayList.addAll(list);
        this.t = new float[list.size() * 4];
        this.u = new int[list.size()];
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        this.p = i;
        this.q = i2;
        requestLayout();
        invalidate();
    }

    public TagsSuggestionsOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        float b = iah0.b(2.0f);
        this.e = b;
        this.f = -1;
        this.g = 1375731712;
        this.h = iah0.b(4.0f);
        this.i = new BlurMaskFilter(iah0.b(4.0f), BlurMaskFilter.Blur.NORMAL);
        this.j = -16777216;
        this.k = -1;
        this.l = 855638016;
        this.m = 1.0f;
        this.s = new ArrayList<>();
        this.t = w;
        this.u = x;
        this.v = true;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(b);
        paint.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(a(this.o, -16777216));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(iah0.b(2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(1.0f), 855638016);
        b.j(textPaint, context, FontFamily.MEDIUM, Float.valueOf(12.0f), 8);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}

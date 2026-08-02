package com.vk.topics.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.abg0;
import xsna.baf0;
import xsna.dhr0;
import xsna.iah0;
import xsna.j6r0;
import xsna.too0;
import xsna.wq;

/* loaded from: classes6.dex */
public class PaginationView extends View implements too0 {
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public int b;
    public int c;
    public final Paint d;
    public final Paint e;
    public final int[] f;
    public int g;
    public final int[] h;
    public a i;
    public int j;
    public int k;
    public Drawable l;
    public baf0 m;
    public baf0 n;

    public interface a {
        void onPageSelected(int i);
    }

    static {
        WeakHashMap weakHashMap = j6r0.a;
        int a2 = iah0.a(2.0f);
        o = a2;
        p = iah0.a(3.0f);
        q = a2 << 1;
        r = a2 << 2;
        s = iah0.a(10.0f);
        t = a2 << 4;
        u = iah0.a(32.0f);
    }

    public PaginationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 20;
        this.c = 3;
        this.f = new int[6];
        this.h = new int[6];
        Paint paint = new Paint(1);
        this.d = paint;
        b.j(paint, getContext(), FontFamily.MEDIUM, Float.valueOf(14.0f), 8);
        this.e = new Paint(this.d);
        Ng();
    }

    public static void a(Canvas canvas, String str, int i, int i2, int i3, int i4, Paint paint, int i5, int i6, int i7) {
        float measureText = paint.measureText(str);
        int color = paint.getColor();
        float f = i;
        canvas.drawText(str, wq.a(i3, measureText, 2.0f, f), ((i4 - paint.getTextSize()) / 2.0f) + paint.getTextSize() + i2, paint);
        paint.setColor(i6);
        canvas.drawRect(f, i7, i + i3, i7 + i5, paint);
        paint.setColor(color);
    }

    public static int b(int i) {
        return Math.max((String.valueOf(i).length() + 2) * r, t);
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.j = abg0Var.c(R.attr.vk_ui_text_accent);
        this.k = abg0Var.c(R.attr.vk_ui_separator_primary_alpha);
        this.l = abg0Var.a(R.drawable.bg_paginator_float_button);
        this.m = abg0Var.b(R.drawable.vk_icon_deprecated_ic_discussions_jump_left, R.attr.vk_ui_icon_secondary);
        this.n = abg0Var.b(R.drawable.vk_icon_deprecated_ic_discussions_jump_right, R.attr.vk_ui_icon_secondary);
        this.e.setColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        this.d.setColor(this.j);
    }

    public int getCurrentPage() {
        return this.c;
    }

    public int getPageCount() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        Canvas canvas2;
        int i4 = 0;
        while (true) {
            iArr = this.f;
            int length = iArr.length;
            iArr2 = this.h;
            if (i4 >= length) {
                break;
            }
            iArr[i4] = 0;
            iArr2[i4] = -1;
            i4++;
        }
        int i5 = p;
        this.g = i5;
        int i6 = this.c;
        int i7 = u;
        int i8 = r;
        if (i6 > 2) {
            iArr[0] = i7;
            this.g = i5 + i7;
            iArr2[0] = 1;
            i2 = 0;
            i = 1;
        } else {
            this.g = i5 + i8;
            i = 0;
            i2 = i8;
        }
        if (i6 > 1) {
            this.g = b(i6 - 1) + this.g;
            iArr[i] = b(this.c - 1) + i2;
            iArr2[i] = this.c - 1;
            i2 = 0;
            i++;
        }
        this.g = b(this.c) + this.g;
        iArr[i] = b(this.c) + i2;
        int i9 = i + 1;
        iArr2[i] = -1;
        int i10 = this.c;
        if (i10 < this.b) {
            this.g = b(i10 + 1) + this.g;
            iArr[i9] = b(this.c + 1);
            iArr2[i9] = this.c + 1;
            i9 = i + 2;
        }
        int i11 = this.c;
        int i12 = this.b;
        if (i11 < i12 - 1) {
            int i13 = this.g;
            iArr[i9] = i7;
            this.g = i13 + i7;
            iArr2[i9] = i12;
        } else {
            this.g += i8;
            int i14 = i9 - 1;
            iArr[i14] = iArr[i14] + i8;
        }
        this.g += i5;
        canvas.save();
        canvas.translate(getWidth() - this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l.setBounds(0, 0, this.g, getHeight());
        this.l.draw(canvas);
        int i15 = this.c;
        int i16 = q;
        if (i15 > 2) {
            int height = (getHeight() - this.m.b.getIntrinsicHeight()) / 2;
            baf0 baf0Var = this.m;
            int i17 = i5 + i16;
            baf0Var.setBounds(i17, height, baf0Var.b.getIntrinsicWidth() + i17, this.m.b.getIntrinsicHeight() + height);
            this.m.draw(canvas);
            i3 = i5 + i7;
        } else {
            i3 = i5 + i8;
        }
        int i18 = this.c;
        int i19 = s;
        if (i18 > 1) {
            a(canvas, String.valueOf(i18 - 1), i3, o, b(this.c - 1), getHeight() - i8, this.e, 1, this.k, (getHeight() - i19) - i16);
            i3 += b(this.c - 1);
        }
        String valueOf = String.valueOf(this.c);
        int b = b(this.c);
        int height2 = getHeight() - i8;
        int i20 = this.j;
        int height3 = (getHeight() - i19) - i16;
        int i21 = o;
        a(canvas, valueOf, i3, i21, b, height2, this.d, i21, i20, height3);
        int b2 = i3 + b(this.c);
        int i22 = this.c;
        if (i22 < this.b) {
            canvas2 = canvas;
            a(canvas2, String.valueOf(i22 + 1), b2, i21, b(this.c + 1), getHeight() - i8, this.e, 1, this.k, (getHeight() - i19) - i16);
            b2 += b(this.c + 1);
        } else {
            canvas2 = canvas;
        }
        if (this.c < this.b - 1) {
            int height4 = (getHeight() - this.n.b.getIntrinsicHeight()) / 2;
            baf0 baf0Var2 = this.n;
            int i23 = b2 + i16;
            baf0Var2.setBounds(i23, height4, baf0Var2.b.getIntrinsicWidth() + i23, this.n.b.getIntrinsicHeight() + height4);
            this.n.draw(canvas2);
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (getVisibility() == 0 && isEnabled()) {
            float x = motionEvent.getX() - getWidth();
            int i2 = this.g;
            int i3 = (int) (x + i2);
            if (i3 >= 0 && i3 <= i2) {
                if ((motionEvent.getAction() & 255) == 1) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = this.f;
                        if (i >= iArr.length) {
                            break;
                        }
                        if (i3 >= i4 && i3 <= iArr[i] + i4) {
                            a aVar = this.i;
                            if (aVar != null) {
                                aVar.onPageSelected(this.h[i]);
                            }
                            invalidate();
                            return true;
                        }
                        i4 += iArr[i];
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void setCurrentPage(int i) {
        this.c = i;
        invalidate();
    }

    public void setListener(a aVar) {
        this.i = aVar;
    }

    public void setPageCount(int i) {
        this.b = i;
        invalidate();
    }
}

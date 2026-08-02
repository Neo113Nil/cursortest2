package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3015f extends AbstractC3010a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30423g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30424h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30425i;

    /* renamed from: j, reason: collision with root package name */
    public int f30426j;

    /* renamed from: k, reason: collision with root package name */
    public int f30427k;

    /* renamed from: l, reason: collision with root package name */
    public long f30428l;

    /* renamed from: m, reason: collision with root package name */
    public int f30429m;
    int[] mAlphas;
    boolean[] mIsLayerOn;
    private final Drawable[] mLayers;
    int[] mStartAlphas;

    /* renamed from: n, reason: collision with root package name */
    public int f30430n;

    /* renamed from: o, reason: collision with root package name */
    public o7.m f30431o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30432p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30433q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30434r;

    public C3015f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f30434r = true;
        D6.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.mLayers = drawableArr;
        this.mStartAlphas = new int[drawableArr.length];
        this.mAlphas = new int[drawableArr.length];
        this.f30429m = 255;
        this.mIsLayerOn = new boolean[drawableArr.length];
        this.f30430n = 0;
        this.f30423g = z10;
        this.f30424h = z10 ? 255 : 0;
        this.f30425i = i10;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[LOOP:0: B:14:0x0052->B:16:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[EDGE_INSN: B:17:0x0072->B:18:0x0072 BREAK  A[LOOP:0: B:14:0x0052->B:16:0x0057], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean s10;
        Drawable[] drawableArr;
        int i10 = this.f30426j;
        int i11 = 0;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                D6.k.i(this.f30427k > 0);
                s10 = s((m() - this.f30428l) / this.f30427k);
                this.f30426j = s10 ? 2 : 1;
            }
            while (true) {
                drawableArr = this.mLayers;
                if (i11 < drawableArr.length) {
                    break;
                }
                g(canvas, drawableArr[i11], (int) Math.ceil((this.mAlphas[i11] * this.f30429m) / 255.0d));
                i11++;
            }
            if (z10) {
                invalidateSelf();
                return;
            } else {
                n();
                p();
                return;
            }
        }
        System.arraycopy(this.mAlphas, 0, this.mStartAlphas, 0, this.mLayers.length);
        this.f30428l = m();
        s10 = s(this.f30427k == 0 ? 1.0f : 0.0f);
        o();
        this.f30426j = s10 ? 2 : 1;
        z10 = s10;
        while (true) {
            drawableArr = this.mLayers;
            if (i11 < drawableArr.length) {
            }
            g(canvas, drawableArr[i11], (int) Math.ceil((this.mAlphas[i11] * this.f30429m) / 255.0d));
            i11++;
        }
        if (z10) {
        }
    }

    public void f() {
        this.f30430n++;
    }

    public final void g(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f30430n++;
        if (this.f30434r) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f30430n--;
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30429m;
    }

    public void h() {
        this.f30430n--;
        invalidateSelf();
    }

    public void i() {
        this.f30426j = 0;
        Arrays.fill(this.mIsLayerOn, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f30430n == 0) {
            super.invalidateSelf();
        }
    }

    public void j(int i10) {
        this.f30426j = 0;
        this.mIsLayerOn[i10] = true;
        invalidateSelf();
    }

    public void k(int i10) {
        this.f30426j = 0;
        this.mIsLayerOn[i10] = false;
        invalidateSelf();
    }

    public void l() {
        this.f30426j = 2;
        for (int i10 = 0; i10 < this.mLayers.length; i10++) {
            this.mAlphas[i10] = this.mIsLayerOn[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    public long m() {
        return SystemClock.uptimeMillis();
    }

    public final void n() {
        if (this.f30432p) {
            this.f30432p = false;
            o7.m mVar = this.f30431o;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    public final void o() {
        int i10;
        if (!this.f30432p && (i10 = this.f30425i) >= 0) {
            boolean[] zArr = this.mIsLayerOn;
            if (i10 < zArr.length && zArr[i10]) {
                this.f30432p = true;
                o7.m mVar = this.f30431o;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    public final void p() {
        if (this.f30433q && this.f30426j == 2 && this.mIsLayerOn[this.f30425i]) {
            o7.m mVar = this.f30431o;
            if (mVar != null) {
                mVar.b();
            }
            this.f30433q = false;
        }
    }

    public final void q() {
        this.f30426j = 2;
        Arrays.fill(this.mStartAlphas, this.f30424h);
        this.mStartAlphas[0] = 255;
        Arrays.fill(this.mAlphas, this.f30424h);
        this.mAlphas[0] = 255;
        Arrays.fill(this.mIsLayerOn, this.f30423g);
        this.mIsLayerOn[0] = true;
    }

    public void r(int i10) {
        this.f30427k = i10;
        if (this.f30426j == 1) {
            this.f30426j = 0;
        }
    }

    public final boolean s(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mLayers.length; i10++) {
            boolean z11 = this.mIsLayerOn[i10];
            int i11 = z11 ? 1 : -1;
            int[] iArr = this.mAlphas;
            int i12 = (int) (this.mStartAlphas[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z11 && iArr[i10] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f30429m != i10) {
            this.f30429m = i10;
            invalidateSelf();
        }
    }
}

package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import com.unity3d.services.UnityAdsConstants;
import xsna.atv0;
import xsna.lhg;
import xsna.obr;
import xsna.po40;
import xsna.s100;

/* compiled from: PreviewTransformation.java */
/* loaded from: classes11.dex */
public final class c {
    public static final PreviewView.ScaleType g = PreviewView.ScaleType.FILL_CENTER;
    public Size a;
    public Rect b;
    public int c;
    public int d;
    public boolean e;
    public PreviewView.ScaleType f;

    /* compiled from: PreviewTransformation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Nullable
    public final Matrix a(int i, Size size) {
        if (!f()) {
            return null;
        }
        Matrix matrix = new Matrix();
        c(i, size).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.getWidth(), this.a.getHeight()), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public final SizeF b() {
        this.b.getClass();
        return po40.l(this.c) ? new SizeF(this.b.height(), this.b.width()) : new SizeF(this.b.width(), this.b.height());
    }

    public final Matrix c(int i, Size size) {
        char c;
        char c2;
        Matrix.ScaleToFit scaleToFit;
        float[] fArr;
        obr.f(null, f());
        Matrix matrix = new Matrix();
        float width = size.getWidth() / size.getHeight();
        SizeF b = b();
        float width2 = (b.getWidth() + 0.5f) / (b.getHeight() - 0.5f);
        if (width < (b.getWidth() - 0.5f) / (b.getHeight() + 0.5f) || width > width2) {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size.getWidth(), size.getHeight());
            SizeF b2 = b();
            c = 7;
            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b2.getWidth(), b2.getHeight());
            Matrix matrix2 = new Matrix();
            PreviewView.ScaleType scaleType = this.f;
            switch (a.a[scaleType.ordinal()]) {
                case 1:
                case 2:
                    c2 = 6;
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    c2 = 6;
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    c2 = 6;
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    c2 = 6;
                    s100.a("PreviewTransform", "Unexpected crop rect: " + scaleType, null);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                matrix2.setRectToRect(rectF2, rectF, scaleToFit);
            } else {
                matrix2.setRectToRect(rectF, rectF2, scaleToFit);
                matrix2.invert(matrix2);
            }
            matrix2.mapRect(rectF2);
            if (i == 1) {
                float width3 = size.getWidth() / 2.0f;
                float f = width3 + width3;
                rectF2 = new RectF(f - rectF2.right, rectF2.top, f - rectF2.left, rectF2.bottom);
            }
            float f2 = rectF2.left;
            float f3 = rectF2.top;
            float f4 = rectF2.right;
            float f5 = rectF2.bottom;
            float[] fArr2 = new float[8];
            fArr2[0] = f2;
            fArr2[1] = f3;
            fArr2[2] = f4;
            fArr2[3] = f3;
            fArr2[4] = f4;
            fArr2[5] = f5;
            fArr2[c2] = f2;
            fArr2[7] = f5;
            fArr = fArr2;
        } else {
            fArr = po40.o(size);
            c = 7;
            c2 = 6;
        }
        float[] g2 = po40.g(this.c, fArr);
        RectF rectF3 = new RectF(this.b);
        float f6 = rectF3.left;
        float f7 = rectF3.top;
        float f8 = rectF3.right;
        float f9 = rectF3.bottom;
        float[] fArr3 = new float[8];
        fArr3[0] = f6;
        fArr3[1] = f7;
        fArr3[2] = f8;
        fArr3[3] = f7;
        fArr3[4] = f8;
        fArr3[5] = f9;
        fArr3[c2] = f6;
        fArr3[c] = f9;
        matrix.setPolyToPoly(fArr3, 0, g2, 0, 4);
        if (this.e) {
            if (po40.l(this.c)) {
                matrix.preScale(1.0f, -1.0f, this.b.centerX(), this.b.centerY());
                return matrix;
            }
            matrix.preScale(-1.0f, 1.0f, this.b.centerX(), this.b.centerY());
        }
        return matrix;
    }

    public final Matrix d() {
        int i;
        obr.f(null, f());
        Matrix matrix = new Matrix();
        float[] o = po40.o(this.a);
        int i2 = this.d;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 90;
        } else if (i2 == 2) {
            i = 180;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(lhg.a(i2, "Unexpected rotation value "));
            }
            i = atv0.b;
        }
        matrix.setPolyToPoly(o, 0, po40.g(-i, o), 0, 4);
        return matrix;
    }

    public final RectF e(int i, Size size) {
        obr.f(null, f());
        Matrix c = c(i, size);
        float[] o = po40.o(this.a);
        c.mapPoints(o);
        return new RectF(Math.min(Math.min(o[0], o[2]), Math.min(o[4], o[6])), Math.min(Math.min(o[1], o[3]), Math.min(o[5], o[7])), Math.max(Math.max(o[0], o[2]), Math.max(o[4], o[6])), Math.max(Math.max(o[1], o[3]), Math.max(o[5], o[7])));
    }

    public final boolean f() {
        return (this.b == null || this.a == null) ? false : true;
    }
}

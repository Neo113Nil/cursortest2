package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xhe extends ReplacementSpan {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;
    public Paint.FontMetricsInt h;
    public int i;
    public int j;
    public boolean k;

    public xhe(float f, int i, float f2, int i2, kx4 kx4Var, int i3) {
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float h0 = i == 0 ? kx4Var.h0(v8a.E(4294967296L, f)) : 0.0f;
        f3 = i2 == 0 ? kx4Var.h0(v8a.E(4294967296L, f2)) : f3;
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = h0;
        this.f = f3;
        this.g = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.i("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.k) {
            s3a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.j;
    }

    public final int c() {
        if (!this.k) {
            s3a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.k = true;
        float textSize = paint.getTextSize();
        this.h = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            s3a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.b;
        if (i3 == 0) {
            f = this.e;
        } else {
            if (i3 != 1) {
                s3a.b("Unsupported unit.");
                pvd.x();
                return 0;
            }
            f = this.a * textSize;
        }
        this.i = (int) Math.ceil(f);
        int i4 = this.d;
        if (i4 == 0) {
            f2 = this.f;
        } else {
            if (i4 != 1) {
                s3a.b("Unsupported unit.");
                pvd.x();
                return 0;
            }
            f2 = this.c * textSize;
        }
        this.j = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.g) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b;
                        fontMetricsInt.descent = b() + b;
                        break;
                    }
                    break;
                default:
                    s3a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

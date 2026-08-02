package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final p f19775b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f19774a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f19776c = -1;

    /* renamed from: d, reason: collision with root package name */
    public short f19777d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f19778e = 1.0f;

    public j(p pVar) {
        x0.f.h(pVar, "rasterizer cannot be null");
        this.f19775b = pVar;
    }

    public final p a() {
        return this.f19775b;
    }

    public final int b() {
        return this.f19776c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f19774a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f19774a;
        this.f19778e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f19775b.e();
        this.f19777d = (short) (this.f19775b.e() * this.f19778e);
        short i12 = (short) (this.f19775b.i() * this.f19778e);
        this.f19776c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f19774a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}

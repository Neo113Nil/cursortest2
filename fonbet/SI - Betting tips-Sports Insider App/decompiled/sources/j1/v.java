package j1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f18241b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f18244e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f18240a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f18242c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f18243d = 1.0f;

    public v(u uVar) {
        rh.g.e(uVar, "rasterizer cannot be null");
        this.f18241b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i10, float f6, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i5, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f18244e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f18244e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, i11, f6 + this.f18242c, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f18241b;
        com.google.firebase.messaging.x xVar = uVar.f18238b;
        Typeface typeface = (Typeface) xVar.f6185d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) xVar.f6183b, uVar.f18237a * 2, 2, f6, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f18240a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f18241b;
        this.f18243d = abs / (uVar.b().a(14) != 0 ? ((ByteBuffer) r8.f1362d).getShort(r1 + r8.f1359a) : (short) 0);
        k1.a b10 = uVar.b();
        int a7 = b10.a(14);
        if (a7 != 0) {
            ((ByteBuffer) b10.f1362d).getShort(a7 + b10.f1359a);
        }
        short s8 = (short) ((uVar.b().a(12) != 0 ? ((ByteBuffer) r5.f1362d).getShort(r7 + r5.f1359a) : (short) 0) * this.f18243d);
        this.f18242c = s8;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}

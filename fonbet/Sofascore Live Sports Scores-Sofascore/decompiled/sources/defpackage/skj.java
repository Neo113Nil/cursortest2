package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class skj extends qzb implements d9j {
    public CharSequence H;
    public final Context I;
    public final Paint.FontMetrics J;
    public final e9j K;
    public final b2 L;
    public final Rect M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;

    public skj(Context context, int i) {
        super(context, null, 0, i);
        this.J = new Paint.FontMetrics();
        e9j e9jVar = new e9j(this);
        this.K = e9jVar;
        this.L = new b2(this, 16);
        this.M = new Rect();
        this.U = 1.0f;
        this.V = 1.0f;
        this.W = 0.5f;
        this.X = 0.5f;
        this.Y = 1.0f;
        this.I = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = e9jVar.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float F() {
        int i;
        Rect rect = this.M;
        if (((rect.right - getBounds().right) - this.T) - this.Q < 0) {
            i = ((rect.right - getBounds().right) - this.T) - this.Q;
        } else {
            if (((rect.left - getBounds().left) - this.T) + this.Q <= 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i = ((rect.left - getBounds().left) - this.T) + this.Q;
        }
        return i;
    }

    public final end G() {
        float f = -F();
        float width = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.S)) / 2.0d);
        return new end(new zub(this.S), Math.min(Math.max(f, -width), width));
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float F = F();
        float f = (float) (-((Math.sqrt(2.0d) * this.S) - this.S));
        canvas.scale(this.U, this.V, (getBounds().width() * this.W) + getBounds().left, (getBounds().height() * this.X) + getBounds().top);
        canvas.translate(F, f);
        super.draw(canvas);
        if (this.H == null) {
            canvas2 = canvas;
        } else {
            float centerY = getBounds().centerY();
            e9j e9jVar = this.K;
            TextPaint textPaint = e9jVar.a;
            Paint.FontMetrics fontMetrics = this.J;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (e9jVar.g != null) {
                textPaint.drawableState = getState();
                e9jVar.g.d(this.I, e9jVar.a, e9jVar.b);
                textPaint.setAlpha((int) (this.Y * 255.0f));
            }
            CharSequence charSequence = this.H;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.K.a.getTextSize(), this.P);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.N * 2;
        CharSequence charSequence = this.H;
        return (int) Math.max(f + (charSequence == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.K.a(charSequence.toString())), this.O);
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.R) {
            wah m = k().m();
            m.k = G();
            setShapeAppearanceModel(m.a());
        }
    }
}

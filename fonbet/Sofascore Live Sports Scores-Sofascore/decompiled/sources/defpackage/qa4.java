package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qa4 extends qzb {
    public static final /* synthetic */ int I = 0;
    public pa4 H;

    public final void F(float f, float f2, float f3, float f4) {
        RectF rectF = this.H.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.qzb
    public final void h(Canvas canvas) {
        if (this.H.s.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.H.s);
        super.h(canvas);
        canvas.restore();
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.H = new pa4(this.H);
        return this;
    }
}

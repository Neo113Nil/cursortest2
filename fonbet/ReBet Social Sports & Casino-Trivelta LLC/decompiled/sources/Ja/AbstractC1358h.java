package Ja;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.shape.i;

/* renamed from: Ja.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1358h extends com.google.android.material.shape.i {

    /* renamed from: D, reason: collision with root package name */
    public b f5991D;

    /* renamed from: Ja.h$c */
    public static class c extends AbstractC1358h {
        public c(b bVar) {
            super(bVar);
        }

        @Override // com.google.android.material.shape.i
        public void w(Canvas canvas) {
            if (this.f5991D.f5992x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f5991D.f5992x);
            } else {
                canvas.clipRect(this.f5991D.f5992x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    public static AbstractC1358h x0(b bVar) {
        return new c(bVar);
    }

    public static AbstractC1358h y0(com.google.android.material.shape.n nVar) {
        if (nVar == null) {
            nVar = new com.google.android.material.shape.n();
        }
        return x0(new b(nVar, new RectF()));
    }

    public void A0() {
        B0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void B0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f5991D.f5992x.left && f11 == this.f5991D.f5992x.top && f12 == this.f5991D.f5992x.right && f13 == this.f5991D.f5992x.bottom) {
            return;
        }
        this.f5991D.f5992x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void C0(RectF rectF) {
        B0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5991D = new b(this.f5991D);
        return this;
    }

    public boolean z0() {
        return !this.f5991D.f5992x.isEmpty();
    }

    /* renamed from: Ja.h$b */
    public static final class b extends i.c {

        /* renamed from: x, reason: collision with root package name */
        public final RectF f5992x;

        @Override // com.google.android.material.shape.i.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC1358h x02 = AbstractC1358h.x0(this);
            x02.invalidateSelf();
            return x02;
        }

        public b(com.google.android.material.shape.n nVar, RectF rectF) {
            super(nVar, null);
            this.f5992x = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.f5992x = bVar.f5992x;
        }
    }

    public AbstractC1358h(b bVar) {
        super(bVar);
        this.f5991D = bVar;
    }
}

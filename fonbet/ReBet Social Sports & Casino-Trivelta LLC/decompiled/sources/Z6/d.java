package Z6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C3016g;
import com.facebook.drawee.drawable.F;
import com.facebook.drawee.drawable.G;

/* loaded from: classes2.dex */
public class d extends C3016g implements F {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f14711a;

    /* renamed from: b, reason: collision with root package name */
    public G f14712b;

    public d(Drawable drawable) {
        super(drawable);
        this.f14711a = null;
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            G g10 = this.f14712b;
            if (g10 != null) {
                g10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f14711a;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f14711a.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.F
    public void g(G g10) {
        this.f14712b = g10;
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public void i(Drawable drawable) {
        this.f14711a = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        G g10 = this.f14712b;
        if (g10 != null) {
            g10.U(z10);
        }
        return super.setVisible(z10, z11);
    }
}

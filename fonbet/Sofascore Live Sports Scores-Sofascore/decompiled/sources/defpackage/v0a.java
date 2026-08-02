package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v0a extends hb5 {
    public final mb5 n;
    public r9 o;
    public gmk p;

    public v0a(Context context, l51 l51Var, mb5 mb5Var, r9 r9Var) {
        super(context, l51Var);
        this.n = mb5Var;
        this.o = r9Var;
        r9Var.a = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        gmk gmkVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            l80 l80Var = this.c;
            l51 l51Var = this.b;
            if (l80Var != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (gmkVar = this.p) != null) {
                gmkVar.setBounds(getBounds());
                this.p.setTint(l51Var.e[0]);
                this.p.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            mb5 mb5Var = this.n;
            mb5Var.a.d();
            mb5Var.a(canvas, bounds, b, z, z2);
            int i2 = l51Var.i;
            int i3 = this.k;
            boolean z3 = (l51Var instanceof e8b) || ((l51Var instanceof ov2) && ((ov2) l51Var).u);
            boolean z4 = z3 && i2 == 0 && !l51Var.b(false);
            Paint paint = this.j;
            if (z4) {
                this.n.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, l51Var.f, i3, 0);
            } else if (z3) {
                kb5 kb5Var = (kb5) ((ArrayList) this.o.b).get(0);
                kb5 kb5Var2 = (kb5) mz1.h((ArrayList) this.o.b, 1);
                mb5 mb5Var2 = this.n;
                if (mb5Var2 instanceof t7b) {
                    i = i2;
                    mb5Var2.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kb5Var.a, l51Var.f, i3, i);
                    this.n.d(canvas, paint, kb5Var2.b, 1.0f, l51Var.f, i3, i);
                } else {
                    i = i2;
                    canvas.save();
                    canvas.rotate(kb5Var2.g);
                    this.n.d(canvas, paint, kb5Var2.b, kb5Var.a + 1.0f, l51Var.f, i3, i);
                    canvas.restore();
                }
                for (int i4 = 0; i4 < ((ArrayList) this.o.b).size(); i4++) {
                    kb5 kb5Var3 = (kb5) ((ArrayList) this.o.b).get(i4);
                    kb5Var3.f = c();
                    this.n.c(canvas, paint, kb5Var3, this.k);
                    if (i4 > 0 && !z4 && z3) {
                        this.n.d(canvas, paint, ((kb5) ((ArrayList) this.o.b).get(i4 - 1)).b, kb5Var3.a, l51Var.f, i3, i);
                    }
                }
                canvas.restore();
            }
            i = i2;
            while (i4 < ((ArrayList) this.o.b).size()) {
            }
            canvas.restore();
        }
    }

    @Override // defpackage.hb5
    public final boolean e(boolean z, boolean z2, boolean z3) {
        gmk gmkVar;
        boolean e = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (gmkVar = this.p) != null) {
            return gmkVar.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.o.d();
        }
        if (z && z3) {
            this.o.C();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }
}

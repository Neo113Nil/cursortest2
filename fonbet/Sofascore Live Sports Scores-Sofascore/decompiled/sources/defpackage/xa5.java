package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xa5 extends Drawable {
    public final float a;
    public final ArrayList b;
    public float c;
    public final float d;

    public xa5(float f, ArrayList arrayList) {
        this.a = f;
        this.b = arrayList;
        Iterator it = arrayList.iterator();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            f2 += ((va5) it.next()).c;
        }
        this.d = f2;
    }

    public abstract void a(Canvas canvas, va5 va5Var, float f);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object obj;
        canvas.getClass();
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            va5 va5Var = (va5) obj;
            float f = va5Var.b;
            float f2 = va5Var.c + f;
            float f3 = this.c;
            if (f <= f3 && f3 <= f2) {
                break;
            }
        }
        va5 va5Var2 = (va5) obj;
        if (va5Var2 == null || va5Var2.a == wa5.f) {
            return;
        }
        a(canvas, va5Var2, this.c - va5Var2.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

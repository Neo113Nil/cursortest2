package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dy8 {
    public final k9i a;
    public final Handler b;
    public final ArrayList c;
    public final n0g d;
    public final dx1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public c0g i;
    public by8 j;
    public boolean k;
    public by8 l;
    public Bitmap m;
    public by8 n;
    public int o;
    public int p;
    public int q;

    public dy8(a aVar, k9i k9iVar, int i, int i2, Bitmap bitmap) {
        dx1 dx1Var = aVar.a;
        jz8 jz8Var = aVar.c;
        n0g c = a.c(jz8Var.getBaseContext());
        n0g c2 = a.c(jz8Var.getBaseContext());
        c2.getClass();
        c0g a = new c0g(c2.a, c2, Bitmap.class, c2.b).a(n0g.k).a(((r0g) ((r0g) ((r0g) new r0g().d(t35.b)).q()).n()).g(i, i2));
        this.c = new ArrayList();
        this.d = c;
        Handler handler = new Handler(Looper.getMainLooper(), new cy8(this, 0));
        this.e = dx1Var;
        this.b = handler;
        this.i = a;
        this.a = k9iVar;
        c(bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        boolean z = this.h;
        int i2 = -1;
        k9i k9iVar = this.a;
        if (z) {
            w1a.k("Pending target must be null when starting from the first frame", this.n == null);
            k9iVar.k = -1;
            this.h = false;
        }
        by8 by8Var = this.n;
        if (by8Var != null) {
            this.n = null;
            b(by8Var);
            return;
        }
        this.g = true;
        ey8 ey8Var = k9iVar.l;
        int i3 = ey8Var.c;
        if (i3 <= 0 || (i = k9iVar.k) < 0) {
            i2 = 0;
        } else if (i >= 0 && i < i3) {
            i2 = ((ay8) ey8Var.e.get(i)).i;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + i2;
        int i4 = (k9iVar.k + 1) % k9iVar.l.c;
        k9iVar.k = i4;
        this.l = new by8(this.b, i4, uptimeMillis);
        this.i.a((r0g) new r0g().m(new wjd(Double.valueOf(Math.random())))).w(k9iVar).v(this.l);
    }

    public final void b(by8 by8Var) {
        this.g = false;
        boolean z = this.k;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, by8Var).sendToTarget();
            return;
        }
        if (!this.f) {
            if (this.h) {
                handler.obtainMessage(2, by8Var).sendToTarget();
                return;
            } else {
                this.n = by8Var;
                return;
            }
        }
        if (by8Var.e != null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                this.e.i(bitmap);
                this.m = null;
            }
            by8 by8Var2 = this.j;
            this.j = by8Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                xx8 xx8Var = (xx8) arrayList.get(size);
                Object callback = xx8Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    xx8Var.stop();
                    xx8Var.invalidateSelf();
                } else {
                    xx8Var.invalidateSelf();
                    by8 by8Var3 = ((dy8) xx8Var.a.b).j;
                    if ((by8Var3 != null ? by8Var3.c : -1) == r5.a.l.c - 1) {
                        xx8Var.f++;
                    }
                    int i = xx8Var.g;
                    if (i != -1 && xx8Var.f >= i) {
                        xx8Var.stop();
                    }
                }
            }
            if (by8Var2 != null) {
                handler.obtainMessage(2, by8Var2).sendToTarget();
            }
        }
        a();
    }

    public final void c(Bitmap bitmap) {
        w1a.m(bitmap, "Argument must not be null");
        this.m = bitmap;
        this.i = this.i.a(new r0g().p());
        this.o = kik.r(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}

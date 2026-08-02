package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n0g implements ComponentCallbacks2, s6b {
    public static final r0g k;
    public static final r0g l;
    public final a a;
    public final Context b;
    public final f6b c;
    public final yih d;
    public final q0g e;
    public final wti f;
    public final kac g;
    public final qk3 h;
    public final CopyOnWriteArrayList i;
    public final r0g j;

    static {
        r0g r0gVar = (r0g) new r0g().c(Bitmap.class);
        r0gVar.m = true;
        k = r0gVar;
        r0g r0gVar2 = (r0g) new r0g().c(xx8.class);
        r0gVar2.m = true;
        l = r0gVar2;
    }

    public n0g(a aVar, f6b f6bVar, q0g q0gVar, Context context) {
        r0g r0gVar;
        yih yihVar = new yih(9);
        hjg hjgVar = aVar.f;
        this.f = new wti();
        kac kacVar = new kac(this, 12);
        this.g = kacVar;
        this.a = aVar;
        this.c = f6bVar;
        this.e = q0gVar;
        this.d = yihVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        m0g m0gVar = new m0g(this, yihVar);
        hjgVar.getClass();
        qk3 zn4Var = eq3.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new zn4(applicationContext, m0gVar) : new lid();
        this.h = zn4Var;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.g.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f6bVar.c(this);
        } else {
            kik.B().post(kacVar);
        }
        f6bVar.c(zn4Var);
        this.i = new CopyOnWriteArrayList(aVar.c.c);
        jz8 jz8Var = aVar.c;
        synchronized (jz8Var) {
            r0gVar = jz8Var.g;
            if (r0gVar == null) {
                r0gVar = new r0g();
                r0gVar.m = true;
                jz8Var.g = r0gVar;
            }
        }
        synchronized (this) {
            r0g r0gVar2 = (r0g) r0gVar.clone();
            if (r0gVar2.m && !r0gVar2.n) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            r0gVar2.n = true;
            r0gVar2.m = true;
            this.j = r0gVar2;
        }
    }

    public final void a(ka4 ka4Var) {
        if (ka4Var == null) {
            return;
        }
        boolean e = e(ka4Var);
        rzf rzfVar = ka4Var.a;
        if (e) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.g) {
            try {
                Iterator it = aVar.g.iterator();
                while (it.hasNext()) {
                    if (((n0g) it.next()).e(ka4Var)) {
                        return;
                    }
                }
                if (rzfVar != null) {
                    ka4Var.a = null;
                    rzfVar.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b() {
        try {
            Iterator it = kik.z(this.f.a).iterator();
            while (it.hasNext()) {
                a((ka4) it.next());
            }
            this.f.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        yih yihVar = this.d;
        yihVar.b = true;
        Iterator it = kik.z((Set) yihVar.c).iterator();
        while (it.hasNext()) {
            rzf rzfVar = (rzf) it.next();
            if (rzfVar.isRunning()) {
                rzfVar.pause();
                ((HashSet) yihVar.d).add(rzfVar);
            }
        }
    }

    public final synchronized void d() {
        yih yihVar = this.d;
        yihVar.b = false;
        Iterator it = kik.z((Set) yihVar.c).iterator();
        while (it.hasNext()) {
            rzf rzfVar = (rzf) it.next();
            if (!rzfVar.d() && !rzfVar.isRunning()) {
                rzfVar.j();
            }
        }
        ((HashSet) yihVar.d).clear();
    }

    public final synchronized boolean e(ka4 ka4Var) {
        rzf rzfVar = ka4Var.a;
        if (rzfVar == null) {
            return true;
        }
        if (!this.d.i(rzfVar)) {
            return false;
        }
        this.f.a.remove(ka4Var);
        ka4Var.a = null;
        return true;
    }

    @Override // defpackage.s6b
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        b();
        yih yihVar = this.d;
        Iterator it = kik.z((Set) yihVar.c).iterator();
        while (it.hasNext()) {
            yihVar.i((rzf) it.next());
        }
        ((HashSet) yihVar.d).clear();
        this.c.f(this);
        this.c.f(this.h);
        kik.B().removeCallbacks(this.g);
        a aVar = this.a;
        synchronized (aVar.g) {
            if (!aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.g.remove(this);
        }
    }

    @Override // defpackage.s6b
    public final synchronized void onStart() {
        d();
        this.f.onStart();
    }

    @Override // defpackage.s6b
    public final synchronized void onStop() {
        this.f.onStop();
        c();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}

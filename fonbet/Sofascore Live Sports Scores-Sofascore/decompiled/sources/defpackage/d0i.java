package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d0i {
    public static final ue5 p = new ue5(1);
    public static final ue5 q = new ue5(2);
    public static final ue5 r = new ue5(3);
    public static final ue5 s = new ue5(4);
    public static final ue5 t = new ue5(5);
    public static final ue5 u = new ue5(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final c6o e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public e0i m;
    public float n;
    public boolean o;

    public d0i(Object obj, c6o c6oVar) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = c6oVar;
        if (c6oVar == r || c6oVar == s || c6oVar == t) {
            this.j = 0.1f;
        } else if (c6oVar == u) {
            this.j = 0.00390625f;
        } else if (c6oVar == p || c6oVar == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static y70 b() {
        ThreadLocal threadLocal = y70.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new y70(new f4a((byte) 0, 16)));
        }
        return (y70) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        e0i e0iVar = this.m;
        if (e0iVar == null) {
            e0iVar = new e0i(f);
            this.m = e0iVar;
        }
        double d = f;
        e0iVar.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            a70.m("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.h) {
            a70.m("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.j * 0.75f);
        e0iVar.d = abs;
        e0iVar.e = abs * 62.5d;
        if (Thread.currentThread() != ((Looper) b().e.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.M(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            a70.p("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.j = f;
        } else {
            a70.p("Minimum visible change must be positive.");
        }
    }

    public final void d(float f) {
        ArrayList arrayList;
        this.e.e0(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                swj swjVar = (swj) arrayList.get(i);
                float f2 = this.b;
                jxj jxjVar = swjVar.h;
                long max = Math.max(-1L, Math.min(jxjVar.x + 1, Math.round(f2)));
                jxjVar.E(max, swjVar.a);
                swjVar.a = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e() {
        if (this.m.b <= 0.0d) {
            a70.m("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ((Looper) b().e.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    public d0i(g88 g88Var) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new ve5(g88Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}

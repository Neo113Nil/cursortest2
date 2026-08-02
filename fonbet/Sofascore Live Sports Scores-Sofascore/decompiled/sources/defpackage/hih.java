package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hih implements rzf {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);
    public final tdi a;
    public final Object b;
    public final d0g c;
    public final Context d;
    public final jz8 e;
    public final Object f;
    public final Class g;
    public final r51 h;
    public final int i;
    public final int j;
    public final k7f k;
    public final ka4 l;
    public final List m;
    public final dti n;
    public final g35 o;
    public e1g p;
    public hcc q;
    public volatile sn5 r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public int v;
    public int w;
    public boolean x;
    public final RuntimeException y;
    public int z;

    public hih(Context context, jz8 jz8Var, Object obj, Object obj2, Class cls, r51 r51Var, int i, int i2, k7f k7fVar, ka4 ka4Var, ArrayList arrayList, d0g d0gVar, sn5 sn5Var) {
        dti dtiVar = ldd.a;
        g35 g35Var = o1j.e;
        if (A) {
            String.valueOf(hashCode());
        }
        this.a = new tdi();
        this.b = obj;
        this.d = context;
        this.e = jz8Var;
        this.f = obj2;
        this.g = cls;
        this.h = r51Var;
        this.i = i;
        this.j = i2;
        this.k = k7fVar;
        this.l = ka4Var;
        this.m = arrayList;
        this.c = d0gVar;
        this.r = sn5Var;
        this.n = dtiVar;
        this.o = g35Var;
        this.z = 1;
        if (this.y == null && ((Map) jz8Var.f.a).containsKey(gz8.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.rzf
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    public final void b() {
        if (this.x) {
            a70.r("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.a.a();
        this.l.getClass();
        hcc hccVar = this.q;
        if (hccVar != null) {
            synchronized (((sn5) hccVar.d)) {
                ((jo5) hccVar.b).g((hih) hccVar.c);
            }
            this.q = null;
        }
    }

    @Override // defpackage.rzf
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 6;
        }
        return z;
    }

    @Override // defpackage.rzf
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                if (this.z == 6) {
                    return;
                }
                b();
                e1g e1gVar = this.p;
                if (e1gVar != null) {
                    this.p = null;
                } else {
                    e1gVar = null;
                }
                d0g d0gVar = this.c;
                if (d0gVar == null || d0gVar.b(this)) {
                    this.l.a(f());
                }
                this.z = 6;
                if (e1gVar != null) {
                    this.r.getClass();
                    sn5.e(e1gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rzf
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean e(rzf rzfVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        r51 r51Var;
        k7f k7fVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        r51 r51Var2;
        k7f k7fVar2;
        int size2;
        if (!(rzfVar instanceof hih)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                r51Var = this.h;
                k7fVar = this.k;
                List list = this.m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        hih hihVar = (hih) rzfVar;
        synchronized (hihVar.b) {
            try {
                i3 = hihVar.i;
                i4 = hihVar.j;
                obj2 = hihVar.f;
                cls2 = hihVar.g;
                r51Var2 = hihVar.h;
                k7fVar2 = hihVar.k;
                List list2 = hihVar.m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((r51Var == null ? r51Var2 == null : r51Var.e(r51Var2)) && k7fVar == k7fVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable f() {
        Drawable drawable = this.t;
        if (drawable != null) {
            return drawable;
        }
        r51 r51Var = this.h;
        r51Var.getClass();
        this.t = null;
        int i = r51Var.d;
        if (i <= 0) {
            return null;
        }
        r51Var.getClass();
        Context context = this.d;
        Drawable E = l6g.E(context, context, i, context.getTheme());
        this.t = E;
        return E;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:15:0x0045, B:17:0x0049, B:18:0x004d, B:20:0x0053, B:22:0x005d, B:23:0x0065, B:28:0x0077, B:35:0x0083, B:31:0x008b, B:40:0x0095, B:42:0x0099, B:52:0x00a4, B:54:0x00a8, B:56:0x00ac, B:58:0x00b6, B:60:0x00ba, B:64:0x00c6, B:65:0x00ca), top: B:14:0x0045, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6 A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:15:0x0045, B:17:0x0049, B:18:0x004d, B:20:0x0053, B:22:0x005d, B:23:0x0065, B:28:0x0077, B:35:0x0083, B:31:0x008b, B:40:0x0095, B:42:0x0099, B:52:0x00a4, B:54:0x00a8, B:56:0x00ac, B:58:0x00b6, B:60:0x00ba, B:64:0x00c6, B:65:0x00ca), top: B:14:0x0045, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(mz8 mz8Var, int i) {
        Drawable drawable;
        this.a.a();
        synchronized (this.b) {
            try {
                mz8Var.getClass();
                this.e.getClass();
                if (4 <= i) {
                    Objects.toString(this.f);
                    ArrayList arrayList = new ArrayList();
                    mz8.a(mz8Var, arrayList);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        i2 = i3;
                    }
                }
                Drawable drawable2 = null;
                this.q = null;
                this.z = 5;
                d0g d0gVar = this.c;
                if (d0gVar != null) {
                    d0gVar.f(this);
                }
                boolean z = true;
                this.x = true;
                try {
                    List<kz8> list = this.m;
                    if (list != null) {
                        for (kz8 kz8Var : list) {
                            d0g d0gVar2 = this.c;
                            if (d0gVar2 != null) {
                                d0gVar2.getRoot().a();
                            }
                            e48 e48Var = kz8Var.b;
                            mz8Var.getMessage();
                            Objects.toString(mz8Var.getCause());
                            if (kz8Var.a != null && e48Var != null) {
                                if (mz8Var.getLocalizedMessage().contains("Failed to decode")) {
                                    ((d55) e48Var).a(d48.d);
                                } else {
                                    ((d55) e48Var).a(d48.a);
                                }
                            }
                        }
                    }
                    d0g d0gVar3 = this.c;
                    if (d0gVar3 != null && !d0gVar3.h(this)) {
                        z = false;
                    }
                    if (this.f == null) {
                        drawable = this.u;
                        if (drawable == null) {
                            this.h.getClass();
                            this.u = null;
                        }
                        if (drawable == null) {
                            Drawable drawable3 = this.s;
                            if (drawable3 == null) {
                                this.h.getClass();
                                this.s = null;
                            } else {
                                drawable2 = drawable3;
                            }
                            drawable = drawable2;
                        }
                        if (drawable == null) {
                            drawable = f();
                        }
                        this.l.b(drawable);
                    }
                    drawable = null;
                    if (drawable == null) {
                    }
                    if (drawable == null) {
                    }
                    this.l.b(drawable);
                } finally {
                    this.x = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(e1g e1gVar, int i) {
        this.a.a();
        e1g e1gVar2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (e1gVar == null) {
                        g(new mz8("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = e1gVar.get();
                    try {
                        if (obj != null && this.g.isAssignableFrom(obj.getClass())) {
                            d0g d0gVar = this.c;
                            if (d0gVar == null || d0gVar.i(this)) {
                                i(e1gVar, obj, i);
                                return;
                            }
                            this.p = null;
                            this.z = 4;
                            this.r.getClass();
                            sn5.e(e1gVar);
                        }
                        this.p = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.g);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(e1gVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        g(new mz8(sb.toString()), 5);
                        this.r.getClass();
                        sn5.e(e1gVar);
                    } catch (Throwable th) {
                        e1gVar2 = e1gVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (e1gVar2 != null) {
                this.r.getClass();
                sn5.e(e1gVar2);
            }
            throw th3;
        }
    }

    public final void i(e1g e1gVar, Object obj, int i) {
        d0g d0gVar = this.c;
        if (d0gVar != null) {
            d0gVar.getRoot().a();
        }
        this.z = 4;
        this.p = e1gVar;
        this.e.getClass();
        if (d0gVar != null) {
            d0gVar.g(this);
        }
        this.x = true;
        try {
            List list = this.m;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kz8) it.next()).getClass();
                    Objects.toString((Drawable) obj);
                }
            }
            this.n.getClass();
            this.l.c(obj);
            this.x = false;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // defpackage.rzf
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            int i = this.z;
            z = i == 2 || i == 3;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0017, B:10:0x0021, B:11:0x002d, B:13:0x0031, B:16:0x003c, B:17:0x0046, B:20:0x0048, B:24:0x0050, B:25:0x0055, B:27:0x0057, B:30:0x006d, B:32:0x0079, B:33:0x008b, B:36:0x00a9, B:38:0x00ad, B:39:0x00b0, B:41:0x0091, B:43:0x0095, B:48:0x00a1, B:50:0x0081, B:51:0x005c, B:52:0x0060, B:54:0x0066, B:56:0x00b2, B:57:0x00b9, B:58:0x00ba, B:59:0x00c1), top: B:3:0x0003 }] */
    @Override // defpackage.rzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = vib.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (kik.I(this.i, this.j)) {
                        this.v = this.i;
                        this.w = this.j;
                    }
                    Drawable drawable = this.u;
                    if (drawable == null) {
                        this.h.getClass();
                        drawable = null;
                        this.u = null;
                    }
                    g(new mz8("Received null model"), drawable == null ? 5 : 3);
                    return;
                }
                int i2 = this.z;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    h(this.p, 5);
                    return;
                }
                List<kz8> list = this.m;
                if (list != null) {
                    for (kz8 kz8Var : list) {
                    }
                }
                this.z = 3;
                if (kik.I(this.i, this.j)) {
                    k(this.i, this.j);
                } else {
                    this.l.getClass();
                    k(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                int i3 = this.z;
                if (i3 == 2 || i3 == 3) {
                    d0g d0gVar = this.c;
                    if (d0gVar != null && !d0gVar.h(this)) {
                        z = false;
                        if (z) {
                            ka4 ka4Var = this.l;
                            f();
                            ka4Var.getClass();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void k(int i, int i2) {
        ?? r1;
        int i3 = i;
        this.a.a();
        Object obj = this.b;
        synchronized (obj) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i4 = vib.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.z != 3) {
                        return;
                    }
                    this.z = 2;
                    this.h.getClass();
                    this.v = i3 == Integer.MIN_VALUE ? i3 : Math.round(i3 * 1.0f);
                    this.w = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        int i5 = vib.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    sn5 sn5Var = this.r;
                    jz8 jz8Var = this.e;
                    Object obj2 = this.f;
                    r51 r51Var = this.h;
                    this.q = sn5Var.a(jz8Var, obj2, r51Var.h, this.v, this.w, r51Var.l, this.g, this.k, r51Var.b, r51Var.k, r51Var.i, r51Var.o, r51Var.j, r51Var.e, r51Var.p, this, this.o);
                    if (this.z != 2) {
                        this.q = null;
                    }
                    if (z) {
                        int i6 = vib.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = obj;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = i3;
            }
        }
    }

    @Override // defpackage.rzf
    public final void pause() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + U3.j.e;
    }
}

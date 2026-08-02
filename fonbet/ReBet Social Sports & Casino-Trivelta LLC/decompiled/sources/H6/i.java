package H6;

import D6.k;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4832d = new IdentityHashMap();

    /* renamed from: a, reason: collision with root package name */
    public Object f4833a;

    /* renamed from: b, reason: collision with root package name */
    public int f4834b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final h f4835c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(Object obj, h hVar, boolean z10) {
        this.f4833a = k.g(obj);
        this.f4835c = hVar;
        if (z10) {
            a(obj);
        }
    }

    public static void a(Object obj) {
        Map map = f4832d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(Object obj) {
        Map map = f4832d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    E6.a.P("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f4834b++;
    }

    public final synchronized int c() {
        int i10;
        e();
        k.b(Boolean.valueOf(this.f4834b > 0));
        i10 = this.f4834b - 1;
        this.f4834b = i10;
        return i10;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f4833a;
                this.f4833a = null;
            }
            if (obj != null) {
                h hVar = this.f4835c;
                if (hVar != null) {
                    hVar.release(obj);
                }
                g(obj);
            }
        }
    }

    public final void e() {
        if (!isValid(this)) {
            throw new a();
        }
    }

    public synchronized Object f() {
        return this.f4833a;
    }

    public synchronized boolean isValid() {
        return this.f4834b > 0;
    }

    public static boolean isValid(i iVar) {
        return iVar != null && iVar.isValid();
    }
}

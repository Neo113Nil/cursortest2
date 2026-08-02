package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.transition.a0;
import androidx.transition.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: p, reason: collision with root package name */
    public static final e f1787p = new e("scaleX", 1);
    public static final e q = new e("scaleY", 2);

    /* renamed from: r, reason: collision with root package name */
    public static final e f1788r = new e("rotation", 3);

    /* renamed from: s, reason: collision with root package name */
    public static final e f1789s = new e("rotationX", 4);

    /* renamed from: t, reason: collision with root package name */
    public static final e f1790t = new e("rotationY", 5);

    /* renamed from: u, reason: collision with root package name */
    public static final e f1791u = new e("alpha", 0);

    /* renamed from: a, reason: collision with root package name */
    public float f1792a;

    /* renamed from: b, reason: collision with root package name */
    public float f1793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1794c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1795d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1796e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1797f;

    /* renamed from: g, reason: collision with root package name */
    public float f1798g;

    /* renamed from: h, reason: collision with root package name */
    public float f1799h;

    /* renamed from: i, reason: collision with root package name */
    public long f1800i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1801k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1802l;

    /* renamed from: m, reason: collision with root package name */
    public m f1803m;

    /* renamed from: n, reason: collision with root package name */
    public float f1804n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1805o;

    public l(k kVar) {
        this.f1792a = 0.0f;
        this.f1793b = Float.MAX_VALUE;
        this.f1794c = false;
        this.f1797f = false;
        this.f1798g = Float.MAX_VALUE;
        this.f1799h = -3.4028235E38f;
        this.f1800i = 0L;
        this.f1801k = new ArrayList();
        this.f1802l = new ArrayList();
        this.f1795d = null;
        this.f1796e = new f(kVar);
        this.j = 1.0f;
        this.f1803m = null;
        this.f1804n = Float.MAX_VALUE;
        this.f1805o = false;
    }

    public static d b() {
        ThreadLocal threadLocal = d.f1772i;
        if (threadLocal.get() == null) {
            threadLocal.set(new d(new x5.h(1)));
        }
        return (d) threadLocal.get();
    }

    public final void a(float f6) {
        if (this.f1797f) {
            this.f1804n = f6;
            return;
        }
        if (this.f1803m == null) {
            this.f1803m = new m(f6);
        }
        m mVar = this.f1803m;
        double d10 = f6;
        mVar.f1814i = d10;
        double d11 = (float) d10;
        if (d11 > this.f1798g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < this.f1799h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.j * 0.75f);
        mVar.f1809d = abs;
        mVar.f1810e = abs * 62.5d;
        x5.h hVar = b().f1777e;
        hVar.getClass();
        if (Thread.currentThread() != ((Looper) hVar.f25410b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z5 = this.f1797f;
        if (z5 || z5) {
            return;
        }
        this.f1797f = true;
        if (!this.f1794c) {
            this.f1793b = this.f1796e.getValue(this.f1795d);
        }
        float f10 = this.f1793b;
        if (f10 > this.f1798g || f10 < this.f1799h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b().a(this);
    }

    public final void c(float f6) {
        ArrayList arrayList;
        this.f1796e.setValue(this.f1795d, f6);
        int i5 = 0;
        while (true) {
            arrayList = this.f1802l;
            if (i5 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i5) != null) {
                x xVar = (x) arrayList.get(i5);
                float f10 = this.f1793b;
                a0 a0Var = xVar.f2765g;
                long max = Math.max(-1L, Math.min(a0Var.getTotalDurationMillis() + 1, Math.round(f10)));
                a0Var.setCurrentPlayTimeMillis(max, xVar.f2759a);
                xVar.f2759a = max;
            }
            i5++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.f1803m.f1807b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        x5.h hVar = b().f1777e;
        hVar.getClass();
        if (Thread.currentThread() != ((Looper) hVar.f25410b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1797f) {
            this.f1805o = true;
        }
    }

    public l(Object obj, j jVar) {
        this.f1792a = 0.0f;
        this.f1793b = Float.MAX_VALUE;
        this.f1794c = false;
        this.f1797f = false;
        this.f1798g = Float.MAX_VALUE;
        this.f1799h = -3.4028235E38f;
        this.f1800i = 0L;
        this.f1801k = new ArrayList();
        this.f1802l = new ArrayList();
        this.f1795d = obj;
        this.f1796e = jVar;
        if (jVar != f1788r && jVar != f1789s && jVar != f1790t) {
            if (jVar == f1791u) {
                this.j = 0.00390625f;
            } else if (jVar != f1787p && jVar != q) {
                this.j = 1.0f;
            } else {
                this.j = 0.002f;
            }
        } else {
            this.j = 0.1f;
        }
        this.f1803m = null;
        this.f1804n = Float.MAX_VALUE;
        this.f1805o = false;
    }
}

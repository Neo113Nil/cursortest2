package K7;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    public final J f6285a;

    /* renamed from: b, reason: collision with root package name */
    public B f6286b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1369j f6287c;

    /* renamed from: d, reason: collision with root package name */
    public B f6288d;

    /* renamed from: e, reason: collision with root package name */
    public w f6289e;

    /* renamed from: f, reason: collision with root package name */
    public B f6290f;

    /* renamed from: g, reason: collision with root package name */
    public G6.i f6291g;

    /* renamed from: h, reason: collision with root package name */
    public G6.l f6292h;

    /* renamed from: i, reason: collision with root package name */
    public G6.a f6293i;

    public L(J j10) {
        this.f6285a = (J) D6.k.g(j10);
    }

    public final B a() {
        if (this.f6286b == null) {
            try {
                this.f6286b = (B) AshmemMemoryChunkPool.class.getConstructor(G6.d.class, M.class, N.class).newInstance(this.f6285a.i(), this.f6285a.g(), this.f6285a.h());
            } catch (ClassNotFoundException unused) {
                this.f6286b = null;
            } catch (IllegalAccessException unused2) {
                this.f6286b = null;
            } catch (InstantiationException unused3) {
                this.f6286b = null;
            } catch (NoSuchMethodException unused4) {
                this.f6286b = null;
            } catch (InvocationTargetException unused5) {
                this.f6286b = null;
            }
        }
        return this.f6286b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public InterfaceC1369j b() {
        if (this.f6287c == null) {
            String e10 = this.f6285a.e();
            switch (e10.hashCode()) {
                case -1868884870:
                    if (e10.equals("legacy_default_params")) {
                        this.f6287c = new o(this.f6285a.i(), q.a(), this.f6285a.d(), this.f6285a.l());
                        break;
                    }
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
                case -1106578487:
                    e10.equals("legacy");
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
                case -404562712:
                    if (e10.equals("experimental")) {
                        this.f6287c = new y(this.f6285a.b(), this.f6285a.a(), G.h(), this.f6285a.m() ? this.f6285a.i() : null);
                        break;
                    }
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
                case -402149703:
                    if (e10.equals("dummy_with_tracking")) {
                        this.f6287c = new v();
                        break;
                    }
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
                case 95945896:
                    if (e10.equals("dummy")) {
                        this.f6287c = new u();
                        break;
                    }
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
                default:
                    this.f6287c = new o(this.f6285a.i(), this.f6285a.c(), this.f6285a.d(), this.f6285a.l());
                    break;
            }
        }
        return this.f6287c;
    }

    public B c() {
        if (this.f6288d == null) {
            try {
                this.f6288d = (B) BufferMemoryChunkPool.class.getConstructor(G6.d.class, M.class, N.class).newInstance(this.f6285a.i(), this.f6285a.g(), this.f6285a.h());
            } catch (ClassNotFoundException unused) {
                this.f6288d = null;
            } catch (IllegalAccessException unused2) {
                this.f6288d = null;
            } catch (InstantiationException unused3) {
                this.f6288d = null;
            } catch (NoSuchMethodException unused4) {
                this.f6288d = null;
            } catch (InvocationTargetException unused5) {
                this.f6288d = null;
            }
        }
        return this.f6288d;
    }

    public w d() {
        if (this.f6289e == null) {
            this.f6289e = new w(this.f6285a.i(), this.f6285a.f());
        }
        return this.f6289e;
    }

    public int e() {
        return this.f6285a.f().f6300g;
    }

    public final B f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    public B g() {
        if (this.f6290f == null) {
            try {
                this.f6290f = (B) NativeMemoryChunkPool.class.getConstructor(G6.d.class, M.class, N.class).newInstance(this.f6285a.i(), this.f6285a.g(), this.f6285a.h());
            } catch (ClassNotFoundException e10) {
                E6.a.n("PoolFactory", "", e10);
                this.f6290f = null;
            } catch (IllegalAccessException e11) {
                E6.a.n("PoolFactory", "", e11);
                this.f6290f = null;
            } catch (InstantiationException e12) {
                E6.a.n("PoolFactory", "", e12);
                this.f6290f = null;
            } catch (NoSuchMethodException e13) {
                E6.a.n("PoolFactory", "", e13);
                this.f6290f = null;
            } catch (InvocationTargetException e14) {
                E6.a.n("PoolFactory", "", e14);
                this.f6290f = null;
            }
        }
        return this.f6290f;
    }

    public G6.i h() {
        return i(!C7.z.a() ? 1 : 0);
    }

    public G6.i i(int i10) {
        if (this.f6291g == null) {
            B f10 = f(i10);
            D6.k.h(f10, "failed to get pool for chunk type: " + i10);
            this.f6291g = new E(f10, j());
        }
        return this.f6291g;
    }

    public G6.l j() {
        if (this.f6292h == null) {
            this.f6292h = new G6.l(k());
        }
        return this.f6292h;
    }

    public G6.a k() {
        if (this.f6293i == null) {
            this.f6293i = new x(this.f6285a.i(), this.f6285a.j(), this.f6285a.k());
        }
        return this.f6293i;
    }
}

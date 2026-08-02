package s3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayDeque;
import s3.e;
import s3.f;
import s3.g;

/* loaded from: classes8.dex */
public abstract class h<I extends f, O extends g, E extends e> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f98191a;

    /* renamed from: e, reason: collision with root package name */
    private final I[] f98195e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f98196f;

    /* renamed from: g, reason: collision with root package name */
    private int f98197g;

    /* renamed from: h, reason: collision with root package name */
    private int f98198h;

    /* renamed from: i, reason: collision with root package name */
    private I f98199i;

    /* renamed from: j, reason: collision with root package name */
    private E f98200j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f98201k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f98202l;

    /* renamed from: b, reason: collision with root package name */
    private final Object f98192b = new Object();

    /* renamed from: m, reason: collision with root package name */
    private long f98203m = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f98193c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f98194d = new ArrayDeque<>();

    final class a extends Thread {
        a() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            h.g(h.this);
        }
    }

    protected h(I[] iArr, O[] oArr) {
        this.f98195e = iArr;
        this.f98197g = iArr.length;
        for (int i11 = 0; i11 < this.f98197g; i11++) {
            this.f98195e[i11] = h();
        }
        this.f98196f = oArr;
        this.f98198h = oArr.length;
        for (int i12 = 0; i12 < this.f98198h; i12++) {
            this.f98196f[i12] = i();
        }
        a aVar = new a();
        this.f98191a = aVar;
        aVar.start();
    }

    static void g(h hVar) {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (hVar.l());
    }

    private boolean l() throws InterruptedException {
        boolean z11;
        E j11;
        synchronized (this.f98192b) {
            while (!this.f98202l) {
                try {
                    if (!this.f98193c.isEmpty() && this.f98198h > 0) {
                        break;
                    }
                    this.f98192b.wait();
                } finally {
                }
            }
            if (this.f98202l) {
                return false;
            }
            I removeFirst = this.f98193c.removeFirst();
            O[] oArr = this.f98196f;
            int i11 = this.f98198h - 1;
            this.f98198h = i11;
            O o11 = oArr[i11];
            boolean z12 = this.f98201k;
            this.f98201k = false;
            if (removeFirst.g(4)) {
                o11.e(4);
            } else {
                o11.f98189b = removeFirst.f98186f;
                if (removeFirst.g(134217728)) {
                    o11.e(134217728);
                }
                long j12 = removeFirst.f98186f;
                synchronized (this.f98192b) {
                    long j13 = this.f98203m;
                    if (j13 != -9223372036854775807L && j12 < j13) {
                        z11 = false;
                    }
                    z11 = true;
                }
                if (!z11) {
                    o11.f98190c = true;
                }
                try {
                    j11 = k(removeFirst, o11, z12);
                } catch (OutOfMemoryError e11) {
                    j11 = j(e11);
                } catch (RuntimeException e12) {
                    j11 = j(e12);
                }
                if (j11 != null) {
                    synchronized (this.f98192b) {
                        this.f98200j = j11;
                    }
                    return false;
                }
            }
            synchronized (this.f98192b) {
                try {
                    if (this.f98201k) {
                        o11.n();
                    } else if (o11.f98190c) {
                        o11.n();
                    } else {
                        this.f98194d.addLast(o11);
                    }
                    removeFirst.f();
                    int i12 = this.f98197g;
                    this.f98197g = i12 + 1;
                    this.f98195e[i12] = removeFirst;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // s3.d
    public final void a(long j11) {
        boolean z11;
        synchronized (this.f98192b) {
            try {
                if (this.f98197g != this.f98195e.length && !this.f98201k) {
                    z11 = false;
                    G10.a.h(z11);
                    this.f98203m = j11;
                }
                z11 = true;
                G10.a.h(z11);
                this.f98203m = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s3.d
    public final Object b() throws e {
        I i11;
        synchronized (this.f98192b) {
            try {
                E e11 = this.f98200j;
                if (e11 != null) {
                    throw e11;
                }
                G10.a.h(this.f98199i == null);
                int i12 = this.f98197g;
                if (i12 == 0) {
                    i11 = null;
                } else {
                    I[] iArr = this.f98195e;
                    int i13 = i12 - 1;
                    this.f98197g = i13;
                    i11 = iArr[i13];
                }
                this.f98199i = i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // s3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(I i11) throws e {
        synchronized (this.f98192b) {
            try {
                E e11 = this.f98200j;
                if (e11 != null) {
                    throw e11;
                }
                G10.a.c(i11 == this.f98199i);
                this.f98193c.addLast(i11);
                if (!this.f98193c.isEmpty() && this.f98198h > 0) {
                    this.f98192b.notify();
                }
                this.f98199i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s3.d
    public final void flush() {
        synchronized (this.f98192b) {
            try {
                this.f98201k = true;
                I i11 = this.f98199i;
                if (i11 != null) {
                    i11.f();
                    int i12 = this.f98197g;
                    this.f98197g = i12 + 1;
                    this.f98195e[i12] = i11;
                    this.f98199i = null;
                }
                while (!this.f98193c.isEmpty()) {
                    I removeFirst = this.f98193c.removeFirst();
                    removeFirst.f();
                    int i13 = this.f98197g;
                    this.f98197g = i13 + 1;
                    this.f98195e[i13] = removeFirst;
                }
                while (!this.f98194d.isEmpty()) {
                    this.f98194d.removeFirst().n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract I h();

    protected abstract O i();

    protected abstract E j(Throwable th2);

    protected abstract E k(I i11, O o11, boolean z11);

    public /* bridge */ /* synthetic */ A3.e m() throws A3.d {
        return (A3.e) e();
    }

    @Override // s3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final O e() throws e {
        synchronized (this.f98192b) {
            try {
                E e11 = this.f98200j;
                if (e11 != null) {
                    throw e11;
                }
                if (this.f98194d.isEmpty()) {
                    return null;
                }
                return this.f98194d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(O o11) {
        synchronized (this.f98192b) {
            o11.f();
            int i11 = this.f98198h;
            this.f98198h = i11 + 1;
            this.f98196f[i11] = o11;
            if (!this.f98193c.isEmpty() && this.f98198h > 0) {
                this.f98192b.notify();
            }
        }
    }

    protected final void p() {
        int i11 = this.f98197g;
        I[] iArr = this.f98195e;
        G10.a.h(i11 == iArr.length);
        for (I i12 : iArr) {
            i12.o(UserVerificationMethods.USER_VERIFY_ALL);
        }
    }

    @Override // s3.d
    public final void release() {
        synchronized (this.f98192b) {
            this.f98202l = true;
            this.f98192b.notify();
        }
        try {
            this.f98191a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

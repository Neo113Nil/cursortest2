package nh;

import androidx.appcompat.app.t0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y implements Socket {

    /* renamed from: a, reason: collision with root package name */
    public final int f21033a;

    /* renamed from: b, reason: collision with root package name */
    public final q f21034b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f21035c;

    /* renamed from: d, reason: collision with root package name */
    public long f21036d;

    /* renamed from: e, reason: collision with root package name */
    public long f21037e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f21038f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21039g;

    /* renamed from: h, reason: collision with root package name */
    public final w f21040h;

    /* renamed from: i, reason: collision with root package name */
    public final v f21041i;
    public final x j;

    /* renamed from: k, reason: collision with root package name */
    public final x f21042k;

    /* renamed from: l, reason: collision with root package name */
    public b f21043l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f21044m;

    public y(int i5, q connection, boolean z5, boolean z7, Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f21033a = i5;
        this.f21034b = connection;
        this.f21035c = new t0(i5);
        this.f21037e = connection.f20996r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f21038f = arrayDeque;
        this.f21040h = new w(this, connection.q.a(), z7);
        this.f21041i = new v(this, z5);
        this.j = new x(this);
        this.f21042k = new x(this);
        if (headers == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    public final void a() {
        boolean z5;
        boolean h10;
        TimeZone timeZone = hh.g.f10825a;
        synchronized (this) {
            try {
                w wVar = this.f21040h;
                if (!wVar.f21027b && wVar.f21030e) {
                    v vVar = this.f21041i;
                    if (!vVar.f21022a) {
                        if (vVar.f21024c) {
                        }
                    }
                    z5 = true;
                    h10 = h();
                    Unit unit = Unit.f19194a;
                }
                z5 = false;
                h10 = h();
                Unit unit2 = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            c(b.f20921h, null);
        } else {
            if (h10) {
                return;
            }
            this.f21034b.r(this.f21033a);
        }
    }

    public final void b() {
        v vVar = this.f21041i;
        if (vVar.f21024c) {
            throw new IOException("stream closed");
        }
        if (vVar.f21022a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f21044m;
            if (iOException != null) {
                throw iOException;
            }
            b f6 = f();
            Intrinsics.checkNotNull(f6);
            throw new d0(f6);
        }
    }

    public final void c(b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            q qVar = this.f21034b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            qVar.f21001w.y(this.f21033a, statusCode);
        }
    }

    @Override // okio.Socket
    public final void cancel() {
        e(b.f20921h);
    }

    public final boolean d(b bVar, IOException iOException) {
        TimeZone timeZone = hh.g.f10825a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f21043l = bVar;
            this.f21044m = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f21040h.f21027b && this.f21041i.f21022a) {
                return false;
            }
            Unit unit = Unit.f19194a;
            this.f21034b.r(this.f21033a);
            return true;
        }
    }

    public final void e(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f21034b.z(this.f21033a, errorCode);
        }
    }

    public final b f() {
        b bVar;
        synchronized (this) {
            bVar = this.f21043l;
        }
        return bVar;
    }

    public final boolean g() {
        boolean z5 = (this.f21033a & 1) == 1;
        this.f21034b.getClass();
        return true == z5;
    }

    @Override // okio.Socket
    public final Sink getSink() {
        return this.f21041i;
    }

    @Override // okio.Socket
    public final Source getSource() {
        return this.f21040h;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                w wVar = this.f21040h;
                if (!wVar.f21027b) {
                    if (wVar.f21030e) {
                    }
                    return true;
                }
                v vVar = this.f21041i;
                if (vVar.f21022a || vVar.f21024c) {
                    if (this.f21039g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Headers headers, boolean z5) {
        boolean h10;
        Intrinsics.checkNotNullParameter(headers, "headers");
        TimeZone timeZone = hh.g.f10825a;
        synchronized (this) {
            try {
                if (this.f21039g && headers.get(":status") == null && headers.get(":method") == null) {
                    this.f21040h.getClass();
                    if (z5) {
                        this.f21040h.f21027b = true;
                    }
                    h10 = h();
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                    Unit unit = Unit.f19194a;
                }
                this.f21039g = true;
                this.f21038f.add(headers);
                if (z5) {
                }
                h10 = h();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit2 = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (h10) {
            return;
        }
        this.f21034b.r(this.f21033a);
    }

    public final void j(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (f() == null) {
                    this.f21043l = errorCode;
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

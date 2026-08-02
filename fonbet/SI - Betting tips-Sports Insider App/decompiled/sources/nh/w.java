package nh;

import androidx.appcompat.app.t0;
import java.io.IOException;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w implements Source {

    /* renamed from: a, reason: collision with root package name */
    public final long f21026a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21027b;

    /* renamed from: c, reason: collision with root package name */
    public final Buffer f21028c = new Buffer();

    /* renamed from: d, reason: collision with root package name */
    public final Buffer f21029d = new Buffer();

    /* renamed from: e, reason: collision with root package name */
    public boolean f21030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f21031f;

    public w(y yVar, long j, boolean z5) {
        this.f21031f = yVar;
        this.f21026a = j;
        this.f21027b = z5;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        y yVar = this.f21031f;
        synchronized (yVar) {
            this.f21030e = true;
            size = this.f21029d.size();
            this.f21029d.clear();
            Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type java.lang.Object");
            yVar.notifyAll();
            Unit unit = Unit.f19194a;
        }
        if (size > 0) {
            y yVar2 = this.f21031f;
            TimeZone timeZone = hh.g.f10825a;
            yVar2.f21034b.w(size);
        }
        this.f21031f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x0021, B:13:0x002b, B:33:0x00b9, B:34:0x00be, B:61:0x00ef, B:62:0x00f4, B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0063, B:28:0x0084, B:30:0x0093, B:47:0x00a9, B:50:0x00af, B:54:0x00e5, B:55:0x00ec), top: B:5:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0063, B:28:0x0084, B:30:0x0093, B:47:0x00a9, B:50:0x00af, B:54:0x00e5, B:55:0x00ec), top: B:14:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[SYNTHETIC] */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(Buffer sink, long j) {
        boolean z5;
        boolean z7;
        Throwable th2;
        long j6;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(d9.e.g(j, "byteCount < 0: ").toString());
        }
        while (true) {
            y yVar = this.f21031f;
            synchronized (yVar) {
                yVar.f21034b.getClass();
                v vVar = yVar.f21041i;
                z5 = true;
                try {
                    if (!vVar.f21024c && !vVar.f21022a) {
                        z7 = false;
                        if (z7) {
                            yVar.j.enter();
                        }
                        if (yVar.f() != null || this.f21027b) {
                            th2 = null;
                        } else {
                            th2 = yVar.f21044m;
                            if (th2 == null) {
                                b f6 = yVar.f();
                                Intrinsics.checkNotNull(f6);
                                th2 = new d0(f6);
                            }
                        }
                        if (!this.f21030e) {
                            throw new IOException("stream closed");
                        }
                        if (this.f21029d.size() > j10) {
                            Buffer buffer = this.f21029d;
                            j6 = buffer.read(sink, Math.min(j, buffer.size()));
                            t0.c(yVar.f21035c, j6, 0L, 2);
                            long b10 = yVar.f21035c.b();
                            if (th2 == null && b10 >= yVar.f21034b.q.a() / 2) {
                                yVar.f21034b.C(yVar.f21033a, b10);
                                t0.c(yVar.f21035c, 0L, b10, 1);
                            }
                            z5 = false;
                        } else {
                            if (this.f21027b || th2 != null) {
                                z5 = false;
                            } else {
                                yVar.k();
                            }
                            j6 = -1;
                        }
                        Unit unit = Unit.f19194a;
                    }
                    if (yVar.f() != null) {
                    }
                    th2 = null;
                    if (!this.f21030e) {
                    }
                } finally {
                    if (z7) {
                        yVar.j.a();
                    }
                }
                z7 = true;
                if (z7) {
                }
            }
            y yVar2 = this.f21031f;
            c cVar = yVar2.f21034b.f20995p;
            t0 windowCounter = yVar2.f21035c;
            this.f21029d.size();
            cVar.getClass();
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
            if (!z5) {
                if (j6 != -1) {
                    return j6;
                }
                if (th2 == null) {
                    return -1L;
                }
                throw th2;
            }
            j10 = 0;
        }
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f21031f.j;
    }
}

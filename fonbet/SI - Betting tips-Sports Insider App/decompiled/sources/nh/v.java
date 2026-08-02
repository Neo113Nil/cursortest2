package nh;

import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v implements Sink {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21022a;

    /* renamed from: b, reason: collision with root package name */
    public final Buffer f21023b = new Buffer();

    /* renamed from: c, reason: collision with root package name */
    public boolean f21024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f21025d;

    public v(y yVar, boolean z5) {
        this.f21025d = yVar;
        this.f21022a = z5;
    }

    /* JADX WARN: Finally extract failed */
    public final void c(boolean z5) {
        long min;
        boolean z7;
        y yVar = this.f21025d;
        synchronized (yVar) {
            try {
                yVar.f21042k.enter();
                while (yVar.f21036d >= yVar.f21037e && !this.f21022a && !this.f21024c && yVar.f() == null) {
                    try {
                        yVar.k();
                    } catch (Throwable th2) {
                        yVar.f21042k.a();
                        throw th2;
                    }
                }
                yVar.f21042k.a();
                yVar.b();
                min = Math.min(yVar.f21037e - yVar.f21036d, this.f21023b.size());
                yVar.f21036d += min;
                z7 = z5 && min == this.f21023b.size();
                Unit unit = Unit.f19194a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f21025d.f21042k.enter();
        try {
            y yVar2 = this.f21025d;
            yVar2.f21034b.y(yVar2.f21033a, z7, this.f21023b, min);
        } finally {
            this.f21025d.f21042k.a();
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f21025d;
        TimeZone timeZone = hh.g.f10825a;
        synchronized (yVar) {
            if (this.f21024c) {
                return;
            }
            boolean z5 = yVar.f() == null;
            Unit unit = Unit.f19194a;
            if (!this.f21025d.f21041i.f21022a) {
                if (this.f21023b.size() > 0) {
                    while (this.f21023b.size() > 0) {
                        c(true);
                    }
                } else if (z5) {
                    y yVar2 = this.f21025d;
                    yVar2.f21034b.y(yVar2.f21033a, true, null, 0L);
                }
            }
            y yVar3 = this.f21025d;
            synchronized (yVar3) {
                this.f21024c = true;
                Intrinsics.checkNotNull(yVar3, "null cannot be cast to non-null type java.lang.Object");
                yVar3.notifyAll();
                Unit unit2 = Unit.f19194a;
            }
            this.f21025d.f21034b.f21001w.flush();
            this.f21025d.a();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        y yVar = this.f21025d;
        TimeZone timeZone = hh.g.f10825a;
        synchronized (yVar) {
            yVar.b();
            Unit unit = Unit.f19194a;
        }
        while (this.f21023b.size() > 0) {
            c(false);
            this.f21025d.f21034b.f21001w.flush();
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f21025d.f21042k;
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        TimeZone timeZone = hh.g.f10825a;
        Buffer buffer = this.f21023b;
        buffer.write(source, j);
        while (buffer.size() >= 16384) {
            c(false);
        }
    }
}

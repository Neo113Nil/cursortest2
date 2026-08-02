package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fod implements fy2 {
    public final e3c a;
    public final Executor b;
    public final e3c c;
    public final ScheduledExecutorService d;
    public final SSLSocketFactory e;
    public final hk3 f;
    public final int g;
    public final boolean h;
    public final bm0 i;
    public final long j;
    public final int k;
    public final int l;
    public boolean m;

    public fod(e3c e3cVar, e3c e3cVar2, SSLSocketFactory sSLSocketFactory, hk3 hk3Var, int i, boolean z, long j, long j2, int i2, int i3, omf omfVar) {
        this.a = e3cVar;
        this.b = (Executor) neh.a((meh) e3cVar.b);
        this.c = e3cVar2;
        this.d = (ScheduledExecutorService) neh.a((meh) e3cVar2.b);
        this.e = sSLSocketFactory;
        this.f = hk3Var;
        this.g = i;
        this.h = z;
        this.i = new bm0(j);
        this.j = j2;
        this.k = i2;
        this.l = i3;
        z1a.y(omfVar, "transportTracerFactory");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        this.m = true;
        neh.b((meh) this.a.b, this.b);
        neh.b((meh) this.c.b, this.d);
    }

    @Override // defpackage.fy2
    public final xj3 d0(SocketAddress socketAddress, ey2 ey2Var, s8a s8aVar) {
        if (this.m) {
            a70.r("The transport factory is closed.");
            return null;
        }
        bm0 bm0Var = this.i;
        long j = bm0Var.a.get();
        ood oodVar = new ood(this, (InetSocketAddress) socketAddress, ey2Var.a, ey2Var.b, ey2Var.c, new kac(new am0(bm0Var, j, 0), 3));
        if (this.h) {
            oodVar.G = true;
            oodVar.H = j;
            oodVar.I = this.j;
        }
        return oodVar;
    }
}

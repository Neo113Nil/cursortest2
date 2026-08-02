package defpackage;

import java.net.SocketAddress;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eh2 implements fy2 {
    public final fod a;

    public eh2(fod fodVar, irb irbVar) {
        this.a = fodVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fy2
    public final xj3 d0(SocketAddress socketAddress, ey2 ey2Var, s8a s8aVar) {
        return new dh2(this, this.a.d0(socketAddress, ey2Var, s8aVar), ey2Var.a);
    }
}

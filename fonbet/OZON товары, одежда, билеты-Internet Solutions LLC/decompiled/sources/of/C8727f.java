package of;

import bf.AbstractC5657a;
import java.io.Closeable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: of.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8727f extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8724c f78309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8727f(String str, C8724c c8724c) {
        super(str, false);
        this.f78309e = c8724c;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        ServerSocket closeQuietly;
        C8724c c8724c = this.f78309e;
        try {
            C8724c.f78281p.fine(c8724c + " starting to accept connections");
            C8724c.E0(c8724c);
        } catch (Throwable th2) {
            C8724c.f78281p.log(Level.WARNING, c8724c + " failed unexpectedly", th2);
        }
        closeQuietly = c8724c.f78290j;
        if (closeQuietly != null) {
            byte[] bArr = Ye.b.f34900a;
            Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
            try {
                closeQuietly.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
        Iterator it = c8724c.f78285e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "openClientSocket.next()");
            Ye.b.f((Socket) next);
            it.remove();
        }
        Iterator it2 = c8724c.f78286f.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "httpConnection.next()");
            Ye.b.e((Closeable) next2);
            it2.remove();
        }
        c8724c.u1().d();
        return -1L;
    }
}

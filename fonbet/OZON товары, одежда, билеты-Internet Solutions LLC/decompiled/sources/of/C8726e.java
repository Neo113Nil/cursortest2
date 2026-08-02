package of;

import bf.AbstractC5657a;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import of.C8724c;

/* renamed from: of.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8726e extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8724c f78307e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Socket f78308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8726e(String str, C8724c c8724c, Socket socket) {
        super(str, false);
        this.f78307e = c8724c;
        this.f78308f = socket;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        Socket socket = this.f78308f;
        C8724c c8724c = this.f78307e;
        try {
            new C8724c.C1326c(c8724c, socket).a();
            return -1L;
        } catch (IOException e11) {
            C8724c.f78281p.fine(c8724c + " connection from " + socket.getInetAddress() + " failed: " + e11);
            return -1L;
        } catch (Exception e12) {
            C8724c.f78281p.log(Level.SEVERE, c8724c + " connection from " + socket.getInetAddress() + " crashed", (Throwable) e12);
            return -1L;
        }
    }
}

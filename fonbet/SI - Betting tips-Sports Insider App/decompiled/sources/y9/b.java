package y9;

import com.logrocket.protobuf.p;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;
import wg.q;
import wg.r;
import wg.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f25740a;

    /* renamed from: b, reason: collision with root package name */
    public int f25741b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25742c = false;

    public b(a aVar) {
        this.f25740a = aVar;
    }

    public static byte[] e(q qVar) {
        r q = s.q();
        q.d();
        s.p((s) q.f6816b, qVar);
        s sVar = (s) q.a();
        try {
            int b10 = sVar.b(null);
            byte[] bArr = new byte[b10];
            Logger logger = p.f6773d;
            com.logrocket.protobuf.k kVar = new com.logrocket.protobuf.k(bArr, 0, b10);
            sVar.e(kVar);
            if (kVar.P() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(sVar.c("byte array"), e7);
        }
    }

    public final synchronized void a(q qVar) {
        if (this.f25742c) {
            throw new IOException("Events cannot be added to closed batches! This should never occur in the wild!");
        }
        g(qVar);
        this.f25741b++;
    }

    public abstract long b();

    public abstract void c();

    public void d() {
        this.f25742c = true;
    }

    public boolean f() {
        return this.f25742c;
    }

    public abstract void g(q qVar);

    public final void h(OutputStream outputStream) {
        if (!f()) {
            throw new IOException("Cannot transfer an open batch! This should not occur in the wild! " + this.f25740a.toString());
        }
        WritableByteChannel newChannel = Channels.newChannel(outputStream);
        try {
            i(newChannel);
            if (newChannel != null) {
                newChannel.close();
            }
        } catch (Throwable th2) {
            if (newChannel != null) {
                try {
                    newChannel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract void i(WritableByteChannel writableByteChannel);
}

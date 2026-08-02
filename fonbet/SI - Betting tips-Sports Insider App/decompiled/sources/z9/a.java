package z9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import kh.g;
import wg.q;
import y9.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: d, reason: collision with root package name */
    public final File f25885d;

    /* renamed from: e, reason: collision with root package name */
    public final File f25886e;

    /* renamed from: f, reason: collision with root package name */
    public final g f25887f;

    /* renamed from: g, reason: collision with root package name */
    public FileChannel f25888g;

    public a(y9.a aVar, File file, File file2, g gVar) {
        super(aVar);
        this.f25885d = file;
        this.f25886e = file2;
        this.f25887f = gVar;
    }

    @Override // y9.b
    public final long b() {
        return this.f25885d.length();
    }

    @Override // y9.b
    public final void c() {
        d();
        File file = this.f25885d;
        g gVar = this.f25887f;
        gVar.o(file);
        gVar.o(this.f25886e);
    }

    @Override // y9.b
    public final void d() {
        this.f25742c = true;
        FileChannel fileChannel = this.f25888g;
        if (fileChannel != null) {
            fileChannel.close();
            this.f25888g = null;
        }
    }

    @Override // y9.b
    public final void g(q qVar) {
        if (this.f25888g == null) {
            this.f25888g = new FileOutputStream(this.f25885d.getAbsolutePath()).getChannel();
        }
        if (!this.f25888g.isOpen()) {
            throw new IOException("Batch has been closed and will not accept more events.");
        }
        this.f25888g.write(ByteBuffer.wrap(b.e(qVar)));
    }

    @Override // y9.b
    public final void i(WritableByteChannel writableByteChannel) {
        FileInputStream fileInputStream = new FileInputStream(this.f25885d.getAbsolutePath());
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4096);
                while (true) {
                    if (channel.read(allocateDirect) == -1 && allocateDirect.position() <= 0) {
                        channel.close();
                        fileInputStream.close();
                        return;
                    } else {
                        allocateDirect.flip();
                        writableByteChannel.write(allocateDirect);
                        allocateDirect.compact();
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

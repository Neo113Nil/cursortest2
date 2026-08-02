package y9;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import wg.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public final ByteArrayOutputStream f25748d;

    public e(a aVar) {
        super(aVar);
        this.f25748d = new ByteArrayOutputStream();
    }

    @Override // y9.b
    public final long b() {
        return this.f25748d.size();
    }

    @Override // y9.b
    public final void g(q qVar) {
        this.f25748d.write(b.e(qVar));
    }

    @Override // y9.b
    public final void i(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(ByteBuffer.wrap(this.f25748d.toByteArray()));
    }

    @Override // y9.b
    public final void c() {
    }
}

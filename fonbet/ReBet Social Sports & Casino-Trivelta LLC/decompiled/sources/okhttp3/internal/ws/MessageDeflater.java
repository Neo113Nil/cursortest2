package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ti.C6478h;
import ti.E;
import ti.k;
import ti.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lti/h;", "Lti/k;", "suffix", "endsWith", "(Lti/h;Lti/k;)Z", "buffer", "", "deflate", "(Lti/h;)V", "close", "()V", "Z", "deflatedBytes", "Lti/h;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lti/l;", "deflaterSink", "Lti/l;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageDeflater implements Closeable {

    @NotNull
    private final C6478h deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final l deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        C6478h c6478h = new C6478h();
        this.deflatedBytes = c6478h;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new l((E) c6478h, deflater);
    }

    private final boolean endsWith(C6478h c6478h, k kVar) {
        return c6478h.b1(c6478h.size() - kVar.u(), kVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull C6478h buffer) {
        k kVar;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        C6478h c6478h = this.deflatedBytes;
        kVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(c6478h, kVar)) {
            long size = this.deflatedBytes.size() - 4;
            C6478h.a Y12 = C6478h.Y1(this.deflatedBytes, null, 1, null);
            try {
                Y12.r(size);
                CloseableKt.closeFinally(Y12, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C6478h c6478h2 = this.deflatedBytes;
        buffer.write(c6478h2, c6478h2.size());
    }
}

package defpackage;

import com.google.protobuf.t;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f03 extends t {
    public final ByteBuffer e;
    public final int f;

    public f03(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    @Override // com.google.protobuf.t, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.e.position(getTotalBytesWritten() + this.f);
    }
}

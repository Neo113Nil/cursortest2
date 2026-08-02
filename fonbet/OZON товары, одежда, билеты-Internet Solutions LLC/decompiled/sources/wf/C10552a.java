package wf;

import java.nio.ByteBuffer;
import org.chromium.net.A;
import org.chromium.net.h;

/* renamed from: wf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10552a {

    /* renamed from: wf.a$a, reason: collision with other inner class name */
    private static final class C2258a extends A {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f104497a;

        C2258a(ByteBuffer byteBuffer) {
            this.f104497a = byteBuffer;
        }

        @Override // org.chromium.net.A
        public final long c() {
            return this.f104497a.limit();
        }

        @Override // org.chromium.net.A
        public final void d(h hVar, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f104497a;
            if (remaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
            } else {
                int limit = byteBuffer2.limit();
                byteBuffer.put(byteBuffer2);
            }
            hVar.a();
        }

        @Override // org.chromium.net.A
        public final void j(h hVar) {
            hVar.c();
        }
    }

    public static A a(byte[] bArr) {
        return new C2258a(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }
}

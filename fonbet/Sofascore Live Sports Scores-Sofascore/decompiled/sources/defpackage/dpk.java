package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dpk implements hvd, zkn {
    public final ByteBuffer a;

    public dpk() {
        this.a = ByteBuffer.allocate(8);
    }

    @Override // defpackage.zkn
    public void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // defpackage.hvd
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.zkn
    public long zza() {
        return this.a.capacity();
    }

    public dpk(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }
}

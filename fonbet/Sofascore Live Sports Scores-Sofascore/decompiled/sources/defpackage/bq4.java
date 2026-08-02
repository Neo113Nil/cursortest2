package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bq4 implements dq4, hvd {
    public final ByteBuffer a;

    public bq4() {
        this.a = ByteBuffer.allocate(4);
    }

    @Override // defpackage.dq4
    public int d() {
        return j() | (j() << 8);
    }

    @Override // defpackage.hvd
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.dq4
    public int i(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.a;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.dq4
    public short j() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        throw new cq4();
    }

    @Override // defpackage.dq4
    public long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public bq4(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}

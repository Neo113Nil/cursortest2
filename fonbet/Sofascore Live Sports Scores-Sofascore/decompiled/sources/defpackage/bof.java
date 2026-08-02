package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bof extends f7 {
    public int a;
    public final int b;
    public final byte[] c;
    public int d = -1;

    public bof(byte[] bArr, int i, int i2) {
        z1a.r("offset must be >= 0", i >= 0);
        z1a.r("length must be >= 0", i2 >= 0);
        int i3 = i2 + i;
        z1a.r("offset + length exceeds array boundary", i3 <= bArr.length);
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.f7
    public final int C() {
        e(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // defpackage.f7
    public final int H() {
        return this.b - this.a;
    }

    @Override // defpackage.f7
    public final void M(int i) {
        e(i);
        this.a += i;
    }

    @Override // defpackage.f7
    public final void h() {
        this.d = this.a;
    }

    @Override // defpackage.f7
    public final f7 m(int i) {
        e(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new bof(this.c, i2, i);
    }

    @Override // defpackage.f7
    public final void n(OutputStream outputStream, int i) {
        e(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.f7
    public final void p(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        e(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.f7
    public final void reset() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.f7
    public final void t(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }
}

package defpackage;

import com.google.protobuf.Internal;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hca extends InputStream {
    public final Iterator a;
    public ByteBuffer b;
    public final int c = 0;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public int h;
    public long i;

    public hca(Iterable iterable) {
        this.a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.c++;
        }
        this.d = -1;
        if (h()) {
            return;
        }
        this.b = Internal.EMPTY_BYTE_BUFFER;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    public final boolean h() {
        this.d++;
        Iterator it = this.a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.b = byteBuffer;
        this.e = byteBuffer.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.i = uck.a(this.b);
            this.g = null;
        }
        return true;
    }

    public final void i(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.b.limit()) {
            h();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == this.c) {
            return -1;
        }
        int limit = this.b.limit();
        int i3 = this.e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            i(i2);
            return i2;
        }
        int position = this.b.position();
        this.b.position(this.e);
        this.b.get(bArr, i, i2);
        this.b.position(position);
        i(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            int i = this.g[this.e + this.h] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            i(1);
            return i;
        }
        int d = uck.c.d(this.e + this.i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        i(1);
        return d;
    }
}

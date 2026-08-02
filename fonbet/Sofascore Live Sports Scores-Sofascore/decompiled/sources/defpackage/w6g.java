package defpackage;

import com.google.protobuf.h2;
import com.google.protobuf.l;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w6g extends InputStream {
    public v6g a;
    public l b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final /* synthetic */ h2 g;

    public w6g(h2 h2Var) {
        this.g = h2Var;
        v6g v6gVar = new v6g(h2Var);
        this.a = v6gVar;
        l a = v6gVar.a();
        this.b = a;
        this.c = a.size();
        this.d = 0;
        this.e = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.g.a - (this.e + this.d);
    }

    public final void h() {
        if (this.b != null) {
            int i = this.d;
            int i2 = this.c;
            if (i == i2) {
                this.e += i2;
                this.d = 0;
                if (!this.a.hasNext()) {
                    this.b = null;
                    this.c = 0;
                } else {
                    l a = this.a.a();
                    this.b = a;
                    this.c = a.size();
                }
            }
        }
    }

    public final int i(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            h();
            if (this.b == null) {
                break;
            }
            int min = Math.min(this.c - this.d, i3);
            if (bArr != null) {
                this.b.copyTo(bArr, this.d, i, min);
                i += min;
            }
            this.d += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f = this.e + this.d;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i(bArr, i, i2);
        if (i3 == 0) {
            if (i2 > 0) {
                return -1;
            }
            if (this.g.a - (this.e + this.d) == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        v6g v6gVar = new v6g(this.g);
        this.a = v6gVar;
        l a = v6gVar.a();
        this.b = a;
        this.c = a.size();
        this.d = 0;
        this.e = 0;
        i(null, 0, this.f);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return i(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public final int read() {
        h();
        l lVar = this.b;
        if (lVar == null) {
            return -1;
        }
        int i = this.d;
        this.d = i + 1;
        return lVar.byteAt(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}

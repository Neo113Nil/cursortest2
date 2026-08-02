package defpackage;

import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzmu;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oy1 extends InputStream {
    public final /* synthetic */ int a;
    public final Object b;

    public oy1(zcd zcdVar) {
        this.a = 3;
        this.b = zcdVar.a.slice();
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return (int) Math.min(((x52) obj).b, 2147483647L);
            case 2:
                return ((oy1) obj).available();
            case 3:
                return ((ByteBuffer) obj).remaining();
            case 4:
                lof lofVar = (lof) obj;
                if (!lofVar.c) {
                    return (int) Math.min(lofVar.b.b, 2147483647L);
                }
                is8.e("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fkf.y((db2) obj);
                break;
            case 1:
                break;
            case 2:
                super.close();
                ((oy1) obj).close();
                break;
            case 3:
            default:
                super.close();
                break;
            case 4:
                ((lof) obj).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        switch (this.a) {
            case 3:
                ((ByteBuffer) this.b).mark();
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.a) {
            case 3:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                db2 db2Var = (db2) obj;
                if (!db2Var.h()) {
                    if (db2Var.f().w()) {
                        ok3.J(new q3(db2Var, null, 12));
                    }
                    w52 f = db2Var.f();
                    f.getClass();
                    int e = db2Var.f().e(i, Math.min((int) f.c, i2) + i, bArr);
                    if (e >= 0) {
                        return e;
                    }
                    if (!db2Var.h()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                bArr.getClass();
                return ((x52) obj).read(bArr, i, i2);
            case 2:
                bArr.getClass();
                return ((oy1) obj).read(bArr, i, i2);
            case 3:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, min);
                return min;
            case 4:
                bArr.getClass();
                lof lofVar = (lof) obj;
                x52 x52Var = lofVar.b;
                if (lofVar.c) {
                    is8.e("closed");
                    return 0;
                }
                yqo.x(bArr.length, i, i2);
                if (x52Var.b == 0 && lofVar.a.read(x52Var, 8192L) == -1) {
                    return -1;
                }
                return x52Var.read(bArr, i, i2);
            case 5:
                Inflater inflater = ((zzmu) obj).a;
                try {
                    int inflate = inflater.inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    is8.e(x5n.n(new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length()), i2, "Read no bytes (requested up to ", remaining, ") but did not reach end of stream, had "));
                    return 0;
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            default:
                return ((zzacv) obj).f(i, i2, bArr);
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        switch (this.a) {
            case 3:
                try {
                    ((ByteBuffer) this.b).reset();
                    return;
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 6:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((zzacv) this.b).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return ((x52) obj) + ".inputStream()";
            case 4:
                return ((lof) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.a) {
            case 4:
                outputStream.getClass();
                lof lofVar = (lof) this.b;
                x52 x52Var = lofVar.b;
                if (lofVar.c) {
                    is8.e("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (x52Var.b == 0 && lofVar.a.read(x52Var, 8192L) == -1) {
                        return j;
                    }
                    long j2 = x52Var.b;
                    j += j2;
                    x52Var.e1(outputStream, j2);
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public oy1(zzmu zzmuVar, zzacv zzacvVar) {
        this.a = 6;
        this.b = zzacvVar;
    }

    public /* synthetic */ oy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void h() {
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                db2 db2Var = (db2) obj;
                if (db2Var.h()) {
                    return -1;
                }
                if (db2Var.f().w()) {
                    ok3.J(new q3(db2Var, null, 12));
                }
                if (db2Var.h()) {
                    return -1;
                }
                return db2Var.f().readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            case 1:
                x52 x52Var = (x52) obj;
                if (x52Var.b > 0) {
                    return x52Var.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            case 2:
                return ((oy1) obj).read();
            case 3:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            case 4:
                lof lofVar = (lof) obj;
                x52 x52Var2 = lofVar.b;
                if (lofVar.c) {
                    is8.e("closed");
                    return 0;
                }
                if (x52Var2.b == 0 && lofVar.a.read(x52Var2, 8192L) == -1) {
                    return -1;
                }
                return x52Var2.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            case 5:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((zzacv) obj).f(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}

package G6;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f3910a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3911b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f3911b.get(this.f3910a);
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f3910a);
                if (read == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, read);
                j10 += read;
            } finally {
                this.f3911b.release(bArr);
            }
        }
    }

    public l(a aVar, int i10) {
        D6.k.b(Boolean.valueOf(i10 > 0));
        this.f3910a = i10;
        this.f3911b = aVar;
    }
}

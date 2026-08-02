package gh;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e0 extends m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f10140f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f10141g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10142h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10143i;
    public static final byte[] j;

    /* renamed from: b, reason: collision with root package name */
    public final ByteString f10144b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10145c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10146d;

    /* renamed from: e, reason: collision with root package name */
    public long f10147e;

    static {
        Regex regex = b0.f10117d;
        f10140f = a0.a("multipart/mixed");
        a0.a("multipart/alternative");
        a0.a("multipart/digest");
        a0.a("multipart/parallel");
        f10141g = a0.a("multipart/form-data");
        f10142h = new byte[]{58, 32};
        f10143i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public e0(ByteString boundaryByteString, b0 type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f10144b = boundaryByteString;
        this.f10145c = parts;
        Regex regex = b0.f10117d;
        this.f10146d = a0.a(type + "; boundary=" + boundaryByteString.utf8());
        this.f10147e = -1L;
    }

    @Override // gh.m0
    public final long a() {
        long j6 = this.f10147e;
        if (j6 != -1) {
            return j6;
        }
        long e7 = e(null, true);
        this.f10147e = e7;
        return e7;
    }

    @Override // gh.m0
    public final b0 b() {
        return this.f10146d;
    }

    @Override // gh.m0
    public final boolean c() {
        List list = this.f10145c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((d0) it.next()).f10139b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e(sink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(BufferedSink bufferedSink, boolean z5) {
        Buffer buffer;
        BufferedSink bufferedSink2;
        if (z5) {
            bufferedSink2 = new Buffer();
            buffer = bufferedSink2;
        } else {
            buffer = 0;
            bufferedSink2 = bufferedSink;
        }
        List list = this.f10145c;
        int size = list.size();
        long j6 = 0;
        int i5 = 0;
        while (true) {
            ByteString byteString = this.f10144b;
            byte[] bArr = j;
            byte[] bArr2 = f10143i;
            if (i5 >= size) {
                Intrinsics.checkNotNull(bufferedSink2);
                bufferedSink2.write(bArr);
                bufferedSink2.write(byteString);
                bufferedSink2.write(bArr);
                bufferedSink2.write(bArr2);
                if (!z5) {
                    return j6;
                }
                Intrinsics.checkNotNull(buffer);
                long size2 = buffer.size() + j6;
                buffer.clear();
                return size2;
            }
            d0 d0Var = (d0) list.get(i5);
            Headers headers = d0Var.f10138a;
            m0 m0Var = d0Var.f10139b;
            Intrinsics.checkNotNull(bufferedSink2);
            bufferedSink2.write(bArr);
            bufferedSink2.write(byteString);
            bufferedSink2.write(bArr2);
            if (headers != null) {
                int size3 = headers.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    bufferedSink2.writeUtf8(headers.name(i10)).write(f10142h).writeUtf8(headers.value(i10)).write(bArr2);
                }
            }
            b0 b10 = m0Var.b();
            if (b10 != null) {
                bufferedSink2.writeUtf8("Content-Type: ").writeUtf8(b10.f10119a).write(bArr2);
            }
            long a7 = m0Var.a();
            if (a7 == -1 && z5) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            bufferedSink2.write(bArr2);
            if (z5) {
                j6 += a7;
            } else {
                m0Var.d(bufferedSink2);
            }
            bufferedSink2.write(bArr2);
            i5++;
        }
    }
}

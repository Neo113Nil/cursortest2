package j1;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f18236d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f18237a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.x f18238b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f18239c = 0;

    public u(com.google.firebase.messaging.x xVar, int i5) {
        this.f18238b = xVar;
        this.f18237a = i5;
    }

    public final int a(int i5) {
        k1.a b10 = b();
        int a7 = b10.a(16);
        if (a7 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.f1362d;
        int i10 = a7 + b10.f1359a;
        return byteBuffer.getInt((i5 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final k1.a b() {
        ThreadLocal threadLocal = f18236d;
        k1.a aVar = (k1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new k1.a();
            threadLocal.set(aVar);
        }
        k1.b bVar = (k1.b) this.f18238b.f6182a;
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i5 = a7 + bVar.f1359a;
            int i10 = (this.f18237a * 4) + ((ByteBuffer) bVar.f1362d).getInt(i5) + i5 + 4;
            int i11 = ((ByteBuffer) bVar.f1362d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1362d;
            aVar.f1362d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1359a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f1360b = i12;
                aVar.f1361c = ((ByteBuffer) aVar.f1362d).getShort(i12);
                return aVar;
            }
            aVar.f1359a = 0;
            aVar.f1360b = 0;
            aVar.f1361c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        k1.a b10 = b();
        int a7 = b10.a(4);
        sb2.append(Integer.toHexString(a7 != 0 ? ((ByteBuffer) b10.f1362d).getInt(a7 + b10.f1359a) : 0));
        sb2.append(", codepoints:");
        k1.a b11 = b();
        int a10 = b11.a(16);
        if (a10 != 0) {
            int i10 = a10 + b11.f1359a;
            i5 = ((ByteBuffer) b11.f1362d).getInt(((ByteBuffer) b11.f1362d).getInt(i10) + i10);
        } else {
            i5 = 0;
        }
        for (int i11 = 0; i11 < i5; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

package H1;

import b1.InterfaceC2358l;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface O {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4350a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4351b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4352c;
        public final byte[] encryptionKey;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f4350a = i10;
            this.encryptionKey = bArr;
            this.f4351b = i11;
            this.f4352c = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4350a == aVar.f4350a && this.f4351b == aVar.f4351b && this.f4352c == aVar.f4352c && Arrays.equals(this.encryptionKey, aVar.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f4350a * 31) + Arrays.hashCode(this.encryptionKey)) * 31) + this.f4351b) * 31) + this.f4352c;
        }
    }

    default void a(e1.J j10, int i10) {
        f(j10, i10, 0);
    }

    int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11);

    void c(androidx.media3.common.a aVar);

    default int e(InterfaceC2358l interfaceC2358l, int i10, boolean z10) {
        return b(interfaceC2358l, i10, z10, 0);
    }

    void f(e1.J j10, int i10, int i11);

    void g(long j10, int i10, int i11, int i12, a aVar);

    default void d(long j10) {
    }
}

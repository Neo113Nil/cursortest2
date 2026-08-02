package k3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import m3.N;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f70382a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f70383e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f70384a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70385b;

        /* renamed from: c, reason: collision with root package name */
        public final int f70386c;

        /* renamed from: d, reason: collision with root package name */
        public final int f70387d;

        public a(int i11, int i12, int i13) {
            this.f70384a = i11;
            this.f70385b = i12;
            this.f70386c = i13;
            this.f70387d = N.M(i13) ? N.u(i13) * i12 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f70384a == aVar.f70384a && this.f70385b == aVar.f70385b && this.f70386c == aVar.f70386c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f70384a), Integer.valueOf(this.f70385b), Integer.valueOf(this.f70386c));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f70384a);
            sb2.append(", channelCount=");
            sb2.append(this.f70385b);
            sb2.append(", encoding=");
            return Ek.a.d(sb2, this.f70386c, ']');
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    boolean a();

    void b(ByteBuffer byteBuffer);

    void c();

    ByteBuffer d();

    a e(a aVar) throws b;

    void flush();

    boolean isActive();

    void reset();
}

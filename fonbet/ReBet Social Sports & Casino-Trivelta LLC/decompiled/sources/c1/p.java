package c1;

import e1.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: classes.dex */
public interface p {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f26778a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f26779e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f26780a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26781b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26782c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26783d;

        public a(androidx.media3.common.a aVar) {
            this(aVar.f20519G, aVar.f20518F, aVar.f20520H);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26780a == aVar.f26780a && this.f26781b == aVar.f26781b && this.f26782c == aVar.f26782c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f26780a), Integer.valueOf(this.f26781b), Integer.valueOf(this.f26782c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f26780a + ", channelCount=" + this.f26781b + ", encoding=" + this.f26782c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f26780a = i10;
            this.f26781b = i11;
            this.f26782c = i12;
            this.f26783d = Z.O0(i12) ? Z.q0(i12, i11) : -1;
        }
    }

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final a f26784a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.f26784a = aVar;
        }
    }

    ByteBuffer a();

    boolean b();

    a c(a aVar);

    void d(ByteBuffer byteBuffer);

    void e();

    void flush();

    boolean isActive();

    void reset();

    default long f(long j10) {
        return j10;
    }
}

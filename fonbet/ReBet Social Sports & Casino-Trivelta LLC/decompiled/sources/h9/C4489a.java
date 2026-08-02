package h9;

import h9.f;
import java.util.Arrays;

/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4489a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f47827a;
    private final byte[] extras;

    /* renamed from: h9.a$b */
    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public Iterable f47828a;
        private byte[] extras;

        @Override // h9.f.a
        public f a() {
            String str = "";
            if (this.f47828a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C4489a(this.f47828a, this.extras);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h9.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f47828a = iterable;
            return this;
        }

        @Override // h9.f.a
        public f.a c(byte[] bArr) {
            this.extras = bArr;
            return this;
        }
    }

    @Override // h9.f
    public Iterable b() {
        return this.f47827a;
    }

    @Override // h9.f
    public byte[] c() {
        return this.extras;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f47827a.equals(fVar.b())) {
                if (Arrays.equals(this.extras, fVar instanceof C4489a ? ((C4489a) fVar).extras : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47827a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f47827a + ", extras=" + Arrays.toString(this.extras) + "}";
    }

    public C4489a(Iterable iterable, byte[] bArr) {
        this.f47827a = iterable;
        this.extras = bArr;
    }
}

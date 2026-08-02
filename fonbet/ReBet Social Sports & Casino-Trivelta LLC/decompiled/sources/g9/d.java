package g9;

import d9.EnumC4042e;
import g9.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public final String f47185a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4042e f47186b;
    private final byte[] extras;

    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public String f47187a;

        /* renamed from: b, reason: collision with root package name */
        public EnumC4042e f47188b;
        private byte[] extras;

        @Override // g9.o.a
        public o a() {
            String str = "";
            if (this.f47187a == null) {
                str = " backendName";
            }
            if (this.f47188b == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f47187a, this.extras, this.f47188b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g9.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f47187a = str;
            return this;
        }

        @Override // g9.o.a
        public o.a c(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // g9.o.a
        public o.a d(EnumC4042e enumC4042e) {
            if (enumC4042e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f47188b = enumC4042e;
            return this;
        }
    }

    @Override // g9.o
    public String b() {
        return this.f47185a;
    }

    @Override // g9.o
    public byte[] c() {
        return this.extras;
    }

    @Override // g9.o
    public EnumC4042e d() {
        return this.f47186b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f47185a.equals(oVar.b())) {
                if (Arrays.equals(this.extras, oVar instanceof d ? ((d) oVar).extras : oVar.c()) && this.f47186b.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47185a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003) ^ this.f47186b.hashCode();
    }

    public d(String str, byte[] bArr, EnumC4042e enumC4042e) {
        this.f47185a = str;
        this.extras = bArr;
        this.f47186b = enumC4042e;
    }
}

package k7;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f18889d;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f18890a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f18891b;

    /* renamed from: c, reason: collision with root package name */
    public volatile l0 f18892c;

    static {
        new k0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new k0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new l0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new l0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f18889d = new j0(new i0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public l0(i0 i0Var, Character ch2) {
        this.f18890a = i0Var;
        if (ch2 != null) {
            byte[] bArr = i0Var.f18880g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.d("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f18891b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i5) {
        int i10 = 0;
        a.n(0, i5, bArr.length);
        while (i10 < i5) {
            i0 i0Var = this.f18890a;
            b(sb2, bArr, i10, Math.min(i0Var.f18879f, i5 - i10));
            i10 += i0Var.f18879f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i5, int i10) {
        a.n(i5, i5 + i10, bArr.length);
        i0 i0Var = this.f18890a;
        int i11 = i0Var.f18879f;
        int i12 = i0Var.f18877d;
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int i13 = 0;
        long j = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j = (j | (bArr[i5 + i14] & 255)) << 8;
        }
        int i15 = (i10 + 1) * 8;
        while (i13 < i10 * 8) {
            sb2.append(i0Var.f18875b[((int) (j >>> ((i15 - i12) - i13))) & i0Var.f18876c]);
            i13 += i12;
        }
        if (this.f18891b != null) {
            while (i13 < i0Var.f18879f * 8) {
                sb2.append('=');
                i13 += i12;
            }
        }
    }

    public final String c(int i5, byte[] bArr) {
        a.n(0, i5, bArr.length);
        i0 i0Var = this.f18890a;
        int i10 = i0Var.f18879f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(i0Var.f18878e * a.a(i5, i10));
        try {
            a(sb2, bArr, i5);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f18890a.equals(l0Var.f18890a) && Objects.equals(this.f18891b, l0Var.f18891b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18890a.hashCode() ^ Objects.hashCode(this.f18891b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        i0 i0Var = this.f18890a;
        sb2.append(i0Var);
        if (8 % i0Var.f18877d != 0) {
            Character ch2 = this.f18891b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public l0(String str, String str2) {
        this(new i0(str, str2.toCharArray()), (Character) '=');
    }
}

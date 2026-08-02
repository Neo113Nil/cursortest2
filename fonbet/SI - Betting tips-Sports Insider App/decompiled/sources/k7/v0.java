package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f18927a;

    public v0(r0 r0Var) {
        this.f18927a = r0Var;
    }

    @Override // k7.b1
    public final int a() {
        return b1.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        int a7 = b1Var.a();
        int d10 = b1.d((byte) 64);
        if (d10 != a7) {
            return d10 - b1Var.a();
        }
        r0 r0Var = ((v0) b1Var).f18927a;
        r0 r0Var2 = this.f18927a;
        byte[] bArr = r0Var2.f18915b;
        int length = bArr.length;
        byte[] bArr2 = r0Var.f18915b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return o0.f18903a.compare(r0Var2.i(), r0Var.i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            return this.f18927a.equals(((v0) obj).f18927a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b1.d((byte) 64)), this.f18927a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        i0 i0Var;
        int i5;
        boolean z5;
        j0 j0Var = l0.f18889d;
        l0 l0Var = j0Var.f18892c;
        if (l0Var == null) {
            i0 i0Var2 = j0Var.f18890a;
            char[] cArr = i0Var2.f18875b;
            int i10 = 0;
            while (true) {
                if (i10 >= cArr.length) {
                    i0Var = i0Var2;
                    break;
                }
                char c2 = cArr[i10];
                if (c2 < 'a' || c2 > 'z') {
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= cArr.length) {
                            z5 = false;
                            break;
                        }
                        char c8 = cArr[i11];
                        if (c8 >= 'A' && c8 <= 'Z') {
                            z5 = true;
                            break;
                        }
                        i11++;
                    }
                    if (z5) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        char c10 = cArr[i12];
                        if (c10 >= 97 && c10 <= 122) {
                            c10 ^= 32;
                        }
                        cArr2[i12] = (char) c10;
                    }
                    i0Var = new i0(i0Var2.f18874a.concat(".upperCase()"), cArr2);
                    byte[] bArr = i0Var.f18880g;
                    if (i0Var2.f18881h && !i0Var.f18881h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i5 = 65; i5 <= 90; i5++) {
                            int i13 = i5 | 32;
                            byte b10 = bArr[i5];
                            byte b11 = bArr[i13];
                            if (b10 == -1) {
                                copyOf[i5] = b11;
                            } else {
                                char c11 = (char) i5;
                                char c12 = (char) i13;
                                if (b11 != -1) {
                                    throw new IllegalStateException(a.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                                copyOf[i13] = b10;
                            }
                        }
                        i0Var = new i0(i0Var.f18874a.concat(".ignoreCase()"), i0Var.f18875b, copyOf, true);
                    }
                }
            }
            l0Var = i0Var == i0Var2 ? j0Var : new j0(i0Var);
            j0Var.f18892c = l0Var;
        }
        byte[] i14 = this.f18927a.i();
        return androidx.appcompat.widget.c1.n("h'", l0Var.c(i14.length, i14), "'");
    }
}

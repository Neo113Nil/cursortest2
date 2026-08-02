package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class x5p extends a6p {
    public final t5p b;
    public final Character c;
    public volatile a6p d;

    public x5p(t5p t5pVar, Character ch) {
        this.b = t5pVar;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = t5pVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        if (z) {
            this.c = ch;
        } else {
            a70.p(wca.O("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    @Override // defpackage.a6p
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        jca.g0(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            h(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    @Override // defpackage.a6p
    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e = e(charSequence);
        int length = e.length();
        t5p t5pVar = this.b;
        boolean z = t5pVar.h[length % t5pVar.e];
        int i2 = t5pVar.d;
        if (!z) {
            int length2 = e.length();
            throw new w5p(me4.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < e.length()) {
            long j = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = t5pVar.e;
                if (i5 >= i) {
                    break;
                }
                j <<= i2;
                if (i3 + i5 < e.length()) {
                    j |= t5pVar.a(e.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = t5pVar.f;
            int i8 = i6 * i2;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((j >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i;
        }
        return i4;
    }

    @Override // defpackage.a6p
    public final int c(int i) {
        t5p t5pVar = this.b;
        int i2 = t5pVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return t5pVar.e * yfa.R(i, i2);
    }

    @Override // defpackage.a6p
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.a6p
    public final CharSequence e(CharSequence charSequence) {
        if (this.c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5p) {
            x5p x5pVar = (x5p) obj;
            if (this.b.equals(x5pVar.b) && Objects.equals(this.c, x5pVar.c)) {
                return true;
            }
        }
        return false;
    }

    public a6p g(t5p t5pVar, Character ch) {
        return new x5p(t5pVar, ch);
    }

    public final void h(int i, int i2, StringBuilder sb, byte[] bArr) {
        jca.g0(i, i + i2, bArr.length);
        t5p t5pVar = this.b;
        int i3 = t5pVar.f;
        int i4 = 0;
        jca.c0(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = t5pVar.d;
        while (i4 < i2 * 8) {
            sb.append(t5pVar.b[t5pVar.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.c != null) {
            while (i4 < i3 * 8) {
                sb.append(C4427z5.U);
                i4 += i7;
            }
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ this.b.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a6p i() {
        t5p t5pVar;
        boolean z;
        a6p a6pVar = this.d;
        if (a6pVar == null) {
            t5p t5pVar2 = this.b;
            int i = 0;
            while (true) {
                char[] cArr = t5pVar2.b;
                int length = cArr.length;
                if (i >= length) {
                    t5pVar = t5pVar2;
                    break;
                }
                char c = cArr[i];
                if (c < 'A' || c > 'Z') {
                    i++;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i2];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (z) {
                        a70.r("Cannot call lowerCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c3 = cArr[i3];
                        if (c3 >= 65 && c3 <= 90) {
                            c3 ^= 32;
                        }
                        cArr2[i3] = (char) c3;
                    }
                    t5pVar = new t5p(t5pVar2.a.concat(".lowerCase()"), cArr2);
                    if (t5pVar2.i && !t5pVar.i) {
                        byte[] bArr = t5pVar.g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i4] = b2;
                            } else {
                                char c4 = (char) i4;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    a70.r(wca.O("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        t5pVar = new t5p(t5pVar.a.concat(".ignoreCase()"), t5pVar.b, copyOf, true);
                    }
                }
            }
            a6pVar = t5pVar == t5pVar2 ? this : g(t5pVar, this.c);
            this.d = a6pVar;
        }
        return a6pVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        t5p t5pVar = this.b;
        sb.append(t5pVar);
        if (8 % t5pVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public x5p(String str, String str2) {
        this(new t5p(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }
}

package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class q21 {
    public static final o21 e = new o21("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final o21 f = new o21("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final n21 g;
    public final m21 a;
    public final Character b;
    public volatile q21 c;
    public volatile q21 d;

    static {
        new q21("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new q21("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        g = new n21(new m21("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public q21(m21 m21Var, Character ch) {
        boolean z;
        m21Var.getClass();
        this.a = m21Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = m21Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                z1a.q(ch, "Padding character %s was already in alphabet", z);
                this.b = ch;
            }
        }
        z = true;
        z1a.q(ch, "Padding character %s was already in alphabet", z);
        this.b = ch;
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b = b(bArr, g(str));
            if (b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b];
            System.arraycopy(bArr, 0, bArr2, 0, b);
            return bArr2;
        } catch (p21 e2) {
            ilg.k(e2);
            return null;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence g2 = g(charSequence);
        int length = g2.length();
        m21 m21Var = this.a;
        boolean[] zArr = m21Var.h;
        int i = m21Var.d;
        int i2 = m21Var.e;
        if (!zArr[length % i2]) {
            throw new p21("Invalid input length " + g2.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < g2.length(); i4 += i2) {
            long j = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j <<= i;
                if (i4 + i6 < g2.length()) {
                    j |= m21Var.a(g2.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = m21Var.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((j >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        z1a.A(0, length, bArr.length);
        m21 m21Var = this.a;
        int i = m21Var.e;
        int i2 = m21Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(o6a.t(length, i2) * i);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            a70.j(e2);
            return null;
        }
    }

    public final void d(int i, int i2, StringBuilder sb, byte[] bArr) {
        z1a.A(i, i + i2, bArr.length);
        m21 m21Var = this.a;
        int i3 = m21Var.f;
        int i4 = m21Var.d;
        int i5 = 0;
        z1a.s(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(m21Var.b[((int) (j >>> (i7 - i5))) & m21Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < m21Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        z1a.A(0, i, bArr.length);
        while (i2 < i) {
            m21 m21Var = this.a;
            d(i2, Math.min(m21Var.f, i - i2), sb, bArr);
            i2 += m21Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q21) {
            q21 q21Var = (q21) obj;
            if (this.a.equals(q21Var.a) && Objects.equals(this.b, q21Var.b)) {
                return true;
            }
        }
        return false;
    }

    public q21 f(m21 m21Var, Character ch) {
        return new q21(m21Var, ch);
    }

    public final CharSequence g(CharSequence charSequence) {
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final q21 h() {
        boolean z;
        q21 q21Var = this.c;
        if (q21Var == null) {
            m21 m21Var = this.a;
            char[] cArr = m21Var.b;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (rz8.H(cArr[i])) {
                    char[] cArr2 = m21Var.b;
                    int length2 = cArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z = false;
                            break;
                        }
                        if (rz8.J(cArr2[i2])) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    z1a.D("Cannot call upperCase() on a mixed-case alphabet", !z);
                    char[] cArr3 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c = cArr[i3];
                        if (rz8.H(c)) {
                            c = (char) (c ^ ' ');
                        }
                        cArr3[i3] = c;
                    }
                    m21 m21Var2 = new m21(mz1.o(new StringBuilder(), m21Var.a, ".upperCase()"), cArr3);
                    m21Var = m21Var.i ? m21Var2.b() : m21Var2;
                } else {
                    i++;
                }
            }
            q21Var = m21Var == this.a ? this : f(m21Var, this.b);
            this.c = q21Var;
        }
        return q21Var;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        m21 m21Var = this.a;
        sb.append(m21Var);
        if (8 % m21Var.d != 0) {
            Character ch = this.b;
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

    public q21(String str, String str2) {
        this(new m21(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }
}

package defpackage;

import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhaf;
import com.google.android.gms.internal.ads.zzhah;
import com.google.android.gms.internal.ads.zzhaz;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class jko extends zzhah {
    public final gko d;
    public final Character e;
    public volatile zzhah f;

    public jko(gko gkoVar, Character ch) {
        this.d = gkoVar;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = gkoVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        zzguk.e(ch, "Padding character %s was already in alphabet", z);
        this.e = ch;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzguk.k(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.d.f;
            i(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e = e(charSequence);
        int length = e.length();
        gko gkoVar = this.d;
        boolean z = gkoVar.h[length % gkoVar.e];
        int i2 = gkoVar.d;
        if (!z) {
            int length2 = e.length();
            throw new zzhaf(me4.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < e.length()) {
            long j = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = gkoVar.e;
                if (i5 >= i) {
                    break;
                }
                j <<= i2;
                if (i3 + i5 < e.length()) {
                    j |= gkoVar.a(e.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = gkoVar.f;
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

    @Override // com.google.android.gms.internal.ads.zzhah
    public final int c(int i) {
        gko gkoVar = this.d;
        int i2 = gkoVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return gkoVar.e * zzhaz.a(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final int d(int i) {
        return (int) (((this.d.d * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.e == null) {
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
        if (obj instanceof jko) {
            jko jkoVar = (jko) obj;
            if (this.d.equals(jkoVar.d) && Objects.equals(this.e, jkoVar.e)) {
                return true;
            }
        }
        return false;
    }

    public zzhah h(gko gkoVar, Character ch) {
        return new jko(gkoVar, ch);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) ^ this.d.hashCode();
    }

    public final void i(int i, int i2, StringBuilder sb, byte[] bArr) {
        zzguk.k(i, i + i2, bArr.length);
        gko gkoVar = this.d;
        int i3 = gkoVar.f;
        int i4 = 0;
        zzguk.a(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = gkoVar.d;
        while (i4 < i2 * 8) {
            sb.append(gkoVar.b[gkoVar.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.e != null) {
            while (i4 < i3 * 8) {
                sb.append(C4427z5.U);
                i4 += i7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final zzhah j() {
        gko gkoVar;
        boolean z;
        zzhah zzhahVar = this.f;
        if (zzhahVar == null) {
            gko gkoVar2 = this.d;
            int i = 0;
            while (true) {
                char[] cArr = gkoVar2.b;
                int length = cArr.length;
                if (i >= length) {
                    gkoVar = gkoVar2;
                    break;
                }
                if (zzgts.c(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    zzguk.g("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (zzgts.c(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i3] = (char) c2;
                    }
                    gkoVar = new gko(gkoVar2.a.concat(".lowerCase()"), cArr2);
                    if (gkoVar2.i && !gkoVar.i) {
                        byte[] bArr = gkoVar.g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i4] = b2;
                            } else {
                                char c3 = (char) i4;
                                char c4 = (char) i5;
                                if (b2 != -1) {
                                    a70.r(zzgvb.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        gkoVar = new gko(gkoVar.a.concat(".ignoreCase()"), gkoVar.b, copyOf, true);
                    }
                } else {
                    i++;
                }
            }
            zzhahVar = gkoVar == gkoVar2 ? this : h(gkoVar, this.e);
            this.f = zzhahVar;
        }
        return zzhahVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        gko gkoVar = this.d;
        sb.append(gkoVar);
        if (8 % gkoVar.d != 0) {
            Character ch = this.e;
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

    public jko(String str, String str2) {
        this(new gko(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }
}

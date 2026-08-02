package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o21 extends q21 {
    public o21(String str, String str2) {
        this(new m21(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }

    @Override // defpackage.q21
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence g = g(charSequence);
        int length = g.length();
        m21 m21Var = this.a;
        if (!m21Var.h[length % m21Var.e]) {
            throw new p21("Invalid input length " + g.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < g.length()) {
            int i3 = i + 2;
            int a = (m21Var.a(g.charAt(i + 1)) << 12) | (m21Var.a(g.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (a >>> 16);
            if (i3 < g.length()) {
                int i5 = i + 3;
                int a2 = a | (m21Var.a(g.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((a2 >>> 8) & 255);
                if (i5 < g.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | m21Var.a(g.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.q21
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        z1a.A(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            m21 m21Var = this.a;
            char[] cArr = m21Var.b;
            char[] cArr2 = m21Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            d(i2, i - i2, sb, bArr);
        }
    }

    @Override // defpackage.q21
    public final q21 f(m21 m21Var, Character ch) {
        return new o21(m21Var, ch);
    }

    public o21(m21 m21Var, Character ch) {
        super(m21Var, ch);
        z1a.s(m21Var.b.length == 64);
    }
}

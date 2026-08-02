package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v5p extends x5p {
    public v5p(String str, String str2) {
        this(new t5p(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }

    @Override // defpackage.x5p, defpackage.a6p
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        jca.g0(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            char[] cArr = this.b.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            h(i2, i - i2, sb, bArr);
        }
    }

    @Override // defpackage.x5p, defpackage.a6p
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        t5p t5pVar = this.b;
        if (!t5pVar.h[length % t5pVar.e]) {
            int length2 = e.length();
            throw new w5p(me4.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < e.length()) {
            int i3 = i2 + 1;
            int a = (t5pVar.a(e.charAt(i + 1)) << 12) | (t5pVar.a(e.charAt(i)) << 18);
            bArr[i2] = (byte) (a >>> 16);
            int i4 = i + 2;
            if (i4 < e.length()) {
                int i5 = i + 3;
                int a2 = a | (t5pVar.a(e.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((a2 >>> 8) & 255);
                if (i5 < e.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | t5pVar.a(e.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.x5p
    public final a6p g(t5p t5pVar, Character ch) {
        return new v5p(t5pVar, ch);
    }

    public v5p(t5p t5pVar, Character ch) {
        super(t5pVar, ch);
        jca.c0(t5pVar.b.length == 64);
    }
}

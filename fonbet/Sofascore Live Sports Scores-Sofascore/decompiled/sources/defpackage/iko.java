package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhaf;
import com.google.android.gms.internal.ads.zzhah;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iko extends jko {
    public iko(String str, String str2) {
        this(new gko(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }

    @Override // defpackage.jko, com.google.android.gms.internal.ads.zzhah
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzguk.k(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            char[] cArr = this.d.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            i(i2, i - i2, sb, bArr);
        }
    }

    @Override // defpackage.jko, com.google.android.gms.internal.ads.zzhah
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        gko gkoVar = this.d;
        if (!gkoVar.h[length % gkoVar.e]) {
            int length2 = e.length();
            throw new zzhaf(me4.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < e.length()) {
            int i3 = i2 + 1;
            int a = (gkoVar.a(e.charAt(i + 1)) << 12) | (gkoVar.a(e.charAt(i)) << 18);
            bArr[i2] = (byte) (a >>> 16);
            int i4 = i + 2;
            if (i4 < e.length()) {
                int i5 = i + 3;
                int a2 = a | (gkoVar.a(e.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((a2 >>> 8) & 255);
                if (i5 < e.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | gkoVar.a(e.charAt(i5))) & 255);
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

    @Override // defpackage.jko
    public final zzhah h(gko gkoVar, Character ch) {
        return new iko(gkoVar, ch);
    }

    public iko(gko gkoVar, Character ch) {
        super(gkoVar, ch);
        zzguk.a(gkoVar.b.length == 64);
    }
}

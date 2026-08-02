package defpackage;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u5p extends x5p {
    public final char[] e;

    public u5p(t5p t5pVar) {
        super(t5pVar, (Character) null);
        this.e = new char[512];
        char[] cArr = t5pVar.b;
        jca.c0(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | NotificationCompat.FLAG_LOCAL_ONLY] = cArr[i & 15];
        }
    }

    @Override // defpackage.x5p, defpackage.a6p
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        jca.g0(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // defpackage.x5p, defpackage.a6p
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new w5p(me4.g(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            t5p t5pVar = this.b;
            bArr[i2] = (byte) ((t5pVar.a(charAt) << 4) | t5pVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.x5p
    public final a6p g(t5p t5pVar, Character ch) {
        return new u5p(t5pVar);
    }
}

package defpackage;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n21 extends q21 {
    public final char[] h;

    public n21(m21 m21Var) {
        super(m21Var, (Character) null);
        this.h = new char[512];
        char[] cArr = m21Var.b;
        z1a.s(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.h;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | NotificationCompat.FLAG_LOCAL_ONLY] = cArr[i & 15];
        }
    }

    @Override // defpackage.q21
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new p21("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            m21 m21Var = this.a;
            bArr[i2] = (byte) ((m21Var.a(charAt) << 4) | m21Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.q21
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        z1a.A(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.h;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // defpackage.q21
    public final q21 f(m21 m21Var, Character ch) {
        return new n21(m21Var);
    }
}

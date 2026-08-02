package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhaf;
import com.google.android.gms.internal.ads.zzhah;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hko extends jko {
    public final char[] g;

    public hko(gko gkoVar) {
        super(gkoVar, (Character) null);
        this.g = new char[512];
        zzguk.a(gkoVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.g;
            char[] cArr2 = gkoVar.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | NotificationCompat.FLAG_LOCAL_ONLY] = cArr2[i & 15];
        }
    }

    @Override // defpackage.jko, com.google.android.gms.internal.ads.zzhah
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zzguk.k(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // defpackage.jko, com.google.android.gms.internal.ads.zzhah
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzhaf(me4.g(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            gko gkoVar = this.d;
            bArr[i2] = (byte) ((gkoVar.a(charAt) << 4) | gkoVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.jko
    public final zzhah h(gko gkoVar, Character ch) {
        return new hko(gkoVar);
    }
}

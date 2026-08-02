package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzgf;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qbo extends lco {
    public final char[] e;

    public qbo(mbo mboVar) {
        super(mboVar, (Character) null);
        this.e = new char[512];
        char[] cArr = mboVar.b;
        if (cArr.length != 16) {
            ilg.c();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | NotificationCompat.FLAG_LOCAL_ONLY] = cArr[i & 15];
        }
    }

    @Override // defpackage.lco, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zzbm.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // defpackage.lco
    public final zzgf d(mbo mboVar, Character ch) {
        return new qbo(mboVar);
    }
}

package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzgf;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cco extends lco {
    public cco(String str, String str2) {
        this(new mbo(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }

    @Override // defpackage.lco, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzbm.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            mbo mboVar = this.b;
            char[] cArr = mboVar.b;
            char[] cArr2 = mboVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            e(i2, i - i2, sb, bArr);
        }
    }

    @Override // defpackage.lco
    public final zzgf d(mbo mboVar, Character ch) {
        return new cco(mboVar, ch);
    }

    public cco(mbo mboVar, Character ch) {
        super(mboVar, ch);
        if (mboVar.b.length == 64) {
            return;
        }
        ilg.c();
        throw null;
    }
}

package defpackage;

import com.google.android.gms.internal.pal.zzos;
import com.google.android.gms.internal.pal.zzqc;
import com.google.android.gms.internal.pal.zzqk;
import com.google.android.gms.internal.pal.zzql;
import com.google.android.gms.internal.pal.zzqm;
import com.google.android.gms.internal.pal.zzyv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class g3p {
    public static final y1p a;
    public static final w1p b;
    public static final t0p c;
    public static final n0p d;

    static {
        byte[] bArr = new byte["type.googleapis.com/google.crypto.tink.AesCmacKey".length()];
        for (int i = 0; i < "type.googleapis.com/google.crypto.tink.AesCmacKey".length(); i++) {
            char charAt = "type.googleapis.com/google.crypto.tink.AesCmacKey".charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzqc("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        zzyv zzyvVar = new zzyv(bArr, bArr.length);
        int i2 = zzqk.a;
        a = new y1p();
        int i3 = zzql.a;
        b = new w1p(zzyvVar);
        int i4 = zzqm.a;
        c = new t0p();
        d = new n0p(zzyvVar, new zzos() { // from class: com.google.android.gms.internal.pal.zzqn
        });
    }
}

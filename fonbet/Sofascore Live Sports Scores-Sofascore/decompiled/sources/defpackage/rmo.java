package defpackage;

import com.google.android.gms.internal.ads.zzhek;
import com.google.android.gms.internal.ads.zzhoh;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rmo implements zzhek {
    public final zzhoh a;

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((qmo) it.next()).a.c(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        zzl.x("decryption failed");
        return null;
    }
}

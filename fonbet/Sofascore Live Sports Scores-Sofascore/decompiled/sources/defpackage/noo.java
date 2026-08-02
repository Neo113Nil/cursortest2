package defpackage;

import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhoh;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class noo implements zzhfo {
    public final zzhoh a;

    public noo(zzhoh zzhohVar) {
        this.a = zzhohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((ooo) it.next()).a.c(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        zzl.x("invalid signature");
    }
}

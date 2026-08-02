package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbjg;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class amn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbcg b;

    public /* synthetic */ amn(zzbcg zzbcgVar, int i) {
        this.a = i;
        this.b = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzbcg zzbcgVar = this.b;
                try {
                    if (zzbcgVar.f == null && zzbcgVar.g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(zzbcgVar.a);
                        advertisingIdClient.start();
                        zzbcgVar.f = advertisingIdClient;
                        break;
                    }
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
                    zzbcgVar.f = null;
                    return;
                }
                break;
            default:
                zzbjg.a(this.b.a);
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zro b;

    public /* synthetic */ qro(zro zroVar, int i) {
        this.a = i;
        this.b = zroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zro zroVar = this.b;
                try {
                    if (zroVar.f == null && zroVar.g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(zroVar.a);
                        advertisingIdClient.start();
                        zroVar.f = advertisingIdClient;
                        break;
                    }
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
                    zroVar.f = null;
                    return;
                }
                break;
            default:
                Context context = this.b.a;
                kwo kwoVar = exo.a;
                jaa.R(new py3(context, 4));
                break;
        }
    }
}

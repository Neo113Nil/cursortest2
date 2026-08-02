package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzcgo;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class asn implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzcgo b;

    public asn(zzcfn zzcfnVar, Context context, zzcgo zzcgoVar) {
        this.a = context;
        this.b = zzcgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgo zzcgoVar = this.b;
        try {
            zzcgoVar.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzcgoVar.zzd(e);
            zzo.zzg("Exception while getting advertising Id info", e);
        }
    }
}

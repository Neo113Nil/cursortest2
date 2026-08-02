package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzfla;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p8o implements OnAdMetadataChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ IInterface b;
    public final /* synthetic */ zzbev c;

    public /* synthetic */ p8o(zzbev zzbevVar, IInterface iInterface, int i) {
        this.a = i;
        this.b = iInterface;
        this.c = zzbevVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        int i = this.a;
        IInterface iInterface = this.b;
        zzbev zzbevVar = this.c;
        switch (i) {
            case 0:
                if (((zzfku) zzbevVar).i != null) {
                    try {
                        ((zzdn) iInterface).zze();
                        break;
                    } catch (RemoteException e) {
                        int i2 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e);
                        return;
                    }
                }
                break;
            default:
                if (((zzfla) zzbevVar).d != null) {
                    try {
                        ((zzby) iInterface).zze();
                        break;
                    } catch (RemoteException e2) {
                        int i3 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
                break;
        }
    }
}

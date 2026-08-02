package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzeua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6o implements zzdds {
    public final /* synthetic */ zzeua a;
    public final /* synthetic */ zzbtc b;

    public /* synthetic */ g6o(zzeua zzeuaVar, zzbtc zzbtcVar) {
        this.a = zzeuaVar;
        this.b = zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final /* synthetic */ void i0(zze zzeVar) {
        this.a.i0(zzeVar);
        zzbtc zzbtcVar = this.b;
        if (zzbtcVar != null) {
            try {
                zzbtcVar.a(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbtcVar != null) {
            try {
                zzbtcVar.zzf(zzeVar.zza);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}

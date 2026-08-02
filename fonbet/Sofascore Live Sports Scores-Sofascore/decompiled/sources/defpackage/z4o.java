package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzemw;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z4o implements zzdom {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzemt b;
    public final /* synthetic */ zzfld c;

    public /* synthetic */ z4o(zzemw zzemwVar, zzemt zzemtVar, zzfld zzfldVar, int i) {
        this.a = i;
        this.b = zzemtVar;
        this.c = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void b(boolean z, Context context, zzdec zzdecVar) {
        zzfmd zzfmdVar;
        int i = this.a;
        zzemt zzemtVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
                    zzfmuVar.b(z);
                    try {
                        zzfmuVar.a.Y0(new ObjectWrapper(context));
                        return;
                    } finally {
                    }
                } catch (zzfmd e) {
                    throw new zzdol(e.getCause());
                }
            case 1:
                try {
                    zzfmu zzfmuVar2 = (zzfmu) zzemtVar.b;
                    zzfmuVar2.b(z);
                    try {
                        zzfmuVar2.a.Z2(new ObjectWrapper(context));
                        return;
                    } finally {
                    }
                } catch (zzfmd e2) {
                    throw new zzdol(e2.getCause());
                }
            default:
                try {
                    zzfmu zzfmuVar3 = (zzfmu) zzemtVar.b;
                    zzfmuVar3.b(z);
                    try {
                        zzfmuVar3.a.zzp();
                        return;
                    } finally {
                    }
                } catch (zzfmd e3) {
                    int i2 = zze.zza;
                    zzo.zzj("Cannot show rewarded video.", e3);
                    throw new zzdol(e3.getCause());
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        int i = this.a;
        return this.c;
    }
}

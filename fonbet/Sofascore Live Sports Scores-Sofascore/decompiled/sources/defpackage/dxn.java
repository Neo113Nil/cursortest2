package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdfd;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dxn implements zzdfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ VersionInfoParcel c;
    public final /* synthetic */ zzfld d;
    public final /* synthetic */ zzflw e;

    public /* synthetic */ dxn(Context context, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, zzflw zzflwVar, int i) {
        this.a = i;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = zzfldVar;
        this.e = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final /* synthetic */ void zzg() {
        int i = this.a;
        Context context = this.b;
        VersionInfoParcel versionInfoParcel = this.c;
        zzfld zzfldVar = this.d;
        zzflw zzflwVar = this.e;
        switch (i) {
            case 0:
                zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, zzfldVar.C.toString(), zzflwVar.g);
                break;
            default:
                zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, zzfldVar.C.toString(), zzflwVar.g);
                break;
        }
    }
}

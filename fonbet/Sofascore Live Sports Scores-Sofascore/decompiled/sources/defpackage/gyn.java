package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcvo;
import com.google.android.gms.internal.ads.zzdmy;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzgub;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gyn implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gyn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zzfld zzfldVar = (zzfld) obj;
                zzat zzatVar = new zzat((Context) obj4);
                zzatVar.zze(zzfldVar.B);
                zzatVar.zzf(zzfldVar.C.toString());
                zzatVar.zzd(((VersionInfoParcel) obj3).afmaVersion);
                zzatVar.zzc(((zzflw) obj2).g);
                return zzatVar;
            case 1:
                zzclm zzclmVar = (zzclm) obj4;
                if (((zzfld) obj3).M) {
                    zzclmVar.r();
                }
                zzclmVar.zzJ();
                zzclmVar.onPause();
                return ((zzcvo) obj2).d();
            case 2:
                zzclm zzclmVar2 = (zzclm) obj4;
                if (((zzfld) obj3).M) {
                    zzclmVar2.r();
                }
                zzclmVar2.zzJ();
                zzclmVar2.onPause();
                return ((zzdmy) obj2).d();
            default:
                zzclm zzclmVar3 = (zzclm) obj4;
                if (((zzfld) obj3).M) {
                    zzclmVar3.r();
                }
                zzclmVar3.zzJ();
                zzclmVar3.onPause();
                return ((zzdwl) obj2).d();
        }
    }
}

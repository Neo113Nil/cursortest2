package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ron implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcub b;
    public final /* synthetic */ String c;

    public /* synthetic */ ron(zzcub zzcubVar, String str, int i) {
        this.a = i;
        this.b = zzcubVar;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ddb zza(Object obj) {
        int i = this.a;
        String str = this.c;
        zzcub zzcubVar = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                mon monVar = zzbqg.a;
                return (((Boolean) zzba.zzc().a(zzbjg.Hb)).booleanValue() && zzcubVar != null && zzcub.b(str)) ? zzcubVar.a(str2, zzay.zzh()) : zzhcy.a(str2);
            default:
                zzcubVar.e.submit(new wjn(9, zzcubVar, (Throwable) obj));
                return zzhcy.a(str);
        }
    }
}

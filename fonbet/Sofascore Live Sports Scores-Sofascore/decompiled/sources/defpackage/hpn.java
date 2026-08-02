package defpackage;

import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzclm;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hpn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbtp b;
    public final /* synthetic */ String c;

    public /* synthetic */ hpn(zzbtp zzbtpVar, String str, int i) {
        this.a = i;
        this.b = zzbtpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        String str = this.c;
        zzbtp zzbtpVar = this.b;
        switch (i) {
            case 0:
                zzclm zzclmVar = zzbtpVar.a;
                if (zzclmVar != null) {
                    zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                    break;
                }
                break;
            default:
                zzclm zzclmVar2 = zzbtpVar.a;
                if (zzclmVar2 != null) {
                    zzclmVar2.zza(str);
                    break;
                }
                break;
        }
    }
}

package defpackage;

import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzfm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ybn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzaex b;

    public /* synthetic */ ybn(zzaex zzaexVar, long j, int i) {
        this.a = 1;
        this.b = zzaexVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzaex zzaexVar = this.b;
        zzaexVar.getClass();
        switch (i) {
            case 0:
                String str = zzfm.a;
                zzaexVar.b.zzc();
                break;
            case 1:
                String str2 = zzfm.a;
                zzaexVar.b.zzj();
                break;
            case 2:
                String str3 = zzfm.a;
                zzaexVar.b.zzh();
                break;
            case 3:
                String str4 = zzfm.a;
                zzaexVar.b.zzk();
                break;
            default:
                String str5 = zzfm.a;
                zzaexVar.b.zzb();
                break;
        }
    }

    public /* synthetic */ ybn(zzaex zzaexVar, Object obj, int i) {
        this.a = i;
        this.b = zzaexVar;
    }

    public /* synthetic */ ybn(zzaex zzaexVar, String str, long j, long j2) {
        this.a = 0;
        this.b = zzaexVar;
    }
}

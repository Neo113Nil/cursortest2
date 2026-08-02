package defpackage;

import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcix;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qsn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzchl d;

    public /* synthetic */ qsn(zzchl zzchlVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = zzchlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        zzchl zzchlVar = this.d;
        switch (i) {
            case 0:
                zzcht zzchtVar = ((zzchj) zzchlVar).q;
                if (zzchtVar != null) {
                    zzchtVar.l(i3, i2);
                    break;
                }
                break;
            default:
                zzcht zzchtVar2 = ((zzcix) zzchlVar).g;
                if (zzchtVar2 != null) {
                    zzchtVar2.l(i3, i2);
                    break;
                }
                break;
        }
    }
}

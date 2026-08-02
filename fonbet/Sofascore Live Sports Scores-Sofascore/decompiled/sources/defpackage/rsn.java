package defpackage;

import com.google.android.gms.internal.ads.zzcht;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rsn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcht b;

    public /* synthetic */ rsn(zzcht zzchtVar, int i) {
        this.a = i;
        this.b = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcht zzchtVar = this.b;
        switch (i) {
            case 0:
                zzchtVar.c("surfaceCreated", new String[0]);
                break;
            case 1:
                zzchtVar.c("surfaceDestroyed", new String[0]);
                break;
            default:
                zzchtVar.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}

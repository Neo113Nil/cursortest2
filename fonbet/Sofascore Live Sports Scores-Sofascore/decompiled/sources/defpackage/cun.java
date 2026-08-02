package defpackage;

import com.google.android.gms.internal.ads.zzclm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cun implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzclm b;

    public /* synthetic */ cun(zzclm zzclmVar, int i) {
        this.a = i;
        this.b = zzclmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzclm zzclmVar = this.b;
        switch (i) {
            case 0:
                zzclmVar.destroy();
                break;
            case 1:
                zzclmVar.destroy();
                break;
            case 2:
                zzclmVar.onPause();
                break;
            case 3:
                zzclmVar.onResume();
                break;
            case 4:
                zzclmVar.destroy();
                break;
            case 5:
                zzclmVar.n("onSdkImpression", new dh0(0));
                break;
            case 6:
                zzclmVar.destroy();
                break;
            default:
                zzclmVar.r();
                break;
        }
    }
}

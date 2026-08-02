package defpackage;

import com.google.android.gms.internal.ads.zzdyf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdyf b;

    public /* synthetic */ r1o(zzdyf zzdyfVar, int i) {
        this.a = i;
        this.b = zzdyfVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzdyf zzdyfVar = this.b;
        switch (i) {
            case 0:
                zzdyfVar.c.execute(new r1o(zzdyfVar, 1));
                break;
            case 1:
                zzdyfVar.a();
                break;
            default:
                zzdyfVar.a();
                break;
        }
    }
}

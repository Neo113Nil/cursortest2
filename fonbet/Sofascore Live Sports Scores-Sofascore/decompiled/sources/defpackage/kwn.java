package defpackage;

import com.google.android.gms.internal.ads.zzcun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class kwn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcun b;

    public /* synthetic */ kwn(zzcun zzcunVar, int i) {
        this.a = i;
        this.b = zzcunVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzcun zzcunVar = this.b;
        switch (i) {
            case 0:
                zzcunVar.b.execute(new kwn(zzcunVar, 1));
                break;
            default:
                zzcunVar.A();
                break;
        }
    }
}

package defpackage;

import com.google.android.gms.internal.ads.zzeai;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzeai b;

    public /* synthetic */ n2o(zzeai zzeaiVar, int i) {
        this.a = i;
        this.b = zzeaiVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzeai zzeaiVar = this.b;
        switch (i) {
            case 0:
                zzeaiVar.b.a.c(zzeaiVar.a);
                break;
            default:
                zzeaiVar.b.a.b(zzeaiVar.a);
                break;
        }
    }
}

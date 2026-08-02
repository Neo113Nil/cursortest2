package defpackage;

import com.google.android.gms.internal.ads.zzesu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzesu b;

    public /* synthetic */ a6o(zzesu zzesuVar, int i) {
        this.a = i;
        this.b = zzesuVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzesu zzesuVar = this.b;
        switch (i) {
            case 0:
                zzesuVar.c();
                break;
            case 1:
                zzesuVar.c();
                break;
            default:
                zzesuVar.getClass();
                zzesuVar.f.execute(new a6o(zzesuVar, 1));
                break;
        }
    }
}

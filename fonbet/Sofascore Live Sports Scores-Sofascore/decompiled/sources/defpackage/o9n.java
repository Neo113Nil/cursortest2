package defpackage;

import com.google.android.gms.internal.ads.zzbv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0l b;

    public /* synthetic */ o9n(c0l c0lVar, zzbv zzbvVar) {
        this.a = 2;
        this.b = c0lVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        c0l c0lVar = this.b;
        switch (i) {
            case 0:
                ((x9n) c0lVar.c).i.zzb();
                break;
            case 1:
                ((x9n) c0lVar.c).i.zzc();
                break;
            default:
                ((x9n) c0lVar.c).i.getClass();
                break;
        }
    }

    public /* synthetic */ o9n(c0l c0lVar, int i) {
        this.a = i;
        this.b = c0lVar;
    }
}

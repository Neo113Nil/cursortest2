package defpackage;

import com.google.android.gms.internal.ads.zzfhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfhk b;

    public /* synthetic */ f8o(zzfhk zzfhkVar, int i) {
        this.a = i;
        this.b = zzfhkVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzfhk zzfhkVar = this.b;
        switch (i) {
            case 0:
                zzfhkVar.a.d().execute(new f8o(zzfhkVar, 1));
                break;
            default:
                zzfhkVar.E4(5);
                break;
        }
    }
}

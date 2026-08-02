package defpackage;

import com.google.android.gms.internal.ads.zzexw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzexw b;

    public /* synthetic */ r6o(zzexw zzexwVar, int i) {
        this.a = i;
        this.b = zzexwVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzexw zzexwVar = this.b;
        switch (i) {
            case 0:
                zzexwVar.a.set(new q6o(zzexwVar.e.zza(), zzexwVar.f, zzexwVar.c));
                break;
            default:
                zzexwVar.d.execute(new r6o(zzexwVar, 0));
                break;
        }
    }
}

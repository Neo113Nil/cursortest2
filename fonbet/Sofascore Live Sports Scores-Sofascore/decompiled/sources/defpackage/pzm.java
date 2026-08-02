package defpackage;

import com.bytedance.sdk.component.kj.pcc.wh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ pzm(wh whVar, Runnable runnable, int i) {
        this.a = i;
        this.b = whVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        wh whVar = this.b;
        switch (i) {
            case 0:
                whVar.vj(runnable);
                break;
            default:
                whVar.oo(runnable);
                break;
        }
    }
}

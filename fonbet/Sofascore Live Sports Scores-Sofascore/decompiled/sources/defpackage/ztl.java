package defpackage;

import com.ironsource.lifecycle.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ztl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ ztl(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.f();
                break;
            case 1:
                bVar.g();
                break;
            case 2:
                bVar.h();
                break;
            case 3:
                bVar.i();
                break;
            default:
                bVar.j();
                break;
        }
    }
}

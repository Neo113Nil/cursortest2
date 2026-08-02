package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnl b;
    public final /* synthetic */ float c;

    public /* synthetic */ tnl(vnl vnlVar, float f, int i) {
        this.a = i;
        this.b = vnlVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.c;
        vnl vnlVar = this.b;
        switch (i) {
            case 0:
                k1l k1lVar = vnlVar.a;
                Iterator<T> it = k1lVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((ynl) it.next()).e(k1lVar.getInstance(), f);
                }
                break;
            case 1:
                k1l k1lVar2 = vnlVar.a;
                Iterator<T> it2 = k1lVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((ynl) it2.next()).h(k1lVar2.getInstance(), f);
                }
                break;
            default:
                k1l k1lVar3 = vnlVar.a;
                Iterator<T> it3 = k1lVar3.getListeners().iterator();
                while (it3.hasNext()) {
                    ((ynl) it3.next()).j(k1lVar3.getInstance(), f);
                }
                break;
        }
    }
}

package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class unl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnl b;

    public /* synthetic */ unl(vnl vnlVar, int i) {
        this.a = i;
        this.b = vnlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vnl vnlVar = this.b;
        switch (i) {
            case 0:
                k1l k1lVar = vnlVar.a;
                ida idaVar = k1lVar.d;
                if (idaVar != null) {
                    idaVar.invoke(k1lVar.c);
                    return;
                } else {
                    Intrinsics.i("youTubePlayerInitListener");
                    throw null;
                }
            case 1:
                k1l k1lVar2 = vnlVar.a;
                Iterator<T> it = k1lVar2.getListeners().iterator();
                while (it.hasNext()) {
                    ((ynl) it.next()).d(k1lVar2.getInstance());
                }
                return;
            default:
                k1l k1lVar3 = vnlVar.a;
                Iterator<T> it2 = k1lVar3.getListeners().iterator();
                while (it2.hasNext()) {
                    ((ynl) it2.next()).c(k1lVar3.getInstance());
                }
                return;
        }
    }
}

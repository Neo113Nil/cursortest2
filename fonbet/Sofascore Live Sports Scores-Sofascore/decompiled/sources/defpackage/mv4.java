package defpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mv4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mrb b;

    public /* synthetic */ mv4(mrb mrbVar, int i) {
        this.a = i;
        this.b = mrbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u.L();
                return;
            case 1:
                this.b.u.D();
                return;
            default:
                mrb mrbVar = this.b;
                LinkedHashSet linkedHashSet = mrbVar.C.d.B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(mrbVar);
                    if (this.b.C.d.B.isEmpty()) {
                        qrb qrbVar = this.b.C.d;
                        qrbVar.Y.N(qrbVar.C, false);
                        qrb qrbVar2 = this.b.C.d;
                        qrbVar2.B = null;
                        if (qrbVar2.G.get()) {
                            ujg ujgVar = this.b.C.d.F;
                            xei xeiVar = qrb.e0;
                            synchronized (ujgVar.b) {
                                try {
                                    if (((xei) ujgVar.d) == null) {
                                        ujgVar.d = xeiVar;
                                        boolean isEmpty = ((HashSet) ujgVar.c).isEmpty();
                                        if (isEmpty) {
                                            ((qrb) ujgVar.e).E.a(xeiVar);
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

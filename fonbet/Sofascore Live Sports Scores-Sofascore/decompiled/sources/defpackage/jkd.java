package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jkd extends tz9 {
    public final List h;

    public jkd(List list) {
        this.h = list;
    }

    @Override // defpackage.tz9
    public final void O(rkd rkdVar) {
        k55 k55Var = em5.a;
        try {
            Iterator it = this.h.iterator();
            try {
                if (!it.hasNext()) {
                    rkdVar.a(k55Var);
                    rkdVar.onComplete();
                    return;
                }
                ikd ikdVar = new ikd(rkdVar, it);
                rkdVar.a(ikdVar);
                while (!ikdVar.c) {
                    try {
                        Object next = ikdVar.b.next();
                        rha.x(next, "The iterator returned a null value");
                        ikdVar.a.onNext(next);
                        if (ikdVar.c) {
                            return;
                        }
                        try {
                            if (!ikdVar.b.hasNext()) {
                                if (ikdVar.c) {
                                    return;
                                }
                                ikdVar.a.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            td4.w0(th);
                            ikdVar.a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        td4.w0(th2);
                        ikdVar.a.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                td4.w0(th3);
                rkdVar.a(k55Var);
                rkdVar.onError(th3);
            }
        } catch (Throwable th4) {
            td4.w0(th4);
            rkdVar.a(k55Var);
            rkdVar.onError(th4);
        }
    }
}

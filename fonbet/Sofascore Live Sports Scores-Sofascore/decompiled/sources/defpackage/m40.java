package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m40 implements Choreographer.FrameCallback {
    public final /* synthetic */ lj2 a;
    public final /* synthetic */ Function1 b;

    public m40(lj2 lj2Var, n40 n40Var, Function1 function1) {
        this.a = lj2Var;
        this.b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object u2gVar;
        Function1 function1 = this.b;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        this.a.resumeWith(u2gVar);
    }
}

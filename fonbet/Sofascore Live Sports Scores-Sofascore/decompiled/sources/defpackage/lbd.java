package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lbd {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ nbd c;

    public lbd(nbd nbdVar, rn4 rn4Var, Executor executor) {
        this.c = nbdVar;
        this.a = new WeakReference(rn4Var);
        this.b = executor;
    }
}

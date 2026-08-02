package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rc extends WeakReference {
    public final pia a;
    public final boolean b;
    public e1g c;

    public rc(pia piaVar, lo5 lo5Var, ReferenceQueue referenceQueue) {
        super(lo5Var, referenceQueue);
        w1a.m(piaVar, "Argument must not be null");
        this.a = piaVar;
        boolean z = lo5Var.a;
        this.c = null;
        this.b = z;
    }
}

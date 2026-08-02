package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e8 extends g8 {
    @Override // defpackage.g8
    public final Object r(Object obj, Object obj2) {
        fj0 fj0Var = (fj0) obj;
        ddb apply = fj0Var.apply(obj2);
        z1a.x(apply, fj0Var, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return apply;
    }

    @Override // defpackage.g8
    public final void s(Object obj) {
        n((ddb) obj);
    }
}

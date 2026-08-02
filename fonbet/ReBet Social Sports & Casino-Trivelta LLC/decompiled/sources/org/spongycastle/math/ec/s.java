package org.spongycastle.math.ec;

/* loaded from: classes5.dex */
public class s implements n {
    protected g[] preComp = null;
    protected g[] preCompNeg = null;

    /* renamed from: a, reason: collision with root package name */
    public g f62864a = null;

    public g[] a() {
        return this.preComp;
    }

    public g[] b() {
        return this.preCompNeg;
    }

    public g c() {
        return this.f62864a;
    }

    public void d(g[] gVarArr) {
        this.preComp = gVarArr;
    }

    public void e(g[] gVarArr) {
        this.preCompNeg = gVarArr;
    }

    public void f(g gVar) {
        this.f62864a = gVar;
    }
}

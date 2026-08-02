package org.spongycastle.math.ec;

/* loaded from: classes5.dex */
public class j implements n {
    protected g[] preComp = null;

    /* renamed from: a, reason: collision with root package name */
    public int f62853a = -1;

    public g[] a() {
        return this.preComp;
    }

    public int b() {
        return this.f62853a;
    }

    public void c(g[] gVarArr) {
        this.preComp = gVarArr;
    }

    public void d(int i10) {
        this.f62853a = i10;
    }
}

package com.ironsource;

/* loaded from: classes2.dex */
public class Af extends AbstractC2408f<a> {

    public interface a {
        void a();
    }

    public Af(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((Af) aVar);
    }

    @Override // com.ironsource.AbstractC2408f
    protected void b() {
        T t = this.d;
        if (t != 0) {
            ((a) t).a();
        }
    }

    public void e() {
        c();
    }
}

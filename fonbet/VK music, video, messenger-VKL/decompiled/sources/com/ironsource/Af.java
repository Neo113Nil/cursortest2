package com.ironsource;

/* loaded from: classes13.dex */
public class Af extends AbstractC4304f<a> {

    public interface a {
        void a();
    }

    public Af(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((Af) aVar);
    }

    @Override // com.ironsource.AbstractC4304f
    public void b() {
        T t = this.d;
        if (t != 0) {
            ((a) t).a();
        }
    }

    public void e() {
        c();
    }
}

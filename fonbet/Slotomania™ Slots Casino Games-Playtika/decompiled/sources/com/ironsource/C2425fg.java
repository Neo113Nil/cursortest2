package com.ironsource;

/* renamed from: com.ironsource.fg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2425fg extends AbstractC2408f<a> {

    /* renamed from: com.ironsource.fg$a */
    public interface a {
        void a();
    }

    public C2425fg(long j) {
        super(j);
    }

    public final void a(a aVar) {
        a((C2425fg) aVar);
    }

    @Override // com.ironsource.AbstractC2408f
    protected void b() {
        a aVar = (a) this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}

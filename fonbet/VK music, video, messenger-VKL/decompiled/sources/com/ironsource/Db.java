package com.ironsource;

/* loaded from: classes13.dex */
public final class Db implements S5<Cb> {
    private final String a;
    private final Ed b;
    private final InterfaceC4324g1 c;
    private final boolean d;

    public Db(String str, Ed ed, InterfaceC4324g1 interfaceC4324g1, boolean z) {
        this.a = str;
        this.b = ed;
        this.c = interfaceC4324g1;
        this.d = z;
    }

    @Override // com.ironsource.S5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cb a() throws C4533re, Exception {
        InterfaceC4439m9 a = this.c.a(this.b);
        new U(this.a, a, this.d).a();
        if (a != null) {
            return new Cb(a.f(), a.e(), a.b(), a.d(), false, 16, null);
        }
        return null;
    }
}

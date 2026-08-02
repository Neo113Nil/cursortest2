package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z4n implements nap {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ map c;

    public z4n(Class cls, Class cls2, map mapVar) {
        this.a = cls;
        this.b = cls2;
        this.c = mapVar;
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls = z6nVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        String name = this.b.getName();
        String name2 = this.a.getName();
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(wt3.h(name.length(), 14, name2.length(), 9, valueOf.length()) + 1);
        bf3.v(sb, "Factory[type=", name, "+", name2);
        return wt3.m(",adapter=", valueOf, sb, U3.j.e);
    }
}

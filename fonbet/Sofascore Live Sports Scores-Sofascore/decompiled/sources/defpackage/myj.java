package defpackage;

import com.google.gson.Gson;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class myj implements v4k {
    public final u5k a;
    public final boolean b;
    public final Class c;
    public final ppl d;

    public myj(Object obj, u5k u5kVar, boolean z, Class cls) {
        ppl pplVar = obj instanceof ppl ? (ppl) obj : null;
        this.d = pplVar;
        c5n.w(pplVar != null);
        this.a = u5kVar;
        this.b = z;
        this.c = cls;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        u5k u5kVar2 = this.a;
        if (u5kVar2 != null ? u5kVar2.equals(u5kVar) || (this.b && u5kVar2.b == u5kVar.a) : this.c.isAssignableFrom(u5kVar.a)) {
            return new nyj(this.d, gson, u5kVar, this, true);
        }
        return null;
    }
}

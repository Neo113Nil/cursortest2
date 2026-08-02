package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w4n implements nap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ map c;

    public /* synthetic */ w4n(Class cls, map mapVar, int i) {
        this.a = i;
        this.b = cls;
        this.c = mapVar;
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        int i = this.a;
        map mapVar = this.c;
        Class cls = this.b;
        switch (i) {
            case 0:
                if (z6nVar.a == cls) {
                    return mapVar;
                }
                return null;
            default:
                Class<?> cls2 = z6nVar.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new d5n(this, mapVar, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.a;
        Class cls = this.b;
        map mapVar = this.c;
        switch (i) {
            case 0:
                String name = cls.getName();
                String valueOf = String.valueOf(mapVar);
                StringBuilder sb = new StringBuilder(name.length() + 22 + valueOf.length() + 1);
                bf3.v(sb, "Factory[type=", name, ",adapter=", valueOf);
                sb.append(U3.j.e);
                return sb.toString();
            default:
                String name2 = cls.getName();
                String valueOf2 = String.valueOf(mapVar);
                StringBuilder sb2 = new StringBuilder(name2.length() + 31 + valueOf2.length() + 1);
                bf3.v(sb2, "Factory[typeHierarchy=", name2, ",adapter=", valueOf2);
                sb2.append(U3.j.e);
                return sb2.toString();
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f0d extends qtb implements hia {
    public final lee d;
    public Object e;

    public f0d(lee leeVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.d = leeVar;
        this.e = obj2;
    }

    @Override // defpackage.qtb, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.qtb, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        iee ieeVar = (iee) this.d.b;
        gee geeVar = ieeVar.e;
        Object obj3 = this.b;
        if (!geeVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ieeVar.c;
        if (!z) {
            geeVar.put(obj3, obj);
        } else {
            if (!z) {
                yhk.d();
                return null;
            }
            w0k w0kVar = ((w0k[]) ieeVar.d)[ieeVar.b];
            Object obj4 = w0kVar.b[w0kVar.d];
            geeVar.put(obj3, obj);
            ieeVar.f(obj4 != null ? obj4.hashCode() : 0, geeVar.c, obj4, 0);
        }
        ieeVar.h = geeVar.e;
        return obj2;
    }
}

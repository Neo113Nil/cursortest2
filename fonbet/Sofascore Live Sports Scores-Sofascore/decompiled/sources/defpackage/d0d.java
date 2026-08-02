package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d0d extends qtb implements hia {
    public final lee d;
    public Object e;

    public d0d(lee leeVar, Object obj, Object obj2) {
        super(1, obj, obj2);
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
        hee heeVar = (hee) this.d.b;
        fee feeVar = heeVar.e;
        Object obj3 = this.b;
        if (!feeVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = heeVar.c;
        if (!z) {
            feeVar.put(obj3, obj);
        } else {
            if (!z) {
                yhk.d();
                return null;
            }
            w0k w0kVar = ((w0k[]) heeVar.d)[heeVar.b];
            Object obj4 = w0kVar.b[w0kVar.d];
            feeVar.put(obj3, obj);
            heeVar.f(obj4 != null ? obj4.hashCode() : 0, feeVar.c, obj4, 0, 0, false);
        }
        heeVar.h = feeVar.e;
        return obj2;
    }
}

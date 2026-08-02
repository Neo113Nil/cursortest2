package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class e0d extends qtb implements hia {
    public final vee d;
    public obb e;
    public final int f;

    public e0d(vee veeVar, Object obj, obb obbVar) {
        super(1, obj, obbVar.a);
        this.d = veeVar;
        this.e = obbVar;
        this.f = veeVar.d.e;
    }

    @Override // defpackage.qtb, java.util.Map.Entry
    public final Object getValue() {
        return this.e.a;
    }

    @Override // defpackage.qtb, java.util.Map.Entry
    public final Object setValue(Object obj) {
        obb obbVar = this.e;
        Object obj2 = obbVar.a;
        obb obbVar2 = new obb(obj, obbVar.b, obbVar.c);
        this.e = obbVar2;
        vee veeVar = this.d;
        fee feeVar = veeVar.d;
        int i = feeVar.e;
        int i2 = this.f;
        Object obj3 = this.b;
        if (i != i2) {
            veeVar.put(obj3, obj);
            return obj2;
        }
        veeVar.a = null;
        feeVar.put(obj3, obbVar2);
        return obj2;
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pf2 extends dh0 {
    public int g;

    @Override // defpackage.fhh, java.util.Map
    public final void clear() {
        this.g = 0;
        super.clear();
    }

    @Override // defpackage.fhh
    public final void h(fhh fhhVar) {
        this.g = 0;
        super.h(fhhVar);
    }

    @Override // defpackage.fhh, java.util.Map
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.g = hashCode;
        return hashCode;
    }

    @Override // defpackage.fhh
    public final Object i(int i) {
        this.g = 0;
        return super.i(i);
    }

    @Override // defpackage.fhh
    public final Object j(int i, Object obj) {
        this.g = 0;
        return super.j(i, obj);
    }

    @Override // defpackage.fhh, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = 0;
        return super.put(obj, obj2);
    }
}

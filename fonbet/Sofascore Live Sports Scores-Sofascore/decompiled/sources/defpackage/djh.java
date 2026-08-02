package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class djh extends vv9 {
    public final transient Object d;

    public djh(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.vv9, defpackage.wu9
    public final hv9 d() {
        return hv9.z(this.d);
    }

    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.vv9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return false;
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return new oca(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return U3.j.d + this.d.toString() + ']';
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}

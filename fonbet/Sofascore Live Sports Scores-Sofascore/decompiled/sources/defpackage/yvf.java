package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yvf extends vv9 {
    public final transient lv9 d;
    public final transient zvf e;

    public yvf(lv9 lv9Var, zvf zvfVar) {
        this.d = lv9Var;
        this.e = zvfVar;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.vv9, defpackage.wu9
    public final hv9 d() {
        return this.e;
    }

    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        return this.e.e(i, objArr);
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return true;
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((awf) this.d).f;
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}

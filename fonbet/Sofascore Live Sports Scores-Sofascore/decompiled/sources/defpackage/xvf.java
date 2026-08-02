package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xvf extends vv9 {
    public final transient lv9 d;
    public final transient Object[] e;
    public final transient int f;

    public xvf(lv9 lv9Var, Object[] objArr, int i) {
        this.d = lv9Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        return d().e(i, objArr);
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return true;
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.vv9
    public final hv9 v() {
        return new wvf(this);
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}

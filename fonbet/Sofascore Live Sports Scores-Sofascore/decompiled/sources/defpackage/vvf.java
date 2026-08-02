package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vvf extends hv9 {
    public static final vvf e = new vvf(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public vvf(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.hv9, defpackage.wu9
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z1a.v(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.wu9
    public final Object[] m() {
        return this.c;
    }

    @Override // defpackage.wu9
    public final int n() {
        return this.d;
    }

    @Override // defpackage.wu9
    public final int o() {
        return 0;
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.hv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}

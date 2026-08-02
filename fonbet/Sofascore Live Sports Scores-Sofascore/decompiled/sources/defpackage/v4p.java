package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v4p extends q3p {
    public static final v4p e = new v4p(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public v4p(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jca.e0(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.j3p
    public final Object[] m() {
        return this.c;
    }

    @Override // defpackage.j3p
    public final int n() {
        return 0;
    }

    @Override // defpackage.j3p
    public final int o() {
        return this.d;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return false;
    }

    @Override // defpackage.q3p, defpackage.j3p
    public final int r(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

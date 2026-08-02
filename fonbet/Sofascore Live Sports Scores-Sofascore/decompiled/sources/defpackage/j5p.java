package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j5p extends c4p {
    public static final Object[] i;
    public static final j5p j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new j5p(0, 0, 0, objArr, objArr);
    }

    public j5p(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int T = bea.T(obj);
                while (true) {
                    int i2 = T & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    T = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.c4p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.j3p
    public final Object[] m() {
        return this.d;
    }

    @Override // defpackage.j3p
    public final int n() {
        return 0;
    }

    @Override // defpackage.j3p
    public final int o() {
        return this.h;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return false;
    }

    @Override // defpackage.j3p
    public final int r(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.h;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // defpackage.c4p
    public final q3p v() {
        return q3p.v(this.h, this.d);
    }
}

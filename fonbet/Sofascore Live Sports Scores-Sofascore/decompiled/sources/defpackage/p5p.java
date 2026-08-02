package defpackage;

import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p5p extends c4p {
    public final transient Object d;

    public p5p(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return new j4p(this.d);
    }

    @Override // defpackage.c4p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new j4p(this.d);
    }

    @Override // defpackage.c4p, defpackage.j3p
    public final q3p p() {
        m3p m3pVar = q3p.b;
        Object[] objArr = {this.d};
        pea.I(0, objArr[0]);
        return q3p.v(1, objArr);
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return false;
    }

    @Override // defpackage.j3p
    public final int r(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.d.toString();
        return wt3.m(U3.j.d, obj, new StringBuilder(String.valueOf(obj).length() + 2), U3.j.e);
    }
}

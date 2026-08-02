package defpackage;

import com.google.common.collect.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class sv9 extends wu9 implements Collection {
    public static final /* synthetic */ int d = 0;
    public transient vvf b;
    public transient vv9 c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((dwf) this).e.b(obj) > 0;
    }

    @Override // defpackage.wu9
    public final hv9 d() {
        vvf vvfVar = this.b;
        if (vvfVar != null) {
            return vvfVar;
        }
        hv9 d2 = super.d();
        this.b = (vvf) d2;
        return d2;
    }

    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        cck it = s().iterator();
        while (it.hasNext()) {
            qjd qjdVar = (qjd) it.next();
            Arrays.fill(objArr, i, qjdVar.a() + i, qjdVar.a);
            i += qjdVar.a();
        }
        return i;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sv9)) {
            return false;
        }
        sv9 sv9Var = (sv9) obj;
        dwf dwfVar = (dwf) this;
        if (dwfVar.f != sv9Var.size() || s().size() != sv9Var.s().size()) {
            return false;
        }
        for (qjd qjdVar : sv9Var.s()) {
            if (dwfVar.e.b(qjdVar.a) != qjdVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return w1a.s(s());
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return new pv9(s().iterator());
    }

    public abstract vv9 r();

    public final vv9 s() {
        vv9 vv9Var = this.c;
        if (vv9Var == null) {
            vv9Var = isEmpty() ? ewf.j : new a(this);
            this.c = vv9Var;
        }
        return vv9Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s().toString();
    }

    @Override // defpackage.wu9
    public abstract Object writeReplace();
}

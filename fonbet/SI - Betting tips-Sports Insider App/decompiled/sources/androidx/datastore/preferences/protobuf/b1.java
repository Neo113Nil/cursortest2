package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.k6;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1578a;

    /* renamed from: b, reason: collision with root package name */
    public int f1579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1580c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f1581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f1582e;

    public /* synthetic */ b1(AbstractMap abstractMap, int i5) {
        this.f1578a = i5;
        this.f1582e = abstractMap;
        this.f1579b = -1;
    }

    public Iterator a() {
        switch (this.f1578a) {
            case 0:
                if (this.f1581d == null) {
                    this.f1581d = ((z0) this.f1582e).f1734b.entrySet().iterator();
                }
                break;
            default:
                if (this.f1581d == null) {
                    this.f1581d = ((com.logrocket.protobuf.i1) this.f1582e).f6732c.entrySet().iterator();
                }
                break;
        }
        return this.f1581d;
    }

    public Iterator b() {
        if (this.f1581d == null) {
            this.f1581d = ((j6) this.f1582e).f5100c.entrySet().iterator();
        }
        return this.f1581d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1578a) {
            case 0:
                int i5 = this.f1579b + 1;
                z0 z0Var = (z0) this.f1582e;
                if (i5 >= z0Var.f1733a.size()) {
                    return !z0Var.f1734b.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i10 = this.f1579b + 1;
                j6 j6Var = (j6) this.f1582e;
                if (i10 >= j6Var.f5099b) {
                    return !j6Var.f5100c.isEmpty() && b().hasNext();
                }
                return true;
            default:
                int i11 = this.f1579b + 1;
                com.logrocket.protobuf.i1 i1Var = (com.logrocket.protobuf.i1) this.f1582e;
                if (i11 >= i1Var.f6731b.size()) {
                    return !i1Var.f6732c.isEmpty() && a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1578a) {
            case 0:
                this.f1580c = true;
                int i5 = this.f1579b + 1;
                this.f1579b = i5;
                z0 z0Var = (z0) this.f1582e;
                return i5 < z0Var.f1733a.size() ? (Map.Entry) z0Var.f1733a.get(this.f1579b) : (Map.Entry) a().next();
            case 1:
                this.f1580c = true;
                int i10 = this.f1579b + 1;
                this.f1579b = i10;
                j6 j6Var = (j6) this.f1582e;
                return i10 < j6Var.f5099b ? (k6) j6Var.f5098a[i10] : (Map.Entry) b().next();
            default:
                this.f1580c = true;
                int i11 = this.f1579b + 1;
                this.f1579b = i11;
                com.logrocket.protobuf.i1 i1Var = (com.logrocket.protobuf.i1) this.f1582e;
                return i11 < i1Var.f6731b.size() ? (Map.Entry) i1Var.f6731b.get(this.f1579b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i5 = this.f1578a;
        AbstractMap abstractMap = this.f1582e;
        switch (i5) {
            case 0:
                z0 z0Var = (z0) abstractMap;
                if (!this.f1580c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1580c = false;
                int i10 = z0.f1732f;
                z0Var.c();
                if (this.f1579b >= z0Var.f1733a.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f1579b;
                this.f1579b = i11 - 1;
                z0Var.i(i11);
                return;
            case 1:
                if (!this.f1580c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1580c = false;
                j6 j6Var = (j6) abstractMap;
                j6Var.g();
                int i12 = this.f1579b;
                if (i12 >= j6Var.f5099b) {
                    b().remove();
                    return;
                } else {
                    this.f1579b = i12 - 1;
                    j6Var.e(i12);
                    return;
                }
            default:
                com.logrocket.protobuf.i1 i1Var = (com.logrocket.protobuf.i1) abstractMap;
                if (!this.f1580c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1580c = false;
                int i13 = com.logrocket.protobuf.i1.f6729g;
                i1Var.c();
                if (this.f1579b >= i1Var.f6731b.size()) {
                    a().remove();
                    return;
                }
                int i14 = this.f1579b;
                this.f1579b = i14 - 1;
                i1Var.h(i14);
                return;
        }
    }

    public /* synthetic */ b1(j6 j6Var) {
        this.f1578a = 1;
        Objects.requireNonNull(j6Var);
        this.f1582e = j6Var;
        this.f1579b = -1;
    }
}

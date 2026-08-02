package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19219a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19220b;

    public t0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19220b = delegate;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f19219a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i5) {
        switch (this.f19219a) {
            case 0:
                return ((List) this.f19220b).get(a0.t(i5, this));
            default:
                String group = ((kotlin.text.n) this.f19220b).f19280a.group(i5);
                return group == null ? "" : group;
        }
    }

    @Override // kotlin.collections.a
    public final int getSize() {
        switch (this.f19219a) {
            case 0:
                return ((List) this.f19220b).size();
            default:
                return ((kotlin.text.n) this.f19220b).f19280a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f19219a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f19219a) {
            case 0:
                return new s0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f19219a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator() {
        switch (this.f19219a) {
            case 0:
                return new s0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator(int i5) {
        switch (this.f19219a) {
            case 0:
                return new s0(this, i5);
            default:
                return super.listIterator(i5);
        }
    }

    public t0(kotlin.text.n nVar) {
        this.f19220b = nVar;
    }
}

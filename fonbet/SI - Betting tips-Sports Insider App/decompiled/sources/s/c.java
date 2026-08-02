package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f22545a;

    /* renamed from: b, reason: collision with root package name */
    public int f22546b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f22548d;

    public c(e eVar) {
        this.f22548d = eVar;
        this.f22545a = eVar.f22575c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f22547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.f22546b;
        e eVar = this.f22548d;
        return Intrinsics.areEqual(key, eVar.g(i5)) && Intrinsics.areEqual(entry.getValue(), eVar.j(this.f22546b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f22547c) {
            return this.f22548d.g(this.f22546b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f22547c) {
            return this.f22548d.j(this.f22546b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22546b < this.f22545a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f22547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.f22546b;
        e eVar = this.f22548d;
        Object g10 = eVar.g(i5);
        Object j = eVar.j(this.f22546b);
        return (g10 == null ? 0 : g10.hashCode()) ^ (j != null ? j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22546b++;
        this.f22547c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22547c) {
            throw new IllegalStateException();
        }
        this.f22548d.h(this.f22546b);
        this.f22546b--;
        this.f22545a--;
        this.f22547c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f22547c) {
            return this.f22548d.i(this.f22546b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

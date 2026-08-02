package f8;

import com.google.android.gms.internal.measurement.d5;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends t implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f9495b;

    /* renamed from: c, reason: collision with root package name */
    public int f9496c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i5) {
        super(0);
        int size = eVar.size();
        d5.g(i5, size);
        this.f9495b = size;
        this.f9496c = i5;
        this.f9497d = eVar;
    }

    public final Object a(int i5) {
        return this.f9497d.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9496c < this.f9495b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9496c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f9496c;
        this.f9496c = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9496c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f9496c - 1;
        this.f9496c = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9496c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

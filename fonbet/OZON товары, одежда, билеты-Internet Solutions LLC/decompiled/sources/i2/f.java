package i2;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class f extends C6999b implements Iterable<C7001d> {

    private static class a implements Iterator<C7001d> {

        /* renamed from: a, reason: collision with root package name */
        f f65760a;

        /* renamed from: b, reason: collision with root package name */
        int f65761b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f65761b < this.f65760a.f65754e.size();
        }

        @Override // java.util.Iterator
        public final C7001d next() {
            C7001d c7001d = (C7001d) this.f65760a.f65754e.get(this.f65761b);
            this.f65761b++;
            return c7001d;
        }
    }

    @Override // i2.C6999b
    @NonNull
    /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f a() {
        return (f) super.a();
    }

    @Override // i2.C6999b, i2.C7000c
    @NonNull
    public final Object clone() throws CloneNotSupportedException {
        return (f) super.a();
    }

    @Override // java.lang.Iterable
    public final Iterator<C7001d> iterator() {
        a aVar = new a();
        aVar.f65761b = 0;
        aVar.f65760a = this;
        return aVar;
    }
}

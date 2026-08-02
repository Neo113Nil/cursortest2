package bi;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes5.dex */
public abstract class i {

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        public int f25222a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f25223b;

        public a(f fVar) {
            this.f25223b = fVar;
            this.f25222a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f25223b;
            int d10 = fVar.d();
            int i10 = this.f25222a;
            this.f25222a = i10 - 1;
            return fVar.g(d10 - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25222a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        public int f25224a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f25225b;

        public b(f fVar) {
            this.f25225b = fVar;
            this.f25224a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f25225b;
            int d10 = fVar.d();
            int i10 = this.f25224a;
            this.f25224a = i10 - 1;
            return fVar.e(d10 - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25224a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f25226a;

        public c(f fVar) {
            this.f25226a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f25226a);
        }
    }

    public static final class d implements Iterable, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f25227a;

        public d(f fVar) {
            this.f25227a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f25227a);
        }
    }

    public static final Iterable a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new d(fVar);
    }
}

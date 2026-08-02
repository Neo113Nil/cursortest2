package E;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class k implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f2919a;

    /* renamed from: b, reason: collision with root package name */
    public int f2920b;

    @NotNull
    private Object[] buffer = j.f2914c.a().h();

    public final j a() {
        F.a.a(e());
        Object obj = this.buffer[this.f2920b];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (j) obj;
    }

    public final Object[] b() {
        return this.buffer;
    }

    public final int c() {
        return this.f2920b;
    }

    public final boolean d() {
        return this.f2920b < this.f2919a;
    }

    public final boolean e() {
        F.a.a(this.f2920b >= this.f2919a);
        return this.f2920b < this.buffer.length;
    }

    public final void f() {
        F.a.a(e());
        this.f2920b++;
    }

    public final void g(Object[] objArr, int i10) {
        h(objArr, i10, 0);
    }

    public final void h(Object[] objArr, int i10, int i11) {
        this.buffer = objArr;
        this.f2919a = i10;
        this.f2920b = i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return d();
    }

    public final void i(int i10) {
        this.f2920b = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

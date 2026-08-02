package x2;

import android.util.LongSparseArray;
import kotlin.collections.S;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10647b extends S {

    /* renamed from: a, reason: collision with root package name */
    private int f104933a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LongSparseArray<Object> f104934b;

    C10647b(LongSparseArray<Object> longSparseArray) {
        this.f104934b = longSparseArray;
    }

    @Override // kotlin.collections.S
    public final long b() {
        int i11 = this.f104933a;
        this.f104933a = i11 + 1;
        return this.f104934b.keyAt(i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f104933a < this.f104934b.size();
    }
}

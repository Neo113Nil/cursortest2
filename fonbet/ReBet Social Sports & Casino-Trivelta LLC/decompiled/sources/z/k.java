package z;

import kotlin.collections.ArraysKt;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public int f68458c;

    public k(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        h(o.d(i10));
    }

    public final void f() {
        this.f68458c = o.a(c()) - this.f68461b;
    }

    public final void g(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = o.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        f();
    }

    public final void h(int i10) {
        int max = i10 > 0 ? Math.max(7, o.c(i10)) : 0;
        this.f68460a = max;
        g(max);
        this.keys = new Object[max];
        this.values = new Object[max];
    }
}

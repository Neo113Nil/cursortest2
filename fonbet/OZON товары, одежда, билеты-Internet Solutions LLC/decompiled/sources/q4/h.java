package q4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.i;
import l3.C7855a;
import m3.N;

/* loaded from: classes8.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final c f81617a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f81618b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f81619c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f81620d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f81621e;

    public h(c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f81617a = cVar;
        this.f81620d = hashMap2;
        this.f81621e = hashMap3;
        this.f81619c = Collections.unmodifiableMap(hashMap);
        this.f81618b = cVar.h();
    }

    @Override // k4.i
    public final long a(int i11) {
        return this.f81618b[i11];
    }

    @Override // k4.i
    public final int b() {
        return this.f81618b.length;
    }

    @Override // k4.i
    public final int c(long j11) {
        long[] jArr = this.f81618b;
        int a11 = N.a(jArr, j11, false);
        if (a11 < jArr.length) {
            return a11;
        }
        return -1;
    }

    @Override // k4.i
    public final List<C7855a> d(long j11) {
        return this.f81617a.f(j11, this.f81619c, this.f81620d, this.f81621e);
    }
}

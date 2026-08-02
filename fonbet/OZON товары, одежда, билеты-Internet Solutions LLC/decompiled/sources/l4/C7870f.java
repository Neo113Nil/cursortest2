package l4;

import java.util.Collections;
import java.util.List;
import k4.i;
import l3.C7855a;

/* renamed from: l4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7870f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final List<C7855a> f72764a;

    public C7870f(List<C7855a> list) {
        this.f72764a = list;
    }

    @Override // k4.i
    public final long a(int i11) {
        G10.a.c(i11 == 0);
        return 0L;
    }

    @Override // k4.i
    public final int b() {
        return 1;
    }

    @Override // k4.i
    public final int c(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // k4.i
    public final List<C7855a> d(long j11) {
        return j11 >= 0 ? this.f72764a : Collections.EMPTY_LIST;
    }
}

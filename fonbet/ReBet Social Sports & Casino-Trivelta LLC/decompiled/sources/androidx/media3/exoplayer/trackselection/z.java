package androidx.media3.exoplayer.trackselection;

import b1.P;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends AbstractC2227c {

    /* renamed from: f, reason: collision with root package name */
    public final int f22088f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22089g;

    public z(P p10, int i10, int i11) {
        this(p10, i10, i11, 0, null);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int d() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public Object j() {
        return this.f22089g;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int s() {
        return this.f22088f;
    }

    public z(P p10, int i10, int i11, int i12, Object obj) {
        super(p10, new int[]{i10}, i11);
        this.f22088f = i12;
        this.f22089g = obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void n(long j10, long j11, long j12, List list, B1.n[] nVarArr) {
    }
}

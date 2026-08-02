package t2;

import android.util.SparseLongArray;
import b1.C2340I;

/* loaded from: classes.dex */
public final class j1 implements m1.Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseLongArray f65393a = new SparseLongArray();

    /* renamed from: b, reason: collision with root package name */
    public long f65394b;

    @Override // m1.Q0
    public long H() {
        return this.f65394b;
    }

    public void a(int i10, long j10) {
        long j11 = this.f65393a.get(i10, -9223372036854775807L);
        if (j11 == -9223372036854775807L || j10 > j11) {
            this.f65393a.put(i10, j10);
            if (j11 == -9223372036854775807L || j11 == this.f65394b) {
                this.f65394b = e1.Z.Z0(this.f65393a);
            }
        }
    }

    @Override // m1.Q0
    public C2340I d() {
        return C2340I.f24312d;
    }

    @Override // m1.Q0
    public void e(C2340I c2340i) {
    }
}

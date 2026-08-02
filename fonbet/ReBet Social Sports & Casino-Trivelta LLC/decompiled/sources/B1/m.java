package B1;

import e1.AbstractC4134a;
import h1.C4418n;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: j, reason: collision with root package name */
    public final long f605j;

    public m(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12) {
        super(interfaceC4411g, c4418n, 1, aVar, i10, obj, j10, j11);
        AbstractC4134a.e(aVar);
        this.f605j = j12;
    }

    public long g() {
        long j10 = this.f605j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}

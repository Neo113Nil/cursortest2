package k4;

import N3.H;
import N3.M;
import android.util.SparseArray;
import k4.o;

/* loaded from: classes.dex */
public final class p implements N3.r {

    /* renamed from: a, reason: collision with root package name */
    private final N3.r f70478a;

    /* renamed from: b, reason: collision with root package name */
    private final o.a f70479b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<r> f70480c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f70481d;

    public p(N3.r rVar, o.a aVar) {
        this.f70478a = rVar;
        this.f70479b = aVar;
    }

    @Override // N3.r
    public final void endTracks() {
        this.f70478a.endTracks();
        if (!this.f70481d) {
            return;
        }
        int i11 = 0;
        while (true) {
            SparseArray<r> sparseArray = this.f70480c;
            if (i11 >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i11).i();
            i11++;
        }
    }

    @Override // N3.r
    public final void seekMap(H h11) {
        this.f70478a.seekMap(h11);
    }

    @Override // N3.r
    public final M track(int i11, int i12) {
        N3.r rVar = this.f70478a;
        if (i12 != 3) {
            this.f70481d = true;
            return rVar.track(i11, i12);
        }
        SparseArray<r> sparseArray = this.f70480c;
        r rVar2 = sparseArray.get(i11);
        if (rVar2 != null) {
            return rVar2;
        }
        r rVar3 = new r(rVar.track(i11, i12), this.f70479b);
        sparseArray.put(i11, rVar3);
        return rVar3;
    }
}

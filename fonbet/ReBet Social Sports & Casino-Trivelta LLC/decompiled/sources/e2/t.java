package e2;

import H1.J;
import H1.O;
import android.util.SparseArray;
import e2.s;

/* loaded from: classes.dex */
public final class t implements H1.r {

    /* renamed from: a, reason: collision with root package name */
    public final H1.r f45621a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f45622b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f45623c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public boolean f45624d;

    public t(H1.r rVar, s.a aVar) {
        this.f45621a = rVar;
        this.f45622b = aVar;
    }

    @Override // H1.r
    public O c(int i10, int i11) {
        if (i11 != 3) {
            this.f45624d = true;
            return this.f45621a.c(i10, i11);
        }
        v vVar = (v) this.f45623c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f45621a.c(i10, i11), this.f45622b);
        this.f45623c.put(i10, vVar2);
        return vVar2;
    }

    @Override // H1.r
    public void q(J j10) {
        this.f45621a.q(j10);
    }

    @Override // H1.r
    public void s() {
        this.f45621a.s();
        if (this.f45624d) {
            for (int i10 = 0; i10 < this.f45623c.size(); i10++) {
                ((v) this.f45623c.valueAt(i10)).k(true);
            }
        }
    }
}

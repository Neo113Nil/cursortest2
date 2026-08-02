package ge;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends androidx.recyclerview.widget.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9957d;

    /* renamed from: e, reason: collision with root package name */
    public List f9958e;

    /* renamed from: f, reason: collision with root package name */
    public List f9959f;

    @Override // androidx.recyclerview.widget.d
    public final boolean a(int i5, int i10) {
        switch (this.f9957d) {
            case 0:
                hc.f fVar = (hc.f) this.f9958e.get(i5);
                hc.f fVar2 = (hc.f) this.f9959f.get(i10);
                if (fVar instanceof nc.b) {
                    return fVar.areContentsTheSame(fVar2);
                }
                if (fVar instanceof hc.b) {
                    return ((hc.b) fVar).areContentsTheSame(fVar2);
                }
                return false;
            default:
                hc.f fVar3 = (hc.f) this.f9958e.get(i5);
                hc.f fVar4 = (hc.f) this.f9959f.get(i10);
                if ((fVar3 instanceof hc.g) || (fVar3 instanceof hc.a) || (fVar3 instanceof hc.e)) {
                    return true;
                }
                if (fVar3 instanceof hc.d) {
                    return ((hc.d) fVar3).areContentsTheSame(fVar4);
                }
                if (fVar3 instanceof hc.i) {
                    return true;
                }
                if (fVar3 instanceof ja.c) {
                    return ((ja.c) fVar3).areContentsTheSame(fVar4);
                }
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final boolean b(int i5, int i10) {
        switch (this.f9957d) {
            case 0:
                hc.f fVar = (hc.f) this.f9958e.get(i5);
                hc.f fVar2 = (hc.f) this.f9959f.get(i10);
                if (fVar instanceof nc.b) {
                    return fVar.areItemsTheSame(fVar2);
                }
                if (fVar instanceof hc.b) {
                    return fVar2 instanceof hc.b;
                }
                return false;
            default:
                hc.f fVar3 = (hc.f) this.f9958e.get(i5);
                hc.f fVar4 = (hc.f) this.f9959f.get(i10);
                if (fVar3 instanceof hc.g) {
                    return fVar4 instanceof hc.g;
                }
                if (fVar3 instanceof hc.a) {
                    return fVar4 instanceof hc.a;
                }
                if (fVar3 instanceof hc.e) {
                    return fVar4 instanceof hc.e;
                }
                if (fVar3 instanceof hc.d) {
                    return fVar4 instanceof hc.d;
                }
                if (fVar3 instanceof hc.i) {
                    return fVar4 instanceof hc.i;
                }
                if (fVar3 instanceof ja.c) {
                    return ((ja.c) fVar3).areItemsTheSame(fVar4);
                }
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final Object g(int i5, int i10) {
        switch (this.f9957d) {
        }
        return ((hc.f) this.f9958e.get(i5)).getChangePayload((hc.f) this.f9959f.get(i10));
    }

    @Override // androidx.recyclerview.widget.d
    public final int h() {
        switch (this.f9957d) {
        }
        return this.f9959f.size();
    }

    @Override // androidx.recyclerview.widget.d
    public final int i() {
        switch (this.f9957d) {
        }
        return this.f9958e.size();
    }
}

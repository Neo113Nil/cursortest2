package m2;

import f2.C6403c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends e {

    /* renamed from: v0, reason: collision with root package name */
    public ArrayList<e> f74253v0 = new ArrayList<>();

    public void Z0() {
        ArrayList<e> arrayList = this.f74253v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f74253v0.get(i11);
            if (eVar instanceof n) {
                ((n) eVar).Z0();
            }
        }
    }

    public final void b(e eVar) {
        this.f74253v0.add(eVar);
        e eVar2 = eVar.f74116W;
        if (eVar2 != null) {
            ((n) eVar2).f74253v0.remove(eVar);
            eVar.i0();
        }
        eVar.f74116W = this;
    }

    @Override // m2.e
    public void i0() {
        this.f74253v0.clear();
        super.i0();
    }

    @Override // m2.e
    public final void l0(C6403c c6403c) {
        super.l0(c6403c);
        int size = this.f74253v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f74253v0.get(i11).l0(c6403c);
        }
    }
}

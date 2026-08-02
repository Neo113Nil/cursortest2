package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import n2.o;

/* loaded from: classes.dex */
public class j extends e implements i {

    /* renamed from: v0, reason: collision with root package name */
    public e[] f74239v0 = new e[4];

    /* renamed from: w0, reason: collision with root package name */
    public int f74240w0 = 0;

    public final void Z0(int i11, ArrayList arrayList, o oVar) {
        for (int i12 = 0; i12 < this.f74240w0; i12++) {
            oVar.a(this.f74239v0[i12]);
        }
        for (int i13 = 0; i13 < this.f74240w0; i13++) {
            n2.i.a(this.f74239v0[i13], i11, arrayList, oVar);
        }
    }

    @Override // m2.i
    public final void a() {
        this.f74240w0 = 0;
        Arrays.fill(this.f74239v0, (Object) null);
    }

    @Override // m2.i
    public final void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i11 = this.f74240w0 + 1;
        e[] eVarArr = this.f74239v0;
        if (i11 > eVarArr.length) {
            this.f74239v0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f74239v0;
        int i12 = this.f74240w0;
        eVarArr2[i12] = eVar;
        this.f74240w0 = i12 + 1;
    }

    @Override // m2.i
    public void c() {
    }

    @Override // m2.e
    public void k(e eVar, HashMap<e, e> hashMap) {
        super.k(eVar, hashMap);
        j jVar = (j) eVar;
        this.f74240w0 = 0;
        int i11 = jVar.f74240w0;
        for (int i12 = 0; i12 < i11; i12++) {
            b(hashMap.get(jVar.f74239v0[i12]));
        }
    }
}

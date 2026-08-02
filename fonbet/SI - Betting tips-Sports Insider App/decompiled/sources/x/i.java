package x;

import java.util.ArrayList;
import y.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f25368q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f25369r0 = 0;

    public final void R(int i5, ArrayList arrayList, m mVar) {
        for (int i10 = 0; i10 < this.f25369r0; i10++) {
            d dVar = this.f25368q0[i10];
            ArrayList arrayList2 = mVar.f25508a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f25369r0; i11++) {
            y.g.b(this.f25368q0[i11], i5, arrayList, mVar);
        }
    }

    public void S() {
    }
}

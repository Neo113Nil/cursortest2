package g4;

import d4.l;
import kotlin.text.z;
import okio.BufferedSource;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements d4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9763a;

    public /* synthetic */ g(int i5) {
        this.f9763a = i5;
    }

    @Override // d4.k
    public final l a(f4.l lVar, n nVar) {
        switch (this.f9763a) {
            case 0:
                BufferedSource m02 = lVar.f9459a.m0();
                if (m02.rangeEquals(0L, f.f9755b) || m02.rangeEquals(0L, f.f9754a)) {
                    return new h(lVar.f9459a, nVar);
                }
                return null;
            default:
                String str = lVar.f9460b;
                if (str == null || !z.o(str, "video/", false)) {
                    return null;
                }
                return new w4.d(lVar.f9459a, nVar);
        }
    }
}

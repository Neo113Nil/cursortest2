package m2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements e0, k2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20244b;

    public /* synthetic */ l(int i5, Object obj) {
        this.f20243a = i5;
        this.f20244b = obj;
    }

    @Override // k2.p
    public final Object c(String str, Function1 function1, mf.c cVar) {
        switch (this.f20243a) {
            case 0:
                return ((q) this.f20244b).c(str, function1, cVar);
            default:
                return ((d0) this.f20244b).c(str, function1, cVar);
        }
    }

    @Override // m2.e0
    public final s2.a d() {
        switch (this.f20243a) {
            case 0:
                return ((q) this.f20244b).f20262b;
            default:
                return ((d0) this.f20244b).f20203b;
        }
    }
}

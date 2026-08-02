package eb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements hg.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.g f8819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f8820c;

    public /* synthetic */ i(hg.g gVar, m mVar, int i5) {
        this.f8818a = i5;
        this.f8819b = gVar;
        this.f8820c = mVar;
    }

    @Override // hg.g
    public final Object a(hg.h hVar, Continuation continuation) {
        switch (this.f8818a) {
            case 0:
                Object a7 = this.f8819b.a(new c1.t(hVar, this.f8820c, 1), continuation);
                if (a7 != lf.a.f20034a) {
                    break;
                }
                break;
            default:
                Object a10 = this.f8819b.a(new c1.t(hVar, this.f8820c, 3), continuation);
                if (a10 != lf.a.f20034a) {
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}

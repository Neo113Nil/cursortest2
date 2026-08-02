package id;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements hg.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.g f11197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11199d;

    public /* synthetic */ p(hg.g gVar, Object obj, Object obj2, int i5) {
        this.f11196a = i5;
        this.f11197b = gVar;
        this.f11198c = obj;
        this.f11199d = obj2;
    }

    @Override // hg.g
    public final Object a(hg.h hVar, Continuation continuation) {
        switch (this.f11196a) {
            case 0:
                Object a7 = ((ge.q) this.f11197b).a(new o(hVar, (x) this.f11198c, (mc.a) this.f11199d, 0), continuation);
                if (a7 != lf.a.f20034a) {
                    break;
                }
                break;
            case 1:
                Object a10 = this.f11197b.a(new o(hVar, (k2.w) this.f11198c, (Function1) this.f11199d, 2), continuation);
                if (a10 != lf.a.f20034a) {
                    break;
                }
                break;
            default:
                Object a11 = ((u) this.f11197b).a(new bd.f(hVar, (pb.e) this.f11198c, (String) this.f11199d), continuation);
                if (a11 != lf.a.f20034a) {
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}

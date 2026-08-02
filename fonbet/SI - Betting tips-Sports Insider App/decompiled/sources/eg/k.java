package eg;

import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9184b;

    public /* synthetic */ k(int i5, Object obj) {
        this.f9183a = i5;
        this.f9184b = obj;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9183a) {
            case 0:
                ((a2.f) this.f9184b).invoke((Throwable) obj);
                break;
            case 1:
                ng.c cVar = (ng.c) this.f9184b;
                ng.c.f20894h.set(cVar, null);
                cVar.k(null);
                break;
            default:
                ((ng.h) this.f9184b).d();
                break;
        }
        return Unit.f19194a;
    }

    public /* synthetic */ k(ng.c cVar, ng.b bVar) {
        this.f9183a = 1;
        this.f9184b = cVar;
    }
}

package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final gg.z f11293a;

    public x(gg.w wVar) {
        this.f11293a = wVar;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        Object h10 = this.f11293a.h(obj, continuation);
        return h10 == lf.a.f20034a ? h10 : Unit.f19194a;
    }
}

package gg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10057a = new e(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f10064b;
        hVar.getClass();
        if (obj3 == j.f10084l) {
            obj3 = new m(hVar.q());
        }
        return new o(obj3);
    }
}

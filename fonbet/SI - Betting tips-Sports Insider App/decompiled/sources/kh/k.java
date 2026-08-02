package kh;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k extends jh.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f19124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f19125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, v vVar, l lVar) {
        super(str);
        this.f19124e = vVar;
        this.f19125f = lVar;
    }

    @Override // jh.a
    public final long a() {
        u uVar;
        v vVar = this.f19124e;
        try {
            uVar = vVar.d();
        } catch (Throwable th2) {
            uVar = new u(vVar, th2, 2);
        }
        l lVar = this.f19125f;
        if (!((CopyOnWriteArrayList) lVar.f19131f).contains(vVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) lVar.f19132g).put(uVar);
        return -1L;
    }
}

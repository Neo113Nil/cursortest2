package oi;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final Class f21275c;

    public k0(Class cls) {
        this.f21275c = cls;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        c4.d dVar = p0Var.f21291e;
        dVar.getClass();
        Class type = this.f21275c;
        Intrinsics.checkNotNullParameter(type, "type");
        ag.c type2 = u6.h.m(type);
        Intrinsics.checkNotNullParameter(type2, "type");
        dVar.f3581f = ((rh.g) dVar.f3581f).E(type2, obj);
    }
}

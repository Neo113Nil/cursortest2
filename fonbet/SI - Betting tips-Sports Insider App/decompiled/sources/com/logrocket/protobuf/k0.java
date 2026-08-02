package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 extends l0 {
    @Override // com.logrocket.protobuf.l0
    public final void a(long j, Object obj) {
        b bVar = (b) ((c0) x1.f6821c.j(j, obj));
        if (bVar.f6668a) {
            bVar.f6668a = false;
        }
    }

    @Override // com.logrocket.protobuf.l0
    public final void b(long j, Object obj, Object obj2) {
        w1 w1Var = x1.f6821c;
        c0 c0Var = (c0) w1Var.j(j, obj);
        c0 c0Var2 = (c0) w1Var.j(j, obj2);
        int size = c0Var.size();
        int size2 = c0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) c0Var).f6668a) {
                c0Var = c0Var.r(size2 + size);
            }
            c0Var.addAll(c0Var2);
        }
        if (size > 0) {
            c0Var2 = c0Var;
        }
        x1.p(j, obj, c0Var2);
    }
}

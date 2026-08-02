package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public s0[] f6749a;

    @Override // com.logrocket.protobuf.s0
    public final c1 a(Class cls) {
        for (s0 s0Var : this.f6749a) {
            if (s0Var.b(cls)) {
                return s0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.logrocket.protobuf.s0
    public final boolean b(Class cls) {
        for (s0 s0Var : this.f6749a) {
            if (s0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}

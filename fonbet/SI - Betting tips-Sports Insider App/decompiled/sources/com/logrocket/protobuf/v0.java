package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f6809a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f6810b;

    /* renamed from: c, reason: collision with root package name */
    public final s f6811c;

    public v0(p1 p1Var, s sVar, a aVar) {
        this.f6810b = p1Var;
        sVar.getClass();
        this.f6811c = sVar;
        this.f6809a = aVar;
    }

    @Override // com.logrocket.protobuf.g1
    public final void a(Object obj, Object obj2) {
        h1.v(this.f6810b, obj, obj2);
    }

    @Override // com.logrocket.protobuf.g1
    public final void b(Object obj) {
        this.f6810b.getClass();
        o1 o1Var = ((z) obj).unknownFields;
        if (o1Var.f6772e) {
            o1Var.f6772e = false;
        }
        this.f6811c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // com.logrocket.protobuf.g1
    public final boolean c(Object obj) {
        this.f6811c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // com.logrocket.protobuf.g1
    public final z d() {
        a aVar = this.f6809a;
        return aVar instanceof z ? (z) ((z) aVar).g(4) : ((x) ((z) aVar).g(5)).b();
    }

    @Override // com.logrocket.protobuf.g1
    public final boolean e(z zVar, z zVar2) {
        this.f6810b.getClass();
        return zVar.unknownFields.equals(zVar2.unknownFields);
    }

    @Override // com.logrocket.protobuf.g1
    public final int f(z zVar) {
        this.f6810b.getClass();
        return zVar.unknownFields.hashCode();
    }

    @Override // com.logrocket.protobuf.g1
    public final void g(Object obj, n0 n0Var) {
        this.f6811c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // com.logrocket.protobuf.g1
    public final int h(z zVar) {
        this.f6810b.getClass();
        o1 o1Var = zVar.unknownFields;
        int i5 = o1Var.f6771d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < o1Var.f6768a; i11++) {
            int i12 = o1Var.f6769b[i11] >>> 3;
            i10 += p.g(3, (j) o1Var.f6770c[i11]) + p.p(i12) + p.o(2) + (p.o(1) * 2);
        }
        o1Var.f6771d = i10;
        return i10;
    }
}

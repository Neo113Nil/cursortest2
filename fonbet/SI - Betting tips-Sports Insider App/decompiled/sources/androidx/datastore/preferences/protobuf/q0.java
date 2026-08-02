package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1685a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f1686b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1687c;

    public q0(f1 f1Var, r rVar, a aVar) {
        this.f1686b = f1Var;
        rVar.getClass();
        this.f1687c = rVar;
        this.f1685a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        y0.k(this.f1686b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj) {
        this.f1686b.getClass();
        e1 e1Var = ((y) obj).unknownFields;
        if (e1Var.f1608e) {
            e1Var.f1608e = false;
        }
        this.f1687c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(Object obj) {
        this.f1687c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final y d() {
        a aVar = this.f1685a;
        return aVar instanceof y ? ((y) aVar).i() : ((w) ((y) aVar).c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void e(Object obj, h0 h0Var) {
        this.f1687c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int f(y yVar) {
        this.f1686b.getClass();
        e1 e1Var = yVar.unknownFields;
        int i5 = e1Var.f1607d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < e1Var.f1604a; i11++) {
            int i12 = e1Var.f1605b[i11] >>> 3;
            i10 += o.c0(3, (i) e1Var.f1606c[i11]) + o.f0(i12) + o.e0(2) + (o.e0(1) * 2);
        }
        e1Var.f1607d = i10;
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int g(y yVar) {
        this.f1686b.getClass();
        return yVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean h(y yVar, y yVar2) {
        this.f1686b.getClass();
        return yVar.unknownFields.equals(yVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void i(Object obj, m mVar, q qVar) {
        this.f1686b.getClass();
        f1.a(obj);
        this.f1687c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}

package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final y f1723a;

    /* renamed from: b, reason: collision with root package name */
    public y f1724b;

    public w(y yVar) {
        this.f1723a = yVar;
        if (yVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1724b = yVar.i();
    }

    public final y a() {
        y b10 = b();
        b10.getClass();
        if (y.f(b10, true)) {
            return b10;
        }
        throw new d1();
    }

    public final y b() {
        if (!this.f1724b.g()) {
            return this.f1724b;
        }
        y yVar = this.f1724b;
        yVar.getClass();
        u0 u0Var = u0.f1715c;
        u0Var.getClass();
        u0Var.a(yVar.getClass()).b(yVar);
        yVar.h();
        return this.f1724b;
    }

    public final Object clone() {
        w wVar = (w) this.f1723a.c(5);
        wVar.f1724b = b();
        return wVar;
    }

    public final void d() {
        if (this.f1724b.g()) {
            return;
        }
        y i5 = this.f1723a.i();
        y yVar = this.f1724b;
        u0 u0Var = u0.f1715c;
        u0Var.getClass();
        u0Var.a(i5.getClass()).a(i5, yVar);
        this.f1724b = i5;
    }
}

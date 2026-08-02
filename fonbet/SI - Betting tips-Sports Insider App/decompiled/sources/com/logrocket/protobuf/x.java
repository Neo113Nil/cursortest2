package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final z f6815a;

    /* renamed from: b, reason: collision with root package name */
    public z f6816b;

    public x(z zVar) {
        this.f6815a = zVar;
        if (zVar.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6816b = (z) zVar.g(4);
    }

    public final z a() {
        z b10 = b();
        b10.getClass();
        boolean z5 = true;
        byte byteValue = ((Byte) b10.g(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z5 = false;
            } else {
                a1 a1Var = a1.f6664c;
                a1Var.getClass();
                z5 = a1Var.a(b10.getClass()).c(b10);
                b10.g(2);
            }
        }
        if (z5) {
            return b10;
        }
        throw new n1("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final z b() {
        if (!this.f6816b.j()) {
            return this.f6816b;
        }
        this.f6816b.k();
        return this.f6816b;
    }

    public final Object clone() {
        x xVar = (x) this.f6815a.g(5);
        xVar.f6816b = b();
        return xVar;
    }

    public final void d() {
        if (this.f6816b.j()) {
            return;
        }
        z zVar = (z) this.f6815a.g(4);
        z zVar2 = this.f6816b;
        a1 a1Var = a1.f6664c;
        a1Var.getClass();
        a1Var.a(zVar.getClass()).a(zVar, zVar2);
        this.f6816b = zVar;
    }
}

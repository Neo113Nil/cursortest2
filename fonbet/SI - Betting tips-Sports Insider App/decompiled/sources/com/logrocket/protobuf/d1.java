package com.logrocket.protobuf;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 extends e {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f6683a;

    /* renamed from: b, reason: collision with root package name */
    public e f6684b = b();

    public d1(f1 f1Var) {
        this.f6683a = new e1(f1Var);
    }

    @Override // com.logrocket.protobuf.e
    public final byte a() {
        e eVar = this.f6684b;
        if (eVar == null) {
            throw new NoSuchElementException();
        }
        byte a7 = eVar.a();
        if (!this.f6684b.hasNext()) {
            this.f6684b = b();
        }
        return a7;
    }

    public final d b() {
        e1 e1Var = this.f6683a;
        if (e1Var.hasNext()) {
            return new d(e1Var.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6684b != null;
    }
}

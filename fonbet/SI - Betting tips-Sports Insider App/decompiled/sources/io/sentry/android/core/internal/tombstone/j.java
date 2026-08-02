package io.sentry.android.core.internal.tombstone;

import s9.k0;
import s9.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final r f15678a;

    /* renamed from: b, reason: collision with root package name */
    public r f15679b;

    public j(r rVar) {
        this.f15678a = rVar;
        if (rVar.d()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f15679b = rVar.e();
    }

    public final r a() {
        if (!this.f15679b.d()) {
            return this.f15679b;
        }
        r rVar = this.f15679b;
        rVar.getClass();
        k0 k0Var = k0.f23346c;
        k0Var.getClass();
        k0Var.a(rVar.getClass()).b(rVar);
        rVar.f23373b &= Integer.MAX_VALUE;
        return this.f15679b;
    }

    public final Object clone() {
        j jVar = (j) this.f15678a.a(5);
        jVar.f15679b = a();
        return jVar;
    }
}

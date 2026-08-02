package fi0;

import android.content.Context;

/* loaded from: classes7.dex */
public final class u implements Jb.e<t> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f63518a;

    /* renamed from: b, reason: collision with root package name */
    private final l f63519b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f63520c;

    public u(Jb.f fVar, l lVar, Jb.f fVar2) {
        this.f63518a = fVar;
        this.f63519b = lVar;
        this.f63520c = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new t((Context) this.f63518a.get(), (j) this.f63519b.get(), (x) this.f63520c.get());
    }
}

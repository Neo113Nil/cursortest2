package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f85097a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f85098b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f85099c;

    public f(Jb.f fVar, Pc.a aVar, Jb.f fVar2) {
        this.f85097a = fVar;
        this.f85098b = aVar;
        this.f85099c = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new e((Context) this.f85097a.get(), this.f85098b.get(), (d.b) this.f85099c.get());
    }
}

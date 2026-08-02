package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class b implements Jb.e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f85084a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f85085b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f85086c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f85087d;

    public b(Jb.f fVar, Pc.a aVar, Jb.f fVar2, Jb.f fVar3) {
        this.f85084a = fVar;
        this.f85085b = aVar;
        this.f85086c = fVar2;
        this.f85087d = fVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new a((Context) this.f85084a.get(), this.f85085b.get(), (ru.ozon.android.messenger.framework.core.initialization.d) this.f85086c.get(), (d.b) this.f85087d.get());
    }
}

package ru.ozon.android.messenger.framework.data.remote.action;

import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.FileApi;

/* loaded from: classes10.dex */
public final class z implements Jb.e<y> {

    /* renamed from: a, reason: collision with root package name */
    private final P80.c f87782a;

    /* renamed from: b, reason: collision with root package name */
    private final Bi0.b f87783b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.m> f87784c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f87785d;

    public z(P80.c cVar, Bi0.b bVar, Pc.a aVar, Jb.f fVar) {
        this.f87782a = cVar;
        this.f87783b = bVar;
        this.f87784c = aVar;
        this.f87785d = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new y((ActionApi) this.f87782a.get(), (FileApi) this.f87783b.get(), this.f87784c.get(), (d.f) this.f87785d.get());
    }
}

package ru.ozon.android.messenger.framework.data.remote.websocket;

import qj.C9067a;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class I implements Jb.e<C9331b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.g> f87922a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.network.serialization.b f87923b;

    /* renamed from: c, reason: collision with root package name */
    private final X60.d f87924c;

    /* renamed from: d, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.di.y f87925d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.q f87926e;

    /* renamed from: f, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.di.z f87927f;

    /* renamed from: g, reason: collision with root package name */
    private final V f87928g;

    /* renamed from: h, reason: collision with root package name */
    private final Jb.f f87929h;

    public I(Pc.a aVar, ru.ozon.android.messenger.framework.composer.network.serialization.b bVar, X60.d dVar, ru.ozon.android.messenger.framework.di.y yVar, ru.ozon.android.messenger.framework.data.local.q qVar, ru.ozon.android.messenger.framework.di.z zVar, V v11, Jb.f fVar) {
        this.f87922a = aVar;
        this.f87923b = bVar;
        this.f87924c = dVar;
        this.f87925d = yVar;
        this.f87926e = qVar;
        this.f87927f = zVar;
        this.f87928g = v11;
        this.f87929h = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9331b(this.f87922a.get(), (ru.ozon.android.messenger.framework.data.remote.serialize.b) this.f87923b.get(), (ru.ozon.android.messenger.framework.data.remote.parser.e) this.f87924c.get(), (xe.M) this.f87925d.get(), (C9067a) this.f87926e.get(), (xe.I) this.f87927f.get(), (U) this.f87928g.get(), (d.f) this.f87929h.get());
    }
}

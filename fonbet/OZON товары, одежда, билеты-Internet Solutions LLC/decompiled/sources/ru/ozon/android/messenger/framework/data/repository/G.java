package ru.ozon.android.messenger.framework.data.repository;

/* loaded from: classes10.dex */
public final class G implements Jb.e<C9351a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.g> f88273a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.remote.action.z f88274b;

    public G(Pc.a aVar, ru.ozon.android.messenger.framework.data.remote.action.z zVar, ru.ozon.android.messenger.framework.di.y yVar, ru.ozon.android.messenger.framework.di.z zVar2) {
        this.f88273a = aVar;
        this.f88274b = zVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9351a(this.f88273a.get(), (ru.ozon.android.messenger.framework.data.remote.action.y) this.f88274b.get(), ru.ozon.android.messenger.framework.di.y.b(), ru.ozon.android.messenger.framework.di.z.b());
    }
}

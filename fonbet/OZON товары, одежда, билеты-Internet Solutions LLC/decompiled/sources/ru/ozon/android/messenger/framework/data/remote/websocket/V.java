package ru.ozon.android.messenger.framework.data.remote.websocket;

import android.content.res.Resources;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.websocket.J;

/* loaded from: classes10.dex */
public final class V implements Jb.e<U> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87978a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f87979b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.t f87980c;

    /* renamed from: d, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.di.z f87981d;

    public V(Jb.f fVar, Jb.f fVar2, K k11, ru.ozon.android.messenger.framework.data.local.t tVar, ru.ozon.android.messenger.framework.di.z zVar) {
        this.f87978a = fVar;
        this.f87979b = fVar2;
        this.f87980c = tVar;
        this.f87981d = zVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new U((We.E) this.f87978a.get(), (d.f) this.f87979b.get(), new J.a(), (Resources) this.f87980c.get(), (xe.I) this.f87981d.get());
    }
}

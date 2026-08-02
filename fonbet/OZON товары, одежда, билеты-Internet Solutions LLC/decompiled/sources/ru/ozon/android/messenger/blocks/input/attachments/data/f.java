package ru.ozon.android.messenger.blocks.input.attachments.data;

import android.content.Context;
import ru.ozon.android.messenger.framework.data.m;
import ru.ozon.android.messenger.framework.data.remote.FileApi;

/* loaded from: classes10.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Bi0.b f85374a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f85375b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<m> f85376c;

    public f(Bi0.b bVar, Jb.f fVar, Pc.a aVar) {
        this.f85374a = bVar;
        this.f85375b = fVar;
        this.f85376c = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new e((FileApi) this.f85374a.get(), (Context) this.f85375b.get(), this.f85376c.get());
    }
}

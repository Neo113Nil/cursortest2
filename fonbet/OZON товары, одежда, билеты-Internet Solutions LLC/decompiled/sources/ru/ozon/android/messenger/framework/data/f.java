package ru.ozon.android.messenger.framework.data;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.H;

/* loaded from: classes10.dex */
public final class f implements Jb.e<H> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.mapper.c> f87415a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<b> f87416b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f87417c;

    public f(Jb.f fVar, Pc.a aVar, Pc.a aVar2) {
        this.f87415a = aVar;
        this.f87416b = aVar2;
        this.f87417c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.android.messenger.framework.data.local.mapper.c mapper = this.f87415a.get();
        b blockStore = this.f87416b.get();
        Context context = (Context) this.f87417c.get();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(context, "context");
        return new H(mapper, blockStore, context);
    }
}

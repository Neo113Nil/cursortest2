package ru.ozon.android.messenger.framework.data;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.X;
import v70.C10269c;
import x70.C10674a;
import x70.C10675b;

/* loaded from: classes10.dex */
public final class j implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87422a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f87423b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f87424c;

    public /* synthetic */ j(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f87422a = i11;
        this.f87423b = aVar;
        this.f87424c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f87422a) {
            case 0:
                ru.ozon.android.messenger.framework.data.local.mapper.c mapper = (ru.ozon.android.messenger.framework.data.local.mapper.c) this.f87423b.get();
                ru.ozon.android.messenger.framework.data.remote.mapper.g responseMapper = (ru.ozon.android.messenger.framework.data.remote.mapper.g) this.f87424c.get();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
                return new X(mapper, responseMapper);
            default:
                return new C10269c((C10675b) ((Jb.f) this.f87423b).get(), (C10674a) ((Jb.f) this.f87424c).get());
        }
    }
}

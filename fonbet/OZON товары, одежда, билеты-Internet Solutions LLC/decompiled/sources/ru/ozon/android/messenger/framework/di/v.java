package ru.ozon.android.messenger.framework.di;

import android.content.Context;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class v implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88773a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f88774b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f88775c;

    public v(Pc.a aVar, Pc.a aVar2) {
        this.f88774b = aVar;
        this.f88775c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f88773a) {
            case 0:
                ru.ozon.android.messenger.blocks.messageimage.a imageMapper = new ru.ozon.android.messenger.blocks.messageimage.a();
                ru.ozon.android.messenger.blocks.messagefile.a fileMapper = new ru.ozon.android.messenger.blocks.messagefile.a();
                ru.ozon.android.messenger.framework.data.b blockStore = (ru.ozon.android.messenger.framework.data.b) this.f88774b.get();
                ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper = (ru.ozon.android.messenger.framework.data.remote.mapper.a) ((Jb.c) this.f88775c).get();
                Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
                Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
                Intrinsics.checkNotNullParameter(blockStore, "blockStore");
                Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
                return new ru.ozon.android.messenger.framework.domain.service.A(fileMapper, imageMapper, blockStore, blocksItemMapper);
            default:
                return new w30.n((Context) this.f88774b.get(), (InterfaceC6618a) this.f88775c.get());
        }
    }

    public v(m mVar, ru.ozon.android.messenger.blocks.messageimage.b bVar, ru.ozon.android.messenger.blocks.messagefile.b bVar2, Pc.a aVar, Jb.c cVar) {
        this.f88774b = aVar;
        this.f88775c = cVar;
    }
}

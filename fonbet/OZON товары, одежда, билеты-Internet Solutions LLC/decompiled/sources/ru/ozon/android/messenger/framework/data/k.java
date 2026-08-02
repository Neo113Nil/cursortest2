package ru.ozon.android.messenger.framework.data;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.n0;
import ru.ozon.android.messenger.framework.di.A;
import ru.ozon.android.messenger.framework.di.y;
import xe.I;

/* loaded from: classes10.dex */
public final class k implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87425a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f87426b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.e f87427c;

    public k(Pc.a aVar, y yVar, A a11) {
        this.f87426b = aVar;
        this.f87427c = a11;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f87425a) {
            case 0:
                b blockStore = (b) this.f87426b.get();
                ru.ozon.android.messenger.blocks.messageimage.a imageMapper = new ru.ozon.android.messenger.blocks.messageimage.a();
                ru.ozon.android.messenger.blocks.messagefile.a fileMapper = new ru.ozon.android.messenger.blocks.messagefile.a();
                Intrinsics.checkNotNullParameter(blockStore, "blockStore");
                Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
                Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
                Jb.c blocksItemMapperProvider = (Jb.c) this.f87427c;
                Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
                Object obj = blocksItemMapperProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return new ru.ozon.android.messenger.framework.data.local.mapper.c(fileMapper, imageMapper, blockStore, (ru.ozon.android.messenger.framework.data.remote.mapper.a) obj);
            default:
                return new n0((ru.ozon.android.messenger.framework.domain.repository.b) this.f87426b.get(), y.b(), (I) ((A) this.f87427c).get());
        }
    }

    public k(Pc.a aVar, ru.ozon.android.messenger.blocks.messageimage.b bVar, ru.ozon.android.messenger.blocks.messagefile.b bVar2, Jb.c cVar) {
        this.f87426b = aVar;
        this.f87427c = cVar;
    }
}

package d90;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import r90.C9219b;
import ru.ozon.android.messenger.framework.di.C9377b;
import ru.ozon.android.messenger.framework.domain.service.A;

/* loaded from: classes3.dex */
public final class m implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61395a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f61396b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f61397c;

    public /* synthetic */ m(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f61395a = i11;
        this.f61396b = aVar;
        this.f61397c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f61395a) {
            case 0:
                return new l((Context) this.f61397c.get(), (SharedPreferences) this.f61396b.get());
            case 1:
                return new C9219b((Context) this.f61396b.get(), (SharedPreferences) this.f61397c.get());
            default:
                ru.ozon.android.messenger.blocks.messageimage.a imageMapper = new ru.ozon.android.messenger.blocks.messageimage.a();
                ru.ozon.android.messenger.blocks.messagefile.a fileMapper = new ru.ozon.android.messenger.blocks.messagefile.a();
                ru.ozon.android.messenger.framework.data.b blockStore = (ru.ozon.android.messenger.framework.data.b) this.f61396b.get();
                ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper = (ru.ozon.android.messenger.framework.data.remote.mapper.a) ((Jb.c) this.f61397c).get();
                Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
                Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
                Intrinsics.checkNotNullParameter(blockStore, "blockStore");
                Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
                return new A(fileMapper, imageMapper, blockStore, blocksItemMapper);
        }
    }

    public m(C9377b c9377b, ru.ozon.android.messenger.blocks.messageimage.b bVar, ru.ozon.android.messenger.blocks.messagefile.b bVar2, Pc.a aVar, Jb.c cVar) {
        this.f61395a = 2;
        this.f61396b = aVar;
        this.f61397c = cVar;
    }
}

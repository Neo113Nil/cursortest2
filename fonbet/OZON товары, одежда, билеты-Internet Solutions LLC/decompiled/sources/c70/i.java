package c70;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.di.C9377b;
import ru.ozon.android.messenger.framework.domain.usecases.C9385b;
import ru.ozon.android.messenger.framework.domain.usecases.K;

/* loaded from: classes3.dex */
public final class i implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56681a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f56682b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f56683c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f56684d;

    public i(Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f56682b = aVar;
        this.f56683c = aVar2;
        this.f56684d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f56681a) {
            case 0:
                Moshi moshi = (Moshi) this.f56682b.get();
                X60.a imageDownloader = (X60.a) this.f56683c.get();
                Z60.a localDataSource = (Z60.a) this.f56684d.get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                Intrinsics.checkNotNullParameter(imageDownloader, "imageDownloader");
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                return new Y60.f(moshi, imageDownloader, localDataSource);
            default:
                K resolveMessageInfoUseCase = (K) this.f56682b.get();
                C9385b appendDateBlocksUseCase = (C9385b) this.f56683c.get();
                ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) ((Jb.f) this.f56684d).get();
                Intrinsics.checkNotNullParameter(resolveMessageInfoUseCase, "resolveMessageInfoUseCase");
                Intrinsics.checkNotNullParameter(appendDateBlocksUseCase, "appendDateBlocksUseCase");
                Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
                return new ru.ozon.android.messenger.framework.data.local.c(resolveMessageInfoUseCase, appendDateBlocksUseCase, chatArgs);
        }
    }

    public i(C9377b c9377b, Pc.a aVar, Pc.a aVar2, Jb.f fVar) {
        this.f56682b = aVar;
        this.f56683c = aVar2;
        this.f56684d = fVar;
    }
}

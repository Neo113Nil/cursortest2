package c70;

import android.content.Context;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.di.C9377b;
import w30.C10426a;

/* loaded from: classes3.dex */
public final class h implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56677a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f56678b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f56679c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f56680d;

    public /* synthetic */ h(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, int i11) {
        this.f56677a = i11;
        this.f56678b = aVar;
        this.f56679c = aVar2;
        this.f56680d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f56677a) {
            case 0:
                Moshi moshi = (Moshi) this.f56678b.get();
                X60.a imageDownloader = (X60.a) this.f56679c.get();
                Z60.a localDataSource = (Z60.a) ((Pc.a) this.f56680d).get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                Intrinsics.checkNotNullParameter(imageDownloader, "imageDownloader");
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                return new Y60.g(moshi, imageDownloader, localDataSource);
            case 1:
                return new C10426a((Context) this.f56678b.get(), (Q90.c) this.f56679c.get(), (ru.ozon.fintech.settings.domain.a) ((Pc.a) this.f56680d).get());
            default:
                ru.ozon.android.messenger.framework.domain.repository.d messagesRepository = (ru.ozon.android.messenger.framework.domain.repository.d) this.f56678b.get();
                ru.ozon.android.messenger.framework.domain.repository.b repository = (ru.ozon.android.messenger.framework.domain.repository.b) this.f56679c.get();
                ((C9377b) this.f56680d).getClass();
                Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
                Intrinsics.checkNotNullParameter(repository, "repository");
                return new ru.ozon.android.messenger.framework.domain.e(messagesRepository, repository);
        }
    }

    public h(C9377b c9377b, Pc.a aVar, Pc.a aVar2) {
        this.f56677a = 2;
        this.f56680d = c9377b;
        this.f56678b = aVar;
        this.f56679c = aVar2;
    }
}

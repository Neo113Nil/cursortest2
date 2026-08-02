package c70;

import com.squareup.moshi.Moshi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.initialwidgets.a;

/* loaded from: classes3.dex */
public final class f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56671a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f56672b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f56673c;

    public f(Pc.a aVar, Pc.a aVar2) {
        this.f56672b = aVar;
        this.f56673c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        a.C1548a c1548a;
        C00.a aVar;
        switch (this.f56671a) {
            case 0:
                Moshi moshi = (Moshi) this.f56672b.get();
                Z60.a localDataSource = (Z60.a) this.f56673c.get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                return new Y60.d(moshi, localDataSource);
            default:
                ru.ozon.android.messenger.framework.composer.screen.e config = (ru.ozon.android.messenger.framework.composer.screen.e) ((Jb.f) this.f56673c).get();
                Map providers = (Map) this.f56672b.get();
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(providers, "providers");
                Pc.a aVar2 = (Pc.a) providers.get(config.g());
                if (aVar2 != null && (aVar = (C00.a) aVar2.get()) != null) {
                    return aVar;
                }
                c1548a = ru.ozon.android.messenger.framework.composer.initialwidgets.a.f86708a;
                return c1548a;
        }
    }

    public f(ru.ozon.android.messenger.framework.composer.di.module.a aVar, Jb.f fVar, Pc.a aVar2) {
        this.f56673c = fVar;
        this.f56672b = aVar2;
    }
}

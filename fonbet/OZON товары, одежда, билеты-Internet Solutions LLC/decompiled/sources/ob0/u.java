package ob0;

import Sc.InterfaceC4008j;
import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import nb0.C8485c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.ad.AdManager;

/* loaded from: classes7.dex */
public final class u extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AdManager> f78008a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8485c> f78009b;

    public u(@NotNull InterfaceC4008j<AdManager> adInterceptor, @NotNull InterfaceC4008j<C8485c> adParamsProvider) {
        Intrinsics.checkNotNullParameter(adInterceptor, "adInterceptor");
        Intrinsics.checkNotNullParameter(adParamsProvider, "adParamsProvider");
        this.f78008a = adInterceptor;
        this.f78009b = adParamsProvider;
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(this.f78009b.getValue().a(this.f78008a.getValue().e(chain.request())));
    }
}

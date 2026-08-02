package ru.ozon.app.android.cscore.core.configurators;

import A00.a;
import L00.g;
import L00.i;
import QZ.g;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.cache.CacheTime;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cscore/core/configurators/OrderCacheStateInterceptor;", "LQZ/g;", "<init>", "()V", "Li10/h;", "state", "LL00/g;", "request", "LL00/i;", "extraData", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderCacheStateInterceptor implements g {
    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extraData) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        request.getClass();
        g.a aVar = new g.a(request);
        aVar.k(CacheTime.class, new CacheTime(10800000));
        return aVar.a();
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h hVar, @NotNull a aVar) {
        g.a.b(hVar, aVar);
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}

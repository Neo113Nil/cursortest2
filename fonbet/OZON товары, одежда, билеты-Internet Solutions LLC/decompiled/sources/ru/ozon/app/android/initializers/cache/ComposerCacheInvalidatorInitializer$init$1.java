package ru.ozon.app.android.initializers.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ComposerCacheInvalidatorInitializer$init$1 extends C7735q implements Function1<ClearCacheReason, Unit> {
    ComposerCacheInvalidatorInitializer$init$1(Object obj) {
        super(1, obj, ComposerCacheService.class, "clearAllCache", "clearAllCache(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClearCacheReason clearCacheReason) {
        invoke2(clearCacheReason);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ClearCacheReason p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ComposerCacheService) this.receiver).clearAllCache(p02);
    }
}

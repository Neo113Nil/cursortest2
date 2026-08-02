package ru.ozon.app.android.initializers.cache;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Boolean;)Lru/ozon/app/android/composer/network/cache/ClearCacheReason;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerCacheInvalidatorInitializer$getAdultState$1 extends AbstractC7737t implements Function1<Boolean, ClearCacheReason> {
    public static final ComposerCacheInvalidatorInitializer$getAdultState$1 INSTANCE = new ComposerCacheInvalidatorInitializer$getAdultState$1();

    ComposerCacheInvalidatorInitializer$getAdultState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClearCacheReason invoke(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ClearCacheReason.ADULT_STATE_CHANGED;
    }
}

package ru.ozon.app.android.common.filterWidgets.filtervalues.domain.changeLocale;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.ChangeLocaleUseCase;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/domain/changeLocale/ChangeLocaleUseCaseImpl;", "Lru/ozon/app/android/account/locale/app/data/ChangeLocaleUseCase;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "composerResponseStorage", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "<init>", "(Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;Lru/ozon/app/android/composer/network/cache/ComposerCacheService;)V", "", "languageCode", "", "execute", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeLocaleUseCaseImpl implements ChangeLocaleUseCase {

    @NotNull
    private final ComposerCacheService composerCacheService;

    @NotNull
    private final ComposerResponseStorage composerResponseStorage;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;

    public ChangeLocaleUseCaseImpl(@NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate, @NotNull ComposerResponseStorage composerResponseStorage, @NotNull ComposerCacheService composerCacheService) {
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        Intrinsics.checkNotNullParameter(composerResponseStorage, "composerResponseStorage");
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.composerResponseStorage = composerResponseStorage;
        this.composerCacheService = composerCacheService;
    }

    @Override // ru.ozon.app.android.account.locale.app.data.ChangeLocaleUseCase
    public Object execute(@NotNull String str, @NotNull d<? super Unit> dVar) {
        this.tabConfigUpdateDelegate.updateTabConfig("main");
        this.composerResponseStorage.clearCache();
        this.composerCacheService.clearAllCache(ClearCacheReason.LOCALE_CHANGED);
        return Unit.f71690a;
    }
}

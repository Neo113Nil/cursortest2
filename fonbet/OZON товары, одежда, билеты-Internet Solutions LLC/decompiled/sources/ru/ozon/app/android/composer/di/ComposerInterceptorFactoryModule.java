package ru.ozon.app.android.composer.di;

import BZ.e;
import HZ.d;
import QZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory;
import ru.ozon.app.android.composer.di.ComposerInterceptorFactoryModule;
import ru.ozon.app.android.composer.miniapp.MiniAppComposerInterceptor;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/di/ComposerInterceptorFactoryModule;", "", "<init>", "()V", "LHZ/d;", "deeplinkMiniAppMapper", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;", "provideMiniAppComposerInterceptor", "(LHZ/d;LBZ/e;)Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerInterceptorFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final g provideMiniAppComposerInterceptor$lambda$0(d dVar, e eVar) {
        return new MiniAppComposerInterceptor(dVar, eVar);
    }

    @NotNull
    public final ComposerInterceptorFactory provideMiniAppComposerInterceptor(@NotNull final d deeplinkMiniAppMapper, @NotNull final e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(deeplinkMiniAppMapper, "deeplinkMiniAppMapper");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        return new ComposerInterceptorFactory() { // from class: Dr.a
            @Override // ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory
            public final g create() {
                g provideMiniAppComposerInterceptor$lambda$0;
                provideMiniAppComposerInterceptor$lambda$0 = ComposerInterceptorFactoryModule.provideMiniAppComposerInterceptor$lambda$0(d.this, miniAppConfigHolder);
                return provideMiniAppComposerInterceptor$lambda$0;
            }
        };
    }
}

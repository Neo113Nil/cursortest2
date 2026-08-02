package ru.ozon.app.android.common.filterWidgets.filtervalues.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.filterWidgets.filtervalues.domain.changeLocale.ChangeLocaleUseCaseImpl;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filtervalues/domain/changeLocale/ChangeLocaleUseCaseImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppLocaleDependenciesFactory$create$1$changeLocaleUseCase$2 extends AbstractC7737t implements Function0<ChangeLocaleUseCaseImpl> {
    final /* synthetic */ C6740b $componentStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppLocaleDependenciesFactory$create$1$changeLocaleUseCase$2(C6740b c6740b) {
        super(0);
        this.$componentStorage = c6740b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ChangeLocaleUseCaseImpl invoke() {
        C6740b c6740b = this.$componentStorage;
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) c6740b.b(ComposerComponentApi.class);
        ComposerResponseStorage composerResponseStorage = composerComponentApi.getComposerResponseStorage();
        ComposerCacheService composerCacheService = composerComponentApi.getComposerCacheService();
        C6740b c6740b2 = this.$componentStorage;
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        return new ChangeLocaleUseCaseImpl(((TabsComponentApi) c6740b2.b(TabsComponentApi.class)).getTabConfigRequestDelegate(), composerResponseStorage, composerCacheService);
    }
}

package ru.ozon.app.android.limb2.di.modules;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$appLocaleRepository$1 extends AbstractC7737t implements Function0<AppLocaleRepository> {
    final /* synthetic */ Application $application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$appLocaleRepository$1(Application application) {
        super(0);
        this.$application = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppLocaleRepository invoke() {
        Application application = this.$application;
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, AppLocaleComponentApi.class).getDependencyStorage();
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        return ((AppLocaleComponentApi) dependencyStorage.b(AppLocaleComponentApi.class)).getAppLocaleRepository();
    }
}

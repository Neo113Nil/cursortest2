package ru.ozon.app.android.composer.configurators.factory;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/configurators/factory/RefreshByUserConfiguratorFactory;", "Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;", "ozonIdCookieEvents", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;Landroid/content/Context;)V", "create", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByUserConfiguratorFactory implements ConfiguratorFactory {

    @NotNull
    private final Context context;

    @NotNull
    private final OzonIdCookieEvents ozonIdCookieEvents;

    public RefreshByUserConfiguratorFactory(@NotNull OzonIdCookieEvents ozonIdCookieEvents, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(ozonIdCookieEvents, "ozonIdCookieEvents");
        Intrinsics.checkNotNullParameter(context, "context");
        this.ozonIdCookieEvents = ozonIdCookieEvents;
        this.context = context;
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory
    public ComposerScreenConfig.PageConfigurator create(@NotNull ComposerScreenConfig screenConfig) {
        Set<ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh> refreshReasons;
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        ComposerScreenConfig.RefreshByAuthConfig refreshByAuthConfig = screenConfig.getRefreshByAuthConfig();
        ComposerScreenConfig.RefreshByAuthConfig.Enabled enabled = refreshByAuthConfig instanceof ComposerScreenConfig.RefreshByAuthConfig.Enabled ? (ComposerScreenConfig.RefreshByAuthConfig.Enabled) refreshByAuthConfig : null;
        if (enabled != null && (refreshReasons = enabled.getRefreshReasons()) != null) {
            if (refreshReasons.isEmpty()) {
                refreshReasons = null;
            }
            if (refreshReasons != null) {
                OzonIdCookieEvents ozonIdCookieEvents = this.ozonIdCookieEvents;
                h.c pageRef = screenConfig.getPageRef();
                h.c.a aVar = pageRef instanceof h.c.a ? (h.c.a) pageRef : null;
                boolean d11 = Intrinsics.d(aVar != null ? aVar.f() : null, "ozon://my");
                Context context = this.context;
                if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                    throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
                }
                C6740b dependencyStorage = C6739a.a(context, AccountComponentApi.class).getDependencyStorage();
                if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                    throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
                }
                return new RefreshByUserConfigurator(ozonIdCookieEvents, d11, refreshReasons, ((AccountComponentApi) dependencyStorage.b(AccountComponentApi.class)).getAlreadyAuthEvents());
            }
        }
        return null;
    }
}

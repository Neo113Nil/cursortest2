package ru.ozon.app.android.cart.configurator.base;

import EZ.h;
import NZ.a;
import NZ.g;
import NZ.i;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.R$id;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\bR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/configurator/base/AbstractCartConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "", "isActiveCartTab", "()Z", "isActiveFreshTab", AppMeasurementSdk.ConditionalUserProperty.VALUE, "instanceIsMainMiniApp", "Z", "getInstanceIsMainMiniApp", "", "miniAppName", "Ljava/lang/String;", "getMiniAppName", "()Ljava/lang/String;", "Landroidx/lifecycle/v$b;", "getCurrentLifecycleState", "()Landroidx/lifecycle/v$b;", "currentLifecycleState", "isResume", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractCartConfigurator extends ComposerScreenConfig.PageConfigurator {
    private boolean instanceIsMainMiniApp = true;
    private String miniAppName;

    @NotNull
    protected final AbstractC5434v.b getCurrentLifecycleState() {
        return getOwner().getLifecycle().b();
    }

    protected final boolean getInstanceIsMainMiniApp() {
        return this.instanceIsMainMiniApp;
    }

    protected final String getMiniAppName() {
        return this.miniAppName;
    }

    protected final boolean isActiveCartTab() {
        C7475g composerWidgetComponentStorage;
        h navigatorHolder;
        a a11;
        g activeTabOrNull;
        ConfiguratorReferences references = getReferences();
        if (references != null && (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) != null) {
            NavigationComponentApi navigationComponentApi = (NavigationComponentApi) (composerWidgetComponentStorage.hasComponent(NavigationComponentApi.class) ? composerWidgetComponentStorage.getComponent(NavigationComponentApi.class) : null);
            if (navigationComponentApi != null && (navigatorHolder = navigationComponentApi.getNavigatorHolder()) != null && (a11 = i.a(navigatorHolder)) != null && (activeTabOrNull = a11.activeTabOrNull()) != null && activeTabOrNull.getHostId() == R$id.menu_cart) {
                return true;
            }
        }
        return false;
    }

    protected final boolean isActiveFreshTab() {
        C7475g composerWidgetComponentStorage;
        h navigatorHolder;
        a a11;
        g activeTabOrNull;
        ConfiguratorReferences references = getReferences();
        if (references != null && (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) != null) {
            NavigationComponentApi navigationComponentApi = (NavigationComponentApi) (composerWidgetComponentStorage.hasComponent(NavigationComponentApi.class) ? composerWidgetComponentStorage.getComponent(NavigationComponentApi.class) : null);
            if (navigationComponentApi != null && (navigatorHolder = navigationComponentApi.getNavigatorHolder()) != null && (a11 = i.a(navigatorHolder)) != null && (activeTabOrNull = a11.activeTabOrNull()) != null && activeTabOrNull.getHostId() == R$id.menu_fresh_main) {
                return true;
            }
        }
        return false;
    }

    protected final boolean isResume() {
        return getCurrentLifecycleState() == AbstractC5434v.b.RESUMED;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        String miniAppName = MiniAppExtKt.getMiniAppName(getContainer().a());
        this.miniAppName = miniAppName;
        this.instanceIsMainMiniApp = Intrinsics.d(miniAppName, "main") || this.miniAppName == null;
    }
}

package ru.ozon.app.android.checkoutcomposer.split.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.checkoutcomposer.split.core.SplitParser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"ru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/checkoutcomposer/split/core/SplitParser;", "parser$delegate", "LSc/j;", "getParser", "()Lru/ozon/app/android/checkoutcomposer/split/core/SplitParser;", "parser", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitWidgetComponent$Companion$create$1$1 implements SplitWidgetComponent {
    private final Context appContext;
    private final AppType appType;
    private final d customActionHandlersStoreFactory;
    private final FeatureChecker featureChecker;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser;

    SplitWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        this.appContext = ((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class)).getContext();
        this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
        this.parser = k.b(new SplitWidgetComponent$Companion$create$1$1$parser$2(this));
        this.featureChecker = networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent
    public FeatureChecker getFeatureChecker() {
        return this.featureChecker;
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return this.networkComponentApi;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent
    public SplitParser getParser() {
        return (SplitParser) this.parser.getValue();
    }
}

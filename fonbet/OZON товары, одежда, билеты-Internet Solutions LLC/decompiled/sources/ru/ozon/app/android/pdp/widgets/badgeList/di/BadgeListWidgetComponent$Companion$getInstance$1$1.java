package ru.ozon.app.android.pdp.widgets.badgeList.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.pdp.widgets.badgeList.core.BadgeListMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"ru/ozon/app/android/pdp/widgets/badgeList/di/BadgeListWidgetComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/badgeList/di/BadgeListWidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "widgetImagePlaceholderComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/pdp/widgets/badgeList/core/BadgeListMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/badgeList/core/BadgeListMapper;", "mapper", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "getWidgetImagePlaceholderAdapter", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListWidgetComponent$Companion$getInstance$1$1 implements BadgeListWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AppType appType;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new BadgeListWidgetComponent$Companion$getInstance$1$1$mapper$2(this));
    private final l tokenizedAnalytics = getRetainComposerComponentApi().getTokenizedAnalytics();
    private final WidgetImagePlaceholderComponent widgetImagePlaceholderComponentApi;

    BadgeListWidgetComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.widgetImagePlaceholderComponentApi = (WidgetImagePlaceholderComponent) c7475g.getComponent(WidgetImagePlaceholderComponent.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.badgeList.di.BadgeListWidgetComponent
    public d getCustomActionHandlersFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.pdp.widgets.badgeList.di.BadgeListWidgetComponent
    public BadgeListMapper getMapper() {
        return (BadgeListMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.badgeList.di.BadgeListWidgetComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.pdp.widgets.badgeList.di.BadgeListWidgetComponent
    public WidgetImagePlaceholderAdapter getWidgetImagePlaceholderAdapter() {
        return this.widgetImagePlaceholderComponentApi.getWidgetImagePlaceholderAdapter();
    }
}

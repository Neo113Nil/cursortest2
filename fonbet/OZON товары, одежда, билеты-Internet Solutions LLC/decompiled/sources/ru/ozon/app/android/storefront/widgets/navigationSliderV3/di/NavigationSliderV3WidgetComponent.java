package ru.ozon.app.android.storefront.widgets.navigationSliderV3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3Mapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils.NavigationSliderV3Helper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u00060\u0018j\u0002`\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R\u001f\u0010(\u001a\u00060#j\u0002`$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/di/NavigationSliderV3WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3Mapper;", "mapper", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies$delegate", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi$delegate", "getCustomActionHandlersComponentApi", "()Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "actionHandlersStore$delegate", "getActionHandlersStore", "()LVg/c;", "actionHandlersStore", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "displayHelper$delegate", "getDisplayHelper", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "displayHelper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV3WidgetComponent implements InterfaceC6958a {

    /* renamed from: actionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandlersStore;

    /* renamed from: contextComponentDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contextComponentDependencies;

    /* renamed from: customActionHandlersComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersComponentApi;

    /* renamed from: displayHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j displayHelper;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tokenizedAnalytics;

    public NavigationSliderV3WidgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.mapper = k.b(NavigationSliderV3WidgetComponent$mapper$2.INSTANCE);
        this.contextComponentDependencies = k.b(new NavigationSliderV3WidgetComponent$contextComponentDependencies$2(storage));
        this.customActionHandlersComponentApi = k.b(new NavigationSliderV3WidgetComponent$customActionHandlersComponentApi$2(storage));
        this.actionHandlersStore = k.b(new NavigationSliderV3WidgetComponent$actionHandlersStore$2(this));
        this.displayHelper = k.b(new NavigationSliderV3WidgetComponent$displayHelper$2(this));
        this.tokenizedAnalytics = k.b(new NavigationSliderV3WidgetComponent$tokenizedAnalytics$2(storage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.contextComponentDependencies.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomActionHandlersComponentApi getCustomActionHandlersComponentApi() {
        return (CustomActionHandlersComponentApi) this.customActionHandlersComponentApi.getValue();
    }

    @NotNull
    public final c getActionHandlersStore() {
        return (c) this.actionHandlersStore.getValue();
    }

    @NotNull
    public final NavigationSliderV3Helper getDisplayHelper() {
        return (NavigationSliderV3Helper) this.displayHelper.getValue();
    }

    @NotNull
    public final NavigationSliderV3Mapper getMapper() {
        return (NavigationSliderV3Mapper) this.mapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }
}

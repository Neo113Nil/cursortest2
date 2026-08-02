package ru.ozon.app.android.common.filterWidgets.filters.di;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.openRangeFilter.OpenRangeFilterMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.timerangefilter.TimeRangeFilterMapper;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"ru/ozon/app/android/common/filterWidgets/filters/di/FilterComponent$Companion$create$1$1", "Lru/ozon/app/android/common/filterWidgets/filters/di/FilterComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "keyboardVisibilityHelper$delegate", "LSc/j;", "getKeyboardVisibilityHelper", "()Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterMapper;", "getOpenRangeFilterMapper$delegate", "getGetOpenRangeFilterMapper", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterMapper;", "getOpenRangeFilterMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/timerangefilter/TimeRangeFilterMapper;", "getTimeRangeFilterMapper$delegate", "getGetTimeRangeFilterMapper", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/timerangefilter/TimeRangeFilterMapper;", "getTimeRangeFilterMapper", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "keyboardVisibilityActionHolder$delegate", "getKeyboardVisibilityActionHolder", "()Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "keyboardVisibilityActionHolder", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "getFilterSharedViewModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterComponent$Companion$create$1$1 implements FilterComponent {
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: keyboardVisibilityHelper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j keyboardVisibilityHelper = k.b(FilterComponent$Companion$create$1$1$keyboardVisibilityHelper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(FilterComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: getOpenRangeFilterMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j getOpenRangeFilterMapper = k.b(FilterComponent$Companion$create$1$1$getOpenRangeFilterMapper$2.INSTANCE);

    /* renamed from: getTimeRangeFilterMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j getTimeRangeFilterMapper = k.b(FilterComponent$Companion$create$1$1$getTimeRangeFilterMapper$2.INSTANCE);

    /* renamed from: keyboardVisibilityActionHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j keyboardVisibilityActionHolder = k.b(new FilterComponent$Companion$create$1$1$keyboardVisibilityActionHolder$2(this));

    FilterComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyboardVisibilityHelper getKeyboardVisibilityHelper() {
        return (KeyboardVisibilityHelper) this.keyboardVisibilityHelper.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public AppType getAppType() {
        return this.androidPlatformComponentDependencies.getAppType();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public Context getContext() {
        return this.contextComponentDependencies.getContext();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public FilterSharedViewModel getFilterSharedViewModel() {
        return new FilterSharedViewModel();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public OpenRangeFilterMapper getGetOpenRangeFilterMapper() {
        return (OpenRangeFilterMapper) this.getOpenRangeFilterMapper.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public TimeRangeFilterMapper getGetTimeRangeFilterMapper() {
        return (TimeRangeFilterMapper) this.getTimeRangeFilterMapper.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public KeyboardVisibilityActionHolder getKeyboardVisibilityActionHolder() {
        return (KeyboardVisibilityActionHolder) this.keyboardVisibilityActionHolder.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent
    public ComposerNavigator getNavigator() {
        return this.retainComposerComponentApi.getComposerNavigator();
    }
}

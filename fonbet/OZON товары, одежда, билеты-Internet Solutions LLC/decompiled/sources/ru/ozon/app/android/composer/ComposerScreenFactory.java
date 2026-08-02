package ru.ozon.app.android.composer;

import E10.c;
import QZ.g;
import a00.C4911f;
import a00.h;
import android.app.Activity;
import androidx.fragment.app.r;
import g00.InterfaceC6608a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.f;
import l10.s;
import l10.u;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.CalculateBottomBorderPositionAsAbsolute;
import ru.ozon.app.android.composer.flags.CalculateStickyOnMainEnabled;
import ru.ozon.app.android.composer.flags.ComposerDecorationsNewUpdaterFlag;
import ru.ozon.app.android.composer.flags.ComposerErrorStateFactoryEnabled;
import ru.ozon.app.android.composer.flags.ComposerFirstRowSpacerFlag;
import ru.ozon.app.android.composer.flags.ComposerSnapshotOutsideScreenEnabled;
import ru.ozon.app.android.composer.flags.ComposerZeroTranslationForOverlapEnabledFlag;
import ru.ozon.app.android.composer.flags.FullComposerSnapshotEnabled;
import ru.ozon.app.android.composer.flags.InitialWidgetsProviderEnabled;
import ru.ozon.app.android.composer.flags.IsUpdateOverlapOnPreDrawEnabled;
import ru.ozon.app.android.composer.flags.NewStickyEnabledFlag;
import ru.ozon.app.android.composer.flags.ZeroElevationForComposerStickyPlaceholderEnabled;
import ru.ozon.app.android.composer.issue.ComposerPageIssueFactory;
import ru.ozon.app.android.composer.tracker.ComposerEventLoadingCompositeCallback;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.universalscreen.view.ComposerThemeProvider;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.WidgetViewAsyncInflaterCreateViewFlag;
import ru.ozon.app.android.composer.view.performance.ComposerScreenPerformanceController;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.storage.user.test.TestUserStorage;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import w10.InterfaceC10409a;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J[\u0010=\u001a\u00020<2\u0006\u0010\"\u001a\u00020!2\n\u0010-\u001a\u00060+j\u0002`,2\n\u00100\u001a\u00060.j\u0002`/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010GR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010I¨\u0006J"}, d2 = {"Lru/ozon/app/android/composer/ComposerScreenFactory;", "", "LK00/a;", "network", "LRZ/a;", "analytics", "Ln20/k;", "Lm20/a;", "Ll20/c;", "widgetStore", "LE10/c;", "prefetchManager", "Lru/ozon/app/android/composer/issue/ComposerPageIssueFactory;", "pageIssueFactory", "Lru/ozon/app/android/composer/tracker/ComposerEventLoadingCompositeCallback;", "eventLoadingCallback", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/storage/user/test/TestUserStorage;", "testUserStorage", "Lru/ozon/app/android/composer/view/performance/ComposerScreenPerformanceController;", "composerScreenPerformanceController", "Lw10/a;", "composerImagePrefetcher", "Lg00/a;", "composerDebugMenuHostApi", "<init>", "(LK00/a;LRZ/a;Ln20/k;LE10/c;Lru/ozon/app/android/composer/issue/ComposerPageIssueFactory;Lru/ozon/app/android/composer/tracker/ComposerEventLoadingCompositeCallback;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/storage/user/test/TestUserStorage;Lru/ozon/app/android/composer/view/performance/ComposerScreenPerformanceController;Lw10/a;Lg00/a;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;", "state", "Ll10/u$c;", "titleAlign", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig$DefaultState;)Ll10/u$c;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "", "getShouldNullifyTranslationForOverlap", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)Z", "Landroid/app/Activity;", "activity", "Ll10/s;", "createLoaderConfig", "(Landroid/app/Activity;)Ll10/s;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Ll10/f$e;", "displayMode", "", "LQZ/g;", "interceptors", "LE00/a;", "errorStateFactory", "LC00/a;", "initialWidgetsProvider", "Ll10/f;", "create", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;La00/f;La00/h;Lru/ozon/app/android/composer/ComposerReferences;Ll10/f$e;Ljava/util/Set;LE00/a;LC00/a;)Ll10/f;", "LK00/a;", "LRZ/a;", "Ln20/k;", "LE10/c;", "Lru/ozon/app/android/composer/issue/ComposerPageIssueFactory;", "Lru/ozon/app/android/composer/tracker/ComposerEventLoadingCompositeCallback;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/storage/user/test/TestUserStorage;", "Lru/ozon/app/android/composer/view/performance/ComposerScreenPerformanceController;", "Lw10/a;", "Lg00/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerScreenFactory {

    @NotNull
    private final RZ.a analytics;

    @NotNull
    private final InterfaceC6608a composerDebugMenuHostApi;

    @NotNull
    private final InterfaceC10409a composerImagePrefetcher;

    @NotNull
    private final ComposerScreenPerformanceController composerScreenPerformanceController;

    @NotNull
    private final ComposerEventLoadingCompositeCallback eventLoadingCallback;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final K00.a network;

    @NotNull
    private final ComposerPageIssueFactory pageIssueFactory;

    @NotNull
    private final c prefetchManager;

    @NotNull
    private final TestUserStorage testUserStorage;

    @NotNull
    private final k<InterfaceC8046a<?, ? extends l20.c>> widgetStore;

    public ComposerScreenFactory(@NotNull K00.a network, @NotNull RZ.a analytics, @NotNull k<InterfaceC8046a<?, ? extends l20.c>> widgetStore, @NotNull c prefetchManager, @NotNull ComposerPageIssueFactory pageIssueFactory, @NotNull ComposerEventLoadingCompositeCallback eventLoadingCallback, @NotNull FeatureService featureService, @NotNull TestUserStorage testUserStorage, @NotNull ComposerScreenPerformanceController composerScreenPerformanceController, @NotNull InterfaceC10409a composerImagePrefetcher, @NotNull InterfaceC6608a composerDebugMenuHostApi) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
        Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(testUserStorage, "testUserStorage");
        Intrinsics.checkNotNullParameter(composerScreenPerformanceController, "composerScreenPerformanceController");
        Intrinsics.checkNotNullParameter(composerImagePrefetcher, "composerImagePrefetcher");
        Intrinsics.checkNotNullParameter(composerDebugMenuHostApi, "composerDebugMenuHostApi");
        this.network = network;
        this.analytics = analytics;
        this.widgetStore = widgetStore;
        this.prefetchManager = prefetchManager;
        this.pageIssueFactory = pageIssueFactory;
        this.eventLoadingCallback = eventLoadingCallback;
        this.featureService = featureService;
        this.testUserStorage = testUserStorage;
        this.composerScreenPerformanceController = composerScreenPerformanceController;
        this.composerImagePrefetcher = composerImagePrefetcher;
        this.composerDebugMenuHostApi = composerDebugMenuHostApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final s createLoaderConfig(Activity activity) {
        Integer loaderBackgroundColor;
        ComposerThemeProvider composerThemeProvider = activity instanceof ComposerThemeProvider ? (ComposerThemeProvider) activity : null;
        if (composerThemeProvider == null || (loaderBackgroundColor = composerThemeProvider.getLoaderBackgroundColor()) == null) {
            return null;
        }
        int themeColor = ThemeExtKt.themeColor(activity, loaderBackgroundColor.intValue());
        s.a aVar = new s.a();
        aVar.a(Integer.valueOf(themeColor));
        return aVar.b();
    }

    private final boolean getShouldNullifyTranslationForOverlap(ComposerScreenConfig config) {
        Integer softInputMode;
        if (!this.featureService.getBooleanKey(ComposerZeroTranslationForOverlapEnabledFlag.INSTANCE)) {
            return false;
        }
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = config.getBottomSheetConfig();
        if ((bottomSheetConfig != null ? bottomSheetConfig.getSoftInputMode() : null) != SheetSoftInputMode.ADJUST_PAN) {
            return config.getBottomSheetConfig() == null && (softInputMode = config.getSoftInputMode()) != null && softInputMode.intValue() == 32;
        }
        return true;
    }

    private final u.c titleAlign(ComposerScreenConfig.ToolbarConfig.DefaultState state) {
        return state.getTitleAlign().ordinal() == ComposerScreenConfig.ToolbarConfig.ToolbarTitleAlign.CENTER.ordinal() ? u.c.CENTER : u.c.LEFT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f create(@NotNull ComposerScreenConfig config, @NotNull C4911f ownerContainer, @NotNull h viewModelOwnerProvider, @NotNull ComposerReferences references, @NotNull f.e displayMode, @NotNull Set<? extends g> interceptors, @NotNull E00.a errorStateFactory, @NotNull C00.a initialWidgetsProvider) {
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
        Integer num;
        Integer defaultToolbarBackground;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(errorStateFactory, "errorStateFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        r i11 = ownerContainer.i();
        int i12 = config.getBottomSheetConfig() == null ? R$attr.layerFloor0 : R$attr.layerFloor1;
        BackgroundColor backgroundColorThemed = config.getBackgroundColorThemed();
        int themeColor = backgroundColorThemed != null ? backgroundColorThemed.get(i11) : ThemeExtKt.themeColor(i11, i12);
        f.d dVar = new f.d(ownerContainer, viewModelOwnerProvider, Sc.k.b(new ComposerScreenFactory$create$1(config)));
        dVar.k0(references);
        dVar.h0(this.network);
        dVar.a(this.analytics);
        dVar.q0(this.widgetStore);
        dVar.j0(this.prefetchManager);
        dVar.l0(this.composerScreenPerformanceController);
        dVar.Q(this.composerImagePrefetcher);
        dVar.i0(this.pageIssueFactory);
        dVar.j(this.eventLoadingCallback);
        dVar.d(themeColor);
        f.d.n0(dVar, config.getStickyHeaderEnabled(), this.featureService.getBooleanKey(NewStickyEnabledFlag.INSTANCE), 4);
        dVar.m0(getShouldNullifyTranslationForOverlap(config));
        dVar.b(config.getAnimationEnabled());
        dVar.o0(config.getBottomSheetConfig() == null && config.getIsSwipeToRefreshEnabled());
        dVar.i(displayMode);
        dVar.U(this.featureService.getBooleanKey(ComposerFirstRowSpacerFlag.INSTANCE) && config.getIsFirstRowSpacerEnabled());
        dVar.b0(this.featureService.getBooleanKey(IsUpdateOverlapOnPreDrawEnabled.INSTANCE));
        dVar.d0(this.featureService.getBooleanKey(WidgetViewAsyncInflaterCreateViewFlag.INSTANCE));
        dVar.S(this.featureService.getBooleanKey(CalculateStickyOnMainEnabled.INSTANCE));
        this.featureService.getBooleanKey(CalculateBottomBorderPositionAsAbsolute.INSTANCE);
        ComposerScreenConfig.ToolbarConfig toolbarConfig = config.getToolbarConfig();
        if (toolbarConfig != null) {
            if (config.getBottomSheetConfig() != null && !config.getBottomSheetConfig().getIsToolbarEnabled()) {
                toolbarConfig = null;
            }
            if (toolbarConfig != null) {
                ComposerScreenConfig.ToolbarConfig.DefaultState defaultState = toolbarConfig.getDefaultState();
                if (defaultState == null || (defaultToolbarBackground = defaultState.getBackgroundColor()) == null) {
                    ComposerThemeProvider composerThemeProvider = i11 instanceof ComposerThemeProvider ? (ComposerThemeProvider) i11 : null;
                    if (composerThemeProvider != null) {
                        defaultToolbarBackground = composerThemeProvider.getDefaultToolbarBackground();
                    } else {
                        num = null;
                        ComposerScreenConfig.ToolbarConfig.DefaultState defaultState2 = toolbarConfig.getDefaultState();
                        dVar.p0(new u(defaultState2 != null ? new u.b(defaultState2.getDrawableId(), defaultState2.getNavigationUpEnabled(), defaultState2.getTitle(), titleAlign(defaultState2), num, defaultState2.getIconColor()) : null, toolbarConfig.getInsetStart()));
                    }
                }
                num = defaultToolbarBackground;
                ComposerScreenConfig.ToolbarConfig.DefaultState defaultState22 = toolbarConfig.getDefaultState();
                dVar.p0(new u(defaultState22 != null ? new u.b(defaultState22.getDrawableId(), defaultState22.getNavigationUpEnabled(), defaultState22.getTitle(), titleAlign(defaultState22), num, defaultState22.getIconColor()) : null, toolbarConfig.getInsetStart()));
            }
        }
        if (displayMode == f.e.BOTTOM_SHEET_WRAP && (bottomSheetConfig = config.getBottomSheetConfig()) != null) {
            dVar.g0(bottomSheetConfig.getMinHeight());
        }
        s createLoaderConfig = createLoaderConfig(i11);
        if (createLoaderConfig != null) {
            dVar.f0(createLoaderConfig);
        }
        dVar.h(interceptors);
        if (this.featureService.getBooleanKey(ComposerErrorStateFactoryEnabled.INSTANCE)) {
            dVar.g(errorStateFactory);
        }
        if (this.featureService.getBooleanKey(InitialWidgetsProviderEnabled.INSTANCE)) {
            dVar.R(initialWidgetsProvider);
        }
        dVar.Z(this.testUserStorage.isTestUser());
        dVar.V(this.featureService.getBooleanKey(ComposerDecorationsNewUpdaterFlag.INSTANCE));
        dVar.X(this.featureService.getBooleanKey(ComposerSnapshotOutsideScreenEnabled.INSTANCE));
        dVar.f(this.composerDebugMenuHostApi);
        dVar.k(this.featureService.getBooleanKey(FullComposerSnapshotEnabled.INSTANCE));
        dVar.r0(this.featureService.getBooleanKey(ZeroElevationForComposerStickyPlaceholderEnabled.INSTANCE));
        return dVar.e();
    }
}

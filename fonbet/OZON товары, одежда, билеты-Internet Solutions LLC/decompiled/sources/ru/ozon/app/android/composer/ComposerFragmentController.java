package ru.ozon.app.android.composer;

import Ih.b;
import QZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import a00.C4911f;
import a00.h;
import android.app.Application;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import hi.InterfaceC6958a;
import j10.InterfaceC7238a;
import j10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.f;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentFactory;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.composer.flags.ComposerViewPoolLeakFixEnabled;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.l;
import s10.InterfaceC9582a;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001e\u0010L\u001a\u00060Jj\u0002`K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020Y0`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020Y0d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010k\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lru/ozon/app/android/composer/ComposerFragmentController;", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "fragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "Ll10/f$e;", "displayMode", "LQZ/g;", "interceptors", "LE00/a;", "errorStateFactory", "LC00/a;", "initialWidgetsProvider", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;La00/f;La00/h;Ljava/util/Set;Ll10/f$e;Ljava/util/Set;LE00/a;LC00/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Ll10/i;", "createComposerScreenUiContainer", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll10/i;", "", "clear", "()V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "getFragment", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getConfig$composer_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "La00/f;", "getOwnerContainer$composer_prodGoogleAllVendorsRelease", "()La00/f;", "La00/h;", "getViewModelOwnerProvider$composer_prodGoogleAllVendorsRelease", "()La00/h;", "Ljava/util/Set;", "Landroid/app/Application;", "kotlin.jvm.PlatformType", "application", "Landroid/app/Application;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/di/page/RetainComposerViewModel;", "retainViewModel", "Lru/ozon/app/android/composer/di/page/RetainComposerViewModel;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "retainComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Ll10/f;", "screen", "Ll10/f;", "getScreen", "()Ll10/f;", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LSg/a;", "getAnalyticsScreenStorage$composer_prodGoogleAllVendorsRelease", "()LSg/a;", "LIh/b;", "pagePerformanceTracker", "LIh/b;", "getPagePerformanceTracker$composer_prodGoogleAllVendorsRelease", "()LIh/b;", "Ls10/a;", "component", "Ls10/a;", "LQZ/a;", "Lru/ozon/composer/ui/widget/l;", "composer", "LQZ/a;", "Lj10/a;", "getComposerStore", "()Lj10/a;", "composerStore", "Lj10/h$b;", "getComposerItemsHelper", "()Lj10/h$b;", "composerItemsHelper", "Lj10/h$a;", "getComposerOverlayItemsHelper", "()Lj10/h$a;", "composerOverlayItemsHelper", "Ll10/b;", "getController", "()Ll10/b;", "controller", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerFragmentController {

    @NotNull
    private final Sg.a analyticsScreenStorage;
    private final Application application;

    @NotNull
    private final InterfaceC9582a component;

    @NotNull
    private final QZ.a<l> composer;

    @NotNull
    private final ComposerScreenConfig config;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;

    @NotNull
    private final ComposerFragment fragment;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final b pagePerformanceTracker;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final RetainComposerComponent retainComponent;

    @NotNull
    private final RetainComposerViewModel retainViewModel;

    @NotNull
    private final f screen;

    @NotNull
    private final h viewModelOwnerProvider;

    @NotNull
    private final Set<Widget> widgets;

    public ComposerFragmentController(@NotNull ComposerFragment fragment, @NotNull ComposerScreenConfig config, @NotNull C4911f ownerContainer, @NotNull h viewModelOwnerProvider, @NotNull Set<Widget> widgets, @NotNull f.e displayMode, @NotNull Set<? extends g> interceptors, @NotNull E00.a errorStateFactory, @NotNull C00.a initialWidgetsProvider) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(errorStateFactory, "errorStateFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        this.fragment = fragment;
        this.config = config;
        this.ownerContainer = ownerContainer;
        this.viewModelOwnerProvider = viewModelOwnerProvider;
        this.widgets = widgets;
        this.application = fragment.requireActivity().getApplication();
        this.featureChecker = k.b(new ComposerFragmentController$featureChecker$2(this));
        RetainComposerViewModel retainComposerViewModel = (RetainComposerViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.composer.ComposerFragmentController$special$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Application application;
                Set set;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                application = ComposerFragmentController.this.application;
                Intrinsics.checkNotNullExpressionValue(application, "access$getApplication$p(...)");
                set = ComposerFragmentController.this.widgets;
                ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = ComposerFragmentController.this.getConfig().getBottomSheetConfig();
                return new RetainComposerViewModel(application, set, bottomSheetConfig != null ? bottomSheetConfig.getIsPageViewTrackingEnabled() : ComposerFragmentController.this.getConfig().getIsPageViewTrackingEnabled());
            }
        }).a(RetainComposerViewModel.class);
        this.retainViewModel = retainComposerViewModel;
        RetainComposerComponent retainComponent = retainComposerViewModel.getRetainComponent();
        this.retainComponent = retainComponent;
        ComposerReferences create = retainComponent.getComposerReferencesFactory().create(ownerContainer, viewModelOwnerProvider);
        this.references = create;
        f create2 = retainComponent.getComposerScreenFactory().create(config, ownerContainer, viewModelOwnerProvider, create, displayMode, interceptors, errorStateFactory, initialWidgetsProvider);
        this.screen = create2;
        this.analyticsScreenStorage = retainComponent.getAnalyticsScreenStorage();
        this.pagePerformanceTracker = retainComponent.getPagePerformanceTracker();
        InterfaceC9582a b11 = create2.b();
        this.component = b11;
        QZ.a<l> composer = b11.getComposer();
        this.composer = composer;
        retainComposerViewModel.getComponentStorage().b(RetainComposerComponentApi.class, new AB.b(new RetainComposerComponentFactory(retainComponent).create(b11, composer), 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6958a _init_$lambda$1(RetainComposerComponentApi retainComposerComponentApi) {
        return retainComposerComponentApi;
    }

    private final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    public final void clear() {
        if (getFeatureChecker().isEnabled(ComposerViewPoolLeakFixEnabled.INSTANCE)) {
            this.references.getComposerViewPoolProvider().clear();
        }
    }

    @NotNull
    public final i createComposerScreenUiContainer(@NotNull LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.screen.d(inflater, container, this.retainComponent.getViewInitBlockProvider().provide());
    }

    @NotNull
    /* renamed from: getAnalyticsScreenStorage$composer_prodGoogleAllVendorsRelease, reason: from getter */
    public final Sg.a getAnalyticsScreenStorage() {
        return this.analyticsScreenStorage;
    }

    @NotNull
    public final h.b<l> getComposerItemsHelper() {
        return this.composer.p();
    }

    @NotNull
    public final h.a<l> getComposerOverlayItemsHelper() {
        return this.composer.q();
    }

    @NotNull
    public final InterfaceC7238a<l> getComposerStore() {
        return this.composer.r();
    }

    @NotNull
    /* renamed from: getConfig$composer_prodGoogleAllVendorsRelease, reason: from getter */
    public final ComposerScreenConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final InterfaceC7851b getController() {
        return this.component.getComposerController();
    }

    @NotNull
    /* renamed from: getOwnerContainer$composer_prodGoogleAllVendorsRelease, reason: from getter */
    public final C4911f getOwnerContainer() {
        return this.ownerContainer;
    }

    @NotNull
    /* renamed from: getPagePerformanceTracker$composer_prodGoogleAllVendorsRelease, reason: from getter */
    public final b getPagePerformanceTracker() {
        return this.pagePerformanceTracker;
    }

    @NotNull
    public final ComposerReferences getReferences() {
        return this.references;
    }

    @NotNull
    public final f getScreen() {
        return this.screen;
    }

    @NotNull
    /* renamed from: getViewModelOwnerProvider$composer_prodGoogleAllVendorsRelease, reason: from getter */
    public final a00.h getViewModelOwnerProvider() {
        return this.viewModelOwnerProvider;
    }
}

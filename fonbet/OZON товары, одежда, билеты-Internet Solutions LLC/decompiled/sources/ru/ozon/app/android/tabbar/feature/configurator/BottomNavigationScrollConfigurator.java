package ru.ozon.app.android.tabbar.feature.configurator;

import A00.a;
import Pc.a;
import Sc.InterfaceC4008j;
import T00.e;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import i10.C6997c;
import j10.InterfaceC7238a;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.viewmodel.HideTabBarOnScrollViewModel;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001:\u0018\u0000 A2\u00020\u0001:\u0001AB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R!\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/tabbar/feature/configurator/BottomNavigationScrollConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "currentMiniAppHolder", "LPc/a;", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;", "hideTabBarOnScrollWidgetViewModelProvider", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;LPc/a;)V", "LT00/e;", "pageInfo", "", "updateHideOnScrollFlag", "(LT00/e;)V", "", "disableFeatureBottomOffset", "()I", "", "", "mapToSet", "(Ljava/lang/String;)Ljava/util/Set;", "onComposerInitialized", "()V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "LPc/a;", "", "hideOnScroll", "Z", "hideTabBarOnScrollMainPageTypes$delegate", "LSc/j;", "getHideTabBarOnScrollMainPageTypes", "()Ljava/util/Set;", "hideTabBarOnScrollMainPageTypes", "hideTabBarOnScrollApparelPageTypes$delegate", "getHideTabBarOnScrollApparelPageTypes", "hideTabBarOnScrollApparelPageTypes", "hideTabBarOnScrollFreshPageTypes$delegate", "getHideTabBarOnScrollFreshPageTypes", "hideTabBarOnScrollFreshPageTypes", "hideTabBarOnScrollTravelPageTypes$delegate", "getHideTabBarOnScrollTravelPageTypes", "hideTabBarOnScrollTravelPageTypes", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "bottomNavigationAnimationController", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "hideTabBarOnScrollWidgetViewModel", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;", "ru/ozon/app/android/tabbar/feature/configurator/BottomNavigationScrollConfigurator$scrollListener$1", "scrollListener", "Lru/ozon/app/android/tabbar/feature/configurator/BottomNavigationScrollConfigurator$scrollListener$1;", "Landroidx/lifecycle/W;", "LA00/a;", "scrollFlagObserver", "Landroidx/lifecycle/W;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomNavigationScrollConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private BottomNavigationAnimationController bottomNavigationAnimationController;

    @NotNull
    private final CurrentMiniAppHolder currentMiniAppHolder;
    private boolean hideOnScroll;

    /* renamed from: hideTabBarOnScrollApparelPageTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hideTabBarOnScrollApparelPageTypes;

    /* renamed from: hideTabBarOnScrollFreshPageTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hideTabBarOnScrollFreshPageTypes;

    /* renamed from: hideTabBarOnScrollMainPageTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hideTabBarOnScrollMainPageTypes;

    /* renamed from: hideTabBarOnScrollTravelPageTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hideTabBarOnScrollTravelPageTypes;
    private HideTabBarOnScrollViewModel hideTabBarOnScrollWidgetViewModel;

    @NotNull
    private final a<HideTabBarOnScrollViewModel> hideTabBarOnScrollWidgetViewModelProvider;
    private RecyclerView recyclerView;

    @NotNull
    private final W<A00.a> scrollFlagObserver;

    @NotNull
    private final BottomNavigationScrollConfigurator$scrollListener$1 scrollListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tabbar/feature/configurator/BottomNavigationScrollConfigurator$Companion;", "", "<init>", "()V", "DEFAULT_DISABLE_HIDING_ON_SCROLL_BOTTOM_LIMIT", "", "PAGE_TYPE_SELLER", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator$scrollListener$1] */
    public BottomNavigationScrollConfigurator(@NotNull FeatureService featureService, @NotNull CurrentMiniAppHolder currentMiniAppHolder, @NotNull a<HideTabBarOnScrollViewModel> hideTabBarOnScrollWidgetViewModelProvider) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(hideTabBarOnScrollWidgetViewModelProvider, "hideTabBarOnScrollWidgetViewModelProvider");
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.hideTabBarOnScrollWidgetViewModelProvider = hideTabBarOnScrollWidgetViewModelProvider;
        this.hideTabBarOnScrollMainPageTypes = LazyUtilsKt.unsafeLazy(new BottomNavigationScrollConfigurator$hideTabBarOnScrollMainPageTypes$2(featureService, this));
        this.hideTabBarOnScrollApparelPageTypes = LazyUtilsKt.unsafeLazy(new BottomNavigationScrollConfigurator$hideTabBarOnScrollApparelPageTypes$2(this, featureService));
        this.hideTabBarOnScrollFreshPageTypes = LazyUtilsKt.unsafeLazy(new BottomNavigationScrollConfigurator$hideTabBarOnScrollFreshPageTypes$2(this, featureService));
        this.hideTabBarOnScrollTravelPageTypes = LazyUtilsKt.unsafeLazy(new BottomNavigationScrollConfigurator$hideTabBarOnScrollTravelPageTypes$2(this, featureService));
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator$scrollListener$1
            private final int getBottomScrollOffset(RecyclerView recyclerView) {
                return Math.max((recyclerView.computeVerticalScrollRange() - recyclerView.getMeasuredHeight()) - recyclerView.computeVerticalScrollOffset(), 0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
            
                r7 = r5.this$0.bottomNavigationAnimationController;
             */
            /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
            
                r7 = r5.this$0.hideTabBarOnScrollWidgetViewModel;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                boolean z11;
                BottomNavigationAnimationController bottomNavigationAnimationController;
                int disableFeatureBottomOffset;
                HideTabBarOnScrollViewModel hideTabBarOnScrollViewModel;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                z11 = BottomNavigationScrollConfigurator.this.hideOnScroll;
                if ((!z11 && (hideTabBarOnScrollViewModel == null || !hideTabBarOnScrollViewModel.getHideOnScroll())) || dy == 0 || bottomNavigationAnimationController == null) {
                    return;
                }
                BottomNavigationScrollConfigurator bottomNavigationScrollConfigurator = BottomNavigationScrollConfigurator.this;
                int bottomScrollOffset = getBottomScrollOffset(recyclerView);
                disableFeatureBottomOffset = bottomNavigationScrollConfigurator.disableFeatureBottomOffset();
                if (bottomScrollOffset < disableFeatureBottomOffset) {
                    BottomNavigationAnimationController.DefaultImpls.showBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController, 0L, 1, null);
                } else if (dy > 0) {
                    BottomNavigationAnimationController.DefaultImpls.hideBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController, 0L, 1, null);
                } else if (dy < 0) {
                    BottomNavigationAnimationController.DefaultImpls.showBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController, 0L, 1, null);
                }
            }
        };
        this.scrollFlagObserver = new W() { // from class: XL.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                BottomNavigationScrollConfigurator.scrollFlagObserver$lambda$0(BottomNavigationScrollConfigurator.this, (A00.a) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int disableFeatureBottomOffset() {
        C4911f ownerContainer;
        ConfiguratorReferences references = getReferences();
        ComponentCallbacksC5392m c11 = (references == null || (ownerContainer = references.getOwnerContainer()) == null) ? null : ownerContainer.c();
        ExternalOffsetHandler externalOffsetHandler = c11 instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) c11 : null;
        if (externalOffsetHandler != null) {
            return externalOffsetHandler.getMaxBottomOffset();
        }
        return -1;
    }

    private final Set<String> getHideTabBarOnScrollApparelPageTypes() {
        return (Set) this.hideTabBarOnScrollApparelPageTypes.getValue();
    }

    private final Set<String> getHideTabBarOnScrollFreshPageTypes() {
        return (Set) this.hideTabBarOnScrollFreshPageTypes.getValue();
    }

    private final Set<String> getHideTabBarOnScrollMainPageTypes() {
        return (Set) this.hideTabBarOnScrollMainPageTypes.getValue();
    }

    private final Set<String> getHideTabBarOnScrollTravelPageTypes() {
        return (Set) this.hideTabBarOnScrollTravelPageTypes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> mapToSet(String str) {
        return l.E(l.h(l.v(h.c0(str, new String[]{","}), BottomNavigationScrollConfigurator$mapToSet$1.INSTANCE), BottomNavigationScrollConfigurator$mapToSet$2.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollFlagObserver$lambda$0(BottomNavigationScrollConfigurator bottomNavigationScrollConfigurator, A00.a event) {
        InterfaceC7238a<ru.ozon.composer.ui.widget.l> composerStore;
        C6997c<ru.ozon.composer.ui.widget.l> b11;
        T00.a m11;
        C7475g composerWidgetComponentStorage;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C2370k) {
            ConfiguratorReferences references = bottomNavigationScrollConfigurator.getReferences();
            e eVar = null;
            RetainComposerComponentApi retainComposerComponentApi = (references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : (RetainComposerComponentApi) composerWidgetComponentStorage.getComponent(RetainComposerComponentApi.class);
            if (retainComposerComponentApi != null && (composerStore = retainComposerComponentApi.getComposerStore()) != null && (b11 = composerStore.b()) != null && (m11 = b11.m()) != null) {
                eVar = m11.h();
            }
            bottomNavigationScrollConfigurator.updateHideOnScrollFlag(eVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void updateHideOnScrollFlag(e pageInfo) {
        String e11;
        boolean z11;
        if (pageInfo == null || (e11 = pageInfo.e()) == null) {
            return;
        }
        String currentMiniApp = this.currentMiniAppHolder.getCurrentMiniApp();
        switch (currentMiniApp.hashCode()) {
            case -1339606153:
                if (currentMiniApp.equals("supermarket")) {
                    z11 = getHideTabBarOnScrollFreshPageTypes().contains(e11);
                    break;
                }
                z11 = false;
                break;
            case -865698022:
                if (currentMiniApp.equals("travel")) {
                    z11 = getHideTabBarOnScrollTravelPageTypes().contains(e11);
                    break;
                }
                z11 = false;
                break;
            case -793554375:
                if (currentMiniApp.equals("apparel")) {
                    z11 = getHideTabBarOnScrollApparelPageTypes().contains(e11);
                    break;
                }
                z11 = false;
                break;
            case 3343801:
                if (currentMiniApp.equals("main")) {
                    z11 = getHideTabBarOnScrollMainPageTypes().contains(e11);
                    break;
                }
                z11 = false;
                break;
            default:
                z11 = false;
                break;
        }
        this.hideOnScroll = z11;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        final ComponentCallbacksC5392m c11;
        a00.h viewModelOwnerProvider;
        ConfiguratorReferences references = getReferences();
        BottomNavigationAnimationController bottomNavigationAnimationController = null;
        this.hideTabBarOnScrollWidgetViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null) ? null : (HideTabBarOnScrollViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Pc.a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = BottomNavigationScrollConfigurator.this.hideTabBarOnScrollWidgetViewModelProvider;
                HideTabBarOnScrollViewModel hideTabBarOnScrollViewModel = (HideTabBarOnScrollViewModel) aVar.get();
                Intrinsics.g(hideTabBarOnScrollViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hideTabBarOnScrollViewModel;
            }
        }).a(HideTabBarOnScrollViewModel.class);
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        ComponentCallbacksC5392m componentCallbacksC5392m = c11;
        BottomNavigationAnimationController bottomNavigationAnimationController2 = null;
        while (true) {
            if (bottomNavigationAnimationController2 != null) {
                bottomNavigationAnimationController = bottomNavigationAnimationController2;
                break;
            }
            if ((componentCallbacksC5392m != null ? componentCallbacksC5392m.getParentFragment() : null) == null) {
                break;
            }
            InterfaceC5431s parentFragment = componentCallbacksC5392m.getParentFragment();
            if (!(parentFragment instanceof BottomNavigationAnimationController)) {
                parentFragment = null;
            }
            bottomNavigationAnimationController2 = (BottomNavigationAnimationController) parentFragment;
            componentCallbacksC5392m = componentCallbacksC5392m.getParentFragment();
        }
        this.bottomNavigationAnimationController = bottomNavigationAnimationController;
        c11.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator$onComposerInitialized$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                RecyclerView recyclerView;
                BottomNavigationAnimationController bottomNavigationAnimationController3;
                BottomNavigationScrollConfigurator$scrollListener$1 bottomNavigationScrollConfigurator$scrollListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                BottomNavigationScrollConfigurator bottomNavigationScrollConfigurator = BottomNavigationScrollConfigurator.this;
                View view = c11.getView();
                bottomNavigationScrollConfigurator.recyclerView = view != null ? ComposerViewExtensionKt.composerRecyclerView(view) : null;
                recyclerView = BottomNavigationScrollConfigurator.this.recyclerView;
                if (recyclerView != null) {
                    bottomNavigationScrollConfigurator$scrollListener$1 = BottomNavigationScrollConfigurator.this.scrollListener;
                    recyclerView.addOnScrollListener(bottomNavigationScrollConfigurator$scrollListener$1);
                }
                bottomNavigationAnimationController3 = BottomNavigationScrollConfigurator.this.bottomNavigationAnimationController;
                if (bottomNavigationAnimationController3 != null) {
                    bottomNavigationAnimationController3.showBottomNavigationWithTranslationAnimation(0L);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                RecyclerView recyclerView;
                BottomNavigationScrollConfigurator$scrollListener$1 bottomNavigationScrollConfigurator$scrollListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                recyclerView = BottomNavigationScrollConfigurator.this.recyclerView;
                if (recyclerView != null) {
                    bottomNavigationScrollConfigurator$scrollListener$1 = BottomNavigationScrollConfigurator.this.scrollListener;
                    recyclerView.removeOnScrollListener(bottomNavigationScrollConfigurator$scrollListener$1);
                }
                BottomNavigationScrollConfigurator.this.recyclerView = null;
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.bottomNavigationAnimationController = null;
        this.hideTabBarOnScrollWidgetViewModel = null;
        super.onDestroy(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references != null) {
            references.getController().getEvents().observe(references.getOwnerContainer().g(), this.scrollFlagObserver);
        }
        super.onStart(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        InterfaceC7851b controller;
        C5423j events;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null && (events = controller.getEvents()) != null) {
            events.removeObserver(this.scrollFlagObserver);
        }
        super.onStop(owner);
    }
}

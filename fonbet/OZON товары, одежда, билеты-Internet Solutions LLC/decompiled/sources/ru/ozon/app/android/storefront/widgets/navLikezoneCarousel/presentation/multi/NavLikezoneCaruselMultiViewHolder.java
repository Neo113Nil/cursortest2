package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi;

import U7.d;
import Vg.c;
import WZ.l;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.NavLikezoneCaruselVI;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler.NavLikezoneCaruselBannerMultiAdapter;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 *2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001*B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/NavLikezoneCaruselMultiViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Multi;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/navBar/v2/NavBarRepaintable;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti$View;", "navLikezoneCaruselBannerMulti", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti$View;LWZ/l;LVg/c;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Multi;Ll20/d;)V", "onDetach", "()V", "", "alpha", "onFloorAlphaChanged", "(F)V", "", "hasAlphaChangingFloor", "onNavbarConfigured", "(ZF)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti$View;", "LWZ/l;", "LVg/c;", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselMultiViewHolder extends k<NavLikezoneCaruselVI.Multi> implements NavBarRepaintable {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private float alpha;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final NavLikezoneCaruselBannerMulti.View navLikezoneCaruselBannerMulti;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.NavLikezoneCaruselMultiViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (NavLikezoneCaruselMultiViewHolder.this.alpha >= 0.5f) {
                NavLikezoneCaruselBannerMulti.View view = NavLikezoneCaruselMultiViewHolder.this.navLikezoneCaruselBannerMulti;
                NavLikezoneCaruselVI.Multi boundData = NavLikezoneCaruselMultiViewHolder.this.getBoundData();
                view.startAutoScroll(boundData != null ? boundData.getScrollTime() : null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.NavLikezoneCaruselMultiViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavLikezoneCaruselMultiViewHolder.this.navLikezoneCaruselBannerMulti.stopAutoScroll();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "currentPage", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.NavLikezoneCaruselMultiViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            BannerItem bannerItem;
            NavLikezoneCaruselVI.Multi boundData = NavLikezoneCaruselMultiViewHolder.this.getBoundData();
            if (boundData == null || (bannerItem = boundData.getBanners().get(i11)) == null) {
                return;
            }
            bannerItem.trackScrollEvent(NavLikezoneCaruselMultiViewHolder.this.tokenizedAnalytics);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavLikezoneCaruselMultiViewHolder(@NotNull NavLikezoneCaruselBannerMulti.View navLikezoneCaruselBannerMulti, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull final ComposerReferences composerReferences) {
        super(navLikezoneCaruselBannerMulti);
        Intrinsics.checkNotNullParameter(navLikezoneCaruselBannerMulti, "navLikezoneCaruselBannerMulti");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.navLikezoneCaruselBannerMulti = navLikezoneCaruselBannerMulti;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStore = customActionHandlersStore;
        this.alpha = 1.0f;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NavLikezoneCaruselMultiViewHolder$actionHandler$1(this)).onPreProcess(new NavLikezoneCaruselMultiViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        d.c(composerReferences).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.NavLikezoneCaruselMultiViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                composerReferences.getContainer().g().getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                NavLikezoneCaruselVI.Multi boundData = NavLikezoneCaruselMultiViewHolder.this.getBoundData();
                if (boundData != null) {
                    boundData.setRestoredPage(NavLikezoneCaruselMultiViewHolder.this.navLikezoneCaruselBannerMulti.getNearestPagePosition());
                }
            }
        });
        navLikezoneCaruselBannerMulti.setupRecyclerView(new NavLikezoneCaruselBannerMultiAdapter(tokenizedAnalytics, buildHandler, new AnonymousClass2(), new AnonymousClass3(), composerReferences.getContainer().g()));
        navLikezoneCaruselBannerMulti.attachActionHandler(buildHandler);
        navLikezoneCaruselBannerMulti.onManualScrollPage(new AnonymousClass4());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.navLikezoneCaruselBannerMulti.stopAutoScroll();
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onFloorAlphaChanged(float alpha) {
        this.alpha = alpha;
        if (alpha < 0.5f && this.navLikezoneCaruselBannerMulti.getIsAutoScrollPlaying()) {
            this.navLikezoneCaruselBannerMulti.disableScroll();
        } else {
            if (alpha < 0.5f || this.navLikezoneCaruselBannerMulti.getIsAutoScrollPlaying()) {
                return;
            }
            this.navLikezoneCaruselBannerMulti.enableScroll();
        }
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onNavbarConfigured(boolean hasAlphaChangingFloor, float alpha) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavLikezoneCaruselVI.Multi item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        item.applyState(this.navLikezoneCaruselBannerMulti);
        this.navLikezoneCaruselBannerMulti.restorePage(item.getRestoredPage());
    }
}

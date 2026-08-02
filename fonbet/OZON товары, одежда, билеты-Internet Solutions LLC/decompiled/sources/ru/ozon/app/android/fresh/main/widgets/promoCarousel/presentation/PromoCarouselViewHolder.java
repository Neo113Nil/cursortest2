package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import BF.b;
import Cm.RunnableC2781a;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Parcelable;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.p;
import io.reactivex.u;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.AdapterSpanSize;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.PromoCarouselBannerDecorator;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.PromoCarouselBannersAdapter;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.PromoCarouselBannersViewAdapter;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewHolder;
import ru.ozon.app.android.uikit.utils.FigmaInterpolator;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J3\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00110(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\b\u0001\u0012\u00020.0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselRecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerDecorator;", "decorator", "", "isPreCreateWidgetsCategoryMainPageFresh", "isNewPromoCarousel", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselRecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerDecorator;ZZ)V", "", "startAnimation", "()V", "onAttach", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;Ll20/d;)V", "onRecycle", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselRecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerDecorator;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "Ljk0/j;", "promoCarouselBannersAdapter", "Ljk0/i;", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/view/animation/PathInterpolator;", "interpolator", "Landroid/view/animation/PathInterpolator;", "Lnc/b;", "scrollAnimationDisposable", "Lnc/b;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselViewHolder extends k<PromoCarouselVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final PromoCarouselRecyclerView containerView;

    @NotNull
    private final PromoCarouselBannerDecorator decorator;

    @NotNull
    private final GridLayoutManager gridLayoutManager;

    @NotNull
    private final PathInterpolator interpolator;

    @NotNull
    private final i<PromoCarouselVO.PromoCarouselBannerVO, ? extends j> promoCarouselBannersAdapter;
    private InterfaceC8487b scrollAnimationDisposable;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCarouselViewHolder(@NotNull PromoCarouselRecyclerView containerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull PromoCarouselBannerDecorator decorator, boolean z11, boolean z12) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(decorator, "decorator");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.decorator = decorator;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        i<PromoCarouselVO.PromoCarouselBannerVO, ? extends j> promoCarouselBannersViewAdapter = z12 ? new PromoCarouselBannersViewAdapter(buildHandler, tokenizedAnalytics, this, z11) : new PromoCarouselBannersAdapter(buildHandler, tokenizedAnalytics, this, z11);
        this.promoCarouselBannersAdapter = promoCarouselBannersViewAdapter;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, 0);
        gridLayoutManager.n(new GridLayoutManager.c() { // from class: ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewHolder$gridLayoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int position) {
                Object obj;
                obj = PromoCarouselViewHolder.this.promoCarouselBannersAdapter;
                Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.AdapterSpanSize");
                return ((AdapterSpanSize) obj).getSpanSize(position);
            }
        });
        this.gridLayoutManager = gridLayoutManager;
        this.interpolator = FigmaInterpolator.INSTANCE.getEaseInAndOut();
        containerView.setAdapter(promoCarouselBannersViewAdapter);
        containerView.setItemAnimator(null);
        containerView.setLayoutManager(gridLayoutManager);
        containerView.addItemDecoration(decorator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(PromoCarouselViewHolder promoCarouselViewHolder, PromoCarouselVO promoCarouselVO) {
        RecyclerView.o layoutManager = promoCarouselViewHolder.containerView.getLayoutManager();
        if (layoutManager == null || promoCarouselVO.getLayoutManagerState() != null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    private final void startAnimation() {
        Float valueOf = Float.valueOf(24.0f);
        Float valueOf2 = Float.valueOf(-24.0f);
        this.scrollAnimationDisposable = p.fromArray(valueOf, valueOf2, valueOf, valueOf2, Float.valueOf(0.0f)).concatMap(new b(PromoCarouselViewHolder$startAnimation$1.INSTANCE, 2)).observeOn(C8125a.a()).doOnSubscribe(new DM.b(new PromoCarouselViewHolder$startAnimation$2(this), 1)).doFinally(new InterfaceC9019a() { // from class: Fw.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                PromoCarouselViewHolder.startAnimation$lambda$8(PromoCarouselViewHolder.this);
            }
        }).subscribe(new Fw.b(new PromoCarouselViewHolder$startAnimation$4(this), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u startAnimation$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$8(PromoCarouselViewHolder promoCarouselViewHolder) {
        promoCarouselViewHolder.containerView.onAnimationEnded();
        promoCarouselViewHolder.containerView.smoothScrollBy(0, 0, promoCarouselViewHolder.interpolator, 0);
        promoCarouselViewHolder.composerReferences.getController().update(UpdateAnimationEvent.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.composerReferences.getController().getEvents().observe(this, new PromoCarouselViewHolder$sam$androidx_lifecycle_Observer$0(new PromoCarouselViewHolder$onAttach$1(this)));
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewHolder$onAttach$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                InterfaceC8487b interfaceC8487b;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                interfaceC8487b = PromoCarouselViewHolder.this.scrollAnimationDisposable;
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }
        });
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        PromoCarouselVO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.containerView.getLayoutManager();
            boundData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromoCarouselVO item, @NotNull d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = this.containerView.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        this.promoCarouselBannersAdapter.submitList(item.getBanners(), new RunnableC2781a(1, this, item));
        if (item.getHasAnimation()) {
            startAnimation();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PromoCarouselVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PromoCarouselViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

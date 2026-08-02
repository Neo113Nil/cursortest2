package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding;

import WR.b;
import WR.c;
import WR.d;
import WR.e;
import WR.f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010'\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u0014\u0010)\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010*\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5MultiFrameBindDelegate;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/ViewHolderLifecycle;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;", "stateBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "", "onAttach", "()V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindAwardBadge", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindImages", "bindTitle", "bindAddress", "bindReviews", "bindReviewsIcon", "bindRatingBadge", "bindPromoTitle", "bindPromoView", "bindImageBadges", "", "steps", "Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5MultiFrameBindDelegate implements ViewHolderLifecycle {

    @NotNull
    private final BindStep bindAddress;

    @NotNull
    private final BindStep bindAwardBadge;

    @NotNull
    private final BindStep bindImageBadges;

    @NotNull
    private final BindStep bindImages;

    @NotNull
    private final BindStep bindPromoTitle;

    @NotNull
    private final BindStep bindPromoView;

    @NotNull
    private final BindStep bindRatingBadge;

    @NotNull
    private final BindStep bindReviews;

    @NotNull
    private final BindStep bindReviewsIcon;

    @NotNull
    private final BindStep bindTitle;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final HotelsSearchResultsV5ViewStateBinder stateBinder;

    @NotNull
    private final List<BindStep> steps;

    public HotelsSearchResultsV5MultiFrameBindDelegate(@NotNull HotelsSearchResultsV5CardView view, @NotNull ComposerReferences references, @NotNull HotelsSearchResultsV5ViewStateBinder stateBinder, @NotNull FrameBinder frameBinder) {
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(stateBinder, "stateBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.stateBinder = stateBinder;
        this.frameBinder = frameBinder;
        BindStep bindStep = new BindStep() { // from class: WR.a
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindAwardBadge$lambda$0;
                bindAwardBadge$lambda$0 = HotelsSearchResultsV5MultiFrameBindDelegate.bindAwardBadge$lambda$0(HotelsSearchResultsV5MultiFrameBindDelegate.this);
                return bindAwardBadge$lambda$0;
            }
        };
        this.bindAwardBadge = bindStep;
        int i11 = 0;
        b bVar = new b(this, i11);
        this.bindImages = bVar;
        c cVar = new c(this, i11);
        this.bindTitle = cVar;
        d dVar = new d(this, i11);
        this.bindAddress = dVar;
        e eVar = new e(this, i11);
        this.bindReviews = eVar;
        f fVar = new f(this, i11);
        this.bindReviewsIcon = fVar;
        BindStep bindStep2 = new BindStep() { // from class: WR.g
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindRatingBadge$lambda$6;
                bindRatingBadge$lambda$6 = HotelsSearchResultsV5MultiFrameBindDelegate.bindRatingBadge$lambda$6(HotelsSearchResultsV5MultiFrameBindDelegate.this);
                return bindRatingBadge$lambda$6;
            }
        };
        this.bindRatingBadge = bindStep2;
        BindStep bindStep3 = new BindStep() { // from class: WR.h
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindPromoTitle$lambda$7;
                bindPromoTitle$lambda$7 = HotelsSearchResultsV5MultiFrameBindDelegate.bindPromoTitle$lambda$7(HotelsSearchResultsV5MultiFrameBindDelegate.this);
                return bindPromoTitle$lambda$7;
            }
        };
        this.bindPromoTitle = bindStep3;
        BindStep bindStep4 = new BindStep() { // from class: WR.i
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindPromoView$lambda$8;
                bindPromoView$lambda$8 = HotelsSearchResultsV5MultiFrameBindDelegate.bindPromoView$lambda$8(HotelsSearchResultsV5MultiFrameBindDelegate.this);
                return bindPromoView$lambda$8;
            }
        };
        this.bindPromoView = bindStep4;
        BindStep bindStep5 = new BindStep() { // from class: WR.j
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindImageBadges$lambda$9;
                bindImageBadges$lambda$9 = HotelsSearchResultsV5MultiFrameBindDelegate.bindImageBadges$lambda$9(HotelsSearchResultsV5MultiFrameBindDelegate.this);
                return bindImageBadges$lambda$9;
            }
        };
        this.bindImageBadges = bindStep5;
        this.steps = C7714v.b0(bindStep, bVar, cVar, dVar, eVar, fVar, bindStep2, bindStep3, bindStep4, bindStep5);
        frameBinder.init(view);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2));
        stateBinder.initView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAddress$lambda$3(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindAddress();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAwardBadge$lambda$0(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindAwardBadge();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindImageBadges$lambda$9(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindImageBadges();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindImages$lambda$1(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindImages();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindPromoTitle$lambda$7(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindPromoTitle();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindPromoView$lambda$8(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindPromoView();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRatingBadge$lambda$6(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindRatingBadge();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReviews$lambda$4(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindReviews();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReviewsIcon$lambda$5(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindReviewsIcon();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindTitle$lambda$2(HotelsSearchResultsV5MultiFrameBindDelegate hotelsSearchResultsV5MultiFrameBindDelegate) {
        hotelsSearchResultsV5MultiFrameBindDelegate.stateBinder.bindTitle();
        return Unit.f71690a;
    }

    public final void bind(@NotNull HotelsSearchResultsV5CardVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.stateBinder.prepare(item, actionHandler);
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }

    public void onAttach() {
        this.frameBinder.onAttach(new HotelsSearchResultsV5MultiFrameBindDelegate$onAttach$1(this.stateBinder));
    }

    public void onDetach() {
        this.frameBinder.onDetach();
        this.stateBinder.onDetach();
    }

    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.stateBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public void onRecycle() {
        this.frameBinder.onRecycle();
        this.stateBinder.onRecycle();
    }
}

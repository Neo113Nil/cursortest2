package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation;

import DW.a;
import WZ.l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.core.LayoutManagerStateSaveUpdate;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.ReviewsFilterListAdapter;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.onboarding.ReviewsFilterOnboardingViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;", "onBoardingViewModel", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;Landroidx/recyclerview/widget/RecyclerView;LWZ/l;)V", "item", "", "bindOnboarding", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "saveScrollState", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/ReviewsFilterListAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "filtersAdapter", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/ReviewsFilterListAdapter;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterViewHolder extends k<ReviewsFilterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final ReviewsFilterListAdapter<ReviewsFilterVO.ReviewsFilterItemVO> filtersAdapter;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final ReviewsFilterOnboardingViewModel onBoardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float ONBOARDING_CORNER_RADIUS = UiExtKt.toPxF(24);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_CORNER_RADIUS", "", "getONBOARDING_CORNER_RADIUS", "()F", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getONBOARDING_CORNER_RADIUS() {
            return ReviewsFilterViewHolder.ONBOARDING_CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsFilterViewHolder(@NotNull ComposerReferences refs, @NotNull ReviewsFilterOnboardingViewModel onBoardingViewModel, @NotNull RecyclerView containerView, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.onBoardingViewModel = onBoardingViewModel;
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ReviewsFilterListAdapter<ReviewsFilterVO.ReviewsFilterItemVO> reviewsFilterListAdapter = new ReviewsFilterListAdapter<>(buildHandler);
        this.filtersAdapter = reviewsFilterListAdapter;
        containerView.setAdapter(reviewsFilterListAdapter);
        containerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    ReviewsFilterViewHolder.this.saveScrollState();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ReviewsFilterVO reviewsFilterVO, ReviewsFilterViewHolder reviewsFilterViewHolder) {
        RecyclerView.o layoutManager;
        if (reviewsFilterVO.getLayoutManagerState() == null || (layoutManager = reviewsFilterViewHolder.containerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(reviewsFilterVO.getLayoutManagerState());
    }

    private final void bindOnboarding(ReviewsFilterVO item) {
        List<ReviewsFilterVO.ReviewsFilterItemVO> filters = item.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return;
        }
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            if (((ReviewsFilterVO.ReviewsFilterItemVO) it.next()).getAspect().getState() != AspectDTO.AspectState.UNAVAILABLE) {
                if (item.getOnboarding() != null) {
                    OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), "reviews_filter_on_boarding_is_shown", this.onBoardingViewModel, this.containerView, new ReviewsFilterViewHolder$bindOnboarding$1(this, item));
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("reviews_filter_on_boarding_is_shown", this.refs, this.containerView, onBoarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new ReviewsFilterViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        InterfaceC7851b controller = this.refs.getController();
        ReviewsFilterVO boundData = getBoundData();
        Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
        RecyclerView.o layoutManager = this.containerView.getLayoutManager();
        controller.update(new LayoutManagerStateSaveUpdate(valueOf, layoutManager != null ? layoutManager.onSaveInstanceState() : null));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        saveScrollState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewsFilterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.filtersAdapter.submitList(item.getFilters(), new a(0, item, this));
        bindOnboarding(item);
    }
}

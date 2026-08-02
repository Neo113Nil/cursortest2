package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation;

import FK.a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetAdditionalServiceCardBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation.AdditionalServiceCardVO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.view.AdditionalServiceCardView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateLayout;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J#\u00101\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/H\u0014¢\u0006\u0004\b1\u00102J3\u00109\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00022\n\u00105\u001a\u000603j\u0002`42\u000e\u00108\u001a\n\u0018\u000106j\u0004\u0018\u0001`7H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u00112\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00110H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$PlaceholderState;", "state", "", "showPlaceholder", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$PlaceholderState;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$EmptyState;", "showEmptyState", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$EmptyState;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$AdditionalServiceCardState;", "showContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$AdditionalServiceCardState;)V", "setUpBackgroundView", "()V", "view", "", "radius", "clipToOutline", "(Landroid/view/View;F)V", "setUpDetailsVerticalLayout", "showDefaultError", "removeWidget", "hideContent", "", "", "excludedViewIds", "()Ljava/util/Set;", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalServiceCardBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalServiceCardBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "detailsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardWidgetViewModel;", "widgetViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalServiceCardWidgetViewHolder extends k<AdditionalServiceCardVO> implements AsyncWidgetCallbacks<AdditionalServiceCardVO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAdditionalServiceCardBinding binding;

    @NotNull
    private final AtomsAdapter detailsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServiceCardWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetAdditionalServiceCardBinding bind = WidgetAdditionalServiceCardBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.detailsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        setUpDetailsVerticalLayout();
        setUpBackgroundView();
        AppCompatImageView imageView = bind.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        clipToOutline(imageView, ResourceExtKt.toPxF(8, getContext()));
    }

    private final void clipToOutline(View view, float radius) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new RoundedOutlineProvider(radius));
    }

    private final Set<Integer> excludedViewIds() {
        Integer[] elements = {Integer.valueOf(this.binding.skeleton.getId()), Integer.valueOf(this.binding.emptyState.getId())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    private final AdditionalServiceCardWidgetViewModel getWidgetViewModel() {
        return (AdditionalServiceCardWidgetViewModel) getWidgetViewModel();
    }

    private final void hideContent() {
        Set<Integer> excludedViewIds = excludedViewIds();
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (!excludedViewIds.contains(Integer.valueOf(childAt.getId()))) {
                childAt.setVisibility(8);
            }
        }
    }

    private final void removeWidget() {
        AdditionalServiceCardVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    private final void setUpBackgroundView() {
        View backgroundView = this.binding.backgroundView;
        Intrinsics.checkNotNullExpressionValue(backgroundView, "backgroundView");
        clipToOutline(backgroundView, ResourceExtKt.toPxF(16, getContext()));
        this.binding.backgroundView.setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpBackgroundView$lambda$3(AdditionalServiceCardWidgetViewHolder additionalServiceCardWidgetViewHolder, View view) {
        AdditionalServiceCardVO boundData = additionalServiceCardWidgetViewHolder.getBoundData();
        AdditionalServiceCardVO.State state = boundData != null ? boundData.getState() : null;
        if (state instanceof AdditionalServiceCardVO.State.AdditionalServiceCardState) {
            additionalServiceCardWidgetViewHolder.actionHandler.invoke(((AdditionalServiceCardVO.State.AdditionalServiceCardState) state).getServiceAction());
        }
    }

    private final void setUpDetailsVerticalLayout() {
        VerticalAtomsLayout verticalAtomsLayout = this.binding.detailsVerticalLayout;
        verticalAtomsLayout.setAdapter(this.detailsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new AdditionalServiceCardDetailsItemDecoration(context));
    }

    private final void showContent(AdditionalServiceCardVO.State.AdditionalServiceCardState state) {
        showContent();
        AdditionalServiceCardView skeleton = this.binding.skeleton;
        Intrinsics.checkNotNullExpressionValue(skeleton, "skeleton");
        ViewExtKt.gone(skeleton);
        EmptyStateView emptyState = this.binding.emptyState;
        Intrinsics.checkNotNullExpressionValue(emptyState, "emptyState");
        ViewExtKt.gone(emptyState);
        TextAtomView titleTextView = this.binding.titleTextView;
        Intrinsics.checkNotNullExpressionValue(titleTextView, "titleTextView");
        TextAtomHolderKt.bind$default(titleTextView, state.getTitle(), null, 2, null);
        TextAtomView subtitleTextView = this.binding.subtitleTextView;
        Intrinsics.checkNotNullExpressionValue(subtitleTextView, "subtitleTextView");
        TextAtomHolderKt.bindOrGone$default(subtitleTextView, state.getSubtitle(), null, 2, null);
        AppCompatImageView appCompatImageView = this.binding.imageView;
        appCompatImageView.setBackgroundColor(state.getBackgroundImageColor());
        ImageViewExtKt.load$default(appCompatImageView, state.getImageUrl(), null, null, null, null, false, null, 126, null);
        VerticalAtomsLayout detailsVerticalLayout = this.binding.detailsVerticalLayout;
        Intrinsics.checkNotNullExpressionValue(detailsVerticalLayout, "detailsVerticalLayout");
        detailsVerticalLayout.setVisibility(state.getAreDetailsVisible() ? 0 : 8);
        this.detailsAdapter.bind(getContext(), state.getDetails());
        AppCompatImageView appCompatImageView2 = this.binding.disclosureIcon;
        Intrinsics.f(appCompatImageView2);
        ImageViewExtKt.load$default(appCompatImageView2, state.getDisclosureIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(appCompatImageView2, state.getDisclosureIconTint());
        PriceView priceView = this.binding.priceView;
        Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
        PriceHolderKt.bind$default(priceView, state.getPrice(), null, 2, null);
        TextAtomView priceDescriptionTextView = this.binding.priceDescriptionTextView;
        Intrinsics.checkNotNullExpressionValue(priceDescriptionTextView, "priceDescriptionTextView");
        TextAtomHolderKt.bind$default(priceDescriptionTextView, state.getPriceDescription(), null, 2, null);
    }

    private final void showDefaultError() {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void showEmptyState(AdditionalServiceCardVO.State.EmptyState state) {
        EmptyStateView emptyState = this.binding.emptyState;
        Intrinsics.checkNotNullExpressionValue(emptyState, "emptyState");
        ViewExtKt.show(emptyState);
        hideContent();
        AdditionalServiceCardView skeleton = this.binding.skeleton;
        Intrinsics.checkNotNullExpressionValue(skeleton, "skeleton");
        ViewExtKt.gone(skeleton);
        EmptyStateLayout.DefaultImpls.bind$default(this.binding.emptyState, state.getEmptyState(), null, 2, null);
    }

    private final void showPlaceholder(AdditionalServiceCardVO.State.PlaceholderState state) {
        AdditionalServiceCardWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.fetchWidget(state.getAsyncData());
        }
        AdditionalServiceCardView skeleton = this.binding.skeleton;
        Intrinsics.checkNotNullExpressionValue(skeleton, "skeleton");
        ViewExtKt.show(skeleton);
        hideContent();
        EmptyStateView emptyState = this.binding.emptyState;
        Intrinsics.checkNotNullExpressionValue(emptyState, "emptyState");
        ViewExtKt.gone(emptyState);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AdditionalServiceCardVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        AdditionalServiceCardVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().update(new AdditionalServiceCardUpdate(boundData.getId(), fetchedModel.getFetchedState()));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Lm0.a.f17149a.e(throwable);
        showDefaultError();
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdditionalServiceCardWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalServiceCardVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AdditionalServiceCardVO.State state = item.getState();
        if (state instanceof AdditionalServiceCardVO.State.PlaceholderState) {
            showPlaceholder((AdditionalServiceCardVO.State.PlaceholderState) state);
        } else if (state instanceof AdditionalServiceCardVO.State.EmptyState) {
            showEmptyState((AdditionalServiceCardVO.State.EmptyState) state);
        } else {
            if (!(state instanceof AdditionalServiceCardVO.State.AdditionalServiceCardState)) {
                throw new o();
            }
            showContent((AdditionalServiceCardVO.State.AdditionalServiceCardState) state);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdditionalServiceCardVO item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> viewEvent;
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AdditionalServiceCardWidgetViewHolder) item, trackingData, viewedPond);
        if (!(item.getState() instanceof AdditionalServiceCardVO.State.AdditionalServiceCardState) || (viewEvent = ((AdditionalServiceCardVO.State.AdditionalServiceCardState) item.getState()).getViewEvent()) == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(viewEvent, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }

    private final void showContent() {
        Set<Integer> excludedViewIds = excludedViewIds();
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (!excludedViewIds.contains(Integer.valueOf(childAt.getId()))) {
                childAt.setVisibility(0);
            }
        }
    }
}

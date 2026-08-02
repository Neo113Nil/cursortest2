package ru.ozon.app.android.search.widgets.searchOnboarding.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;LWZ/l;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingVO;Ll20/d;)V", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;", "LWZ/l;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchOnboardingViewHolder extends k<SearchOnboardingVO> {

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SearchOnboardingView view;

    @NotNull
    private final SearchOnboardingViewModel viewModel;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SearchOnboardingVO boundData = SearchOnboardingViewHolder.this.getBoundData();
            if (boundData != null) {
                SearchOnboardingViewHolder searchOnboardingViewHolder = SearchOnboardingViewHolder.this;
                t crossTrackingInfo = boundData.getCrossTrackingInfo();
                if (crossTrackingInfo != null) {
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(searchOnboardingViewHolder.tokenizedAnalytics, crossTrackingInfo, null, 2, null);
                }
                searchOnboardingViewHolder.refs.getController().m(boundData.getId());
            }
            SearchOnboardingViewHolder.this.viewModel.closeOnboarding();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewHolder$2, reason: invalid class name */
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
            t trackingInfo;
            CommonControlSettings openControl;
            AtomActionDTO action;
            String link;
            SearchOnboardingVO boundData = SearchOnboardingViewHolder.this.getBoundData();
            if (boundData != null && (openControl = boundData.getOpenControl()) != null && (action = openControl.getAction()) != null && (link = action.getLink()) != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(SearchOnboardingViewHolder.this.refs.getNavigator(), link, null, 2, null);
            }
            SearchOnboardingVO boundData2 = SearchOnboardingViewHolder.this.getBoundData();
            if (boundData2 == null || (trackingInfo = boundData2.getTrackingInfo()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(SearchOnboardingViewHolder.this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchOnboardingViewHolder(@NotNull SearchOnboardingView view, @NotNull ComposerReferences refs, @NotNull SearchOnboardingViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.refs = refs;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        view.setListeners(new AnonymousClass1(), new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchOnboardingVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bindOrGone(item, !this.viewModel.wasShowOnboarding());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchOnboardingVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchOnboardingViewHolder) item, trackingData, viewedPond);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}

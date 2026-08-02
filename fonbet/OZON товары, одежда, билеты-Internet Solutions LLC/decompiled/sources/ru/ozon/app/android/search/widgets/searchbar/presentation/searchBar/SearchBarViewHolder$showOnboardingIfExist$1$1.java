package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewHolder$showOnboardingIfExist$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewHolder$showOnboardingIfExist$1$1(SearchBarViewHolder searchBarViewHolder) {
        super(0);
        this.this$0 = searchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SearchBarView searchBarView;
        SearchBarView searchBarView2;
        OnBoardingDelegate onBoardingDelegate;
        CommonOnboardingRepository commonOnboardingRepository;
        SearchBarViewHolder.Companion companion;
        SearchBarView searchBarView3;
        SearchBarViewHolder.Companion companion2;
        SearchBarViewHolder.Companion companion3;
        SearchBarView searchBarView4;
        SearchBarViewHolder.Companion companion4;
        SearchBarViewHolder.Companion companion5;
        searchBarView = this.this$0.searchBarView;
        Object parent = searchBarView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        int x11 = (int) view.getX();
        searchBarView2 = this.this$0.searchBarView;
        int translationX = x11 + ((int) searchBarView2.getTranslationX());
        onBoardingDelegate = this.this$0.onboardingDelegate;
        if (onBoardingDelegate != null) {
            SearchBarViewHolder searchBarViewHolder = this.this$0;
            companion = SearchBarViewHolder.Companion;
            Integer valueOf = Integer.valueOf(translationX - companion.getONBOARDING_ADDITIONAL_MARGIN());
            searchBarView3 = this.this$0.searchBarView;
            int top = searchBarView3.getTop();
            companion2 = SearchBarViewHolder.Companion;
            Integer valueOf2 = Integer.valueOf(top - companion2.getONBOARDING_ADDITIONAL_MARGIN());
            companion3 = SearchBarViewHolder.Companion;
            Integer valueOf3 = Integer.valueOf((-translationX) - companion3.getONBOARDING_ADDITIONAL_MARGIN());
            int height = this.this$0.itemView.getHeight();
            searchBarView4 = this.this$0.searchBarView;
            int bottom = height - searchBarView4.getBottom();
            companion4 = SearchBarViewHolder.Companion;
            Integer valueOf4 = Integer.valueOf(bottom - companion4.getONBOARDING_ADDITIONAL_MARGIN());
            companion5 = SearchBarViewHolder.Companion;
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate, searchBarViewHolder, new OnBoardingCutConfig(valueOf, valueOf2, valueOf3, valueOf4, null, null, Float.valueOf(companion5.getONBOARDING_CORNER_RADIUS()), false, 176, null), null, 4, null);
        }
        commonOnboardingRepository = this.this$0.onboardingRepository;
        commonOnboardingRepository.onStartShowOnboarding();
    }
}

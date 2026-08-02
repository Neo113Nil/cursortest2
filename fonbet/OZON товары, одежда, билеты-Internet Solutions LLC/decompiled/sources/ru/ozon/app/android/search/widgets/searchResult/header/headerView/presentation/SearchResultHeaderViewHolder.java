package ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation;

import AI.b;
import DG.a;
import W10.c;
import WZ.l;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityViewHolderDelegate;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetSearchResultHeaderBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001=B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010%\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J#\u0010,\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010+\u001a\u00060)j\u0002`*H\u0014¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b2\u0010\u0014J6\u00108\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u0001032\u0012\u00107\u001a\u000e\u0012\u0002\b\u000305j\u0006\u0012\u0002\b\u0003`6H\u0096\u0001¢\u0006\u0004\b8\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "Lru/ozon/app/android/search/databinding/WidgetSearchResultHeaderBinding;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityDelegate;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModel", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityViewHolderDelegate;", "favDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityViewHolderDelegate;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "setupAppsColors", "()V", "setupCategoryTitleWithLink", "setupCategoryTitleWithoutLink", "trackClickAnalytics", "Landroid/app/Activity;", "activity", "", "message", "share", "(Landroid/app/Activity;Ljava/lang/String;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "entity", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bindFavoriteEntityButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultHeaderViewHolder extends BindingViewHolder<SearchResultHeaderVO, WidgetSearchResultHeaderBinding> implements FavoriteEntityDelegate {
    private final /* synthetic */ FavoriteEntityViewHolderDelegate $$delegate_0;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final MinifyLinkViewModel minifyLinkViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetSearchResultHeaderBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetSearchResultHeaderBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetSearchResultHeaderBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetSearchResultHeaderBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetSearchResultHeaderBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderViewHolder$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultHeaderViewHolder(@NotNull View containerView, @NotNull MinifyLinkViewModel minifyLinkViewModel, @NotNull FavoriteEntityViewHolderDelegate favDelegate, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(minifyLinkViewModel, "minifyLinkViewModel");
        Intrinsics.checkNotNullParameter(favDelegate, "favDelegate");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.$$delegate_0 = favDelegate;
        this.minifyLinkViewModel = minifyLinkViewModel;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetSearchResultHeaderBinding binding = getBinding();
        binding.shareIv.setOnClickListener(new a(this, 2));
        binding.didYouMeanTv.setOnClickListener(new AI.a(this, 5));
        binding.categoryTitleTv.setOnClickListener(new b(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$5$lambda$0(SearchResultHeaderViewHolder searchResultHeaderViewHolder, View view) {
        String shareText;
        SearchResultHeaderVO searchResultHeaderVO;
        String shareLink;
        SearchResultHeaderVO searchResultHeaderVO2 = (SearchResultHeaderVO) searchResultHeaderViewHolder.getBoundData();
        if (searchResultHeaderVO2 == null || (shareText = searchResultHeaderVO2.getShareText()) == null || (searchResultHeaderVO = (SearchResultHeaderVO) searchResultHeaderViewHolder.getBoundData()) == null || (shareLink = searchResultHeaderVO.getShareLink()) == null) {
            return;
        }
        Context context = searchResultHeaderViewHolder.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        searchResultHeaderViewHolder.minifyLinkViewModel.onClickShare(shareLink, searchResultHeaderViewHolder.getTrackingData(), new SearchResultHeaderViewHolder$2$1$1(shareText, searchResultHeaderViewHolder, activity));
        searchResultHeaderViewHolder.trackClickAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$5$lambda$2(SearchResultHeaderViewHolder searchResultHeaderViewHolder, View view) {
        String searchOriginalDeepLink;
        SearchResultHeaderVO searchResultHeaderVO = (SearchResultHeaderVO) searchResultHeaderViewHolder.getBoundData();
        if (searchResultHeaderVO == null || (searchOriginalDeepLink = searchResultHeaderVO.getSearchOriginalDeepLink()) == null) {
            return;
        }
        searchResultHeaderViewHolder.trackClickAnalytics();
        ComposerNavigator.DefaultImpls.openDeeplink$default(searchResultHeaderViewHolder.composerReferences.getNavigator(), searchOriginalDeepLink, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$5$lambda$4(SearchResultHeaderViewHolder searchResultHeaderViewHolder, View view) {
        Uri categoryDeeplink;
        SearchResultHeaderVO searchResultHeaderVO = (SearchResultHeaderVO) searchResultHeaderViewHolder.getBoundData();
        if (searchResultHeaderVO == null || (categoryDeeplink = searchResultHeaderVO.getCategoryDeeplink()) == null) {
            return;
        }
        searchResultHeaderViewHolder.trackClickAnalytics();
        ComposerNavigator navigator = searchResultHeaderViewHolder.composerReferences.getNavigator();
        String uri = categoryDeeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
    }

    private final void setupAppsColors() {
        WidgetSearchResultHeaderBinding binding = getBinding();
        if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
            binding.getConstraintLayout().setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0));
            binding.titleTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textLightKey));
            binding.subtitleTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textSecondaryOnDark));
            binding.didYouMeanTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textActionOnDark));
            AppCompatImageView shareIv = binding.shareIv;
            Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
            ThemeExtKt.tint(shareIv, Integer.valueOf(ThemeExtKt.themeColor(getContext(), R$attr.graphicTertiaryOnDark)));
            return;
        }
        binding.getConstraintLayout().setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        binding.titleTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textPrimary));
        binding.subtitleTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textSecondary));
        binding.didYouMeanTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textAction));
        AppCompatImageView shareIv2 = binding.shareIv;
        Intrinsics.checkNotNullExpressionValue(shareIv2, "shareIv");
        ThemeExtKt.tint(shareIv2, Integer.valueOf(ThemeExtKt.themeColor(getContext(), R$attr.graphicTertiary)));
    }

    private final void setupCategoryTitleWithLink() {
        TextView textView = getBinding().categoryTitleTv;
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!appTokensProvider.isSelect(context)) {
            textView.setBackgroundResource(R$drawable.bg_white_ripple_blue);
            textView.setTextAppearance(R$style.TextStyle_Body_L_Blue);
        } else {
            textView.setBackground(null);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setTextAppearance(R$style.OzonTextAppearance_Body_500medium);
        }
    }

    private final void setupCategoryTitleWithoutLink() {
        TextView textView = getBinding().categoryTitleTv;
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTokensProvider.isSelect(context)) {
            textView.setBackground(null);
            textView.setTextAppearance(R$style.OzonTextAppearance_Body_500medium);
        } else {
            textView.setBackground(null);
            textView.setTextAppearance(R$style.TextStyle_Body_M_Gray60);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(Activity activity, String message) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(message);
        aVar.c(R$string.common_action_share);
        aVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackClickAnalytics() {
        WZ.t tokenizedEvent;
        SearchResultHeaderVO searchResultHeaderVO = (SearchResultHeaderVO) getBoundData();
        if (searchResultHeaderVO == null || (tokenizedEvent = searchResultHeaderVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void attachFavButtonView(@NotNull FavoriteButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.$$delegate_0.attachFavButtonView(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void bindFavoriteEntityButton(@NotNull FavoriteButtonView button, FavoriteEntity entity, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.$$delegate_0.bindFavoriteEntityButton(button, entity, holder);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void detachFavButtonView() {
        this.$$delegate_0.detachFavButtonView();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FavoriteButtonView entityFavoriteButton = getBinding().entityFavoriteButton;
        Intrinsics.checkNotNullExpressionValue(entityFavoriteButton, "entityFavoriteButton");
        attachFavButtonView(entityFavoriteButton);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        detachFavButtonView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSearchResultHeaderBinding binding = getBinding();
        setupAppsColors();
        if (item.getCategoryTitle() != null) {
            TextView textView = binding.categoryTitleTv;
            textView.setText(item.getCategoryTitle());
            if (item.getCategoryDeeplink() != null) {
                setupCategoryTitleWithLink();
            } else {
                setupCategoryTitleWithoutLink();
            }
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setTextColor(ThemeExtKt.themeColor(context, appTokensProvider.isSelect(context2) ? R$attr.textLightKey : R$attr.textAction));
            TextView categoryTitleTv = binding.categoryTitleTv;
            Intrinsics.checkNotNullExpressionValue(categoryTitleTv, "categoryTitleTv");
            ViewExtKt.show(categoryTitleTv);
        } else {
            TextView categoryTitleTv2 = binding.categoryTitleTv;
            Intrinsics.checkNotNullExpressionValue(categoryTitleTv2, "categoryTitleTv");
            ViewExtKt.gone(categoryTitleTv2);
            Unit unit = Unit.f71690a;
        }
        FavoriteButtonView entityFavoriteButton = binding.entityFavoriteButton;
        Intrinsics.checkNotNullExpressionValue(entityFavoriteButton, "entityFavoriteButton");
        bindFavoriteEntityButton(entityFavoriteButton, item.getFavoriteEntityButton(), this);
        binding.didYouMeanTv.setText(item.getSearchOriginalText());
        TextView didYouMeanTv = binding.didYouMeanTv;
        Intrinsics.checkNotNullExpressionValue(didYouMeanTv, "didYouMeanTv");
        ViewExtKt.showOrGone(didYouMeanTv, item.getSearchOriginalText() != null ? Boolean.valueOf(!h.K(r1)) : null);
        AppCompatImageView shareIv = binding.shareIv;
        Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
        ViewExtKt.showOrGone(shareIv, item.getShareText() != null ? Boolean.valueOf(!h.K(r1)) : null);
        binding.titleTv.setText(item.getHeader());
        TextView titleTv = binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, item.getHeader() != null ? Boolean.valueOf(!h.K(r1)) : null);
        binding.subtitleTv.setText(item.getTotalFound());
        TextView subtitleTv = binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        ViewExtKt.showOrGone(subtitleTv, item.getTotalFound() != null ? Boolean.valueOf(!h.K(r7)) : null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchResultHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchResultHeaderViewHolder) item, trackingData, viewedPond);
        WZ.t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

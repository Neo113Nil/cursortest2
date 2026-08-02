package ru.ozon.app.android.search.widgets.suggestion.presentation;

import Aw.ViewOnClickListenerC2448a;
import Cw.ViewOnClickListenerC2787a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.suggest.SuggestCacheGroup;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetSearchSuggestionBinding;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0016J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010/\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;", "Lru/ozon/app/android/search/databinding/WidgetSearchSuggestionBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;)V", "", "subtitle", "", "updateBottomConstraint", "(Ljava/lang/String;)V", "setSuggestIconHelperClickListener", "()V", "setSuggestItemClickListener", "item", "handleItemClick", "(Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;)V", "Landroid/widget/ImageView;", "imageUrl", "loadOnWhiteRounded", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "showRemoveImage", "showDisclosure", "", "padding", "updateImagePadding", "(I)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;Ll20/d;)V", "onViewInVisibleBounds", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "removeImagePadding", "I", "disclosureImagePadding", "darkIconCornersDp", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionViewAnalyticsDelegate;", "viewAnalyticsDelegate", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionViewAnalyticsDelegate;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionViewHolder extends BindingViewHolder<SuggestionVO, WidgetSearchSuggestionBinding> {
    private final int darkIconCornersDp;
    private final int disclosureImagePadding;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final ComposerReferences refs;
    private final int removeImagePadding;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final SuggestionViewAnalyticsDelegate viewAnalyticsDelegate;

    @NotNull
    private final ActiveSearchBarViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetSearchSuggestionBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetSearchSuggestionBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetSearchSuggestionBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetSearchSuggestionBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetSearchSuggestionBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull ActiveSearchBarViewModel viewModel) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.inhibitor = inhibitor;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.viewModel = viewModel;
        this.removeImagePadding = ResourceExtKt.toPx(getContext(), 10.0f);
        this.disclosureImagePadding = ResourceExtKt.toPx(getContext(), 8.0f);
        this.darkIconCornersDp = getContext().getResources().getDimensionPixelSize(R$dimen.design_default_radius);
        this.viewAnalyticsDelegate = new SuggestionViewAnalyticsDelegate(refs.getTokenizedAnalytics(), new SuggestionViewHolder$viewAnalyticsDelegate$1(this), new SuggestionViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(viewModel, null, 1, null)));
        setSuggestIconHelperClickListener();
        setSuggestItemClickListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleItemClick(SuggestionVO item) {
        HandlersInhibitor.run$default(this.inhibitor, 0L, new SuggestionViewHolder$handleItemClick$1(this, item), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadOnWhiteRounded(ImageView imageView, String str) {
        int i11 = 2;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            ImageViewExtKt.load$default(imageView, str, null, null, null, null, false, null, 126, null);
        } else {
            ImageViewExtKt.load$default(imageView, str, C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(this.darkIconCornersDp, null, i11, 0 == true ? 1 : 0)), null, null, null, false, null, 124, null);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
        }
    }

    private final void setSuggestIconHelperClickListener() {
        getBinding().imageIv.setOnClickListener(new ViewOnClickListenerC2448a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setSuggestIconHelperClickListener$lambda$11(SuggestionViewHolder suggestionViewHolder, View view) {
        SuggestionVO suggestionVO = (SuggestionVO) suggestionViewHolder.getBoundedData();
        if (suggestionVO != null) {
            String removeQueryActionName = suggestionVO.getRemoveQueryActionName();
            if (removeQueryActionName == null) {
                suggestionViewHolder.getBinding().getConstraintLayout().performClick();
                return;
            }
            t removeTokenizedEvent = suggestionVO.getRemoveTokenizedEvent();
            if (removeTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(suggestionViewHolder.refs.getTokenizedAnalytics(), removeTokenizedEvent, new SuggestionViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(suggestionViewHolder.viewModel, null, 1, null)));
            }
            suggestionViewHolder.viewModel.onRemoveHistory(suggestionVO.getTitle().toString(), removeQueryActionName);
        }
    }

    private final void setSuggestItemClickListener() {
        getBinding().getConstraintLayout().setOnClickListener(new ViewOnClickListenerC2787a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setSuggestItemClickListener$lambda$15(SuggestionViewHolder suggestionViewHolder, View view) {
        SuggestionVO suggestionVO = (SuggestionVO) suggestionViewHolder.getBoundedData();
        if (suggestionVO != null) {
            t tokenizedEvent = suggestionVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(suggestionViewHolder.refs.getTokenizedAnalytics(), tokenizedEvent, new SuggestionViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(suggestionViewHolder.viewModel, null, 1, null)));
            }
            t searchTokenizedEvent = suggestionVO.getSearchTokenizedEvent();
            if (searchTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(suggestionViewHolder.refs.getTokenizedAnalytics(), searchTokenizedEvent, new SuggestionViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(suggestionViewHolder.viewModel, null, 1, null)));
            }
            if (!suggestionVO.getShouldPrefetch()) {
                suggestionViewHolder.handleItemClick(suggestionVO);
                return;
            }
            suggestionViewHolder.searchUrlPrefetchService.navigateWhenRequestPrefetched(suggestionVO.getDeeplink(), suggestionViewHolder.refs.getContainer().g(), new SuggestionViewHolder$setSuggestItemClickListener$1$1$4(suggestionViewHolder, suggestionVO), new SuggestionViewHolder$setSuggestItemClickListener$1$1$3(suggestionViewHolder.refs.getController()));
        }
    }

    private final void showDisclosure() {
        updateImagePadding(this.disclosureImagePadding);
        getBinding().imageIv.setImageResource(R$drawable.ic_disclosure_gray);
    }

    private final void showRemoveImage() {
        updateImagePadding(this.removeImagePadding);
        getBinding().imageIv.setImageResource(ru.ozon.app.android.uikit.R$drawable.ic_close_gray);
    }

    private final void updateBottomConstraint(String subtitle) {
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.f(constraintLayout);
        d dVar = new d();
        dVar.p(constraintLayout);
        dVar.s(R$id.titleTv, 4, subtitle.length() > 0 ? R$id.subtitleTv : R$id.breadcrumbsTv, 3);
        dVar.f(constraintLayout);
    }

    private final void updateImagePadding(int padding) {
        ImageView imageIv = getBinding().imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ViewExtKt.updatePadding(imageIv, padding, padding, padding, padding);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.viewAnalyticsDelegate.popDelayedViewEvents();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SuggestionVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSearchSuggestionBinding binding = getBinding();
        if (item.getShouldPrefetch()) {
            SearchUrlPrefetchService.DefaultImpls.prefetch$default(this.searchUrlPrefetchService, item.getDeeplink(), SuggestCacheGroup.INSTANCE, false, 4, null);
        }
        binding.getConstraintLayout().setContentDescription(item.getTitle());
        TextView textView = binding.titleTv;
        if (Intrinsics.d(item.getTitle(), OzonSpannableStringKt.toOzonSpannableString("Новогодний подарок от Ozon"))) {
            textView.setTextAppearance(R$style.TextStyle_Body_L_Bold_Black);
        }
        textView.setText(item.getTitle());
        textView.setSelected(true);
        updateBottomConstraint(item.getSubtitle());
        TextView textView2 = binding.subtitleTv;
        textView2.setText(item.getSubtitle());
        ViewExtKt.showOrGone(textView2, Boolean.valueOf(!h.K(item.getSubtitle())));
        textView2.setSelected(true);
        TextView textView3 = binding.breadcrumbsTv;
        textView3.setText(item.getBreadcrumb());
        ViewExtKt.showOrGone(textView3, Boolean.valueOf(item.getBreadcrumb().length() > 0));
        textView3.setSelected(true);
        TextView textView4 = binding.priceTv;
        textView4.setText(item.getPriceText());
        ViewExtKt.showOrGone(textView4, Boolean.valueOf(item.getPriceText().length() > 0));
        textView4.setSelected(true);
        if (item.getImage().length() <= 0) {
            ImageView brandIv = binding.brandIv;
            Intrinsics.checkNotNullExpressionValue(brandIv, "brandIv");
            ViewExtKt.gone(brandIv);
            ImageView productIv = binding.productIv;
            Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
            ViewExtKt.gone(productIv);
        } else if (item.getPriceText().length() == 0) {
            ImageView productIv2 = binding.productIv;
            Intrinsics.checkNotNullExpressionValue(productIv2, "productIv");
            ViewExtKt.gone(productIv2);
            ImageView brandIv2 = binding.brandIv;
            Intrinsics.checkNotNullExpressionValue(brandIv2, "brandIv");
            ViewExtKt.show(brandIv2);
            ImageView brandIv3 = binding.brandIv;
            Intrinsics.checkNotNullExpressionValue(brandIv3, "brandIv");
            loadOnWhiteRounded(brandIv3, item.getImage());
        } else {
            ImageView brandIv4 = binding.brandIv;
            Intrinsics.checkNotNullExpressionValue(brandIv4, "brandIv");
            ViewExtKt.gone(brandIv4);
            ImageView productIv3 = binding.productIv;
            Intrinsics.checkNotNullExpressionValue(productIv3, "productIv");
            ViewExtKt.show(productIv3);
            ImageView productIv4 = binding.productIv;
            Intrinsics.checkNotNullExpressionValue(productIv4, "productIv");
            loadOnWhiteRounded(productIv4, item.getImage());
        }
        ImageView typeImageIv = binding.typeImageIv;
        Intrinsics.checkNotNullExpressionValue(typeImageIv, "typeImageIv");
        ViewExtKt.showOrGone(typeImageIv, Boolean.valueOf(item.getTypeImageResId() != null));
        Integer typeImageResId = item.getTypeImageResId();
        if (typeImageResId != null) {
            binding.typeImageIv.setImageResource(typeImageResId.intValue());
            if (item.getRemoveQueryActionName() != null) {
                showRemoveImage();
            } else {
                showDisclosure();
            }
        } else {
            showDisclosure();
        }
        View overlayView = binding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
        ViewExtKt.showOrGone(overlayView, Boolean.valueOf(item.getIsPromotedProduct()));
        ImageView rocketIv = binding.rocketIv;
        Intrinsics.checkNotNullExpressionValue(rocketIv, "rocketIv");
        ViewExtKt.showOrGone(rocketIv, Boolean.valueOf(item.getIsPromotedProduct()));
        this.viewAnalyticsDelegate.processViewEventOrDelay(item);
        AppCompatImageView divider = binding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(item.getShowDivider() ? 0 : 8);
    }
}

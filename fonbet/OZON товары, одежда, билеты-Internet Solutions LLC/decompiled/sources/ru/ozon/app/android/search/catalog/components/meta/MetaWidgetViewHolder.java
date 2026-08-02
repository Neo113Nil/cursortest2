package ru.ozon.app.android.search.catalog.components.meta;

import Dy.ViewOnClickListenerC2883a;
import IW.a;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.R$dimen;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetMetaLayoutBinding;
import ru.ozon.app.android.search.navigation.SearchRouter;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b!\u0010\u0015J6\u0010'\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010&\u001a\u000e\u0012\u0002\b\u00030$j\u0006\u0012\u0002\b\u0003`%H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "Lru/ozon/app/android/search/databinding/WidgetMetaLayoutBinding;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityDelegate;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/search/navigation/SearchRouter;", "router", "favoriteDelegateViewHolder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/search/navigation/SearchRouter;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityDelegate;)V", "Landroid/text/Spanned;", "description", "getShortDescription", "(Landroid/text/Spanned;)Landroid/text/Spanned;", "", "isLessThanLimit", "(Landroid/text/Spanned;)Z", "", "onAttach", "()V", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/meta/MetaVO;Ll20/d;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "entity", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bindFavoriteEntityButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/search/navigation/SearchRouter;", "", "minPortraitDimen", "I", "maxPortraitDimen", "minLandscapeDimen", "maxLandscapeDimen", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MetaWidgetViewHolder extends BindingViewHolder<MetaVO, WidgetMetaLayoutBinding> implements FavoriteEntityDelegate {
    private final /* synthetic */ FavoriteEntityDelegate $$delegate_0;
    private final int maxLandscapeDimen;
    private final int maxPortraitDimen;
    private final int minLandscapeDimen;
    private final int minPortraitDimen;

    @NotNull
    private final SearchRouter router;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetMetaLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetMetaLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetMetaLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetMetaLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetMetaLayoutBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaWidgetViewHolder(@NotNull View containerView, @NotNull SearchRouter router, @NotNull FavoriteEntityDelegate favoriteDelegateViewHolder) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(favoriteDelegateViewHolder, "favoriteDelegateViewHolder");
        this.$$delegate_0 = favoriteDelegateViewHolder;
        this.router = router;
        this.minPortraitDimen = this.itemView.getContext().getResources().getDimensionPixelSize(R$dimen.meta_portrait_min_dimension);
        this.maxPortraitDimen = this.itemView.getContext().getResources().getDimensionPixelSize(R$dimen.meta_portrait_max_dimension);
        this.minLandscapeDimen = this.itemView.getContext().getResources().getDimensionPixelSize(R$dimen.meta_landscape_min_dimension);
        this.maxLandscapeDimen = this.itemView.getContext().getResources().getDimensionPixelSize(R$dimen.meta_landscape_max_dimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$2(MetaVO metaVO, MetaWidgetViewHolder metaWidgetViewHolder, View view) {
        if (metaVO.getIsClickEnabled()) {
            SearchRouter searchRouter = metaWidgetViewHolder.router;
            Context context = metaWidgetViewHolder.getContext();
            Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            G supportFragmentManager = ((r) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            searchRouter.showMeta(supportFragmentManager, metaVO.getImage(), metaVO.getDescription(), metaVO.getDesignType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4(MetaWidgetViewHolder metaWidgetViewHolder, MetaVO metaVO, View view) {
        Context context = metaWidgetViewHolder.itemView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            metaWidgetViewHolder.router.share(activity, metaVO.getShareText());
        }
    }

    private final Spanned getShortDescription(Spanned description) {
        if (description == null) {
            return null;
        }
        if (isLessThanLimit(description)) {
            return description;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        spannableStringBuilder.append(h.p0(description, 140));
        spannableStringBuilder.append((CharSequence) StringProvider.getString(R$string.meta_read_android));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        UniColors uniColors = UniColors.TEXT_ACTION;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId())), spannableStringBuilder.length() - 7, spannableStringBuilder.length(), 33);
        return new SpannedString(spannableStringBuilder);
    }

    private final boolean isLessThanLimit(Spanned description) {
        return description.length() <= 140;
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
    public void bind(@NotNull MetaVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetMetaLayoutBinding binding = getBinding();
        if (item.getDesignType() == DesignType.PORTRAIT) {
            binding.metaIv.setMinimumHeight(this.minPortraitDimen);
            binding.metaIv.setMaxHeight(this.maxPortraitDimen);
            binding.metaIv.setMinimumWidth(this.minPortraitDimen);
            binding.metaIv.setMaxWidth(this.minPortraitDimen);
            ViewGroup.LayoutParams layoutParams = binding.metaIv.getLayoutParams();
            layoutParams.height = this.maxPortraitDimen;
            layoutParams.width = this.minPortraitDimen;
        } else {
            binding.metaIv.setMinimumHeight(this.minLandscapeDimen);
            binding.metaIv.setMaxHeight(this.minLandscapeDimen);
            binding.metaIv.setMinimumWidth(this.minLandscapeDimen);
            binding.metaIv.setMaxWidth(this.maxLandscapeDimen);
            ViewGroup.LayoutParams layoutParams2 = binding.metaIv.getLayoutParams();
            layoutParams2.height = this.minLandscapeDimen;
            layoutParams2.width = this.maxLandscapeDimen;
        }
        AppCompatImageView metaIv = binding.metaIv;
        Intrinsics.checkNotNullExpressionValue(metaIv, "metaIv");
        ImageViewExtKt.load$default(metaIv, item.getImage(), null, null, null, null, false, null, 126, null);
        AppCompatImageView metaIv2 = binding.metaIv;
        Intrinsics.checkNotNullExpressionValue(metaIv2, "metaIv");
        String image = item.getImage();
        ViewExtKt.showOrGone(metaIv2, Boolean.valueOf(!(image == null || image.length() == 0)));
        binding.metaTitleTv.setText(item.getTitle());
        TextView metaDescriptionTv = binding.metaDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(metaDescriptionTv, "metaDescriptionTv");
        TextViewExtKt.setTextOrGone(metaDescriptionTv, getShortDescription(item.getDescription()));
        binding.metaDescriptionTv.setOnClickListener(new a(4, item, this));
        FavoriteButtonView entityFavoriteButton = binding.entityFavoriteButton;
        Intrinsics.checkNotNullExpressionValue(entityFavoriteButton, "entityFavoriteButton");
        bindFavoriteEntityButton(entityFavoriteButton, item.getFavoriteEntityButton(), this);
        AppCompatImageView shareIv = binding.shareIv;
        Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
        ViewExtKt.showOrGone(shareIv, Boolean.valueOf(!h.K(item.getShareText())));
        binding.shareIv.setOnClickListener(new ViewOnClickListenerC2883a(7, this, item));
    }
}

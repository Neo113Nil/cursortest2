package ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel;

import DQ.b;
import Nk.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselItem;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R6\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001d0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter$ImageViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Landroidx/lifecycle/J;)V", "Landroid/content/Context;", "context", "Landroid/widget/FrameLayout;", "buildRootView", "(Landroid/content/Context;)Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "buildImageView", "(Landroid/content/Context;)Landroid/widget/ImageView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter$ImageViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter$ImageViewHolder;I)V", "getItemCount", "()I", "onViewRecycled", "(Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter$ImageViewHolder;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ImageViewHolder", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselAdapter extends LifecycleAdapter<ImageViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<BannerCarouselItem> items;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter$ImageViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "Landroid/widget/ImageView;", "imageView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;Landroid/widget/ImageView;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", "item", "bindAdvBadgeView", "(Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;)V", "onViewInVisibleBounds", "()V", "newItem", "bind", "clear", "Landroid/view/View;", "Landroid/widget/ImageView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "", "dp8", "I", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageViewHolder extends j {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;
        private BadgeView advBadgeView;

        @NotNull
        private final View containerView;
        private final int dp8;

        @NotNull
        private final ImageView imageView;
        private BannerCarouselItem item;

        @NotNull
        private final ComposerReferences references;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ImageViewHolder(@NotNull View containerView, @NotNull ImageView imageView, @NotNull ComposerReferences references, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(references, "references");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.containerView = containerView;
            this.imageView = imageView;
            this.references = references;
            this.actionHandler = actionHandler;
            this.dp8 = ResourceExtKt.toPx(8);
            containerView.setOnClickListener(new b(this, 12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(ImageViewHolder imageViewHolder, View view) {
            String deeplink;
            t tokenizedEvent;
            BannerCarouselItem bannerCarouselItem = imageViewHolder.item;
            if (bannerCarouselItem != null && (tokenizedEvent = bannerCarouselItem.getTokenizedEvent()) != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(imageViewHolder.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
            BannerCarouselItem bannerCarouselItem2 = imageViewHolder.item;
            if (bannerCarouselItem2 == null || (deeplink = bannerCarouselItem2.getDeeplink()) == null) {
                return;
            }
            ComposerNavigator.DefaultImpls.openDeeplink$default(imageViewHolder.references.getNavigator(), deeplink, null, 2, null);
        }

        private final void bindAdvBadgeView(BannerCarouselItem item) {
            if (item.getAdvBadge() == null && this.advBadgeView == null) {
                return;
            }
            if (this.advBadgeView == null) {
                BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), this.containerView.getContext());
                if (badgeView == null) {
                    Context context = this.containerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    badgeView = new BadgeView(context, null, 0, 0, 14, null);
                }
                badgeView.setId(R$id.advBadgeV);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388661;
                int i11 = this.dp8;
                layoutParams.setMargins(i11, i11, i11, i11);
                badgeView.setLayoutParams(layoutParams);
                View view = this.containerView;
                FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
                if (frameLayout != null) {
                    frameLayout.addView(badgeView);
                }
                this.advBadgeView = badgeView;
            }
            BadgeView badgeView2 = this.advBadgeView;
            if (badgeView2 != null) {
                BadgeHolderKt.bindOrGone(badgeView2, item.getAdvBadge(), this.actionHandler);
            }
        }

        public final void bind(@NotNull BannerCarouselItem newItem) {
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            this.item = newItem;
            ImageViewExtKt.load$default(this.imageView, newItem.getImage(), null, null, null, null, false, null, 126, null);
            bindAdvBadgeView(newItem);
        }

        public final void clear() {
            this.imageView.setImageDrawable(null);
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            BannerCarouselItem bannerCarouselItem = this.item;
            if (bannerCarouselItem == null || (tokenizedEvent = bannerCarouselItem.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselAdapter(@NotNull ComposerReferences references, @NotNull k<BannerCarouselVO> widgetViewHolder, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.references = references;
        this.items = K.f71697a;
        this.actionHandler = new ActionHandler.Builder(references, widgetViewHolder).buildHandler();
    }

    private final ImageView buildImageView(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.imageIv);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    private final FrameLayout buildRootView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.rootFl);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<BannerCarouselItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.items, value)) {
            return;
        }
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ImageViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        FrameLayout buildRootView = buildRootView(a.a(parent, "parent", "getContext(...)"));
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageView buildImageView = buildImageView(context);
        buildRootView.addView(buildImageView);
        return new ImageViewHolder(buildRootView, buildImageView, this.references, this.actionHandler);
    }

    @Override // jk0.d
    public void onViewRecycled(@NotNull ImageViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((CarouselAdapter) holder);
        holder.clear();
    }
}

package ru.ozon.app.android.storefront.widgets.videoTile.presentation;

import Ez.ViewOnClickListenerC2978b;
import Im.a;
import Sc.o;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.storefront.databinding.VideoTileV1Binding;
import ru.ozon.app.android.storefront.widgets.videoTile.data.DesignType;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindTitle", "(Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;)V", "bindAdvBadgeView", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "dp16", "I", "dp8", "dp4", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/storefront/databinding/VideoTileV1Binding;", "binding", "Lru/ozon/app/android/storefront/databinding/VideoTileV1Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileViewHolder extends k<VideoTileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private BadgeView advBadgeView;

    @NotNull
    private final VideoTileV1Binding binding;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DesignType.values().length];
            try {
                iArr[DesignType.GRID1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignType.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTileViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        this.dp16 = ResourceExtKt.toPx(16, getContext());
        this.dp8 = ResourceExtKt.toPx(8, getContext());
        this.dp4 = ResourceExtKt.toPx(4);
        VideoTileV1Binding bind = VideoTileV1Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        bind.ivImage.setClipToOutline(true);
        containerView.setOnClickListener(new ViewOnClickListenerC2978b(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(VideoTileViewHolder videoTileViewHolder, View view) {
        AtomAction action;
        VideoTileVO boundedData = videoTileViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        videoTileViewHolder.actionHandler.invoke(action);
    }

    private final void bindAdvBadgeView(VideoTileVO item) {
        if (item.getAdvBadge() == null && this.advBadgeView == null) {
            return;
        }
        if (this.advBadgeView == null) {
            BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), this.binding.getConstraintLayout().getContext());
            if (badgeView == null) {
                Context context = this.binding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                badgeView = new BadgeView(context, null, 0, 0, 14, null);
            }
            a.c(badgeView, R$id.advBadgeV, -2, -2);
            this.binding.videoTileCl.addView(badgeView);
            this.advBadgeView = badgeView;
            VideoTileV1Binding videoTileV1Binding = this.binding;
            ConstraintLayout constraintLayout = videoTileV1Binding.videoTileCl;
            d d11 = Tl.a.d(constraintLayout, "videoTileCl", constraintLayout);
            ConstraintSetExtKt.topToTop(d11, R$id.advBadgeV, videoTileV1Binding.ivImage.getId(), this.dp8);
            ConstraintSetExtKt.endToEnd(d11, R$id.advBadgeV, videoTileV1Binding.ivImage.getId(), this.dp8);
            ConstraintSetExtKt.startToStart(d11, R$id.advBadgeV, videoTileV1Binding.ivImage.getId(), this.dp4);
            d11.c0(1.0f, R$id.advBadgeV);
            d11.C(R$id.advBadgeV, true);
            d11.f(constraintLayout);
        }
        BadgeView badgeView2 = this.advBadgeView;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, item.getAdvBadge(), this.actionHandler);
        }
    }

    private final void bindTitle(VideoTileVO item) {
        int i11;
        TextAtomView textAtomView = this.binding.tvTitle;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, item.getTitle(), null, 2, null);
        ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i12 = WhenMappings.$EnumSwitchMapping$0[item.getDesignType().ordinal()];
        if (i12 == 1) {
            i11 = this.dp8;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = this.dp16;
        }
        marginLayoutParams.topMargin = i11;
        textAtomView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VideoTileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        VideoTileV1Binding videoTileV1Binding = this.binding;
        AspectRatioImageView ivImage = videoTileV1Binding.ivImage;
        Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
        ImageViewExtKt.load$default(ivImage, item.getImage(), null, null, null, null, false, null, 126, null);
        videoTileV1Binding.ivImage.setRatio(Float.valueOf(item.getImageHeightRatio()));
        AspectRatioImageView ivImage2 = videoTileV1Binding.ivImage;
        Intrinsics.checkNotNullExpressionValue(ivImage2, "ivImage");
        ThemeExtKt.setParandjaForDarkTheme(ivImage2);
        AspectRatioImageView ivImage3 = videoTileV1Binding.ivImage;
        Intrinsics.checkNotNullExpressionValue(ivImage3, "ivImage");
        ThemeExtKt.setBackgroundParanjaForDarkTheme(ivImage3);
        bindAdvBadgeView(item);
        BadgeView badge = videoTileV1Binding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bind$default(badge, item.getTimeBadge(), (Function1) null, 2, (Object) null);
        bindTitle(item);
        TextAtomView tvSubtitle = videoTileV1Binding.tvSubtitle;
        Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
        TextAtomHolderKt.bindOrGone$default(tvSubtitle, item.getSubtitle(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull VideoTileVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}

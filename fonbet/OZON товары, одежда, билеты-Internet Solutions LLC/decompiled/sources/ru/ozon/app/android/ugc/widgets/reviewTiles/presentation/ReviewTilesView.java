package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u001cR\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPreviewControl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "gradientToken", "", "bindGradient", "(Ljava/lang/String;)V", "showPreview", "()V", "hidePreview", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "content", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;)V", "Landroidx/media3/ui/PlayerView;", "playerView$delegate", "LSc/j;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "playerView", "Lru/ozon/uni/android/atom/icon/IconView;", "playIcon$delegate", "getPlayIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "playIcon", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable$delegate", "getGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Lru/ozon/uni/android/atom/image/Image;", "contentImage$delegate", "getContentImage", "()Lru/ozon/uni/android/atom/image/Image;", "contentImage", "avatarIcon$delegate", "getAvatarIcon", "avatarIcon", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Landroid/view/View;", "bottomShadow$delegate", "getBottomShadow", "()Landroid/view/View;", "bottomShadow", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView$delegate", "getTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesView extends ConstraintLayout implements VideoPreviewControl {

    /* renamed from: avatarIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j avatarIcon;

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeView;

    /* renamed from: bottomShadow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomShadow;

    /* renamed from: contentImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contentImage;

    /* renamed from: gradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientDrawable;

    /* renamed from: playIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playIcon;

    /* renamed from: playerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playerView;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float VIDEO_CORNER_RADIUS = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView$Companion;", "", "<init>", "()V", "VIDEO_CORNER_RADIUS", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewTilesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playerView = DelegatesKt.lazyUnsafe(new ReviewTilesView$playerView$2(context, this));
        this.playIcon = DelegatesKt.lazyUnsafe(new ReviewTilesView$playIcon$2(context, this));
        this.gradientDrawable = DelegatesKt.lazyUnsafe(ReviewTilesView$gradientDrawable$2.INSTANCE);
        this.contentImage = LazyUtilsKt.unsafeLazy(new ReviewTilesView$contentImage$2(context, this));
        this.avatarIcon = DelegatesKt.lazyUnsafe(new ReviewTilesView$avatarIcon$2(context, this));
        this.badgeView = DelegatesKt.lazyUnsafe(new ReviewTilesView$badgeView$2(context, this));
        this.bottomShadow = DelegatesKt.lazyUnsafe(new ReviewTilesView$bottomShadow$2(context, this));
        this.priceView = DelegatesKt.lazyUnsafe(new ReviewTilesView$priceView$2(context, this));
        this.textView = DelegatesKt.lazyUnsafe(new ReviewTilesView$textView$2(context, this));
        setLayoutParams(new ConstraintLayout.b(-2, -2));
    }

    private final void bindGradient(String gradientToken) {
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(gradientToken);
        if (gradientByToken != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken, context);
            if (gradient != null) {
                gradient.applyTo(getGradientDrawable());
                getBottomShadow().setBackground(getGradientDrawable());
                return;
            }
        }
        ViewExtKt.gone(getBottomShadow());
    }

    private final IconView getAvatarIcon() {
        return (IconView) this.avatarIcon.getValue();
    }

    private final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue();
    }

    private final View getBottomShadow() {
        return (View) this.bottomShadow.getValue();
    }

    private final Image getContentImage() {
        return (Image) this.contentImage.getValue();
    }

    private final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.gradientDrawable.getValue();
    }

    private final IconView getPlayIcon() {
        return (IconView) this.playIcon.getValue();
    }

    private final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTextView() {
        return (TextAtomV2View) this.textView.getValue();
    }

    public final void bind(@NotNull ReviewTilesVO.Content.Media content) {
        Intrinsics.checkNotNullParameter(content, "content");
        ImageHolderKt.bindOrGone$default(getContentImage(), content.getImage(), null, 2, null);
        IconHolderKt.bindOrGone$default(getPlayIcon(), content.getPlayIcon(), null, 2, null);
        ReviewTilesVO.ReviewDescription reviewDescription = content.getReviewDescription();
        String gradientColor = reviewDescription.getGradientColor();
        if (gradientColor != null) {
            bindGradient(gradientColor);
        }
        PriceAtomHolderKt.bindOrGone$default(getPriceView(), reviewDescription.getPrice(), null, 2, null);
        TextHolderKt.bindOrGone$default(getTextView(), reviewDescription.getText(), null, 2, null);
        ReviewTilesVO.AuthorAvatar authorAvatar = content.getAuthorAvatar();
        IconHolderKt.bindOrGone$default(getAvatarIcon(), authorAvatar.getIcon(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getBadgeView(), authorAvatar.getBadge(), (Function1) null, 2, (Object) null);
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return (PlayerView) this.playerView.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.VideoPreviewControl
    public void hidePreview() {
        ViewExtKt.gone(getContentImage());
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.VideoPreviewControl
    public void showPreview() {
        ViewExtKt.show(getContentImage());
    }
}

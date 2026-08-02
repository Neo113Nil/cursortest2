package ru.ozon.app.android.product.common.richheader.presentation;

import Ez.ViewOnClickListenerC2978b;
import Im.a;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.databinding.ItemProductRichHeaderBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "nullifier", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;)V", "item", "", "bindAdvBadgeView", "(Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;)V", "bindBackground", "", "bottomPadding", "bindAdditionalSpace", "(I)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "Lru/ozon/app/android/product/databinding/ItemProductRichHeaderBinding;", "binding", "Lru/ozon/app/android/product/databinding/ItemProductRichHeaderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "dp4", "I", "dp12", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichHeaderViewHolder extends k<RichHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private BadgeView advBadgeView;

    @NotNull
    private final ItemProductRichHeaderBinding binding;

    @NotNull
    private final View containerView;
    private final int dp12;
    private final int dp4;

    @NotNull
    private final RecycledViewPoolViewNullifier nullifier;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichHeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull RecycledViewPoolViewNullifier nullifier) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(nullifier, "nullifier");
        this.containerView = containerView;
        this.refs = refs;
        this.nullifier = nullifier;
        ItemProductRichHeaderBinding bind = ItemProductRichHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp12 = ResourceExtKt.toPx(12);
        bind.richHeaderContainer.setOnClickListener(new ViewOnClickListenerC2978b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(RichHeaderViewHolder richHeaderViewHolder, View view) {
        AtomActionDTO action;
        RichHeaderVO boundedData = richHeaderViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        Function1<AtomAction, Unit> function1 = richHeaderViewHolder.actionHandler;
        RichHeaderVO boundedData2 = richHeaderViewHolder.getBoundedData();
        function1.invoke(AtomActionMapperKt.toAtomAction(action, boundedData2 != null ? boundedData2.getTrackingInfo() : null));
    }

    private final void bindAdditionalSpace(int bottomPadding) {
        this.binding.getConstraintLayout().setPadding(0, 0, 0, bottomPadding);
    }

    private final void bindAdvBadgeView(RichHeaderVO item) {
        if (item.getAdvBadge() == null && this.advBadgeView == null) {
            return;
        }
        if (this.advBadgeView == null) {
            q qVar = q.f64554a;
            d b11 = N.b(BadgeView.class);
            Context context = this.containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView = (BadgeView) qVar.g(b11, context);
            a.c(badgeView, R$id.advBadgeV, -2, -2);
            this.binding.richHeaderContainer.addView(badgeView);
            this.advBadgeView = badgeView;
            ConstraintLayout constraintLayout = this.binding.richHeaderContainer;
            androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout, "richHeaderContainer", constraintLayout);
            ConstraintSetExtKt.topToTop(d11, R$id.advBadgeV, 0, this.dp4);
            ConstraintSetExtKt.endToEnd(d11, R$id.advBadgeV, 0, this.dp4);
            ConstraintSetExtKt.startToStart(d11, R$id.advBadgeV, 0, this.dp4);
            d11.c0(1.0f, R$id.advBadgeV);
            d11.C(R$id.advBadgeV, true);
            d11.f(constraintLayout);
        }
        BadgeView badgeView2 = this.advBadgeView;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, item.getAdvBadge(), this.actionHandler);
        }
    }

    private final void bindBackground(RichHeaderVO item) {
        ConstraintLayout constraintLayout = this.binding.richHeaderContainer;
        androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout, "richHeaderContainer", constraintLayout);
        d11.X(R$id.backgroundRichHeaderImage, "1:" + item.getHeightRatio());
        d11.f(constraintLayout);
        ImageView backgroundRichHeaderImage = this.binding.backgroundRichHeaderImage;
        Intrinsics.checkNotNullExpressionValue(backgroundRichHeaderImage, "backgroundRichHeaderImage");
        ImageViewExtKt.load$default(backgroundRichHeaderImage, item.getImage(), null, null, null, null, false, null, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RichHeaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        RecycledViewPoolViewNullifier recycledViewPoolViewNullifier = this.nullifier;
        View view = this.containerView;
        recycledViewPoolViewNullifier.switchMaxRecycledViewInPoolToZero(view instanceof RecyclerView ? (RecyclerView) view : null, getItemViewType());
        AvatarView richHeaderAvatar = this.binding.richHeaderAvatar;
        Intrinsics.checkNotNullExpressionValue(richHeaderAvatar, "richHeaderAvatar");
        AvatarHolderKt.bindOrGone(richHeaderAvatar, item.getAvatar(), this.actionHandler);
        TextAtomView richHeaderTitle = this.binding.richHeaderTitle;
        Intrinsics.checkNotNullExpressionValue(richHeaderTitle, "richHeaderTitle");
        TextAtomHolderKt.bindOrGone(richHeaderTitle, item.getTitle(), this.actionHandler);
        TextAtomView richHeaderSubTitle = this.binding.richHeaderSubTitle;
        Intrinsics.checkNotNullExpressionValue(richHeaderSubTitle, "richHeaderSubTitle");
        TextAtomHolderKt.bindOrGone(richHeaderSubTitle, item.getSubtitle(), this.actionHandler);
        bindAdvBadgeView(item);
        bindBackground(item);
        bindAdditionalSpace(item.getAdditionalBottomPadding());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RichHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (viewedPond == null) {
            return;
        }
        String c11 = trackingData.c();
        if (c11 == null) {
            c11 = "";
        }
        if (viewedPond.b(item.getId(), c11) || (trackingInfo = item.getTrackingInfo()) == null || (tokenizedEvent = TrackingInfoMapperKt.toTokenizedEvent(trackingInfo, Long.valueOf(item.getId()), ActionType.VIEW.INSTANCE.getType())) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        viewedPond.d(Long.valueOf(item.getId()), c11);
    }
}

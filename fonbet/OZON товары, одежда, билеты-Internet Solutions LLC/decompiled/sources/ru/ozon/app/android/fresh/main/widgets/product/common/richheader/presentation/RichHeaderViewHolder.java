package ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation;

import AI.a;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.databinding.ItemProductRichHeaderExpressBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindBackground", "(Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/databinding/ItemProductRichHeaderExpressBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/ItemProductRichHeaderExpressBinding;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RichHeaderViewHolder extends k<RichHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemProductRichHeaderExpressBinding binding;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichHeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        ItemProductRichHeaderExpressBinding bind = ItemProductRichHeaderExpressBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.richHeaderContainer.setOnClickListener(new a(this, 18));
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

    private final void bindBackground(RichHeaderVO item) {
        ImageView backgroundRichHeaderImage = this.binding.backgroundRichHeaderImage;
        Intrinsics.checkNotNullExpressionValue(backgroundRichHeaderImage, "backgroundRichHeaderImage");
        ImageViewExtKt.load$default(backgroundRichHeaderImage, item.getImage(), null, null, null, null, false, null, 126, null);
        ConstraintLayout constraintLayout = this.binding.richHeaderContainer;
        d d11 = Tl.a.d(constraintLayout, "richHeaderContainer", constraintLayout);
        d11.X(R$id.backgroundRichHeaderImage, "1:" + item.getHeightRatio());
        d11.f(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RichHeaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AvatarView richHeaderAvatar = this.binding.richHeaderAvatar;
        Intrinsics.checkNotNullExpressionValue(richHeaderAvatar, "richHeaderAvatar");
        AvatarHolderKt.bindOrGone(richHeaderAvatar, item.getAvatar(), this.actionHandler);
        TextAtomView richHeaderTitle = this.binding.richHeaderTitle;
        Intrinsics.checkNotNullExpressionValue(richHeaderTitle, "richHeaderTitle");
        TextAtomHolderKt.bindOrGone(richHeaderTitle, item.getTitle(), this.actionHandler);
        TextAtomView richHeaderSubTitle = this.binding.richHeaderSubTitle;
        Intrinsics.checkNotNullExpressionValue(richHeaderSubTitle, "richHeaderSubTitle");
        TextAtomHolderKt.bindOrGone(richHeaderSubTitle, item.getSubtitle(), this.actionHandler);
        bindBackground(item);
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

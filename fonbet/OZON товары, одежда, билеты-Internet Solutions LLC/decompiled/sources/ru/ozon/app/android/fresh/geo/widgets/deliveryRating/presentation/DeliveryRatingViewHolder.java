package ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation;

import U7.d;
import Ve.C4598rp;
import W10.c;
import WZ.l;
import WZ.t;
import X4.a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.geo.databinding.WidgetDeliveryRatingBinding;
import ru.ozon.app.android.fresh.geo.databinding.WidgetDeliveryRatingNewDesignBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001.\b\u0000\u0018\u0000 12\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00011B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LX4/a;", "binding", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LX4/a;)V", "", "initLifecycleObserver", "()V", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "dto", "", "rating", "Lru/ozon/uni/atoms/af/AtomAction;", "prepareActionWithParams", "(Lru/ozon/uni/atoms/data/rating/RatingDTO;I)Lru/ozon/uni/atoms/af/AtomAction;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "LX4/a;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingViewHolder$ratingCallback$1", "ratingCallback", "Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingViewHolder$ratingCallback$1;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryRatingViewHolder extends k<DeliveryRatingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final a binding;

    @NotNull
    private final Handler handler;

    @NotNull
    private final DeliveryRatingViewHolder$ratingCallback$1 ratingCallback;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryRatingViewHolder(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull a binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(binding, "binding");
        View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.handler = new Handler(Looper.getMainLooper());
        this.ratingCallback = new DeliveryRatingViewHolder$ratingCallback$1(this);
        initLifecycleObserver();
    }

    private final void initLifecycleObserver() {
        d.c(this.refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingViewHolder$initLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Handler handler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                handler = DeliveryRatingViewHolder.this.handler;
                handler.removeCallbacksAndMessages(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction prepareActionWithParams(RatingDTO dto, int rating) {
        CommonControlSettings common;
        AtomActionDTO action;
        if (dto == null || (common = dto.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, C4598rp.c(rating, action.getLink(), "&selectedRating="), null, null, null, 29, null), common.getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryRatingVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        a aVar = this.binding;
        if (aVar instanceof WidgetDeliveryRatingBinding) {
            WidgetDeliveryRatingBinding widgetDeliveryRatingBinding = (WidgetDeliveryRatingBinding) aVar;
            TextAtomV2View title = widgetDeliveryRatingBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
            TextAtomV2View subtitle = widgetDeliveryRatingBinding.subtitle;
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            TextHolderKt.bind$default(subtitle, item.getSubtitle(), null, 2, null);
            ImageView image = widgetDeliveryRatingBinding.image;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            ImageViewExtKt.load$default(image, item.getImage(), null, null, null, null, false, null, 126, null);
            RatingView rating = widgetDeliveryRatingBinding.rating;
            Intrinsics.checkNotNullExpressionValue(rating, "rating");
            DsRatingHolderKt.bind$default(rating, item.getRating(), null, 2, null);
            widgetDeliveryRatingBinding.rating.setRatingClickCallback(this.ratingCallback);
            return;
        }
        if (aVar instanceof WidgetDeliveryRatingNewDesignBinding) {
            WidgetDeliveryRatingNewDesignBinding widgetDeliveryRatingNewDesignBinding = (WidgetDeliveryRatingNewDesignBinding) aVar;
            widgetDeliveryRatingNewDesignBinding.container.setClipToOutline(true);
            TextAtomV2View title2 = widgetDeliveryRatingNewDesignBinding.title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextHolderKt.bind$default(title2, item.getTitle(), null, 2, null);
            TextAtomV2View subtitle2 = widgetDeliveryRatingNewDesignBinding.subtitle;
            Intrinsics.checkNotNullExpressionValue(subtitle2, "subtitle");
            TextHolderKt.bind$default(subtitle2, item.getSubtitle(), null, 2, null);
            widgetDeliveryRatingNewDesignBinding.title.setTextIsSelectable(false);
            widgetDeliveryRatingNewDesignBinding.subtitle.setTextIsSelectable(false);
            ImageView image2 = widgetDeliveryRatingNewDesignBinding.image;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            ImageViewExtKt.load$default(image2, item.getImage(), null, null, null, null, false, null, 126, null);
            RatingView rating2 = widgetDeliveryRatingNewDesignBinding.rating;
            Intrinsics.checkNotNullExpressionValue(rating2, "rating");
            DsRatingHolderKt.bind$default(rating2, item.getRating(), null, 2, null);
            widgetDeliveryRatingNewDesignBinding.rating.setRatingClickCallback(this.ratingCallback);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryRatingVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

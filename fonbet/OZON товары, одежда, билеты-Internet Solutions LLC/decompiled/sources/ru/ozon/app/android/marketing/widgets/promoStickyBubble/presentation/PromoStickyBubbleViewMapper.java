package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import A00.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.events.AnchorVisibleEvent;
import ru.ozon.app.android.common.events.RateItemsVisibleEvent;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.data.PromoStickyBubbleDTO;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.di.PromoStickyBubbleComponent;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070%0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/di/PromoStickyBubbleComponent;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/data/PromoStickyBubbleDTO;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;)Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/marketing/widgets/promoStickyBubble/data/PromoStickyBubbleDTO;Ll20/d;)Ljava/util/List;", "", "parentWidth", "I", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoStickyBubbleViewMapper extends OverlayWidgetScreenViewItemMapper2<PromoStickyBubbleComponent, PromoStickyBubbleDTO, PromoStickyBubbleV0> {
    private int parentWidth;

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AnchorVisibleEvent.class, RateItemsVisibleEvent.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(PromoStickyBubbleViewMapper promoStickyBubbleViewMapper, LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getMeasuredWidth() != 0) {
            promoStickyBubbleViewMapper.parentWidth = parent.getMeasuredWidth();
        }
        PromoStickyBubbleView.Companion companion = PromoStickyBubbleView.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.create(context, promoStickyBubbleViewMapper.parentWidth);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PromoStickyBubbleV0> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new PromoStickyBubbleViewHolder(container, new Kn.a(this, 1), component().getCustomActionHandlersProvider());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PromoStickyBubbleComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PromoStickyBubbleComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public PromoStickyBubbleV0 handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PromoStickyBubbleV0 oldItem) {
        PromoStickyBubbleV0 copy;
        PromoStickyBubbleV0 copy2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AnchorVisibleEvent) {
            if (oldItem.getAnchorKey() != null) {
                copy2 = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.imageUrl : null, (r35 & 4) != 0 ? oldItem.productImage : null, (r35 & 8) != 0 ? oldItem.logoImageUrl : null, (r35 & 16) != 0 ? oldItem.closeButton : null, (r35 & 32) != 0 ? oldItem.badge : null, (r35 & 64) != 0 ? oldItem.action : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.anchorKey : null, (r35 & 256) != 0 ? oldItem.autoHideTimer : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.tokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.viewAction : null, (r35 & 2048) != 0 ? oldItem.isVisible : Intrinsics.d(((AnchorVisibleEvent) update).getAnchorKey(), oldItem.getAnchorKey()), (r35 & 4096) != 0 ? oldItem.remainingTimerSeconds : null, (r35 & 8192) != 0 ? oldItem.wasShown : false, (r35 & 16384) != 0 ? oldItem.rateItemsIsVisible : null);
                return copy2;
            }
        } else if (update instanceof RateItemsVisibleEvent) {
            copy = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.imageUrl : null, (r35 & 4) != 0 ? oldItem.productImage : null, (r35 & 8) != 0 ? oldItem.logoImageUrl : null, (r35 & 16) != 0 ? oldItem.closeButton : null, (r35 & 32) != 0 ? oldItem.badge : null, (r35 & 64) != 0 ? oldItem.action : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.anchorKey : null, (r35 & 256) != 0 ? oldItem.autoHideTimer : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.tokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.viewAction : null, (r35 & 2048) != 0 ? oldItem.isVisible : false, (r35 & 4096) != 0 ? oldItem.remainingTimerSeconds : null, (r35 & 8192) != 0 ? oldItem.wasShown : false, (r35 & 16384) != 0 ? oldItem.rateItemsIsVisible : Boolean.valueOf(((RateItemsVisibleEvent) update).getIsVisible()));
            return copy;
        }
        return oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PromoStickyBubbleV0> map(@NotNull PromoStickyBubbleDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String imageUrl = state.getImageUrl();
        ImageDTO productImage = state.getProductImage();
        String logoImageUrl = state.getLogoImageUrl();
        IconButtonV3DTO closeButton = state.getCloseButton();
        BadgeDTO badge = state.getBadge();
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        String anchorKey = state.getAnchorKey();
        Integer autoHideTimer = state.getAutoHideTimer();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        AtomActionDTO viewAction = state.getViewAction();
        return C7714v.a0(new PromoStickyBubbleV0(hashCode, imageUrl, productImage, logoImageUrl, closeButton, badge, atomAction, anchorKey, autoHideTimer, mapToTokenizedEvent$default, viewAction != null ? AtomActionMapperKt.toAtomAction(viewAction, null) : null, state.getAnchorKey() == null, null, false, null, 28672, null));
    }
}

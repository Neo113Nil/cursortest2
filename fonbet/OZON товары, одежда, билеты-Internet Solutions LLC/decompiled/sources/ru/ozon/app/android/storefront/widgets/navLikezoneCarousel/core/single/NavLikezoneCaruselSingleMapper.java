package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.single;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselSubWidget;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.NavLikezoneCaruselVI;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/single/NavLikezoneCaruselSingleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Single;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Single;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Single;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselSingleMapper implements Function2<NavLikezoneCaruselSubWidget.Single, d, List<? extends NavLikezoneCaruselVI.Single>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavLikezoneCaruselVI.Single> invoke(@NotNull NavLikezoneCaruselSubWidget.Single state, @NotNull d widgetInfo) {
        BannerItem leftAlign;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BadgeDTO topBadge = state.getTopBadge();
        if (Intrinsics.d(state.getItem().isCenterAlignment(), Boolean.TRUE)) {
            TextDTO title = state.getItem().getTitle();
            TextDTO subtitle = state.getItem().getSubtitle();
            String accentImage = state.getItem().getAccentImage();
            String backgroundColor = state.getItem().getBackgroundColor();
            String backgroundImage = state.getItem().getBackgroundImage();
            BadgeDTO actionBadge = state.getItem().getActionBadge();
            AtomActionDTO action = state.getItem().getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getItem().getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getItem().getTrackingInfo();
            leftAlign = new BannerItem.CenterAlign(title, subtitle, accentImage, backgroundColor, backgroundImage, actionBadge, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTopBadge() != null);
        } else {
            TextDTO title2 = state.getItem().getTitle();
            TextDTO subtitle2 = state.getItem().getSubtitle();
            String accentImage2 = state.getItem().getAccentImage();
            String backgroundColor2 = state.getItem().getBackgroundColor();
            String backgroundImage2 = state.getItem().getBackgroundImage();
            BadgeDTO actionBadge2 = state.getItem().getActionBadge();
            AtomActionDTO action2 = state.getItem().getAction();
            AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, state.getItem().getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getItem().getTrackingInfo();
            leftAlign = new BannerItem.LeftAlign(title2, subtitle2, accentImage2, backgroundColor2, backgroundImage2, actionBadge2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null, state.getTopBadge() != null);
        }
        return C7714v.a0(new NavLikezoneCaruselVI.Single(hashCode, topBadge, leftAlign));
    }
}

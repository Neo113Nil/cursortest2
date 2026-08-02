package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselDTO;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselSubWidget;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.NavLikezoneCaruselVI;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/multi/NavLikezoneCaruselMultiMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Multi;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Multi;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Multi;Ll20/d;)Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselMultiMapper implements Function2<NavLikezoneCaruselSubWidget.Multi, d, List<? extends NavLikezoneCaruselVI.Multi>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavLikezoneCaruselVI.Multi> invoke(@NotNull NavLikezoneCaruselSubWidget.Multi state, @NotNull d widgetInfo) {
        Object leftAlign;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BadgeDTO topBadge = state.getTopBadge();
        List<NavLikezoneCaruselDTO.Item> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            NavLikezoneCaruselDTO.Item item = (NavLikezoneCaruselDTO.Item) obj;
            if (Intrinsics.d(item.isCenterAlignment(), Boolean.TRUE)) {
                TextDTO title = item.getTitle();
                TextDTO subtitle = item.getSubtitle();
                String accentImage = item.getAccentImage();
                String backgroundColor = item.getBackgroundColor();
                String backgroundImage = item.getBackgroundImage();
                BadgeDTO actionBadge = item.getActionBadge();
                AtomActionDTO action = item.getAction();
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, item.getTrackingInfo()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
                leftAlign = new BannerItem.CenterAlign(title, subtitle, accentImage, backgroundColor, backgroundImage, actionBadge, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTopBadge() != null);
            } else {
                TextDTO title2 = item.getTitle();
                TextDTO subtitle2 = item.getSubtitle();
                String accentImage2 = item.getAccentImage();
                String backgroundColor2 = item.getBackgroundColor();
                String backgroundImage2 = item.getBackgroundImage();
                BadgeDTO actionBadge2 = item.getActionBadge();
                AtomActionDTO action2 = item.getAction();
                AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, item.getTrackingInfo()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
                leftAlign = new BannerItem.LeftAlign(title2, subtitle2, accentImage2, backgroundColor2, backgroundImage2, actionBadge2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null, state.getTopBadge() != null);
            }
            arrayList.add(leftAlign);
            i11 = i12;
        }
        NavLikezoneCaruselDTO.PageControls pageControls = state.getPageControls();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long scrollTime = state.getScrollTime();
        return C7714v.a0(new NavLikezoneCaruselVI.Multi(hashCode, topBadge, arrayList, pageControls, Long.valueOf(timeUnit.toMillis(scrollTime != null ? scrollTime.longValue() : 7L)), 0, 32, null));
    }
}

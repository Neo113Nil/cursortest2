package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.multi;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerSubWidget;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/multi/EntryBannerWidgetMultiMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Multi;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Multi;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetMultiMapper implements Function2<EntryBannerSubWidget.Multi, d, List<? extends EntryBannerWidgetVO.Multi>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EntryBannerWidgetVO.Multi> invoke(@NotNull EntryBannerSubWidget.Multi state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String backgroundColor = state.getBackgroundColor();
        List<EntryBannerWidgetDTO.Banner> banners = state.getBanners();
        ArrayList arrayList = new ArrayList(C7714v.z(banners, 10));
        Iterator it = banners.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            EntryBannerWidgetDTO.Banner banner = (EntryBannerWidgetDTO.Banner) next;
            long j11 = i11 + hashCode;
            TextDTO title = banner.getTitle();
            Banner.Badge badge = new Banner.Badge(banner.getTitleBadge().getText(), banner.getTitleBadge().getIcon(), banner.getTitleBadge().getBackgroundColor());
            TextDTO subtitle = banner.getSubtitle();
            BadgeDTO badge2 = banner.getBadge();
            Iterator it2 = it;
            long j12 = hashCode;
            Banner.Images images = new Banner.Images(banner.getUnderImage(), banner.getAnimationName(), banner.getOverImage());
            String backgroundColor2 = banner.getBackgroundColor();
            AtomActionDTO action = banner.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, banner.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = banner.getTrackingInfo();
            arrayList.add(new Banner(j11, title, badge, subtitle, badge2, images, backgroundColor2, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j12), null, 2, null) : null));
            it = it2;
            i11 = i12;
            hashCode = j12;
        }
        return C7714v.a0(new EntryBannerWidgetVO.Multi(hashCode, arrayList, backgroundColor, null, 8, null));
    }
}

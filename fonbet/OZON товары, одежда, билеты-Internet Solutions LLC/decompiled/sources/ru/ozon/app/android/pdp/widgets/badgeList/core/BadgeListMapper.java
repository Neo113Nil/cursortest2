package ru.ozon.app.android.pdp.widgets.badgeList.core;

import WZ.t;
import java.util.ArrayList;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BadgeListDTO;
import ru.ozon.app.android.pdp.widgets.badgeList.presentation.BadgeListVO;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeList/core/BadgeListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/badgeList/presentation/BadgeListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "", "isSelect", "<init>", "(Z)V", "Lru/ozon/uni/atoms/data/badge/Badge;", "toVo", "(Ljava/util/List;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListDTO;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListMapper implements Function2<BadgeListDTO, d, List<? extends BadgeListVO>> {
    private final boolean isSelect;

    public BadgeListMapper(boolean z11) {
        this.isSelect = z11;
    }

    private final List<Badge> toVo(List<Badge> list) {
        String link;
        List<Badge> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Badge badge : list2) {
            if (this.isSelect) {
                AtomActionDTO action = badge.getAction();
                AtomActionDTO atomActionDTO = null;
                r4 = null;
                String str = null;
                if (action != null) {
                    AtomActionDTO action2 = badge.getAction();
                    if (action2 != null && (link = action2.getLink()) != null) {
                        str = UriExtKt.replaceUriForSelect(link);
                    }
                    atomActionDTO = AtomActionDTO.copy$default(action, null, str, null, null, null, 29, null);
                }
                badge = Badge.copy$default(badge, null, null, null, null, null, atomActionDTO, null, null, null, null, null, null, null, 8159, null);
            }
            arrayList.add(badge);
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BadgeListVO> invoke(@NotNull BadgeListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<Badge> vo = toVo(state.getBadges());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        String json = state.getJson();
        if (json == null) {
            json = "";
        }
        return C7714v.a0(new BadgeListVO(hashCode, vo, tokenizedEvent$default, json));
    }
}

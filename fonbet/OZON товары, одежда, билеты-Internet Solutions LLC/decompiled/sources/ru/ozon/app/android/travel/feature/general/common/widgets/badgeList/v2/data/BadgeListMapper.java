package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data.BadgeListDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "<init>", "()V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeListMapper implements Function2<BadgeListDTO, d, List<? extends BadgeListVO>>, AsyncWidgetStateMapper<BadgeListDTO, BadgeListVO.State> {
    private final BadgeListVO.State extractState(BadgeListDTO state) {
        List<Object> items = state.getItems();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            BadgeListVO.Item item = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof BadgeListDTO.Skeleton) {
                BadgeListDTO.Skeleton skeleton = (BadgeListDTO.Skeleton) obj;
                item = new BadgeListVO.Skeleton(i11, skeleton.getWidth(), skeleton.getHeight());
            } else if (obj instanceof BadgeDTO) {
                BadgeDTO badgeDTO = (BadgeDTO) obj;
                item = new BadgeListVO.BadgeWrapper(badgeDTO.getText() != null ? r3.hashCode() : 0, badgeDTO);
            }
            if (item != null) {
                arrayList.add(item);
            }
            i11 = i12;
        }
        if (state.getRequiredLastBadge() != null) {
            arrayList = C7714v.W0(arrayList);
            arrayList.add(new BadgeListVO.BadgeWrapper(state.getRequiredLastBadge().getText() != null ? r3.hashCode() : 0, state.getRequiredLastBadge()));
        }
        return new BadgeListVO.State(arrayList, state.getRequiredLastBadge() != null, Intrinsics.d(state.getHorizontalScrollEnabled(), Boolean.TRUE) || state.getMaxLines() == 0, state.getMaxLines(), state.isUpdateRequired(), state.getAsyncParameters());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BadgeListVO> invoke(@NotNull BadgeListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        BadgeListVO.State extractState = extractState(state);
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new BadgeListVO(hashCode, extractState, a11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public BadgeListVO.State mapAsyncState(@NotNull BadgeListDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}

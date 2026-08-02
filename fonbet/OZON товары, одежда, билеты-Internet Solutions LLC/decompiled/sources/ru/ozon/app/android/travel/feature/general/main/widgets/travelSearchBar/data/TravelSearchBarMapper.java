package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.data;

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
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/data/TravelSearchBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/data/TravelSearchBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/data/TravelSearchBarDTO;Ll20/d;)Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelSearchBarMapper implements Function2<TravelSearchBarDTO, d, List<? extends TravelSearchBarVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelSearchBarVO> invoke(@NotNull TravelSearchBarDTO state, @NotNull d widgetInfo) {
        String query;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        boolean z11 = state.getAction() != null && state.getTapAction() == null;
        long hashCode = widgetInfo.d().hashCode();
        String placeholder = state.getPlaceholder();
        String str = placeholder == null ? "" : placeholder;
        String query2 = state.getQuery();
        String str2 = query2 == null ? "" : query2;
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        boolean z12 = (!z11 || (query = state.getQuery()) == null || query.length() == 0) ? false : true;
        AtomActionDTO tapAction = state.getTapAction();
        AtomAction atomAction2 = tapAction != null ? AtomActionMapperKt.toAtomAction(tapAction, null) : null;
        Map<String, TokenizedTrackingInfo> searchTracking = state.getSearchTracking();
        return C7714v.a0(new TravelSearchBarVO(hashCode, str, str2, atomAction, z12, z11, atomAction2, searchTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(searchTracking, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

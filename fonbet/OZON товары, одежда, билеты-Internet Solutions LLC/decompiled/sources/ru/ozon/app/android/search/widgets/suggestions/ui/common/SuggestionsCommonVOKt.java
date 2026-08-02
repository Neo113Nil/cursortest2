package ru.ozon.app.android.search.widgets.suggestions.ui.common;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsCommonModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsCommonVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCommonModel;", "id", "", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsCommonVOKt {
    @NotNull
    public static final SuggestionsCommonVO toVO(@NotNull SuggestionsCommonModel suggestionsCommonModel, long j11) {
        Intrinsics.checkNotNullParameter(suggestionsCommonModel, "<this>");
        AtomActionDTO action = suggestionsCommonModel.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, suggestionsCommonModel.getTrackingInfo()) : null;
        TestInfo testInfo = suggestionsCommonModel.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = suggestionsCommonModel.getTrackingInfo();
        return new SuggestionsCommonVO(atomAction, testInfo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}

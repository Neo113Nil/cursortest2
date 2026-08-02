package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"updateUiState", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "update", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/compose/ParcelTimelineUpdateEvent;", "orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParcelTimelineUpdateEventKt {
    @NotNull
    public static final ParcelTimelineVO updateUiState(@NotNull ParcelTimelineVO parcelTimelineVO, @NotNull ParcelTimelineUpdateEvent update) {
        Intrinsics.checkNotNullParameter(parcelTimelineVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        List<ParcelTimelineVO.SectionVO> sections = parcelTimelineVO.getSections();
        ArrayList arrayList = new ArrayList(C7714v.z(sections, 10));
        for (ParcelTimelineVO.SectionVO sectionVO : sections) {
            if (Intrinsics.d(sectionVO.getId(), update.getKey())) {
                sectionVO = ParcelTimelineVO.SectionVO.copy$default(sectionVO, update.getNewUiState(), null, null, 6, null);
            } else if (sectionVO.getUiState() == ParcelTimelineDTO.SectionDTO.SectionUIState.EXPANDED) {
                sectionVO = ParcelTimelineVO.SectionVO.copy$default(sectionVO, ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED, null, null, 6, null);
            }
            arrayList.add(sectionVO);
        }
        return ParcelTimelineVO.copy$default(parcelTimelineVO, 0L, arrayList, 1, null);
    }
}

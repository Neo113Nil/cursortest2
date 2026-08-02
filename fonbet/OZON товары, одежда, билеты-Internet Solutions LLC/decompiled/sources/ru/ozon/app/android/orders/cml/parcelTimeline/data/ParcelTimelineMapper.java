package ru.ozon.app.android.orders.cml.parcelTimeline.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\f\u001a\u00020\u0011*\u00020\u0012H\u0002J\u0014\u0010\f\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\f\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\f\u0010\f\u001a\u00020\u001a*\u00020\u001bH\u0002J\f\u0010\f\u001a\u00020\u001c*\u00020\u001dH\u0002¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineMapper;", "", "<init>", "()V", "invoke", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "state", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "stateId", "", "invoke-5GYmD6c", "(Ljava/util/List;Ljava/lang/String;)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "toVO", "id", "", "toVO-5GYmD6c", "(Ljava/util/List;J)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionHeaderDTO;", "sectionHash", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelineStepVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelineStepDTO;", "index", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorDTO;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParcelTimelineMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineMapper$Companion;", "", "<init>", "()V", "HEADER_ID_PREFIX", "", "STEP_ID_PREFIX", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ParcelTimelineVO.SectionVO toVO(ParcelTimelineDTO.SectionDTO sectionDTO) {
        ParcelTimelineDTO.SectionDTO.SectionUIState uiState = sectionDTO.getUiState();
        ParcelTimelineVO.SectionVO.SectionHeaderVO vo = toVO(sectionDTO.getHeader(), sectionDTO.hashCode());
        List<ParcelTimelineDTO.SectionDTO.TimelineStepDTO> steps = sectionDTO.getSteps();
        ArrayList arrayList = null;
        if (steps != null) {
            List<ParcelTimelineDTO.SectionDTO.TimelineStepDTO> list = steps;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList2.add(toVO((ParcelTimelineDTO.SectionDTO.TimelineStepDTO) obj, sectionDTO.hashCode(), i11));
                i11 = i12;
            }
            arrayList = arrayList2;
        }
        return new ParcelTimelineVO.SectionVO(uiState, vo, arrayList);
    }

    /* renamed from: toVO-5GYmD6c, reason: not valid java name */
    private final ParcelTimelineVO m861toVO5GYmD6c(List<? extends ParcelTimelineDTO.SectionDTO> list, long j11) {
        List<? extends ParcelTimelineDTO.SectionDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ParcelTimelineDTO.SectionDTO) it.next()));
        }
        return new ParcelTimelineVO(j11, arrayList);
    }

    @NotNull
    /* renamed from: invoke-5GYmD6c, reason: not valid java name */
    public final ParcelTimelineVO m862invoke5GYmD6c(@NotNull List<? extends ParcelTimelineDTO.SectionDTO> state, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return m861toVO5GYmD6c(state, stateId.hashCode());
    }

    private final ParcelTimelineVO.SectionVO.SectionHeaderVO toVO(ParcelTimelineDTO.SectionDTO.SectionHeaderDTO sectionHeaderDTO, int i11) {
        OzonSpannableString text = sectionHeaderDTO.getTitle().getText();
        return new ParcelTimelineVO.SectionVO.SectionHeaderVO("header-" + ((Object) text) + "-" + i11 + "-" + sectionHeaderDTO.hashCode(), toVO(sectionHeaderDTO.getPoint()), sectionHeaderDTO.getTitle(), sectionHeaderDTO.getSubtitle(), sectionHeaderDTO.getChevron(), sectionHeaderDTO.getBadge());
    }

    private final ParcelTimelineVO.SectionVO.TimelineStepVO toVO(ParcelTimelineDTO.SectionDTO.TimelineStepDTO timelineStepDTO, int i11, int i12) {
        OzonSpannableString text = timelineStepDTO.getTitle().getText();
        return new ParcelTimelineVO.SectionVO.TimelineStepVO("step-" + ((Object) text) + "-" + i11 + "-" + timelineStepDTO.hashCode() + "_" + i12, toVO(timelineStepDTO.getPoint()), timelineStepDTO.getTitle(), timelineStepDTO.getSubtitle(), timelineStepDTO.getBadge());
    }

    private final ParcelTimelineVO.SectionVO.TimelinePointVO toVO(ParcelTimelineDTO.SectionDTO.TimelinePointDTO timelinePointDTO) {
        IconDTO icon = timelinePointDTO.getIcon();
        String color = timelinePointDTO.getColor();
        ParcelTimelineDTO.SectionDTO.ConnectorDTO topLine = timelinePointDTO.getTopLine();
        if ((topLine != null ? topLine.getStyle() : null) == null) {
            topLine = null;
        }
        return new ParcelTimelineVO.SectionVO.TimelinePointVO(icon, color, topLine != null ? toVO(topLine) : null);
    }

    private final ParcelTimelineVO.SectionVO.ConnectorVO toVO(ParcelTimelineDTO.SectionDTO.ConnectorDTO connectorDTO) {
        return new ParcelTimelineVO.SectionVO.ConnectorVO(connectorDTO.getStyle(), connectorDTO.getColor());
    }
}

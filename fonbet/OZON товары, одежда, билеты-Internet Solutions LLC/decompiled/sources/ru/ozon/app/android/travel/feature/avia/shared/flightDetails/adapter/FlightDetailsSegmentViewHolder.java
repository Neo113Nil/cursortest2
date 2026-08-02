package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsSegmentView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsSegmentViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "segmentView", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentView;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentView;)V", "bind", "", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsSegmentViewHolder extends BaseViewHolder<AviaDetailsItem> {

    @NotNull
    private final FlightDetailsSegmentView segmentView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDetailsPayloads$FlightDetailsSegmentPayloads.values().length];
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.AIRLINE_LOGO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.SUB_AIRLINE_LOGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.BADGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.AIRLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_DURATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_AIRPLANE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_DEPARTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_ARRIVAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsSegmentPayloads.LUGGAGE_BADGES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailsSegmentViewHolder(@NotNull FlightDetailsSegmentView segmentView) {
        super(segmentView);
        Intrinsics.checkNotNullParameter(segmentView, "segmentView");
        this.segmentView = segmentView;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailsItem aviaDetailsItem, List list) {
        bind2(aviaDetailsItem, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailsItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ArrayList arrayList = null;
        if ((item instanceof AviaDetailsItem.SegmentVO ? (AviaDetailsItem.SegmentVO) item : null) != null) {
            Object M11 = C7714v.M(payloads);
            List list = M11 instanceof List ? (List) M11 : null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof FlightDetailsPayloads$FlightDetailsSegmentPayloads) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                this.segmentView.bind((AviaDetailsItem.SegmentVO) item);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                switch (WhenMappings.$EnumSwitchMapping$0[((FlightDetailsPayloads$FlightDetailsSegmentPayloads) it.next()).ordinal()]) {
                    case 1:
                        this.segmentView.bindAirlineLogo((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 2:
                        this.segmentView.bindSubAirlineLogo((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 3:
                        this.segmentView.bindBadge((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 4:
                        this.segmentView.bindAirline((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 5:
                        this.segmentView.bindSegmentDuration((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 6:
                        this.segmentView.bindSegmentAirplane((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 7:
                        this.segmentView.bindSegmentDeparture((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 8:
                        this.segmentView.bindSegmentArrival((AviaDetailsItem.SegmentVO) item);
                        break;
                    case 9:
                        this.segmentView.bindLuggageBadges((AviaDetailsItem.SegmentVO) item);
                        break;
                    default:
                        throw new o();
                }
            }
        }
    }
}

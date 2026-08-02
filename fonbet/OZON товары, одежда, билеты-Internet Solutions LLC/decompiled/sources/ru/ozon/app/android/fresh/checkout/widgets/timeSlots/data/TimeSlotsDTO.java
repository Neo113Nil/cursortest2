package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.data;

import Kk.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO;", "", "items", "", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO$TimeSlot;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getViewTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TimeSlot", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimeSlotsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TimeSlot> items;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO$TimeSlot;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "aspectPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAspectPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeSlot {
        public static final int $stable = AspectDTO.$stable;
        private final Paddings aspectPadding;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public TimeSlot(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle, Paddings paddings) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
            this.aspectPadding = paddings;
        }

        public static /* synthetic */ TimeSlot copy$default(TimeSlot timeSlot, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = timeSlot.wrapper;
            }
            if ((i11 & 2) != 0) {
                textDTO = timeSlot.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = timeSlot.subtitle;
            }
            if ((i11 & 8) != 0) {
                paddings = timeSlot.aspectPadding;
            }
            return timeSlot.copy(aspectDTO, textDTO, textDTO2, paddings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getAspectPadding() {
            return this.aspectPadding;
        }

        @NotNull
        public final TimeSlot copy(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle, Paddings aspectPadding) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new TimeSlot(wrapper, title, subtitle, aspectPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeSlot)) {
                return false;
            }
            TimeSlot timeSlot = (TimeSlot) other;
            return Intrinsics.d(this.wrapper, timeSlot.wrapper) && Intrinsics.d(this.title, timeSlot.title) && Intrinsics.d(this.subtitle, timeSlot.subtitle) && this.aspectPadding == timeSlot.aspectPadding;
        }

        public final Paddings getAspectPadding() {
            return this.aspectPadding;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, b.a(this.title, this.wrapper.hashCode() * 31, 31), 31);
            Paddings paddings = this.aspectPadding;
            return a11 + (paddings == null ? 0 : paddings.hashCode());
        }

        @NotNull
        public String toString() {
            return "TimeSlot(wrapper=" + this.wrapper + ", title=" + this.title + ", subtitle=" + this.subtitle + ", aspectPadding=" + this.aspectPadding + ")";
        }
    }

    public TimeSlotsDTO(@NotNull List<TimeSlot> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.viewTrackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeSlotsDTO copy$default(TimeSlotsDTO timeSlotsDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = timeSlotsDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = timeSlotsDTO.viewTrackingInfo;
        }
        return timeSlotsDTO.copy(list, map);
    }

    @NotNull
    public final List<TimeSlot> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.viewTrackingInfo;
    }

    @NotNull
    public final TimeSlotsDTO copy(@NotNull List<TimeSlot> items, Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TimeSlotsDTO(items, viewTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlotsDTO)) {
            return false;
        }
        TimeSlotsDTO timeSlotsDTO = (TimeSlotsDTO) other;
        return Intrinsics.d(this.items, timeSlotsDTO.items) && Intrinsics.d(this.viewTrackingInfo, timeSlotsDTO.viewTrackingInfo);
    }

    @NotNull
    public final List<TimeSlot> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("TimeSlotsDTO(items=", ", viewTrackingInfo=", ")", this.items, this.viewTrackingInfo);
    }
}

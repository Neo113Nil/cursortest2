package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain;

import G.g;
import Lh.a;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "items", "LWZ/t;", "viewTokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "TimeSlot", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimeSlotsVO implements c {
    private final long id;

    @NotNull
    private final List<TimeSlot> items;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "wrapper", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "aspectPadding", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "I", "getAspectPadding", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeSlot {
        public static final int $stable = AspectDTO.$stable;
        private final int aspectPadding;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public TimeSlot(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle, int i11) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
            this.aspectPadding = i11;
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

        public final int getAspectPadding() {
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
            return Integer.hashCode(this.aspectPadding) + b.a(this.subtitle, b.a(this.title, this.wrapper.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "TimeSlot(wrapper=" + this.wrapper + ", title=" + this.title + ", subtitle=" + this.subtitle + ", aspectPadding=" + this.aspectPadding + ")";
        }
    }

    public TimeSlotsVO(long j11, @NotNull List<TimeSlot> items, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.viewTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlotsVO)) {
            return false;
        }
        TimeSlotsVO timeSlotsVO = (TimeSlotsVO) other;
        return this.id == timeSlotsVO.id && Intrinsics.d(this.items, timeSlotsVO.items) && Intrinsics.d(this.viewTokenizedEvent, timeSlotsVO.viewTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TimeSlot> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        t tVar = this.viewTokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TimeSlot> list = this.items;
        return a.b(Lh.b.b(j11, "TimeSlotsVO(id=", ", items=", list), ", viewTokenizedEvent=", this.viewTokenizedEvent, ")");
    }
}

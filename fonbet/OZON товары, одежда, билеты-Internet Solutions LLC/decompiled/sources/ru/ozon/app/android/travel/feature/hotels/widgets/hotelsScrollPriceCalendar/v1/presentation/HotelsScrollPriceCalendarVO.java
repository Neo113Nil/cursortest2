package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation;

import D40.d;
import Ns.b;
import TY.a;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO$DatePriceItem;", "datePrices", "", "autoScrollIndex", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getDatePrices", "()Ljava/util/List;", "Ljava/lang/Integer;", "getAutoScrollIndex", "()Ljava/lang/Integer;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "DatePriceItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsScrollPriceCalendarVO implements c {
    private final Integer autoScrollIndex;
    private final List<DatePriceItem> datePrices;
    private final long id;
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO$DatePriceItem;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "weekdaysInterval", "dateInterval", "price", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getWeekdaysInterval", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDateInterval", "getPrice", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatePriceItem {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final TextDTO dateInterval;
        private final int id;

        @NotNull
        private final TextDTO price;

        @NotNull
        private final TextDTO weekdaysInterval;

        public DatePriceItem(int i11, @NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, @NotNull TextDTO price, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(price, "price");
            this.id = i11;
            this.weekdaysInterval = weekdaysInterval;
            this.dateInterval = dateInterval;
            this.price = price;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatePriceItem)) {
                return false;
            }
            DatePriceItem datePriceItem = (DatePriceItem) other;
            return this.id == datePriceItem.id && Intrinsics.d(this.weekdaysInterval, datePriceItem.weekdaysInterval) && Intrinsics.d(this.dateInterval, datePriceItem.dateInterval) && Intrinsics.d(this.price, datePriceItem.price) && Intrinsics.d(this.action, datePriceItem.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getDateInterval() {
            return this.dateInterval;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getWeekdaysInterval() {
            return this.weekdaysInterval;
        }

        public int hashCode() {
            int a11 = b.a(this.price, b.a(this.dateInterval, b.a(this.weekdaysInterval, Integer.hashCode(this.id) * 31, 31), 31), 31);
            AtomAction atomAction = this.action;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.weekdaysInterval;
            TextDTO textDTO2 = this.dateInterval;
            TextDTO textDTO3 = this.price;
            AtomAction atomAction = this.action;
            StringBuilder b11 = C4055a.b(textDTO, "DatePriceItem(id=", ", weekdaysInterval=", ", dateInterval=", i11);
            d.e(", price=", ", action=", b11, textDTO2, textDTO3);
            return B6.b.b(b11, atomAction, ")");
        }
    }

    public HotelsScrollPriceCalendarVO(long j11, TextDTO textDTO, List<DatePriceItem> list, Integer num, t tVar) {
        this.id = j11;
        this.title = textDTO;
        this.datePrices = list;
        this.autoScrollIndex = num;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsScrollPriceCalendarVO)) {
            return false;
        }
        HotelsScrollPriceCalendarVO hotelsScrollPriceCalendarVO = (HotelsScrollPriceCalendarVO) other;
        return this.id == hotelsScrollPriceCalendarVO.id && Intrinsics.d(this.title, hotelsScrollPriceCalendarVO.title) && Intrinsics.d(this.datePrices, hotelsScrollPriceCalendarVO.datePrices) && Intrinsics.d(this.autoScrollIndex, hotelsScrollPriceCalendarVO.autoScrollIndex) && Intrinsics.d(this.viewEvent, hotelsScrollPriceCalendarVO.viewEvent);
    }

    public final Integer getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final List<DatePriceItem> getDatePrices() {
        return this.datePrices;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<DatePriceItem> list = this.datePrices;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.autoScrollIndex;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<DatePriceItem> list = this.datePrices;
        Integer num = this.autoScrollIndex;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("HotelsScrollPriceCalendarVO(id=", j11, ", title=", textDTO);
        b11.append(", datePrices=");
        b11.append(list);
        b11.append(", autoScrollIndex=");
        b11.append(num);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}

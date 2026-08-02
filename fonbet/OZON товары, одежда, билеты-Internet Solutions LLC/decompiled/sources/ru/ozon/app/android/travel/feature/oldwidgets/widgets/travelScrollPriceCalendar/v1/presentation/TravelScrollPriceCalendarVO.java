package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Lh.b;
import Nh.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "dateTabs", "", "selectedItemPosition", "Lru/ozon/uni/atoms/af/AtomAction;", "loadingAction", "<init>", "(JLjava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(JLjava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getDateTabs", "()Ljava/util/List;", "Ljava/lang/Integer;", "getSelectedItemPosition", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getLoadingAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "DateTabVO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelScrollPriceCalendarVO implements c {

    @NotNull
    private final List<DateTabVO> dateTabs;
    private final long id;
    private final AtomAction loadingAction;
    private final Integer selectedItemPosition;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b(\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b\f\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "price", "", "isProgressVisible", "", "borderColor", "backgroundColor", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "priceForAnalytics", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "Z", "()Z", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getPriceForAnalytics", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTabVO {
        private final AtomAction action;
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final TextAtom date;
        private final long id;
        private final boolean isProgressVisible;
        private final boolean isSelected;
        private final TextAtom price;
        private final String priceForAnalytics;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public DateTabVO(long j11, @NotNull TextAtom date, TextAtom textAtom, boolean z11, String str, String str2, boolean z12, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, String str3) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.id = j11;
            this.date = date;
            this.price = textAtom;
            this.isProgressVisible = z11;
            this.borderColor = str;
            this.backgroundColor = str2;
            this.isSelected = z12;
            this.action = atomAction;
            this.trackingInfo = map;
            this.priceForAnalytics = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTabVO)) {
                return false;
            }
            DateTabVO dateTabVO = (DateTabVO) other;
            return this.id == dateTabVO.id && Intrinsics.d(this.date, dateTabVO.date) && Intrinsics.d(this.price, dateTabVO.price) && this.isProgressVisible == dateTabVO.isProgressVisible && Intrinsics.d(this.borderColor, dateTabVO.borderColor) && Intrinsics.d(this.backgroundColor, dateTabVO.backgroundColor) && this.isSelected == dateTabVO.isSelected && Intrinsics.d(this.action, dateTabVO.action) && Intrinsics.d(this.trackingInfo, dateTabVO.trackingInfo) && Intrinsics.d(this.priceForAnalytics, dateTabVO.priceForAnalytics);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        public final long getId() {
            return this.id;
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        public final String getPriceForAnalytics() {
            return this.priceForAnalytics;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.date);
            TextAtom textAtom = this.price;
            int a11 = C3532b.a((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.isProgressVisible);
            String str = this.borderColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a12 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSelected);
            AtomAction atomAction = this.action;
            int hashCode2 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            String str3 = this.priceForAnalytics;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* renamed from: isProgressVisible, reason: from getter */
        public final boolean getIsProgressVisible() {
            return this.isProgressVisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.date;
            TextAtom textAtom2 = this.price;
            boolean z11 = this.isProgressVisible;
            String str = this.borderColor;
            String str2 = this.backgroundColor;
            boolean z12 = this.isSelected;
            AtomAction atomAction = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            String str3 = this.priceForAnalytics;
            StringBuilder c11 = C2639a.c("DateTabVO(id=", j11, ", date=", textAtom);
            c11.append(", price=");
            c11.append(textAtom2);
            c11.append(", isProgressVisible=");
            c11.append(z11);
            a.h(c11, ", borderColor=", str, ", backgroundColor=", str2);
            c11.append(", isSelected=");
            c11.append(z12);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", priceForAnalytics=");
            c11.append(str3);
            c11.append(")");
            return c11.toString();
        }
    }

    public TravelScrollPriceCalendarVO(long j11, @NotNull List<DateTabVO> dateTabs, Integer num, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        this.id = j11;
        this.dateTabs = dateTabs;
        this.selectedItemPosition = num;
        this.loadingAction = atomAction;
    }

    public static /* synthetic */ TravelScrollPriceCalendarVO copy$default(TravelScrollPriceCalendarVO travelScrollPriceCalendarVO, long j11, List list, Integer num, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelScrollPriceCalendarVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = travelScrollPriceCalendarVO.dateTabs;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            num = travelScrollPriceCalendarVO.selectedItemPosition;
        }
        Integer num2 = num;
        if ((i11 & 8) != 0) {
            atomAction = travelScrollPriceCalendarVO.loadingAction;
        }
        return travelScrollPriceCalendarVO.copy(j12, list2, num2, atomAction);
    }

    @NotNull
    public final TravelScrollPriceCalendarVO copy(long id2, @NotNull List<DateTabVO> dateTabs, Integer selectedItemPosition, AtomAction loadingAction) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        return new TravelScrollPriceCalendarVO(id2, dateTabs, selectedItemPosition, loadingAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelScrollPriceCalendarVO)) {
            return false;
        }
        TravelScrollPriceCalendarVO travelScrollPriceCalendarVO = (TravelScrollPriceCalendarVO) other;
        return this.id == travelScrollPriceCalendarVO.id && Intrinsics.d(this.dateTabs, travelScrollPriceCalendarVO.dateTabs) && Intrinsics.d(this.selectedItemPosition, travelScrollPriceCalendarVO.selectedItemPosition) && Intrinsics.d(this.loadingAction, travelScrollPriceCalendarVO.loadingAction);
    }

    @NotNull
    public final List<DateTabVO> getDateTabs() {
        return this.dateTabs;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomAction getLoadingAction() {
        return this.loadingAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.dateTabs);
        Integer num = this.selectedItemPosition;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        AtomAction atomAction = this.loadingAction;
        return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<DateTabVO> list = this.dateTabs;
        Integer num = this.selectedItemPosition;
        AtomAction atomAction = this.loadingAction;
        StringBuilder b11 = b.b(j11, "TravelScrollPriceCalendarVO(id=", ", dateTabs=", list);
        b11.append(", selectedItemPosition=");
        b11.append(num);
        b11.append(", loadingAction=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}

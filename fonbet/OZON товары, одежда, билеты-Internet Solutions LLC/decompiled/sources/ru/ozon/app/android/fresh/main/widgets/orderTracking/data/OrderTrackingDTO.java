package ru.ozon.app.android.fresh.main.widgets.orderTracking.data;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Ih.a;
import Pk0.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "", "items", "", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item;", "widgetUpdatePeriod", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;JLjava/util/Map;)V", "getItems", "()Ljava/util/List;", "getWidgetUpdatePeriod", "()J", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderTrackingDTO {
    private final List<Item> items;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final long widgetUpdatePeriod;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "image", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;", "itemClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getImage", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTimer", "()Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;", "setTimer", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;)V", "getItemClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Timer", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Item {

        @NotNull
        private final Badge badge;

        @NotNull
        private final String image;

        @NotNull
        private final AtomActionDTO itemClickAction;

        @NotNull
        private final TextAtom subtitle;
        private Timer timer;

        @NotNull
        private final TextAtom title;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;", "", "serverTimestamp", "Lorg/joda/time/DateTime;", "deadlineTimestamp", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getDeadlineTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Timer {

            @NotNull
            private final DateTime deadlineTimestamp;

            @NotNull
            private final DateTime serverTimestamp;

            public Timer(@NotNull DateTime serverTimestamp, @NotNull DateTime deadlineTimestamp) {
                Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
                Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
                this.serverTimestamp = serverTimestamp;
                this.deadlineTimestamp = deadlineTimestamp;
            }

            public static /* synthetic */ Timer copy$default(Timer timer, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    dateTime = timer.serverTimestamp;
                }
                if ((i11 & 2) != 0) {
                    dateTime2 = timer.deadlineTimestamp;
                }
                return timer.copy(dateTime, dateTime2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final DateTime getServerTimestamp() {
                return this.serverTimestamp;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final DateTime getDeadlineTimestamp() {
                return this.deadlineTimestamp;
            }

            @NotNull
            public final Timer copy(@NotNull DateTime serverTimestamp, @NotNull DateTime deadlineTimestamp) {
                Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
                Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
                return new Timer(serverTimestamp, deadlineTimestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Timer)) {
                    return false;
                }
                Timer timer = (Timer) other;
                return Intrinsics.d(this.serverTimestamp, timer.serverTimestamp) && Intrinsics.d(this.deadlineTimestamp, timer.deadlineTimestamp);
            }

            @NotNull
            public final DateTime getDeadlineTimestamp() {
                return this.deadlineTimestamp;
            }

            @NotNull
            public final DateTime getServerTimestamp() {
                return this.serverTimestamp;
            }

            public int hashCode() {
                return this.deadlineTimestamp.hashCode() + (this.serverTimestamp.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Timer(serverTimestamp=" + this.serverTimestamp + ", deadlineTimestamp=" + this.deadlineTimestamp + ")";
            }
        }

        public Item(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull String image, @NotNull Badge badge, Timer timer, @NotNull AtomActionDTO itemClickAction, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(itemClickAction, "itemClickAction");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.title = title;
            this.subtitle = subtitle;
            this.image = image;
            this.badge = badge;
            this.timer = timer;
            this.itemClickAction = itemClickAction;
            this.trackingInfo = trackingInfo;
        }

        public static /* synthetic */ Item copy$default(Item item, TextAtom textAtom, TextAtom textAtom2, String str, Badge badge, Timer timer, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = item.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = item.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = item.image;
            }
            if ((i11 & 8) != 0) {
                badge = item.badge;
            }
            if ((i11 & 16) != 0) {
                timer = item.timer;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = item.itemClickAction;
            }
            if ((i11 & 64) != 0) {
                map = item.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Timer timer2 = timer;
            String str2 = str;
            return item.copy(textAtom, textAtom2, str2, badge, timer2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final Timer getTimer() {
            return this.timer;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getItemClickAction() {
            return this.itemClickAction;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull String image, @NotNull Badge badge, Timer timer, @NotNull AtomActionDTO itemClickAction, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(itemClickAction, "itemClickAction");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            return new Item(title, subtitle, image, badge, timer, itemClickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.title, item.title) && Intrinsics.d(this.subtitle, item.subtitle) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.badge, item.badge) && Intrinsics.d(this.timer, item.timer) && Intrinsics.d(this.itemClickAction, item.itemClickAction) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        @NotNull
        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final AtomActionDTO getItemClickAction() {
            return this.itemClickAction;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final Timer getTimer() {
            return this.timer;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.badge.hashCode() + g.a(C2619v.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image)) * 31;
            Timer timer = this.timer;
            return this.trackingInfo.hashCode() + a.b(this.itemClickAction, (hashCode + (timer == null ? 0 : timer.hashCode())) * 31, 31);
        }

        public final void setTimer(Timer timer) {
            this.timer = timer;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            String str = this.image;
            Badge badge = this.badge;
            Timer timer = this.timer;
            AtomActionDTO atomActionDTO = this.itemClickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("Item(title=", textAtom, ", subtitle=", textAtom2, ", image=");
            a11.append(str);
            a11.append(", badge=");
            a11.append(badge);
            a11.append(", timer=");
            a11.append(timer);
            a11.append(", itemClickAction=");
            a11.append(atomActionDTO);
            a11.append(", trackingInfo=");
            return P.f(a11, map, ")");
        }
    }

    public OrderTrackingDTO(List<Item> list, long j11, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.items = list;
        this.widgetUpdatePeriod = j11;
        this.trackingInfo = trackingInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderTrackingDTO copy$default(OrderTrackingDTO orderTrackingDTO, List list, long j11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderTrackingDTO.items;
        }
        if ((i11 & 2) != 0) {
            j11 = orderTrackingDTO.widgetUpdatePeriod;
        }
        if ((i11 & 4) != 0) {
            map = orderTrackingDTO.trackingInfo;
        }
        return orderTrackingDTO.copy(list, j11, map);
    }

    public final List<Item> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderTrackingDTO copy(List<Item> items, long widgetUpdatePeriod, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new OrderTrackingDTO(items, widgetUpdatePeriod, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackingDTO)) {
            return false;
        }
        OrderTrackingDTO orderTrackingDTO = (OrderTrackingDTO) other;
        return Intrinsics.d(this.items, orderTrackingDTO.items) && this.widgetUpdatePeriod == orderTrackingDTO.widgetUpdatePeriod && Intrinsics.d(this.trackingInfo, orderTrackingDTO.trackingInfo);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        List<Item> list = this.items;
        return this.trackingInfo.hashCode() + c.a((list == null ? 0 : list.hashCode()) * 31, 31, this.widgetUpdatePeriod);
    }

    @NotNull
    public String toString() {
        List<Item> list = this.items;
        long j11 = this.widgetUpdatePeriod;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderTrackingDTO(items=");
        sb2.append(list);
        sb2.append(", widgetUpdatePeriod=");
        sb2.append(j11);
        return C2639a.b(sb2, ", trackingInfo=", map, ")");
    }
}

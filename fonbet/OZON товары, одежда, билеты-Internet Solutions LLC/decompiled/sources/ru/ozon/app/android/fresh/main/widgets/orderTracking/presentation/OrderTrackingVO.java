package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import A00.a;
import B90.C2619v;
import De.C2859b;
import E0.C2942q;
import G.g;
import Lh.b;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001&B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "items", "widgetUpdatePeriod", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;JLWZ/t;)V", "copy", "(JLjava/util/List;JLWZ/t;)Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getWidgetUpdatePeriod", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Item", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTrackingVO implements c, a.J.InterfaceC0007a {
    private final long id;
    private final List<Item> items;

    @NotNull
    private final t tokenizedEvent;
    private final long widgetUpdatePeriod;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "image", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "itemClickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/af/AtomAction;", "getItemClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "", "endTimeStamp", "Ljava/lang/Long;", "getEndTimeStamp", "()Ljava/lang/Long;", "setEndTimeStamp", "(Ljava/lang/Long;)V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Item {

        @NotNull
        private final Badge badge;
        private Long endTimeStamp;

        @NotNull
        private final String image;

        @NotNull
        private final AtomAction itemClickAction;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        @NotNull
        private final t tokenizedEvent;

        public Item(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull String image, @NotNull Badge badge, @NotNull AtomAction itemClickAction, @NotNull t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(itemClickAction, "itemClickAction");
            Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
            this.title = title;
            this.subtitle = subtitle;
            this.image = image;
            this.badge = badge;
            this.itemClickAction = itemClickAction;
            this.tokenizedEvent = tokenizedEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.title, item.title) && Intrinsics.d(this.subtitle, item.subtitle) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.badge, item.badge) && Intrinsics.d(this.itemClickAction, item.itemClickAction) && Intrinsics.d(this.tokenizedEvent, item.tokenizedEvent);
        }

        @NotNull
        public final Badge getBadge() {
            return this.badge;
        }

        public final Long getEndTimeStamp() {
            return this.endTimeStamp;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final AtomAction getItemClickAction() {
            return this.itemClickAction;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            return this.tokenizedEvent.hashCode() + C4598rp.a(this.itemClickAction, (this.badge.hashCode() + g.a(C2619v.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image)) * 31, 31);
        }

        public final void setEndTimeStamp(Long l11) {
            this.endTimeStamp = l11;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            String str = this.image;
            Badge badge = this.badge;
            AtomAction atomAction = this.itemClickAction;
            t tVar = this.tokenizedEvent;
            StringBuilder a11 = HY.a.a("Item(title=", textAtom, ", subtitle=", textAtom2, ", image=");
            a11.append(str);
            a11.append(", badge=");
            a11.append(badge);
            a11.append(", itemClickAction=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", a11, atomAction);
        }
    }

    public OrderTrackingVO(long j11, List<Item> list, long j12, @NotNull t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        this.id = j11;
        this.items = list;
        this.widgetUpdatePeriod = j12;
        this.tokenizedEvent = tokenizedEvent;
    }

    public static /* synthetic */ OrderTrackingVO copy$default(OrderTrackingVO orderTrackingVO, long j11, List list, long j12, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = orderTrackingVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            list = orderTrackingVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            j12 = orderTrackingVO.widgetUpdatePeriod;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            tVar = orderTrackingVO.tokenizedEvent;
        }
        return orderTrackingVO.copy(j13, list2, j14, tVar);
    }

    @NotNull
    public final OrderTrackingVO copy(long id2, List<Item> items, long widgetUpdatePeriod, @NotNull t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        return new OrderTrackingVO(id2, items, widgetUpdatePeriod, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackingVO)) {
            return false;
        }
        OrderTrackingVO orderTrackingVO = (OrderTrackingVO) other;
        return this.id == orderTrackingVO.id && Intrinsics.d(this.items, orderTrackingVO.items) && this.widgetUpdatePeriod == orderTrackingVO.widgetUpdatePeriod && Intrinsics.d(this.tokenizedEvent, orderTrackingVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<Item> list = this.items;
        return this.tokenizedEvent.hashCode() + Pk0.c.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.widgetUpdatePeriod);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Item> list = this.items;
        long j12 = this.widgetUpdatePeriod;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "OrderTrackingVO(id=", ", items=", list);
        C2942q.f(b11, ", widgetUpdatePeriod=", j12, ", tokenizedEvent=");
        return Tl.b.d(b11, tVar, ")");
    }
}

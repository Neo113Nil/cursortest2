package com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.er;
import xsna.kr;
import xsna.qow;
import xsna.qoy;
import xsna.qr;
import xsna.tlo0;
import xsna.v11;
import xsna.zrp;

/* compiled from: OrdersListItem.kt */
/* loaded from: classes18.dex */
public abstract class OrdersListItem {
    public final String a;

    /* compiled from: OrdersListItem.kt */
    public static final class Order extends OrdersListItem {
        public final int b;
        public final tlo0 c;
        public final boolean d;
        public final com.vk.ecomm.orders.impl.common.ui.model.a e;
        public final com.vk.ecomm.orders.impl.common.ui.model.a f;
        public final Map<String, com.vk.ecomm.orders.impl.common.ui.model.a> g;
        public final com.vk.ecomm.orders.impl.common.ui.model.a h;
        public final ArrayList i;
        public final boolean j;
        public final qow<CharSequence> k;
        public final Action l;

        /* compiled from: OrdersListItem.kt */
        public static final class Action {
            public final tlo0.f a;
            public final Style b;
            public final OrderPreview.ActionType c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: OrdersListItem.kt */
            public static final class Style {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final Style Primary;
                public static final Style Secondary;

                static {
                    Style style = new Style("Primary", 0);
                    Primary = style;
                    Style style2 = new Style("Secondary", 1);
                    Secondary = style2;
                    Style[] styleArr = {style, style2};
                    $VALUES = styleArr;
                    $ENTRIES = new asp(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            public Action(tlo0.f fVar, Style style, OrderPreview.ActionType actionType) {
                this.a = fVar;
                this.b = style;
                this.c = actionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return this.a.equals(action.a) && this.b == action.b && this.c == action.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
            }

            public final String toString() {
                return "Action(title=" + this.a + ", style=" + this.b + ", type=" + this.c + ')';
            }
        }

        /* compiled from: OrdersListItem.kt */
        public static final class a {
            public final long a;
            public final UserId b;
            public final String c;
            public final Image d;

            public a(long j, UserId userId, String str, Image image) {
                this.a = j;
                this.b = userId;
                this.c = str;
                this.d = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
                String str = this.c;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                Image image = this.d;
                return hashCode + (image != null ? image.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Product(productId=");
                sb.append(this.a);
                sb.append(", groupId=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", image=");
                return er.d(sb, this.d, ')');
            }
        }

        public Order(int i, tlo0 tlo0Var, boolean z, com.vk.ecomm.orders.impl.common.ui.model.a aVar, com.vk.ecomm.orders.impl.common.ui.model.a aVar2, MapBuilder mapBuilder, com.vk.ecomm.orders.impl.common.ui.model.a aVar3, ArrayList arrayList, boolean z2, qow qowVar, Action action) {
            super(String.valueOf(i));
            this.b = i;
            this.c = tlo0Var;
            this.d = z;
            this.e = aVar;
            this.f = aVar2;
            this.g = mapBuilder;
            this.h = aVar3;
            this.i = arrayList;
            this.j = z2;
            this.k = qowVar;
            this.l = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Order)) {
                return false;
            }
            Order order = (Order) obj;
            return this.b == order.b && epx.f(this.c, order.c) && this.d == order.d && epx.f(this.e, order.e) && epx.f(this.f, order.f) && epx.f(this.g, order.g) && epx.f(this.h, order.h) && epx.f(this.i, order.i) && this.j == order.j && epx.f(this.k, order.k) && epx.f(this.l, order.l);
        }

        public final int hashCode() {
            int b = qoy.b(com.vk.movika.sdk.base.model.history.b.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            com.vk.ecomm.orders.impl.common.ui.model.a aVar = this.e;
            int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.vk.ecomm.orders.impl.common.ui.model.a aVar2 = this.f;
            int a2 = v11.a((hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.g);
            com.vk.ecomm.orders.impl.common.ui.model.a aVar3 = this.h;
            int b2 = qoy.b(qr.a(this.i, (a2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31), 31, this.j);
            qow<CharSequence> qowVar = this.k;
            int a3 = (b2 + (qowVar == null ? 0 : qow.a(qowVar.a))) * 31;
            Action action = this.l;
            return a3 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order(orderId=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.c);
            sb.append(", isViewed=");
            sb.append(this.d);
            sb.append(", orderDisplayedIdSpan=");
            sb.append(this.e);
            sb.append(", dateSpan=");
            sb.append(this.f);
            sb.append(", sellerSpans=");
            sb.append(this.g);
            sb.append(", priceSpan=");
            sb.append(this.h);
            sb.append(", productPreviews=");
            kr.d(this.i, sb, ", moreProductsAvailable=");
            sb.append(this.j);
            sb.append(", sellerComment=");
            sb.append(this.k);
            sb.append(", action=");
            sb.append(this.l);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: OrdersListItem.kt */
    public static final class a extends OrdersListItem {
        public static final a b = new a("loading_failed");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2027550155;
        }

        public final String toString() {
            return "LoadingFailed";
        }
    }

    /* compiled from: OrdersListItem.kt */
    public static final class b extends OrdersListItem {
        public static final b b = new b("loading");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1455798238;
        }

        public final String toString() {
            return "PaginationLoading";
        }
    }

    public OrdersListItem(String str) {
        this.a = str;
    }
}

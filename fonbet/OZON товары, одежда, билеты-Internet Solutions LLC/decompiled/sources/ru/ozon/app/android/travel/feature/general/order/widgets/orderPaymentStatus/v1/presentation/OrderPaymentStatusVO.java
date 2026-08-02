package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation;

import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001?Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "price", "subtitle", "Lorg/joda/time/DateTime;", "endTime", "deadline", "LWZ/t;", "viewEvent", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButton", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "paddings", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Ljava/lang/Long;LWZ/t;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "Lorg/joda/time/DateTime;", "getEndTime", "()Lorg/joda/time/DateTime;", "Ljava/lang/Long;", "getDeadline", "()Ljava/lang/Long;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "getPaddings", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "WidgetPaddings", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderPaymentStatusVO implements c {

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final Long deadline;
    private final DateTime endTime;
    private final long id;
    private final IconButtonV3DTO infoButton;
    private final WidgetPaddings paddings;
    private final BadgeDTO price;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetPaddings {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public WidgetPaddings(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetPaddings)) {
                return false;
            }
            WidgetPaddings widgetPaddings = (WidgetPaddings) other;
            return this.top == widgetPaddings.top && this.bottom == widgetPaddings.bottom && this.left == widgetPaddings.left && this.right == widgetPaddings.right;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("WidgetPaddings(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    public OrderPaymentStatusVO(long j11, @NotNull TextDTO title, BadgeDTO badgeDTO, TextDTO textDTO, DateTime dateTime, Long l11, t tVar, @NotNull List<ButtonV3DTO> buttons, IconButtonV3DTO iconButtonV3DTO, WidgetPaddings widgetPaddings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.title = title;
        this.price = badgeDTO;
        this.subtitle = textDTO;
        this.endTime = dateTime;
        this.deadline = l11;
        this.viewEvent = tVar;
        this.buttons = buttons;
        this.infoButton = iconButtonV3DTO;
        this.paddings = widgetPaddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPaymentStatusVO)) {
            return false;
        }
        OrderPaymentStatusVO orderPaymentStatusVO = (OrderPaymentStatusVO) other;
        return this.id == orderPaymentStatusVO.id && Intrinsics.d(this.title, orderPaymentStatusVO.title) && Intrinsics.d(this.price, orderPaymentStatusVO.price) && Intrinsics.d(this.subtitle, orderPaymentStatusVO.subtitle) && Intrinsics.d(this.endTime, orderPaymentStatusVO.endTime) && Intrinsics.d(this.deadline, orderPaymentStatusVO.deadline) && Intrinsics.d(this.viewEvent, orderPaymentStatusVO.viewEvent) && Intrinsics.d(this.buttons, orderPaymentStatusVO.buttons) && Intrinsics.d(this.infoButton, orderPaymentStatusVO.infoButton) && Intrinsics.d(this.paddings, orderPaymentStatusVO.paddings);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final DateTime getEndTime() {
        return this.endTime;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    public final WidgetPaddings getPaddings() {
        return this.paddings;
    }

    public final BadgeDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
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
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.price;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        DateTime dateTime = this.endTime;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l11 = this.deadline;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        t tVar = this.viewEvent;
        int b11 = g.b((hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.buttons);
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        int hashCode5 = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        WidgetPaddings widgetPaddings = this.paddings;
        return hashCode5 + (widgetPaddings != null ? widgetPaddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.price;
        TextDTO textDTO2 = this.subtitle;
        DateTime dateTime = this.endTime;
        Long l11 = this.deadline;
        t tVar = this.viewEvent;
        List<ButtonV3DTO> list = this.buttons;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        WidgetPaddings widgetPaddings = this.paddings;
        StringBuilder b11 = a.b("OrderPaymentStatusVO(id=", j11, ", title=", textDTO);
        b11.append(", price=");
        b11.append(badgeDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", endTime=");
        b11.append(dateTime);
        b11.append(", deadline=");
        b11.append(l11);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(", buttons=");
        b11.append(list);
        b11.append(", infoButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", paddings=");
        b11.append(widgetPaddings);
        b11.append(")");
        return b11.toString();
    }
}

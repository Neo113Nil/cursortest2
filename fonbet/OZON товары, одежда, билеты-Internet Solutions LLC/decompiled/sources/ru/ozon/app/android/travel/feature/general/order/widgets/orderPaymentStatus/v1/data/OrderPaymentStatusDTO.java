package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.data;

import B3.p;
import G.g;
import GR.b;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001;Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J|\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\nHÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "subtitle", "endTime", "Lorg/joda/time/DateTime;", "timeLeft", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "infoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "paddings", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "getEndTime$annotations", "()V", "getEndTime", "()Lorg/joda/time/DateTime;", "getTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getButtons", "()Ljava/util/List;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getPaddings", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;)Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;", "equals", "", "other", "hashCode", "toString", "", "WidgetPaddings", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderPaymentStatusDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final CommonControlSettings common;
    private final DateTime endTime;
    private final IconButtonV3DTO infoButton;
    private final WidgetPaddings paddings;
    private final BadgeDTO price;
    private final TextDTO subtitle;
    private final Integer timeLeft;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetPaddings {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings left;

        @EnumNullFallback
        @NotNull
        private final Paddings right;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        public WidgetPaddings() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ WidgetPaddings copy$default(WidgetPaddings widgetPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = widgetPaddings.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = widgetPaddings.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = widgetPaddings.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = widgetPaddings.right;
            }
            return widgetPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final WidgetPaddings copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new WidgetPaddings(top, bottom, left, right);
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

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("WidgetPaddings(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public WidgetPaddings(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ WidgetPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public OrderPaymentStatusDTO(@NotNull TextDTO title, BadgeDTO badgeDTO, TextDTO textDTO, DateTime dateTime, Integer num, CommonControlSettings commonControlSettings, @NotNull List<ButtonV3DTO> buttons, IconButtonV3DTO iconButtonV3DTO, WidgetPaddings widgetPaddings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.title = title;
        this.price = badgeDTO;
        this.subtitle = textDTO;
        this.endTime = dateTime;
        this.timeLeft = num;
        this.common = commonControlSettings;
        this.buttons = buttons;
        this.infoButton = iconButtonV3DTO;
        this.paddings = widgetPaddings;
    }

    public static /* synthetic */ OrderPaymentStatusDTO copy$default(OrderPaymentStatusDTO orderPaymentStatusDTO, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, DateTime dateTime, Integer num, CommonControlSettings commonControlSettings, List list, IconButtonV3DTO iconButtonV3DTO, WidgetPaddings widgetPaddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = orderPaymentStatusDTO.title;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = orderPaymentStatusDTO.price;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = orderPaymentStatusDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            dateTime = orderPaymentStatusDTO.endTime;
        }
        if ((i11 & 16) != 0) {
            num = orderPaymentStatusDTO.timeLeft;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = orderPaymentStatusDTO.common;
        }
        if ((i11 & 64) != 0) {
            list = orderPaymentStatusDTO.buttons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO = orderPaymentStatusDTO.infoButton;
        }
        if ((i11 & 256) != 0) {
            widgetPaddings = orderPaymentStatusDTO.paddings;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        WidgetPaddings widgetPaddings2 = widgetPaddings;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        List list2 = list;
        Integer num2 = num;
        TextDTO textDTO3 = textDTO2;
        return orderPaymentStatusDTO.copy(textDTO, badgeDTO, textDTO3, dateTime, num2, commonControlSettings2, list2, iconButtonV3DTO2, widgetPaddings2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final DateTime getEndTime() {
        return this.endTime;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final List<ButtonV3DTO> component7() {
        return this.buttons;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    /* renamed from: component9, reason: from getter */
    public final WidgetPaddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final OrderPaymentStatusDTO copy(@NotNull TextDTO title, BadgeDTO price, TextDTO subtitle, DateTime endTime, Integer timeLeft, CommonControlSettings common, @NotNull List<ButtonV3DTO> buttons, IconButtonV3DTO infoButton, WidgetPaddings paddings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new OrderPaymentStatusDTO(title, price, subtitle, endTime, timeLeft, common, buttons, infoButton, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPaymentStatusDTO)) {
            return false;
        }
        OrderPaymentStatusDTO orderPaymentStatusDTO = (OrderPaymentStatusDTO) other;
        return Intrinsics.d(this.title, orderPaymentStatusDTO.title) && Intrinsics.d(this.price, orderPaymentStatusDTO.price) && Intrinsics.d(this.subtitle, orderPaymentStatusDTO.subtitle) && Intrinsics.d(this.endTime, orderPaymentStatusDTO.endTime) && Intrinsics.d(this.timeLeft, orderPaymentStatusDTO.timeLeft) && Intrinsics.d(this.common, orderPaymentStatusDTO.common) && Intrinsics.d(this.buttons, orderPaymentStatusDTO.buttons) && Intrinsics.d(this.infoButton, orderPaymentStatusDTO.infoButton) && Intrinsics.d(this.paddings, orderPaymentStatusDTO.paddings);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final DateTime getEndTime() {
        return this.endTime;
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

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BadgeDTO badgeDTO = this.price;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        DateTime dateTime = this.endTime;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.timeLeft;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int b11 = g.b((hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.buttons);
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        int hashCode6 = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        WidgetPaddings widgetPaddings = this.paddings;
        return hashCode6 + (widgetPaddings != null ? widgetPaddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderPaymentStatusDTO(title=" + this.title + ", price=" + this.price + ", subtitle=" + this.subtitle + ", endTime=" + this.endTime + ", timeLeft=" + this.timeLeft + ", common=" + this.common + ", buttons=" + this.buttons + ", infoButton=" + this.infoButton + ", paddings=" + this.paddings + ")";
    }

    public OrderPaymentStatusDTO(TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, DateTime dateTime, Integer num, CommonControlSettings commonControlSettings, List list, IconButtonV3DTO iconButtonV3DTO, WidgetPaddings widgetPaddings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, badgeDTO, textDTO2, dateTime, num, commonControlSettings, (i11 & 64) != 0 ? K.f71697a : list, iconButtonV3DTO, widgetPaddings);
    }
}

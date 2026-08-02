package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import Bl.C2639a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jt\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00064"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "timeLeft", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonAction", "scrollWidgetId", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "shipmentHorizontalPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;Lru/ozon/app/android/cscore/padding/HorizontalPadding;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommonAction", "getScrollWidgetId", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getShipmentHorizontalPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;Lru/ozon/app/android/cscore/padding/HorizontalPadding;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;", "equals", "", "other", "hashCode", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TextIconDTO {
    public static final int $stable = HorizontalPadding.$stable | IconDTO.$stable;
    private final BadgeDTO badge;
    private final CommonControlSettings common;
    private final transient CommonControlSettings commonAction;

    @NotNull
    private final HorizontalPadding horizontalPadding;
    private final IconDTO icon;
    private final Integer scrollWidgetId;

    @NotNull
    private final HorizontalPadding shipmentHorizontalPadding;

    @NotNull
    private final TextDTO text;
    private final Integer timeLeft;

    public TextIconDTO(@NotNull TextDTO text, IconDTO iconDTO, BadgeDTO badgeDTO, Integer num, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, Integer num2, @NotNull HorizontalPadding horizontalPadding, @NotNull HorizontalPadding shipmentHorizontalPadding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(shipmentHorizontalPadding, "shipmentHorizontalPadding");
        this.text = text;
        this.icon = iconDTO;
        this.badge = badgeDTO;
        this.timeLeft = num;
        this.common = commonControlSettings;
        this.commonAction = commonControlSettings2;
        this.scrollWidgetId = num2;
        this.horizontalPadding = horizontalPadding;
        this.shipmentHorizontalPadding = shipmentHorizontalPadding;
    }

    public static /* synthetic */ TextIconDTO copy$default(TextIconDTO textIconDTO, TextDTO textDTO, IconDTO iconDTO, BadgeDTO badgeDTO, Integer num, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, Integer num2, HorizontalPadding horizontalPadding, HorizontalPadding horizontalPadding2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = textIconDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconDTO = textIconDTO.icon;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = textIconDTO.badge;
        }
        if ((i11 & 8) != 0) {
            num = textIconDTO.timeLeft;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = textIconDTO.common;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings2 = textIconDTO.commonAction;
        }
        if ((i11 & 64) != 0) {
            num2 = textIconDTO.scrollWidgetId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            horizontalPadding = textIconDTO.horizontalPadding;
        }
        if ((i11 & 256) != 0) {
            horizontalPadding2 = textIconDTO.shipmentHorizontalPadding;
        }
        HorizontalPadding horizontalPadding3 = horizontalPadding;
        HorizontalPadding horizontalPadding4 = horizontalPadding2;
        CommonControlSettings commonControlSettings3 = commonControlSettings2;
        Integer num3 = num2;
        CommonControlSettings commonControlSettings4 = commonControlSettings;
        BadgeDTO badgeDTO2 = badgeDTO;
        return textIconDTO.copy(textDTO, iconDTO, badgeDTO2, num, commonControlSettings4, commonControlSettings3, num3, horizontalPadding3, horizontalPadding4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommonAction() {
        return this.commonAction;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getScrollWidgetId() {
        return this.scrollWidgetId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final HorizontalPadding getShipmentHorizontalPadding() {
        return this.shipmentHorizontalPadding;
    }

    @NotNull
    public final TextIconDTO copy(@NotNull TextDTO text, IconDTO icon, BadgeDTO badge, Integer timeLeft, CommonControlSettings common, CommonControlSettings commonAction, Integer scrollWidgetId, @NotNull HorizontalPadding horizontalPadding, @NotNull HorizontalPadding shipmentHorizontalPadding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(shipmentHorizontalPadding, "shipmentHorizontalPadding");
        return new TextIconDTO(text, icon, badge, timeLeft, common, commonAction, scrollWidgetId, horizontalPadding, shipmentHorizontalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIconDTO)) {
            return false;
        }
        TextIconDTO textIconDTO = (TextIconDTO) other;
        return Intrinsics.d(this.text, textIconDTO.text) && Intrinsics.d(this.icon, textIconDTO.icon) && Intrinsics.d(this.badge, textIconDTO.badge) && Intrinsics.d(this.timeLeft, textIconDTO.timeLeft) && Intrinsics.d(this.common, textIconDTO.common) && Intrinsics.d(this.commonAction, textIconDTO.commonAction) && Intrinsics.d(this.scrollWidgetId, textIconDTO.scrollWidgetId) && Intrinsics.d(this.horizontalPadding, textIconDTO.horizontalPadding) && Intrinsics.d(this.shipmentHorizontalPadding, textIconDTO.shipmentHorizontalPadding);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final CommonControlSettings getCommonAction() {
        return this.commonAction;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Integer getScrollWidgetId() {
        return this.scrollWidgetId;
    }

    @NotNull
    public final HorizontalPadding getShipmentHorizontalPadding() {
        return this.shipmentHorizontalPadding;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        IconDTO iconDTO = this.icon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Integer num = this.timeLeft;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.commonAction;
        int hashCode6 = (hashCode5 + (commonControlSettings2 == null ? 0 : commonControlSettings2.hashCode())) * 31;
        Integer num2 = this.scrollWidgetId;
        return this.shipmentHorizontalPadding.hashCode() + ((this.horizontalPadding.hashCode() + ((hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        BadgeDTO badgeDTO = this.badge;
        Integer num = this.timeLeft;
        CommonControlSettings commonControlSettings = this.common;
        CommonControlSettings commonControlSettings2 = this.commonAction;
        Integer num2 = this.scrollWidgetId;
        HorizontalPadding horizontalPadding = this.horizontalPadding;
        HorizontalPadding horizontalPadding2 = this.shipmentHorizontalPadding;
        StringBuilder d11 = C2639a.d("TextIconDTO(text=", ", icon=", ", badge=", iconDTO, textDTO);
        d11.append(badgeDTO);
        d11.append(", timeLeft=");
        d11.append(num);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(", commonAction=");
        d11.append(commonControlSettings2);
        d11.append(", scrollWidgetId=");
        d11.append(num2);
        d11.append(", horizontalPadding=");
        d11.append(horizontalPadding);
        d11.append(", shipmentHorizontalPadding=");
        d11.append(horizontalPadding2);
        d11.append(")");
        return d11.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextIconDTO(TextDTO textDTO, IconDTO iconDTO, BadgeDTO badgeDTO, Integer num, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, Integer num2, HorizontalPadding horizontalPadding, HorizontalPadding horizontalPadding2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, iconDTO, badgeDTO, num, commonControlSettings, commonControlSettings2, num2, horizontalPadding, (i11 & 256) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding2);
        commonControlSettings2 = (i11 & 32) != 0 ? null : commonControlSettings2;
        num2 = (i11 & 64) != 0 ? null : num2;
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            Paddings paddings = Paddings.NONE;
            horizontalPadding = new HorizontalPadding(paddings, paddings);
        }
    }
}

package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.viewItem;

import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b9\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lorg/joda/time/DateTime;", "timeLeft", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "commonAction", "", "scrollWidgetKey", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "shipmentHorizontalPadding", "horizontalPadding", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;LWZ/t;Lru/ozon/app/android/cscore/padding/HorizontalPadding;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lorg/joda/time/DateTime;", "getTimeLeft", "()Lorg/joda/time/DateTime;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommonAction", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getShipmentHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getHorizontalPadding", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TextIconVO implements c {
    private final BadgeDTO badge;
    private final CommonControlSettings common;
    private final CommonControlSettings commonAction;

    @NotNull
    private final HorizontalPadding horizontalPadding;
    private final long id;
    private final Integer scrollWidgetKey;

    @NotNull
    private final HorizontalPadding shipmentHorizontalPadding;

    @NotNull
    private final TextDTO text;
    private final DateTime timeLeft;
    private final t tokenizedEvent;

    public TextIconVO(long j11, @NotNull TextDTO text, BadgeDTO badgeDTO, DateTime dateTime, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, Integer num, t tVar, @NotNull HorizontalPadding shipmentHorizontalPadding, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(shipmentHorizontalPadding, "shipmentHorizontalPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.id = j11;
        this.text = text;
        this.badge = badgeDTO;
        this.timeLeft = dateTime;
        this.common = commonControlSettings;
        this.commonAction = commonControlSettings2;
        this.scrollWidgetKey = num;
        this.tokenizedEvent = tVar;
        this.shipmentHorizontalPadding = shipmentHorizontalPadding;
        this.horizontalPadding = horizontalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIconVO)) {
            return false;
        }
        TextIconVO textIconVO = (TextIconVO) other;
        return this.id == textIconVO.id && Intrinsics.d(this.text, textIconVO.text) && Intrinsics.d(this.badge, textIconVO.badge) && Intrinsics.d(this.timeLeft, textIconVO.timeLeft) && Intrinsics.d(this.common, textIconVO.common) && Intrinsics.d(this.commonAction, textIconVO.commonAction) && Intrinsics.d(this.scrollWidgetKey, textIconVO.scrollWidgetKey) && Intrinsics.d(this.tokenizedEvent, textIconVO.tokenizedEvent) && Intrinsics.d(this.shipmentHorizontalPadding, textIconVO.shipmentHorizontalPadding) && Intrinsics.d(this.horizontalPadding, textIconVO.horizontalPadding);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @NotNull
    public final HorizontalPadding getShipmentHorizontalPadding() {
        return this.shipmentHorizontalPadding;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final DateTime getTimeLeft() {
        return this.timeLeft;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.text, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        DateTime dateTime = this.timeLeft;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.commonAction;
        int hashCode4 = (hashCode3 + (commonControlSettings2 == null ? 0 : commonControlSettings2.hashCode())) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.horizontalPadding.hashCode() + ((this.shipmentHorizontalPadding.hashCode() + ((hashCode5 + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        BadgeDTO badgeDTO = this.badge;
        DateTime dateTime = this.timeLeft;
        CommonControlSettings commonControlSettings = this.common;
        CommonControlSettings commonControlSettings2 = this.commonAction;
        Integer num = this.scrollWidgetKey;
        t tVar = this.tokenizedEvent;
        HorizontalPadding horizontalPadding = this.shipmentHorizontalPadding;
        HorizontalPadding horizontalPadding2 = this.horizontalPadding;
        StringBuilder b11 = a.b("TextIconVO(id=", j11, ", text=", textDTO);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", timeLeft=");
        b11.append(dateTime);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(", commonAction=");
        b11.append(commonControlSettings2);
        b11.append(", scrollWidgetKey=");
        b11.append(num);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", shipmentHorizontalPadding=");
        b11.append(horizontalPadding);
        b11.append(", horizontalPadding=");
        b11.append(horizontalPadding2);
        b11.append(")");
        return b11.toString();
    }
}

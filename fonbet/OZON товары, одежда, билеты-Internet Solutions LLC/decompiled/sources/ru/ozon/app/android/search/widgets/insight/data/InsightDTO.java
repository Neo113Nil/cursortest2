package ru.ozon.app.android.search.widgets.insight.data;

import B90.C2618u;
import Ef0.c;
import J0.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u00011Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jx\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;", "", "backgroundColor", "", "borderRadius", "", "marginTop", "marginBottom", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "deleteErrorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginTop", "getMarginBottom", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getFooter", "()Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "getDeleteErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;)Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;", "equals", "", "other", "hashCode", "toString", "FooterDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InsightDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Integer borderRadius;

    @NotNull
    private final NotificationDTO deleteErrorNotification;
    private final FooterDTO footer;
    private final CellDTO header;
    private final Integer marginBottom;
    private final Integer marginTop;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public InsightDTO(String str, Integer num, Integer num2, Integer num3, CellDTO cellDTO, FooterDTO footerDTO, @NotNull NotificationDTO deleteErrorNotification, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(deleteErrorNotification, "deleteErrorNotification");
        this.backgroundColor = str;
        this.borderRadius = num;
        this.marginTop = num2;
        this.marginBottom = num3;
        this.header = cellDTO;
        this.footer = footerDTO;
        this.deleteErrorNotification = deleteErrorNotification;
        this.trackingInfo = map;
    }

    public static /* synthetic */ InsightDTO copy$default(InsightDTO insightDTO, String str, Integer num, Integer num2, Integer num3, CellDTO cellDTO, FooterDTO footerDTO, NotificationDTO notificationDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = insightDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            num = insightDTO.borderRadius;
        }
        if ((i11 & 4) != 0) {
            num2 = insightDTO.marginTop;
        }
        if ((i11 & 8) != 0) {
            num3 = insightDTO.marginBottom;
        }
        if ((i11 & 16) != 0) {
            cellDTO = insightDTO.header;
        }
        if ((i11 & 32) != 0) {
            footerDTO = insightDTO.footer;
        }
        if ((i11 & 64) != 0) {
            notificationDTO = insightDTO.deleteErrorNotification;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = insightDTO.trackingInfo;
        }
        NotificationDTO notificationDTO2 = notificationDTO;
        Map map2 = map;
        CellDTO cellDTO2 = cellDTO;
        FooterDTO footerDTO2 = footerDTO;
        return insightDTO.copy(str, num, num2, num3, cellDTO2, footerDTO2, notificationDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMarginTop() {
        return this.marginTop;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    /* renamed from: component5, reason: from getter */
    public final CellDTO getHeader() {
        return this.header;
    }

    /* renamed from: component6, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final NotificationDTO getDeleteErrorNotification() {
        return this.deleteErrorNotification;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final InsightDTO copy(String backgroundColor, Integer borderRadius, Integer marginTop, Integer marginBottom, CellDTO header, FooterDTO footer, @NotNull NotificationDTO deleteErrorNotification, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(deleteErrorNotification, "deleteErrorNotification");
        return new InsightDTO(backgroundColor, borderRadius, marginTop, marginBottom, header, footer, deleteErrorNotification, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightDTO)) {
            return false;
        }
        InsightDTO insightDTO = (InsightDTO) other;
        return Intrinsics.d(this.backgroundColor, insightDTO.backgroundColor) && Intrinsics.d(this.borderRadius, insightDTO.borderRadius) && Intrinsics.d(this.marginTop, insightDTO.marginTop) && Intrinsics.d(this.marginBottom, insightDTO.marginBottom) && Intrinsics.d(this.header, insightDTO.header) && Intrinsics.d(this.footer, insightDTO.footer) && Intrinsics.d(this.deleteErrorNotification, insightDTO.deleteErrorNotification) && Intrinsics.d(this.trackingInfo, insightDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getBorderRadius() {
        return this.borderRadius;
    }

    @NotNull
    public final NotificationDTO getDeleteErrorNotification() {
        return this.deleteErrorNotification;
    }

    public final FooterDTO getFooter() {
        return this.footer;
    }

    public final CellDTO getHeader() {
        return this.header;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.borderRadius;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.marginTop;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marginBottom;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CellDTO cellDTO = this.header;
        int hashCode5 = (hashCode4 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        FooterDTO footerDTO = this.footer;
        int hashCode6 = (this.deleteErrorNotification.hashCode() + ((hashCode5 + (footerDTO == null ? 0 : footerDTO.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        Integer num = this.borderRadius;
        Integer num2 = this.marginTop;
        Integer num3 = this.marginBottom;
        CellDTO cellDTO = this.header;
        FooterDTO footerDTO = this.footer;
        NotificationDTO notificationDTO = this.deleteErrorNotification;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = P.b("InsightDTO(backgroundColor=", str, num, ", borderRadius=", ", marginTop=");
        c.e(b11, num2, ", marginBottom=", num3, ", header=");
        b11.append(cellDTO);
        b11.append(", footer=");
        b11.append(footerDTO);
        b11.append(", deleteErrorNotification=");
        b11.append(notificationDTO);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JP\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "", "paddingTop", "", "paddingRight", "paddingBottom", "paddingLeft", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getPaddingTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaddingRight", "getPaddingBottom", "getPaddingLeft", "getBadges", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "equals", "", "other", "hashCode", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterDTO {
        public static final int $stable = 8;
        private final List<BadgeDTO> badges;
        private final Integer paddingBottom;
        private final Integer paddingLeft;
        private final Integer paddingRight;
        private final Integer paddingTop;

        public FooterDTO(Integer num, Integer num2, Integer num3, Integer num4, List<BadgeDTO> list) {
            this.paddingTop = num;
            this.paddingRight = num2;
            this.paddingBottom = num3;
            this.paddingLeft = num4;
            this.badges = list;
        }

        public static /* synthetic */ FooterDTO copy$default(FooterDTO footerDTO, Integer num, Integer num2, Integer num3, Integer num4, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = footerDTO.paddingTop;
            }
            if ((i11 & 2) != 0) {
                num2 = footerDTO.paddingRight;
            }
            if ((i11 & 4) != 0) {
                num3 = footerDTO.paddingBottom;
            }
            if ((i11 & 8) != 0) {
                num4 = footerDTO.paddingLeft;
            }
            if ((i11 & 16) != 0) {
                list = footerDTO.badges;
            }
            List list2 = list;
            Integer num5 = num3;
            return footerDTO.copy(num, num2, num5, num4, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getPaddingTop() {
            return this.paddingTop;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getPaddingRight() {
            return this.paddingRight;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPaddingBottom() {
            return this.paddingBottom;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPaddingLeft() {
            return this.paddingLeft;
        }

        public final List<BadgeDTO> component5() {
            return this.badges;
        }

        @NotNull
        public final FooterDTO copy(Integer paddingTop, Integer paddingRight, Integer paddingBottom, Integer paddingLeft, List<BadgeDTO> badges) {
            return new FooterDTO(paddingTop, paddingRight, paddingBottom, paddingLeft, badges);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDTO)) {
                return false;
            }
            FooterDTO footerDTO = (FooterDTO) other;
            return Intrinsics.d(this.paddingTop, footerDTO.paddingTop) && Intrinsics.d(this.paddingRight, footerDTO.paddingRight) && Intrinsics.d(this.paddingBottom, footerDTO.paddingBottom) && Intrinsics.d(this.paddingLeft, footerDTO.paddingLeft) && Intrinsics.d(this.badges, footerDTO.badges);
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final Integer getPaddingBottom() {
            return this.paddingBottom;
        }

        public final Integer getPaddingLeft() {
            return this.paddingLeft;
        }

        public final Integer getPaddingRight() {
            return this.paddingRight;
        }

        public final Integer getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            Integer num = this.paddingTop;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.paddingRight;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.paddingBottom;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.paddingLeft;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.paddingTop;
            Integer num2 = this.paddingRight;
            Integer num3 = this.paddingBottom;
            Integer num4 = this.paddingLeft;
            List<BadgeDTO> list = this.badges;
            StringBuilder f7 = Kk.c.f("FooterDTO(paddingTop=", ", paddingRight=", num, num2, ", paddingBottom=");
            c.e(f7, num3, ", paddingLeft=", num4, ", badges=");
            return C2618u.h(f7, list, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ FooterDTO(Integer num, Integer num2, Integer num3, Integer num4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, num3, r6, r7);
            List list2;
            Integer num5;
            num = (i11 & 1) != 0 ? 0 : num;
            num2 = (i11 & 2) != 0 ? 0 : num2;
            num3 = (i11 & 4) != 0 ? 0 : num3;
            if ((i11 & 8) != 0) {
                list2 = list;
                num5 = 0;
            } else {
                list2 = list;
                num5 = num4;
            }
        }
    }
}

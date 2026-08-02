package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.data;

import D3.g;
import Sc.InterfaceC3999a;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;", "endTime", "Lorg/joda/time/DateTime;", "timeLeft", "", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;", "getEndTime$annotations", "()V", "getEndTime", "()Lorg/joda/time/DateTime;", "getTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO;", "equals", "", "other", "hashCode", "toString", "CustomBadge", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsCheckoutTitleDTO {
    private final String backgroundColor;
    private final CustomBadge badge;
    private final CommonControlSettings common;
    private final DateTime endTime;
    private final Integer timeLeft;

    @NotNull
    private final TextDTO title;

    public HotelsCheckoutTitleDTO(@NotNull TextDTO title, CustomBadge customBadge, DateTime dateTime, Integer num, String str, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.badge = customBadge;
        this.endTime = dateTime;
        this.timeLeft = num;
        this.backgroundColor = str;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ HotelsCheckoutTitleDTO copy$default(HotelsCheckoutTitleDTO hotelsCheckoutTitleDTO, TextDTO textDTO, CustomBadge customBadge, DateTime dateTime, Integer num, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsCheckoutTitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            customBadge = hotelsCheckoutTitleDTO.badge;
        }
        if ((i11 & 4) != 0) {
            dateTime = hotelsCheckoutTitleDTO.endTime;
        }
        if ((i11 & 8) != 0) {
            num = hotelsCheckoutTitleDTO.timeLeft;
        }
        if ((i11 & 16) != 0) {
            str = hotelsCheckoutTitleDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = hotelsCheckoutTitleDTO.common;
        }
        String str2 = str;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return hotelsCheckoutTitleDTO.copy(textDTO, customBadge, dateTime, num, str2, commonControlSettings2);
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
    public final CustomBadge getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final DateTime getEndTime() {
        return this.endTime;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HotelsCheckoutTitleDTO copy(@NotNull TextDTO title, CustomBadge badge, DateTime endTime, Integer timeLeft, String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HotelsCheckoutTitleDTO(title, badge, endTime, timeLeft, backgroundColor, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsCheckoutTitleDTO)) {
            return false;
        }
        HotelsCheckoutTitleDTO hotelsCheckoutTitleDTO = (HotelsCheckoutTitleDTO) other;
        return Intrinsics.d(this.title, hotelsCheckoutTitleDTO.title) && Intrinsics.d(this.badge, hotelsCheckoutTitleDTO.badge) && Intrinsics.d(this.endTime, hotelsCheckoutTitleDTO.endTime) && Intrinsics.d(this.timeLeft, hotelsCheckoutTitleDTO.timeLeft) && Intrinsics.d(this.backgroundColor, hotelsCheckoutTitleDTO.backgroundColor) && Intrinsics.d(this.common, hotelsCheckoutTitleDTO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CustomBadge getBadge() {
        return this.badge;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final DateTime getEndTime() {
        return this.endTime;
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
        CustomBadge customBadge = this.badge;
        int hashCode2 = (hashCode + (customBadge == null ? 0 : customBadge.hashCode())) * 31;
        DateTime dateTime = this.endTime;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.timeLeft;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HotelsCheckoutTitleDTO(title=" + this.title + ", badge=" + this.badge + ", endTime=" + this.endTime + ", timeLeft=" + this.timeLeft + ", backgroundColor=" + this.backgroundColor + ", common=" + this.common + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomBadge {
        private final String backgroundColor;
        private final CommonControlSettings common;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final TextDTO title;

        public CustomBadge(@NotNull TextDTO title, String str, @NotNull CornerRadius cornerRadius, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.title = title;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ CustomBadge copy$default(CustomBadge customBadge, TextDTO textDTO, String str, CornerRadius cornerRadius, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = customBadge.title;
            }
            if ((i11 & 2) != 0) {
                str = customBadge.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                cornerRadius = customBadge.cornerRadius;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = customBadge.common;
            }
            return customBadge.copy(textDTO, str, cornerRadius, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final CustomBadge copy(@NotNull TextDTO title, String backgroundColor, @NotNull CornerRadius cornerRadius, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new CustomBadge(title, backgroundColor, cornerRadius, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomBadge)) {
                return false;
            }
            CustomBadge customBadge = (CustomBadge) other;
            return Intrinsics.d(this.title, customBadge.title) && Intrinsics.d(this.backgroundColor, customBadge.backgroundColor) && this.cornerRadius == customBadge.cornerRadius && Intrinsics.d(this.common, customBadge.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.backgroundColor;
            int b11 = b.b(this.cornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            CommonControlSettings commonControlSettings = this.common;
            return b11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder f7 = g.f("CustomBadge(title=", textDTO, ", backgroundColor=", str, ", cornerRadius=");
            f7.append(cornerRadius);
            f7.append(", common=");
            f7.append(commonControlSettings);
            f7.append(")");
            return f7.toString();
        }

        public /* synthetic */ CustomBadge(TextDTO textDTO, String str, CornerRadius cornerRadius, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, str, (i11 & 4) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, commonControlSettings);
        }
    }
}

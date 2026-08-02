package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data;

import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;", "", "startDateField", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;", "returnDateField", "backgroundColor", "", "bottomRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "getStartDateField", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;", "getReturnDateField", "getBackgroundColor", "()Ljava/lang/String;", "getBottomRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FieldDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceCalendarHeaderV3DTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @EnumNullFallback
    @NotNull
    private final CornerRadius bottomRadius;

    @NotNull
    private final FieldDTO returnDateField;

    @NotNull
    private final FieldDTO startDateField;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "resetIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getResetIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldDTO {
        public static final int $stable = AspectDTO.$stable | IconButtonV3DTO.$stable;

        @NotNull
        private final AspectDTO aspect;
        private final IconButtonV3DTO resetIcon;

        @NotNull
        private final TextDTO title;

        public FieldDTO(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, @NotNull AspectDTO aspect) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.title = title;
            this.resetIcon = iconButtonV3DTO;
            this.aspect = aspect;
        }

        public static /* synthetic */ FieldDTO copy$default(FieldDTO fieldDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, AspectDTO aspectDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = fieldDTO.title;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = fieldDTO.resetIcon;
            }
            if ((i11 & 4) != 0) {
                aspectDTO = fieldDTO.aspect;
            }
            return fieldDTO.copy(textDTO, iconButtonV3DTO, aspectDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getResetIcon() {
            return this.resetIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final FieldDTO copy(@NotNull TextDTO title, IconButtonV3DTO resetIcon, @NotNull AspectDTO aspect) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            return new FieldDTO(title, resetIcon, aspect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldDTO)) {
                return false;
            }
            FieldDTO fieldDTO = (FieldDTO) other;
            return Intrinsics.d(this.title, fieldDTO.title) && Intrinsics.d(this.resetIcon, fieldDTO.resetIcon) && Intrinsics.d(this.aspect, fieldDTO.aspect);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final IconButtonV3DTO getResetIcon() {
            return this.resetIcon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.resetIcon;
            return this.aspect.hashCode() + ((hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "FieldDTO(title=" + this.title + ", resetIcon=" + this.resetIcon + ", aspect=" + this.aspect + ")";
        }
    }

    public PriceCalendarHeaderV3DTO(@NotNull FieldDTO startDateField, @NotNull FieldDTO returnDateField, String str, @NotNull CornerRadius bottomRadius, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(startDateField, "startDateField");
        Intrinsics.checkNotNullParameter(returnDateField, "returnDateField");
        Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
        this.startDateField = startDateField;
        this.returnDateField = returnDateField;
        this.backgroundColor = str;
        this.bottomRadius = bottomRadius;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PriceCalendarHeaderV3DTO copy$default(PriceCalendarHeaderV3DTO priceCalendarHeaderV3DTO, FieldDTO fieldDTO, FieldDTO fieldDTO2, String str, CornerRadius cornerRadius, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fieldDTO = priceCalendarHeaderV3DTO.startDateField;
        }
        if ((i11 & 2) != 0) {
            fieldDTO2 = priceCalendarHeaderV3DTO.returnDateField;
        }
        if ((i11 & 4) != 0) {
            str = priceCalendarHeaderV3DTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            cornerRadius = priceCalendarHeaderV3DTO.bottomRadius;
        }
        if ((i11 & 16) != 0) {
            map = priceCalendarHeaderV3DTO.trackingInfo;
        }
        Map map2 = map;
        String str2 = str;
        return priceCalendarHeaderV3DTO.copy(fieldDTO, fieldDTO2, str2, cornerRadius, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FieldDTO getStartDateField() {
        return this.startDateField;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FieldDTO getReturnDateField() {
        return this.returnDateField;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CornerRadius getBottomRadius() {
        return this.bottomRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final PriceCalendarHeaderV3DTO copy(@NotNull FieldDTO startDateField, @NotNull FieldDTO returnDateField, String backgroundColor, @NotNull CornerRadius bottomRadius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(startDateField, "startDateField");
        Intrinsics.checkNotNullParameter(returnDateField, "returnDateField");
        Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
        return new PriceCalendarHeaderV3DTO(startDateField, returnDateField, backgroundColor, bottomRadius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCalendarHeaderV3DTO)) {
            return false;
        }
        PriceCalendarHeaderV3DTO priceCalendarHeaderV3DTO = (PriceCalendarHeaderV3DTO) other;
        return Intrinsics.d(this.startDateField, priceCalendarHeaderV3DTO.startDateField) && Intrinsics.d(this.returnDateField, priceCalendarHeaderV3DTO.returnDateField) && Intrinsics.d(this.backgroundColor, priceCalendarHeaderV3DTO.backgroundColor) && this.bottomRadius == priceCalendarHeaderV3DTO.bottomRadius && Intrinsics.d(this.trackingInfo, priceCalendarHeaderV3DTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getBottomRadius() {
        return this.bottomRadius;
    }

    @NotNull
    public final FieldDTO getReturnDateField() {
        return this.returnDateField;
    }

    @NotNull
    public final FieldDTO getStartDateField() {
        return this.startDateField;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.returnDateField.hashCode() + (this.startDateField.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int b11 = b.b(this.bottomRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        FieldDTO fieldDTO = this.startDateField;
        FieldDTO fieldDTO2 = this.returnDateField;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.bottomRadius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PriceCalendarHeaderV3DTO(startDateField=");
        sb2.append(fieldDTO);
        sb2.append(", returnDateField=");
        sb2.append(fieldDTO2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", bottomRadius=");
        sb2.append(cornerRadius);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ PriceCalendarHeaderV3DTO(FieldDTO fieldDTO, FieldDTO fieldDTO2, String str, CornerRadius cornerRadius, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldDTO, fieldDTO2, str, (i11 & 8) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, map);
    }
}

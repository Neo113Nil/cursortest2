package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data;

import Bl.C2639a;
import D3.g;
import D40.d;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subtitle", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "dateTimeInfo", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getDateTimeInfo", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DateTimeInfo", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelOrderNavContentDTO {
    public static final int $stable;
    private final CommonControlSettings common;
    private final DateTimeInfo dateTimeInfo;
    private final IconDTO icon;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "", "fromTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "fromSubtitle", "toTitle", "toSubtitle", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getFromTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFromSubtitle", "getToTitle", "getToSubtitle", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTimeInfo {
        public static final int $stable = IconDTO.$stable | AspectDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final TextDTO fromSubtitle;

        @NotNull
        private final TextDTO fromTitle;
        private final IconDTO icon;

        @NotNull
        private final TextDTO toSubtitle;

        @NotNull
        private final TextDTO toTitle;

        public DateTimeInfo(@NotNull TextDTO fromTitle, @NotNull TextDTO fromSubtitle, @NotNull TextDTO toTitle, @NotNull TextDTO toSubtitle, @NotNull AspectDTO aspect, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(fromTitle, "fromTitle");
            Intrinsics.checkNotNullParameter(fromSubtitle, "fromSubtitle");
            Intrinsics.checkNotNullParameter(toTitle, "toTitle");
            Intrinsics.checkNotNullParameter(toSubtitle, "toSubtitle");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.fromTitle = fromTitle;
            this.fromSubtitle = fromSubtitle;
            this.toTitle = toTitle;
            this.toSubtitle = toSubtitle;
            this.aspect = aspect;
            this.icon = iconDTO;
        }

        public static /* synthetic */ DateTimeInfo copy$default(DateTimeInfo dateTimeInfo, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, AspectDTO aspectDTO, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = dateTimeInfo.fromTitle;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = dateTimeInfo.fromSubtitle;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = dateTimeInfo.toTitle;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = dateTimeInfo.toSubtitle;
            }
            if ((i11 & 16) != 0) {
                aspectDTO = dateTimeInfo.aspect;
            }
            if ((i11 & 32) != 0) {
                iconDTO = dateTimeInfo.icon;
            }
            AspectDTO aspectDTO2 = aspectDTO;
            IconDTO iconDTO2 = iconDTO;
            return dateTimeInfo.copy(textDTO, textDTO2, textDTO3, textDTO4, aspectDTO2, iconDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getFromTitle() {
            return this.fromTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getFromSubtitle() {
            return this.fromSubtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getToTitle() {
            return this.toTitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getToSubtitle() {
            return this.toSubtitle;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        /* renamed from: component6, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final DateTimeInfo copy(@NotNull TextDTO fromTitle, @NotNull TextDTO fromSubtitle, @NotNull TextDTO toTitle, @NotNull TextDTO toSubtitle, @NotNull AspectDTO aspect, IconDTO icon) {
            Intrinsics.checkNotNullParameter(fromTitle, "fromTitle");
            Intrinsics.checkNotNullParameter(fromSubtitle, "fromSubtitle");
            Intrinsics.checkNotNullParameter(toTitle, "toTitle");
            Intrinsics.checkNotNullParameter(toSubtitle, "toSubtitle");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            return new DateTimeInfo(fromTitle, fromSubtitle, toTitle, toSubtitle, aspect, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeInfo)) {
                return false;
            }
            DateTimeInfo dateTimeInfo = (DateTimeInfo) other;
            return Intrinsics.d(this.fromTitle, dateTimeInfo.fromTitle) && Intrinsics.d(this.fromSubtitle, dateTimeInfo.fromSubtitle) && Intrinsics.d(this.toTitle, dateTimeInfo.toTitle) && Intrinsics.d(this.toSubtitle, dateTimeInfo.toSubtitle) && Intrinsics.d(this.aspect, dateTimeInfo.aspect) && Intrinsics.d(this.icon, dateTimeInfo.icon);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final TextDTO getFromSubtitle() {
            return this.fromSubtitle;
        }

        @NotNull
        public final TextDTO getFromTitle() {
            return this.fromTitle;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getToSubtitle() {
            return this.toSubtitle;
        }

        @NotNull
        public final TextDTO getToTitle() {
            return this.toTitle;
        }

        public int hashCode() {
            int hashCode = (this.aspect.hashCode() + b.a(this.toSubtitle, b.a(this.toTitle, b.a(this.fromSubtitle, this.fromTitle.hashCode() * 31, 31), 31), 31)) * 31;
            IconDTO iconDTO = this.icon;
            return hashCode + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.fromTitle;
            TextDTO textDTO2 = this.fromSubtitle;
            TextDTO textDTO3 = this.toTitle;
            TextDTO textDTO4 = this.toSubtitle;
            AspectDTO aspectDTO = this.aspect;
            IconDTO iconDTO = this.icon;
            StringBuilder g10 = g.g("DateTimeInfo(fromTitle=", textDTO, ", fromSubtitle=", textDTO2, ", toTitle=");
            d.e(", toSubtitle=", ", aspect=", g10, textDTO3, textDTO4);
            g10.append(aspectDTO);
            g10.append(", icon=");
            g10.append(iconDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    static {
        int i11 = IconDTO.$stable;
        $stable = i11 | AspectDTO.$stable | i11;
    }

    public TravelOrderNavContentDTO(@NotNull TextDTO title, IconDTO iconDTO, @NotNull TextDTO subtitle, CommonControlSettings commonControlSettings, DateTimeInfo dateTimeInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.icon = iconDTO;
        this.subtitle = subtitle;
        this.common = commonControlSettings;
        this.dateTimeInfo = dateTimeInfo;
    }

    public static /* synthetic */ TravelOrderNavContentDTO copy$default(TravelOrderNavContentDTO travelOrderNavContentDTO, TextDTO textDTO, IconDTO iconDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, DateTimeInfo dateTimeInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelOrderNavContentDTO.title;
        }
        if ((i11 & 2) != 0) {
            iconDTO = travelOrderNavContentDTO.icon;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = travelOrderNavContentDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = travelOrderNavContentDTO.common;
        }
        if ((i11 & 16) != 0) {
            dateTimeInfo = travelOrderNavContentDTO.dateTimeInfo;
        }
        DateTimeInfo dateTimeInfo2 = dateTimeInfo;
        TextDTO textDTO3 = textDTO2;
        return travelOrderNavContentDTO.copy(textDTO, iconDTO, textDTO3, commonControlSettings, dateTimeInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component5, reason: from getter */
    public final DateTimeInfo getDateTimeInfo() {
        return this.dateTimeInfo;
    }

    @NotNull
    public final TravelOrderNavContentDTO copy(@NotNull TextDTO title, IconDTO icon, @NotNull TextDTO subtitle, CommonControlSettings common, DateTimeInfo dateTimeInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new TravelOrderNavContentDTO(title, icon, subtitle, common, dateTimeInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderNavContentDTO)) {
            return false;
        }
        TravelOrderNavContentDTO travelOrderNavContentDTO = (TravelOrderNavContentDTO) other;
        return Intrinsics.d(this.title, travelOrderNavContentDTO.title) && Intrinsics.d(this.icon, travelOrderNavContentDTO.icon) && Intrinsics.d(this.subtitle, travelOrderNavContentDTO.subtitle) && Intrinsics.d(this.common, travelOrderNavContentDTO.common) && Intrinsics.d(this.dateTimeInfo, travelOrderNavContentDTO.dateTimeInfo);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final DateTimeInfo getDateTimeInfo() {
        return this.dateTimeInfo;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        IconDTO iconDTO = this.icon;
        int a11 = b.a(this.subtitle, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        DateTimeInfo dateTimeInfo = this.dateTimeInfo;
        return hashCode2 + (dateTimeInfo != null ? dateTimeInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO2 = this.subtitle;
        CommonControlSettings commonControlSettings = this.common;
        DateTimeInfo dateTimeInfo = this.dateTimeInfo;
        StringBuilder d11 = C2639a.d("TravelOrderNavContentDTO(title=", ", icon=", ", subtitle=", iconDTO, textDTO);
        d11.append(textDTO2);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(", dateTimeInfo=");
        d11.append(dateTimeInfo);
        d11.append(")");
        return d11.toString();
    }
}

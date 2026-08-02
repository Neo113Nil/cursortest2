package ru.ozon.app.android.orders.cml.parcelTimeline.data;

import AZ.c;
import B90.C2618u;
import F3.G;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@InterfaceC6346b
@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "", "sections", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getSections", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "SectionDTO", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParcelTimelineDTO {

    @NotNull
    private final List<SectionDTO> sections;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0006\u001c\u001d\u001e\u001f !B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO;", "", "uiState", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionHeaderDTO;", "steps", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelineStepDTO;", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionHeaderDTO;Ljava/util/List;)V", "getUiState", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "getHeader", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionHeaderDTO;", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SectionUIState", "ConnectorStyle", "SectionHeaderDTO", "TimelineStepDTO", "TimelinePointDTO", "ConnectorDTO", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SectionDTO {
        public static final int $stable = 8;

        @NotNull
        private final SectionHeaderDTO header;
        private final List<TimelineStepDTO> steps;

        @EnumNullFallback
        @NotNull
        private final SectionUIState uiState;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorDTO;", "", "style", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "color", "", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;Ljava/lang/String;)V", "getStyle", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConnectorDTO {
            public static final int $stable = 0;

            @NotNull
            private final String color;

            @EnumNullFallback
            @NotNull
            private final ConnectorStyle style;

            public ConnectorDTO(@NotNull ConnectorStyle style, @NotNull String color) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(color, "color");
                this.style = style;
                this.color = color;
            }

            public static /* synthetic */ ConnectorDTO copy$default(ConnectorDTO connectorDTO, ConnectorStyle connectorStyle, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    connectorStyle = connectorDTO.style;
                }
                if ((i11 & 2) != 0) {
                    str = connectorDTO.color;
                }
                return connectorDTO.copy(connectorStyle, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ConnectorStyle getStyle() {
                return this.style;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final ConnectorDTO copy(@NotNull ConnectorStyle style, @NotNull String color) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(color, "color");
                return new ConnectorDTO(style, color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConnectorDTO)) {
                    return false;
                }
                ConnectorDTO connectorDTO = (ConnectorDTO) other;
                return this.style == connectorDTO.style && Intrinsics.d(this.color, connectorDTO.color);
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final ConnectorStyle getStyle() {
                return this.style;
            }

            public int hashCode() {
                return this.color.hashCode() + (this.style.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ConnectorDTO(style=" + this.style + ", color=" + this.color + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "DASHED", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectorStyle {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ConnectorStyle[] $VALUES;
            public static final ConnectorStyle SOLID = new ConnectorStyle("SOLID", 0);
            public static final ConnectorStyle DASHED = new ConnectorStyle("DASHED", 1);

            private static final /* synthetic */ ConnectorStyle[] $values() {
                return new ConnectorStyle[]{SOLID, DASHED};
            }

            static {
                ConnectorStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ConnectorStyle(String str, int i11) {
            }

            public static ConnectorStyle valueOf(String str) {
                return (ConnectorStyle) Enum.valueOf(ConnectorStyle.class, str);
            }

            public static ConnectorStyle[] values() {
                return (ConnectorStyle[]) $VALUES.clone();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionHeaderDTO;", "", "point", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "chevron", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getPoint", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getChevron", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionHeaderDTO {
            public static final int $stable = IconDTO.$stable;
            private final BadgeDTO badge;
            private final IconDTO chevron;

            @NotNull
            private final TimelinePointDTO point;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public SectionHeaderDTO(@NotNull TimelinePointDTO point, @NotNull TextDTO title, TextDTO textDTO, IconDTO iconDTO, BadgeDTO badgeDTO) {
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                this.point = point;
                this.title = title;
                this.subtitle = textDTO;
                this.chevron = iconDTO;
                this.badge = badgeDTO;
            }

            public static /* synthetic */ SectionHeaderDTO copy$default(SectionHeaderDTO sectionHeaderDTO, TimelinePointDTO timelinePointDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, BadgeDTO badgeDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    timelinePointDTO = sectionHeaderDTO.point;
                }
                if ((i11 & 2) != 0) {
                    textDTO = sectionHeaderDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = sectionHeaderDTO.subtitle;
                }
                if ((i11 & 8) != 0) {
                    iconDTO = sectionHeaderDTO.chevron;
                }
                if ((i11 & 16) != 0) {
                    badgeDTO = sectionHeaderDTO.badge;
                }
                BadgeDTO badgeDTO2 = badgeDTO;
                TextDTO textDTO3 = textDTO2;
                return sectionHeaderDTO.copy(timelinePointDTO, textDTO, textDTO3, iconDTO, badgeDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TimelinePointDTO getPoint() {
                return this.point;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final IconDTO getChevron() {
                return this.chevron;
            }

            /* renamed from: component5, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final SectionHeaderDTO copy(@NotNull TimelinePointDTO point, @NotNull TextDTO title, TextDTO subtitle, IconDTO chevron, BadgeDTO badge) {
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                return new SectionHeaderDTO(point, title, subtitle, chevron, badge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionHeaderDTO)) {
                    return false;
                }
                SectionHeaderDTO sectionHeaderDTO = (SectionHeaderDTO) other;
                return Intrinsics.d(this.point, sectionHeaderDTO.point) && Intrinsics.d(this.title, sectionHeaderDTO.title) && Intrinsics.d(this.subtitle, sectionHeaderDTO.subtitle) && Intrinsics.d(this.chevron, sectionHeaderDTO.chevron) && Intrinsics.d(this.badge, sectionHeaderDTO.badge);
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final IconDTO getChevron() {
                return this.chevron;
            }

            @NotNull
            public final TimelinePointDTO getPoint() {
                return this.point;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.title, this.point.hashCode() * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                IconDTO iconDTO = this.chevron;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TimelinePointDTO timelinePointDTO = this.point;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconDTO iconDTO = this.chevron;
                BadgeDTO badgeDTO = this.badge;
                StringBuilder sb2 = new StringBuilder("SectionHeaderDTO(point=");
                sb2.append(timelinePointDTO);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", subtitle=");
                G.f(sb2, textDTO2, ", chevron=", iconDTO, ", badge=");
                return c.b(sb2, badgeDTO, ")");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "DISABLED", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SectionUIState {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ SectionUIState[] $VALUES;
            public static final SectionUIState EXPANDED = new SectionUIState("EXPANDED", 0);
            public static final SectionUIState COLLAPSED = new SectionUIState("COLLAPSED", 1);
            public static final SectionUIState DISABLED = new SectionUIState("DISABLED", 2);

            private static final /* synthetic */ SectionUIState[] $values() {
                return new SectionUIState[]{EXPANDED, COLLAPSED, DISABLED};
            }

            static {
                SectionUIState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SectionUIState(String str, int i11) {
            }

            public static SectionUIState valueOf(String str) {
                return (SectionUIState) Enum.valueOf(SectionUIState.class, str);
            }

            public static SectionUIState[] values() {
                return (SectionUIState[]) $VALUES.clone();
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", "", "type", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO$Type;", "color", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "topLine", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorDTO;", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO$Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorDTO;)V", "getType", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO$Type;", "getColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTopLine", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TimelinePointDTO {
            public static final int $stable = IconDTO.$stable;
            private final String color;
            private final IconDTO icon;
            private final ConnectorDTO topLine;

            @NotNull
            private final Type type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO$Type;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ICON", "COLOR", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;

                @NotNull
                private final String value;

                @i(name = "icon")
                public static final Type ICON = new Type("ICON", 0, "icon");

                @i(name = "color")
                public static final Type COLOR = new Type("COLOR", 1, "color");

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{ICON, COLOR};
                }

                static {
                    Type[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Type(String str, int i11, String str2) {
                    this.value = str2;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public TimelinePointDTO(@NotNull Type type, String str, IconDTO iconDTO, ConnectorDTO connectorDTO) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.color = str;
                this.icon = iconDTO;
                this.topLine = connectorDTO;
            }

            public static /* synthetic */ TimelinePointDTO copy$default(TimelinePointDTO timelinePointDTO, Type type, String str, IconDTO iconDTO, ConnectorDTO connectorDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    type = timelinePointDTO.type;
                }
                if ((i11 & 2) != 0) {
                    str = timelinePointDTO.color;
                }
                if ((i11 & 4) != 0) {
                    iconDTO = timelinePointDTO.icon;
                }
                if ((i11 & 8) != 0) {
                    connectorDTO = timelinePointDTO.topLine;
                }
                return timelinePointDTO.copy(type, str, iconDTO, connectorDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* renamed from: component3, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            /* renamed from: component4, reason: from getter */
            public final ConnectorDTO getTopLine() {
                return this.topLine;
            }

            @NotNull
            public final TimelinePointDTO copy(@NotNull Type type, String color, IconDTO icon, ConnectorDTO topLine) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new TimelinePointDTO(type, color, icon, topLine);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimelinePointDTO)) {
                    return false;
                }
                TimelinePointDTO timelinePointDTO = (TimelinePointDTO) other;
                return this.type == timelinePointDTO.type && Intrinsics.d(this.color, timelinePointDTO.color) && Intrinsics.d(this.icon, timelinePointDTO.icon) && Intrinsics.d(this.topLine, timelinePointDTO.topLine);
            }

            public final String getColor() {
                return this.color;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            public final ConnectorDTO getTopLine() {
                return this.topLine;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.color;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                IconDTO iconDTO = this.icon;
                int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                ConnectorDTO connectorDTO = this.topLine;
                return hashCode3 + (connectorDTO != null ? connectorDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TimelinePointDTO(type=" + this.type + ", color=" + this.color + ", icon=" + this.icon + ", topLine=" + this.topLine + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelineStepDTO;", "", "point", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getPoint", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$TimelinePointDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimelineStepDTO {
            public static final int $stable = IconDTO.$stable;
            private final BadgeDTO badge;

            @NotNull
            private final TimelinePointDTO point;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public TimelineStepDTO(@NotNull TimelinePointDTO point, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO) {
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                this.point = point;
                this.title = title;
                this.subtitle = textDTO;
                this.badge = badgeDTO;
            }

            public static /* synthetic */ TimelineStepDTO copy$default(TimelineStepDTO timelineStepDTO, TimelinePointDTO timelinePointDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    timelinePointDTO = timelineStepDTO.point;
                }
                if ((i11 & 2) != 0) {
                    textDTO = timelineStepDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = timelineStepDTO.subtitle;
                }
                if ((i11 & 8) != 0) {
                    badgeDTO = timelineStepDTO.badge;
                }
                return timelineStepDTO.copy(timelinePointDTO, textDTO, textDTO2, badgeDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TimelinePointDTO getPoint() {
                return this.point;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final TimelineStepDTO copy(@NotNull TimelinePointDTO point, @NotNull TextDTO title, TextDTO subtitle, BadgeDTO badge) {
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                return new TimelineStepDTO(point, title, subtitle, badge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimelineStepDTO)) {
                    return false;
                }
                TimelineStepDTO timelineStepDTO = (TimelineStepDTO) other;
                return Intrinsics.d(this.point, timelineStepDTO.point) && Intrinsics.d(this.title, timelineStepDTO.title) && Intrinsics.d(this.subtitle, timelineStepDTO.subtitle) && Intrinsics.d(this.badge, timelineStepDTO.badge);
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final TimelinePointDTO getPoint() {
                return this.point;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.title, this.point.hashCode() * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TimelineStepDTO(point=" + this.point + ", title=" + this.title + ", subtitle=" + this.subtitle + ", badge=" + this.badge + ")";
            }
        }

        public SectionDTO(@NotNull SectionUIState uiState, @NotNull SectionHeaderDTO header, List<TimelineStepDTO> list) {
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(header, "header");
            this.uiState = uiState;
            this.header = header;
            this.steps = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, SectionUIState sectionUIState, SectionHeaderDTO sectionHeaderDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sectionUIState = sectionDTO.uiState;
            }
            if ((i11 & 2) != 0) {
                sectionHeaderDTO = sectionDTO.header;
            }
            if ((i11 & 4) != 0) {
                list = sectionDTO.steps;
            }
            return sectionDTO.copy(sectionUIState, sectionHeaderDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SectionUIState getUiState() {
            return this.uiState;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SectionHeaderDTO getHeader() {
            return this.header;
        }

        public final List<TimelineStepDTO> component3() {
            return this.steps;
        }

        @NotNull
        public final SectionDTO copy(@NotNull SectionUIState uiState, @NotNull SectionHeaderDTO header, List<TimelineStepDTO> steps) {
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(header, "header");
            return new SectionDTO(uiState, header, steps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionDTO)) {
                return false;
            }
            SectionDTO sectionDTO = (SectionDTO) other;
            return this.uiState == sectionDTO.uiState && Intrinsics.d(this.header, sectionDTO.header) && Intrinsics.d(this.steps, sectionDTO.steps);
        }

        @NotNull
        public final SectionHeaderDTO getHeader() {
            return this.header;
        }

        public final List<TimelineStepDTO> getSteps() {
            return this.steps;
        }

        @NotNull
        public final SectionUIState getUiState() {
            return this.uiState;
        }

        public int hashCode() {
            int hashCode = (this.header.hashCode() + (this.uiState.hashCode() * 31)) * 31;
            List<TimelineStepDTO> list = this.steps;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            SectionUIState sectionUIState = this.uiState;
            SectionHeaderDTO sectionHeaderDTO = this.header;
            List<TimelineStepDTO> list = this.steps;
            StringBuilder sb2 = new StringBuilder("SectionDTO(uiState=");
            sb2.append(sectionUIState);
            sb2.append(", header=");
            sb2.append(sectionHeaderDTO);
            sb2.append(", steps=");
            return C2618u.h(sb2, list, ")");
        }
    }

    private /* synthetic */ ParcelTimelineDTO(List list) {
        this.sections = list;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ParcelTimelineDTO m852boximpl(List list) {
        return new ParcelTimelineDTO(list);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static List<? extends SectionDTO> m853constructorimpl(@NotNull List<SectionDTO> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return sections;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m854equalsimpl(List<? extends SectionDTO> list, Object obj) {
        return (obj instanceof ParcelTimelineDTO) && Intrinsics.d(list, ((ParcelTimelineDTO) obj).getSections());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m855equalsimpl0(List<? extends SectionDTO> list, List<? extends SectionDTO> list2) {
        return Intrinsics.d(list, list2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m856hashCodeimpl(List<? extends SectionDTO> list) {
        return list.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m857toStringimpl(List<? extends SectionDTO> list) {
        return H3.c.a("ParcelTimelineDTO(sections=", ")", list);
    }

    public boolean equals(Object obj) {
        return m854equalsimpl(this.sections, obj);
    }

    @NotNull
    public final List<SectionDTO> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return m856hashCodeimpl(this.sections);
    }

    public String toString() {
        return m857toStringimpl(this.sections);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ List getSections() {
        return this.sections;
    }
}

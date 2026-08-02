package ru.ozon.app.android.orders.cml.parcelTimeline.presentation;

import B90.C2618u;
import D40.d;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;", "sections", "<init>", "(JLjava/util/List;)V", "copy", "(JLjava/util/List;)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "SectionVO", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ParcelTimelineVO implements c {
    private final long id;

    @NotNull
    private final List<SectionVO> sections;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\"#$%B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u000f¨\u0006&"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "uiState", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelineStepVO;", "steps", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;Ljava/util/List;)V", "copy", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;Ljava/util/List;)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "getUiState", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$SectionUIState;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;", "getHeader", "()Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "getId", "id", "SectionHeaderVO", "TimelineStepVO", "TimelinePointVO", "ConnectorVO", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionVO {

        @NotNull
        private final SectionHeaderVO header;
        private final List<TimelineStepVO> steps;

        @NotNull
        private final ParcelTimelineDTO.SectionDTO.SectionUIState uiState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "style", "", "color", "<init>", "(Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "getStyle", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO$SectionDTO$ConnectorStyle;", "Ljava/lang/String;", "getColor", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConnectorVO {

            @NotNull
            private final String color;

            @NotNull
            private final ParcelTimelineDTO.SectionDTO.ConnectorStyle style;

            public ConnectorVO(@NotNull ParcelTimelineDTO.SectionDTO.ConnectorStyle style, @NotNull String color) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(color, "color");
                this.style = style;
                this.color = color;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConnectorVO)) {
                    return false;
                }
                ConnectorVO connectorVO = (ConnectorVO) other;
                return this.style == connectorVO.style && Intrinsics.d(this.color, connectorVO.color);
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final ParcelTimelineDTO.SectionDTO.ConnectorStyle getStyle() {
                return this.style;
            }

            public int hashCode() {
                return this.color.hashCode() + (this.style.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ConnectorVO(style=" + this.style + ", color=" + this.color + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$SectionHeaderVO;", "", "", "id", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "point", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "chevron", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "getPoint", "()Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getChevron", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionHeaderVO {
            public static final int $stable = IconDTO.$stable;
            private final BadgeDTO badge;
            private final IconDTO chevron;

            @NotNull
            private final String id;

            @NotNull
            private final TimelinePointVO point;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public SectionHeaderVO(@NotNull String id2, @NotNull TimelinePointVO point, @NotNull TextDTO title, TextDTO textDTO, IconDTO iconDTO, BadgeDTO badgeDTO) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = id2;
                this.point = point;
                this.title = title;
                this.subtitle = textDTO;
                this.chevron = iconDTO;
                this.badge = badgeDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionHeaderVO)) {
                    return false;
                }
                SectionHeaderVO sectionHeaderVO = (SectionHeaderVO) other;
                return Intrinsics.d(this.id, sectionHeaderVO.id) && Intrinsics.d(this.point, sectionHeaderVO.point) && Intrinsics.d(this.title, sectionHeaderVO.title) && Intrinsics.d(this.subtitle, sectionHeaderVO.subtitle) && Intrinsics.d(this.chevron, sectionHeaderVO.chevron) && Intrinsics.d(this.badge, sectionHeaderVO.badge);
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final IconDTO getChevron() {
                return this.chevron;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final TimelinePointVO getPoint() {
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
                int a11 = b.a(this.title, (this.point.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                IconDTO iconDTO = this.chevron;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TimelinePointVO timelinePointVO = this.point;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconDTO iconDTO = this.chevron;
                BadgeDTO badgeDTO = this.badge;
                StringBuilder sb2 = new StringBuilder("SectionHeaderVO(id=");
                sb2.append(str);
                sb2.append(", point=");
                sb2.append(timelinePointVO);
                sb2.append(", title=");
                d.e(", subtitle=", ", chevron=", sb2, textDTO, textDTO2);
                sb2.append(iconDTO);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "color", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "topLine", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getColor", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "getTopLine", "()Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$ConnectorVO;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimelinePointVO {
            public static final int $stable = IconDTO.$stable;
            private final String color;
            private final IconDTO icon;
            private final ConnectorVO topLine;

            public TimelinePointVO(IconDTO iconDTO, String str, ConnectorVO connectorVO) {
                this.icon = iconDTO;
                this.color = str;
                this.topLine = connectorVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimelinePointVO)) {
                    return false;
                }
                TimelinePointVO timelinePointVO = (TimelinePointVO) other;
                return Intrinsics.d(this.icon, timelinePointVO.icon) && Intrinsics.d(this.color, timelinePointVO.color) && Intrinsics.d(this.topLine, timelinePointVO.topLine);
            }

            public final String getColor() {
                return this.color;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            public final ConnectorVO getTopLine() {
                return this.topLine;
            }

            public int hashCode() {
                IconDTO iconDTO = this.icon;
                int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
                String str = this.color;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                ConnectorVO connectorVO = this.topLine;
                return hashCode2 + (connectorVO != null ? connectorVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TimelinePointVO(icon=" + this.icon + ", color=" + this.color + ", topLine=" + this.topLine + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelineStepVO;", "", "", "id", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "point", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "getPoint", "()Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO$SectionVO$TimelinePointVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimelineStepVO {
            public static final int $stable = IconDTO.$stable;
            private final BadgeDTO badge;

            @NotNull
            private final String id;

            @NotNull
            private final TimelinePointVO point;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public TimelineStepVO(@NotNull String id2, @NotNull TimelinePointVO point, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(point, "point");
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = id2;
                this.point = point;
                this.title = title;
                this.subtitle = textDTO;
                this.badge = badgeDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimelineStepVO)) {
                    return false;
                }
                TimelineStepVO timelineStepVO = (TimelineStepVO) other;
                return Intrinsics.d(this.id, timelineStepVO.id) && Intrinsics.d(this.point, timelineStepVO.point) && Intrinsics.d(this.title, timelineStepVO.title) && Intrinsics.d(this.subtitle, timelineStepVO.subtitle) && Intrinsics.d(this.badge, timelineStepVO.badge);
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final TimelinePointVO getPoint() {
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
                int a11 = b.a(this.title, (this.point.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TimelinePointVO timelinePointVO = this.point;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                BadgeDTO badgeDTO = this.badge;
                StringBuilder sb2 = new StringBuilder("TimelineStepVO(id=");
                sb2.append(str);
                sb2.append(", point=");
                sb2.append(timelinePointVO);
                sb2.append(", title=");
                d.e(", subtitle=", ", badge=", sb2, textDTO, textDTO2);
                return AZ.c.b(sb2, badgeDTO, ")");
            }
        }

        public SectionVO(@NotNull ParcelTimelineDTO.SectionDTO.SectionUIState uiState, @NotNull SectionHeaderVO header, List<TimelineStepVO> list) {
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(header, "header");
            this.uiState = uiState;
            this.header = header;
            this.steps = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionVO copy$default(SectionVO sectionVO, ParcelTimelineDTO.SectionDTO.SectionUIState sectionUIState, SectionHeaderVO sectionHeaderVO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sectionUIState = sectionVO.uiState;
            }
            if ((i11 & 2) != 0) {
                sectionHeaderVO = sectionVO.header;
            }
            if ((i11 & 4) != 0) {
                list = sectionVO.steps;
            }
            return sectionVO.copy(sectionUIState, sectionHeaderVO, list);
        }

        @NotNull
        public final SectionVO copy(@NotNull ParcelTimelineDTO.SectionDTO.SectionUIState uiState, @NotNull SectionHeaderVO header, List<TimelineStepVO> steps) {
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(header, "header");
            return new SectionVO(uiState, header, steps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionVO)) {
                return false;
            }
            SectionVO sectionVO = (SectionVO) other;
            return this.uiState == sectionVO.uiState && Intrinsics.d(this.header, sectionVO.header) && Intrinsics.d(this.steps, sectionVO.steps);
        }

        @NotNull
        public final SectionHeaderVO getHeader() {
            return this.header;
        }

        @NotNull
        public final String getId() {
            return this.header.getId();
        }

        public final List<TimelineStepVO> getSteps() {
            return this.steps;
        }

        @NotNull
        public final ParcelTimelineDTO.SectionDTO.SectionUIState getUiState() {
            return this.uiState;
        }

        public int hashCode() {
            int hashCode = (this.header.hashCode() + (this.uiState.hashCode() * 31)) * 31;
            List<TimelineStepVO> list = this.steps;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            ParcelTimelineDTO.SectionDTO.SectionUIState sectionUIState = this.uiState;
            SectionHeaderVO sectionHeaderVO = this.header;
            List<TimelineStepVO> list = this.steps;
            StringBuilder sb2 = new StringBuilder("SectionVO(uiState=");
            sb2.append(sectionUIState);
            sb2.append(", header=");
            sb2.append(sectionHeaderVO);
            sb2.append(", steps=");
            return C2618u.h(sb2, list, ")");
        }
    }

    public ParcelTimelineVO(long j11, @NotNull List<SectionVO> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.id = j11;
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParcelTimelineVO copy$default(ParcelTimelineVO parcelTimelineVO, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = parcelTimelineVO.id;
        }
        if ((i11 & 2) != 0) {
            list = parcelTimelineVO.sections;
        }
        return parcelTimelineVO.copy(j11, list);
    }

    @NotNull
    public final ParcelTimelineVO copy(long id2, @NotNull List<SectionVO> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new ParcelTimelineVO(id2, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelTimelineVO)) {
            return false;
        }
        ParcelTimelineVO parcelTimelineVO = (ParcelTimelineVO) other;
        return this.id == parcelTimelineVO.id && Intrinsics.d(this.sections, parcelTimelineVO.sections);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<SectionVO> getSections() {
        return this.sections;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.sections.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "ParcelTimelineVO(id=", ", sections=", this.sections);
        b11.append(")");
        return b11.toString();
    }
}

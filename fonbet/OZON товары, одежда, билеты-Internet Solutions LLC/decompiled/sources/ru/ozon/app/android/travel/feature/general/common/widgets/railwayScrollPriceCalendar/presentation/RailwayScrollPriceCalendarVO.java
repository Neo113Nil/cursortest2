package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation;

import B0.C2454a;
import Ep.a;
import F3.G;
import Ns.b;
import Tz.C4055a;
import WZ.t;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003-./BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b,\u0010\u0014¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "state", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTokenizedEvent", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "corners", "", "backgroundColor", "", "verticalPadding", "roundedCornersOuterColor", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;LWZ/t;Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "getCorners", "()Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "Ljava/lang/String;", "getBackgroundColor", "I", "getVerticalPadding", "getRoundedCornersOuterColor", "PriceCalendarState", "DateTabVO", "CornersVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayScrollPriceCalendarVO implements c {
    private final String backgroundColor;

    @NotNull
    private final CornersVO corners;
    private final long id;
    private final String roundedCornersOuterColor;

    @NotNull
    private final PriceCalendarState state;
    private final int verticalPadding;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "", "", "topRadius", "bottomRadius", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTopRadius", "()F", "getBottomRadius", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornersVO {
        private final float bottomRadius;
        private final float topRadius;

        public CornersVO(float f7, float f11) {
            this.topRadius = f7;
            this.bottomRadius = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornersVO)) {
                return false;
            }
            CornersVO cornersVO = (CornersVO) other;
            return Float.compare(this.topRadius, cornersVO.topRadius) == 0 && Float.compare(this.bottomRadius, cornersVO.bottomRadius) == 0;
        }

        public final float getBottomRadius() {
            return this.bottomRadius;
        }

        public final float getTopRadius() {
            return this.topRadius;
        }

        public int hashCode() {
            return Float.hashCode(this.bottomRadius) + (Float.hashCode(this.topRadius) * 31);
        }

        @NotNull
        public String toString() {
            return "CornersVO(topRadius=" + this.topRadius + ", bottomRadius=" + this.bottomRadius + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "priceText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "priceIcon", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTabVO {
        public static final int $stable = AspectDTO.$stable | IconDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final TextDTO date;
        private final int id;
        private final IconDTO priceIcon;
        private final TextDTO priceText;

        public DateTabVO(int i11, @NotNull TextDTO date, TextDTO textDTO, IconDTO iconDTO, @NotNull AspectDTO aspect) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.id = i11;
            this.date = date;
            this.priceText = textDTO;
            this.priceIcon = iconDTO;
            this.aspect = aspect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTabVO)) {
                return false;
            }
            DateTabVO dateTabVO = (DateTabVO) other;
            return this.id == dateTabVO.id && Intrinsics.d(this.date, dateTabVO.date) && Intrinsics.d(this.priceText, dateTabVO.priceText) && Intrinsics.d(this.priceIcon, dateTabVO.priceIcon) && Intrinsics.d(this.aspect, dateTabVO.aspect);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public final int getId() {
            return this.id;
        }

        public final IconDTO getPriceIcon() {
            return this.priceIcon;
        }

        public final TextDTO getPriceText() {
            return this.priceText;
        }

        public int hashCode() {
            int a11 = b.a(this.date, Integer.hashCode(this.id) * 31, 31);
            TextDTO textDTO = this.priceText;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.priceIcon;
            return this.aspect.hashCode() + ((hashCode + (iconDTO != null ? iconDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.date;
            TextDTO textDTO2 = this.priceText;
            IconDTO iconDTO = this.priceIcon;
            AspectDTO aspectDTO = this.aspect;
            StringBuilder b11 = C4055a.b(textDTO, "DateTabVO(id=", ", date=", ", priceText=", i11);
            G.f(b11, textDTO2, ", priceIcon=", iconDTO, ", aspect=");
            b11.append(aspectDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "", "Loading", "AllDone", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState$AllDone;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState$Loading;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PriceCalendarState {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState$AllDone;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "dateTabs", "", "activeTabIndex", "activeTabId", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDateTabs", "()Ljava/util/List;", "Ljava/lang/Integer;", "getActiveTabIndex", "()Ljava/lang/Integer;", "getActiveTabId", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AllDone implements PriceCalendarState {
            private final Integer activeTabId;
            private final Integer activeTabIndex;

            @NotNull
            private final List<DateTabVO> dateTabs;

            public AllDone(@NotNull List<DateTabVO> dateTabs, Integer num, Integer num2) {
                Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
                this.dateTabs = dateTabs;
                this.activeTabIndex = num;
                this.activeTabId = num2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AllDone)) {
                    return false;
                }
                AllDone allDone = (AllDone) other;
                return Intrinsics.d(this.dateTabs, allDone.dateTabs) && Intrinsics.d(this.activeTabIndex, allDone.activeTabIndex) && Intrinsics.d(this.activeTabId, allDone.activeTabId);
            }

            public final Integer getActiveTabIndex() {
                return this.activeTabIndex;
            }

            @NotNull
            public final List<DateTabVO> getDateTabs() {
                return this.dateTabs;
            }

            public int hashCode() {
                int hashCode = this.dateTabs.hashCode() * 31;
                Integer num = this.activeTabIndex;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.activeTabId;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<DateTabVO> list = this.dateTabs;
                Integer num = this.activeTabIndex;
                Integer num2 = this.activeTabId;
                StringBuilder sb2 = new StringBuilder("AllDone(dateTabs=");
                sb2.append(list);
                sb2.append(", activeTabIndex=");
                sb2.append(num);
                sb2.append(", activeTabId=");
                return a.c(sb2, num2, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState$Loading;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$PriceCalendarState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements PriceCalendarState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1493164808;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }
    }

    public RailwayScrollPriceCalendarVO(long j11, @NotNull PriceCalendarState state, t tVar, @NotNull CornersVO corners, String str, int i11, String str2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(corners, "corners");
        this.id = j11;
        this.state = state;
        this.viewTokenizedEvent = tVar;
        this.corners = corners;
        this.backgroundColor = str;
        this.verticalPadding = i11;
        this.roundedCornersOuterColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayScrollPriceCalendarVO)) {
            return false;
        }
        RailwayScrollPriceCalendarVO railwayScrollPriceCalendarVO = (RailwayScrollPriceCalendarVO) other;
        return this.id == railwayScrollPriceCalendarVO.id && Intrinsics.d(this.state, railwayScrollPriceCalendarVO.state) && Intrinsics.d(this.viewTokenizedEvent, railwayScrollPriceCalendarVO.viewTokenizedEvent) && Intrinsics.d(this.corners, railwayScrollPriceCalendarVO.corners) && Intrinsics.d(this.backgroundColor, railwayScrollPriceCalendarVO.backgroundColor) && this.verticalPadding == railwayScrollPriceCalendarVO.verticalPadding && Intrinsics.d(this.roundedCornersOuterColor, railwayScrollPriceCalendarVO.roundedCornersOuterColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornersVO getCorners() {
        return this.corners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getRoundedCornersOuterColor() {
        return this.roundedCornersOuterColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final PriceCalendarState getState() {
        return this.state;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.viewTokenizedEvent;
        int hashCode2 = (this.corners.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        int a11 = C2454a.a(this.verticalPadding, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.roundedCornersOuterColor;
        return a11 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PriceCalendarState priceCalendarState = this.state;
        t tVar = this.viewTokenizedEvent;
        CornersVO cornersVO = this.corners;
        String str = this.backgroundColor;
        int i11 = this.verticalPadding;
        String str2 = this.roundedCornersOuterColor;
        StringBuilder sb2 = new StringBuilder("RailwayScrollPriceCalendarVO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(priceCalendarState);
        sb2.append(", viewTokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", corners=");
        sb2.append(cornersVO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", verticalPadding=");
        sb2.append(i11);
        return C6594f.a(", roundedCornersOuterColor=", str2, ")", sb2);
    }
}

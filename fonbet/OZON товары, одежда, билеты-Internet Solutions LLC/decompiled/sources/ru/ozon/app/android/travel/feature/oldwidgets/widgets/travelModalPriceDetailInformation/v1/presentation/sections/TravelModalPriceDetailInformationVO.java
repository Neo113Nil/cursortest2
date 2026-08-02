package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections;

import Ak.C2436a;
import B90.C2618u;
import D3.h;
import G.g;
import N3.C3660k;
import Nh.a;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "sectionName", "sectionPrice", "sectionSubtitle", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;", "positions", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getSectionName", "getSectionPrice", "getSectionSubtitle", "Ljava/util/List;", "getPositions", "()Ljava/util/List;", "PositionVO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationVO implements c {
    private final long id;
    private final List<PositionVO> positions;

    @NotNull
    private final String sectionName;

    @NotNull
    private final String sectionPrice;
    private final String sectionSubtitle;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;", "", "", "positionName", "positionPrice", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;", "positionItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPositionName", "getPositionPrice", "Ljava/util/List;", "getPositionItems", "()Ljava/util/List;", "PositionItemVO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositionVO {
        private final List<PositionItemVO> positionItems;

        @NotNull
        private final String positionName;
        private final String positionPrice;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;", "", "", "itemName", "itemPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemName", "getItemPrice", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PositionItemVO {

            @NotNull
            private final String itemName;

            @NotNull
            private final String itemPrice;

            public PositionItemVO(@NotNull String itemName, @NotNull String itemPrice) {
                Intrinsics.checkNotNullParameter(itemName, "itemName");
                Intrinsics.checkNotNullParameter(itemPrice, "itemPrice");
                this.itemName = itemName;
                this.itemPrice = itemPrice;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PositionItemVO)) {
                    return false;
                }
                PositionItemVO positionItemVO = (PositionItemVO) other;
                return Intrinsics.d(this.itemName, positionItemVO.itemName) && Intrinsics.d(this.itemPrice, positionItemVO.itemPrice);
            }

            @NotNull
            public final String getItemName() {
                return this.itemName;
            }

            @NotNull
            public final String getItemPrice() {
                return this.itemPrice;
            }

            public int hashCode() {
                return this.itemPrice.hashCode() + (this.itemName.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("PositionItemVO(itemName=", this.itemName, ", itemPrice=", this.itemPrice, ")");
            }
        }

        public PositionVO(@NotNull String positionName, String str, List<PositionItemVO> list) {
            Intrinsics.checkNotNullParameter(positionName, "positionName");
            this.positionName = positionName;
            this.positionPrice = str;
            this.positionItems = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionVO)) {
                return false;
            }
            PositionVO positionVO = (PositionVO) other;
            return Intrinsics.d(this.positionName, positionVO.positionName) && Intrinsics.d(this.positionPrice, positionVO.positionPrice) && Intrinsics.d(this.positionItems, positionVO.positionItems);
        }

        public final List<PositionItemVO> getPositionItems() {
            return this.positionItems;
        }

        @NotNull
        public final String getPositionName() {
            return this.positionName;
        }

        public final String getPositionPrice() {
            return this.positionPrice;
        }

        public int hashCode() {
            int hashCode = this.positionName.hashCode() * 31;
            String str = this.positionPrice;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<PositionItemVO> list = this.positionItems;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.positionName;
            String str2 = this.positionPrice;
            return C2618u.h(C3660k.d("PositionVO(positionName=", str, ", positionPrice=", str2, ", positionItems="), this.positionItems, ")");
        }
    }

    public TravelModalPriceDetailInformationVO(long j11, @NotNull String sectionName, @NotNull String sectionPrice, String str, List<PositionVO> list) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(sectionPrice, "sectionPrice");
        this.id = j11;
        this.sectionName = sectionName;
        this.sectionPrice = sectionPrice;
        this.sectionSubtitle = str;
        this.positions = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationVO)) {
            return false;
        }
        TravelModalPriceDetailInformationVO travelModalPriceDetailInformationVO = (TravelModalPriceDetailInformationVO) other;
        return this.id == travelModalPriceDetailInformationVO.id && Intrinsics.d(this.sectionName, travelModalPriceDetailInformationVO.sectionName) && Intrinsics.d(this.sectionPrice, travelModalPriceDetailInformationVO.sectionPrice) && Intrinsics.d(this.sectionSubtitle, travelModalPriceDetailInformationVO.sectionSubtitle) && Intrinsics.d(this.positions, travelModalPriceDetailInformationVO.positions);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<PositionVO> getPositions() {
        return this.positions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSectionName() {
        return this.sectionName;
    }

    @NotNull
    public final String getSectionPrice() {
        return this.sectionPrice;
    }

    public final String getSectionSubtitle() {
        return this.sectionSubtitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.sectionName), 31, this.sectionPrice);
        String str = this.sectionSubtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<PositionVO> list = this.positions;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.sectionName;
        String str2 = this.sectionPrice;
        String str3 = this.sectionSubtitle;
        List<PositionVO> list = this.positions;
        StringBuilder c11 = C2436a.c(j11, "TravelModalPriceDetailInformationVO(id=", ", sectionName=", str);
        a.h(c11, ", sectionPrice=", str2, ", sectionSubtitle=", str3);
        return h.c(c11, ", positions=", list, ")");
    }
}

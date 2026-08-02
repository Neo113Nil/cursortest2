package ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem;

import D3.h;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "islandCornerRadius", "", "backgroundColor", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "verticalPadding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "cellList", "<init>", "(JLru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Ljava/util/List;", "getCellList", "()Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryInfoVO implements c {
    private final String backgroundColor;

    @NotNull
    private final List<InfoCellVO> cellList;
    private final long id;
    private final CornerRadius islandCornerRadius;
    private final TestInfo testInfo;
    private final t tokenizedEvent;
    private final VerticalPadding verticalPadding;

    public DeliveryInfoVO(long j11, CornerRadius cornerRadius, String str, VerticalPadding verticalPadding, t tVar, TestInfo testInfo, @NotNull List<InfoCellVO> cellList) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.id = j11;
        this.islandCornerRadius = cornerRadius;
        this.backgroundColor = str;
        this.verticalPadding = verticalPadding;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.cellList = cellList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryInfoVO)) {
            return false;
        }
        DeliveryInfoVO deliveryInfoVO = (DeliveryInfoVO) other;
        return this.id == deliveryInfoVO.id && this.islandCornerRadius == deliveryInfoVO.islandCornerRadius && Intrinsics.d(this.backgroundColor, deliveryInfoVO.backgroundColor) && Intrinsics.d(this.verticalPadding, deliveryInfoVO.verticalPadding) && Intrinsics.d(this.tokenizedEvent, deliveryInfoVO.tokenizedEvent) && Intrinsics.d(this.testInfo, deliveryInfoVO.testInfo) && Intrinsics.d(this.cellList, deliveryInfoVO.cellList);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<InfoCellVO> getCellList() {
        return this.cellList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        CornerRadius cornerRadius = this.islandCornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        int hashCode4 = (hashCode3 + (verticalPadding == null ? 0 : verticalPadding.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.cellList.hashCode() + ((hashCode5 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CornerRadius cornerRadius = this.islandCornerRadius;
        String str = this.backgroundColor;
        VerticalPadding verticalPadding = this.verticalPadding;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        List<InfoCellVO> list = this.cellList;
        StringBuilder sb2 = new StringBuilder("DeliveryInfoVO(id=");
        sb2.append(j11);
        sb2.append(", islandCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", verticalPadding=");
        sb2.append(verticalPadding);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        return h.c(sb2, ", cellList=", list, ")");
    }
}

package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewItems;

import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data.TextIconDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;", "titleTextIcon", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAtomList", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "images", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "verticalPadding", "<init>", "(JLru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;", "getTitleTextIcon", "()Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;", "Ljava/util/List;", "getTextAtomList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "getImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderOnDetailsVO implements c {
    private final BadgeDTO badge;
    private final long id;
    private final ImagesVO images;
    private final TestInfo testInfo;

    @NotNull
    private final List<TextDTO> textAtomList;
    private final TextIconDTO titleTextIcon;
    private final t tokenizedEvent;
    private final VerticalPadding verticalPadding;

    public DeliveryOrderOnDetailsVO(long j11, TextIconDTO textIconDTO, @NotNull List<TextDTO> textAtomList, BadgeDTO badgeDTO, ImagesVO imagesVO, t tVar, TestInfo testInfo, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(textAtomList, "textAtomList");
        this.id = j11;
        this.titleTextIcon = textIconDTO;
        this.textAtomList = textAtomList;
        this.badge = badgeDTO;
        this.images = imagesVO;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.verticalPadding = verticalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderOnDetailsVO)) {
            return false;
        }
        DeliveryOrderOnDetailsVO deliveryOrderOnDetailsVO = (DeliveryOrderOnDetailsVO) other;
        return this.id == deliveryOrderOnDetailsVO.id && Intrinsics.d(this.titleTextIcon, deliveryOrderOnDetailsVO.titleTextIcon) && Intrinsics.d(this.textAtomList, deliveryOrderOnDetailsVO.textAtomList) && Intrinsics.d(this.badge, deliveryOrderOnDetailsVO.badge) && Intrinsics.d(this.images, deliveryOrderOnDetailsVO.images) && Intrinsics.d(this.tokenizedEvent, deliveryOrderOnDetailsVO.tokenizedEvent) && Intrinsics.d(this.testInfo, deliveryOrderOnDetailsVO.testInfo) && Intrinsics.d(this.verticalPadding, deliveryOrderOnDetailsVO.verticalPadding);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImagesVO getImages() {
        return this.images;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextDTO> getTextAtomList() {
        return this.textAtomList;
    }

    public final TextIconDTO getTitleTextIcon() {
        return this.titleTextIcon;
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
        TextIconDTO textIconDTO = this.titleTextIcon;
        int b11 = g.b((hashCode + (textIconDTO == null ? 0 : textIconDTO.hashCode())) * 31, 31, this.textAtomList);
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ImagesVO imagesVO = this.images;
        int hashCode3 = (hashCode2 + (imagesVO == null ? 0 : imagesVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode5 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOrderOnDetailsVO(id=" + this.id + ", titleTextIcon=" + this.titleTextIcon + ", textAtomList=" + this.textAtomList + ", badge=" + this.badge + ", images=" + this.images + ", tokenizedEvent=" + this.tokenizedEvent + ", testInfo=" + this.testInfo + ", verticalPadding=" + this.verticalPadding + ")";
    }
}

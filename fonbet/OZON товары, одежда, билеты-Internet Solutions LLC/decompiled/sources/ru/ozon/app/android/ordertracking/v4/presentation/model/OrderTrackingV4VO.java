package ru.ozon.app.android.ordertracking.v4.presentation.model;

import G.g;
import Nh.a;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.wearable.pageConfigurator.ViewItemWithBarcode;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011JV\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "Ll20/c;", "Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/ViewItemWithBarcode;", "", "id", "Lru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;", "padding", "", "backgroundColor", "", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "items", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "updateAction", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(JLru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;Landroid/os/Parcelable;)V", "copy", "(JLru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;Landroid/os/Parcelable;)Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;", "getPadding", "()Lru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "getUpdateAction", "()Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "getHasBarcode", "()Z", "hasBarcode", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTrackingV4VO implements c, ViewItemWithBarcode {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final List<OrderTrackingItemVO> items;
    private Parcelable layoutManagerState;

    @NotNull
    private final PaddingVO padding;

    @NotNull
    private final UpdateAction updateAction;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTrackingV4VO(long j11, @NotNull PaddingVO padding, String str, @NotNull List<? extends OrderTrackingItemVO> items, @NotNull UpdateAction updateAction, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(updateAction, "updateAction");
        this.id = j11;
        this.padding = padding;
        this.backgroundColor = str;
        this.items = items;
        this.updateAction = updateAction;
        this.layoutManagerState = parcelable;
    }

    public static /* synthetic */ OrderTrackingV4VO copy$default(OrderTrackingV4VO orderTrackingV4VO, long j11, PaddingVO paddingVO, String str, List list, UpdateAction updateAction, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = orderTrackingV4VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            paddingVO = orderTrackingV4VO.padding;
        }
        PaddingVO paddingVO2 = paddingVO;
        if ((i11 & 4) != 0) {
            str = orderTrackingV4VO.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            list = orderTrackingV4VO.items;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            updateAction = orderTrackingV4VO.updateAction;
        }
        UpdateAction updateAction2 = updateAction;
        if ((i11 & 32) != 0) {
            parcelable = orderTrackingV4VO.layoutManagerState;
        }
        return orderTrackingV4VO.copy(j12, paddingVO2, str2, list2, updateAction2, parcelable);
    }

    @NotNull
    public final OrderTrackingV4VO copy(long id2, @NotNull PaddingVO padding, String backgroundColor, @NotNull List<? extends OrderTrackingItemVO> items, @NotNull UpdateAction updateAction, Parcelable layoutManagerState) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(updateAction, "updateAction");
        return new OrderTrackingV4VO(id2, padding, backgroundColor, items, updateAction, layoutManagerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackingV4VO)) {
            return false;
        }
        OrderTrackingV4VO orderTrackingV4VO = (OrderTrackingV4VO) other;
        return this.id == orderTrackingV4VO.id && Intrinsics.d(this.padding, orderTrackingV4VO.padding) && Intrinsics.d(this.backgroundColor, orderTrackingV4VO.backgroundColor) && Intrinsics.d(this.items, orderTrackingV4VO.items) && Intrinsics.d(this.updateAction, orderTrackingV4VO.updateAction) && Intrinsics.d(this.layoutManagerState, orderTrackingV4VO.layoutManagerState);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.barcodecache.wearable.pageConfigurator.ViewItemWithBarcode
    public boolean getHasBarcode() {
        Object obj;
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((OrderTrackingItemVO) obj) instanceof BarcodeVO) {
                break;
            }
        }
        return obj != null;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<OrderTrackingItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final PaddingVO getPadding() {
        return this.padding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final UpdateAction getUpdateAction() {
        return this.updateAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.padding.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.updateAction.hashCode() + g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items)) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PaddingVO paddingVO = this.padding;
        String str = this.backgroundColor;
        List<OrderTrackingItemVO> list = this.items;
        UpdateAction updateAction = this.updateAction;
        Parcelable parcelable = this.layoutManagerState;
        StringBuilder sb2 = new StringBuilder("OrderTrackingV4VO(id=");
        sb2.append(j11);
        sb2.append(", padding=");
        sb2.append(paddingVO);
        a.g(", backgroundColor=", str, ", items=", sb2, list);
        sb2.append(", updateAction=");
        sb2.append(updateAction);
        sb2.append(", layoutManagerState=");
        sb2.append(parcelable);
        sb2.append(")");
        return sb2.toString();
    }
}

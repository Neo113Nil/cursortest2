package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation;

import A00.a;
import E0.C2942q;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import Ve.C4598rp;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002 !B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "stateWrapper", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "getStateWrapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "Ljava/lang/String;", "getAsyncData", "UnpaidOrderListStateWrapper", "OrderVO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UnpaidOrderListVO implements c, a.J.InterfaceC0007a {
    private final String asyncData;
    private final long id;

    @NotNull
    private final UnpaidOrderListStateWrapper stateWrapper;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "orderList", "", "maxTimerValue", "mappingTime", "<init>", "(Ljava/util/List;JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOrderList", "()Ljava/util/List;", "J", "getMaxTimerValue", "()J", "getMappingTime", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class UnpaidOrderListStateWrapper {
        private final long mappingTime;
        private final long maxTimerValue;

        @NotNull
        private final List<OrderVO> orderList;

        public UnpaidOrderListStateWrapper(@NotNull List<OrderVO> orderList, long j11, long j12) {
            Intrinsics.checkNotNullParameter(orderList, "orderList");
            this.orderList = orderList;
            this.maxTimerValue = j11;
            this.mappingTime = j12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnpaidOrderListStateWrapper)) {
                return false;
            }
            UnpaidOrderListStateWrapper unpaidOrderListStateWrapper = (UnpaidOrderListStateWrapper) other;
            return Intrinsics.d(this.orderList, unpaidOrderListStateWrapper.orderList) && this.maxTimerValue == unpaidOrderListStateWrapper.maxTimerValue && this.mappingTime == unpaidOrderListStateWrapper.mappingTime;
        }

        public final long getMappingTime() {
            return this.mappingTime;
        }

        public final long getMaxTimerValue() {
            return this.maxTimerValue;
        }

        @NotNull
        public final List<OrderVO> getOrderList() {
            return this.orderList;
        }

        public int hashCode() {
            return Long.hashCode(this.mappingTime) + Pk0.c.a(this.orderList.hashCode() * 31, 31, this.maxTimerValue);
        }

        @NotNull
        public String toString() {
            return "UnpaidOrderListStateWrapper(orderList=" + this.orderList + ", maxTimerValue=" + this.maxTimerValue + ", mappingTime=" + this.mappingTime + ")";
        }
    }

    public UnpaidOrderListVO(long j11, @NotNull UnpaidOrderListStateWrapper stateWrapper, String str) {
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        this.id = j11;
        this.stateWrapper = stateWrapper;
        this.asyncData = str;
    }

    public static /* synthetic */ UnpaidOrderListVO copy$default(UnpaidOrderListVO unpaidOrderListVO, long j11, UnpaidOrderListStateWrapper unpaidOrderListStateWrapper, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = unpaidOrderListVO.id;
        }
        if ((i11 & 2) != 0) {
            unpaidOrderListStateWrapper = unpaidOrderListVO.stateWrapper;
        }
        if ((i11 & 4) != 0) {
            str = unpaidOrderListVO.asyncData;
        }
        return unpaidOrderListVO.copy(j11, unpaidOrderListStateWrapper, str);
    }

    @NotNull
    public final UnpaidOrderListVO copy(long id2, @NotNull UnpaidOrderListStateWrapper stateWrapper, String asyncData) {
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        return new UnpaidOrderListVO(id2, stateWrapper, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnpaidOrderListVO)) {
            return false;
        }
        UnpaidOrderListVO unpaidOrderListVO = (UnpaidOrderListVO) other;
        return this.id == unpaidOrderListVO.id && Intrinsics.d(this.stateWrapper, unpaidOrderListVO.stateWrapper) && Intrinsics.d(this.asyncData, unpaidOrderListVO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
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
    public final UnpaidOrderListStateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.stateWrapper.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        UnpaidOrderListStateWrapper unpaidOrderListStateWrapper = this.stateWrapper;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("UnpaidOrderListVO(id=");
        sb2.append(j11);
        sb2.append(", stateWrapper=");
        sb2.append(unpaidOrderListStateWrapper);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJÚ\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b4\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b9\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b:\u00100R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bH\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "", "", "id", "", "isWide", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "formattedRemainTime", "timeToPay", "displayTimerValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "dates", ProductAction.ACTION_DETAIL, "priceBadge", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "routeIcons", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTracking", "clickTracking", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "firstPrice", "secondPrice", "<init>", "(JZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;JJLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "copy", "(JZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;JJLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getFormattedRemainTime", "getTimeToPay", "getDisplayTimerValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDates", "getDetail", "getPriceBadge", "Ljava/util/List;", "getRouteIcons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewTracking", "()Ljava/util/Map;", "getClickTracking", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getFirstPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSecondPrice", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class OrderVO {

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final AtomAction clickAction;
        private final Map<String, TokenizedTrackingInfo> clickTracking;

        @NotNull
        private final TextDTO dates;

        @NotNull
        private final TextDTO detail;
        private final long displayTimerValue;
        private final PriceDTO firstPrice;
        private final String formattedRemainTime;
        private final long id;
        private final boolean isWide;
        private final BadgeDTO priceBadge;

        @NotNull
        private final List<IconDTO> routeIcons;
        private final PriceDTO secondPrice;
        private final long timeToPay;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewTracking;

        public OrderVO(long j11, boolean z11, @NotNull BadgeDTO badge, String str, long j12, long j13, @NotNull TextDTO title, @NotNull TextDTO dates, @NotNull TextDTO detail, BadgeDTO badgeDTO, @NotNull List<IconDTO> routeIcons, @NotNull AtomAction clickAction, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, PriceDTO priceDTO, PriceDTO priceDTO2) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(routeIcons, "routeIcons");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            this.id = j11;
            this.isWide = z11;
            this.badge = badge;
            this.formattedRemainTime = str;
            this.timeToPay = j12;
            this.displayTimerValue = j13;
            this.title = title;
            this.dates = dates;
            this.detail = detail;
            this.priceBadge = badgeDTO;
            this.routeIcons = routeIcons;
            this.clickAction = clickAction;
            this.viewTracking = map;
            this.clickTracking = map2;
            this.firstPrice = priceDTO;
            this.secondPrice = priceDTO2;
        }

        public static /* synthetic */ OrderVO copy$default(OrderVO orderVO, long j11, boolean z11, BadgeDTO badgeDTO, String str, long j12, long j13, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, BadgeDTO badgeDTO2, List list, AtomAction atomAction, Map map, Map map2, PriceDTO priceDTO, PriceDTO priceDTO2, int i11, Object obj) {
            long j14 = (i11 & 1) != 0 ? orderVO.id : j11;
            return orderVO.copy(j14, (i11 & 2) != 0 ? orderVO.isWide : z11, (i11 & 4) != 0 ? orderVO.badge : badgeDTO, (i11 & 8) != 0 ? orderVO.formattedRemainTime : str, (i11 & 16) != 0 ? orderVO.timeToPay : j12, (i11 & 32) != 0 ? orderVO.displayTimerValue : j13, (i11 & 64) != 0 ? orderVO.title : textDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? orderVO.dates : textDTO2, (i11 & 256) != 0 ? orderVO.detail : textDTO3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? orderVO.priceBadge : badgeDTO2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? orderVO.routeIcons : list, (i11 & 2048) != 0 ? orderVO.clickAction : atomAction, (i11 & 4096) != 0 ? orderVO.viewTracking : map, (i11 & 8192) != 0 ? orderVO.clickTracking : map2, (i11 & 16384) != 0 ? orderVO.firstPrice : priceDTO, (i11 & 32768) != 0 ? orderVO.secondPrice : priceDTO2);
        }

        @NotNull
        public final OrderVO copy(long id2, boolean isWide, @NotNull BadgeDTO badge, String formattedRemainTime, long timeToPay, long displayTimerValue, @NotNull TextDTO title, @NotNull TextDTO dates, @NotNull TextDTO detail, BadgeDTO priceBadge, @NotNull List<IconDTO> routeIcons, @NotNull AtomAction clickAction, Map<String, TokenizedTrackingInfo> viewTracking, Map<String, TokenizedTrackingInfo> clickTracking, PriceDTO firstPrice, PriceDTO secondPrice) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(routeIcons, "routeIcons");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            return new OrderVO(id2, isWide, badge, formattedRemainTime, timeToPay, displayTimerValue, title, dates, detail, priceBadge, routeIcons, clickAction, viewTracking, clickTracking, firstPrice, secondPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderVO)) {
                return false;
            }
            OrderVO orderVO = (OrderVO) other;
            return this.id == orderVO.id && this.isWide == orderVO.isWide && Intrinsics.d(this.badge, orderVO.badge) && Intrinsics.d(this.formattedRemainTime, orderVO.formattedRemainTime) && this.timeToPay == orderVO.timeToPay && this.displayTimerValue == orderVO.displayTimerValue && Intrinsics.d(this.title, orderVO.title) && Intrinsics.d(this.dates, orderVO.dates) && Intrinsics.d(this.detail, orderVO.detail) && Intrinsics.d(this.priceBadge, orderVO.priceBadge) && Intrinsics.d(this.routeIcons, orderVO.routeIcons) && Intrinsics.d(this.clickAction, orderVO.clickAction) && Intrinsics.d(this.viewTracking, orderVO.viewTracking) && Intrinsics.d(this.clickTracking, orderVO.clickTracking) && Intrinsics.d(this.firstPrice, orderVO.firstPrice) && Intrinsics.d(this.secondPrice, orderVO.secondPrice);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> getClickTracking() {
            return this.clickTracking;
        }

        @NotNull
        public final TextDTO getDates() {
            return this.dates;
        }

        @NotNull
        public final TextDTO getDetail() {
            return this.detail;
        }

        public final long getDisplayTimerValue() {
            return this.displayTimerValue;
        }

        public final PriceDTO getFirstPrice() {
            return this.firstPrice;
        }

        public final String getFormattedRemainTime() {
            return this.formattedRemainTime;
        }

        public final long getId() {
            return this.id;
        }

        public final BadgeDTO getPriceBadge() {
            return this.priceBadge;
        }

        @NotNull
        public final List<IconDTO> getRouteIcons() {
            return this.routeIcons;
        }

        public final PriceDTO getSecondPrice() {
            return this.secondPrice;
        }

        public final long getTimeToPay() {
            return this.timeToPay;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTracking() {
            return this.viewTracking;
        }

        public int hashCode() {
            int c11 = C3124a.c(this.badge, C3532b.a(Long.hashCode(this.id) * 31, 31, this.isWide), 31);
            String str = this.formattedRemainTime;
            int a11 = b.a(this.detail, b.a(this.dates, b.a(this.title, Pk0.c.a(Pk0.c.a((c11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.timeToPay), 31, this.displayTimerValue), 31), 31), 31);
            BadgeDTO badgeDTO = this.priceBadge;
            int a12 = C4598rp.a(this.clickAction, g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.routeIcons), 31);
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.clickTracking;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            PriceDTO priceDTO = this.firstPrice;
            int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            PriceDTO priceDTO2 = this.secondPrice;
            return hashCode3 + (priceDTO2 != null ? priceDTO2.hashCode() : 0);
        }

        /* renamed from: isWide, reason: from getter */
        public final boolean getIsWide() {
            return this.isWide;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            boolean z11 = this.isWide;
            BadgeDTO badgeDTO = this.badge;
            String str = this.formattedRemainTime;
            long j12 = this.timeToPay;
            long j13 = this.displayTimerValue;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.dates;
            TextDTO textDTO3 = this.detail;
            BadgeDTO badgeDTO2 = this.priceBadge;
            List<IconDTO> list = this.routeIcons;
            AtomAction atomAction = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            Map<String, TokenizedTrackingInfo> map2 = this.clickTracking;
            PriceDTO priceDTO = this.firstPrice;
            PriceDTO priceDTO2 = this.secondPrice;
            StringBuilder c11 = Bl.b.c(j11, "OrderVO(id=", ", isWide=", z11);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(", formattedRemainTime=");
            c11.append(str);
            C2942q.f(c11, ", timeToPay=", j12, ", displayTimerValue=");
            c11.append(j13);
            c11.append(", title=");
            c11.append(textDTO);
            D3.g.i(", dates=", ", detail=", c11, textDTO2, textDTO3);
            c11.append(", priceBadge=");
            c11.append(badgeDTO2);
            c11.append(", routeIcons=");
            c11.append(list);
            c11.append(", clickAction=");
            c11.append(atomAction);
            c11.append(", viewTracking=");
            c11.append(map);
            c11.append(", clickTracking=");
            c11.append(map2);
            c11.append(", firstPrice=");
            c11.append(priceDTO);
            c11.append(", secondPrice=");
            c11.append(priceDTO2);
            c11.append(")");
            return c11.toString();
        }

        public /* synthetic */ OrderVO(long j11, boolean z11, BadgeDTO badgeDTO, String str, long j12, long j13, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, BadgeDTO badgeDTO2, List list, AtomAction atomAction, Map map, Map map2, PriceDTO priceDTO, PriceDTO priceDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, z11, badgeDTO, (i11 & 8) != 0 ? null : str, j12, j13, textDTO, textDTO2, textDTO3, badgeDTO2, list, atomAction, map, map2, priceDTO, priceDTO2);
        }
    }
}

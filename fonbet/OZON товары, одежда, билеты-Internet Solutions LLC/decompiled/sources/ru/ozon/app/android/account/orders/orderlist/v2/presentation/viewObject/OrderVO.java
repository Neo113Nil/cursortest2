package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import Ak.C2436a;
import G.g;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b*\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "Ll20/c;", "", "id", "", "date", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "subtitle", "number", "deeplink", "icon", "Lru/ozon/uni/atoms/data/badge/Badge;", "status", "", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;", "sections", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;", "progressiveDiscount", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderProgressVO;", "orderProgress", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderProgressVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getDate", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "getSubtitle", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "getNumber", "getDeeplink", "getIcon", "Lru/ozon/uni/atoms/data/badge/Badge;", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;", "getProgressiveDiscount", "()Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderProgressVO;", "getOrderProgress", "()Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderProgressVO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderVO implements c {

    @NotNull
    private final String date;

    @NotNull
    private final String deeplink;
    private final String icon;
    private final long id;

    @NotNull
    private final String number;
    private final OrderProgressVO orderProgress;
    private final ProgressiveDiscountVO progressiveDiscount;
    private final List<SectionVO> sections;
    private final Badge status;
    private final CommonText.TextMedium subtitle;

    public OrderVO(long j11, @NotNull String date, CommonText.TextMedium textMedium, @NotNull String number, @NotNull String deeplink, String str, Badge badge, List<SectionVO> list, ProgressiveDiscountVO progressiveDiscountVO, OrderProgressVO orderProgressVO) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.id = j11;
        this.date = date;
        this.subtitle = textMedium;
        this.number = number;
        this.deeplink = deeplink;
        this.icon = str;
        this.status = badge;
        this.sections = list;
        this.progressiveDiscount = progressiveDiscountVO;
        this.orderProgress = orderProgressVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderVO)) {
            return false;
        }
        OrderVO orderVO = (OrderVO) other;
        return this.id == orderVO.id && Intrinsics.d(this.date, orderVO.date) && Intrinsics.d(this.subtitle, orderVO.subtitle) && Intrinsics.d(this.number, orderVO.number) && Intrinsics.d(this.deeplink, orderVO.deeplink) && Intrinsics.d(this.icon, orderVO.icon) && Intrinsics.d(this.status, orderVO.status) && Intrinsics.d(this.sections, orderVO.sections) && Intrinsics.d(this.progressiveDiscount, orderVO.progressiveDiscount) && Intrinsics.d(this.orderProgress, orderVO.orderProgress);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public final OrderProgressVO getOrderProgress() {
        return this.orderProgress;
    }

    public final ProgressiveDiscountVO getProgressiveDiscount() {
        return this.progressiveDiscount;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<SectionVO> getSections() {
        return this.sections;
    }

    public final Badge getStatus() {
        return this.status;
    }

    public final CommonText.TextMedium getSubtitle() {
        return this.subtitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.date);
        CommonText.TextMedium textMedium = this.subtitle;
        int a12 = g.a(g.a((a11 + (textMedium == null ? 0 : textMedium.hashCode())) * 31, 31, this.number), 31, this.deeplink);
        String str = this.icon;
        int hashCode = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        Badge badge = this.status;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        List<SectionVO> list = this.sections;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ProgressiveDiscountVO progressiveDiscountVO = this.progressiveDiscount;
        int hashCode4 = (hashCode3 + (progressiveDiscountVO == null ? 0 : progressiveDiscountVO.hashCode())) * 31;
        OrderProgressVO orderProgressVO = this.orderProgress;
        return hashCode4 + (orderProgressVO != null ? orderProgressVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.date;
        CommonText.TextMedium textMedium = this.subtitle;
        String str2 = this.number;
        String str3 = this.deeplink;
        String str4 = this.icon;
        Badge badge = this.status;
        List<SectionVO> list = this.sections;
        ProgressiveDiscountVO progressiveDiscountVO = this.progressiveDiscount;
        OrderProgressVO orderProgressVO = this.orderProgress;
        StringBuilder c11 = C2436a.c(j11, "OrderVO(id=", ", date=", str);
        c11.append(", subtitle=");
        c11.append(textMedium);
        c11.append(", number=");
        c11.append(str2);
        a.h(c11, ", deeplink=", str3, ", icon=", str4);
        c11.append(", status=");
        c11.append(badge);
        c11.append(", sections=");
        c11.append(list);
        c11.append(", progressiveDiscount=");
        c11.append(progressiveDiscountVO);
        c11.append(", orderProgress=");
        c11.append(orderProgressVO);
        c11.append(")");
        return c11.toString();
    }
}

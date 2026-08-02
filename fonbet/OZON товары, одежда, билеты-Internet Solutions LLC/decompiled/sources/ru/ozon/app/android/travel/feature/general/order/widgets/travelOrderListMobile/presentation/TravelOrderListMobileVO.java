package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation;

import Ak.C2436a;
import B0.C2454a;
import De.C2860c;
import G.g;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b.\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b/\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b0\u0010\u001dR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010;\u001a\u0004\b\u0019\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "orderNumber", "subtitle", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "orderTypeName", "orderStatusName", "orderStatusColor", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomsList", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "badges", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "debtAlert", "deeplink", "", "rating", "", "isRatingVisible", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getOrderNumber", "getSubtitle", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getOrderTypeName", "getOrderStatusName", "getOrderStatusColor", "Ljava/util/List;", "getAtomsList", "()Ljava/util/List;", "getBadges", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDebtAlert", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDeeplink", "I", "getRating", "Z", "()Z", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelOrderListMobileVO implements c {
    private final List<AtomDTO> atomsList;
    private final List<TravelBadgeDTO> badges;
    private final DisclaimerAtom debtAlert;

    @NotNull
    private final String deeplink;
    private final Icon icon;
    private final long id;
    private final boolean isRatingVisible;

    @NotNull
    private final String orderNumber;

    @NotNull
    private final String orderStatusColor;

    @NotNull
    private final String orderStatusName;

    @NotNull
    private final String orderTypeName;
    private final int rating;
    private final String subtitle;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TravelOrderListMobileVO(long j11, @NotNull String title, @NotNull String orderNumber, String str, Icon icon, @NotNull String orderTypeName, @NotNull String orderStatusName, @NotNull String orderStatusColor, List<? extends AtomDTO> list, List<TravelBadgeDTO> list2, DisclaimerAtom disclaimerAtom, @NotNull String deeplink, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(orderTypeName, "orderTypeName");
        Intrinsics.checkNotNullParameter(orderStatusName, "orderStatusName");
        Intrinsics.checkNotNullParameter(orderStatusColor, "orderStatusColor");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.id = j11;
        this.title = title;
        this.orderNumber = orderNumber;
        this.subtitle = str;
        this.icon = icon;
        this.orderTypeName = orderTypeName;
        this.orderStatusName = orderStatusName;
        this.orderStatusColor = orderStatusColor;
        this.atomsList = list;
        this.badges = list2;
        this.debtAlert = disclaimerAtom;
        this.deeplink = deeplink;
        this.rating = i11;
        this.isRatingVisible = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderListMobileVO)) {
            return false;
        }
        TravelOrderListMobileVO travelOrderListMobileVO = (TravelOrderListMobileVO) other;
        return this.id == travelOrderListMobileVO.id && Intrinsics.d(this.title, travelOrderListMobileVO.title) && Intrinsics.d(this.orderNumber, travelOrderListMobileVO.orderNumber) && Intrinsics.d(this.subtitle, travelOrderListMobileVO.subtitle) && Intrinsics.d(this.icon, travelOrderListMobileVO.icon) && Intrinsics.d(this.orderTypeName, travelOrderListMobileVO.orderTypeName) && Intrinsics.d(this.orderStatusName, travelOrderListMobileVO.orderStatusName) && Intrinsics.d(this.orderStatusColor, travelOrderListMobileVO.orderStatusColor) && Intrinsics.d(this.atomsList, travelOrderListMobileVO.atomsList) && Intrinsics.d(this.badges, travelOrderListMobileVO.badges) && Intrinsics.d(this.debtAlert, travelOrderListMobileVO.debtAlert) && Intrinsics.d(this.deeplink, travelOrderListMobileVO.deeplink) && this.rating == travelOrderListMobileVO.rating && this.isRatingVisible == travelOrderListMobileVO.isRatingVisible;
    }

    public final List<AtomDTO> getAtomsList() {
        return this.atomsList;
    }

    public final List<TravelBadgeDTO> getBadges() {
        return this.badges;
    }

    public final DisclaimerAtom getDebtAlert() {
        return this.debtAlert;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getOrderStatusColor() {
        return this.orderStatusColor;
    }

    @NotNull
    public final String getOrderStatusName() {
        return this.orderStatusName;
    }

    @NotNull
    public final String getOrderTypeName() {
        return this.orderTypeName;
    }

    public final int getRating() {
        return this.rating;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.orderNumber);
        String str = this.subtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int a12 = g.a(g.a(g.a((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.orderTypeName), 31, this.orderStatusName), 31, this.orderStatusColor);
        List<AtomDTO> list = this.atomsList;
        int hashCode2 = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        List<TravelBadgeDTO> list2 = this.badges;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.debtAlert;
        return Boolean.hashCode(this.isRatingVisible) + C2454a.a(this.rating, g.a((hashCode3 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0)) * 31, 31, this.deeplink), 31);
    }

    /* renamed from: isRatingVisible, reason: from getter */
    public final boolean getIsRatingVisible() {
        return this.isRatingVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.orderNumber;
        String str3 = this.subtitle;
        Icon icon = this.icon;
        String str4 = this.orderTypeName;
        String str5 = this.orderStatusName;
        String str6 = this.orderStatusColor;
        List<AtomDTO> list = this.atomsList;
        List<TravelBadgeDTO> list2 = this.badges;
        DisclaimerAtom disclaimerAtom = this.debtAlert;
        String str7 = this.deeplink;
        int i11 = this.rating;
        boolean z11 = this.isRatingVisible;
        StringBuilder c11 = C2436a.c(j11, "TravelOrderListMobileVO(id=", ", title=", str);
        a.h(c11, ", orderNumber=", str2, ", subtitle=", str3);
        c11.append(", icon=");
        c11.append(icon);
        c11.append(", orderTypeName=");
        c11.append(str4);
        a.h(c11, ", orderStatusName=", str5, ", orderStatusColor=", str6);
        C2860c.g(", atomsList=", ", badges=", c11, list, list2);
        c11.append(", debtAlert=");
        c11.append(disclaimerAtom);
        c11.append(", deeplink=");
        c11.append(str7);
        c11.append(", rating=");
        c11.append(i11);
        c11.append(", isRatingVisible=");
        c11.append(z11);
        c11.append(")");
        return c11.toString();
    }
}

package ru.ozon.app.android.travel.feature.general.order.widgets.orderHeader.presentation;

import B90.C2619v;
import Bl.C2639a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderHeader/presentation/OrderHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "orderStatus", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getOrderStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderHeaderVO implements c {
    private final DisclaimerAtom disclaimer;
    private final long id;

    @NotNull
    private final Badge orderStatus;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public OrderHeaderVO(long j11, @NotNull TextAtom title, @NotNull Badge orderStatus, DisclaimerAtom disclaimerAtom, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        this.id = j11;
        this.title = title;
        this.orderStatus = orderStatus;
        this.disclaimer = disclaimerAtom;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHeaderVO)) {
            return false;
        }
        OrderHeaderVO orderHeaderVO = (OrderHeaderVO) other;
        return this.id == orderHeaderVO.id && Intrinsics.d(this.title, orderHeaderVO.title) && Intrinsics.d(this.orderStatus, orderHeaderVO.orderStatus) && Intrinsics.d(this.disclaimer, orderHeaderVO.disclaimer) && Intrinsics.d(this.viewEvent, orderHeaderVO.viewEvent);
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Badge getOrderStatus() {
        return this.orderStatus;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.orderStatus.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title)) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode2 = (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        Badge badge = this.orderStatus;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("OrderHeaderVO(id=", j11, ", title=", textAtom);
        c11.append(", orderStatus=");
        c11.append(badge);
        c11.append(", disclaimer=");
        c11.append(disclaimerAtom);
        return a.b(c11, ", viewEvent=", tVar, ")");
    }
}

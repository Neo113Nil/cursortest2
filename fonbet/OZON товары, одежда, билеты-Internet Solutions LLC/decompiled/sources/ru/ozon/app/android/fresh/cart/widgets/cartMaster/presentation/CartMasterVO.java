package ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation;

import D3.h;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartSummaryItemVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "<init>", "(JLWZ/t;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getSummary", "()Ljava/util/List;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartMasterVO implements c {
    private final long id;
    private final List<CartSummaryItemVO> summary;

    @NotNull
    private final t tokenizedEvent;

    public CartMasterVO(long j11, @NotNull t tokenizedEvent, List<CartSummaryItemVO> list) {
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        this.id = j11;
        this.tokenizedEvent = tokenizedEvent;
        this.summary = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartMasterVO)) {
            return false;
        }
        CartMasterVO cartMasterVO = (CartMasterVO) other;
        return this.id == cartMasterVO.id && Intrinsics.d(this.tokenizedEvent, cartMasterVO.tokenizedEvent) && Intrinsics.d(this.summary, cartMasterVO.summary);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<CartSummaryItemVO> getSummary() {
        return this.summary;
    }

    @NotNull
    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.tokenizedEvent.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        List<CartSummaryItemVO> list = this.summary;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        t tVar = this.tokenizedEvent;
        List<CartSummaryItemVO> list = this.summary;
        StringBuilder sb2 = new StringBuilder("CartMasterVO(id=");
        sb2.append(j11);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        return h.c(sb2, ", summary=", list, ")");
    }
}

package ru.ozon.app.android.cart.master.presentation;

import De.C2860c;
import WZ.t;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/master/presentation/MasterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "summaryFamily", "", "nextTabDeeplink", "<init>", "(JLWZ/t;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getSummary", "()Ljava/util/List;", "getSummaryFamily", "Ljava/lang/String;", "getNextTabDeeplink", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MasterVO implements c {
    private final long id;
    private final String nextTabDeeplink;
    private final List<CartSummaryItemVO> summary;
    private final List<CartSummaryItemVO> summaryFamily;
    private final t tokenizedEvent;

    public MasterVO(long j11, t tVar, List<CartSummaryItemVO> list, List<CartSummaryItemVO> list2, String str) {
        this.id = j11;
        this.tokenizedEvent = tVar;
        this.summary = list;
        this.summaryFamily = list2;
        this.nextTabDeeplink = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MasterVO)) {
            return false;
        }
        MasterVO masterVO = (MasterVO) other;
        return this.id == masterVO.id && Intrinsics.d(this.tokenizedEvent, masterVO.tokenizedEvent) && Intrinsics.d(this.summary, masterVO.summary) && Intrinsics.d(this.summaryFamily, masterVO.summaryFamily) && Intrinsics.d(this.nextTabDeeplink, masterVO.nextTabDeeplink);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getNextTabDeeplink() {
        return this.nextTabDeeplink;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<CartSummaryItemVO> getSummary() {
        return this.summary;
    }

    public final List<CartSummaryItemVO> getSummaryFamily() {
        return this.summaryFamily;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<CartSummaryItemVO> list = this.summary;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CartSummaryItemVO> list2 = this.summaryFamily;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextTabDeeplink;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        t tVar = this.tokenizedEvent;
        List<CartSummaryItemVO> list = this.summary;
        List<CartSummaryItemVO> list2 = this.summaryFamily;
        String str = this.nextTabDeeplink;
        StringBuilder sb2 = new StringBuilder("MasterVO(id=");
        sb2.append(j11);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        C2860c.g(", summary=", ", summaryFamily=", sb2, list, list2);
        return C6594f.a(", nextTabDeeplink=", str, ")", sb2);
    }
}

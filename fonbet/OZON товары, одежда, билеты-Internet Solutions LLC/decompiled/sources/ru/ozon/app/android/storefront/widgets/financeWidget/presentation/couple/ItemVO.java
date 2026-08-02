package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple;

import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "balanceState", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "promoState", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "isCompactSize", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "getBalanceState", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "getPromoState", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ItemVO {
    private final AtomAction action;
    private final String backgroundColor;
    private final FinanceWidgetDTO.ItemDTO.BalanceState balanceState;
    private final boolean isCompactSize;
    private final FinanceWidgetDTO.ItemDTO.PromoState promoState;
    private final t tokenizedEvent;

    public ItemVO(FinanceWidgetDTO.ItemDTO.BalanceState balanceState, FinanceWidgetDTO.ItemDTO.PromoState promoState, String str, AtomAction atomAction, t tVar, boolean z11) {
        this.balanceState = balanceState;
        this.promoState = promoState;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.isCompactSize = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVO)) {
            return false;
        }
        ItemVO itemVO = (ItemVO) other;
        return Intrinsics.d(this.balanceState, itemVO.balanceState) && Intrinsics.d(this.promoState, itemVO.promoState) && Intrinsics.d(this.backgroundColor, itemVO.backgroundColor) && Intrinsics.d(this.action, itemVO.action) && Intrinsics.d(this.tokenizedEvent, itemVO.tokenizedEvent) && this.isCompactSize == itemVO.isCompactSize;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FinanceWidgetDTO.ItemDTO.BalanceState getBalanceState() {
        return this.balanceState;
    }

    public final FinanceWidgetDTO.ItemDTO.PromoState getPromoState() {
        return this.promoState;
    }

    public int hashCode() {
        FinanceWidgetDTO.ItemDTO.BalanceState balanceState = this.balanceState;
        int hashCode = (balanceState == null ? 0 : balanceState.hashCode()) * 31;
        FinanceWidgetDTO.ItemDTO.PromoState promoState = this.promoState;
        int hashCode2 = (hashCode + (promoState == null ? 0 : promoState.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isCompactSize) + ((hashCode4 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isCompactSize, reason: from getter */
    public final boolean getIsCompactSize() {
        return this.isCompactSize;
    }

    @NotNull
    public String toString() {
        FinanceWidgetDTO.ItemDTO.BalanceState balanceState = this.balanceState;
        FinanceWidgetDTO.ItemDTO.PromoState promoState = this.promoState;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.isCompactSize;
        StringBuilder sb2 = new StringBuilder("ItemVO(balanceState=");
        sb2.append(balanceState);
        sb2.append(", promoState=");
        sb2.append(promoState);
        sb2.append(", backgroundColor=");
        b.d(str, ", action=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(tVar);
        sb2.append(", isCompactSize=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }
}

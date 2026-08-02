package ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.data.FinanceWidgetCardDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidgetV2/presentation/FinanceWidgetV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "leftCard", "rightCard", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "getLeftCard", "()Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "getRightCard", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinanceWidgetV2VO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final FinanceWidgetCardDTO leftCard;
    private final FinanceWidgetCardDTO rightCard;
    private final t tokenizedEvent;

    public FinanceWidgetV2VO(long j11, @NotNull FinanceWidgetCardDTO leftCard, FinanceWidgetCardDTO financeWidgetCardDTO, String str, t tVar) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        this.id = j11;
        this.leftCard = leftCard;
        this.rightCard = financeWidgetCardDTO;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceWidgetV2VO)) {
            return false;
        }
        FinanceWidgetV2VO financeWidgetV2VO = (FinanceWidgetV2VO) other;
        return this.id == financeWidgetV2VO.id && Intrinsics.d(this.leftCard, financeWidgetV2VO.leftCard) && Intrinsics.d(this.rightCard, financeWidgetV2VO.rightCard) && Intrinsics.d(this.backgroundColor, financeWidgetV2VO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, financeWidgetV2VO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FinanceWidgetCardDTO getLeftCard() {
        return this.leftCard;
    }

    public final FinanceWidgetCardDTO getRightCard() {
        return this.rightCard;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.leftCard.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        FinanceWidgetCardDTO financeWidgetCardDTO = this.rightCard;
        int hashCode2 = (hashCode + (financeWidgetCardDTO == null ? 0 : financeWidgetCardDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FinanceWidgetCardDTO financeWidgetCardDTO = this.leftCard;
        FinanceWidgetCardDTO financeWidgetCardDTO2 = this.rightCard;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("FinanceWidgetV2VO(id=");
        sb2.append(j11);
        sb2.append(", leftCard=");
        sb2.append(financeWidgetCardDTO);
        sb2.append(", rightCard=");
        sb2.append(financeWidgetCardDTO2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}

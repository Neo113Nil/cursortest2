package spay.sdk.domain.model;

import Ve.AbstractC4245fi;
import Ve.Bq;
import Ve.Jr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/OrderScreenOutcome;", "", "LVe/fi;", "listCardsOutcome", "bnplOutcome", "spasiboOutcome", "<init>", "(LVe/fi;LVe/fi;LVe/fi;)V", "component1", "()LVe/fi;", "component2", "component3", "copy", "(LVe/fi;LVe/fi;LVe/fi;)Lspay/sdk/domain/model/OrderScreenOutcome;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVe/fi;", "getListCardsOutcome", "getBnplOutcome", "getSpasiboOutcome", "isLoading", "()Z", "isNetworkError", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderScreenOutcome {
    private final AbstractC4245fi bnplOutcome;

    @NotNull
    private final AbstractC4245fi listCardsOutcome;
    private final AbstractC4245fi spasiboOutcome;

    public OrderScreenOutcome(@NotNull AbstractC4245fi listCardsOutcome, AbstractC4245fi abstractC4245fi, AbstractC4245fi abstractC4245fi2) {
        Intrinsics.checkNotNullParameter(listCardsOutcome, "listCardsOutcome");
        this.listCardsOutcome = listCardsOutcome;
        this.bnplOutcome = abstractC4245fi;
        this.spasiboOutcome = abstractC4245fi2;
    }

    public static /* synthetic */ OrderScreenOutcome copy$default(OrderScreenOutcome orderScreenOutcome, AbstractC4245fi abstractC4245fi, AbstractC4245fi abstractC4245fi2, AbstractC4245fi abstractC4245fi3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC4245fi = orderScreenOutcome.listCardsOutcome;
        }
        if ((i11 & 2) != 0) {
            abstractC4245fi2 = orderScreenOutcome.bnplOutcome;
        }
        if ((i11 & 4) != 0) {
            abstractC4245fi3 = orderScreenOutcome.spasiboOutcome;
        }
        return orderScreenOutcome.copy(abstractC4245fi, abstractC4245fi2, abstractC4245fi3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AbstractC4245fi getListCardsOutcome() {
        return this.listCardsOutcome;
    }

    /* renamed from: component2, reason: from getter */
    public final AbstractC4245fi getBnplOutcome() {
        return this.bnplOutcome;
    }

    /* renamed from: component3, reason: from getter */
    public final AbstractC4245fi getSpasiboOutcome() {
        return this.spasiboOutcome;
    }

    @NotNull
    public final OrderScreenOutcome copy(@NotNull AbstractC4245fi listCardsOutcome, AbstractC4245fi bnplOutcome, AbstractC4245fi spasiboOutcome) {
        Intrinsics.checkNotNullParameter(listCardsOutcome, "listCardsOutcome");
        return new OrderScreenOutcome(listCardsOutcome, bnplOutcome, spasiboOutcome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderScreenOutcome)) {
            return false;
        }
        OrderScreenOutcome orderScreenOutcome = (OrderScreenOutcome) other;
        return Intrinsics.d(this.listCardsOutcome, orderScreenOutcome.listCardsOutcome) && Intrinsics.d(this.bnplOutcome, orderScreenOutcome.bnplOutcome) && Intrinsics.d(this.spasiboOutcome, orderScreenOutcome.spasiboOutcome);
    }

    public final AbstractC4245fi getBnplOutcome() {
        return this.bnplOutcome;
    }

    @NotNull
    public final AbstractC4245fi getListCardsOutcome() {
        return this.listCardsOutcome;
    }

    public final AbstractC4245fi getSpasiboOutcome() {
        return this.spasiboOutcome;
    }

    public int hashCode() {
        int hashCode = this.listCardsOutcome.hashCode() * 31;
        AbstractC4245fi abstractC4245fi = this.bnplOutcome;
        int hashCode2 = (hashCode + (abstractC4245fi == null ? 0 : abstractC4245fi.hashCode())) * 31;
        AbstractC4245fi abstractC4245fi2 = this.spasiboOutcome;
        return hashCode2 + (abstractC4245fi2 != null ? abstractC4245fi2.hashCode() : 0);
    }

    public final boolean isLoading() {
        List b02 = C7714v.b0(this.listCardsOutcome, this.bnplOutcome, this.spasiboOutcome);
        if ((b02 instanceof Collection) && b02.isEmpty()) {
            return false;
        }
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            if (((AbstractC4245fi) it.next()) instanceof Bq) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNetworkError() {
        List b02 = C7714v.b0(this.listCardsOutcome, this.bnplOutcome, this.spasiboOutcome);
        if ((b02 instanceof Collection) && b02.isEmpty()) {
            return false;
        }
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            if (((AbstractC4245fi) it.next()) instanceof Jr) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "OrderScreenOutcome(listCardsOutcome=" + this.listCardsOutcome + ", bnplOutcome=" + this.bnplOutcome + ", spasiboOutcome=" + this.spasiboOutcome + ")";
    }
}

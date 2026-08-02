package ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewObject;

import De.C2859b;
import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewObject/PaginationVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "previous", "next", "", "scrollKey", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPrevious", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNext", "Ljava/lang/Integer;", "getScrollKey", "()Ljava/lang/Integer;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaginationVO implements c {
    private final long id;

    @NotNull
    private final ButtonV3DTO next;

    @NotNull
    private final ButtonV3DTO previous;
    private final Integer scrollKey;

    public PaginationVO(long j11, @NotNull ButtonV3DTO previous, @NotNull ButtonV3DTO next, Integer num) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(next, "next");
        this.id = j11;
        this.previous = previous;
        this.next = next;
        this.scrollKey = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationVO)) {
            return false;
        }
        PaginationVO paginationVO = (PaginationVO) other;
        return this.id == paginationVO.id && Intrinsics.d(this.previous, paginationVO.previous) && Intrinsics.d(this.next, paginationVO.next) && Intrinsics.d(this.scrollKey, paginationVO.scrollKey);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getNext() {
        return this.next;
    }

    @NotNull
    public final ButtonV3DTO getPrevious() {
        return this.previous;
    }

    public final Integer getScrollKey() {
        return this.scrollKey;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.next, C2859b.c(this.previous, Long.hashCode(this.id) * 31, 31), 31);
        Integer num = this.scrollKey;
        return c11 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.previous;
        ButtonV3DTO buttonV3DTO2 = this.next;
        Integer num = this.scrollKey;
        StringBuilder c11 = G.c("PaginationVO(id=", j11, ", previous=", buttonV3DTO);
        c11.append(", next=");
        c11.append(buttonV3DTO2);
        c11.append(", scrollKey=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }
}

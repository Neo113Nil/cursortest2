package ru.ozon.app.android.returns.details.presentation.viewObject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.presentation.viewObject.ReturnTotalVO;
import ru.ozon.app.android.returns.details.data.dto.ReturnDetailsDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b+\u0010$¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnDetailsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "status", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "components", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "items", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "total", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "availableActions", "<init>", "(JLru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;Ljava/util/List;Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "getStatus", "()Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "getItems", "()Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "getTotal", "()Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "getAvailableActions", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnDetailsVO implements c {
    private final List<ButtonV3Atom.SmallButton> availableActions;
    private final List<ReturnDetailsDto.Component> components;
    private final long id;

    @NotNull
    private final ReturnItemsVO items;

    @NotNull
    private final ReturnStatusDto status;
    private final ReturnTotalVO total;

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnDetailsVO(long j11, @NotNull ReturnStatusDto status, List<? extends ReturnDetailsDto.Component> list, @NotNull ReturnItemsVO items, ReturnTotalVO returnTotalVO, List<ButtonV3Atom.SmallButton> list2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.status = status;
        this.components = list;
        this.items = items;
        this.total = returnTotalVO;
        this.availableActions = list2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnDetailsVO)) {
            return false;
        }
        ReturnDetailsVO returnDetailsVO = (ReturnDetailsVO) other;
        return this.id == returnDetailsVO.id && Intrinsics.d(this.status, returnDetailsVO.status) && Intrinsics.d(this.components, returnDetailsVO.components) && Intrinsics.d(this.items, returnDetailsVO.items) && Intrinsics.d(this.total, returnDetailsVO.total) && Intrinsics.d(this.availableActions, returnDetailsVO.availableActions);
    }

    public final List<ButtonV3Atom.SmallButton> getAvailableActions() {
        return this.availableActions;
    }

    public final List<ReturnDetailsDto.Component> getComponents() {
        return this.components;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ReturnItemsVO getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ReturnStatusDto getStatus() {
        return this.status;
    }

    public final ReturnTotalVO getTotal() {
        return this.total;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        List<ReturnDetailsDto.Component> list = this.components;
        int hashCode2 = (this.items.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        ReturnTotalVO returnTotalVO = this.total;
        int hashCode3 = (hashCode2 + (returnTotalVO == null ? 0 : returnTotalVO.hashCode())) * 31;
        List<ButtonV3Atom.SmallButton> list2 = this.availableActions;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReturnDetailsVO(id=" + this.id + ", status=" + this.status + ", components=" + this.components + ", items=" + this.items + ", total=" + this.total + ", availableActions=" + this.availableActions + ")";
    }
}

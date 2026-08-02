package ru.ozon.app.android.cml.delivery.widgets.selectCategory.presentation;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/selectCategory/presentation/SelectCategoryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "cellItems", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCellItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectCategoryVO implements c {

    @NotNull
    private final List<CellItem> cellItems;

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final long id;
    private final t tokenizedEvent;

    public SelectCategoryVO(long j11, @NotNull List<CellItem> cellItems, @NotNull DisclaimerDTO disclaimer, t tVar) {
        Intrinsics.checkNotNullParameter(cellItems, "cellItems");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.id = j11;
        this.cellItems = cellItems;
        this.disclaimer = disclaimer;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCategoryVO)) {
            return false;
        }
        SelectCategoryVO selectCategoryVO = (SelectCategoryVO) other;
        return this.id == selectCategoryVO.id && Intrinsics.d(this.cellItems, selectCategoryVO.cellItems) && Intrinsics.d(this.disclaimer, selectCategoryVO.disclaimer) && Intrinsics.d(this.tokenizedEvent, selectCategoryVO.tokenizedEvent);
    }

    @NotNull
    public final List<CellItem> getCellItems() {
        return this.cellItems;
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int hashCode = (this.disclaimer.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.cellItems)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CellItem> list = this.cellItems;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "SelectCategoryVO(id=", ", cellItems=", list);
        b11.append(", disclaimer=");
        b11.append(disclaimerDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}

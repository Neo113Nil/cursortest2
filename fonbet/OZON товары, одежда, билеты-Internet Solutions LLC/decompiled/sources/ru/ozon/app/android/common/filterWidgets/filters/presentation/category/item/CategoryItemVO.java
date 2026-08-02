package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item;

import B0.C2454a;
import G.g;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "level", "", "originalUrl", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "cell", "<init>", "(JLjava/lang/Integer;ILjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "I", "getLevel", "Ljava/lang/String;", "getOriginalUrl", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CategoryItemVO implements c {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell;
    private final long id;
    private final int level;

    @NotNull
    private final String originalUrl;
    private final Integer scrollWidgetKey;

    public CategoryItemVO(long j11, Integer num, int i11, @NotNull String originalUrl, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.level = i11;
        this.originalUrl = originalUrl;
        this.cell = cell;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryItemVO)) {
            return false;
        }
        CategoryItemVO categoryItemVO = (CategoryItemVO) other;
        return this.id == categoryItemVO.id && Intrinsics.d(this.scrollWidgetKey, categoryItemVO.scrollWidgetKey) && this.level == categoryItemVO.level && Intrinsics.d(this.originalUrl, categoryItemVO.originalUrl) && Intrinsics.d(this.cell, categoryItemVO.cell);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        return this.cell.hashCode() + g.a(C2454a.a(this.level, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.originalUrl);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        int i11 = this.level;
        String str = this.originalUrl;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter = this.cell;
        StringBuilder c11 = a.c("CategoryItemVO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", level=");
        c11.append(i11);
        c11.append(", originalUrl=");
        c11.append(str);
        c11.append(", cell=");
        c11.append(cellWithSubtitleCheckboxRadioCounter);
        c11.append(")");
        return c11.toString();
    }
}

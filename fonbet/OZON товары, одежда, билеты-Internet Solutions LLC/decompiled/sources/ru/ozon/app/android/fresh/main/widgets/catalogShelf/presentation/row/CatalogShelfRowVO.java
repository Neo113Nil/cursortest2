package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

import Kk.C3532b;
import Lh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartVO;", "", "id", "", "scrollWidgetKey", "", "catalogueTabsConnectionTag", "", "topCorners", "bottomCorners", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "list", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getCatalogueTabsConnectionTag", "Z", "getTopCorners", "()Z", "getBottomCorners", "Ljava/util/List;", "getList", "()Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogShelfRowVO implements CatalogTabsPartVO {
    private final boolean bottomCorners;
    private final String catalogueTabsConnectionTag;
    private final long id;

    @NotNull
    private final List<CatalogShelfItemVO> list;
    private final Integer scrollWidgetKey;
    private final boolean topCorners;

    public CatalogShelfRowVO(long j11, Integer num, String str, boolean z11, boolean z12, @NotNull List<CatalogShelfItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.catalogueTabsConnectionTag = str;
        this.topCorners = z11;
        this.bottomCorners = z12;
        this.list = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogShelfRowVO)) {
            return false;
        }
        CatalogShelfRowVO catalogShelfRowVO = (CatalogShelfRowVO) other;
        return this.id == catalogShelfRowVO.id && Intrinsics.d(this.scrollWidgetKey, catalogShelfRowVO.scrollWidgetKey) && Intrinsics.d(this.catalogueTabsConnectionTag, catalogShelfRowVO.catalogueTabsConnectionTag) && this.topCorners == catalogShelfRowVO.topCorners && this.bottomCorners == catalogShelfRowVO.bottomCorners && Intrinsics.d(this.list, catalogShelfRowVO.list);
    }

    public final boolean getBottomCorners() {
        return this.bottomCorners;
    }

    @Override // ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO
    public String getCatalogueTabsConnectionTag() {
        return this.catalogueTabsConnectionTag;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CatalogShelfItemVO> getList() {
        return this.list;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final boolean getTopCorners() {
        return this.topCorners;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return CatalogTabsPartVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.catalogueTabsConnectionTag;
        return this.list.hashCode() + C3532b.a(C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.topCorners), 31, this.bottomCorners);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        String str = this.catalogueTabsConnectionTag;
        boolean z11 = this.topCorners;
        boolean z12 = this.bottomCorners;
        List<CatalogShelfItemVO> list = this.list;
        StringBuilder c11 = a.c("CatalogShelfRowVO(id=", j11, ", scrollWidgetKey=", num);
        D40.a.g(", catalogueTabsConnectionTag=", str, ", topCorners=", c11, z11);
        c11.append(", bottomCorners=");
        c11.append(z12);
        c11.append(", list=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}

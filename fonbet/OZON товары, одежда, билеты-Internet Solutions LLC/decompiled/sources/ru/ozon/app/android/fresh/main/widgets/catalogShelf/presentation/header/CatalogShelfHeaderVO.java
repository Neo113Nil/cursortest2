package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header;

import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2VO;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderVO;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartVO;", "", "id", "", "scrollWidgetKey", "", "catalogueTabsConnectionTag", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(JLjava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getCatalogueTabsConnectionTag", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogShelfHeaderVO implements CatalogTabsPartVO {
    private final String catalogueTabsConnectionTag;

    @NotNull
    private final HeaderV2VO header;
    private final long id;
    private final Integer scrollWidgetKey;

    public CatalogShelfHeaderVO(long j11, Integer num, String str, @NotNull HeaderV2VO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.catalogueTabsConnectionTag = str;
        this.header = header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogShelfHeaderVO)) {
            return false;
        }
        CatalogShelfHeaderVO catalogShelfHeaderVO = (CatalogShelfHeaderVO) other;
        return this.id == catalogShelfHeaderVO.id && Intrinsics.d(this.scrollWidgetKey, catalogShelfHeaderVO.scrollWidgetKey) && Intrinsics.d(this.catalogueTabsConnectionTag, catalogShelfHeaderVO.catalogueTabsConnectionTag) && Intrinsics.d(this.header, catalogShelfHeaderVO.header);
    }

    @Override // ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO
    public String getCatalogueTabsConnectionTag() {
        return this.catalogueTabsConnectionTag;
    }

    @NotNull
    public final HeaderV2VO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
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
        return this.header.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        String str = this.catalogueTabsConnectionTag;
        HeaderV2VO headerV2VO = this.header;
        StringBuilder c11 = a.c("CatalogShelfHeaderVO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", catalogueTabsConnectionTag=");
        c11.append(str);
        c11.append(", header=");
        c11.append(headerV2VO);
        c11.append(")");
        return c11.toString();
    }
}

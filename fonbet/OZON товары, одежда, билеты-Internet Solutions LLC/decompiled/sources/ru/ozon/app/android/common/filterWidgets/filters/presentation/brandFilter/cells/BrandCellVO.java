package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells;

import Am.C2438a;
import B0.C2454a;
import G.g;
import Lh.a;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001(B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "brand", "", "originalUrl", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "layoutModel", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;Ljava/lang/String;Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "getBrand", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "Ljava/lang/String;", "getOriginalUrl", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "LayoutModel", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandCellVO implements c {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio brand;
    private final long id;

    @NotNull
    private final LayoutModel layoutModel;

    @NotNull
    private final String originalUrl;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "", "", "paddingTop", "paddingBottom", "", "topCornerRadius", "bottomCornerRadius", "<init>", "(IIFF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingTop", "getPaddingBottom", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;
        private final int paddingBottom;
        private final int paddingTop;
        private final float topCornerRadius;

        public LayoutModel(int i11, int i12, float f7, float f11) {
            this.paddingTop = i11;
            this.paddingBottom = i12;
            this.topCornerRadius = f7;
            this.bottomCornerRadius = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return this.paddingTop == layoutModel.paddingTop && this.paddingBottom == layoutModel.paddingBottom && Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        public final int getPaddingBottom() {
            return this.paddingBottom;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public final float getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            return Float.hashCode(this.bottomCornerRadius) + b.a(this.topCornerRadius, C2454a.a(this.paddingBottom, Integer.hashCode(this.paddingTop) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingTop;
            int i12 = this.paddingBottom;
            float f7 = this.topCornerRadius;
            float f11 = this.bottomCornerRadius;
            StringBuilder a11 = C2438a.a("LayoutModel(paddingTop=", i11, ", paddingBottom=", ", topCornerRadius=", i12);
            a11.append(f7);
            a11.append(", bottomCornerRadius=");
            a11.append(f11);
            a11.append(")");
            return a11.toString();
        }
    }

    public BrandCellVO(long j11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio brand, @NotNull String originalUrl, @NotNull LayoutModel layoutModel, t tVar) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.id = j11;
        this.brand = brand;
        this.originalUrl = originalUrl;
        this.layoutModel = layoutModel;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandCellVO)) {
            return false;
        }
        BrandCellVO brandCellVO = (BrandCellVO) other;
        return this.id == brandCellVO.id && Intrinsics.d(this.brand, brandCellVO.brand) && Intrinsics.d(this.originalUrl, brandCellVO.originalUrl) && Intrinsics.d(this.layoutModel, brandCellVO.layoutModel) && Intrinsics.d(this.tokenizedEvent, brandCellVO.tokenizedEvent);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio getBrand() {
        return this.brand;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
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
        int hashCode = (this.layoutModel.hashCode() + g.a((this.brand.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.originalUrl)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio = this.brand;
        String str = this.originalUrl;
        LayoutModel layoutModel = this.layoutModel;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("BrandCellVO(id=");
        sb2.append(j11);
        sb2.append(", brand=");
        sb2.append(cellWithSubtitle40IconCheckboxRadio);
        sb2.append(", originalUrl=");
        sb2.append(str);
        sb2.append(", layoutModel=");
        sb2.append(layoutModel);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}

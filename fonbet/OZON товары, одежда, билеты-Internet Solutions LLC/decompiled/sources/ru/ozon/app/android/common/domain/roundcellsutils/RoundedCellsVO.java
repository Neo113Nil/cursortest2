package ru.ozon.app.android.common.domain.roundcellsutils;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Pk0.b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "layoutModel", "", "widgetBackgroundColor", "cellsBackgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "Ljava/lang/String;", "getWidgetBackgroundColor", "getCellsBackgroundColor", "LayoutModel", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RoundedCellsVO implements c {

    @NotNull
    private final AtomDTO cell;
    private final String cellsBackgroundColor;
    private final long id;

    @NotNull
    private final LayoutModel layoutModel;
    private final String widgetBackgroundColor;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "", "", "paddingTop", "paddingBottom", "marginTop", "marginBottom", "marginLeft", "marginRight", "", "topCornerRadius", "bottomCornerRadius", "<init>", "(IIIIIIFF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingTop", "getPaddingBottom", "getMarginTop", "getMarginBottom", "getMarginLeft", "getMarginRight", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "Companion", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;
        private final int marginBottom;
        private final int marginLeft;
        private final int marginRight;
        private final int marginTop;
        private final int paddingBottom;
        private final int paddingTop;
        private final float topCornerRadius;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final float cellsRadius = ResourceExtKt.toPxF(12);
        private static final int defaultHorizontalMargin = ResourceExtKt.toPx(16);
        private static final int defaultTopInset = ResourceExtKt.toPx(4);
        private static final int defaultBottomInset = ResourceExtKt.toPx(4);

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel$Companion;", "", "<init>", "()V", "cellsRadius", "", "defaultHorizontalMargin", "", "defaultTopInset", "defaultBottomInset", "createWithDefaultValues", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "paddingTop", "paddingBottom", "marginTop", "marginBottom", "marginLeft", "marginRight", "topCornerRadius", "bottomCornerRadius", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final LayoutModel createWithDefaultValues(Integer paddingTop, Integer paddingBottom, Integer marginTop, Integer marginBottom, Integer marginLeft, Integer marginRight, Float topCornerRadius, Float bottomCornerRadius) {
                return new LayoutModel(paddingTop != null ? paddingTop.intValue() : LayoutModel.defaultTopInset, paddingBottom != null ? paddingBottom.intValue() : LayoutModel.defaultBottomInset, marginTop != null ? marginTop.intValue() : 0, marginBottom != null ? marginBottom.intValue() : 0, marginLeft != null ? marginLeft.intValue() : LayoutModel.defaultHorizontalMargin, marginRight != null ? marginRight.intValue() : LayoutModel.defaultHorizontalMargin, topCornerRadius != null ? topCornerRadius.floatValue() : LayoutModel.cellsRadius, bottomCornerRadius != null ? bottomCornerRadius.floatValue() : LayoutModel.cellsRadius);
            }

            private Companion() {
            }
        }

        public LayoutModel(int i11, int i12, int i13, int i14, int i15, int i16, float f7, float f11) {
            this.paddingTop = i11;
            this.paddingBottom = i12;
            this.marginTop = i13;
            this.marginBottom = i14;
            this.marginLeft = i15;
            this.marginRight = i16;
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
            return this.paddingTop == layoutModel.paddingTop && this.paddingBottom == layoutModel.paddingBottom && this.marginTop == layoutModel.marginTop && this.marginBottom == layoutModel.marginBottom && this.marginLeft == layoutModel.marginLeft && this.marginRight == layoutModel.marginRight && Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        public final int getMarginBottom() {
            return this.marginBottom;
        }

        public final int getMarginLeft() {
            return this.marginLeft;
        }

        public final int getMarginRight() {
            return this.marginRight;
        }

        public final int getMarginTop() {
            return this.marginTop;
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
            return Float.hashCode(this.bottomCornerRadius) + b.a(this.topCornerRadius, C2454a.a(this.marginRight, C2454a.a(this.marginLeft, C2454a.a(this.marginBottom, C2454a.a(this.marginTop, C2454a.a(this.paddingBottom, Integer.hashCode(this.paddingTop) * 31, 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingTop;
            int i12 = this.paddingBottom;
            int i13 = this.marginTop;
            int i14 = this.marginBottom;
            int i15 = this.marginLeft;
            int i16 = this.marginRight;
            float f7 = this.topCornerRadius;
            float f11 = this.bottomCornerRadius;
            StringBuilder a11 = C2438a.a("LayoutModel(paddingTop=", i11, ", paddingBottom=", ", marginTop=", i12);
            a.f(i13, i14, ", marginBottom=", ", marginLeft=", a11);
            a.f(i15, i16, ", marginRight=", ", topCornerRadius=", a11);
            a11.append(f7);
            a11.append(", bottomCornerRadius=");
            a11.append(f11);
            a11.append(")");
            return a11.toString();
        }
    }

    public RoundedCellsVO(long j11, @NotNull AtomDTO cell, @NotNull LayoutModel layoutModel, String str, String str2) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.id = j11;
        this.cell = cell;
        this.layoutModel = layoutModel;
        this.widgetBackgroundColor = str;
        this.cellsBackgroundColor = str2;
    }

    public static /* synthetic */ RoundedCellsVO copy$default(RoundedCellsVO roundedCellsVO, long j11, AtomDTO atomDTO, LayoutModel layoutModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = roundedCellsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            atomDTO = roundedCellsVO.cell;
        }
        AtomDTO atomDTO2 = atomDTO;
        if ((i11 & 4) != 0) {
            layoutModel = roundedCellsVO.layoutModel;
        }
        LayoutModel layoutModel2 = layoutModel;
        if ((i11 & 8) != 0) {
            str = roundedCellsVO.widgetBackgroundColor;
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            str2 = roundedCellsVO.cellsBackgroundColor;
        }
        return roundedCellsVO.copy(j12, atomDTO2, layoutModel2, str3, str2);
    }

    @NotNull
    public final RoundedCellsVO copy(long id2, @NotNull AtomDTO cell, @NotNull LayoutModel layoutModel, String widgetBackgroundColor, String cellsBackgroundColor) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        return new RoundedCellsVO(id2, cell, layoutModel, widgetBackgroundColor, cellsBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCellsVO)) {
            return false;
        }
        RoundedCellsVO roundedCellsVO = (RoundedCellsVO) other;
        return this.id == roundedCellsVO.id && Intrinsics.d(this.cell, roundedCellsVO.cell) && Intrinsics.d(this.layoutModel, roundedCellsVO.layoutModel) && Intrinsics.d(this.widgetBackgroundColor, roundedCellsVO.widgetBackgroundColor) && Intrinsics.d(this.cellsBackgroundColor, roundedCellsVO.cellsBackgroundColor);
    }

    @NotNull
    public final AtomDTO getCell() {
        return this.cell;
    }

    public final String getCellsBackgroundColor() {
        return this.cellsBackgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int hashCode = (this.layoutModel.hashCode() + ((this.cell.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.widgetBackgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cellsBackgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomDTO atomDTO = this.cell;
        LayoutModel layoutModel = this.layoutModel;
        String str = this.widgetBackgroundColor;
        String str2 = this.cellsBackgroundColor;
        StringBuilder sb2 = new StringBuilder("RoundedCellsVO(id=");
        sb2.append(j11);
        sb2.append(", cell=");
        sb2.append(atomDTO);
        sb2.append(", layoutModel=");
        sb2.append(layoutModel);
        sb2.append(", widgetBackgroundColor=");
        sb2.append(str);
        return C6594f.a(", cellsBackgroundColor=", str2, ")", sb2);
    }
}

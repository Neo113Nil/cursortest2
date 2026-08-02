package ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import Ep.a;
import Pk0.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0080\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b-\u0010*R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "islandColor", "backgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftMargin", "rightMargin", "leftPadding", "rightPadding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "layoutModel", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;LWZ/t;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;LWZ/t;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;)Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIslandColor", "getBackgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightMargin", "getLeftPadding", "getRightPadding", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "LayoutModel", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CellV2VO implements c {
    private final String backgroundColor;

    @NotNull
    private final AtomDTO cell;
    private final long id;
    private final String islandColor;

    @NotNull
    private final LayoutModel layoutModel;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftMargin;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightMargin;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "", "", "paddingTop", "paddingBottom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "", "topCornerRadius", "bottomCornerRadius", "", "hasSeparator", "<init>", "(IILru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;FFZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingTop", "getPaddingBottom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "Z", "getHasSeparator", "()Z", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;

        @NotNull
        private final CommonCellSettings.LayoutPadding bottomMargin;
        private final boolean hasSeparator;
        private final int paddingBottom;
        private final int paddingTop;
        private final float topCornerRadius;

        @NotNull
        private final CommonCellSettings.LayoutPadding topMargin;

        public LayoutModel() {
            this(0, 0, null, null, 0.0f, 0.0f, false, 127, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return this.paddingTop == layoutModel.paddingTop && this.paddingBottom == layoutModel.paddingBottom && this.topMargin == layoutModel.topMargin && this.bottomMargin == layoutModel.bottomMargin && Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0 && this.hasSeparator == layoutModel.hasSeparator;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottomMargin() {
            return this.bottomMargin;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
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

        @NotNull
        public final CommonCellSettings.LayoutPadding getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasSeparator) + b.a(this.bottomCornerRadius, b.a(this.topCornerRadius, Ef0.c.a(this.bottomMargin, Ef0.c.a(this.topMargin, C2454a.a(this.paddingBottom, Integer.hashCode(this.paddingTop) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingTop;
            int i12 = this.paddingBottom;
            CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
            float f7 = this.topCornerRadius;
            float f11 = this.bottomCornerRadius;
            boolean z11 = this.hasSeparator;
            StringBuilder a11 = C2438a.a("LayoutModel(paddingTop=", i11, ", paddingBottom=", ", topMargin=", i12);
            a.f(a11, layoutPadding, ", bottomMargin=", layoutPadding2, ", topCornerRadius=");
            a11.append(f7);
            a11.append(", bottomCornerRadius=");
            a11.append(f11);
            a11.append(", hasSeparator=");
            return Pk0.a.a(")", a11, z11);
        }

        public LayoutModel(int i11, int i12, @NotNull CommonCellSettings.LayoutPadding topMargin, @NotNull CommonCellSettings.LayoutPadding bottomMargin, float f7, float f11, boolean z11) {
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            this.paddingTop = i11;
            this.paddingBottom = i12;
            this.topMargin = topMargin;
            this.bottomMargin = bottomMargin;
            this.topCornerRadius = f7;
            this.bottomCornerRadius = f11;
            this.hasSeparator = z11;
        }

        public /* synthetic */ LayoutModel(int i11, int i12, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, float f7, float f11, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i13 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i13 & 16) != 0 ? 0.0f : f7, (i13 & 32) != 0 ? 0.0f : f11, (i13 & 64) != 0 ? false : z11);
        }
    }

    public CellV2VO(long j11, String str, String str2, @NotNull CommonCellSettings.LayoutPadding leftMargin, @NotNull CommonCellSettings.LayoutPadding rightMargin, @NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, t tVar, @NotNull AtomDTO cell, @NotNull LayoutModel layoutModel) {
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.id = j11;
        this.islandColor = str;
        this.backgroundColor = str2;
        this.leftMargin = leftMargin;
        this.rightMargin = rightMargin;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.tokenizedEvent = tVar;
        this.cell = cell;
        this.layoutModel = layoutModel;
    }

    public static /* synthetic */ CellV2VO copy$default(CellV2VO cellV2VO, long j11, String str, String str2, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, t tVar, AtomDTO atomDTO, LayoutModel layoutModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cellV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = cellV2VO.islandColor;
        }
        return cellV2VO.copy(j12, str, (i11 & 4) != 0 ? cellV2VO.backgroundColor : str2, (i11 & 8) != 0 ? cellV2VO.leftMargin : layoutPadding, (i11 & 16) != 0 ? cellV2VO.rightMargin : layoutPadding2, (i11 & 32) != 0 ? cellV2VO.leftPadding : layoutPadding3, (i11 & 64) != 0 ? cellV2VO.rightPadding : layoutPadding4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellV2VO.tokenizedEvent : tVar, (i11 & 256) != 0 ? cellV2VO.cell : atomDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellV2VO.layoutModel : layoutModel);
    }

    @NotNull
    public final CellV2VO copy(long id2, String islandColor, String backgroundColor, @NotNull CommonCellSettings.LayoutPadding leftMargin, @NotNull CommonCellSettings.LayoutPadding rightMargin, @NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, t tokenizedEvent, @NotNull AtomDTO cell, @NotNull LayoutModel layoutModel) {
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        return new CellV2VO(id2, islandColor, backgroundColor, leftMargin, rightMargin, leftPadding, rightPadding, tokenizedEvent, cell, layoutModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellV2VO)) {
            return false;
        }
        CellV2VO cellV2VO = (CellV2VO) other;
        return this.id == cellV2VO.id && Intrinsics.d(this.islandColor, cellV2VO.islandColor) && Intrinsics.d(this.backgroundColor, cellV2VO.backgroundColor) && this.leftMargin == cellV2VO.leftMargin && this.rightMargin == cellV2VO.rightMargin && this.leftPadding == cellV2VO.leftPadding && this.rightPadding == cellV2VO.rightPadding && Intrinsics.d(this.tokenizedEvent, cellV2VO.tokenizedEvent) && Intrinsics.d(this.cell, cellV2VO.cell) && Intrinsics.d(this.layoutModel, cellV2VO.layoutModel);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AtomDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRightMargin() {
        return this.rightMargin;
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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.islandColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int a11 = Ef0.c.a(this.rightPadding, Ef0.c.a(this.leftPadding, Ef0.c.a(this.rightMargin, Ef0.c.a(this.leftMargin, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
        t tVar = this.tokenizedEvent;
        return this.layoutModel.hashCode() + ((this.cell.hashCode() + ((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.islandColor;
        String str2 = this.backgroundColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightMargin;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
        t tVar = this.tokenizedEvent;
        AtomDTO atomDTO = this.cell;
        LayoutModel layoutModel = this.layoutModel;
        StringBuilder c11 = C2436a.c(j11, "CellV2VO(id=", ", islandColor=", str);
        c11.append(", backgroundColor=");
        c11.append(str2);
        c11.append(", leftMargin=");
        c11.append(layoutPadding);
        c11.append(", rightMargin=");
        c11.append(layoutPadding2);
        c11.append(", leftPadding=");
        c11.append(layoutPadding3);
        c11.append(", rightPadding=");
        c11.append(layoutPadding4);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", cell=");
        c11.append(atomDTO);
        c11.append(", layoutModel=");
        c11.append(layoutModel);
        c11.append(")");
        return c11.toString();
    }
}

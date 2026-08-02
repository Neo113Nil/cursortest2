package com.socure.docv.capturesdk.common.view.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphicOverlayData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/GridLines;", "", "v1", "Lcom/socure/docv/capturesdk/common/view/model/GridLine;", "v2", "v3", "h1", "h2", "h3", "(Lcom/socure/docv/capturesdk/common/view/model/GridLine;Lcom/socure/docv/capturesdk/common/view/model/GridLine;Lcom/socure/docv/capturesdk/common/view/model/GridLine;Lcom/socure/docv/capturesdk/common/view/model/GridLine;Lcom/socure/docv/capturesdk/common/view/model/GridLine;Lcom/socure/docv/capturesdk/common/view/model/GridLine;)V", "getH1", "()Lcom/socure/docv/capturesdk/common/view/model/GridLine;", "getH2", "getH3", "getV1", "getV2", "getV3", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GridLines {
    private final GridLine h1;
    private final GridLine h2;
    private final GridLine h3;
    private final GridLine v1;
    private final GridLine v2;
    private final GridLine v3;

    public static /* synthetic */ GridLines copy$default(GridLines gridLines, GridLine gridLine, GridLine gridLine2, GridLine gridLine3, GridLine gridLine4, GridLine gridLine5, GridLine gridLine6, int i, Object obj) {
        if ((i & 1) != 0) {
            gridLine = gridLines.v1;
        }
        if ((i & 2) != 0) {
            gridLine2 = gridLines.v2;
        }
        if ((i & 4) != 0) {
            gridLine3 = gridLines.v3;
        }
        if ((i & 8) != 0) {
            gridLine4 = gridLines.h1;
        }
        if ((i & 16) != 0) {
            gridLine5 = gridLines.h2;
        }
        if ((i & 32) != 0) {
            gridLine6 = gridLines.h3;
        }
        GridLine gridLine7 = gridLine5;
        GridLine gridLine8 = gridLine6;
        return gridLines.copy(gridLine, gridLine2, gridLine3, gridLine4, gridLine7, gridLine8);
    }

    /* renamed from: component1, reason: from getter */
    public final GridLine getV1() {
        return this.v1;
    }

    /* renamed from: component2, reason: from getter */
    public final GridLine getV2() {
        return this.v2;
    }

    /* renamed from: component3, reason: from getter */
    public final GridLine getV3() {
        return this.v3;
    }

    /* renamed from: component4, reason: from getter */
    public final GridLine getH1() {
        return this.h1;
    }

    /* renamed from: component5, reason: from getter */
    public final GridLine getH2() {
        return this.h2;
    }

    /* renamed from: component6, reason: from getter */
    public final GridLine getH3() {
        return this.h3;
    }

    public final GridLines copy(GridLine v1, GridLine v2, GridLine v3, GridLine h1, GridLine h2, GridLine h3) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        Intrinsics.checkNotNullParameter(v3, "v3");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        return new GridLines(v1, v2, v3, h1, h2, h3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridLines)) {
            return false;
        }
        GridLines gridLines = (GridLines) other;
        return Intrinsics.areEqual(this.v1, gridLines.v1) && Intrinsics.areEqual(this.v2, gridLines.v2) && Intrinsics.areEqual(this.v3, gridLines.v3) && Intrinsics.areEqual(this.h1, gridLines.h1) && Intrinsics.areEqual(this.h2, gridLines.h2) && Intrinsics.areEqual(this.h3, gridLines.h3);
    }

    public int hashCode() {
        return (((((((((this.v1.hashCode() * 31) + this.v2.hashCode()) * 31) + this.v3.hashCode()) * 31) + this.h1.hashCode()) * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode();
    }

    public String toString() {
        return "GridLines(v1=" + this.v1 + ", v2=" + this.v2 + ", v3=" + this.v3 + ", h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ")";
    }

    public GridLines(GridLine v1, GridLine v2, GridLine v3, GridLine h1, GridLine h2, GridLine h3) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        Intrinsics.checkNotNullParameter(v3, "v3");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
    }

    public final GridLine getH1() {
        return this.h1;
    }

    public final GridLine getH2() {
        return this.h2;
    }

    public final GridLine getH3() {
        return this.h3;
    }

    public final GridLine getV1() {
        return this.v1;
    }

    public final GridLine getV2() {
        return this.v2;
    }

    public final GridLine getV3() {
        return this.v3;
    }
}

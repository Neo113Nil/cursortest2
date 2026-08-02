package com.socure.docv.capturesdk.common.view.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: GraphicOverlayData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u000f¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/GridLine;", "", "startX", "", "startY", "endX", "endY", "(FFFF)V", "diffX", "getDiffX", "()F", "diffY", "getDiffY", "getEndX", "setEndX", "(F)V", "getEndY", "setEndY", "getStartX", "setStartX", "getStartY", "setStartY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GridLine {
    private final float diffX;
    private final float diffY;
    private float endX;
    private float endY;
    private float startX;
    private float startY;

    public static /* synthetic */ GridLine copy$default(GridLine gridLine, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gridLine.startX;
        }
        if ((i & 2) != 0) {
            f2 = gridLine.startY;
        }
        if ((i & 4) != 0) {
            f3 = gridLine.endX;
        }
        if ((i & 8) != 0) {
            f4 = gridLine.endY;
        }
        return gridLine.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getStartX() {
        return this.startX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getStartY() {
        return this.startY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getEndX() {
        return this.endX;
    }

    /* renamed from: component4, reason: from getter */
    public final float getEndY() {
        return this.endY;
    }

    public final GridLine copy(float startX, float startY, float endX, float endY) {
        return new GridLine(startX, startY, endX, endY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridLine)) {
            return false;
        }
        GridLine gridLine = (GridLine) other;
        return Float.compare(this.startX, gridLine.startX) == 0 && Float.compare(this.startY, gridLine.startY) == 0 && Float.compare(this.endX, gridLine.endX) == 0 && Float.compare(this.endY, gridLine.endY) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.startX) * 31) + Float.hashCode(this.startY)) * 31) + Float.hashCode(this.endX)) * 31) + Float.hashCode(this.endY);
    }

    public String toString() {
        return "GridLine(startX=" + this.startX + ", startY=" + this.startY + ", endX=" + this.endX + ", endY=" + this.endY + ")";
    }

    public GridLine(float f, float f2, float f3, float f4) {
        this.startX = f;
        this.startY = f2;
        this.endX = f3;
        this.endY = f4;
        this.diffX = f3 - f;
        this.diffY = f4 - f2;
    }

    public final float getEndX() {
        return this.endX;
    }

    public final float getEndY() {
        return this.endY;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final void setEndX(float f) {
        this.endX = f;
    }

    public final void setEndY(float f) {
        this.endY = f;
    }

    public final void setStartX(float f) {
        this.startX = f;
    }

    public final void setStartY(float f) {
        this.startY = f;
    }

    public final float getDiffX() {
        return this.diffX;
    }

    public final float getDiffY() {
        return this.diffY;
    }
}

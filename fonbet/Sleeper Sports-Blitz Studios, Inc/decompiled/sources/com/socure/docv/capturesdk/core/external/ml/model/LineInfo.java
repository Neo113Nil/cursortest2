package com.socure.docv.capturesdk.core.external.ml.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.Point;

/* compiled from: EdgeDetection.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/LineInfo;", "", "start", "Lorg/socure/core/Point;", "end", "(Lorg/socure/core/Point;Lorg/socure/core/Point;)V", "getEnd", "()Lorg/socure/core/Point;", "setEnd", "(Lorg/socure/core/Point;)V", "getStart", "setStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LineInfo {
    public static final int $stable = 8;
    private Point end;
    private Point start;

    public static /* synthetic */ LineInfo copy$default(LineInfo lineInfo, Point point, Point point2, int i, Object obj) {
        if ((i & 1) != 0) {
            point = lineInfo.start;
        }
        if ((i & 2) != 0) {
            point2 = lineInfo.end;
        }
        return lineInfo.copy(point, point2);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getEnd() {
        return this.end;
    }

    public final LineInfo copy(Point start, Point end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new LineInfo(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineInfo)) {
            return false;
        }
        LineInfo lineInfo = (LineInfo) other;
        return Intrinsics.areEqual(this.start, lineInfo.start) && Intrinsics.areEqual(this.end, lineInfo.end);
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "LineInfo(start=" + this.start + ", end=" + this.end + ")";
    }

    public LineInfo(Point start, Point end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
    }

    public final Point getEnd() {
        return this.end;
    }

    public final Point getStart() {
        return this.start;
    }

    public final void setEnd(Point point) {
        Intrinsics.checkNotNullParameter(point, "<set-?>");
        this.end = point;
    }

    public final void setStart(Point point) {
        Intrinsics.checkNotNullParameter(point, "<set-?>");
        this.start = point;
    }
}

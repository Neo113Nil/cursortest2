package ru.ozon.app.android.mapcommon.map.model;

import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "", "Landroid/graphics/Point;", "topLeft", "bottomRight", "<init>", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Point;", "getTopLeft", "()Landroid/graphics/Point;", "setTopLeft", "(Landroid/graphics/Point;)V", "getBottomRight", "setBottomRight", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ScreenRectModel {

    @NotNull
    private Point bottomRight;

    @NotNull
    private Point topLeft;

    public ScreenRectModel(@NotNull Point topLeft, @NotNull Point bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenRectModel)) {
            return false;
        }
        ScreenRectModel screenRectModel = (ScreenRectModel) other;
        return Intrinsics.d(this.topLeft, screenRectModel.topLeft) && Intrinsics.d(this.bottomRight, screenRectModel.bottomRight);
    }

    @NotNull
    public final Point getBottomRight() {
        return this.bottomRight;
    }

    @NotNull
    public final Point getTopLeft() {
        return this.topLeft;
    }

    public int hashCode() {
        return this.bottomRight.hashCode() + (this.topLeft.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenRectModel(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ")";
    }
}

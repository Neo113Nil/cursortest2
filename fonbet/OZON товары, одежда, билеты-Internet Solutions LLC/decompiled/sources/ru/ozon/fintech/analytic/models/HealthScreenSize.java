package ru.ozon.fintech.analytic.models;

import Am.C2438a;
import B0.C2454a;
import K00.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthScreenSize;", "", "width", "", "height", "pointSize", "<init>", "(III)V", "getWidth", "()I", "getHeight", "getPointSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthScreenSize {

    @i(name = "height")
    private final int height;

    @i(name = "point_size")
    private final int pointSize;

    @i(name = "width")
    private final int width;

    public HealthScreenSize(int i11, int i12, int i13) {
        this.width = i11;
        this.height = i12;
        this.pointSize = i13;
    }

    public static /* synthetic */ HealthScreenSize copy$default(HealthScreenSize healthScreenSize, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = healthScreenSize.width;
        }
        if ((i14 & 2) != 0) {
            i12 = healthScreenSize.height;
        }
        if ((i14 & 4) != 0) {
            i13 = healthScreenSize.pointSize;
        }
        return healthScreenSize.copy(i11, i12, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPointSize() {
        return this.pointSize;
    }

    @NotNull
    public final HealthScreenSize copy(int width, int height, int pointSize) {
        return new HealthScreenSize(width, height, pointSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthScreenSize)) {
            return false;
        }
        HealthScreenSize healthScreenSize = (HealthScreenSize) other;
        return this.width == healthScreenSize.width && this.height == healthScreenSize.height && this.pointSize == healthScreenSize.pointSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getPointSize() {
        return this.pointSize;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.pointSize) + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.pointSize, ")", C2438a.a("HealthScreenSize(width=", this.width, ", height=", ", pointSize=", this.height));
    }
}

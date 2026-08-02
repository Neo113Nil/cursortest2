package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i5, float f6, float f10, float f11, int i10, float f12, int i11, float f13, int i12, float f14) {
        this.priority = i5;
        this.smallSize = b.e(f6, f10, f11);
        this.smallCount = i10;
        this.mediumSize = f12;
        this.mediumCount = i11;
        this.largeSize = f13;
        this.largeCount = i12;
        fit(f14, f10, f11, f13);
        this.cost = cost(f13);
    }

    private float calculateLargeSize(float f6, int i5, float f10, int i10, int i11) {
        if (i5 <= 0) {
            f10 = 0.0f;
        }
        float f11 = i10 / 2.0f;
        return (f6 - ((i5 + f11) * f10)) / (i11 + f11);
    }

    private float cost(float f6) {
        if (isValid()) {
            return Math.abs(f6 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f6, float f10, float f11, float f12, @NonNull int[] iArr, float f13, @NonNull int[] iArr2, float f14, @NonNull int[] iArr3) {
        Arrangement arrangement = null;
        int i5 = 1;
        for (int i10 : iArr3) {
            int length = iArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr2[i11];
                int length2 = iArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = length;
                    int i15 = i11;
                    int i16 = i5;
                    int i17 = length2;
                    int i18 = i13;
                    Arrangement arrangement2 = new Arrangement(i16, f10, f11, f12, iArr[i13], f13, i12, f14, i10, f6);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i19 = i16 + 1;
                    i13 = i18 + 1;
                    i11 = i15;
                    i5 = i19;
                    length = i14;
                    length2 = i17;
                }
                i11++;
                i5 = i5;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f6, float f10, float f11, float f12) {
        float space = f6 - getSpace();
        int i5 = this.smallCount;
        if (i5 > 0 && space > 0.0f) {
            float f13 = this.smallSize;
            this.smallSize = Math.min(space / i5, f11 - f13) + f13;
        } else if (i5 > 0 && space < 0.0f) {
            float f14 = this.smallSize;
            this.smallSize = Math.max(space / i5, f10 - f14) + f14;
        }
        int i10 = this.smallCount;
        float f15 = i10 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f15;
        float calculateLargeSize = calculateLargeSize(f6, i10, f15, this.mediumCount, this.largeCount);
        this.largeSize = calculateLargeSize;
        float f16 = (this.smallSize + calculateLargeSize) / 2.0f;
        this.mediumSize = f16;
        int i11 = this.mediumCount;
        if (i11 <= 0 || calculateLargeSize == f12) {
            return;
        }
        float f17 = (f12 - calculateLargeSize) * this.largeCount;
        float min = Math.min(Math.abs(f17), f16 * MEDIUM_ITEM_FLEX_PERCENTAGE * i11);
        if (f17 > 0.0f) {
            this.mediumSize -= min / this.mediumCount;
            this.largeSize = (min / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (min / this.mediumCount) + this.mediumSize;
            this.largeSize -= min / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i5 = this.largeCount;
        if (i5 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i5 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f6 = this.largeSize;
        float f10 = this.mediumSize;
        return f6 > f10 && f10 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}

package ru.sberdevices.salutevision.core.utils;

import B90.C2619v;
import android.graphics.PointF;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0013\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006 "}, d2 = {"Lru/sberdevices/salutevision/core/utils/Matrix4d;", "", "c", "", "", "([[D)V", "m", "([D)V", "()V", "components", "getComponents", "()[[D", "setComponents", "[[D", "equals", "", "other", "get", "", "i", "", "j", "hashCode", "set", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "times", "Landroid/graphics/PointF;", "point", "matrix", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Matrix4d {

    @NotNull
    private double[][] components;

    public Matrix4d() {
        this.components = new double[][]{new double[]{1.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d}, new double[]{0.0d, 0.0d, 0.0d, 1.0d}};
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Matrix4d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.sberdevices.salutevision.core.utils.Matrix4d");
        return C7705l.n(this.components, ((Matrix4d) other).components);
    }

    public final double get(int i11, int j11) {
        return this.components[i11][j11];
    }

    @NotNull
    public final double[][] getComponents() {
        return this.components;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.components);
    }

    public final void set(int i11, int j11, double value) {
        this.components[i11][j11] = value;
    }

    public final void setComponents(@NotNull double[][] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<set-?>");
        this.components = dArr;
    }

    @NotNull
    public final Matrix4d times(@NotNull Matrix4d matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix4d matrix4d = new Matrix4d();
        Iterator<Integer> it = new IntRange(0, 3, 1).iterator();
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            Iterator<Integer> it2 = new IntRange(0, 3, 1).iterator();
            while (it2.hasNext()) {
                int b12 = ((Q) it2).b();
                Iterator<Integer> it3 = new IntRange(0, 3, 1).iterator();
                double d11 = 0.0d;
                while (it3.hasNext()) {
                    int b13 = ((Q) it3).b();
                    d11 = (matrix.get(b13, b12) * get(b11, b13)) + d11;
                }
                matrix4d.set(b11, b12, d11);
            }
        }
        return matrix4d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Matrix4d(components=[\n");
        sb2.append(this.components[0][0]);
        sb2.append(' ');
        sb2.append(this.components[0][1]);
        sb2.append(' ');
        sb2.append(this.components[0][2]);
        sb2.append(' ');
        sb2.append(this.components[0][3]);
        sb2.append(" \n");
        sb2.append(this.components[1][0]);
        sb2.append(' ');
        sb2.append(this.components[1][1]);
        sb2.append(' ');
        sb2.append(this.components[1][2]);
        sb2.append(' ');
        sb2.append(this.components[1][3]);
        sb2.append(" \n");
        sb2.append(this.components[2][0]);
        sb2.append(' ');
        sb2.append(this.components[2][1]);
        sb2.append(' ');
        sb2.append(this.components[2][2]);
        sb2.append(' ');
        sb2.append(this.components[2][3]);
        sb2.append(" \n");
        sb2.append(this.components[3][0]);
        sb2.append(' ');
        sb2.append(this.components[3][1]);
        sb2.append(' ');
        sb2.append(this.components[3][2]);
        sb2.append(' ');
        return C2619v.c(sb2, this.components[3][3], " \n])");
    }

    public final void set(int i11, @NotNull double[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<Integer> it = new IntRange(0, 3, 1).iterator();
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            this.components[i11][b11] = value[b11];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Matrix4d(@NotNull double[][] c11) {
        this();
        Intrinsics.checkNotNullParameter(c11, "c");
        this.components = c11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Matrix4d(@NotNull double[] m11) {
        this();
        Intrinsics.checkNotNullParameter(m11, "m");
        if (m11.length == 9) {
            this.components = new double[][]{new double[]{m11[0], m11[1], 0.0d, m11[2]}, new double[]{m11[3], m11[4], 0.0d, m11[5]}, new double[]{0.0d, 0.0d, 1.0d, 0.0d}, new double[]{m11[6], m11[7], 0.0d, m11[8]}};
        } else if (m11.length == 16) {
            this.components = new double[][]{new double[]{m11[0], m11[1], m11[2], m11[3]}, new double[]{m11[4], m11[5], m11[6], m11[7]}, new double[]{m11[8], m11[9], m11[10], m11[11]}, new double[]{m11[12], m11[13], m11[14], m11[15]}};
        }
    }

    @NotNull
    public final PointF times(@NotNull PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        float f7 = point.x;
        float f11 = point.y;
        double d11 = f7;
        double[][] dArr = this.components;
        double[] dArr2 = dArr[0];
        double d12 = f11;
        double d13 = (dArr2[1] * d12) + (dArr2[0] * d11) + dArr2[3];
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[1] * d12) + (dArr3[0] * d11) + dArr3[3];
        double[] dArr4 = dArr[3];
        double d15 = (d12 * dArr4[1]) + (d11 * dArr4[0]) + dArr4[3];
        return new PointF((float) (d13 / d15), (float) (d14 / d15));
    }
}

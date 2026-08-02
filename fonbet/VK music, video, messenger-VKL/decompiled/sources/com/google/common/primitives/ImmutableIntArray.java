package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import xsna.fxc0;

/* loaded from: classes13.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray b = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.array = iArr;
        this.end = length;
    }

    public final int a(int i) {
        fxc0.s(i, this.end);
        return this.array[i];
    }

    public final int d() {
        return this.end;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (this.end == immutableIntArray.end) {
                for (int i = 0; i < this.end; i++) {
                    if (a(i) == immutableIntArray.a(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.end == 0 ? b : this;
    }

    public final String toString() {
        int i = this.end;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.array[0]);
        for (int i2 = 1; i2 < this.end; i2++) {
            sb.append(", ");
            sb.append(this.array[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.end;
        int[] iArr = this.array;
        return i < iArr.length ? new ImmutableIntArray(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}

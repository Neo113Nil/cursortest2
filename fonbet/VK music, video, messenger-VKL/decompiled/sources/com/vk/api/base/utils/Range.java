package com.vk.api.base.utils;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;

/* loaded from: classes14.dex */
public class Range extends Serializer.StreamParcelableAdapter implements Comparable<Range> {
    public static final Serializer.c<Range> CREATOR = new a();
    public final long b;
    public long c;

    public class a extends Serializer.c<Range> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Range a(@NonNull Serializer serializer) {
            return new Range(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Range[i];
        }
    }

    public Range(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.Y(this.c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Range range) {
        return (int) (this.b - range.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Range)) {
            Range range = (Range) obj;
            if (this.b == range.b && this.c == range.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return this.b + "-" + this.c;
    }

    public Range(Serializer serializer) {
        this.b = serializer.w();
        this.c = serializer.w();
    }
}

package org.joda.time;

import C.o0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class PeriodType implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static int f79037a = 0;

    /* renamed from: b, reason: collision with root package name */
    static int f79038b = 0;

    /* renamed from: c, reason: collision with root package name */
    static int f79039c = 0;

    /* renamed from: d, reason: collision with root package name */
    static int f79040d = 0;

    /* renamed from: e, reason: collision with root package name */
    static int f79041e = 0;

    /* renamed from: f, reason: collision with root package name */
    static int f79042f = 0;

    /* renamed from: g, reason: collision with root package name */
    static int f79043g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static PeriodType f79044h = null;

    /* renamed from: i, reason: collision with root package name */
    private static PeriodType f79045i = null;

    /* renamed from: j, reason: collision with root package name */
    private static PeriodType f79046j = null;

    /* renamed from: k, reason: collision with root package name */
    private static PeriodType f79047k = null;

    /* renamed from: l, reason: collision with root package name */
    private static PeriodType f79048l = null;
    private static final long serialVersionUID = 2274324892792009998L;
    private final int[] iIndices;
    private final String iName;
    private final DurationFieldType[] iTypes;

    static {
        new HashMap(32);
        f79037a = 1;
        f79038b = 2;
        f79039c = 3;
        f79040d = 4;
        f79041e = 5;
        f79042f = 6;
        f79043g = 7;
    }

    protected PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.iName = str;
        this.iTypes = durationFieldTypeArr;
        this.iIndices = iArr;
    }

    public static PeriodType a() {
        PeriodType periodType = f79047k;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Days", new DurationFieldType[]{DurationFieldType.f79013g}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        f79047k = periodType2;
        return periodType2;
    }

    public static PeriodType e() {
        PeriodType periodType = f79048l;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Hours", new DurationFieldType[]{DurationFieldType.f79015i}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
        f79048l = periodType2;
        return periodType2;
    }

    public static PeriodType j() {
        PeriodType periodType = f79044h;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Standard", new DurationFieldType[]{DurationFieldType.f79010d, DurationFieldType.f79011e, DurationFieldType.f79012f, DurationFieldType.f79013g, DurationFieldType.f79015i, DurationFieldType.f79016j, DurationFieldType.f79017k, DurationFieldType.f79018l}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        f79044h = periodType2;
        return periodType2;
    }

    public static PeriodType l() {
        PeriodType periodType = f79046j;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("Time", new DurationFieldType[]{DurationFieldType.f79015i, DurationFieldType.f79016j, DurationFieldType.f79017k, DurationFieldType.f79018l}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
        f79046j = periodType2;
        return periodType2;
    }

    public static PeriodType m() {
        PeriodType periodType = f79045i;
        if (periodType != null) {
            return periodType;
        }
        PeriodType periodType2 = new PeriodType("YearDayTime", new DurationFieldType[]{DurationFieldType.f79010d, DurationFieldType.f79013g, DurationFieldType.f79015i, DurationFieldType.f79016j, DurationFieldType.f79017k, DurationFieldType.f79018l}, new int[]{0, -1, -1, 1, 2, 3, 4, 5});
        f79045i = periodType2;
        return periodType2;
    }

    public final DurationFieldType b(int i11) {
        return this.iTypes[i11];
    }

    final int d(Period period, int i11) {
        int i12 = this.iIndices[i11];
        if (i12 == -1) {
            return 0;
        }
        return period.getValue(i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PeriodType) {
            return Arrays.equals(this.iTypes, ((PeriodType) obj).iTypes);
        }
        return false;
    }

    public final int f(DurationFieldType durationFieldType) {
        int length = this.iTypes.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.iTypes[i11].equals(durationFieldType)) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean g(DurationFieldType durationFieldType) {
        return f(durationFieldType) >= 0;
    }

    final void h(int i11, int i12, int[] iArr) {
        int i13 = this.iIndices[i11];
        if (i13 == -1) {
            throw new UnsupportedOperationException("Field is not supported");
        }
        iArr[i13] = i12;
    }

    public final int hashCode() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr = this.iTypes;
            if (i11 >= durationFieldTypeArr.length) {
                return i12;
            }
            i12 += durationFieldTypeArr[i11].hashCode();
            i11++;
        }
    }

    public final int i() {
        return this.iTypes.length;
    }

    public final String toString() {
        return o0.c(new StringBuilder("PeriodType["), this.iName, "]");
    }
}

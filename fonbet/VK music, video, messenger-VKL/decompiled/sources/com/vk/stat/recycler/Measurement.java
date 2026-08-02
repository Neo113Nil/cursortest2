package com.vk.stat.recycler;

import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.zrp;

/* compiled from: Measurement.kt */
/* loaded from: classes5.dex */
public final class Measurement {
    public final int a;
    public final Type b;
    public final long c;
    public final String d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Measurement.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Bind;
        public static final Type Create;
        public static final Type Layout;
        public static final Type Measure;
        private final int value;

        static {
            Type type = new Type("Create", 0, 1);
            Create = type;
            Type type2 = new Type("Bind", 1, 2);
            Bind = type2;
            Type type3 = new Type("Measure", 2, 3);
            Measure = type3;
            Type type4 = new Type("Layout", 3, 4);
            Layout = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    public Measurement(int i, Type type, long j, String str, boolean z) {
        this.a = i;
        this.b = type;
        this.c = j;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Measurement)) {
            return false;
        }
        Measurement measurement = (Measurement) obj;
        return this.a == measurement.a && this.b == measurement.b && this.c == measurement.c && epx.f(this.d, measurement.d) && this.e == measurement.e;
    }

    public final int hashCode() {
        int a = bh10.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(viewType=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", timeNano=");
        sb.append(this.c);
        sb.append(", viewHolderTitle=");
        sb.append(this.d);
        sb.append(", isWorkerThread=");
        return q0.a(sb, this.e, ')');
    }
}

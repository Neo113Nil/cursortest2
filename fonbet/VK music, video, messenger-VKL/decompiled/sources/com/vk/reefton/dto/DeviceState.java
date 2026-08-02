package com.vk.reefton.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.gsi0;
import xsna.n6j;
import xsna.qoy;
import xsna.urd0;
import xsna.wof0;
import xsna.zrp;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class DeviceState extends wof0 {
    public final String a;
    public final Type b;
    public final String c;
    public final String d;
    public final String e = "android";
    public final String f;
    public final String g;
    public final String h;
    public final ReefBuildType i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final boolean n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReefState.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DESKTOP;
        public static final Type PHONE;
        public static final Type TABLET;
        public static final Type UNKNOWN;

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = type;
            Type type2 = new Type("PHONE", 1);
            PHONE = type2;
            Type type3 = new Type("TABLET", 2);
            TABLET = type3;
            Type type4 = new Type("DESKTOP", 3);
            DESKTOP = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public DeviceState(String str, Type type, String str2, String str3, String str4, String str5, String str6, ReefBuildType reefBuildType, String str7, boolean z, boolean z2, float f, boolean z3) {
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = reefBuildType;
        this.j = str7;
        this.k = z;
        this.l = z2;
        this.m = f;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceState)) {
            return false;
        }
        DeviceState deviceState = (DeviceState) obj;
        return epx.f(this.a, deviceState.a) && this.b == deviceState.b && epx.f(this.c, deviceState.c) && epx.f(this.d, deviceState.d) && epx.f(this.e, deviceState.e) && epx.f(this.f, deviceState.f) && epx.f(this.g, deviceState.g) && epx.f(this.h, deviceState.h) && this.i == deviceState.i && epx.f(this.j, deviceState.j) && this.k == deviceState.k && this.l == deviceState.l && Float.compare(this.m, deviceState.m) == 0 && this.n == deviceState.n;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        String str = this.j;
        return Boolean.hashCode(this.n) + b.a(this.m, qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceState(deviceId=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", manufacturer=");
        n6j.b(sb, this.c, ", model=", this.d, ", osName=");
        n6j.b(sb, this.e, ", osVersion=", this.f, ", applicationVersion=");
        n6j.b(sb, this.g, ", buildNumber=", this.h, ", buildType=");
        sb.append(this.i);
        sb.append(", tac=");
        sb.append(this.j);
        sb.append(", isPowerSaveMode=");
        gsi0.c(sb, this.k, ", isCharging=", this.l, ", batteryPct=");
        sb.append(this.m);
        sb.append(", isAirplaneMode=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}

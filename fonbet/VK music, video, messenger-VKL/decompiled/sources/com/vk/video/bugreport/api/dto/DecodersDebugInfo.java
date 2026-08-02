package com.vk.video.bugreport.api.dto;

import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: DecodersDebugInfo.kt */
/* loaded from: classes5.dex */
public final class DecodersDebugInfo {
    public final String a;
    public final Type b;
    public final String c;
    public final Type d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecodersDebugInfo.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type HW;
        public static final Type SW;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("HW", 0);
            HW = type;
            Type type2 = new Type("SW", 1);
            SW = type2;
            Type type3 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = type3;
            Type[] typeArr = {type, type2, type3};
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

    public DecodersDebugInfo(String str, Type type, String str2, Type type2) {
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodersDebugInfo)) {
            return false;
        }
        DecodersDebugInfo decodersDebugInfo = (DecodersDebugInfo) obj;
        return epx.f(this.a, decodersDebugInfo.a) && this.b == decodersDebugInfo.b && epx.f(this.c, decodersDebugInfo.c) && this.d == decodersDebugInfo.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Video (");
        sb.append(this.a);
        sb.append(" - ");
        sb.append(this.b);
        sb.append("), Audio (");
        sb.append(this.c);
        sb.append(" - ");
        sb.append(this.d);
        sb.append("), Soc=");
        str = Build.SOC_MODEL;
        sb.append(str);
        sb.append(", Manufacture=");
        sb.append(Build.MANUFACTURER);
        return sb.toString();
    }
}

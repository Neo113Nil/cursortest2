package com.vk.superapp.api.dto.geo.directions;

import com.ironsource.O6;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Location.kt */
/* loaded from: classes6.dex */
public final class Location {

    @pmi0("heading")
    private final Float heading;

    @pmi0(O6.s)
    private final float latitude;

    @pmi0("lon")
    private final float longitude;

    @pmi0("original_index")
    private final Integer originalIndex;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Location.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("break")
        public static final Type BREAK;

        @pmi0("break_through")
        public static final Type BREAK_THROUGH;

        @pmi0("through")
        public static final Type THROUGH;

        @pmi0("via")
        public static final Type VIA;

        static {
            Type type = new Type("BREAK", 0);
            BREAK = type;
            Type type2 = new Type("THROUGH", 1);
            THROUGH = type2;
            Type type3 = new Type("VIA", 2);
            VIA = type3;
            Type type4 = new Type("BREAK_THROUGH", 3);
            BREAK_THROUGH = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Location(float f, float f2, Type type, Float f3, Integer num) {
        this.latitude = f;
        this.longitude = f2;
        this.type = type;
        this.heading = f3;
        this.originalIndex = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Float.compare(this.latitude, location.latitude) == 0 && Float.compare(this.longitude, location.longitude) == 0 && this.type == location.type && epx.f(this.heading, location.heading) && epx.f(this.originalIndex, location.originalIndex);
    }

    public final int hashCode() {
        int a = b.a(this.longitude, Float.hashCode(this.latitude) * 31, 31);
        Type type = this.type;
        int hashCode = (a + (type == null ? 0 : type.hashCode())) * 31;
        Float f = this.heading;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.originalIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", originalIndex=");
        return uqi.b(sb, this.originalIndex, ')');
    }

    public /* synthetic */ Location(float f, float f2, Type type, Float f3, Integer num, int i, zcl zclVar) {
        this(f, f2, (i & 4) != 0 ? null : type, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : num);
    }
}

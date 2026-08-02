package com.vk.dto.common.gift;

import android.os.Parcel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.asp;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.ms9;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftRarity.kt */
/* loaded from: classes18.dex */
public final class GiftRarity implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftRarity> CREATOR = new b();
    public final String b;
    public final Type c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final GiftAnimation i;
    public final GiftAnimation j;
    public final GiftAnimation k;
    public final List<GiftBackground> l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftRarity.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type LEGENDARY;
        public static final Type RARE;
        public static final Type UNCOMMON;
        public static final Type UNKNOWN;
        private final String value;

        /* compiled from: GiftRarity.kt */
        public static final class a {
            public static Type a(String str) {
                Object obj;
                Iterator<E> it = Type.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Type) obj).i(), str)) {
                        break;
                    }
                }
                Type type = (Type) obj;
                return type == null ? Type.UNKNOWN : type;
            }
        }

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
            UNKNOWN = type;
            Type type2 = new Type("UNCOMMON", 1, "uncommon");
            UNCOMMON = type2;
            Type type3 = new Type("RARE", 2, "rare");
            RARE = type3;
            Type type4 = new Type("LEGENDARY", 3, "legendary");
            LEGENDARY = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* compiled from: GiftRarity.kt */
    public static final class a {
        public static GiftRarity a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("title");
            Type.Companion.getClass();
            Type a = Type.a.a(string);
            Integer x = f370.x(jSONObject, "total_count");
            Integer x2 = f370.x(jSONObject, "left_count");
            Integer x3 = f370.x(jSONObject, "release_year");
            Integer x4 = f370.x(jSONObject, "serial_number");
            String D = f370.D(jSONObject, "badge_color");
            Serializer.c<GiftAnimation> cVar = GiftAnimation.CREATOR;
            GiftAnimation a2 = GiftAnimation.a.a("main_start_animation", string, jSONObject);
            GiftAnimation a3 = GiftAnimation.a.a("main_loop_animation", string, jSONObject);
            GiftAnimation a4 = GiftAnimation.a.a("secondary_animation", string, jSONObject);
            Serializer.c<GiftBackground> cVar2 = GiftBackground.CREATOR;
            return new GiftRarity(string2, a, x, x2, x3, x4, D, a2, a3, a4, GiftBackground.a.b(jSONObject.optJSONArray("modal_backgrounds")));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftRarity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftRarity a(Serializer serializer) {
            return new GiftRarity(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftRarity[i];
        }
    }

    public GiftRarity(String str, Type type, Integer num, Integer num2, Integer num3, Integer num4, String str2, GiftAnimation giftAnimation, GiftAnimation giftAnimation2, GiftAnimation giftAnimation3, List<GiftBackground> list) {
        this.b = str;
        this.c = type;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = str2;
        this.i = giftAnimation;
        this.j = giftAnimation2;
        this.k = giftAnimation3;
        this.l = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.i());
        serializer.V(this.d);
        serializer.V(this.e);
        serializer.V(this.f);
        serializer.V(this.g);
        serializer.m0(this.h);
        serializer.i0(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
        serializer.f0(this.l);
    }

    public final GiftBackground a(boolean z) {
        Object obj;
        Object obj2;
        GiftTheme giftTheme = z ? GiftTheme.DARK : GiftTheme.LIGHT;
        List<GiftBackground> list = this.l;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((GiftBackground) obj2).d == giftTheme) {
                break;
            }
        }
        GiftBackground giftBackground = (GiftBackground) obj2;
        if (giftBackground != null) {
            return giftBackground;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((GiftBackground) next).d == GiftTheme.UNKNOWN) {
                obj = next;
                break;
            }
        }
        return (GiftBackground) obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftRarity)) {
            return false;
        }
        GiftRarity giftRarity = (GiftRarity) obj;
        return epx.f(this.b, giftRarity.b) && this.c == giftRarity.c && epx.f(this.d, giftRarity.d) && epx.f(this.e, giftRarity.e) && epx.f(this.f, giftRarity.f) && epx.f(this.g, giftRarity.g) && epx.f(this.h, giftRarity.h) && epx.f(this.i, giftRarity.i) && epx.f(this.j, giftRarity.j) && epx.f(this.k, giftRarity.k) && epx.f(this.l, giftRarity.l);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.h;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        GiftAnimation giftAnimation = this.i;
        int hashCode7 = (hashCode6 + (giftAnimation == null ? 0 : giftAnimation.hashCode())) * 31;
        GiftAnimation giftAnimation2 = this.j;
        int hashCode8 = (hashCode7 + (giftAnimation2 == null ? 0 : giftAnimation2.hashCode())) * 31;
        GiftAnimation giftAnimation3 = this.k;
        return this.l.hashCode() + ((hashCode8 + (giftAnimation3 != null ? giftAnimation3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftRarity(title=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", totalCount=");
        sb.append(this.d);
        sb.append(", leftCount=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", serialNumber=");
        sb.append(this.g);
        sb.append(", badgeColor=");
        sb.append(this.h);
        sb.append(", mainStartAnimation=");
        sb.append(this.i);
        sb.append(", mainLoopAnimation=");
        sb.append(this.j);
        sb.append(", secondaryAnimation=");
        sb.append(this.k);
        sb.append(", modalBackgrounds=");
        return ms9.a(')', sb, this.l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GiftRarity(Serializer serializer) {
        this(r3, Type.a.a(r1), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.I(), (GiftAnimation) serializer.G(GiftAnimation.class.getClassLoader()), (GiftAnimation) serializer.G(GiftAnimation.class.getClassLoader()), (GiftAnimation) serializer.G(GiftAnimation.class.getClassLoader()), serializer.B(GiftBackground.class.getClassLoader()));
        String H = serializer.H();
        bpn0 bpn0Var = cqm0.a;
        String str = H == null ? "" : H;
        Type.a aVar = Type.Companion;
        String H2 = serializer.H();
        String str2 = H2 != null ? H2 : "";
        aVar.getClass();
    }

    public GiftRarity(String str, Type type, Integer num, Integer num2, Integer num3, Integer num4, String str2, GiftAnimation giftAnimation, GiftAnimation giftAnimation2, GiftAnimation giftAnimation3, List list, int i, zcl zclVar) {
        this(str, type, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : giftAnimation, (i & 256) != 0 ? null : giftAnimation2, (i & 512) != 0 ? null : giftAnimation3, (i & 1024) != 0 ? EmptyList.b : list);
    }
}

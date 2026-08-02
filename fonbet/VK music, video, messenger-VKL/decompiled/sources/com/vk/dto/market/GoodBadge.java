package com.vk.dto.market;

import android.os.Parcel;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.j5g;
import xsna.kvf;
import xsna.ms9;
import xsna.shy;
import xsna.zrp;

/* compiled from: GoodBadge.kt */
/* loaded from: classes18.dex */
public final class GoodBadge implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<GoodBadge> CREATOR = new c();
    public static final b i = new b();
    public final String b;
    public final BadgeType c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List<BaseImageDto> h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoodBadge.kt */
    public static final class BadgeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final a Companion;
        public static final BadgeType DEFAULT;
        public static final BadgeType OZON;
        public static final BadgeType PARTNER_INTEGRATION;
        private final int type;

        /* compiled from: GoodBadge.kt */
        public static final class a {
            public static BadgeType a(Integer num) {
                Object obj;
                Iterator<E> it = BadgeType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int i = ((BadgeType) obj).i();
                    if (num != null && i == num.intValue()) {
                        break;
                    }
                }
                return (BadgeType) obj;
            }
        }

        static {
            BadgeType badgeType = new BadgeType("DEFAULT", 0, 0);
            DEFAULT = badgeType;
            BadgeType badgeType2 = new BadgeType("OZON", 1, 2);
            OZON = badgeType2;
            BadgeType badgeType3 = new BadgeType("PARTNER_INTEGRATION", 2, 3);
            PARTNER_INTEGRATION = badgeType3;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3};
            $VALUES = badgeTypeArr;
            $ENTRIES = new asp(badgeTypeArr);
            Companion = new a();
        }

        public BadgeType(String str, int i, int i2) {
            this.type = i2;
        }

        public static zrp<BadgeType> h() {
            return $ENTRIES;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }

        public final int i() {
            return this.type;
        }
    }

    /* compiled from: GoodBadge.kt */
    public static final class a {
        public static String a(List list) {
            Object obj;
            String url;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.DARK) {
                    break;
                }
            }
            BaseImageDto baseImageDto = (BaseImageDto) obj;
            if (baseImageDto != null && (url = baseImageDto.getUrl()) != null) {
                return url;
            }
            BaseImageDto baseImageDto2 = (BaseImageDto) j5g.a0(list);
            if (baseImageDto2 != null) {
                return baseImageDto2.getUrl();
            }
            return null;
        }

        public static Integer b(List list) {
            BaseImageDto baseImageDto = (BaseImageDto) j5g.a0(list);
            if (baseImageDto != null) {
                return Integer.valueOf(baseImageDto.getHeight());
            }
            return null;
        }

        public static String c(List list) {
            Object obj;
            String url;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.LIGHT) {
                    break;
                }
            }
            BaseImageDto baseImageDto = (BaseImageDto) obj;
            if (baseImageDto != null && (url = baseImageDto.getUrl()) != null) {
                return url;
            }
            BaseImageDto baseImageDto2 = (BaseImageDto) j5g.a0(list);
            if (baseImageDto2 != null) {
                return baseImageDto2.getUrl();
            }
            return null;
        }

        public static Integer d(List list) {
            BaseImageDto baseImageDto = (BaseImageDto) j5g.a0(list);
            if (baseImageDto != null) {
                return Integer.valueOf(baseImageDto.getWidth());
            }
            return null;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<GoodBadge> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
        @Override // xsna.aay
        public final GoodBadge a(JSONObject jSONObject) {
            List list;
            String string = jSONObject.getString("text");
            BadgeType.a aVar = BadgeType.Companion;
            Integer valueOf = Integer.valueOf(jSONObject.optInt("type"));
            aVar.getClass();
            BadgeType a = BadgeType.a.a(valueOf);
            int i = jSONObject.getInt("text_color");
            int i2 = jSONObject.getInt("text_color_dark");
            int i3 = jSONObject.getInt("bkg_color");
            int i4 = jSONObject.getInt("bkg_color_dark");
            JSONArray optJSONArray = jSONObject.optJSONArray("integration_image");
            if (optJSONArray != null) {
                list = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    list.add((BaseImageDto) GsonHolder.a().fromJson(optJSONArray.getJSONObject(i5).toString(), BaseImageDto.class));
                }
            } else {
                list = EmptyList.b;
            }
            return new GoodBadge(string, a, i, i2, i3, i4, list);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<GoodBadge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GoodBadge a(Serializer serializer) {
            String H = serializer.H();
            BadgeType.a aVar = BadgeType.Companion;
            Integer v = serializer.v();
            aVar.getClass();
            return new GoodBadge(H, BadgeType.a.a(v), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.B(BaseImageDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GoodBadge[i];
        }
    }

    public GoodBadge(String str, BadgeType badgeType, int i2, int i3, int i4, int i5, List<BaseImageDto> list) {
        this.b = str;
        this.c = badgeType;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        BadgeType badgeType = this.c;
        serializer.V(badgeType != null ? Integer.valueOf(badgeType.i()) : null);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.f0(this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", this.b);
        BadgeType badgeType = this.c;
        jSONObject.put("type", badgeType != null ? Integer.valueOf(badgeType.i()) : null);
        jSONObject.put("text_color", this.d);
        jSONObject.put("text_color_dark", this.e);
        jSONObject.put("bkg_color", this.f);
        jSONObject.put("bkg_color_dark", this.g);
        List<BaseImageDto> list = this.h;
        if (list != null) {
            jSONObject.put("integration_image", kvf.a(list));
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodBadge)) {
            return false;
        }
        GoodBadge goodBadge = (GoodBadge) obj;
        return epx.f(this.b, goodBadge.b) && this.c == goodBadge.c && this.d == goodBadge.d && this.e == goodBadge.e && this.f == goodBadge.f && this.g == goodBadge.g && epx.f(this.h, goodBadge.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        BadgeType badgeType = this.c;
        int a2 = shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (hashCode + (badgeType == null ? 0 : badgeType.hashCode())) * 31, 31), 31), 31), 31);
        List<BaseImageDto> list = this.h;
        return a2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodBadge(text=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", textColorDark=");
        sb.append(this.e);
        sb.append(", bgColor=");
        sb.append(this.f);
        sb.append(", bgColorDark=");
        sb.append(this.g);
        sb.append(", labelIcon=");
        return ms9.a(')', sb, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.Animation;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.v1v;
import xsna.vu5;
import xsna.zcl;
import xsna.zk2;

/* compiled from: GiftAnimation.kt */
/* loaded from: classes18.dex */
public final class GiftAnimation implements Serializer.StreamParcelable, zk2 {
    public static final Serializer.c<GiftAnimation> CREATOR = new b();
    public final String b;
    public final List<Animation> c;
    public final int d;

    /* compiled from: GiftAnimation.kt */
    public static final class a {
        public static GiftAnimation a(String str, String str2, JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                return null;
            }
            String a = v1v.a('_', str2, str);
            Serializer.c<Animation> cVar = Animation.CREATOR;
            List a2 = Animation.a.a(optJSONObject);
            Integer x = f370.x(optJSONObject, "repeat_count");
            return new GiftAnimation(a, a2, x != null ? x.intValue() : 0);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftAnimation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftAnimation a(Serializer serializer) {
            return new GiftAnimation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftAnimation[i];
        }
    }

    public GiftAnimation(String str, List<Animation> list, int i) {
        this.b = str;
        this.c = list;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.f0(this.c);
        serializer.S(this.d);
    }

    @Override // xsna.zk2
    public final boolean V0() {
        return !this.c.isEmpty();
    }

    @Override // xsna.zk2
    public final String a(boolean z) {
        Object obj;
        Object obj2;
        String str;
        GiftTheme giftTheme = z ? GiftTheme.DARK : GiftTheme.LIGHT;
        List<Animation> list = this.c;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Animation) obj2).c == giftTheme) {
                break;
            }
        }
        Animation animation = (Animation) obj2;
        if (animation != null && (str = animation.b) != null) {
            return str;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Animation) next).c == GiftTheme.UNKNOWN) {
                obj = next;
                break;
            }
        }
        Animation animation2 = (Animation) obj;
        return animation2 != null ? animation2.b : "";
    }

    @Override // xsna.zk2
    public final String b(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(z ? "_dark" : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftAnimation)) {
            return false;
        }
        GiftAnimation giftAnimation = (GiftAnimation) obj;
        return epx.f(this.b, giftAnimation.b) && epx.f(this.c, giftAnimation.c) && this.d == giftAnimation.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftAnimation(animationId=");
        sb.append(this.b);
        sb.append(", animations=");
        sb.append(this.c);
        sb.append(", repeatCount=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ GiftAnimation(String str, List list, int i, int i2, zcl zclVar) {
        this(str, list, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GiftAnimation(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.B(Animation.class.getClassLoader()), serializer.u());
        String H = serializer.H();
    }
}

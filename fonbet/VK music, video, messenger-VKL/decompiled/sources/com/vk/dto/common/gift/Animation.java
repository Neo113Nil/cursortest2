package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.GiftTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;

/* compiled from: GiftAnimation.kt */
/* loaded from: classes18.dex */
public final class Animation implements Serializer.StreamParcelable {
    public static final Serializer.c<Animation> CREATOR = new b();
    public final String b;
    public final GiftTheme c;

    /* compiled from: GiftAnimation.kt */
    public static final class a {
        public static List a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return EmptyList.b;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("sources");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("url");
                GiftTheme.a aVar = GiftTheme.Companion;
                String optString = jSONObject2.optString("theme");
                aVar.getClass();
                arrayList.add(new Animation(string, GiftTheme.a.a(optString)));
            }
            return arrayList;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Animation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Animation a(Serializer serializer) {
            return new Animation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Animation[i];
        }
    }

    public Animation(String str, GiftTheme giftTheme) {
        this.b = str;
        this.c = giftTheme;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.i());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Animation)) {
            return false;
        }
        Animation animation = (Animation) obj;
        return epx.f(this.b, animation.b) && this.c == animation.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Animation(url=" + this.b + ", theme=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animation(Serializer serializer) {
        this(r0, GiftTheme.a.a(r3));
        String H = serializer.H();
        bpn0 bpn0Var = cqm0.a;
        H = H == null ? "" : H;
        GiftTheme.a aVar = GiftTheme.Companion;
        String H2 = serializer.H();
        aVar.getClass();
    }
}

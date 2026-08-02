package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;

/* compiled from: GiftBackground.kt */
/* loaded from: classes18.dex */
public final class GiftBackground implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftBackground> CREATOR = new b();
    public final String b;
    public final Image c;
    public final GiftTheme d;

    /* compiled from: GiftBackground.kt */
    public static final class a {
        public static GiftBackground a(List list, boolean z) {
            Object obj;
            Object obj2;
            GiftTheme giftTheme = z ? GiftTheme.DARK : GiftTheme.LIGHT;
            List list2 = list;
            Iterator it = list2.iterator();
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
            Iterator it2 = list2.iterator();
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

        public static List b(JSONArray jSONArray) {
            Image image;
            if (jSONArray == null) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("color");
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject == null) {
                    image = null;
                } else {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("sources");
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        arrayList2.add(new ImageSize(jSONObject2.getString("url"), jSONObject2.getInt("width"), jSONObject2.getInt("height"), null, (char) 0, false, 56, null));
                    }
                    image = new Image(arrayList2);
                }
                GiftTheme.a aVar = GiftTheme.Companion;
                String optString = jSONObject.optString("theme");
                aVar.getClass();
                arrayList.add(new GiftBackground(string, image, GiftTheme.a.a(optString)));
            }
            return arrayList;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftBackground> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftBackground a(Serializer serializer) {
            return new GiftBackground(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftBackground[i];
        }
    }

    public GiftBackground(String str, Image image, GiftTheme giftTheme) {
        this.b = str;
        this.c = image;
        this.d = giftTheme;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        GiftTheme giftTheme = this.d;
        serializer.m0(giftTheme != null ? giftTheme.i() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftBackground)) {
            return false;
        }
        GiftBackground giftBackground = (GiftBackground) obj;
        return epx.f(this.b, giftBackground.b) && epx.f(this.c, giftBackground.c) && this.d == giftBackground.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Image image = this.c;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        GiftTheme giftTheme = this.d;
        return hashCode2 + (giftTheme != null ? giftTheme.hashCode() : 0);
    }

    public final String toString() {
        return "GiftBackground(color=" + this.b + ", image=" + this.c + ", theme=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GiftBackground(Serializer serializer) {
        this(r0, r1, GiftTheme.a.a(r4));
        String H = serializer.H();
        bpn0 bpn0Var = cqm0.a;
        H = H == null ? "" : H;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        GiftTheme.a aVar = GiftTheme.Companion;
        String I = serializer.I();
        aVar.getClass();
    }
}

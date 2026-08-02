package com.vk.catalog2.common.dto.api.banner;

import com.coremedia.iso.boxes.MetaBox;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: Banner.kt */
/* loaded from: classes16.dex */
public final class Banner extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Banner> CREATOR = new b();
    public static final a f = new a();
    public final int b;
    public final String c;
    public final NotificationImage d;
    public final String e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Banner> {
        @Override // xsna.aay
        public final Banner a(JSONObject jSONObject) {
            Serializer.c<Banner> cVar = Banner.CREATOR;
            int optInt = jSONObject.optInt("id");
            String string = jSONObject.getString("url");
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            Serializer.c<NotificationImage> cVar2 = NotificationImage.CREATOR;
            NotificationImage a = NotificationImage.a.a(optJSONArray);
            JSONObject optJSONObject = jSONObject.optJSONObject(MetaBox.TYPE);
            return new Banner(optInt, string, a, optJSONObject != null ? optJSONObject.optString("track_code") : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Banner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Banner a(Serializer serializer) {
            return new Banner(serializer.u(), serializer.H(), (NotificationImage) serializer.G(NotificationImage.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Banner[i];
        }
    }

    public Banner(int i, String str, NotificationImage notificationImage, String str2) {
        this.b = i;
        this.c = str;
        this.d = notificationImage;
        this.e = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        return this.b == banner.b && epx.f(this.c, banner.c) && epx.f(this.d, banner.d) && epx.f(this.e, banner.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Banner(id=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", images=");
        sb.append(this.d);
        sb.append(", trackCode=");
        return ho8.a(sb, this.e, ')');
    }
}

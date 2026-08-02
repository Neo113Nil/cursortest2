package com.vk.feed.core.models.feedback;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.dz5;

/* compiled from: StarsFeedback.kt */
/* loaded from: classes18.dex */
public final class StarsFeedback extends Feedback {
    public static final Serializer.c<StarsFeedback> CREATOR = new b();
    public final int f;
    public final String[] g;

    /* compiled from: StarsFeedback.kt */
    public static final class a {
        public static StarsFeedback a(JSONObject jSONObject) {
            return new StarsFeedback(jSONObject.getString("question"), jSONObject.optString("gratitude", null), jSONObject.optInt("stars_count"), dz5.G(jSONObject.optJSONArray("descriptions")), jSONObject.optString("track_code"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StarsFeedback> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StarsFeedback a(Serializer serializer) {
            return new StarsFeedback(serializer.H(), serializer.H(), serializer.u(), serializer.g(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StarsFeedback[i];
        }
    }

    public StarsFeedback(String str, String str2, int i, String[] strArr, String str3) {
        super(str, str2, str3);
        this.f = i;
        this.g = strArr;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.S(this.f);
        serializer.k0(this.g);
        serializer.j0(this.d);
    }
}

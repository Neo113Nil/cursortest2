package com.vk.dto.community.entries.widget;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Team.kt */
/* loaded from: classes18.dex */
public final class Team extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Team> CREATOR = new a();
    public final String b;
    public final String c;
    public final Image d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Team> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Team a(Serializer serializer) {
            return new Team(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Team[i];
        }
    }

    public Team(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.optString("name");
        this.c = jSONObject.optString("descr");
        JSONArray optJSONArray = jSONObject.optJSONArray("icon");
        this.d = optJSONArray != null ? new Image(optJSONArray, null, 2, null) : null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
    }

    public Team(Serializer serializer) {
        this.b = serializer.H();
        this.c = serializer.H();
        this.d = (Image) serializer.G(Image.class.getClassLoader());
    }
}

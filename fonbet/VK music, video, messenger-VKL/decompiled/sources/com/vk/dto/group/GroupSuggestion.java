package com.vk.dto.group;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GroupSuggestion.kt */
/* loaded from: classes18.dex */
public final class GroupSuggestion implements Serializer.StreamParcelable {
    public static final Serializer.c<GroupSuggestion> CREATOR = new a();
    public final Group b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: GroupSuggestion.kt */
    public static final class a extends Serializer.c<GroupSuggestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupSuggestion a(Serializer serializer) {
            return new GroupSuggestion((Group) serializer.G(Group.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupSuggestion[i];
        }
    }

    /* compiled from: GroupSuggestion.kt */
    public static final class b {
        public static GroupSuggestion a(String str, Map map, JSONObject jSONObject) throws JSONException {
            return new GroupSuggestion(new Group(jSONObject.getJSONObject("group"), map), jSONObject.optString("description"), jSONObject.optString("reason"), jSONObject.optString("track_code"), str);
        }
    }

    public GroupSuggestion(Group group, String str, String str2, String str3, String str4) {
        this.b = group;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

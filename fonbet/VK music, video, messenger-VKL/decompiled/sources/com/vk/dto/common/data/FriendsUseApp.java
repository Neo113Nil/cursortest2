package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ms9;

/* compiled from: FriendsUseApp.kt */
/* loaded from: classes18.dex */
public final class FriendsUseApp implements Serializer.StreamParcelable {
    public static final Serializer.c<FriendsUseApp> CREATOR = new a();
    public final String b;
    public final List<ProfileItem> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FriendsUseApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendsUseApp a(Serializer serializer) {
            return new FriendsUseApp(serializer.H(), serializer.B(ProfileItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendsUseApp[i];
        }
    }

    public FriendsUseApp(String str, List<ProfileItem> list) {
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final FriendsUseApp a(JSONObject jSONObject) {
        ?? r2;
        String string = jSONObject.getString("description");
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray != null) {
            r2 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    long j = optJSONObject.getLong("object_id");
                    WebImage.a aVar = WebImage.CREATOR;
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("items");
                    aVar.getClass();
                    r2.add(new ProfileItem(j, WebImage.a.a(jSONArray2)));
                }
            }
        } else {
            r2 = 0;
        }
        if (r2 == 0) {
            r2 = EmptyList.b;
        }
        return new FriendsUseApp(string, r2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.f0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsUseApp)) {
            return false;
        }
        FriendsUseApp friendsUseApp = (FriendsUseApp) obj;
        return epx.f(this.b, friendsUseApp.b) && epx.f(this.c, friendsUseApp.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsUseApp(description=");
        sb.append(this.b);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

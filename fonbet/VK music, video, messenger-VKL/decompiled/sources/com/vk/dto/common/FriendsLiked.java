package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.user.UserProfile;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.rl3;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: FriendsLiked.kt */
/* loaded from: classes18.dex */
public abstract class FriendsLiked implements Serializer.StreamParcelable, bxx {
    public final List<Integer> b;
    public List<? extends UserProfile> c;

    public FriendsLiked(List<Integer> list, List<? extends UserProfile> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.U(this.b);
        serializer.f0(this.c);
    }

    public abstract FriendsLikedEpisode d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // xsna.bxx
    public JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "friends_liked");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsLiked)) {
            return false;
        }
        FriendsLiked friendsLiked = (FriendsLiked) obj;
        return epx.f(this.b, friendsLiked.b) && epx.f(this.c, friendsLiked.c);
    }

    public int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FriendsLiked(Serializer serializer) {
        this((r0 == null || (r0 = rl3.s0(r0)) == null) ? EmptyList.b : r0, serializer.B(UserProfile.class.getClassLoader()));
        List s0;
        int[] c = serializer.c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FriendsLiked(JSONObject jSONObject) {
        this(r2 != null ? f370.J(r2) : EmptyList.b, null);
        JSONArray optJSONArray = jSONObject.optJSONArray("friends_liked");
    }
}

package com.vk.dto.podcast;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.FriendsLiked;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.i7o0;

/* compiled from: FriendsLikedEpisode.kt */
/* loaded from: classes18.dex */
public final class FriendsLikedEpisode extends FriendsLiked {
    public static final Serializer.c<FriendsLikedEpisode> CREATOR = new b();
    public static final a e = new a();
    public final MusicTrack d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<FriendsLikedEpisode> {
        @Override // xsna.aay
        public final FriendsLikedEpisode a(JSONObject jSONObject) {
            return new FriendsLikedEpisode(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<FriendsLikedEpisode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendsLikedEpisode a(Serializer serializer) {
            return new FriendsLikedEpisode(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendsLikedEpisode[i];
        }
    }

    public FriendsLikedEpisode(List<Integer> list, List<? extends UserProfile> list2, MusicTrack musicTrack) {
        super(list, list2);
        this.d = musicTrack;
    }

    @Override // com.vk.dto.common.FriendsLiked, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.d);
    }

    @Override // com.vk.dto.common.FriendsLiked
    public final FriendsLikedEpisode d() {
        ArrayList a2 = i7o0.a(this.b);
        List<? extends UserProfile> list = this.c;
        return new FriendsLikedEpisode(a2, list != null ? i7o0.a(list) : null, MusicTrack.zb(this.d, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575));
    }

    @Override // com.vk.dto.common.FriendsLiked
    public final String e() {
        return this.d.Fb();
    }

    @Override // com.vk.dto.common.FriendsLiked, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("episode", this.d.e5());
        return e5;
    }

    @Override // com.vk.dto.common.FriendsLiked
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        FriendsLikedEpisode friendsLikedEpisode = obj instanceof FriendsLikedEpisode ? (FriendsLikedEpisode) obj : null;
        return epx.f(this.d, friendsLikedEpisode != null ? friendsLikedEpisode.d : null);
    }

    @Override // com.vk.dto.common.FriendsLiked
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.d);
    }

    public FriendsLikedEpisode(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("episode");
        this.d = optJSONObject != null ? new MusicTrack(optJSONObject) : new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null);
    }

    public FriendsLikedEpisode(Serializer serializer) {
        super(serializer);
        this.d = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
    }
}

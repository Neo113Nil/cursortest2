package com.vk.dto.music;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.ekh;
import xsna.epx;
import xsna.er;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PlaylistOwner.kt */
/* loaded from: classes18.dex */
public final class PlaylistOwner extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PlaylistOwner> CREATOR = new b();
    public static final a i = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final UserSex f;
    public final String g;
    public final Image h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PlaylistOwner> {
        @Override // xsna.aay
        public final PlaylistOwner a(JSONObject jSONObject) {
            return new PlaylistOwner(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PlaylistOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistOwner a(Serializer serializer) {
            return new PlaylistOwner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistOwner[i];
        }
    }

    public /* synthetic */ PlaylistOwner(UserId userId, String str, String str2, String str3, UserSex userSex, String str4, Image image, int i2, zcl zclVar) {
        this(userId, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? UserSex.UNKNOWN : userSex, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : image);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f.h());
        serializer.j0(this.g);
        serializer.e0(this.h);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new ekh(this, 27));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistOwner)) {
            return false;
        }
        PlaylistOwner playlistOwner = (PlaylistOwner) obj;
        return epx.f(this.b, playlistOwner.b) && epx.f(this.c, playlistOwner.c) && epx.f(this.d, playlistOwner.d) && epx.f(this.e, playlistOwner.e) && this.f == playlistOwner.f && epx.f(this.g, playlistOwner.g) && epx.f(this.h, playlistOwner.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.h;
        return hashCode3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistOwner(ownerId=");
        sb.append(this.b);
        sb.append(", ownerName=");
        sb.append(this.c);
        sb.append(", ownerNameGen=");
        sb.append(this.d);
        sb.append(", ownerFullName=");
        sb.append(this.e);
        sb.append(", sex=");
        sb.append(this.f);
        sb.append(", ownerFullNameDat=");
        sb.append(this.g);
        sb.append(", ownerImage=");
        return er.d(sb, this.h, ')');
    }

    public final Image zb() {
        return this.h;
    }

    public PlaylistOwner(UserId userId, String str, String str2, String str3, UserSex userSex, String str4, Image image) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = userSex;
        this.g = str4;
        this.h = image;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaylistOwner(Serializer serializer) {
        this(r2, r3, r4, r5, UserSex.a.a(r1), serializer.H(), (Image) serializer.A(Image.class.getClassLoader()));
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        if (userId != null) {
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String H3 = serializer.H();
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(serializer.u());
            aVar.getClass();
            return;
        }
        throw new IllegalArgumentException("Can't read userid");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaylistOwner(UserProfile userProfile) {
        this(r1, r2, r0.getString("first_name_gen"), userProfile.e, userProfile.i, r0.getString("name_dat"), userProfile.O);
        UserId userId = userProfile.c;
        String str = userProfile.d;
        Bundle bundle = userProfile.s;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaylistOwner(JSONObject jSONObject) {
        this(r1, r2, r3, r0, r5, r6, r4);
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String string = jSONObject.getString("owner_name");
        UserSex.a aVar = UserSex.Companion;
        Integer valueOf = Integer.valueOf(jSONObject.getInt("sex"));
        aVar.getClass();
        UserSex a2 = UserSex.a.a(valueOf);
        Image image = null;
        String string2 = jSONObject.has("owner_name_gen") ? jSONObject.getString("owner_name_gen") : null;
        String string3 = jSONObject.has("owner_full_name") ? jSONObject.getString("owner_full_name") : null;
        String string4 = jSONObject.has("owner_full_name_dat") ? jSONObject.getString("owner_full_name_dat") : null;
        if (jSONObject.has("owner_image")) {
            Serializer.c<Image> cVar = Image.CREATOR;
            image = Image.b.b(jSONObject.getJSONObject("owner_image"));
        }
    }

    public PlaylistOwner(Group group) {
        this(new UserId(-group.c.b), group.d, null, null, null, null, group.g, 60, null);
    }
}

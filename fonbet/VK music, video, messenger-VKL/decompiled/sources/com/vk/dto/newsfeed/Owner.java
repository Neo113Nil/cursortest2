package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.FriendsInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import xsna.bxx;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.ine0;
import xsna.myc0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: Owner.kt */
/* loaded from: classes18.dex */
public final class Owner implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Owner> CREATOR = new b();
    public UserId b;
    public String c;
    public String d;
    public String e;
    public VerifyInfo f;
    public Image g;
    public String h;
    public String i;
    public String j;
    public ImageStatus k;
    public UserSex l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public SocialButtonType s;
    public int t;
    public FriendsInfo u;
    public String v;
    public boolean w;
    public int x;

    /* compiled from: Owner.kt */
    public static final class a {
        public static String a(int i, Image image) {
            ImageSize Cb = image.Cb(i, true, false);
            if (Cb != null) {
                return Cb.d.d;
            }
            return null;
        }

        public static Owner b(JSONObject jSONObject) {
            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            owner.b = new UserId(jSONObject.optLong("id"));
            owner.c = jSONObject.optString("name");
            owner.d = jSONObject.optString("photo_base");
            owner.e = jSONObject.optString("photo");
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(jSONObject.optInt("sex"));
            aVar.getClass();
            owner.l = UserSex.a.a(valueOf);
            owner.x = jSONObject.optInt("flags");
            Serializer.c<VerifyInfo> cVar = VerifyInfo.CREATOR;
            owner.f = VerifyInfo.a.a(jSONObject);
            Serializer.c<Image> cVar2 = Image.CREATOR;
            owner.g = Image.b.b(jSONObject);
            owner.h = jSONObject.optString("first_name_gen");
            owner.i = jSONObject.optString("last_name_gen");
            owner.j = jSONObject.optString("first_name_acc");
            owner.t = jSONObject.optInt("members_count");
            Serializer.c<FriendsInfo> cVar3 = FriendsInfo.CREATOR;
            owner.u = FriendsInfo.a.a(jSONObject);
            owner.v = f370.D(jSONObject, "url");
            Boolean q = f370.q(jSONObject, "has_live_badge");
            owner.w = q != null ? q.booleanValue() : false;
            return owner;
        }

        public static Owner c(JSONObject jSONObject) {
            Set set;
            String D = f370.D(jSONObject, "photo_base");
            AvatarSize.Companion.getClass();
            set = AvatarSize.SIZES_OBSOLETE;
            Image a = AvatarSize.a.a(set, jSONObject);
            if (a == null) {
                a = Image.d;
            }
            UserId userId = new UserId(jSONObject.optLong("id"));
            String optString = jSONObject.optString("name");
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(jSONObject.optInt("sex"));
            aVar.getClass();
            UserSex a2 = UserSex.a.a(valueOf);
            String n = ine0.n(a, D);
            if (n == null) {
                n = f370.D(jSONObject, "photo");
            }
            String str = n;
            Serializer.c<VerifyInfo> cVar = VerifyInfo.CREATOR;
            VerifyInfo a3 = VerifyInfo.a.a(jSONObject);
            if (D != null) {
                Serializer.c<Image> cVar2 = Image.CREATOR;
                a = Image.b.a(D);
            }
            Image image = a;
            String D2 = f370.D(jSONObject, "url");
            Boolean q = f370.q(jSONObject, "has_live_badge");
            return new Owner(userId, optString, D, str, a3, image, null, null, null, null, a2, null, null, false, false, false, false, null, 0, null, D2, q != null ? q.booleanValue() : false, 1047488, null);
        }

        public static Owner d(JSONObject jSONObject) {
            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            owner.b = new UserId(-jSONObject.optLong("id"));
            owner.c = jSONObject.optString("name");
            Serializer.c<VerifyInfo> cVar = VerifyInfo.CREATOR;
            owner.f = VerifyInfo.a.a(jSONObject);
            owner.d = jSONObject.optString("photo_base");
            Serializer.c<Image> cVar2 = Image.CREATOR;
            Image b = Image.b.b(jSONObject);
            owner.g = b;
            String n = ine0.n(b, cqm0.a(owner.d));
            if (n == null) {
                n = cqm0.a(jSONObject.optString("photo_200"));
                String a = cqm0.a(jSONObject.optString("photo_100"));
                String a2 = cqm0.a(jSONObject.optString("photo_50"));
                if (n == null) {
                    n = a == null ? a2 : a;
                }
            }
            owner.e = n;
            owner.g(2, jSONObject.optInt("is_admin", 0) == 1);
            owner.g(4, jSONObject.optInt("is_member", 0) == 1);
            owner.o(myc0.f(jSONObject.optString("deactivated")));
            owner.g(4096, epx.f(jSONObject.optString("deactivated"), "banned") || epx.f(jSONObject.optString("deactivated"), "geo_banned"));
            owner.n(jSONObject.optInt("is_closed") > 0);
            owner.g(256, jSONObject.optBoolean("is_government_organization"));
            int optInt = jSONObject.optInt("trust_mark", 0);
            owner.g(8192, optInt == 4 || optInt == 5);
            owner.g(16384, optInt == 5);
            owner.g(64, jSONObject.optInt("can_upload_story", 0) == 1);
            owner.g(128, jSONObject.optInt("can_post_donut", 0) == 1);
            owner.o = jSONObject.optInt("can_message", 0) == 1;
            owner.q = jSONObject.optBoolean("has_unseen_stories");
            owner.B(jSONObject.optBoolean("is_nft_photo"));
            owner.t = jSONObject.optInt("members_count");
            Serializer.c<FriendsInfo> cVar3 = FriendsInfo.CREATOR;
            owner.u = FriendsInfo.a.a(jSONObject);
            owner.v = jSONObject.optString("url");
            JSONObject optJSONObject = jSONObject.optJSONObject("video_lives_data");
            owner.w = optJSONObject != null ? optJSONObject.optBoolean("has_badge") : false;
            return owner;
        }

        public static Owner e(JSONObject jSONObject) {
            return new Owner(new UserId(jSONObject.getLong("id")), jSONObject.getString("name"), jSONObject.getString("photo_base"), jSONObject.getString("photo"), null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194288, null);
        }

        public static Owner f(JSONObject jSONObject) {
            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            owner.b = new UserId(jSONObject.optLong("id"));
            String optString = jSONObject.optString("first_name");
            if (optString == null) {
                optString = "";
            }
            owner.m = optString;
            String optString2 = jSONObject.optString("last_name");
            owner.n = optString2 != null ? optString2 : "";
            owner.c = owner.m + ' ' + owner.n;
            Serializer.c<VerifyInfo> cVar = VerifyInfo.CREATOR;
            owner.f = VerifyInfo.a.a(jSONObject);
            String optString3 = jSONObject.optString("photo_base");
            owner.d = optString3;
            owner.e = ine0.n(owner.g, optString3);
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(jSONObject.optInt("sex", UserSex.UNKNOWN.h()));
            aVar.getClass();
            owner.l = UserSex.a.a(valueOf);
            int optInt = jSONObject.optInt("friend_status", 0);
            owner.g(4, optInt == 3 || optInt == 1);
            owner.p(optInt == 3);
            owner.h = jSONObject.optString("first_name_gen");
            owner.j = jSONObject.optString("first_name_acc");
            owner.k = com.vk.dto.user.a.b(jSONObject);
            owner.g(4096, epx.f(jSONObject.optString("deactivated"), "banned"));
            owner.o = jSONObject.optInt("can_write_private_message", 0) == 1;
            owner.p = jSONObject.optInt("blacklisted", 0) == 1;
            owner.q = jSONObject.optBoolean("has_unseen_stories");
            owner.r = jSONObject.optInt("hidden", 0) == 1;
            owner.B(jSONObject.optBoolean("is_nft"));
            SocialButtonType.a aVar2 = SocialButtonType.Companion;
            String optString4 = jSONObject.optString("social_button_type");
            aVar2.getClass();
            owner.s = SocialButtonType.a.a(optString4);
            owner.t = jSONObject.has("members_count") ? jSONObject.optInt("members_count") : jSONObject.optInt("followers_count");
            Serializer.c<FriendsInfo> cVar2 = FriendsInfo.CREATOR;
            owner.u = FriendsInfo.a.a(jSONObject);
            owner.i = jSONObject.optString("last_name_gen");
            return owner;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Owner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Owner a(Serializer serializer) {
            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                throw new IllegalArgumentException("Can't read entity id");
            }
            owner.b = userId;
            owner.c = serializer.H();
            owner.e = serializer.H();
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(serializer.u());
            aVar.getClass();
            owner.l = UserSex.a.a(valueOf);
            owner.x = serializer.u();
            owner.f = (VerifyInfo) serializer.G(VerifyInfo.class.getClassLoader());
            owner.g = (Image) serializer.G(Image.class.getClassLoader());
            owner.h = serializer.H();
            owner.j = serializer.H();
            owner.k = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
            owner.o = serializer.m();
            owner.p = serializer.m();
            owner.q = serializer.m();
            owner.r = serializer.m();
            SocialButtonType.a aVar2 = SocialButtonType.Companion;
            String H = serializer.H();
            aVar2.getClass();
            owner.s = SocialButtonType.a.a(H);
            owner.t = serializer.u();
            owner.u = (FriendsInfo) serializer.A(FriendsInfo.class.getClassLoader());
            owner.m = serializer.H();
            owner.n = serializer.H();
            owner.i = serializer.H();
            owner.d = serializer.H();
            owner.v = serializer.H();
            owner.w = serializer.m();
            return owner;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Owner[i];
        }
    }

    public Owner() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
    }

    public static Owner e(Owner owner, UserId userId, int i) {
        boolean z;
        boolean z2;
        UserId userId2 = (i & 1) != 0 ? owner.b : userId;
        String str = owner.c;
        String str2 = owner.d;
        String str3 = owner.e;
        VerifyInfo verifyInfo = owner.f;
        Image image = owner.g;
        String str4 = owner.h;
        String str5 = owner.i;
        String str6 = owner.j;
        ImageStatus imageStatus = owner.k;
        UserSex userSex = owner.l;
        String str7 = owner.m;
        String str8 = owner.n;
        boolean z3 = owner.o;
        boolean z4 = owner.p;
        if ((i & 32768) != 0) {
            z = z3;
            z2 = owner.q;
        } else {
            z = z3;
            z2 = false;
        }
        boolean z5 = z2;
        boolean z6 = owner.r;
        SocialButtonType socialButtonType = owner.s;
        int i2 = owner.t;
        FriendsInfo friendsInfo = owner.u;
        String str9 = owner.v;
        boolean z7 = owner.w;
        owner.getClass();
        return new Owner(userId2, str, str2, str3, verifyInfo, image, str4, str5, str6, imageStatus, userSex, str7, str8, z, z4, z5, z6, socialButtonType, i2, friendsInfo, str9, z7);
    }

    public final void B(boolean z) {
        g(1024, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.e);
        serializer.S(this.l.h());
        serializer.S(this.x);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.j);
        serializer.i0(this.k);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        SocialButtonType socialButtonType = this.s;
        serializer.j0(socialButtonType != null ? socialButtonType.name() : null);
        serializer.S(this.t);
        serializer.e0(this.u);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.i);
        serializer.j0(this.d);
        serializer.j0(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
    }

    public final Owner d() {
        Owner e = e(this, this.b, 4194302);
        e.x = this.x;
        return e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b.b);
        jSONObject.put("name", this.c);
        jSONObject.put("photo_base", this.d);
        jSONObject.put("photo", this.e);
        jSONObject.put("sex", this.l.h());
        VerifyInfo verifyInfo = this.f;
        if (verifyInfo != null) {
            verifyInfo.Eb(jSONObject);
        }
        jSONObject.put("flags", this.x);
        jSONObject.put("members_count", this.t);
        FriendsInfo friendsInfo = this.u;
        jSONObject.put("friends", friendsInfo != null ? friendsInfo.e5() : null);
        jSONObject.put("url", this.v);
        jSONObject.put("has_live_badge", this.w);
        Image image = this.g;
        if (image != null && (arrayList = image.b) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ImageSize imageSize = (ImageSize) it.next();
                jSONObject.put("photo_" + imageSize.d.b, imageSize.d.d);
            }
        }
        ImageStatus imageStatus = this.k;
        if (imageStatus != null) {
            jSONObject.put(imageStatus.f != -1 ? "emoji_status" : "image_status", imageStatus.e5());
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        return epx.f(this.b, owner.b) && epx.f(this.c, owner.c) && epx.f(this.d, owner.d) && epx.f(this.e, owner.e) && epx.f(this.f, owner.f) && epx.f(this.g, owner.g) && epx.f(this.h, owner.h) && epx.f(this.i, owner.i) && epx.f(this.j, owner.j) && epx.f(this.k, owner.k) && this.l == owner.l && epx.f(this.m, owner.m) && epx.f(this.n, owner.n) && this.o == owner.o && this.p == owner.p && this.q == owner.q && this.r == owner.r && this.s == owner.s && this.t == owner.t && epx.f(this.u, owner.u) && epx.f(this.v, owner.v) && this.w == owner.w;
    }

    public final String f(int i) {
        ImageSize Cb;
        String str;
        Image image = this.g;
        return (image == null || (Cb = image.Cb(i, true, false)) == null || (str = Cb.d.d) == null) ? this.e : str;
    }

    public final void g(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.x;
        } else {
            i2 = (~i) & this.x;
        }
        this.x = i2;
    }

    public final UserId getUid() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VerifyInfo verifyInfo = this.f;
        int hashCode5 = (hashCode4 + (verifyInfo == null ? 0 : verifyInfo.hashCode())) * 31;
        Image image = this.g;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        String str4 = this.h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ImageStatus imageStatus = this.k;
        int hashCode10 = (this.l.hashCode() + ((hashCode9 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31)) * 31;
        String str7 = this.m;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b((hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        SocialButtonType socialButtonType = this.s;
        int a2 = shy.a(this.t, (b2 + (socialButtonType == null ? 0 : socialButtonType.hashCode())) * 31, 31);
        FriendsInfo friendsInfo = this.u;
        int hashCode12 = (a2 + (friendsInfo == null ? 0 : friendsInfo.hashCode())) * 31;
        String str9 = this.v;
        return Boolean.hashCode(this.w) + ((hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final boolean i(int i) {
        return (i & this.x) > 0;
    }

    public final boolean j() {
        return i(16);
    }

    public final boolean k() {
        return i(8);
    }

    public final boolean l() {
        return this.l == UserSex.FEMALE;
    }

    public final void n(boolean z) {
        g(16, z);
    }

    public final void o(boolean z) {
        g(8, z);
    }

    public final void p(boolean z) {
        g(512, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Owner(uid=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", photoBase=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", verifyInfo=");
        sb.append(this.f);
        sb.append(", image=");
        sb.append(this.g);
        sb.append(", firstNameGen=");
        sb.append(this.h);
        sb.append(", lastNameGen=");
        sb.append(this.i);
        sb.append(", firstNameAcc=");
        sb.append(this.j);
        sb.append(", imageStatus=");
        sb.append(this.k);
        sb.append(", sex=");
        sb.append(this.l);
        sb.append(", firstName=");
        sb.append(this.m);
        sb.append(", lastName=");
        sb.append(this.n);
        sb.append(", canWriteMessage=");
        sb.append(this.o);
        sb.append(", blacklisted=");
        sb.append(this.p);
        sb.append(", hasUnseenStories=");
        sb.append(this.q);
        sb.append(", isHidden=");
        sb.append(this.r);
        sb.append(", socialButtonType=");
        sb.append(this.s);
        sb.append(", membersCount=");
        sb.append(this.t);
        sb.append(", friends=");
        sb.append(this.u);
        sb.append(", url=");
        sb.append(this.v);
        sb.append(", hasLiveBadge=");
        return q0.a(sb, this.w, ')');
    }

    public final void u(Owner owner) {
        UserId userId;
        String str;
        UserSex userSex;
        Image image;
        VerifyInfo verifyInfo;
        if (owner == null || (userId = owner.b) == null) {
            userId = UserId.d;
        }
        this.b = userId;
        if (owner == null || (str = owner.c) == null) {
            str = "DELETED";
        }
        this.c = str;
        this.d = owner != null ? owner.d : null;
        this.e = owner != null ? owner.e : null;
        if (owner == null || (userSex = owner.l) == null) {
            userSex = UserSex.UNKNOWN;
        }
        this.l = userSex;
        this.x = owner != null ? owner.x : 0;
        this.f = (owner == null || (verifyInfo = owner.f) == null) ? null : new VerifyInfo(verifyInfo.b, verifyInfo.c, verifyInfo.d, verifyInfo.e, verifyInfo.f, verifyInfo.g);
        this.g = (owner == null || (image = owner.g) == null) ? null : new Image(image.Fb());
        this.h = owner != null ? owner.h : null;
        this.j = owner != null ? owner.j : null;
        this.k = owner != null ? owner.k : null;
        this.o = owner != null ? owner.o : false;
        this.p = owner != null ? owner.p : false;
        this.q = owner != null ? owner.q : false;
        this.r = owner != null ? owner.r : false;
        this.s = owner != null ? owner.s : null;
        this.t = owner != null ? owner.t : 0;
        this.u = owner != null ? owner.u : null;
        this.m = owner != null ? owner.m : null;
        this.n = owner != null ? owner.n : null;
        this.i = owner != null ? owner.i : null;
        this.v = owner != null ? owner.v : null;
        this.w = owner != null ? owner.w : false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public Owner(UserId userId, String str) {
        this(userId, str, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194300, null);
    }

    public Owner(UserId userId, String str, String str2) {
        this(userId, str, str2, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null);
    }

    public Owner(UserId userId, String str, String str2, String str3) {
        this(userId, str, str2, str3, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194288, null);
    }

    public Owner(UserId userId, String str, String str2, String str3, VerifyInfo verifyInfo) {
        this(userId, str, str2, str3, verifyInfo, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194272, null);
    }

    public Owner(UserId userId, String str, String str2, String str3, VerifyInfo verifyInfo, Image image, String str4, String str5, String str6, ImageStatus imageStatus, UserSex userSex, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, SocialButtonType socialButtonType, int i, FriendsInfo friendsInfo, String str9, boolean z5) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = verifyInfo;
        this.g = image;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = imageStatus;
        this.l = userSex;
        this.m = str7;
        this.n = str8;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = socialButtonType;
        this.t = i;
        this.u = friendsInfo;
        this.v = str9;
        this.w = z5;
    }

    public /* synthetic */ Owner(UserId userId, String str, String str2, String str3, VerifyInfo verifyInfo, Image image, String str4, String str5, String str6, ImageStatus imageStatus, UserSex userSex, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, SocialButtonType socialButtonType, int i, FriendsInfo friendsInfo, String str9, boolean z5, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? UserId.d : userId, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : verifyInfo, (i2 & 32) != 0 ? null : image, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : imageStatus, (i2 & 1024) != 0 ? UserSex.UNKNOWN : userSex, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : str8, (i2 & 8192) != 0 ? true : z, (i2 & 16384) != 0 ? false : z2, (i2 & 32768) != 0 ? false : z3, (i2 & 65536) != 0 ? false : z4, (i2 & 131072) != 0 ? null : socialButtonType, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? 0 : i, (i2 & 524288) != 0 ? null : friendsInfo, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9, (i2 & 2097152) != 0 ? false : z5);
    }
}

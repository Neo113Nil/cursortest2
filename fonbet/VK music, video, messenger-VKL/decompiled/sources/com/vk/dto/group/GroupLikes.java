package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.dhh;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: GroupLikes.kt */
/* loaded from: classes18.dex */
public final class GroupLikes extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<GroupLikes> CREATOR = new b();
    public static final a g = new a();
    public UserId b;
    public boolean c;
    public int d;
    public final ArrayList<UserProfile> e;
    public final ArrayList<UserId> f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<GroupLikes> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aay
        public final GroupLikes a(JSONObject jSONObject) {
            return new GroupLikes(jSONObject, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupLikes> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupLikes a(Serializer serializer) {
            return new GroupLikes(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupLikes[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupLikes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void Ab(JSONObject jSONObject, Map<UserId, ? extends UserProfile> map) {
        JSONObject optJSONObject;
        UserProfile userProfile;
        JSONArray optJSONArray;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("friends")) == null) {
            return;
        }
        this.d = optJSONObject.optInt("count");
        if (map == null) {
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("preview");
            LinkedHashMap linkedHashMap = null;
            if (optJSONArray2 != null && (optJSONArray = optJSONObject.optJSONArray("preview_profiles")) != null) {
                linkedHashMap = new LinkedHashMap();
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    UserId userId = new UserId(optJSONArray2.getLong(i));
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    jSONObject2.put("id", userId.b);
                    linkedHashMap.put(userId, new UserProfile(jSONObject2, UserProfile.ObjectType.PROFILE));
                }
            }
            map = linkedHashMap;
        }
        JSONArray optJSONArray3 = optJSONObject.optJSONArray("preview");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                UserId userId2 = new UserId(optJSONArray3.getLong(i2));
                this.f.add(userId2);
                if (map != null && (userProfile = map.get(userId2)) != null) {
                    this.e.add(userProfile);
                }
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.S(this.d);
        serializer.W(this.e);
        serializer.f0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(d370.C(new dhh(this, 22)), "friends");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final UserId zb() {
        return this.b;
    }

    public GroupLikes(JSONObject jSONObject, Map<UserId, ? extends UserProfile> map) {
        this.b = UserId.d;
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        if (jSONObject != null && jSONObject.has("friends")) {
            Ab(jSONObject, map);
            return;
        }
        if (jSONObject != null && jSONObject.has("like")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("like");
            if (optJSONObject != null) {
                this.b = new UserId(optJSONObject.optLong("group_id"));
                this.c = optJSONObject.optBoolean("is_liked");
                Ab(optJSONObject, map);
                return;
            }
            return;
        }
        if (jSONObject != null) {
            this.b = new UserId(jSONObject.optLong("group_id"));
            this.c = jSONObject.optBoolean("is_liked");
            this.d = jSONObject.optInt("friends_count");
            JSONArray optJSONArray = jSONObject.optJSONArray("friends_ids");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.f.add(new UserId(optJSONArray.getLong(i)));
                }
            }
        }
    }

    public /* synthetic */ GroupLikes(JSONObject jSONObject, Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : jSONObject, (Map<UserId, ? extends UserProfile>) ((i & 2) != 0 ? null : map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupLikes(Serializer serializer, zcl zclVar) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.b = (UserId) serializer.A(UserId.class.getClassLoader());
        this.c = serializer.m();
        this.d = serializer.u();
        ArrayList<UserProfile> k = serializer.k(UserProfile.class);
        this.e = k == null ? new ArrayList<>() : k;
        this.f = serializer.B(UserId.class.getClassLoader());
    }
}

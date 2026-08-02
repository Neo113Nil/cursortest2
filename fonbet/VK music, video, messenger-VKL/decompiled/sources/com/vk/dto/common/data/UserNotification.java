package com.vk.dto.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;

/* loaded from: classes18.dex */
public class UserNotification extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UserNotification> CREATOR = new a();
    public final int b;
    public boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Image m;

    @Nullable
    public final String n;

    @Nullable
    public final ArrayList<UserProfile> o;

    @Nullable
    public final Action p;

    public class a extends Serializer.c<UserNotification> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserNotification a(@NonNull Serializer serializer) {
            return new UserNotification(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserNotification[i];
        }
    }

    public class b extends aay<UserNotification> {
        @Override // xsna.aay
        public final UserNotification a(JSONObject jSONObject) throws JSONException {
            String valueOf = String.valueOf(jSONObject.optString("type"));
            return new UserNotification(jSONObject.getJSONObject(valueOf), valueOf, jSONObject.optInt("id"), Collections.EMPTY_MAP);
        }
    }

    static {
        new b();
    }

    public UserNotification(JSONObject jSONObject, String str, int i, Map<UserId, UserProfile> map) throws JSONException {
        int i2 = 0;
        this.c = false;
        this.b = i;
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optString("message");
        this.f = str;
        String optString = jSONObject.optString(TtmlNode.TAG_LAYOUT);
        this.g = optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        if (optJSONObject == null) {
            this.l = null;
            this.k = null;
            this.i = null;
            this.j = null;
            this.h = null;
        } else {
            this.h = optJSONObject.optString("title");
            if ("new_post".equalsIgnoreCase(optString)) {
                this.j = "btn_new_post";
            } else {
                this.j = optJSONObject.optString(TtmlNode.TAG_STYLE, "cell");
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
            this.i = optJSONObject2 == null ? null : optJSONObject2.optString("type");
            this.k = optJSONObject2 == null ? null : optJSONObject2.optString("url");
            this.l = optJSONObject2 == null ? null : optJSONObject2.optString("target");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            this.m = new Image(optJSONArray);
        } else {
            this.m = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("button_close");
        if (optJSONObject3 == null) {
            this.p = null;
        } else if (optJSONObject3.has("action")) {
            Action.b bVar = Action.b;
            this.p = Action.a.a(optJSONObject3.optJSONObject("action"));
        } else {
            this.p = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("user_ids");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("group_ids");
        if (optJSONArray2 != null) {
            this.n = jSONObject.optString("users_description", null);
            this.o = new ArrayList<>();
            while (i2 < optJSONArray2.length()) {
                UserProfile userProfile = map.get(Integer.valueOf(optJSONArray2.optInt(i2)));
                if (userProfile != null) {
                    this.o.add(userProfile);
                }
                i2++;
            }
            return;
        }
        if (optJSONArray3 == null) {
            this.n = null;
            this.o = null;
            return;
        }
        this.n = jSONObject.optString("groups_description", null);
        this.o = new ArrayList<>();
        while (i2 < optJSONArray3.length()) {
            UserProfile userProfile2 = map.get(Integer.valueOf(-optJSONArray3.optInt(i2)));
            if (userProfile2 != null) {
                this.o.add(userProfile2);
            }
            i2++;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.S(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
        serializer.o0(this.o);
        serializer.i0(this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserNotification userNotification = (UserNotification) obj;
        Action action = userNotification.p;
        ArrayList<UserProfile> arrayList = userNotification.o;
        String str = userNotification.n;
        Image image = userNotification.m;
        String str2 = userNotification.l;
        String str3 = userNotification.k;
        String str4 = userNotification.j;
        String str5 = userNotification.i;
        String str6 = userNotification.h;
        String str7 = userNotification.g;
        String str8 = userNotification.f;
        String str9 = userNotification.e;
        String str10 = userNotification.d;
        if (this.b != userNotification.b || this.c != userNotification.c) {
            return false;
        }
        String str11 = this.d;
        if (str11 == null ? str10 != null : !str11.equals(str10)) {
            return false;
        }
        String str12 = this.e;
        if (str12 == null ? str9 != null : !str12.equals(str9)) {
            return false;
        }
        String str13 = this.f;
        if (str13 == null ? str8 != null : !str13.equals(str8)) {
            return false;
        }
        String str14 = this.g;
        if (str14 == null ? str7 != null : !str14.equals(str7)) {
            return false;
        }
        String str15 = this.h;
        if (str15 == null ? str6 != null : !str15.equals(str6)) {
            return false;
        }
        String str16 = this.i;
        if (str16 == null ? str5 != null : !str16.equals(str5)) {
            return false;
        }
        String str17 = this.j;
        if (str17 == null ? str4 != null : !str17.equals(str4)) {
            return false;
        }
        String str18 = this.k;
        if (str18 == null ? str3 != null : !str18.equals(str3)) {
            return false;
        }
        String str19 = this.l;
        if (str19 == null ? str2 != null : !str19.equals(str2)) {
            return false;
        }
        Image image2 = this.m;
        if (image2 == null ? image != null : !image2.equals(image)) {
            return false;
        }
        String str20 = this.n;
        if (str20 == null ? str != null : !str20.equals(str)) {
            return false;
        }
        ArrayList<UserProfile> arrayList2 = this.o;
        if (arrayList2 == null ? arrayList != null : !arrayList2.equals(arrayList)) {
            return false;
        }
        Action action2 = this.p;
        return action2 != null ? action2.equals(action) : action == null;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.d;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.i;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.j;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.k;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.l;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Image image = this.m;
        int hashCode10 = (hashCode9 + (image != null ? image.hashCode() : 0)) * 31;
        String str10 = this.n;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        ArrayList<UserProfile> arrayList = this.o;
        int hashCode12 = (hashCode11 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        Action action = this.p;
        return hashCode12 + (action != null ? action.hashCode() : 0);
    }

    public UserNotification(Serializer serializer) {
        this.c = false;
        this.b = serializer.u();
        this.c = serializer.p() != 0;
        this.d = serializer.H();
        this.e = serializer.H();
        this.f = serializer.H();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.H();
        this.j = serializer.H();
        this.k = serializer.H();
        this.l = serializer.H();
        this.m = (Image) serializer.G(Image.class.getClassLoader());
        this.n = serializer.H();
        this.o = serializer.j(UserProfile.CREATOR);
        this.p = (Action) serializer.G(Action.class.getClassLoader());
    }
}

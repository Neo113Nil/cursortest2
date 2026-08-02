package com.vk.dto.live;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.fkq0;
import xsna.s3q0;
import xsna.t230;

/* loaded from: classes18.dex */
public class LiveEventModel extends t230 implements Parcelable {
    public static final Parcelable.Creator<LiveEventModel> CREATOR = new a();
    public int A;
    public final StickerItem B;
    public final long C;
    public final String D;
    public final String E;
    public final ActionLink F;
    public final int G;
    public final ArrayList H;
    public final int c;
    public final UserId d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public boolean i;
    public UserId j;

    @Nullable
    public final UserProfile k;

    @Nullable
    public final Group l;
    public int m;
    public String n;
    public final String o;
    public int p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public int u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;

    public class a implements Parcelable.Creator<LiveEventModel> {
        @Override // android.os.Parcelable.Creator
        public final LiveEventModel createFromParcel(Parcel parcel) {
            return new LiveEventModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveEventModel[] newArray(int i) {
            return new LiveEventModel[i];
        }
    }

    public LiveEventModel() {
        UserId userId = UserId.d;
        this.d = userId;
        this.j = userId;
    }

    public final String d() {
        Group group = this.l;
        if (group != null) {
            return group.d;
        }
        UserProfile userProfile = this.k;
        return userProfile != null ? userProfile.e : "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        UserProfile userProfile = this.k;
        if (userProfile != null) {
            return userProfile.K().booleanValue();
        }
        return false;
    }

    public final void f(JSONObject jSONObject) {
        this.t = jSONObject.optInt("id");
        this.u = jSONObject.optInt("product_id");
        this.v = jSONObject.optString("photo_64");
        this.w = jSONObject.optString("photo_128");
        this.x = jSONObject.optString("photo_256");
        this.y = jSONObject.optString("photo_512");
        this.z = jSONObject.optInt("width");
        this.A = jSONObject.optInt("height");
    }

    public final void g(JSONObject jSONObject) throws JSONException, NullPointerException {
        this.m = jSONObject.optInt("id");
        this.j = new UserId(jSONObject.optLong("from_id"));
        this.n = jSONObject.optString("text");
        this.p = jSONObject.optInt("date");
        if (jSONObject.has("attachments")) {
            JSONArray jSONArray = jSONObject.getJSONArray("attachments");
            if (jSONArray.length() <= 0 || !jSONArray.getJSONObject(0).has("sticker")) {
                return;
            }
            f(jSONArray.getJSONObject(0).getJSONObject("sticker"));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.j, 0);
        parcel.writeParcelable(this.k, 0);
        parcel.writeParcelable(this.l, 0);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeLong(this.C);
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.F, 0);
    }

    public LiveEventModel(String str, int i, @Nullable UserProfile userProfile, @Nullable Group group, int i2, UserId userId, long j) {
        this.j = UserId.d;
        this.e = i2;
        this.d = userId;
        this.C = j;
        this.c = 2;
        if (userProfile != null) {
            this.j = userProfile.c;
        }
        if (group != null) {
            this.j = fkq0.e(group.c);
        }
        this.k = userProfile;
        this.l = group;
        this.n = str;
        this.t = i;
    }

    public LiveEventModel(WallWallCommentDto wallWallCommentDto, int i, UserId userId, @Nullable Owner owner, Boolean bool) {
        this.j = UserId.d;
        this.e = i;
        this.d = userId;
        this.C = wallWallCommentDto.g();
        this.m = wallWallCommentDto.getId();
        this.j = wallWallCommentDto.k();
        this.c = bool.booleanValue() ? 17 : 2;
        if (owner != null) {
            if (fkq0.b(this.j)) {
                Group group = new Group();
                this.l = group;
                group.d = owner.c;
                group.g = owner.g;
                group.e = owner.e;
                group.y.Ab(owner.f);
            } else {
                UserProfile userProfile = new UserProfile();
                this.k = userProfile;
                userProfile.e = owner.c;
                userProfile.O = owner.g;
                userProfile.h = owner.e;
                userProfile.B.Ab(owner.f);
            }
        }
        this.n = wallWallCommentDto.C();
    }

    public LiveEventModel(JSONObject jSONObject, int i, UserId userId, long j, @Nullable UserProfile userProfile, @Nullable Group group) throws JSONException, NullPointerException {
        ArrayList arrayList;
        this.j = UserId.d;
        this.e = i;
        this.d = userId;
        this.j = new UserId(jSONObject.optLong("user_id"));
        this.C = j;
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            string.getClass();
            switch (string) {
                case "sticker":
                    this.c = 10;
                    this.t = jSONObject.optInt("sticker_id");
                    if (jSONObject.has("sticker")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("sticker");
                        if (jSONObject2.has("id")) {
                            f(jSONObject2);
                            break;
                        } else if (jSONObject2.has("sticker_id")) {
                            StickerItem stickerItem = StickerItem.l;
                            StickerItem a2 = StickerItem.a.a(jSONObject2);
                            this.B = a2;
                            this.t = a2.b;
                            break;
                        }
                    }
                    break;
                case "video_like":
                    this.c = 5;
                    break;
                case "video_view":
                    this.c = 3;
                    this.f = jSONObject.optInt("count");
                    break;
                case "video_comment_new":
                    this.c = 2;
                    if (jSONObject.has("comment")) {
                        g(jSONObject.getJSONObject("comment"));
                        break;
                    }
                    break;
                case "follow":
                    this.c = 9;
                    break;
                case "start_comment":
                    this.c = 2;
                    g(jSONObject);
                    break;
                case "video_comment_delete":
                    this.c = 14;
                    this.m = jSONObject.optInt("comment_id");
                    break;
                case "video_unpin_comment":
                    this.c = 18;
                    this.m = jSONObject.optInt("comment_id");
                    break;
                case "announce":
                    this.c = 6;
                    this.E = jSONObject.optString("icon");
                    this.D = jSONObject.optString("text");
                    break;
                case "video_pin_comment":
                    this.c = 17;
                    if (jSONObject.has("comment")) {
                        g(jSONObject.getJSONObject("comment"));
                        break;
                    }
                    break;
                case "set_action_button":
                    this.c = 12;
                    if (jSONObject.has("action") && !jSONObject.isNull("action")) {
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("action");
                            String str = new ActionLink(jSONObject3).d;
                            int length = str.length();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                } else {
                                    int codePointAt = str.codePointAt(i2);
                                    if (!Character.isWhitespace(codePointAt)) {
                                        this.F = new ActionLink(jSONObject3);
                                        break;
                                    } else {
                                        i2 += Character.charCount(codePointAt);
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                    break;
                case "friend_enter":
                    this.c = 1;
                    break;
                case "share":
                    this.c = 11;
                    break;
                case "subscribe":
                    this.c = 8;
                    break;
                case "set_market_items_to_video":
                    this.c = 16;
                    Good.c cVar = Good.p0;
                    JSONArray optJSONArray = jSONObject.optJSONArray("market_items");
                    if (optJSONArray != null) {
                        int length2 = optJSONArray.length();
                        arrayList = new ArrayList(length2);
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                            if (optJSONObject != null) {
                                try {
                                    arrayList.add(cVar.a(optJSONObject));
                                } catch (Exception e) {
                                    L.i(e);
                                    s3q0 s3q0Var = s3q0.a;
                                }
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    this.H = arrayList;
                    break;
                case "start_pinned_comment":
                    this.c = 17;
                    g(jSONObject);
                    break;
                case "live_midroll":
                    this.c = 15;
                    jSONObject.optInt("duration");
                    break;
                case "click_action_button":
                    this.c = 13;
                    this.G = jSONObject.optInt("count");
                    break;
            }
        }
        if (jSONObject.has("user")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("user");
            this.k = new UserProfile(jSONObject4);
            this.j = new UserId(jSONObject4.optLong("id"));
        }
        if (userProfile != null) {
            this.k = userProfile;
            this.j = userProfile.c;
        }
        if (group != null) {
            this.l = group;
            this.j = fkq0.e(group.c);
        }
        if (jSONObject.has("group")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("group");
            this.l = new Group(jSONObject5);
            this.j = new UserId(jSONObject5.optLong("id") * (-1));
        }
        jSONObject.optInt("votes");
        jSONObject.optInt("total_votes");
    }

    public LiveEventModel(Parcel parcel) {
        UserId userId = UserId.d;
        this.d = userId;
        this.j = userId;
        this.c = parcel.readInt();
        this.d = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.j = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        this.k = (UserProfile) parcel.readParcelable(UserProfile.class.getClassLoader());
        this.l = (Group) parcel.readParcelable(Group.class.getClassLoader());
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.C = parcel.readLong();
        this.B = (StickerItem) parcel.readParcelable(StickerItem.class.getClassLoader());
        this.F = (ActionLink) parcel.readParcelable(ActionLink.class.getClassLoader());
    }
}

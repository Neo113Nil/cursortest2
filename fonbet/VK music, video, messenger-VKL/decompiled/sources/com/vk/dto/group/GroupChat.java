package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupChat.kt */
/* loaded from: classes18.dex */
public final class GroupChat extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupChat> CREATOR = new b();
    public static final a m = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public long g;
    public final long h;
    public final int i;
    public final long j;
    public final long k;
    public final boolean l;

    /* compiled from: GroupChat.kt */
    public static final class a extends aay<GroupChat> {
        @Override // xsna.aay
        public final GroupChat a(JSONObject jSONObject) {
            return new GroupChat(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupChat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupChat a(Serializer serializer) {
            return new GroupChat(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChat[i];
        }
    }

    public GroupChat(int i, String str, String str2, String str3, int i2, long j, long j2, int i3, long j3, long j4, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.g = j;
        this.h = j2;
        this.i = i3;
        this.j = j3;
        this.k = j4;
        this.l = z;
    }

    public final String Ab() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.Y(this.g);
        serializer.Y(this.h);
        serializer.S(this.i);
        serializer.Y(this.j);
        serializer.Y(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChat)) {
            return false;
        }
        GroupChat groupChat = (GroupChat) obj;
        return this.b == groupChat.b && epx.f(this.c, groupChat.c) && epx.f(this.d, groupChat.d) && epx.f(this.e, groupChat.e) && this.f == groupChat.f && this.g == groupChat.g && this.h == groupChat.h && this.i == groupChat.i && this.j == groupChat.j && this.k == groupChat.k && this.l == groupChat.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + bh10.a(bh10.a(shy.a(this.i, bh10.a(bh10.a(shy.a(this.f, urd0.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupChat(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", photo=");
        sb.append(this.d);
        sb.append(", inviteLink=");
        sb.append(this.e);
        sb.append(", activityCount=");
        sb.append(this.f);
        sb.append(", lastMessageDate=");
        sb.append(this.g);
        sb.append(", chatId=");
        sb.append(this.h);
        sb.append(", membersCount=");
        sb.append(this.i);
        sb.append(", ownerId=");
        sb.append(this.j);
        sb.append(", peerId=");
        sb.append(this.k);
        sb.append(", isDonut=");
        return q0.a(sb, this.l, ')');
    }

    public final String zb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append('_');
        sb.append(this.k);
        return sb.toString();
    }

    public GroupChat(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optString("title"), jSONObject.optString("photo"), jSONObject.optString("invite_link"), jSONObject.optInt("activity_count"), jSONObject.optLong("last_message_date"), jSONObject.optLong("chat_id"), jSONObject.optInt("members_count"), jSONObject.optLong("owner_id"), jSONObject.optLong("peer_id"), jSONObject.optBoolean("is_donut"));
    }

    public GroupChat(Serializer serializer) {
        this(serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.w(), serializer.w(), serializer.u(), serializer.w(), serializer.w(), serializer.m());
    }
}

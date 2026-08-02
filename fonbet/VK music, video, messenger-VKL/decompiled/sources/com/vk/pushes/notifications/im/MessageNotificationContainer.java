package com.vk.pushes.notifications.im;

import android.os.Bundle;
import android.os.Parcel;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.channels.ChannelType;
import java.util.Map;
import org.json.JSONObject;
import xsna.ad0;
import xsna.cqm0;
import xsna.dfq0;
import xsna.epx;
import xsna.f370;
import xsna.ho8;

/* compiled from: MessageNotificationContainer.kt */
/* loaded from: classes5.dex */
public final class MessageNotificationContainer extends dfq0.a implements Serializer.StreamParcelable {
    public static final Serializer.c<MessageNotificationContainer> CREATOR = new b();
    public final int A;
    public final Long B;
    public final Long C;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final ChannelType r;
    public final boolean s;
    public final boolean t;
    public boolean u;
    public final long v;
    public final Long w;
    public final String x;
    public final Long y;
    public final long z;

    /* compiled from: MessageNotificationContainer.kt */
    public static final class a {
        public static long a(JSONObject jSONObject) {
            return jSONObject.has("chat_id") ? jSONObject.optLong("chat_id") : jSONObject.has("sender_id") ? jSONObject.optLong("sender_id") : jSONObject.optLong("peer_id");
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MessageNotificationContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MessageNotificationContainer a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            long w = serializer.w();
            String H3 = serializer.H();
            String H4 = serializer.H();
            if (H4 == null) {
                H4 = "";
            }
            boolean m = serializer.m();
            String H5 = serializer.H();
            if (H5 == null) {
                H5 = "";
            }
            Long x = serializer.x();
            String H6 = serializer.H();
            if (H6 == null) {
                H6 = "";
            }
            long w2 = serializer.w();
            int u = serializer.u();
            boolean z = serializer.u() == 1;
            boolean z2 = serializer.u() == 1;
            boolean m2 = serializer.m();
            Long x2 = serializer.x();
            Long x3 = serializer.x();
            boolean m3 = serializer.m();
            ChannelType.a aVar = ChannelType.Companion;
            String H7 = serializer.H();
            aVar.getClass();
            MessageNotificationContainer a = com.vk.pushes.notifications.im.a.a(H, H2, w, H3, H4, m, H5, x, H6, x2, x3, w2, u, z, z2, m2, m3, ChannelType.a.a(H7));
            serializer.o(MessageNotificationContainer.class.getClassLoader());
            return a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessageNotificationContainer[i];
        }
    }

    public MessageNotificationContainer(Map<String, String> map) {
        super(map);
        String str = map.get("sender");
        this.o = str == null ? "" : str;
        this.p = epx.f(map.get("failed"), "1");
        this.q = epx.f(map.get("type"), "group_channel");
        ChannelType.a aVar = ChannelType.Companion;
        String str2 = map.get("channel_type");
        aVar.getClass();
        this.r = ChannelType.a.a(str2);
        this.s = epx.f(map.get("type"), "community_msg");
        String str3 = map.get("sound");
        boolean equals = (str3 != null ? str3 : "").equals("1");
        this.t = equals;
        this.u = !equals;
        String str4 = map.get("time");
        this.v = str4 != null ? cqm0.l(str4) : 0L;
        String str5 = map.get("to_id");
        this.w = str5 != null ? cqm0.k(str5) : null;
        this.x = map.get(X3.j.D);
        String str6 = map.get("context");
        JSONObject jSONObject = str6 != null ? new JSONObject(str6) : new JSONObject();
        this.y = f370.z(jSONObject, "chat_id");
        this.z = a.a(jSONObject);
        this.A = jSONObject.optInt("conversation_message_id", jSONObject.optInt("msg_id"));
        this.B = Long.valueOf(jSONObject.optLong("sender_id"));
        this.C = jSONObject.has("group_id") ? Long.valueOf(-jSONObject.optLong("group_id")) : null;
    }

    public final void B() {
        this.u = true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.e);
        serializer.j0(this.g);
        serializer.Y(this.v);
        serializer.j0(this.h);
        serializer.j0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.j0(this.o);
        serializer.b0(this.w);
        serializer.j0(this.x);
        serializer.Y(this.z);
        serializer.S(this.A);
        serializer.S(this.t ? 1 : 0);
        serializer.S(this.p ? 1 : 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.b0(this.B);
        serializer.b0(this.y);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        ChannelType channelType = this.r;
        serializer.j0(channelType != null ? channelType.i() : null);
        serializer.K(new Bundle());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ChannelType e() {
        return this.r;
    }

    public final Long f() {
        return this.y;
    }

    public final boolean g() {
        return this.p;
    }

    public final String i() {
        return this.x;
    }

    public final Long j() {
        Long l = this.C;
        return l == null ? this.w : l;
    }

    public final Long k() {
        return this.B;
    }

    public final boolean l() {
        if (this.q) {
            return false;
        }
        return com.vk.dto.common.b.a(this.z) || this.p;
    }

    public final Long n() {
        return this.w;
    }

    public final boolean o() {
        return this.q;
    }

    public final boolean p() {
        return this.s;
    }

    @Override // xsna.dfq0.a
    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotificationContainer(sender='");
        sb.append(this.o);
        sb.append("', senderId=");
        sb.append(this.B);
        sb.append(", toId=");
        sb.append(this.w);
        sb.append(", chatId=");
        sb.append(this.y);
        sb.append(", peerId=");
        sb.append(this.z);
        sb.append(", timeMs=");
        sb.append(this.v);
        sb.append(", playSound=");
        sb.append(this.t);
        sb.append(", failed=");
        sb.append(this.p);
        sb.append(", isChannel=");
        sb.append(this.q);
        sb.append(", disableVibration=");
        sb.append(this.u);
        sb.append(", isCommunityType=");
        sb.append(this.s);
        sb.append(", channelType=");
        ChannelType channelType = this.r;
        return ho8.a(sb, channelType != null ? channelType.i() : null, ')');
    }

    public final boolean u() {
        return ad0.B(this.r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

package com.vk.im.engine.internal.api_commands.messages;

import com.huawei.hms.api.ConnectionResult;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesSendResponseDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.network.kbh.state.NetworkState;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bz2;
import xsna.d370;
import xsna.d6q0;
import xsna.epx;
import xsna.eq;
import xsna.ho8;
import xsna.jt50;
import xsna.kvf;
import xsna.l7r0;
import xsna.nx2;
import xsna.qoy;
import xsna.qq;
import xsna.rq;
import xsna.s3q0;
import xsna.tfx;
import xsna.urd0;
import xsna.vg20;
import xsna.w9y;
import xsna.xa4;
import xsna.xy2;

/* compiled from: MessagesSendApiCmd.kt */
/* loaded from: classes2.dex */
public final class b extends nx2<C1113b> {
    public final MsgFromUser b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g = true;
    public final MsgSendSource h;
    public final Peer i;

    /* compiled from: MessagesSendApiCmd.kt */
    public static final class a {
        public final Integer a;
        public final Boolean b;
        public final Boolean c;
        public final Integer d;
        public final UserId e;
        public final String f;
        public final String g;
        public final Float h;
        public final Float i;
        public final String j;
        public final Integer k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final UserId s;
        public final Integer t;
        public final Boolean u;
        public final String v;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && epx.f(this.t, aVar.t) && epx.f(this.u, aVar.u) && epx.f(this.v, aVar.v);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.c;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            UserId userId = this.e;
            int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.f;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Float f = this.h;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.i;
            int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str3 = this.j;
            int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 29791;
            Integer num3 = this.k;
            int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str4 = this.l;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.m;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.o;
            int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.p;
            int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.q;
            int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.r;
            int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
            UserId userId2 = this.s;
            int hashCode19 = (hashCode18 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Integer num4 = this.t;
            int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool3 = this.u;
            int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str11 = this.v;
            return hashCode21 + (str11 != null ? str11.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(cmid=");
            sb.append(this.a);
            sb.append(", keepForwardMessages=");
            sb.append(this.b);
            sb.append(", keepSnippets=");
            sb.append(this.c);
            sb.append(", randomId=");
            sb.append(this.d);
            sb.append(", peerId=");
            sb.append(this.e);
            sb.append(", message=");
            sb.append(this.f);
            sb.append(", formatData=");
            sb.append(this.g);
            sb.append(", lat=");
            sb.append(this.h);
            sb.append(", long=");
            sb.append(this.i);
            sb.append(", attachment=");
            sb.append(this.j);
            sb.append(", replyTo=null, forwardMessages=null, stickerId=");
            sb.append(this.k);
            sb.append(", stickerReferrer=");
            sb.append(this.l);
            sb.append(", payload=");
            sb.append(this.m);
            sb.append(", refSource=");
            sb.append(this.n);
            sb.append(", ref=");
            sb.append(this.o);
            sb.append(", entrypoint=");
            sb.append(this.p);
            sb.append(", marusyaSkill=");
            sb.append(this.q);
            sb.append(", marusyaIntent=");
            sb.append(this.r);
            sb.append(", groupId=");
            sb.append(this.s);
            sb.append(", expireTtl=");
            sb.append(this.t);
            sb.append(", silent=");
            sb.append(this.u);
            sb.append(", trackCode=");
            return ho8.a(sb, this.v, ')');
        }

        public a(Integer num, Boolean bool, Boolean bool2, Integer num2, UserId userId, String str, String str2, Float f, Float f2, String str3, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, UserId userId2, Integer num4, Boolean bool3, String str11, int i) {
            Integer num5 = (i & 1) != 0 ? null : num;
            Boolean bool4 = (i & 2) != 0 ? null : bool;
            Boolean bool5 = (i & 4) != 0 ? null : bool2;
            Integer num6 = (i & 8) != 0 ? null : num2;
            UserId userId3 = (i & 16) != 0 ? null : userId;
            String str12 = (i & 32) != 0 ? null : str;
            String str13 = (i & 64) != 0 ? null : str2;
            Float f3 = (i & 128) != 0 ? null : f;
            Float f4 = (i & 256) != 0 ? null : f2;
            String str14 = (i & 512) != 0 ? null : str3;
            Integer num7 = (i & 4096) != 0 ? null : num3;
            String str15 = (i & 8192) != 0 ? null : str4;
            String str16 = (i & 16384) != 0 ? null : str5;
            String str17 = (i & 32768) != 0 ? null : str6;
            String str18 = (i & 65536) != 0 ? null : str7;
            String str19 = (i & 131072) != 0 ? null : str8;
            String str20 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str9;
            String str21 = (i & 524288) != 0 ? null : str10;
            UserId userId4 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : userId2;
            Integer num8 = (i & 2097152) != 0 ? null : num4;
            Boolean bool6 = (i & 4194304) != 0 ? null : bool3;
            String str22 = (i & 8388608) != 0 ? null : str11;
            this.a = num5;
            this.b = bool4;
            this.c = bool5;
            this.d = num6;
            this.e = userId3;
            this.f = str12;
            this.g = str13;
            this.h = f3;
            this.i = f4;
            this.j = str14;
            this.k = num7;
            this.l = str15;
            this.m = str16;
            this.n = str17;
            this.o = str18;
            this.p = str19;
            this.q = str20;
            this.r = str21;
            this.s = userId4;
            this.t = num8;
            this.u = bool6;
            this.v = str22;
        }
    }

    /* compiled from: MessagesSendApiCmd.kt */
    /* renamed from: com.vk.im.engine.internal.api_commands.messages.b$b, reason: collision with other inner class name */
    public static final class C1113b {
        public final int a;

        public C1113b(int i) {
            this.a = i;
        }
    }

    public b(MsgFromUser msgFromUser, boolean z, boolean z2, String str, String str2, MsgSendSource msgSendSource, Peer peer) {
        this.b = msgFromUser;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.h = msgSendSource;
        this.i = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g == bVar.g && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
    }

    @Override // xsna.nx2
    public final C1113b f(l7r0 l7r0Var) {
        tfx tfxVar;
        tfx tfxVar2;
        vg20 vg20Var;
        String jSONObject;
        String str;
        UserId userId;
        UserId userId2;
        xy2 l;
        boolean z = this.g;
        vg20 vg20Var2 = new vg20();
        MsgFromUser msgFromUser = this.b;
        if (!msgFromUser.H6()) {
            a g = g();
            Integer num = g.a;
            Boolean bool = g.b;
            Boolean bool2 = g.c;
            UserId userId3 = g.e;
            String str2 = g.f;
            String str3 = g.g;
            Float f = g.h;
            Float f2 = g.i;
            String str4 = g.j;
            String str5 = g.m;
            UserId userId4 = g.s;
            tfx tfxVar3 = new tfx("messages.edit", new qq(17), new rq(18));
            tfx.n(tfxVar3, "peer_id", userId3, 0L, 0L, 12);
            if (str2 != null) {
                tfx.o(tfxVar3, "message", str2, 0, ConnectionResult.NETWORK_ERROR, 4);
            }
            if (str3 != null) {
                tfxVar = tfxVar3;
                tfx.o(tfxVar, "format_data", str3, 0, ConnectionResult.NETWORK_ERROR, 4);
            } else {
                tfxVar = tfxVar3;
            }
            if (f != null) {
                tfxVar.h(O6.s, f.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            }
            if (f2 != null) {
                tfxVar.h("long", f2.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            }
            if (str4 != null) {
                tfx.o(tfxVar, SharedKt.PARAM_ATTACHMENT, str4, 0, 0, 12);
            }
            if (bool != null) {
                tfxVar.j("keep_forward_messages", bool.booleanValue());
            }
            if (bool2 != null) {
                tfxVar.j("keep_snippets", bool2.booleanValue());
            }
            if (userId4 != null) {
                tfxVar2 = tfxVar;
                tfx.n(tfxVar2, "group_id", userId4, 0L, 0L, 8);
            } else {
                tfxVar2 = tfxVar;
            }
            if (str5 != null) {
                tfx.o(tfxVar2, "payload", str5, 0, 1000, 4);
            }
            if (num != null) {
                tfx.l(tfxVar2, "cmid", num.intValue(), 0, 0, 8);
            }
            if (((BaseBoolIntDto) bz2.l(tfxVar2, z)) != BaseBoolIntDto.YES) {
                com.vk.metrics.eventtracking.b.a.a(new VKApiException("messages.edit response is not success"));
            }
            return new C1113b(msgFromUser.d);
        }
        if (d6q0.t == NetworkState.UNSTABLE) {
            throw new ImMsgSendDisabledByUnstableConnection();
        }
        a g2 = g();
        String str6 = g2.p;
        String str7 = g2.v;
        Boolean bool3 = g2.u;
        Integer num2 = g2.t;
        UserId userId5 = g2.e;
        Integer num3 = g2.d;
        String str8 = g2.f;
        String str9 = g2.g;
        String str10 = g2.o;
        String str11 = g2.n;
        Float f3 = g2.h;
        Float f4 = g2.i;
        Integer num4 = g2.k;
        String str12 = g2.l;
        String str13 = g2.j;
        String str14 = g2.m;
        String str15 = null;
        if (msgFromUser.db() || msgFromUser.p3()) {
            vg20Var = vg20Var2;
            jSONObject = d370.C(new com.vk.im.engine.internal.api_commands.messages.a(this, 0)).toString();
        } else {
            vg20Var = vg20Var2;
            jSONObject = null;
        }
        String str16 = g2.q;
        String str17 = g2.r;
        UserId userId6 = g2.s;
        Integer num5 = msgFromUser.R;
        if (num5 != null) {
            int intValue = num5.intValue();
            str = jSONObject;
            StringBuilder sb = new StringBuilder(X3.j.d);
            w9y w9yVar = new w9y();
            w9yVar.d(Long.valueOf(msgFromUser.c), "peer_id");
            w9yVar.c(Integer.valueOf(intValue), "cmid");
            s3q0 s3q0Var = s3q0.a;
            sb.append(w9yVar.a);
            sb.append(']');
            str15 = sb.toString();
            userId2 = userId5;
            userId = userId6;
        } else {
            str = jSONObject;
            userId = userId6;
            userId2 = userId5;
        }
        l = vg20Var.l(num3, userId2, (r50 & 64) != 0 ? null : str8, (r50 & 128) != 0 ? null : str9, (r50 & 2048) != 0 ? null : f3, (r50 & 4096) != 0 ? null : f4, (r50 & 8192) != 0 ? null : str13, (r50 & 16384) != 0 ? null : str, (32768 & r50) != 0 ? null : num4, (65536 & r50) != 0 ? null : str12, (262144 & r50) != 0 ? null : userId, (1048576 & r50) != 0 ? null : null, (2097152 & r50) != 0 ? null : str14, (16777216 & r50) != 0 ? null : str11, (33554432 & r50) != 0 ? null : str10, (67108864 & r50) != 0 ? null : str6, (134217728 & r50) != 0 ? null : str16, (r50 & 268435456) != 0 ? null : str17, (r51 & 2) != 0 ? null : num2, (r51 & 4) != 0 ? null : bool3, (r51 & 8) != 0 ? null : str7, (r51 & 1024) != 0 ? null : str15);
        MessagesSendResponseDto messagesSendResponseDto = (MessagesSendResponseDto) bz2.l(l, z);
        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
        jt50.a(SingleEvent.MESSAGE_SENT_EVENT);
        return new C1113b(messagesSendResponseDto.d());
    }

    public final a g() {
        String jSONObject;
        String str;
        MsgFromUser msgFromUser = this.b;
        if (msgFromUser.p3() && msgFromUser.db()) {
            throw new IllegalArgumentException("msg cannot have both fwd and reply in single message");
        }
        StringBuilder sb = new StringBuilder();
        AttachMap attachMap = null;
        AttachSticker attachSticker = null;
        for (Attach attach : msgFromUser.H) {
            if (attach instanceof AttachMap) {
                attachMap = (AttachMap) attach;
            } else if (attach instanceof AttachSticker) {
                attachSticker = (AttachSticker) attach;
            } else {
                String k = xa4.k(attach);
                if (k != null) {
                    sb.append(k);
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        int i = msgFromUser.d;
        boolean z = msgFromUser.x;
        Long l = msgFromUser.v;
        Integer valueOf = l != null ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(l.longValue())) : null;
        UserId userId = new UserId(msgFromUser.c);
        int i2 = msgFromUser.f;
        String str2 = msgFromUser.F;
        String str3 = str2.length() > 0 ? str2 : null;
        MsgTextFormat msgTextFormat = msgFromUser.G;
        if (msgTextFormat.c.isEmpty()) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", String.valueOf(msgTextFormat.b));
            jSONObject2.put("items", kvf.a(msgTextFormat.c));
            jSONObject = jSONObject2.toString();
        }
        String str4 = msgFromUser.O;
        String str5 = str4.length() > 0 ? str4 : null;
        String str6 = msgFromUser.P;
        String str7 = str6.length() > 0 ? str6 : null;
        Float valueOf2 = attachMap != null ? Float.valueOf((float) attachMap.e) : null;
        Float valueOf3 = attachMap != null ? Float.valueOf((float) attachMap.f) : null;
        Integer valueOf4 = attachSticker != null ? Integer.valueOf((int) attachSticker.e) : null;
        String str8 = (attachSticker == null || (str = attachSticker.h) == null || str.length() <= 0) ? null : str;
        String str9 = msgFromUser.N;
        String str10 = str9.length() > 0 ? str9 : null;
        MsgSendSource msgSendSource = this.h;
        boolean z2 = msgSendSource instanceof MsgSendSource.d;
        MsgSendSource.d dVar = z2 ? (MsgSendSource.d) msgSendSource : null;
        String str11 = dVar != null ? dVar.a : null;
        MsgSendSource.d dVar2 = z2 ? (MsgSendSource.d) msgSendSource : null;
        String str12 = dVar2 != null ? dVar2.b : null;
        Peer peer = this.i;
        return new a(Integer.valueOf(i), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(i2), userId, str3, jSONObject, valueOf2, valueOf3, sb2, valueOf4, str8, str10, str7, str5, this.e, str11, str12, peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null, valueOf, Boolean.valueOf(z), this.f, 3072);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        MsgSendSource msgSendSource = this.h;
        return Long.hashCode(this.i.b) + ((b + (msgSendSource == null ? 0 : msgSendSource.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesSendApiCmd(msgFromUser=");
        sb.append(this.b);
        sb.append(", keepFwds=");
        sb.append(this.c);
        sb.append(", keepSnippets=");
        sb.append(this.d);
        sb.append(", entryPoint=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", isAwaitNetwork=");
        sb.append(this.g);
        sb.append(", msgSendSource=");
        sb.append(this.h);
        sb.append(", groupId=");
        return eq.a(sb, this.i, ')');
    }
}

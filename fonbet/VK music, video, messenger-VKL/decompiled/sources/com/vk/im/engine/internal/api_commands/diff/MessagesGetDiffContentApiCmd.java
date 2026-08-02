package com.vk.im.engine.internal.api_commands.diff;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.Gson;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bh30;
import xsna.c5g;
import xsna.cjl0;
import xsna.dcq;
import xsna.dux0;
import xsna.epx;
import xsna.eq;
import xsna.f1e0;
import xsna.f370;
import xsna.fo50;
import xsna.fw3;
import xsna.i1e0;
import xsna.ij20;
import xsna.j5g;
import xsna.jgp;
import xsna.k7r0;
import xsna.k9x;
import xsna.l7r0;
import xsna.ms9;
import xsna.nx2;
import xsna.p4g;
import xsna.per0;
import xsna.pmi0;
import xsna.qoy;
import xsna.qrj0;
import xsna.zcl;

/* compiled from: MessagesGetDiffContentApiCmd.kt */
/* loaded from: classes2.dex */
public final class MessagesGetDiffContentApiCmd extends nx2<dcq<b>> {
    public final ArrayList b;
    public final Peer c;

    /* compiled from: MessagesGetDiffContentApiCmd.kt */
    public static final class a {
        public final long a;
        public final List<Msg> b;
        public final List<Msg> c;
        public final List<List<Msg>> d;
        public final Map<Long, List<MsgReaction>> e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, List<? extends Msg> list, List<? extends Msg> list2, List<? extends List<? extends Msg>> list3, Map<Long, ? extends List<? extends MsgReaction>> map) {
            this.a = j;
            this.b = list;
            this.c = list2;
            this.d = list3;
            this.e = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a(fw3.a(fw3.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesDiffContentOutput(peerId=");
            sb.append(this.a);
            sb.append(", historyMessages=");
            sb.append(this.b);
            sb.append(", requestedMessages=");
            sb.append(this.c);
            sb.append(", rangeMessages=");
            sb.append(this.d);
            sb.append(", reactions=");
            return cjl0.a(sb, this.e, ')');
        }
    }

    /* compiled from: MessagesGetDiffContentApiCmd.kt */
    public static final class b implements dux0 {
        public final List<a> a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public b(List<a> list, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Response(messagesDiffContentOutputs=" + this.a + ", profiles=" + this.b + ", requestedProfiles=" + this.c + ')';
        }
    }

    /* compiled from: MessagesGetDiffContentApiCmd.kt */
    public static final class c implements k7r0<b> {
        public final List<Pair<MessagesDiffContentInput, MessageSource>> b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONArray jSONArray;
            EmptyList emptyList;
            ?? r4;
            int i;
            int i2;
            int i3;
            EmptyList emptyList2;
            Map map;
            Long valueOf;
            JSONArray jSONArray2;
            JSONArray jSONArray3;
            int i4;
            int i5;
            Object obj;
            int i6;
            JSONArray jSONArray4;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            JSONArray jSONArray5 = jSONObject2.getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray5.length());
            int length = jSONArray5.length();
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                JSONObject jSONObject3 = jSONArray5.getJSONObject(i7);
                long optLong = jSONObject3.optLong("peer_id");
                JSONArray optJSONArray = jSONObject3.optJSONArray("messages");
                if (optJSONArray != null) {
                    ?? arrayList2 = new ArrayList(optJSONArray.length());
                    int length2 = optJSONArray.length();
                    int i9 = 0;
                    while (i9 < length2) {
                        Msg e = bh30.e(optJSONArray.getJSONObject(i9), new f1e0());
                        List<Pair<MessagesDiffContentInput, MessageSource>> list = this.b;
                        JSONArray jSONArray6 = jSONArray5;
                        e.A = i8 < list.size() ? list.get(i8).j() : MessageSource.UNDEFINED;
                        arrayList2.add(e);
                        i9++;
                        jSONArray5 = jSONArray6;
                    }
                    jSONArray = jSONArray5;
                    emptyList = arrayList2;
                } else {
                    jSONArray = jSONArray5;
                    emptyList = EmptyList.b;
                }
                EmptyList emptyList3 = emptyList;
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("requested_messages");
                if (optJSONArray2 != null) {
                    r4 = new ArrayList(optJSONArray2.length());
                    int length3 = optJSONArray2.length();
                    for (int i10 = 0; i10 < length3; i10++) {
                        r4.add(bh30.e(optJSONArray2.getJSONObject(i10), new f1e0()));
                    }
                } else {
                    r4 = EmptyList.b;
                }
                List list2 = r4;
                JSONArray optJSONArray3 = jSONObject3.optJSONArray("range_messages");
                if (optJSONArray3 != null) {
                    ?? arrayList3 = new ArrayList(optJSONArray3.length());
                    int length4 = optJSONArray3.length();
                    int i11 = 0;
                    while (i11 < length4) {
                        JSONArray jSONArray7 = optJSONArray3.getJSONArray(i11);
                        JSONArray jSONArray8 = optJSONArray3;
                        f1e0 f1e0Var = new f1e0();
                        int i12 = length;
                        ArrayList arrayList4 = new ArrayList();
                        int i13 = i7;
                        int i14 = i8;
                        int i15 = 0;
                        for (int length5 = jSONArray7.length(); i15 < length5; length5 = length5) {
                            arrayList4.add(bh30.e(jSONArray7.getJSONObject(i15), f1e0Var));
                            i15++;
                        }
                        arrayList3.add(arrayList4);
                        i11++;
                        optJSONArray3 = jSONArray8;
                        length = i12;
                        i7 = i13;
                        i8 = i14;
                    }
                    i = length;
                    i2 = i7;
                    i3 = i8;
                    emptyList2 = arrayList3;
                } else {
                    i = length;
                    i2 = i7;
                    i3 = i8;
                    emptyList2 = EmptyList.b;
                }
                EmptyList emptyList4 = emptyList2;
                JSONArray optJSONArray4 = jSONObject3.optJSONArray("reactions");
                if (optJSONArray4 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length6 = optJSONArray4.length();
                    int i16 = 0;
                    while (i16 < length6) {
                        Object obj2 = optJSONArray4.get(i16);
                        JSONObject jSONObject4 = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                        if (jSONObject4 != null) {
                            try {
                                valueOf = Long.valueOf(jSONObject4.getLong("cmid"));
                                jSONArray2 = jSONObject4.getJSONArray("counters");
                            } catch (Throwable unused) {
                            }
                            if (jSONArray2 != null) {
                                ArrayList arrayList5 = new ArrayList(jSONArray2.length());
                                int length7 = jSONArray2.length();
                                jSONArray3 = optJSONArray4;
                                int i17 = 0;
                                while (i17 < length7) {
                                    i4 = length6;
                                    try {
                                        JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
                                        if (optJSONObject != null) {
                                            i6 = i17;
                                            i5 = i16;
                                            try {
                                                jSONArray4 = jSONArray2;
                                                arrayList5.add(new MsgReactionImpl(optJSONObject.getInt("reaction_id"), f370.L(optJSONObject.getJSONArray("user_ids")), optJSONObject.getInt("count")));
                                            } catch (Throwable unused2) {
                                            }
                                        } else {
                                            i6 = i17;
                                            i5 = i16;
                                            jSONArray4 = jSONArray2;
                                        }
                                        i17 = i6 + 1;
                                        length6 = i4;
                                        i16 = i5;
                                        jSONArray2 = jSONArray4;
                                    } catch (Throwable unused3) {
                                    }
                                }
                                i4 = length6;
                                i5 = i16;
                                obj = j5g.O0(arrayList5);
                                if (obj == null) {
                                }
                                Pair pair = new Pair(valueOf, obj);
                                linkedHashMap.put(pair.d(), pair.g());
                                i16 = i5 + 1;
                                optJSONArray4 = jSONArray3;
                                length6 = i4;
                            } else {
                                jSONArray3 = optJSONArray4;
                                i4 = length6;
                                i5 = i16;
                            }
                            obj = EmptyList.b;
                            Pair pair2 = new Pair(valueOf, obj);
                            linkedHashMap.put(pair2.d(), pair2.g());
                            i16 = i5 + 1;
                            optJSONArray4 = jSONArray3;
                            length6 = i4;
                        }
                        jSONArray3 = optJSONArray4;
                        i4 = length6;
                        i5 = i16;
                        i16 = i5 + 1;
                        optJSONArray4 = jSONArray3;
                        length6 = i4;
                    }
                    p4g.a aVar = p4g.a;
                    map = Collections.unmodifiableMap(linkedHashMap);
                } else {
                    map = jgp.b;
                }
                i8 = i3 + 1;
                arrayList.add(new a(optLong, emptyList3, list2, emptyList4, map));
                i7 = i2 + 1;
                jSONArray5 = jSONArray;
                length = i;
            }
            return new b(arrayList, b, new f1e0());
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public MessagesGetDiffContentApiCmd(ArrayList arrayList, Peer peer) {
        this.b = arrayList;
        this.c = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetDiffContentApiCmd)) {
            return false;
        }
        MessagesGetDiffContentApiCmd messagesGetDiffContentApiCmd = (MessagesGetDiffContentApiCmd) obj;
        return epx.f(this.b, messagesGetDiffContentApiCmd.b) && epx.f(this.c, messagesGetDiffContentApiCmd.c);
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        Gson gson = new Gson();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((MessagesDiffContentInput) ((Pair) it.next()).i());
        }
        String json = gson.toJson(arrayList2);
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getDiffContent";
        aVar.b("conversation_messages", json);
        Integer num = 2;
        aVar.f.put("nested_limit", num.toString());
        Peer peer = this.c;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar.i = false;
        aVar.g = 0;
        return fo50.M((dux0) l7r0Var.d(new ij20(aVar), new c(arrayList)), false, false, new com.vk.im.engine.internal.api_commands.diff.a(2, this, MessagesGetDiffContentApiCmd.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/diff/MessagesGetDiffContentApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/diff/MessagesGetDiffContentApiCmd$Response;", 0), Source.CACHE);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + qoy.b(this.b.hashCode() * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetDiffContentApiCmd(conversationMessageInputs=");
        sb.append(this.b);
        sb.append(", awaitNetwork=false, groupId=");
        return eq.a(sb, this.c, ')');
    }

    /* compiled from: MessagesGetDiffContentApiCmd.kt */
    public static final class Range {

        @pmi0(InneractiveMediationNameConsts.MAX)
        private final int max;

        @pmi0(UcumUtils.UCUM_MINUTES)
        private final int min;

        public Range(k9x k9xVar) {
            this(k9xVar.b, k9xVar.c);
        }

        public final int a() {
            return this.max;
        }

        public final int b() {
            return this.min;
        }

        public Range(int i, int i2) {
            this.min = i;
            this.max = i2;
        }
    }

    /* compiled from: MessagesGetDiffContentApiCmd.kt */
    public static final class MessagesDiffContentInput {

        @pmi0("cmid_mark")
        private final Integer cmidMark;

        @pmi0("cmids_ranges")
        private final List<Range> cmidsRanges;

        @pmi0("cmids_updated_reactions")
        private final List<Integer> cmidsUpdatedReactions;

        @pmi0(SignalingProtocol.KEY_LIMIT)
        private final Integer limit;

        @pmi0(SignalingProtocol.KEY_OFFSET)
        private final Integer offset;

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("updated_cmids")
        private final List<Integer> updatedCmids;

        public MessagesDiffContentInput(long j, Integer num, Integer num2, Integer num3, List<Range> list, List<Integer> list2, List<Integer> list3) {
            this.peerId = j;
            this.cmidMark = num;
            this.offset = num2;
            this.limit = num3;
            this.cmidsRanges = list;
            this.updatedCmids = list2;
            this.cmidsUpdatedReactions = list3;
        }

        public final int a() {
            Integer num = this.cmidMark;
            Integer num2 = this.offset;
            Integer num3 = this.limit;
            Integer valueOf = (num == null || num2 == null || num3 == null) ? null : Integer.valueOf(num3.intValue());
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            List<Range> list = this.cmidsRanges;
            if (list != null) {
                for (Range range : list) {
                    intValue += range.a() - range.b();
                }
            }
            List<Integer> list2 = this.updatedCmids;
            int size = intValue + (list2 != null ? list2.size() : 0);
            List<Integer> list3 = this.cmidsUpdatedReactions;
            return size + (list3 != null ? list3.size() : 0);
        }

        public final Integer b() {
            return this.cmidMark;
        }

        public final long c() {
            return this.peerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesDiffContentInput)) {
                return false;
            }
            MessagesDiffContentInput messagesDiffContentInput = (MessagesDiffContentInput) obj;
            return this.peerId == messagesDiffContentInput.peerId && epx.f(this.cmidMark, messagesDiffContentInput.cmidMark) && epx.f(this.offset, messagesDiffContentInput.offset) && epx.f(this.limit, messagesDiffContentInput.limit) && epx.f(this.cmidsRanges, messagesDiffContentInput.cmidsRanges) && epx.f(this.updatedCmids, messagesDiffContentInput.updatedCmids) && epx.f(this.cmidsUpdatedReactions, messagesDiffContentInput.cmidsUpdatedReactions);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.peerId) * 31;
            Integer num = this.cmidMark;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.offset;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.limit;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<Range> list = this.cmidsRanges;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            List<Integer> list2 = this.updatedCmids;
            int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<Integer> list3 = this.cmidsUpdatedReactions;
            return hashCode6 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesDiffContentInput(peerId=");
            sb.append(this.peerId);
            sb.append(", cmidMark=");
            sb.append(this.cmidMark);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(", limit=");
            sb.append(this.limit);
            sb.append(", cmidsRanges=");
            sb.append(this.cmidsRanges);
            sb.append(", updatedCmids=");
            sb.append(this.updatedCmids);
            sb.append(", cmidsUpdatedReactions=");
            return ms9.a(')', sb, this.cmidsUpdatedReactions);
        }

        public /* synthetic */ MessagesDiffContentInput(long j, Integer num, Integer num2, Integer num3, List list, List list2, List list3, int i, zcl zclVar) {
            this(j, num, num2, num3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3);
        }
    }
}

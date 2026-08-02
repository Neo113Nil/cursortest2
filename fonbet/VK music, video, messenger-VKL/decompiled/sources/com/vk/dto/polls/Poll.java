package com.vk.dto.polls;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.PollBackground;
import com.vk.stickers.api.styles.StickerCommonStyle;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.dz5;
import xsna.epx;
import xsna.j5g;
import xsna.jgp;
import xsna.qni0;
import xsna.rl3;
import xsna.s3q0;

/* compiled from: Poll.kt */
/* loaded from: classes18.dex */
public final class Poll extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Poll> CREATOR = new b();
    public final int b;
    public final UserId c;
    public final String d;
    public final List<Long> e;
    public final List<PollOption> f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final UserId r;
    public final PollBackground s;
    public final long t;
    public final List<UserId> u;
    public Map<UserId, Owner> v;
    public final Owner w;
    public final transient LinkedHashSet x;
    public transient Object y;
    public int z;

    /* compiled from: Poll.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v26, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v7 */
        public static Poll a(JSONObject jSONObject, HashMap hashMap) {
            HashMap hashMap2;
            ?? r5;
            List list;
            ?? r11;
            String str;
            JSONArray jSONArray;
            if (hashMap != null) {
                hashMap2 = hashMap;
            } else {
                hashMap2 = new HashMap();
                JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Serializer.c<Owner> cVar = Owner.CREATOR;
                            Owner f = Owner.a.f(optJSONObject);
                            hashMap2.put(f.b, f);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            Serializer.c<Owner> cVar2 = Owner.CREATOR;
                            Owner d = Owner.a.d(optJSONObject2);
                            hashMap2.put(d.b, d);
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("friends");
            String str2 = "id";
            if (optJSONArray3 != null) {
                r5 = new ArrayList(optJSONArray3.length());
                int length3 = optJSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                    if (optJSONObject3 != null) {
                        r5.add(new UserId(optJSONObject3.getLong("id")));
                    }
                }
            } else {
                r5 = EmptyList.b;
            }
            List<UserId> list2 = r5;
            UserId userId = new UserId(jSONObject.has("author_id") ? jSONObject.getLong("author_id") : 0L);
            int i4 = jSONObject.getInt("id");
            UserId userId2 = new UserId(jSONObject.getLong("owner_id"));
            String string = jSONObject.getString("question");
            JSONArray optJSONArray4 = jSONObject.optJSONArray("answer_ids");
            if (optJSONArray4 == null || (list = dz5.F(optJSONArray4)) == null) {
                list = EmptyList.b;
            }
            List list3 = list;
            JSONArray jSONArray2 = jSONObject.getJSONArray("answers");
            if (jSONArray2 != null) {
                r11 = new ArrayList(jSONArray2.length());
                int length4 = jSONArray2.length();
                int i5 = 0;
                while (i5 < length4) {
                    JSONObject optJSONObject4 = jSONArray2.optJSONObject(i5);
                    if (optJSONObject4 != null) {
                        str = str2;
                        jSONArray = jSONArray2;
                        r11.add(new PollOption(optJSONObject4.getLong(str2), optJSONObject4.getString("text"), optJSONObject4.getInt("votes"), (float) optJSONObject4.getDouble("rate")));
                    } else {
                        str = str2;
                        jSONArray = jSONArray2;
                    }
                    i5++;
                    str2 = str;
                    jSONArray2 = jSONArray;
                }
            } else {
                r11 = 0;
            }
            if (r11 == 0) {
                r11 = EmptyList.b;
            }
            boolean z = jSONObject.getBoolean("multiple");
            int i6 = jSONObject.getInt("votes");
            boolean optBoolean = jSONObject.optBoolean("anonymous", false);
            boolean z2 = jSONObject.getBoolean("is_board");
            long j = jSONObject.getLong("end_date");
            boolean z3 = jSONObject.getBoolean("closed");
            boolean z4 = jSONObject.getBoolean("can_edit");
            boolean z5 = jSONObject.getBoolean("can_vote");
            boolean z6 = jSONObject.getBoolean("disable_unvote");
            boolean z7 = jSONObject.getBoolean("can_report");
            boolean z8 = jSONObject.getBoolean("can_share");
            PollBackground a = PollBackground.a.a(jSONObject);
            long j2 = jSONObject.getLong("created");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (UserId userId3 : list2) {
                Owner owner = (Owner) hashMap2.get(userId3);
                if (owner != null) {
                    linkedHashMap.put(userId3, owner);
                }
            }
            return new Poll(i4, userId2, string, list3, r11, z, i6, optBoolean, z2, j, z3, z4, z5, z6, z7, z8, userId, a, j2, list2, linkedHashMap, (Owner) hashMap2.get(userId));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
        public static Poll b(JSONObject jSONObject) {
            List list;
            int i;
            EmptyList emptyList;
            boolean z;
            long j;
            UserId userId;
            String str;
            ?? r3;
            List list2;
            List list3;
            UserId userId2;
            Map map;
            Owner owner;
            int i2;
            JSONArray jSONArray;
            int i3;
            int i4 = jSONObject.getInt("id");
            UserId userId3 = new UserId(jSONObject.getLong("owner_id"));
            String string = jSONObject.getString("question");
            JSONArray optJSONArray = jSONObject.optJSONArray("answer_ids");
            if (optJSONArray == null || (list = dz5.F(optJSONArray)) == null) {
                list = EmptyList.b;
            }
            List list4 = list;
            JSONArray jSONArray2 = jSONObject.getJSONArray("answers");
            if (jSONArray2 != null) {
                ?? arrayList = new ArrayList(jSONArray2.length());
                int length = jSONArray2.length();
                int i5 = 0;
                while (i5 < length) {
                    JSONObject optJSONObject = jSONArray2.optJSONObject(i5);
                    if (optJSONObject != null) {
                        jSONArray = jSONArray2;
                        i3 = i4;
                        arrayList.add(new PollOption(optJSONObject.getLong("id"), optJSONObject.getString("text"), optJSONObject.getInt("votes"), (float) optJSONObject.getDouble("rate")));
                    } else {
                        jSONArray = jSONArray2;
                        i3 = i4;
                    }
                    i5++;
                    i4 = i3;
                    jSONArray2 = jSONArray;
                }
                i = i4;
                emptyList = arrayList;
            } else {
                i = i4;
                emptyList = EmptyList.b;
            }
            boolean z2 = jSONObject.getBoolean("multiple");
            int i6 = jSONObject.has("votes") ? jSONObject.getInt("votes") : 0;
            boolean optBoolean = jSONObject.optBoolean("anonymous", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_board", false);
            long j2 = jSONObject.has("end_date") ? jSONObject.getLong("end_date") : 0L;
            boolean optBoolean3 = jSONObject.optBoolean("closed", false);
            boolean z3 = jSONObject.getBoolean("can_edit");
            boolean z4 = jSONObject.getBoolean("can_vote");
            boolean optBoolean4 = jSONObject.optBoolean("disable_unvote");
            int i7 = i6;
            boolean optBoolean5 = jSONObject.optBoolean("can_report", false);
            boolean optBoolean6 = jSONObject.optBoolean("can_share", false);
            if (jSONObject.has("author_id")) {
                z = optBoolean3;
                j = jSONObject.getLong("author_id");
            } else {
                z = optBoolean3;
                j = 0;
            }
            UserId userId4 = new UserId(j);
            PollBackground a = PollBackground.a.a(jSONObject);
            long j3 = jSONObject.has("created") ? jSONObject.getLong("created") : 0L;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("friends");
            if (optJSONArray2 != null) {
                userId = userId3;
                r3 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                str = string;
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = length2;
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i8);
                    JSONArray jSONArray3 = optJSONArray2;
                    if (optJSONObject2 != null) {
                        i2 = i8;
                        r3.add(new UserId(optJSONObject2.getLong("id")));
                    } else {
                        i2 = i8;
                    }
                    i8 = i2 + 1;
                    length2 = i9;
                    optJSONArray2 = jSONArray3;
                }
            } else {
                userId = userId3;
                str = string;
                r3 = EmptyList.b;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("profiles");
            if (optJSONObject3 != null) {
                map = new LinkedHashMap();
                Iterator<String> keys = optJSONObject3.keys();
                List list5 = r3;
                while (keys.hasNext()) {
                    String next = keys.next();
                    List list6 = list5;
                    List list7 = list4;
                    UserId userId5 = new UserId(Long.parseLong(next));
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    map.put(userId5, Owner.a.e(optJSONObject3.getJSONObject(next)));
                    list5 = list6;
                    list4 = list7;
                    userId4 = userId4;
                }
                list2 = list5;
                list3 = list4;
                userId2 = userId4;
            } else {
                list2 = r3;
                list3 = list4;
                userId2 = userId4;
                map = jgp.b;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("author");
            if (optJSONObject4 != null) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                owner = Owner.a.e(optJSONObject4);
            } else {
                owner = null;
            }
            return new Poll(i, userId, str, list3, emptyList, z2, i7, optBoolean, optBoolean2, j2, z, z3, z4, optBoolean4, optBoolean5, optBoolean6, userId2, a, j3, list2, map, owner);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Poll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Poll a(Serializer serializer) {
            return new Poll(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Poll[i];
        }
    }

    static {
        StickerCommonStyle.a aVar = StickerCommonStyle.Companion;
    }

    public Poll(int i, UserId userId, String str, List<Long> list, List<PollOption> list2, boolean z, int i2, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, UserId userId2, PollBackground pollBackground, long j2, List<UserId> list3, Map<UserId, Owner> map, Owner owner) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = z3;
        this.k = j;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.r = userId2;
        this.s = pollBackground;
        this.t = j2;
        this.u = list3;
        this.v = map;
        this.w = owner;
        this.x = new LinkedHashSet();
        this.y = EmptyList.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Poll zb(Poll poll, String str, ArrayList arrayList, ArrayList arrayList2, int i, long j, boolean z, PollBackground pollBackground, LinkedHashMap linkedHashMap, Owner owner, int i2) {
        UserId userId;
        PollBackground pollBackground2;
        int i3 = poll.b;
        UserId userId2 = poll.c;
        String str2 = (i2 & 4) != 0 ? poll.d : str;
        List<Long> list = (i2 & 8) != 0 ? poll.e : arrayList;
        List<PollOption> list2 = (i2 & 16) != 0 ? poll.f : arrayList2;
        boolean z2 = poll.g;
        int i4 = (i2 & 64) != 0 ? poll.h : i;
        boolean z3 = poll.i;
        String str3 = str2;
        List<Long> list3 = list;
        List<PollOption> list4 = list2;
        int i5 = i4;
        boolean z4 = poll.j;
        long j2 = (i2 & 512) != 0 ? poll.k : j;
        boolean z5 = poll.l;
        long j3 = j2;
        boolean z6 = poll.m;
        boolean z7 = (i2 & 4096) != 0 ? poll.n : z;
        boolean z8 = poll.o;
        boolean z9 = poll.p;
        boolean z10 = poll.q;
        UserId userId3 = poll.r;
        if ((i2 & 131072) != 0) {
            userId = userId3;
            pollBackground2 = poll.s;
        } else {
            userId = userId3;
            pollBackground2 = pollBackground;
        }
        long j4 = poll.t;
        List<UserId> list5 = poll.u;
        Map map = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? poll.v : linkedHashMap;
        Owner owner2 = (i2 & 2097152) != 0 ? poll.w : owner;
        poll.getClass();
        return new Poll(i3, userId2, str3, list3, list4, z2, i5, z3, z4, j3, z5, z6, z7, z8, z9, z10, userId, pollBackground2, j4, list5, map, owner2);
    }

    public final boolean Ab() {
        return Kb() && !isClosed() && this.n && !this.o;
    }

    public final boolean Bb() {
        return (Kb() || isClosed() || !this.n) ? false : true;
    }

    public final List<UserId> Cb() {
        return this.u;
    }

    public final ArrayList Db() {
        ArrayList arrayList = new ArrayList();
        for (UserId userId : this.u) {
            if (arrayList.size() >= 3) {
                break;
            }
            Owner owner = this.v.get(userId);
            if (owner != null) {
                arrayList.add(owner);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final List Eb() {
        String str;
        int i = this.z;
        if (i != 0 && i == 3) {
            return this.y;
        }
        ArrayList arrayList = new ArrayList(3);
        for (UserId userId : this.u) {
            if (arrayList.size() >= 3) {
                break;
            }
            Owner owner = this.v.get(userId);
            if (owner != null && (str = owner.e) != null && str.length() != 0) {
                arrayList.add(str);
            }
        }
        this.y = arrayList;
        this.z = 3;
        return arrayList;
    }

    public final boolean Fb() {
        return this.s != null;
    }

    public final float Gb() {
        Iterator<PollOption> it = this.f.iterator();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            float f2 = it.next().e;
            if (f < f2) {
                f = f2;
            }
        }
        return f;
    }

    public final Map<UserId, Owner> Hb() {
        return this.v;
    }

    public final boolean Ib() {
        return this.g && this.f.size() > 1;
    }

    public final boolean Jb() {
        Iterator<PollOption> it = this.f.iterator();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        while (it.hasNext()) {
            float f2 = it.next().e;
            if (f < f2) {
                i = 0;
                f = f2;
            }
            if (f == f2) {
                i++;
            }
        }
        return i == 1;
    }

    public final boolean Kb() {
        return !this.e.isEmpty();
    }

    public final void Lb(LinkedHashMap linkedHashMap) {
        this.v = linkedHashMap;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.Z(j5g.P0(this.e));
        serializer.W(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.S(this.h);
        serializer.J(Boolean.valueOf(this.i));
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.Y(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.e0(this.r);
        serializer.i0(this.s);
        serializer.Y(this.t);
        serializer.f0(this.u);
        Map<UserId, Owner> map = this.v;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.e0((UserId) entry.getKey());
                serializer.i0((Owner) entry.getValue());
            }
        }
        serializer.i0(this.w);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("id", this.b).put("owner_id", this.c.b).put("question", this.d);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).longValue());
        }
        s3q0 s3q0Var = s3q0.a;
        JSONObject put2 = put.put("answer_ids", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = this.f.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((PollOption) it2.next()).e5());
        }
        s3q0 s3q0Var2 = s3q0.a;
        JSONObject put3 = put2.put("answers", jSONArray2).put("multiple", this.g).put("votes", this.h).put("anonymous", this.i).put("is_board", this.j).put("end_date", this.k).put("closed", this.l).put("can_edit", this.m).put("can_vote", this.n).put("disable_unvote", this.o).put("can_report", this.p).put("can_share", this.q).put("author_id", this.r.b).put("created", this.t);
        JSONArray jSONArray3 = new JSONArray();
        Iterator<T> it3 = this.u.iterator();
        while (it3.hasNext()) {
            jSONArray3.put((UserId) it3.next());
        }
        s3q0 s3q0Var3 = s3q0.a;
        JSONObject put4 = put3.put("friends", jSONArray3);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<T> it4 = this.v.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            jSONObject2.put(String.valueOf(((UserId) entry.getKey()).b), ((Owner) entry.getValue()).e5());
        }
        s3q0 s3q0Var4 = s3q0.a;
        JSONObject put5 = put4.put("profiles", jSONObject2);
        Owner owner = this.w;
        put5.put("author", owner != null ? owner.e5() : null);
        PollBackground pollBackground = this.s;
        if (pollBackground != null) {
            if (pollBackground instanceof PhotoPoll) {
                jSONObject.put("photo", ((PhotoPoll) pollBackground).e5());
                return jSONObject;
            }
            String str = pollBackground instanceof PollGradient ? "gradient" : pollBackground instanceof PollTile ? "tile" : pollBackground instanceof PollContentColor ? "color" : "";
            if (!TextUtils.isEmpty(str)) {
                JSONObject e5 = pollBackground.e5();
                e5.put("type", str);
                jSONObject.put(L2.g, e5);
            }
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Poll)) {
            return false;
        }
        Poll poll = (Poll) obj;
        return this.b == poll.b && epx.f(this.c, poll.c) && epx.f(this.d, poll.d) && epx.f(this.e, poll.e) && epx.f(this.f, poll.f) && this.g == poll.g && this.h == poll.h && this.i == poll.i && this.j == poll.j && this.k == poll.k && this.l == poll.l && this.m == poll.m && this.n == poll.n && this.o == poll.o && this.p == poll.p && this.q == poll.q && epx.f(this.r, poll.r) && epx.f(this.s, poll.s) && this.t == poll.t && epx.f(this.u, poll.u) && epx.f(this.v, poll.v) && epx.f(this.w, poll.w);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public final boolean isClosed() {
        return this.l || isExpired();
    }

    public final boolean isExpired() {
        long j = this.k;
        return j != 0 && qni0.a() / ((long) 1000) > j;
    }

    public final boolean t0() {
        return this.m && !isExpired();
    }

    public final String toString() {
        return "Poll(id=" + this.b + ", ownerId=" + this.c + ", question=" + this.d + ", userAnswers=" + this.e + ", answerOptions=" + this.f + ", serverMultiple=" + this.g + ", votes=" + this.h + ", isAnonymous=" + this.i + ", isBoard=" + this.j + ", endDate=" + this.k + ", serverIsClosed=" + this.l + ", serverCanEdit=" + this.m + ", serverCanVote=" + this.n + ", serverDisableUnvote=" + this.o + ", serverCanReport=" + this.p + ", serverCanShare=" + this.q + ", authorId=" + this.r + ", background=" + this.s + ", createdTimestamp=" + this.t + ", friendIds=" + this.u + ", profiles=" + this.v + ", author=" + this.w + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Poll(Serializer serializer) {
        this(r27, r28, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r1, r1, r21, r1, r24, (Owner) serializer.G(Owner.class.getClassLoader()));
        boolean z;
        int i;
        int i2;
        UserId userId;
        Map map;
        int u = serializer.u();
        UserId userId2 = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        List<Long> t0 = rl3.t0(serializer.e());
        ArrayList k = serializer.k(PollOption.class);
        boolean m = serializer.m();
        int u2 = serializer.u();
        Boolean n = serializer.n();
        if (n != null) {
            z = n.booleanValue();
            i = 0;
        } else {
            z = false;
            i = 0;
        }
        boolean m2 = serializer.m();
        int i3 = i;
        long w = serializer.w();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        boolean m7 = serializer.m();
        boolean m8 = serializer.m();
        UserId userId3 = (UserId) serializer.A(UserId.class.getClassLoader());
        PollBackground pollBackground = (PollBackground) serializer.G(PollBackground.class.getClassLoader());
        long w2 = serializer.w();
        ArrayList B = serializer.B(UserId.class.getClassLoader());
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u3 = serializer.u();
            if (u3 >= 0) {
                i2 = u;
                map = new LinkedHashMap();
                userId = userId2;
                int i4 = i3;
                while (i4 < u3) {
                    int i5 = u3;
                    UserId userId4 = (UserId) serializer.A(UserId.class.getClassLoader());
                    int i6 = i4;
                    Serializer.StreamParcelable G = serializer.G(Owner.class.getClassLoader());
                    if (G == null) {
                        throw new IllegalArgumentException("Can't get value!");
                    }
                    Owner owner = (Owner) G;
                    if (userId4 != null) {
                        map.put(userId4, owner);
                    }
                    i4 = i6 + 1;
                    u3 = i5;
                }
            } else {
                i2 = u;
                userId = userId2;
                map = jgp.b;
            }
            Map map2 = map;
        } finally {
        }
    }
}

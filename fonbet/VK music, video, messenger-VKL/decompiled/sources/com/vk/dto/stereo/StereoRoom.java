package com.vk.dto.stereo;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stereo.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.arm0;
import xsna.asp;
import xsna.bh10;
import xsna.dz5;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: StereoRoom.kt */
/* loaded from: classes18.dex */
public final class StereoRoom extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StereoRoom> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final UserId e;
    public final Status f;
    public final Privacy g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;
    public final String m;
    public final boolean n;
    public final com.vk.dto.stereo.a o;
    public final boolean p;
    public final List<String> q;
    public final List<String> r;
    public final int s;
    public final List<Image> t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StereoRoom.kt */
    public static final class Privacy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Privacy[] $VALUES;
        public static final Privacy DONUT;
        public static final Privacy FRIENDS;
        public static final Privacy GROUP_ALL;
        public static final Privacy GROUP_BY_LINK;
        public static final Privacy GROUP_MEMBERS;

        static {
            Privacy privacy = new Privacy("GROUP_ALL", 0);
            GROUP_ALL = privacy;
            Privacy privacy2 = new Privacy("GROUP_MEMBERS", 1);
            GROUP_MEMBERS = privacy2;
            Privacy privacy3 = new Privacy(ru.ok.android.webrtc.Privacy.FRIENDS, 2);
            FRIENDS = privacy3;
            Privacy privacy4 = new Privacy("GROUP_BY_LINK", 3);
            GROUP_BY_LINK = privacy4;
            Privacy privacy5 = new Privacy("DONUT", 4);
            DONUT = privacy5;
            Privacy[] privacyArr = {privacy, privacy2, privacy3, privacy4, privacy5};
            $VALUES = privacyArr;
            $ENTRIES = new asp(privacyArr);
        }

        public Privacy() {
            throw null;
        }

        public static Privacy valueOf(String str) {
            return (Privacy) Enum.valueOf(Privacy.class, str);
        }

        public static Privacy[] values() {
            return (Privacy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StereoRoom.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ACTIVE;
        public static final Status CLOSED;
        public static final Status SCHEDULED;

        static {
            Status status = new Status("SCHEDULED", 0);
            SCHEDULED = status;
            Status status2 = new Status(SignalingProtocol.STATE_ACTIVE, 1);
            ACTIVE = status2;
            Status status3 = new Status("CLOSED", 2);
            CLOSED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: StereoRoom.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
        
            r2.add(r4);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static StereoRoom a(JSONObject jSONObject, Map map) {
            Status status;
            String optString;
            Privacy privacy;
            List H;
            Iterator it;
            boolean has;
            Owner owner;
            String optString2 = jSONObject.optString("status", SignalingProtocol.KEY_ACTIVE);
            if (optString2 != null) {
                int hashCode = optString2.hashCode();
                if (hashCode != -1422950650) {
                    if (hashCode != -1357520532) {
                        if (hashCode == -160710483 && optString2.equals("scheduled")) {
                            status = Status.SCHEDULED;
                        }
                    } else if (optString2.equals("closed")) {
                        status = Status.CLOSED;
                    }
                } else if (optString2.equals(SignalingProtocol.KEY_ACTIVE)) {
                    status = Status.ACTIVE;
                }
                Status status2 = status;
                optString = jSONObject.optString("privacy", "all");
                if (optString != null) {
                    switch (optString.hashCode()) {
                        case -600094315:
                            if (optString.equals("friends")) {
                                privacy = Privacy.FRIENDS;
                                break;
                            }
                            break;
                        case 96673:
                            if (optString.equals("all")) {
                                privacy = Privacy.GROUP_ALL;
                                break;
                            }
                            break;
                        case 95768354:
                            if (optString.equals("donut")) {
                                privacy = Privacy.DONUT;
                                break;
                            }
                            break;
                        case 336231138:
                            if (optString.equals("by_link")) {
                                privacy = Privacy.GROUP_BY_LINK;
                                break;
                            }
                            break;
                        case 948881689:
                            if (optString.equals("members")) {
                                privacy = Privacy.GROUP_MEMBERS;
                                break;
                            }
                            break;
                    }
                    Privacy privacy2 = privacy;
                    H = dz5.H(jSONObject.optJSONArray("guest_speakers"));
                    if (H == null) {
                        H = EmptyList.b;
                    }
                    List list = H;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        Long n = arm0.n((String) it.next());
                        Image image = null;
                        if (n != null && (owner = (Owner) map.get(new UserId(n.longValue()))) != null) {
                            image = owner.g;
                        }
                    }
                    has = jSONObject.has("cover");
                    com.vk.dto.stereo.a aVar = a.b.a;
                    if (has) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("cover");
                        if (jSONObject2.has("photo")) {
                            aVar = new a.c(jSONObject2.getString("photo"));
                        } else if (jSONObject2.has("solid_color")) {
                            String A = f370.A("solid_color", jSONObject2);
                            int i = -4076842;
                            if (A != null) {
                                try {
                                    i = Color.parseColor(A);
                                } catch (Exception unused) {
                                }
                            }
                            aVar = new a.C0914a(i);
                        }
                    }
                    return new StereoRoom(jSONObject.optString("room_id"), jSONObject.optString("name"), jSONObject.optString("description"), new UserId(jSONObject.optLong("owner_id")), status2, privacy2, jSONObject.optBoolean("can_edit", false), jSONObject.optBoolean("only_auth_users", false), jSONObject.optLong("time") * 1000, jSONObject.optLong("duration") * 1000, jSONObject.optLong("created_time") * 1000, jSONObject.optString(ApiProtocol.KEY_JOIN_LINK), jSONObject.optBoolean("audio_only"), aVar, jSONObject.optBoolean("has_wall_post"), list, EmptyList.b, list.size(), arrayList);
                }
                privacy = Privacy.GROUP_BY_LINK;
                Privacy privacy22 = privacy;
                H = dz5.H(jSONObject.optJSONArray("guest_speakers"));
                if (H == null) {
                }
                List list2 = H;
                ArrayList arrayList2 = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                has = jSONObject.has("cover");
                com.vk.dto.stereo.a aVar2 = a.b.a;
                if (has) {
                }
                return new StereoRoom(jSONObject.optString("room_id"), jSONObject.optString("name"), jSONObject.optString("description"), new UserId(jSONObject.optLong("owner_id")), status2, privacy22, jSONObject.optBoolean("can_edit", false), jSONObject.optBoolean("only_auth_users", false), jSONObject.optLong("time") * 1000, jSONObject.optLong("duration") * 1000, jSONObject.optLong("created_time") * 1000, jSONObject.optString(ApiProtocol.KEY_JOIN_LINK), jSONObject.optBoolean("audio_only"), aVar2, jSONObject.optBoolean("has_wall_post"), list2, EmptyList.b, list2.size(), arrayList2);
            }
            status = Status.CLOSED;
            Status status22 = status;
            optString = jSONObject.optString("privacy", "all");
            if (optString != null) {
            }
            privacy = Privacy.GROUP_BY_LINK;
            Privacy privacy222 = privacy;
            H = dz5.H(jSONObject.optJSONArray("guest_speakers"));
            if (H == null) {
            }
            List list22 = H;
            ArrayList arrayList22 = new ArrayList();
            it = list22.iterator();
            while (it.hasNext()) {
            }
            has = jSONObject.has("cover");
            com.vk.dto.stereo.a aVar22 = a.b.a;
            if (has) {
            }
            return new StereoRoom(jSONObject.optString("room_id"), jSONObject.optString("name"), jSONObject.optString("description"), new UserId(jSONObject.optLong("owner_id")), status22, privacy222, jSONObject.optBoolean("can_edit", false), jSONObject.optBoolean("only_auth_users", false), jSONObject.optLong("time") * 1000, jSONObject.optLong("duration") * 1000, jSONObject.optLong("created_time") * 1000, jSONObject.optString(ApiProtocol.KEY_JOIN_LINK), jSONObject.optBoolean("audio_only"), aVar22, jSONObject.optBoolean("has_wall_post"), list22, EmptyList.b, list22.size(), arrayList22);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StereoRoom> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StereoRoom a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            String str = H2;
            UserId userId = new UserId(serializer.w());
            Status valueOf = Status.valueOf(serializer.H());
            Privacy valueOf2 = Privacy.valueOf(serializer.H());
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            long w = serializer.w();
            long w2 = serializer.w();
            long w3 = serializer.w();
            String H4 = serializer.H();
            String str2 = H4 != null ? H4 : "";
            boolean m3 = serializer.m();
            String H5 = serializer.H();
            String str3 = H;
            int u = serializer.u();
            return new StereoRoom(str3, str, H3, userId, valueOf, valueOf2, m, m2, w, w2, w3, str2, m3, H5 != null ? new a.c(H5) : u != 0 ? new a.C0914a(u) : a.b.a, serializer.m(), com.vk.core.serialize.a.a(serializer), com.vk.core.serialize.a.a(serializer), serializer.u(), serializer.B(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StereoRoom[i];
        }
    }

    public StereoRoom(String str, String str2, String str3, UserId userId, Status status, Privacy privacy, boolean z, boolean z2, long j, long j2, long j3, String str4, boolean z3, com.vk.dto.stereo.a aVar, boolean z4, List<String> list, List<String> list2, int i, List<Image> list3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = userId;
        this.f = status;
        this.g = privacy;
        this.h = z;
        this.i = z2;
        this.j = j;
        this.k = j2;
        this.l = j3;
        this.m = str4;
        this.n = z3;
        this.o = aVar;
        this.p = z4;
        this.q = list;
        this.r = list2;
        this.s = i;
        this.t = list3;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Long n = arm0.n((String) it.next());
            if (n != null) {
                arrayList.add(n);
            }
        }
        List<String> list4 = this.r;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            Long n2 = arm0.n((String) it2.next());
            if (n2 != null) {
                arrayList2.add(n2);
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.Y(this.e.b);
        serializer.j0(this.f.name());
        serializer.j0(this.g.name());
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.Y(this.j);
        serializer.Y(this.k);
        serializer.Y(this.l);
        serializer.j0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        com.vk.dto.stereo.a aVar = this.o;
        a.c cVar = aVar instanceof a.c ? (a.c) aVar : null;
        serializer.j0(cVar != null ? cVar.a : null);
        a.C0914a c0914a = aVar instanceof a.C0914a ? (a.C0914a) aVar : null;
        serializer.S(c0914a != null ? c0914a.a : 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.l0(this.q);
        serializer.l0(this.r);
        serializer.S(this.s);
        serializer.f0(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StereoRoom)) {
            return false;
        }
        StereoRoom stereoRoom = (StereoRoom) obj;
        return epx.f(this.b, stereoRoom.b) && epx.f(this.c, stereoRoom.c) && epx.f(this.d, stereoRoom.d) && epx.f(this.e, stereoRoom.e) && this.f == stereoRoom.f && this.g == stereoRoom.g && this.h == stereoRoom.h && this.i == stereoRoom.i && this.j == stereoRoom.j && this.k == stereoRoom.k && this.l == stereoRoom.l && epx.f(this.m, stereoRoom.m) && this.n == stereoRoom.n && epx.f(this.o, stereoRoom.o) && this.p == stereoRoom.p && epx.f(this.q, stereoRoom.q) && epx.f(this.r, stereoRoom.r) && this.s == stereoRoom.s && epx.f(this.t, stereoRoom.t);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.t.hashCode() + shy.a(this.s, fw3.a(fw3.a(qoy.b((this.o.hashCode() + qoy.b(urd0.a(bh10.a(bh10.a(bh10.a(qoy.b(qoy.b((this.g.hashCode() + ((this.f.hashCode() + bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p), 31, this.q), 31, this.r), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StereoRoom(roomId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", privacy=");
        sb.append(this.g);
        sb.append(", canEdit=");
        sb.append(this.h);
        sb.append(", onlyAuthUsers=");
        sb.append(this.i);
        sb.append(", time=");
        sb.append(this.j);
        sb.append(", duration=");
        sb.append(this.k);
        sb.append(", createdTime=");
        sb.append(this.l);
        sb.append(", joinLink=");
        sb.append(this.m);
        sb.append(", audioOnly=");
        sb.append(this.n);
        sb.append(", cover=");
        sb.append(this.o);
        sb.append(", hasWallPost=");
        sb.append(this.p);
        sb.append(", speakersIds=");
        sb.append(this.q);
        sb.append(", participantIds=");
        sb.append(this.r);
        sb.append(", participantCount=");
        sb.append(this.s);
        sb.append(", participantImages=");
        return ms9.a(')', sb, this.t);
    }
}

package com.vk.voip.ui.accessibility;

import android.content.Context;
import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.bpn0;
import xsna.c5g;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.ka;
import xsna.lk;
import xsna.nk;
import xsna.nl;
import xsna.ok;
import xsna.qr;
import xsna.rk;
import xsna.s3j0;
import xsna.s3q0;
import xsna.urd0;
import xsna.vk;
import xsna.wk;
import xsna.zk;
import xsna.zrp;

/* compiled from: AccessibilityEvents.kt */
/* loaded from: classes7.dex */
public final class AccessibilityEvents {
    public static final long o = TimeUnit.SECONDS.toMillis(3);
    public static final e p = new e();
    public final com.vk.im.engine.internal.storage.delegates.messages.b a;
    public final zk b;
    public final c c;
    public final com.vk.movika.sdk.base.model.b d;
    public final LinkedHashMap e;
    public long f;
    public int g;
    public final ArrayList h;
    public final LinkedHashSet i;
    public final io.reactivex.rxjava3.disposables.b j;
    public final long k;
    public boolean l;
    public final HashMap<String, a> m;
    public final bpn0 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccessibilityEvents.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event ASR_STARTED;
        public static final Event ASR_STOPPED;
        public static final Event HAND_LOWERED;
        public static final Event HAND_RAISED;
        public static final Event MOVIE_STARTED;
        public static final Event MOVIE_STOPPED;
        public static final Event REACTIONS;
        public static final Event RECORD_STARTED;
        public static final Event RECORD_STOPPED;
        public static final Event SCREEN_CAST_STARTED;
        public static final Event SCREEN_CAST_STOPPED;
        public static final Event STREAMING_STARTED;
        public static final Event STREAMING_STOPPED;
        public static final Event USER_JOINED;
        public static final Event USER_LEFT;

        static {
            Event event = new Event("USER_JOINED", 0);
            USER_JOINED = event;
            Event event2 = new Event("USER_LEFT", 1);
            USER_LEFT = event2;
            Event event3 = new Event("SCREEN_CAST_STARTED", 2);
            SCREEN_CAST_STARTED = event3;
            Event event4 = new Event("SCREEN_CAST_STOPPED", 3);
            SCREEN_CAST_STOPPED = event4;
            Event event5 = new Event("MOVIE_STARTED", 4);
            MOVIE_STARTED = event5;
            Event event6 = new Event("MOVIE_STOPPED", 5);
            MOVIE_STOPPED = event6;
            Event event7 = new Event("RECORD_STARTED", 6);
            RECORD_STARTED = event7;
            Event event8 = new Event("RECORD_STOPPED", 7);
            RECORD_STOPPED = event8;
            Event event9 = new Event("STREAMING_STARTED", 8);
            STREAMING_STARTED = event9;
            Event event10 = new Event("STREAMING_STOPPED", 9);
            STREAMING_STOPPED = event10;
            Event event11 = new Event("ASR_STARTED", 10);
            ASR_STARTED = event11;
            Event event12 = new Event("ASR_STOPPED", 11);
            ASR_STOPPED = event12;
            Event event13 = new Event("REACTIONS", 12);
            REACTIONS = event13;
            Event event14 = new Event("HAND_RAISED", 13);
            HAND_RAISED = event14;
            Event event15 = new Event("HAND_LOWERED", 14);
            HAND_LOWERED = event15;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13, event14, event15};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", isFemale=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList, ArrayList arrayList2) {
            this.a = arrayList;
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public interface c {
        q<List<a>> a(Collection<String> collection);
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class d {
        public final Context a;
        public bpn0 b;

        public d(Context context) {
            this.a = context;
        }

        public final AccessibilityEvents a() {
            bpn0 bpn0Var = this.b;
            c aVar = bpn0Var != null ? new com.vk.voip.ui.accessibility.a(bpn0Var) : AccessibilityEvents.p;
            Context context = this.a;
            com.vk.voip.ui.accessibility.b bVar = new com.vk.voip.ui.accessibility.b(context);
            nl nlVar = new nl(context, false);
            return new AccessibilityEvents(new com.vk.im.engine.internal.storage.delegates.messages.b(nlVar, 1), new zk(nlVar, bVar), aVar, new com.vk.movika.sdk.base.model.b(this, 2));
        }

        public final void b(bpn0 bpn0Var) {
            this.b = bpn0Var;
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class e implements c {
        @Override // com.vk.voip.ui.accessibility.AccessibilityEvents.c
        public final q<List<a>> a(Collection<String> collection) {
            return q.T(EmptyList.b);
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class f {
        public final LinkedHashSet a;
        public final LinkedHashMap b;

        public f(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
            this.a = linkedHashSet;
            this.b = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "EventData(ids=" + this.a + ", reactions=" + this.b + ')';
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final class g {
        public final int a;
        public final Event b;
        public final ArrayList c;
        public final Collection<a> d;
        public final LinkedHashMap e;

        public g(int i, Event event, ArrayList arrayList, Collection collection, LinkedHashMap linkedHashMap) {
            this.a = i;
            this.b = event;
            this.c = arrayList;
            this.d = collection;
            this.e = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c.equals(gVar.c) && epx.f(this.d, gVar.d) && this.e.equals(gVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + s3j0.a(qr.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), this.d, 31);
        }

        public final String toString() {
            return "EventInfo(index=" + this.a + ", event=" + this.b + ", userIds=" + this.c + ", authors=" + this.d + ", reactions=" + this.e + ')';
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.receiver;
            ArrayList arrayList = accessibilityEvents.h;
            ArrayList arrayList2 = accessibilityEvents.h;
            LinkedHashMap linkedHashMap = accessibilityEvents.e;
            if (arrayList.isEmpty()) {
                ka kaVar = new ka(accessibilityEvents, 2);
                Event[] values = Event.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        int length2 = (accessibilityEvents.g + i) % values.length;
                        Event event = values[length2];
                        accessibilityEvents.c("Handle event of type " + event);
                        f fVar = (f) linkedHashMap.remove(event);
                        if (fVar == null) {
                            accessibilityEvents.c("Nothing found for event of type " + event);
                        } else {
                            LinkedHashMap linkedHashMap2 = fVar.b;
                            LinkedHashSet linkedHashSet = fVar.a;
                            ArrayList arrayList3 = new ArrayList(c5g.u(linkedHashSet, 10));
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((CallMemberId) it.next()).b);
                            }
                            if (arrayList3.isEmpty()) {
                                accessibilityEvents.c("No ids found for event of type " + event);
                            } else {
                                accessibilityEvents.c("Got " + arrayList3.size() + " author's ids");
                                if (arrayList3.size() < 3) {
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        String str = (String) it2.next();
                                        a aVar = accessibilityEvents.m.get(str);
                                        if (aVar == null) {
                                            arrayList5.add(str);
                                        } else {
                                            arrayList4.add(aVar);
                                        }
                                    }
                                    b bVar = new b(arrayList4, arrayList5);
                                    if (arrayList5.isEmpty() || event == Event.USER_LEFT) {
                                        kaVar.invoke(new g(length2, event, arrayList3, arrayList4, linkedHashMap2));
                                        if (event == Event.USER_LEFT) {
                                            Iterator it3 = arrayList3.iterator();
                                            while (it3.hasNext()) {
                                                accessibilityEvents.m.remove((String) it3.next());
                                            }
                                        }
                                    } else {
                                        accessibilityEvents.j.b(io.reactivex.rxjava3.kotlin.c.f(2, accessibilityEvents.c.a(arrayList5).a0((w) accessibilityEvents.n.getValue()), null, new nk(0), new ok(accessibilityEvents, kaVar, length2, event, arrayList3, bVar, linkedHashMap2)));
                                    }
                                } else {
                                    kaVar.invoke(new g(length2, event, arrayList3, EmptyList.b, linkedHashMap2));
                                    if (event == Event.USER_LEFT) {
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            accessibilityEvents.m.remove((String) it4.next());
                                        }
                                    }
                                }
                            }
                        }
                        i++;
                    } else {
                        accessibilityEvents.l = false;
                        if (!linkedHashMap.isEmpty() || !arrayList2.isEmpty()) {
                            accessibilityEvents.f();
                        }
                    }
                }
            } else {
                accessibilityEvents.a.invoke((String) arrayList.remove(0));
                accessibilityEvents.f = System.currentTimeMillis();
                accessibilityEvents.l = false;
                if (!linkedHashMap.isEmpty() || !arrayList2.isEmpty()) {
                    accessibilityEvents.f();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<CallMember, CallMemberId> {
        @Override // xsna.izs
        public final CallMemberId invoke(CallMember callMember) {
            AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.receiver;
            e eVar = AccessibilityEvents.p;
            accessibilityEvents.getClass();
            return callMember.a;
        }
    }

    /* compiled from: AccessibilityEvents.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<CallMember, CallMemberId> {
        @Override // xsna.izs
        public final CallMemberId invoke(CallMember callMember) {
            AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.receiver;
            e eVar = AccessibilityEvents.p;
            accessibilityEvents.getClass();
            return callMember.a;
        }
    }

    public AccessibilityEvents() {
        throw null;
    }

    public AccessibilityEvents(com.vk.im.engine.internal.storage.delegates.messages.b bVar, zk zkVar, c cVar, com.vk.movika.sdk.base.model.b bVar2) {
        this.a = bVar;
        this.b = zkVar;
        this.c = cVar;
        this.d = bVar2;
        this.e = new LinkedHashMap();
        this.h = new ArrayList();
        this.i = new LinkedHashSet();
        this.j = new io.reactivex.rxjava3.disposables.b();
        this.k = o;
        this.m = new HashMap<>();
        this.n = new bpn0(new lk(this));
    }

    public final f a(Event event, CallMemberId callMemberId) {
        if (!this.i.contains(callMemberId) || !((Boolean) this.d.invoke()).booleanValue()) {
            return null;
        }
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get(event);
        if (obj == null) {
            obj = new f(new LinkedHashSet(), new LinkedHashMap());
            linkedHashMap.put(event, obj);
        }
        f fVar = (f) obj;
        fVar.a.add(callMemberId);
        return fVar;
    }

    public final void b(Event event, Event event2, Collection<CallMemberId> collection) {
        com.vk.movika.sdk.base.model.b bVar = this.d;
        if (((Boolean) bVar.invoke()).booleanValue()) {
            for (CallMemberId callMemberId : collection) {
                if (((Boolean) bVar.invoke()).booleanValue() && (event2 == null || !e(event2, callMemberId))) {
                    a(event, callMemberId);
                }
            }
            f();
        }
    }

    public final void c(String str) {
        L.e("AccessibilityEvents", Thread.currentThread().getName() + "-> " + str);
    }

    public final void d(gzs<s3q0> gzsVar) {
        this.j.b(((w) this.n.getValue()).c(new vk(0, gzsVar)));
    }

    public final boolean e(Event event, CallMemberId callMemberId) {
        LinkedHashMap linkedHashMap = this.e;
        f fVar = (f) linkedHashMap.get(event);
        if (fVar == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = fVar.a;
        if (!linkedHashSet.remove(callMemberId)) {
            return false;
        }
        if (!linkedHashSet.isEmpty()) {
            return true;
        }
        linkedHashMap.remove(event);
        return true;
    }

    public final void f() {
        if (this.l || !((Boolean) this.d.invoke()).booleanValue()) {
            c("schedule(): already scheduled, ignore");
            return;
        }
        this.l = true;
        long max = Math.max(this.k - (System.currentTimeMillis() - this.f), 10L);
        c("schedule(" + max + ')');
        this.j.b(((w) this.n.getValue()).d(new wk(new h(0, this, AccessibilityEvents.class, "next", "next()V", 0), 0), max, TimeUnit.MILLISECONDS));
    }

    public final void g(CallMember callMember, Collection<CallMember> collection) {
        d(new rk(this, collection, new i(1, this, AccessibilityEvents.class, "mapMemberToId", "mapMemberToId(Lcom/vk/voip/dto/call_member/CallMember;)Lcom/vk/voip/dto/call_member/CallMemberId;", 0), callMember));
    }

    public final void h(final CallMember callMember, final Collection<CallMember> collection) {
        final j jVar = new j(1, this, AccessibilityEvents.class, "mapMemberToId", "mapMemberToId(Lcom/vk/voip/dto/call_member/CallMember;)Lcom/vk/voip/dto/call_member/CallMemberId;", 0);
        d(new gzs() { // from class: xsna.tk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("usersLeft(");
                Collection collection2 = collection;
                sb.append(collection2.size());
                sb.append(')');
                String sb2 = sb.toString();
                AccessibilityEvents accessibilityEvents = AccessibilityEvents.this;
                accessibilityEvents.c(sb2);
                LinkedHashSet linkedHashSet = accessibilityEvents.i;
                AccessibilityEvents.j jVar2 = jVar;
                CallMemberId callMemberId = (CallMemberId) jVar2.invoke(callMember);
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    CallMemberId callMemberId2 = (CallMemberId) jVar2.invoke(it.next());
                    if (linkedHashSet.contains(callMemberId2)) {
                        boolean e2 = accessibilityEvents.e(AccessibilityEvents.Event.USER_JOINED, callMemberId2);
                        for (AccessibilityEvents.Event event : AccessibilityEvents.Event.values()) {
                            if (event != AccessibilityEvents.Event.USER_LEFT && event != AccessibilityEvents.Event.USER_JOINED) {
                                accessibilityEvents.e(event, callMemberId2);
                            }
                        }
                        if (!e2 && !epx.f(callMemberId2, callMemberId)) {
                            accessibilityEvents.a(AccessibilityEvents.Event.USER_LEFT, callMemberId2);
                        }
                        linkedHashSet.remove(callMemberId2);
                    }
                }
                accessibilityEvents.f();
                return s3q0.a;
            }
        });
    }
}

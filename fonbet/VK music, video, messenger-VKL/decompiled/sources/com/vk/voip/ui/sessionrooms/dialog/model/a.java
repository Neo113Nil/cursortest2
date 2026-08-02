package com.vk.voip.ui.sessionrooms.dialog.model;

import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import com.vk.voip.ui.sessionrooms.d;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.f;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.bpn0;
import xsna.brm0;
import xsna.c2j;
import xsna.c5g;
import xsna.eni0;
import xsna.epx;
import xsna.eqd;
import xsna.fl40;
import xsna.gr;
import xsna.hl30;
import xsna.i630;
import xsna.izs;
import xsna.jgp;
import xsna.l140;
import xsna.lvi0;
import xsna.o860;
import xsna.on00;
import xsna.rf20;
import xsna.s3q0;
import xsna.svi0;
import xsna.t34;
import xsna.t810;
import xsna.uf3;
import xsna.uvi0;
import xsna.vvi0;
import xsna.whr0;
import xsna.wk90;
import xsna.x4c;
import xsna.xvi0;
import xsna.z6f0;

/* compiled from: SessionRoomsDataProvider.kt */
/* loaded from: classes7.dex */
public final class a {
    public final com.vk.voip.b a;
    public final bpn0 b = new bpn0(new rf20(this, 28));

    /* compiled from: SessionRoomsDataProvider.kt */
    /* renamed from: com.vk.voip.ui.sessionrooms.dialog.model.a$a, reason: collision with other inner class name */
    public static final class C2077a {
        public final SessionRoomId.Room a;
        public final boolean b;
        public final izs<Boolean, Boolean> c;
        public final izs<Boolean, Boolean> d;
        public final izs<f.a.b, s3q0> e;
        public final boolean f;

        public C2077a(SessionRoomId.Room room, izs izsVar, izs izsVar2, eqd eqdVar, int i) {
            room = (i & 1) != 0 ? null : room;
            boolean z = (i & 2) == 0;
            izsVar = (i & 4) != 0 ? new eni0(5) : izsVar;
            izsVar2 = (i & 8) != 0 ? new eni0(5) : izsVar2;
            eqdVar = (i & 16) != 0 ? null : eqdVar;
            boolean z2 = (i & 32) == 0;
            this.a = room;
            this.b = z;
            this.c = izsVar;
            this.d = izsVar2;
            this.e = eqdVar;
            this.f = z2;
        }
    }

    /* compiled from: SessionRoomsDataProvider.kt */
    public static final class b {
        public final f.a a;
        public final boolean b;
        public final Collection<lvi0> c;
        public final Collection<SessionRoomParticipantModel> d;
        public final svi0 e;

        public b(f.a aVar, boolean z, Collection<lvi0> collection, Collection<SessionRoomParticipantModel> collection2, svi0 svi0Var) {
            this.a = aVar;
            this.b = z;
            this.c = collection;
            this.d = collection2;
            this.e = svi0Var;
        }
    }

    /* compiled from: SessionRoomsDataProvider.kt */
    public static final class c {
        public final f.a a;
        public final SessionRoomId.Room b;
        public final Collection<f.a.b> c;
        public final Set<ParticipantId> d;
        public final Set<ParticipantId> e;

        public c(f.a aVar, SessionRoomId.Room room, Collection<f.a.b> collection, Set<ParticipantId> set, Set<ParticipantId> set2) {
            this.a = aVar;
            this.b = room;
            this.c = collection;
            this.d = set;
            this.e = set2;
        }
    }

    public a(com.vk.voip.b bVar) {
        this.a = bVar;
    }

    public static x b(Collection collection) {
        if (collection.isEmpty()) {
            return x.k(jgp.b);
        }
        Collection collection2 = collection;
        int e = on00.e(c5g.u(collection2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : collection2) {
            linkedHashMap.put(((SessionRoomParticipants.Participant) obj).getId().id, obj);
        }
        com.vk.voip.ui.c.b.getClass();
        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        return voipDataProvider.h(linkedHashMap.keySet()).l(new hl30(new z6f0(linkedHashMap, 7), 10));
    }

    public static SessionRoomParticipantModel c(SessionRoomId sessionRoomId, SessionRoomParticipants.Participant participant, c cVar, Map map) {
        boolean z;
        SessionRoomParticipantModel.Status status;
        wk90 wk90Var = map != null ? (wk90) map.get(participant.getId()) : null;
        ConversationParticipant participant2 = participant.getParticipant();
        if (map != null && wk90Var == null && participant2 == null) {
            ParticipantId id = participant.getId();
            if (id.isAnon || brm0.B(id.id, "-", false)) {
                return null;
            }
        }
        ParticipantId id2 = participant.getId();
        boolean contains = cVar.d.contains(participant.getId());
        boolean contains2 = cVar.e.contains(participant.getId());
        if (participant2 != null) {
            z = participant2.isCreator() || participant2.isAdmin();
        } else {
            z = false;
        }
        boolean isCreator = participant2 != null ? participant2.isCreator() : false;
        ConversationParticipant participant3 = participant.getParticipant();
        if (participant3 == null) {
            status = SessionRoomParticipantModel.Status.Missing;
        } else if (participant3.isCallAccepted()) {
            status = ((sessionRoomId instanceof SessionRoomId.Room) && epx.f(participant.getActualRoomId(), sessionRoomId)) ? SessionRoomParticipantModel.Status.InRoom : SessionRoomParticipantModel.Status.InCall;
        } else {
            status = SessionRoomParticipantModel.Status.NotConnected;
        }
        return new SessionRoomParticipantModel(id2, contains, contains2, z, isCreator, status, wk90Var, cVar.c.size() > 1);
    }

    public final r a(boolean z, x xVar) {
        i630 i630Var = new i630(new xvi0(z, this), 13);
        xVar.getClass();
        return new r(xVar, i630Var);
    }

    public final b d(boolean z, c cVar, Collection<f.a.b> collection, Pair<? extends Map<SessionRoomId.Room, ? extends Collection<SessionRoomParticipants.Participant>>, ? extends Map<ParticipantId, wk90>> pair, Pair<? extends Collection<SessionRoomParticipants.Participant>, ? extends Map<ParticipantId, wk90>> pair2) {
        ArrayList arrayList;
        Collection<SessionRoomParticipants.Participant> i;
        boolean z2;
        f.a aVar = cVar.a;
        Collection<f.a.b> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            f.a.b bVar = (f.a.b) it.next();
            Collection<SessionRoomParticipants.Participant> collection3 = pair.i().get(bVar.a);
            boolean z3 = false;
            if (collection3 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = collection3.iterator();
                z2 = false;
                while (it2.hasNext()) {
                    SessionRoomParticipantModel c2 = c(bVar.a, (SessionRoomParticipants.Participant) it2.next(), cVar, pair.j());
                    if (c2 != null) {
                        if (c2.b) {
                            z2 = true;
                        }
                        if (c2.c) {
                            z3 = true;
                        }
                    } else {
                        c2 = null;
                    }
                    if (c2 != null) {
                        arrayList3.add(c2);
                    }
                }
                arrayList = arrayList3;
            } else {
                z2 = false;
            }
            arrayList2.add(new lvi0(bVar, z3, z2, arrayList));
        }
        if (pair2 != null && (i = pair2.i()) != null) {
            arrayList = new ArrayList();
            Iterator<T> it3 = i.iterator();
            while (it3.hasNext()) {
                SessionRoomParticipantModel c3 = c(SessionRoomId.MainCall.INSTANCE, (SessionRoomParticipants.Participant) it3.next(), cVar, pair2.j());
                if (c3 != null) {
                    arrayList.add(c3);
                }
            }
        }
        c2j.a a = ((c2j) this.b.getValue()).a();
        return new b(aVar, z, arrayList2, arrayList, new svi0(a.e, a.d, a.f));
    }

    public final o0 e(C2077a c2077a) {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        d dVar = com.vk.voip.ui.c.B0;
        dVar.getClass();
        com.vk.voip.b bVar = this.a;
        ParticipantStatesManager participantStatesManager = bVar.getParticipantStatesManager();
        t T = participantStatesManager == null ? q.T(EmptySet.b) : new io.reactivex.rxjava3.internal.operators.observable.q(new fl40(participantStatesManager, 3));
        ParticipantStatesManager participantStatesManager2 = bVar.getParticipantStatesManager();
        t T2 = participantStatesManager2 == null ? q.T(EmptySet.b) : new io.reactivex.rxjava3.internal.operators.observable.q(new t34(participantStatesManager2, 27));
        y yVar = new y(dVar.b().U(new uf3(new t810(13), 25)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        q<? extends Collection<f.a.b>> a = c2077a.b ? dVar.b.a(SessionRoomsObserver.ObserveRoomsScope.AVAILABLE_FOR_TRANSITION) : dVar.l();
        cVar.getClass();
        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        io.reactivex.rxjava3.subjects.f<whr0> fVar = voipDataProvider.j;
        fVar.getClass();
        q k = q.k(T, T2, yVar, a, new z0(fVar).U(new gr(new l140(4), 25)).n0(q.T(s3q0.a)), new vvi0(new uvi0(c2077a), 0));
        o860 o860Var = new o860(new x4c(c2077a, this, dVar, 7), 5);
        k.getClass();
        return new o0(k, o860Var);
    }
}

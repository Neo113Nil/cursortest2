package com.vk.voip.ui.sessionrooms;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import com.vk.voip.ui.sessionrooms.f;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.a840;
import xsna.bpn0;
import xsna.c13;
import xsna.erb;
import xsna.f2w;
import xsna.fe60;
import xsna.gzs;
import xsna.hwi0;
import xsna.iwi0;
import xsna.izc0;
import xsna.j630;
import xsna.jgp;
import xsna.jqb;
import xsna.jw5;
import xsna.jxi0;
import xsna.kxi0;
import xsna.la4;
import xsna.lnf;
import xsna.mwi0;
import xsna.q1;
import xsna.qvi0;
import xsna.qwi0;
import xsna.s12;
import xsna.sj4;
import xsna.tog;
import xsna.u35;
import xsna.ulp;
import xsna.v34;
import xsna.w94;
import xsna.ztc;
import xsna.zvi0;

/* compiled from: SessionRoomsDelegate.kt */
/* loaded from: classes11.dex */
public final class d implements c, SessionRoomsObserver {
    public final OKVoipEngine a;
    public final kxi0 b = new kxi0();
    public final io.reactivex.rxjava3.subjects.f<com.vk.voip.ui.sessionrooms.a> c = new io.reactivex.rxjava3.subjects.f<>();
    public final bpn0 d;
    public final io.reactivex.rxjava3.disposables.c e;
    public final io.reactivex.rxjava3.subjects.f<ParticipantId> f;
    public final bpn0 g;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes7.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((f.a.b) t).a.getId()), Integer.valueOf(((f.a.b) t2).a.getId()));
        }
    }

    public d(OKVoipEngine oKVoipEngine, com.vk.voip.ui.c cVar, u35 u35Var, lnf lnfVar, final s12 s12Var, final tog togVar) {
        this.a = oKVoipEngine;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = new bpn0(new gzs() { // from class: xsna.yvi0
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.sessionrooms.d.this;
                mwi0 mwi0Var = new mwi0(dVar.a, s12Var, togVar);
                new vwi0(mwi0Var.g(), com.vk.voip.ui.c.l, dVar.b);
                mwi0Var.X();
                return mwi0Var;
            }
        });
        iwi0 iwi0Var = new iwi0(this);
        this.e = EmptyDisposable.INSTANCE;
        io.reactivex.rxjava3.subjects.f<ParticipantId> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.f = fVar;
        ParticipantStatesManager.Listener listener = new ParticipantStatesManager.Listener() { // from class: xsna.ewi0
            @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
            public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                Object obj;
                Iterator<T> it = stateChangedEvent.getChanges().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ParticipantStatesManager.ParticipantStateChange) obj).isOn()) {
                            break;
                        }
                    }
                }
                ParticipantStatesManager.ParticipantStateChange participantStateChange = (ParticipantStatesManager.ParticipantStateChange) obj;
                if (participantStateChange != null) {
                    com.vk.voip.ui.sessionrooms.d.this.f.onNext(participantStateChange.getParticipantId());
                }
            }
        };
        bpn0 bpn0Var = new bpn0(new c13(12));
        this.g = new bpn0(new w94(lnfVar));
        ulp ulpVar = OKVoipEngine.k;
        ulpVar.k.a(iwi0Var);
        ulpVar.m.a.add(listener);
        ulpVar.r.a.add((jqb) bpn0Var.getValue());
        this.e = fVar.w0(500L, TimeUnit.MILLISECONDS).subscribe(new f2w(new izc0(this, 1), 1));
        bVar.b(((jqb) bpn0Var.getValue()).a.subscribe(new zvi0(new la4(this, 5), 0)));
    }

    @Override // com.vk.voip.ui.sessionrooms.SessionRoomsObserver
    public final j1 a() {
        return k().U().U(new j630(new q1(this), 15));
    }

    @Override // com.vk.voip.ui.sessionrooms.SessionRoomsObserver
    public final q<f> b() {
        kxi0 kxi0Var = this.b;
        return q.k(kxi0Var.a, kxi0Var.c, kxi0Var.d, kxi0Var.e, kxi0Var.f, new fe60(new jxi0(), 11));
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Map<SessionRoomId.Room, Collection<SessionRoomParticipants.Participant>>> c() {
        this.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        return D == null ? x.k(jgp.b) : new io.reactivex.rxjava3.internal.operators.single.b(new v34(D, 29));
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Collection<SessionRoomParticipants.Participant>> d(SessionRoomId.Room room) {
        this.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        return D == null ? x.k(EmptyList.b) : new io.reactivex.rxjava3.internal.operators.single.b(new erb(5, D, room));
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final void e(f.a.b bVar) {
        k().C(new qwi0.e(bVar));
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final io.reactivex.rxjava3.core.a f(List<SessionRoomId.Room> list) {
        return new io.reactivex.rxjava3.internal.operators.completable.e(new ztc(this, list));
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final void g() {
        k().C(qwi0.h.b);
        m().b();
    }

    @Override // com.vk.voip.ui.sessionrooms.SessionRoomsObserver
    public final io.reactivex.rxjava3.subjects.d h() {
        return this.b.h;
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Collection<SessionRoomParticipants.Participant>> i() {
        this.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        return D == null ? x.k(EmptyList.b) : new io.reactivex.rxjava3.internal.operators.single.b(new sj4(D, 28));
    }

    public final SessionRoomId j() {
        SessionRoomsManager.SessionRoomInfo ownActiveRoom;
        SessionRoomId roomId;
        this.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        return (D == null || (ownActiveRoom = D.getOwnActiveRoom()) == null || (roomId = ownActiveRoom.getRoomId()) == null) ? SessionRoomId.MainCall.INSTANCE : roomId;
    }

    public final mwi0 k() {
        return (mwi0) this.d.getValue();
    }

    public final q<? extends Collection<f.a.b>> l() {
        return new y(this.b.a(SessionRoomsObserver.ObserveRoomsScope.ALL).U(new a840(new hwi0(0), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final qvi0 m() {
        return (qvi0) this.g.getValue();
    }

    public final void n() {
        k().C(qwi0.f.b);
    }
}

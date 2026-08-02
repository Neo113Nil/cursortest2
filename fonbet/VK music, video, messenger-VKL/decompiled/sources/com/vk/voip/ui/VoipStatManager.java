package com.vk.voip.ui;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vkontakte.android.data.b;
import defpackage.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.bh10;
import xsna.cqm0;
import xsna.el3;
import xsna.epx;
import xsna.h5s;
import xsna.j5g;
import xsna.oq;
import xsna.p4g;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VoipStatManager.kt */
/* loaded from: classes7.dex */
public final class VoipStatManager {
    public static StatData a = new StatData(0);
    public static b b = new b();
    public static boolean c;

    /* compiled from: VoipStatManager.kt */
    public static final class StatData {
        public boolean a;
        public FailReason b;
        public String c;
        public ConnectionType d;
        public boolean e;
        public long f;
        public long g;
        public long h;
        public String i;
        public VoipCallSource j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public long o;
        public final String p;
        public boolean q;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipStatManager.kt */
        public static final class ConnectionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ConnectionType[] $VALUES;
            public static final ConnectionType p2p;
            public static final ConnectionType relay;

            static {
                ConnectionType connectionType = new ConnectionType("p2p", 0);
                p2p = connectionType;
                ConnectionType connectionType2 = new ConnectionType(CandidateTypeHintConfig.TYPE_RELAY, 1);
                relay = connectionType2;
                ConnectionType[] connectionTypeArr = {connectionType, connectionType2};
                $VALUES = connectionTypeArr;
                $ENTRIES = new asp(connectionTypeArr);
            }

            public ConnectionType() {
                throw null;
            }

            public static ConnectionType valueOf(String str) {
                return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
            }

            public static ConnectionType[] values() {
                return (ConnectionType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipStatManager.kt */
        public static final class FailReason {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FailReason[] $VALUES;
            public static final FailReason busy;
            public static final FailReason cant_connect;
            public static final FailReason declined_local;
            public static final FailReason declined_remote;
            public static final FailReason declined_timeout;
            public static final FailReason error_etc;
            public static final FailReason error_io;
            public static final FailReason lost_connection;
            public static final FailReason none;
            public static final FailReason push_not_delivered;

            static {
                FailReason failReason = new FailReason("none", 0);
                none = failReason;
                FailReason failReason2 = new FailReason("error_io", 1);
                error_io = failReason2;
                FailReason failReason3 = new FailReason("error_etc", 2);
                error_etc = failReason3;
                FailReason failReason4 = new FailReason("push_not_delivered", 3);
                push_not_delivered = failReason4;
                FailReason failReason5 = new FailReason("cant_connect", 4);
                cant_connect = failReason5;
                FailReason failReason6 = new FailReason("declined_remote", 5);
                declined_remote = failReason6;
                FailReason failReason7 = new FailReason("declined_local", 6);
                declined_local = failReason7;
                FailReason failReason8 = new FailReason("declined_timeout", 7);
                declined_timeout = failReason8;
                FailReason failReason9 = new FailReason("busy", 8);
                busy = failReason9;
                FailReason failReason10 = new FailReason("lost_connection", 9);
                lost_connection = failReason10;
                FailReason[] failReasonArr = {failReason, failReason2, failReason3, failReason4, failReason5, failReason6, failReason7, failReason8, failReason9, failReason10};
                $VALUES = failReasonArr;
                $ENTRIES = new asp(failReasonArr);
            }

            public FailReason() {
                throw null;
            }

            public static FailReason valueOf(String str) {
                return (FailReason) Enum.valueOf(FailReason.class, str);
            }

            public static FailReason[] values() {
                return (FailReason[]) $VALUES.clone();
            }
        }

        /* compiled from: VoipStatManager.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FailReason.values().length];
                try {
                    iArr[FailReason.error_io.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FailReason.error_etc.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FailReason.push_not_delivered.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FailReason.cant_connect.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FailReason.declined_remote.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FailReason.declined_local.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FailReason.declined_timeout.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FailReason.busy.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FailReason.lost_connection.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public StatData() {
            this(0);
        }

        public final String a() {
            return this.e ? this.l ? this.k ? "started_as_video_with_mask" : "video_with_mask" : this.k ? "started_as_video" : "video" : "audio";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatData)) {
                return false;
            }
            StatData statData = (StatData) obj;
            return this.a == statData.a && this.b == statData.b && epx.f(this.c, statData.c) && this.d == statData.d && this.e == statData.e && this.f == statData.f && this.g == statData.g && this.h == statData.h && epx.f(this.i, statData.i) && epx.f(this.j, statData.j) && this.k == statData.k && this.l == statData.l && this.m == statData.m && this.n == statData.n && this.o == statData.o && epx.f(this.p, statData.p) && this.q == statData.q;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.q) + urd0.a(bh10.a(qoy.b(qoy.b(qoy.b(qoy.b((this.j.hashCode() + urd0.a(bh10.a(bh10.a(bh10.a(qoy.b((this.d.hashCode() + urd0.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatData(isSuccess=");
            sb.append(this.a);
            sb.append(", failReason=");
            sb.append(this.b);
            sb.append(", networkType=");
            sb.append(this.c);
            sb.append(", connectionType=");
            sb.append(this.d);
            sb.append(", isVideo=");
            sb.append(this.e);
            sb.append(", callerWaitTimeBeforeRemoteRinging=");
            sb.append(this.f);
            sb.append(", callerWaitTimeBeforeRemoteAccepted=");
            sb.append(this.g);
            sb.append(", totalSessionDuration=");
            sb.append(this.h);
            sb.append(", eventsString=");
            sb.append(this.i);
            sb.append(", callSource=");
            sb.append(this.j);
            sb.append(", startedAsVideo=");
            sb.append(this.k);
            sb.append(", maskUsed=");
            sb.append(this.l);
            sb.append(", audioMessageAttempted=");
            sb.append(this.m);
            sb.append(", audioMessageSent=");
            sb.append(this.n);
            sb.append(", audioMessageDuration=");
            sb.append(this.o);
            sb.append(", relayIP=");
            sb.append(this.p);
            sb.append(", isOKCall=");
            return q0.a(sb, this.q, ')');
        }

        public StatData(int i) {
            FailReason failReason = FailReason.none;
            ConnectionType connectionType = ConnectionType.p2p;
            Serializer.c<VoipCallSource> cVar = VoipCallSource.CREATOR;
            VoipCallSource a2 = VoipCallSource.a.a();
            this.a = false;
            this.b = failReason;
            this.c = "";
            this.d = connectionType;
            this.e = false;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = "";
            this.j = a2;
            this.k = false;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = 0L;
            this.p = "";
            this.q = false;
        }
    }

    /* compiled from: VoipStatManager.kt */
    public static abstract class a {

        /* compiled from: VoipStatManager.kt */
        /* renamed from: com.vk.voip.ui.VoipStatManager$a$a, reason: collision with other inner class name */
        public static final class C2007a extends a {
            public static final C2007a a = new C2007a();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class d extends a {
            public final Throwable a;

            public d(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("OutgoingFailed(error="), this.a, ')');
            }
        }

        /* compiled from: VoipStatManager.kt */
        public static final class e extends a {
            public static final e a = new e();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class f extends a {
            public static final f a = new f();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class g extends a {
            public static final g a = new g();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class h extends a {
            public static final h a = new h();
        }

        /* compiled from: VoipStatManager.kt */
        public static final class i extends a {
            public static final i a = new i();
        }
    }

    /* compiled from: VoipStatManager.kt */
    public static final class b {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final long c = System.currentTimeMillis();

        public final void a(a aVar) {
            synchronized (this) {
                this.a.add(aVar);
                this.b.add(Long.valueOf(System.currentTimeMillis()));
            }
        }

        public final long b(a aVar) {
            int indexOf;
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0 || !this.a.contains(aVar) || (indexOf = this.a.indexOf(aVar)) < 0) {
                return 0L;
            }
            return ((Number) arrayList.get(indexOf)).longValue() - this.c;
        }
    }

    /* compiled from: VoipStatManager.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipViewModelState.values().length];
            try {
                iArr[VoipViewModelState.CallingPeer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipViewModelState.RecordingAudioMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipViewModelState.DeclinedTransient.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipViewModelState.FinishedTransient.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipViewModelState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipViewModelState.Connecting.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoipViewModelState.InCall.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a() {
        Object obj;
        int i;
        int i2;
        int i3;
        String concat;
        String str;
        Event e;
        String name;
        Object obj2;
        int i4;
        b bVar = b;
        StatData statData = a;
        boolean s0 = com.vk.voip.ui.c.b.s0();
        ArrayList arrayList = bVar.b;
        ArrayList arrayList2 = bVar.a;
        statData.h = arrayList.size() > 0 ? ((Number) j5g.i0(arrayList)).longValue() - bVar.c : 0L;
        String str2 = null;
        statData.i = p4g.k(arrayList2, StringUtils.COMMA, null);
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof a.d) {
                    break;
                }
            }
        }
        if (!(obj instanceof a.d)) {
            obj = null;
        }
        boolean z = false;
        boolean z2 = ((a.d) obj) != null;
        boolean contains = bVar.a.contains(a.f.a);
        boolean contains2 = bVar.a.contains(a.i.a);
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            } else if (((a) listIterator.previous()).equals(a.C2007a.a)) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                i3 = -1;
                break;
            } else if (((a) listIterator2.previous()).equals(a.b.a)) {
                i3 = listIterator2.nextIndex();
                break;
            }
        }
        boolean z3 = i2 >= 0 && i2 > i3;
        if (s0) {
            if (!z2 && !contains2) {
                z = true;
            }
            statData.a = z;
        } else {
            if (!z2 && !contains2 && !contains && z3) {
                z = true;
            }
            statData.a = z;
        }
        if (statData.a) {
            statData.g = bVar.b(a.e.a);
            statData.f = bVar.b(a.h.a);
        }
        if (!statData.a) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (obj2 instanceof a.d) {
                        break;
                    }
                }
            }
            if (!(obj2 instanceof a.d)) {
                obj2 = null;
            }
            a.d dVar = (a.d) obj2;
            Throwable th = dVar != null ? dVar.a : null;
            if (th != null && (th instanceof IOException)) {
                statData.b = StatData.FailReason.error_io;
            } else if (th != null) {
                statData.b = StatData.FailReason.error_etc;
            } else if (bVar.a.contains(a.f.a)) {
                statData.b = StatData.FailReason.busy;
            } else if (bVar.a.contains(a.h.a)) {
                a.e eVar = a.e.a;
                if (bVar.a.contains(eVar)) {
                    if (!bVar.a.contains(a.C2007a.a)) {
                        statData.b = StatData.FailReason.cant_connect;
                    }
                }
                if (bVar.a.contains(a.C2007a.a)) {
                    ListIterator listIterator3 = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            i4 = -1;
                            break;
                        } else if (((a) listIterator3.previous()).equals(a.C2007a.a)) {
                            i4 = listIterator3.nextIndex();
                            break;
                        }
                    }
                    ListIterator listIterator4 = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            break;
                        } else if (((a) listIterator4.previous()).equals(a.b.a)) {
                            i = listIterator4.nextIndex();
                            break;
                        }
                    }
                    if (i4 <= i) {
                        statData.b = StatData.FailReason.lost_connection;
                    }
                }
                if (!bVar.a.contains(eVar)) {
                    if (bVar.a.contains(a.i.a)) {
                        statData.b = StatData.FailReason.declined_timeout;
                    }
                }
                if (bVar.a.contains(a.g.a)) {
                    statData.b = StatData.FailReason.declined_remote;
                } else if (bVar.a.contains(a.c.a)) {
                    statData.b = StatData.FailReason.declined_local;
                }
            } else {
                statData.b = StatData.FailReason.push_not_delivered;
            }
        }
        L.A("VoipStatManager", "About to send call stat, voipEventsLog", arrayList2);
        L.A("VoipStatManager", "About to send call stat, currentStatData: " + statData);
        if (s0) {
            concat = "group_".concat(statData.a());
        } else {
            concat = (statData.q ? "ok_" : "").concat(statData.a());
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("call_stat", "type", concat);
        a2.b(statData.a ? "success" : X3.g.e, "result");
        a2.b(statData.b.toString(), "fail_reason");
        a2.b(statData.c, StatCustomFieldKey.NETWORK_TYPE);
        a2.b(statData.d, "connection_type");
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = statData.j.b;
        if (source != null && (name = source.name()) != null) {
            str2 = cqm0.m(name);
        }
        a2.b(str2, "call_source");
        a2.b(Long.valueOf(statData.h), "total_duration");
        a2.b(statData.p, CandidateTypeHintConfig.TYPE_RELAY);
        a2.e();
        if (statData.m) {
            b.d a3 = io.reactivex.rxjava3.processors.b.a("calls_voice_msg", StatCustomFieldKey.CALL_TYPE, concat);
            a3.b(statData.n ? "sent" : "cancelled", "status");
            StatData.FailReason failReason = statData.b;
            a3.b(failReason == StatData.FailReason.declined_timeout ? "timeout" : failReason == StatData.FailReason.declined_remote ? "remote_decline" : "unknown", "reason");
            a3.b(Long.valueOf(statData.o), "duration");
            a3.e();
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        if (statData.a) {
            el3 el3Var = Event.b;
            Event.a b2 = h5s.b("VOIP.CALL.SUCCEEDED");
            b2.b("wait_time_before_ringing", Long.valueOf(statData.f));
            b2.b("wait_time_before_accepted", Long.valueOf(statData.g));
            b2.b("total_duration", Long.valueOf(statData.h));
            e = b2.e();
        } else {
            String valueOf = String.valueOf(statData.h / 1000);
            el3 el3Var2 = Event.b;
            Event.a aVar = new Event.a();
            switch (StatData.a.$EnumSwitchMapping$0[statData.b.ordinal()]) {
                case 1:
                    str = "VOIP.CALL.FAILED.ERROR_IO";
                    break;
                case 2:
                    str = "VOIP.CALL.FAILED.ERROR_ETC";
                    break;
                case 3:
                    str = "VOIP.CALL.FAILED.PUSH_NOT_DELIVERED";
                    break;
                case 4:
                    str = "VOIP.CALL.FAILED.CANNOT_CONNECT";
                    break;
                case 5:
                    str = "VOIP.CALL.FAILED.DECLINE_REMOTE";
                    break;
                case 6:
                    str = "VOIP.CALL.FAILED.DECLINE_LOCAL";
                    break;
                case 7:
                    str = "VOIP.CALL.FAILED.DECLINE_TIMEOUT";
                    break;
                case 8:
                    str = "VOIP.CALL.FAILED.BUSY";
                    break;
                case 9:
                    str = "VOIP.CALL.FAILED.LOST_CONNECTION";
                    break;
                default:
                    str = "VOIP.CALL.FAILED.UNKNOWN";
                    break;
            }
            aVar.g(str);
            aVar.c("duration_class", valueOf);
            aVar.b("total_duration", Long.valueOf(statData.h));
            if (statData.b == StatData.FailReason.none) {
                aVar.c("log_events_string", statData.i);
            }
            e = aVar.e();
        }
        bVar2.k(e);
    }

    public static void b(Throwable th) {
        if (c) {
            b.a(new a.d(th));
        }
    }
}

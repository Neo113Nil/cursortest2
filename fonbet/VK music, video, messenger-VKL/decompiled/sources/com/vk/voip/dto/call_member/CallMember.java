package com.vk.voip.dto.call_member;

import defpackage.q0;
import java.util.List;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.zrp;

/* compiled from: CallMember.kt */
/* loaded from: classes7.dex */
public final class CallMember {
    public final CallMemberId a;
    public final MediaOptionState b;
    public final MediaOptionState c;
    public final MediaOptionState d;
    public final MediaOptionState e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final NetworkStatus r;
    public final List<Movie> s;
    public final boolean t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallMember.kt */
    /* loaded from: classes11.dex */
    public static final class NetworkStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkStatus[] $VALUES;
        public static final NetworkStatus BAD;
        public static final NetworkStatus GOOD;
        public static final NetworkStatus MEDIUM;

        static {
            NetworkStatus networkStatus = new NetworkStatus("GOOD", 0);
            GOOD = networkStatus;
            NetworkStatus networkStatus2 = new NetworkStatus("MEDIUM", 1);
            MEDIUM = networkStatus2;
            NetworkStatus networkStatus3 = new NetworkStatus("BAD", 2);
            BAD = networkStatus3;
            NetworkStatus[] networkStatusArr = {networkStatus, networkStatus2, networkStatus3};
            $VALUES = networkStatusArr;
            $ENTRIES = new asp(networkStatusArr);
        }

        public NetworkStatus() {
            throw null;
        }

        public static NetworkStatus valueOf(String str) {
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }

        public static NetworkStatus[] values() {
            return (NetworkStatus[]) $VALUES.clone();
        }
    }

    public CallMember(CallMemberId callMemberId, MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, NetworkStatus networkStatus, List<Movie> list, boolean z13) {
        this.a = callMemberId;
        this.b = mediaOptionState;
        this.c = mediaOptionState2;
        this.d = mediaOptionState3;
        this.e = mediaOptionState4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = z12;
        this.r = networkStatus;
        this.s = list;
        this.t = z13;
    }

    public final CallMemberId a() {
        return this.a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.i;
    }

    public final boolean e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallMember)) {
            return false;
        }
        CallMember callMember = (CallMember) obj;
        return epx.f(this.a, callMember.a) && this.b == callMember.b && this.c == callMember.c && this.d == callMember.d && this.e == callMember.e && this.f == callMember.f && this.g == callMember.g && this.h == callMember.h && this.i == callMember.i && this.j == callMember.j && this.k == callMember.k && this.l == callMember.l && this.m == callMember.m && this.n == callMember.n && this.o == callMember.o && this.p == callMember.p && this.q == callMember.q && this.r == callMember.r && epx.f(this.s, callMember.s) && this.t == callMember.t;
    }

    public final boolean f() {
        return this.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + fw3.a((this.r.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallMember(id=");
        sb.append(this.a);
        sb.append(", audioOptionState=");
        sb.append(this.b);
        sb.append(", videoOptionState=");
        sb.append(this.c);
        sb.append(", watchTogetherOptionState=");
        sb.append(this.d);
        sb.append(", screenshareOptionState=");
        sb.append(this.e);
        sb.append(", isAudioEnabled=");
        sb.append(this.f);
        sb.append(", isVideoEnabled=");
        sb.append(this.g);
        sb.append(", isAnimojiEnabled=");
        sb.append(this.h);
        sb.append(", isScreenCaptureEnabled=");
        sb.append(this.i);
        sb.append(", isAccepted=");
        sb.append(this.j);
        sb.append(", isConnected=");
        sb.append(this.k);
        sb.append(", isSpeaker=");
        sb.append(this.l);
        sb.append(", isTalking=");
        sb.append(this.m);
        sb.append(", isSelf=");
        sb.append(this.n);
        sb.append(", isAnonym=");
        sb.append(this.o);
        sb.append(", isCreator=");
        sb.append(this.p);
        sb.append(", isAdmin=");
        sb.append(this.q);
        sb.append(", networkStatus=");
        sb.append(this.r);
        sb.append(", movies=");
        sb.append(this.s);
        sb.append(", isListener=");
        return q0.a(sb, this.t, ')');
    }
}

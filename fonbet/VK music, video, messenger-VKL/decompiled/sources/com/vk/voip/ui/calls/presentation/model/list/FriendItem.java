package com.vk.voip.ui.calls.presentation.model.list;

import com.vk.dto.common.Peer;
import com.vk.im.ui.views.avatars.a;
import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.bt;
import xsna.epx;
import xsna.hfz;
import xsna.ho8;
import xsna.kr5;
import xsna.qoy;
import xsna.tlo0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: FriendItem.kt */
/* loaded from: classes7.dex */
public final class FriendItem implements hfz {
    public final Peer.Member b;
    public final String c;
    public final boolean d;
    public final CallStatus e;
    public final kr5 f;
    public final a g;
    public final a.b h;
    public final String i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendItem.kt */
    public static final class CallStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallStatus[] $VALUES;
        public static final CallStatus Enabled;
        public static final CallStatus Expired;
        public static final CallStatus Restricted;

        static {
            CallStatus callStatus = new CallStatus(PeerConnectionFactory.TRIAL_ENABLED, 0);
            Enabled = callStatus;
            CallStatus callStatus2 = new CallStatus("Restricted", 1);
            Restricted = callStatus2;
            CallStatus callStatus3 = new CallStatus("Expired", 2);
            Expired = callStatus3;
            CallStatus[] callStatusArr = {callStatus, callStatus2, callStatus3};
            $VALUES = callStatusArr;
            $ENTRIES = new asp(callStatusArr);
        }

        public CallStatus() {
            throw null;
        }

        public static CallStatus valueOf(String str) {
            return (CallStatus) Enum.valueOf(CallStatus.class, str);
        }

        public static CallStatus[] values() {
            return (CallStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: FriendItem.kt */
    public interface a {

        /* compiled from: FriendItem.kt */
        /* renamed from: com.vk.voip.ui.calls.presentation.model.list.FriendItem$a$a, reason: collision with other inner class name */
        public static final class C2039a implements a {
            public final tlo0 a;

            public C2039a(tlo0 tlo0Var) {
                this.a = tlo0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2039a) && epx.f(this.a, ((C2039a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return bt.a(new StringBuilder("Offline(seen="), this.a, ')');
            }
        }

        /* compiled from: FriendItem.kt */
        public interface b extends a {

            /* compiled from: FriendItem.kt */
            /* renamed from: com.vk.voip.ui.calls.presentation.model.list.FriendItem$a$b$a, reason: collision with other inner class name */
            public static final class C2040a implements b {
                public static final C2040a a = new C2040a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2040a);
                }

                public final int hashCode() {
                    return 169590889;
                }

                public final String toString() {
                    return "Mobile";
                }
            }

            /* compiled from: FriendItem.kt */
            /* renamed from: com.vk.voip.ui.calls.presentation.model.list.FriendItem$a$b$b, reason: collision with other inner class name */
            public static final class C2041b implements b {
                public static final C2041b a = new C2041b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2041b);
                }

                public final int hashCode() {
                    return 1531492969;
                }

                public final String toString() {
                    return "Other";
                }
            }
        }
    }

    public FriendItem(Peer.Member member, String str, boolean z, CallStatus callStatus, kr5 kr5Var, a aVar, a.b bVar, String str2) {
        this.b = member;
        this.c = str;
        this.d = z;
        this.e = callStatus;
        this.f = kr5Var;
        this.g = aVar;
        this.h = bVar;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendItem)) {
            return false;
        }
        FriendItem friendItem = (FriendItem) obj;
        return this.b.equals(friendItem.b) && this.c.equals(friendItem.c) && this.d == friendItem.d && this.e == friendItem.e && this.f.equals(friendItem.f) && epx.f(this.g, friendItem.g) && this.h.equals(friendItem.h) && epx.f(this.i, friendItem.i);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31;
        String str = this.i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendItem(id=");
        sb.append(this.b);
        sb.append(", displayName=");
        sb.append(this.c);
        sb.append(", isFemale=");
        sb.append(this.d);
        sb.append(", callStatus=");
        sb.append(this.e);
        sb.append(", avatar=");
        sb.append(this.f);
        sb.append(", online=");
        sb.append(this.g);
        sb.append(", placeholder=");
        sb.append(this.h);
        sb.append(", trackCode=");
        return ho8.a(sb, this.i, ')');
    }
}

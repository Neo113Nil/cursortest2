package com.vk.im.engine.models.contacts;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserNameCase;
import java.util.Locale;
import xsna.asp;
import xsna.bh10;
import xsna.bpn0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.q2a0;
import xsna.qoy;
import xsna.ra;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Contact.kt */
/* loaded from: classes2.dex */
public final class Contact extends Serializer.StreamParcelableAdapter implements q2a0 {
    public static final Serializer.c<Contact> CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ImageList h;
    public final String i;
    public final Long j;
    public final long k;
    public final long l;
    public final LastSeenStatus m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final bpn0 q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Contact.kt */
    public static final class LastSeenStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LastSeenStatus[] $VALUES;
        public static final a Companion;
        public static final LastSeenStatus LONG_AGO;
        public static final LastSeenStatus RECENTLY;
        public static final LastSeenStatus TODAY;
        private final int id;

        /* compiled from: Contact.kt */
        public static final class a {
            public static LastSeenStatus a(String str) {
                LastSeenStatus lastSeenStatus;
                Object upperCase = str != null ? str.toUpperCase(Locale.ROOT) : LastSeenStatus.LONG_AGO;
                LastSeenStatus[] values = LastSeenStatus.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        lastSeenStatus = null;
                        break;
                    }
                    lastSeenStatus = values[i];
                    if (epx.f(lastSeenStatus.name(), upperCase)) {
                        break;
                    }
                    i++;
                }
                return lastSeenStatus == null ? LastSeenStatus.LONG_AGO : lastSeenStatus;
            }
        }

        static {
            LastSeenStatus lastSeenStatus = new LastSeenStatus("TODAY", 0, 0);
            TODAY = lastSeenStatus;
            LastSeenStatus lastSeenStatus2 = new LastSeenStatus("RECENTLY", 1, 1);
            RECENTLY = lastSeenStatus2;
            LastSeenStatus lastSeenStatus3 = new LastSeenStatus("LONG_AGO", 2, 2);
            LONG_AGO = lastSeenStatus3;
            LastSeenStatus[] lastSeenStatusArr = {lastSeenStatus, lastSeenStatus2, lastSeenStatus3};
            $VALUES = lastSeenStatusArr;
            $ENTRIES = new asp(lastSeenStatusArr);
            Companion = new a();
        }

        public LastSeenStatus(String str, int i, int i2) {
            this.id = i2;
        }

        public static LastSeenStatus valueOf(String str) {
            return (LastSeenStatus) Enum.valueOf(LastSeenStatus.class, str);
        }

        public static LastSeenStatus[] values() {
            return (LastSeenStatus[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Contact> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Contact a(Serializer serializer) {
            return new Contact(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Contact[i];
        }
    }

    public Contact(long j, String str, String str2, String str3, String str4, boolean z, ImageList imageList, String str5, Long l, long j2, long j3, LastSeenStatus lastSeenStatus, boolean z2, boolean z3, String str6) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = imageList;
        this.i = str5;
        this.j = l;
        this.k = j2;
        this.l = j3;
        this.m = lastSeenStatus;
        this.n = z2;
        this.o = z3;
        this.p = str6;
        this.q = new bpn0(new ra(this, 29));
    }

    public static Contact zb(Contact contact, String str, boolean z, String str2, Long l, long j, long j2, int i) {
        long j3 = contact.b;
        String str3 = (i & 2) != 0 ? contact.c : str;
        String str4 = contact.d;
        String str5 = str3;
        String str6 = contact.e;
        String str7 = contact.f;
        boolean z2 = (i & 32) != 0 ? contact.g : z;
        ImageList imageList = contact.h;
        String str8 = (i & 128) != 0 ? contact.i : str2;
        Long l2 = (i & 256) != 0 ? contact.j : l;
        long j4 = (i & 512) != 0 ? contact.k : j;
        long j5 = (i & 1024) != 0 ? contact.l : j2;
        LastSeenStatus lastSeenStatus = contact.m;
        boolean z3 = contact.n;
        boolean z4 = contact.o;
        String str9 = contact.p;
        contact.getClass();
        return new Contact(j3, str5, str4, str6, str7, z2, imageList, str8, l2, j4, j5, lastSeenStatus, z3, z4, str9);
    }

    public final Long Ab() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return UserSex.UNKNOWN;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final boolean C6() {
        return false;
    }

    @Override // xsna.qtd0
    public final ImageList C8() {
        return this.h;
    }

    @Override // xsna.qtd0
    public final ImageStatus E5() {
        return null;
    }

    @Override // xsna.qtd0
    public final String H5(UserNameCase userNameCase) {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean H7() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean K6() {
        return false;
    }

    @Override // xsna.qtd0
    public final String La() {
        return (String) this.q.getValue();
    }

    @Override // xsna.qtd0
    public final boolean N0() {
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.i0(this.h);
        serializer.j0(this.i);
        serializer.b0(this.j);
        serializer.Y(this.k);
        serializer.Y(this.l);
        serializer.S(this.m.h());
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.j0(this.p);
    }

    @Override // xsna.qtd0
    public final String P5(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Q2(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Ra() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean W1() {
        return true;
    }

    @Override // xsna.qtd0
    public final String c5() {
        return this.d;
    }

    @Override // xsna.qtd0
    public final String d6(UserNameCase userNameCase) {
        return name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return this.b == contact.b && epx.f(this.c, contact.c) && epx.f(this.d, contact.d) && epx.f(this.e, contact.e) && epx.f(this.f, contact.f) && this.g == contact.g && epx.f(this.h, contact.h) && epx.f(this.i, contact.i) && epx.f(this.j, contact.j) && this.k == contact.k && this.l == contact.l && this.m == contact.m && this.n == contact.n && this.o == contact.o && epx.f(this.p, contact.p);
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final String h8() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final String ha() {
        return I9(UserNameCase.NOM);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h.b), 31, this.i);
        Long l = this.j;
        int b = qoy.b(qoy.b((this.m.hashCode() + bh10.a(bh10.a((a2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o);
        String str = this.p;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.qtd0
    public final boolean ib() {
        return this.p != null && this.o;
    }

    @Override // xsna.qtd0
    public final long id() {
        return this.b;
    }

    @Override // xsna.qtd0
    public final boolean ja() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean k5() {
        return this.g;
    }

    @Override // xsna.qtd0
    public final boolean ka() {
        return false;
    }

    @Override // xsna.qtd0
    public final String m2() {
        return "";
    }

    @Override // xsna.qtd0
    public final OnlineInfo mb() {
        return VisibleStatus.f;
    }

    @Override // xsna.qtd0
    public final String n6() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean n9() {
        return false;
    }

    @Override // xsna.qtd0
    public final String name() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final boolean r5() {
        return true;
    }

    @Override // xsna.qtd0
    public final long r8() {
        return B7().b;
    }

    @Override // xsna.qtd0
    public final boolean t6() {
        return false;
    }

    @Override // xsna.qtd0
    public final Peer.Type t8() {
        return Peer.Type.CONTACT;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", phone=");
        sb.append(this.d);
        sb.append(", localName=");
        sb.append(this.e);
        sb.append(", localPhone=");
        sb.append(this.f);
        sb.append(", isNew=");
        sb.append(this.g);
        sb.append(", avatar=");
        sb.append(this.h);
        sb.append(", androidId=");
        sb.append(this.i);
        sb.append(", userId=");
        sb.append(this.j);
        sb.append(", syncTime=");
        sb.append(this.k);
        sb.append(", importTime=");
        sb.append(this.l);
        sb.append(", lastSeenStatus=");
        sb.append(this.m);
        sb.append(", canWrite=");
        sb.append(this.n);
        sb.append(", canCall=");
        sb.append(this.o);
        sb.append(", callsId=");
        return ho8.a(sb, this.p, ')');
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return Long.valueOf(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Contact(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, r0, r9, r10, r11, r13, r18 == null ? LastSeenStatus.LONG_AGO : r18, serializer.m(), serializer.m(), serializer.H());
        LastSeenStatus lastSeenStatus;
        long w = serializer.w();
        String H = serializer.H();
        String H2 = serializer.H();
        String H3 = serializer.H();
        String H4 = serializer.H();
        boolean m = serializer.m();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        String H5 = serializer.H();
        Long x = serializer.x();
        long w2 = serializer.w();
        long w3 = serializer.w();
        LastSeenStatus.a aVar = LastSeenStatus.Companion;
        int u = serializer.u();
        aVar.getClass();
        LastSeenStatus[] values = LastSeenStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lastSeenStatus = null;
                break;
            }
            lastSeenStatus = values[i];
            int i2 = length;
            if (lastSeenStatus.h() == u) {
                break;
            }
            i++;
            length = i2;
        }
    }
}

package com.vk.voip.ui.sessionrooms;

import defpackage.q0;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: SessionRoomsState.kt */
/* loaded from: classes11.dex */
public final class f {
    public final a a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* compiled from: SessionRoomsState.kt */
    public interface a {

        /* compiled from: SessionRoomsState.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.f$a$a, reason: collision with other inner class name */
        public static final class C2082a implements a {
            public static final C2082a a = new C2082a();

            @Override // com.vk.voip.ui.sessionrooms.f.a
            public final SessionRoomId getId() {
                return SessionRoomId.MainCall.INSTANCE;
            }
        }

        /* compiled from: SessionRoomsState.kt */
        /* loaded from: classes7.dex */
        public static final class b implements a {
            public final SessionRoomId.Room a;
            public final String b;
            public final boolean c;
            public final int d;

            public b(SessionRoomId.Room room, String str, boolean z, int i) {
                this.a = room;
                this.b = str;
                this.c = z;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            @Override // com.vk.voip.ui.sessionrooms.f.a
            public final SessionRoomId getId() {
                return this.a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Room(id=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", isActive=");
                sb.append(this.c);
                sb.append(", participantCount=");
                return vu5.b(sb, this.d, ')');
            }
        }

        SessionRoomId getId();
    }

    public f(a.b bVar, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5, int i) {
        a aVar = (i & 1) != 0 ? a.C2082a.a : bVar;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        boolean z6 = (i & 8) == 0;
        boolean z7 = (i & 16) == 0;
        num = (i & 32) != 0 ? null : num;
        z3 = (i & 64) != 0 ? false : z3;
        z5 = (i & 256) != 0 ? false : z5;
        this.a = aVar;
        this.b = z;
        this.c = z2;
        this.d = z6;
        this.e = z7;
        this.f = num;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && epx.f(this.f, fVar.f) && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.i) + qoy.b(qoy.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomsState(activeRoom=");
        sb.append(this.a);
        sb.append(", isJoinButtonVisible=");
        sb.append(this.b);
        sb.append(", isJoinButtonEnabled=");
        sb.append(this.c);
        sb.append(", isLeaveButtonVisible=");
        sb.append(this.d);
        sb.append(", isAssistanceRequestButtonVisible=");
        sb.append(this.e);
        sb.append(", configureRoomsActionTitle=");
        sb.append(this.f);
        sb.append(", isConfigureHighlighted=");
        sb.append(this.g);
        sb.append(", isMeAdmin=");
        sb.append(this.h);
        sb.append(", isSendMessageToAllRoomsVisible=");
        return q0.a(sb, this.i, ')');
    }
}

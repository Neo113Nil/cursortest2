package com.vk.voip.ui.sessionrooms;

import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.sessionrooms.f;
import defpackage.q0;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.s3q0;
import xsna.uf3;

/* compiled from: SessionRoomsEvent.kt */
/* loaded from: classes7.dex */
public interface e {

    /* compiled from: SessionRoomsEvent.kt */
    public interface a extends e {

        /* compiled from: SessionRoomsEvent.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.e$a$a, reason: collision with other inner class name */
        public static final class C2078a implements a {
            public final String a;
            public final f.a.b b;
            public final boolean c;

            public C2078a(String str, f.a.b bVar, boolean z) {
                this.a = str;
                this.b = bVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2078a)) {
                    return false;
                }
                C2078a c2078a = (C2078a) obj;
                return epx.f(this.a, c2078a.a) && epx.f(this.b, c2078a.b) && this.c == c2078a.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AssistanceRequested(participantName=");
                sb.append(this.a);
                sb.append(", room=");
                sb.append(this.b);
                sb.append(", isCurrentRoom=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class c implements a {
            public final gzs<s3q0> a;

            public c(gzs<s3q0> gzsVar) {
                this.a = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return uf3.d(new StringBuilder("CountdownTimerEnded(onCloseRooms="), this.a, ')');
            }
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class d implements a {
            public static final d a = new d();
        }

        /* compiled from: SessionRoomsEvent.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.e$a$e, reason: collision with other inner class name */
        public static final class C2079e implements a {
            public static final C2079e a = new C2079e();
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class f implements a {
            public static final f a = new f();
        }
    }

    /* compiled from: SessionRoomsEvent.kt */
    public interface b extends e {

        /* compiled from: SessionRoomsEvent.kt */
        public static final class a implements b {
            public final boolean a;
            public final RecordType b;

            public a(boolean z, RecordType recordType) {
                this.a = z;
                this.b = recordType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "OnSessionRoomsClosed(isShowClosedDialog=" + this.a + ", recordType=" + this.b + ')';
            }
        }
    }

    /* compiled from: SessionRoomsEvent.kt */
    public interface c extends e {

        /* compiled from: SessionRoomsEvent.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: SessionRoomsEvent.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.e$c$c, reason: collision with other inner class name */
        public static final class C2080c implements c {
            public static final C2080c a = new C2080c();
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class d implements c {
            public static final d a = new d();
        }

        /* compiled from: SessionRoomsEvent.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.e$c$e, reason: collision with other inner class name */
        public static final class C2081e implements c {
            public static final C2081e a = new C2081e();
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class f implements c {
            public final String a;

            public f(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ParticipantMovedToRoom(name="), this.a, ')');
            }
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class g implements c {
            public final SessionRoomId.Room a;
            public final String b;

            public g(SessionRoomId.Room room, String str) {
                this.a = room;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RoomJoined(roomId=");
                sb.append(this.a);
                sb.append(", name=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: SessionRoomsEvent.kt */
        public static final class h implements c {
            public final String a;

            public h(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShowAdminMessage(text="), this.a, ')');
            }
        }
    }

    /* compiled from: SessionRoomsEvent.kt */
    public interface d extends e {

        /* compiled from: SessionRoomsEvent.kt */
        public static final class a implements d {
            public static final a a = new a();
        }
    }
}

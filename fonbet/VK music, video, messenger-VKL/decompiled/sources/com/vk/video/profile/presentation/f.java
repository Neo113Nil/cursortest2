package com.vk.video.profile.presentation;

import com.vk.channelrestrictions.WarningNotification;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.gp;
import xsna.u490;
import xsna.xl50;

/* compiled from: VideoProfilePatch.kt */
/* loaded from: classes6.dex */
public abstract class f implements xl50 {

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class a extends f {

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$a$a, reason: collision with other inner class name */
        public static final class C1958a extends a {
            public static final C1958a b = new C1958a();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "DescriptionChangeError(description=null)";
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class b extends f {

        /* compiled from: VideoProfilePatch.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$b$b, reason: collision with other inner class name */
        public static final class C1959b extends b {
            public static final C1959b b = new C1959b();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class c extends f {

        /* compiled from: VideoProfilePatch.kt */
        public static final class a extends c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Description(description=null)";
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class b extends c {
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static final class d extends f {
        public static final d b = new d();
    }

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class e extends f {

        /* compiled from: VideoProfilePatch.kt */
        public static final class a extends e {
            public final Throwable b;
            public final UserId c;

            public a(Throwable th, UserId userId) {
                this.b = th;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(throwable=");
                sb.append(this.b);
                sb.append(", id=");
                return gp.b(sb, this.c, ')');
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class b extends e {
            public static final b b = new b();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class c extends e {
            public final List<u490> b;
            public final u490 c;

            public c(List<u490> list, u490 u490Var) {
                this.b = list;
                this.c = u490Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Success(pickerProfiles=" + this.b + ", currentOwnerData=" + this.c + ')';
            }
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    /* renamed from: com.vk.video.profile.presentation.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC1960f extends f {

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$f$a */
        public static final class a extends AbstractC1960f {
            public static final a b = new a();
        }

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$f$b */
        public static final class b extends AbstractC1960f {
            public static final b b = new b();
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class g extends f {

        /* compiled from: VideoProfilePatch.kt */
        public static final class a extends g {
            public final Throwable b;
            public final UserId c;

            public a(Throwable th, UserId userId) {
                this.b = th;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(throwable=");
                sb.append(this.b);
                sb.append(", id=");
                return gp.b(sb, this.c, ')');
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class b extends g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1634035951;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class c extends g {
            public final List<u490> b;
            public final u490 c;

            public c(List<u490> list, u490 u490Var) {
                this.b = list;
                this.c = u490Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Success(pickerProfiles=" + this.b + ", currentOwnerData=" + this.c + ')';
            }
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static abstract class h extends f {

        /* compiled from: VideoProfilePatch.kt */
        public static final class a extends h {
            public final VideoNotificationsStatus b;

            public a(VideoNotificationsStatus videoNotificationsStatus) {
                this.b = videoNotificationsStatus;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ChangedNotification(newTypeNotification=" + this.b + ')';
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class b extends h {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ChangedSubscribe(isSubscribed="), this.b, ')');
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class c extends h {
            public static final c b = new c();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class d extends h {
            public final VideoNotificationsStatus b;

            public d(VideoNotificationsStatus videoNotificationsStatus) {
                this.b = videoNotificationsStatus;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ErrorNotification(oldTypeNotification=" + this.b + ')';
            }
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class e extends h {
            public static final e b = new e();
        }

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$h$f, reason: collision with other inner class name */
        public static final class C1961f extends h {
            public static final C1961f b = new C1961f();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class g extends h {
            public static final g b = new g();
        }

        /* compiled from: VideoProfilePatch.kt */
        /* renamed from: com.vk.video.profile.presentation.f$h$h, reason: collision with other inner class name */
        public static final class C1962h extends h {
            public static final C1962h b = new C1962h();
        }

        /* compiled from: VideoProfilePatch.kt */
        public static final class i extends h {
            public static final i b = new i();
        }
    }

    /* compiled from: VideoProfilePatch.kt */
    public static final class i extends f {
        public static final i b = new i();
    }

    /* compiled from: VideoProfilePatch.kt */
    public static final class j extends f {
        public final WarningNotification b;

        public j(WarningNotification warningNotification) {
            this.b = warningNotification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WarningModalShown(warningNotification=" + this.b + ')';
        }
    }
}

package com.vk.newsfeed.impl.posting.settings.mvi;

import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.vu5;

/* compiled from: PostingSettingsAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: PostingSettingsAction.kt */
    /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.a$a, reason: collision with other inner class name */
    public static final class C1386a extends a {
        public final String b;
        public final String c;
        public final boolean d;

        public C1386a(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1386a)) {
                return false;
            }
            C1386a c1386a = (C1386a) obj;
            return epx.f(this.b, c1386a.b) && epx.f(this.c, c1386a.c) && this.d == c1386a.d;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAdvertisingOrd(predIdAdvertising=");
            sb.append(this.b);
            sb.append(", erId=");
            sb.append(this.c);
            sb.append(", isAddAdvertisingOrd=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static abstract class h extends a {

        /* compiled from: PostingSettingsAction.kt */
        /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.a$h$a, reason: collision with other inner class name */
        public static final class C1387a extends h {
            public static final C1387a b = new C1387a();
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class b extends h {
            public static final b b = new b();
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static abstract class i extends a {

        /* compiled from: PostingSettingsAction.kt */
        /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.a$i$a, reason: collision with other inner class name */
        public static final class C1388a extends i {
            public final long b;

            public C1388a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1388a) && this.b == ((C1388a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Changed(newTimestamp="));
            }
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class b extends i {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Click(anchorViewPosition="), this.b, ')');
            }
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class c extends i {
            public static final c b = new c();
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class d extends i {
            public static final d b = new d();
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class j extends a {
        public static final j b = new j();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static abstract class k extends a {

        /* compiled from: PostingSettingsAction.kt */
        /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.a$k$a, reason: collision with other inner class name */
        public static final class C1389a extends k {
            public final String b;

            public C1389a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1389a) && epx.f(this.b, ((C1389a) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Changed(newSource="), this.b, ')');
            }
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class b extends k {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Click(anchorViewPosition="), this.b, ')');
            }
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class c extends k {
            public static final c b = new c();
        }

        /* compiled from: PostingSettingsAction.kt */
        public static final class d extends k {
            public static final d b = new d();
        }
    }
}

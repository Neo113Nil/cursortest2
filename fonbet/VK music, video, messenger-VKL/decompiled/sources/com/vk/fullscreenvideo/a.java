package com.vk.fullscreenvideo;

import defpackage.q0;
import xsna.vu5;

/* compiled from: ControlClickAction.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ControlClickAction.kt */
    /* renamed from: com.vk.fullscreenvideo.a$a, reason: collision with other inner class name */
    public static final class C1070a implements a {
        public static final C1070a a = new C1070a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1070a);
        }

        public final int hashCode() {
            return 1992072201;
        }

        public final String toString() {
            return "AuthorName";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class b implements a {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("AutoPlay(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -736035384;
        }

        public final String toString() {
            return "Chevron";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public interface d extends a {

        /* compiled from: ControlClickAction.kt */
        /* renamed from: com.vk.fullscreenvideo.a$d$a, reason: collision with other inner class name */
        public static final class C1071a implements d {
            public static final C1071a a = new C1071a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1071a);
            }

            public final int hashCode() {
                return 1384917935;
            }

            public final String toString() {
                return "Bug";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static abstract class b implements d {
            public final int a;

            /* compiled from: ControlClickAction.kt */
            /* renamed from: com.vk.fullscreenvideo.a$d$b$a, reason: collision with other inner class name */
            public static final class C1072a extends b {
                public final int b;

                public C1072a(int i) {
                    super(i);
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1072a) && this.b == ((C1072a) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Comments(commentsAmount="), this.b, ')');
                }
            }

            /* compiled from: ControlClickAction.kt */
            /* renamed from: com.vk.fullscreenvideo.a$d$b$b, reason: collision with other inner class name */
            public static final class C1073b extends b {
                public final int b;

                public C1073b(int i) {
                    super(i);
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1073b) && this.b == ((C1073b) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Like(likesAmount="), this.b, ')');
                }
            }

            /* compiled from: ControlClickAction.kt */
            public static final class c extends b {
                public final int b;

                public c(int i) {
                    super(i);
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.b == ((c) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Share(repostsAmount="), this.b, ')');
                }
            }

            public b(int i) {
                this.a = i;
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1545459667;
            }

            public final String toString() {
                return "Download";
            }
        }

        /* compiled from: ControlClickAction.kt */
        /* renamed from: com.vk.fullscreenvideo.a$d$d, reason: collision with other inner class name */
        public static final class C1074d implements d {
            public static final C1074d a = new C1074d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1074d);
            }

            public final int hashCode() {
                return 1193131443;
            }

            public final String toString() {
                return "FillVideo";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class e implements d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -16894598;
            }

            public final String toString() {
                return "More";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class f implements d {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 451825116;
            }

            public final String toString() {
                return "Playlists";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class g implements d {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -16759035;
            }

            public final String toString() {
                return "Rate";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class h implements d {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1585077200;
            }

            public final String toString() {
                return "ScreenCast";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class i implements d {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1538647096;
            }

            public final String toString() {
                return "Settings";
            }
        }

        /* compiled from: ControlClickAction.kt */
        public static final class j implements d {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1285176990;
            }

            public final String toString() {
                return "WatchLater";
            }
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1951879713;
        }

        public final String toString() {
            return "InactiveAutoPlay";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 614745464;
        }

        public final String toString() {
            return "Similar";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1312359815;
        }

        public final String toString() {
            return "SimilarShown";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class h implements a {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 904633751;
        }

        public final String toString() {
            return "Subscribe";
        }
    }

    /* compiled from: ControlClickAction.kt */
    public static final class i implements a {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -315748059;
        }

        public final String toString() {
            return "Title";
        }
    }
}

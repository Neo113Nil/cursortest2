package com.vk.stickers.keyboard;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: StickersKeyboardContext.kt */
/* loaded from: classes6.dex */
public abstract class b {

    /* compiled from: StickersKeyboardContext.kt */
    public static final class a extends b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1863174709;
        }

        public final String toString() {
            return "Comments";
        }
    }

    /* compiled from: StickersKeyboardContext.kt */
    /* renamed from: com.vk.stickers.keyboard.b$b, reason: collision with other inner class name */
    public static final class C1795b extends b {
        public static final C1795b a = new C1795b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1795b);
        }

        public final int hashCode() {
            return -1341647658;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: StickersKeyboardContext.kt */
    public static abstract class c extends b {

        /* compiled from: StickersKeyboardContext.kt */
        public static abstract class a extends c {
            public final UserId a;

            /* compiled from: StickersKeyboardContext.kt */
            /* renamed from: com.vk.stickers.keyboard.b$c$a$a, reason: collision with other inner class name */
            public static final class C1796a extends a {
            }

            /* compiled from: StickersKeyboardContext.kt */
            /* renamed from: com.vk.stickers.keyboard.b$c$a$b, reason: collision with other inner class name */
            public static final class C1797b extends a {
                public final UserId b;

                public C1797b(UserId userId) {
                    super(userId);
                    this.b = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1797b) && epx.f(this.b, ((C1797b) obj).b);
                }

                public final int hashCode() {
                    return Long.hashCode(this.b.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("WithGroup(groupId="), this.b, ')');
                }
            }

            /* compiled from: StickersKeyboardContext.kt */
            /* renamed from: com.vk.stickers.keyboard.b$c$a$c, reason: collision with other inner class name */
            public static final class C1798c extends a {
                public final UserId b;

                public C1798c(UserId userId) {
                    super(userId);
                    this.b = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1798c) && epx.f(this.b, ((C1798c) obj).b);
                }

                public final int hashCode() {
                    return Long.hashCode(this.b.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("WithUser(userId="), this.b, ')');
                }
            }

            public a(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: StickersKeyboardContext.kt */
        /* renamed from: com.vk.stickers.keyboard.b$c$b, reason: collision with other inner class name */
        public static final class C1799b extends c {
            public static final C1799b a = new C1799b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1799b);
            }

            public final int hashCode() {
                return 293683166;
            }

            public final String toString() {
                return "Undefined";
            }
        }
    }

    /* compiled from: StickersKeyboardContext.kt */
    public static abstract class d extends b {

        /* compiled from: StickersKeyboardContext.kt */
        public static final class a extends d {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Community(communityId="), this.a, ')');
            }
        }

        /* compiled from: StickersKeyboardContext.kt */
        /* renamed from: com.vk.stickers.keyboard.b$d$b, reason: collision with other inner class name */
        public static final class C1800b extends d {
            public final UserId a;

            public C1800b(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1800b) && epx.f(this.a, ((C1800b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("User(userId="), this.a, ')');
            }
        }
    }
}

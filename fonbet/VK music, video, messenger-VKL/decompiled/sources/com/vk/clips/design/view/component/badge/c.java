package com.vk.clips.design.view.component.badge;

import android.util.Size;
import xsna.epx;
import xsna.rzt0;

/* compiled from: ClipBadge.kt */
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: ClipBadge.kt */
    public interface a extends c {

        /* compiled from: ClipBadge.kt */
        /* renamed from: com.vk.clips.design.view.component.badge.c$a$a, reason: collision with other inner class name */
        public static final class C0569a implements a {
            public final rzt0 a;
            public final Size b;

            public C0569a(Size size, rzt0 rzt0Var) {
                this.a = rzt0Var;
                this.b = size;
            }

            @Override // com.vk.clips.design.view.component.badge.c
            public final rzt0 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0569a)) {
                    return false;
                }
                C0569a c0569a = (C0569a) obj;
                return epx.f(this.a, c0569a.a) && epx.f(this.b, c0569a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Image(viewParams=" + this.a + ", size=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipBadge.kt */
    public interface b extends c {

        /* compiled from: ClipBadge.kt */
        public static final class a implements b {
            public final rzt0 a;

            public a(rzt0 rzt0Var) {
                this.a = rzt0Var;
            }

            @Override // com.vk.clips.design.view.component.badge.c
            public final rzt0 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Custom(viewParams=" + this.a + ')';
            }
        }

        /* compiled from: ClipBadge.kt */
        /* renamed from: com.vk.clips.design.view.component.badge.c$b$b, reason: collision with other inner class name */
        public static final class C0570b implements b {
            @Override // com.vk.clips.design.view.component.badge.c
            public final rzt0 a() {
                return null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0570b)) {
                    return false;
                }
                ((C0570b) obj).getClass();
                throw null;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }
    }

    rzt0 a();
}

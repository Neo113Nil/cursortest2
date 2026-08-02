package com.vk.im.ui.components.msg_search.domain.model;

import com.vk.im.engine.models.dialogs.Dialog;
import defpackage.q0;
import xsna.epx;
import xsna.gyh0;
import xsna.q2a0;
import xsna.qtd0;

/* compiled from: PeersSearchBlockItem.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: PeersSearchBlockItem.kt */
    /* renamed from: com.vk.im.ui.components.msg_search.domain.model.a$a, reason: collision with other inner class name */
    public static final class C1152a extends a {
        public final gyh0<q2a0> a;

        public C1152a(gyh0<q2a0> gyh0Var) {
            this.a = gyh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1152a) && epx.f(this.a, ((C1152a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ContactNoVkBlockItem(contactSearchResult=" + this.a + ')';
        }
    }

    /* compiled from: PeersSearchBlockItem.kt */
    public static abstract class b extends a {

        /* compiled from: PeersSearchBlockItem.kt */
        /* renamed from: com.vk.im.ui.components.msg_search.domain.model.a$b$a, reason: collision with other inner class name */
        public static final class C1153a extends b {
            public final gyh0<q2a0> a;

            public C1153a(gyh0<q2a0> gyh0Var) {
                this.a = gyh0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1153a) && epx.f(this.a, ((C1153a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ContactFromVkBlockItem(contactSearchResult=" + this.a + ')';
            }
        }

        /* compiled from: PeersSearchBlockItem.kt */
        /* renamed from: com.vk.im.ui.components.msg_search.domain.model.a$b$b, reason: collision with other inner class name */
        public static final class C1154b extends b {
            public final gyh0<Dialog> a;
            public final boolean b;

            public C1154b(gyh0<Dialog> gyh0Var, boolean z) {
                this.a = gyh0Var;
                this.b = z;
            }

            public static C1154b a(C1154b c1154b, gyh0 gyh0Var) {
                boolean z = c1154b.b;
                c1154b.getClass();
                return new C1154b(gyh0Var, z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1154b)) {
                    return false;
                }
                C1154b c1154b = (C1154b) obj;
                return epx.f(this.a, c1154b.a) && this.b == c1154b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DialogPeerBlockItem(dialogSearchResult=");
                sb.append(this.a);
                sb.append(", isActive=");
                return q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: PeersSearchBlockItem.kt */
    public static final class c extends a {
        public final gyh0<qtd0> a;

        public c(gyh0<qtd0> gyh0Var) {
            this.a = gyh0Var;
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
            return "GlobalSearchPeerBlockItem(profileSearchResult=" + this.a + ')';
        }
    }

    /* compiled from: PeersSearchBlockItem.kt */
    public static final class d extends a {
        public final gyh0<Dialog> a;
        public final boolean b;

        public d(gyh0<Dialog> gyh0Var, boolean z) {
            this.a = gyh0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImportantPeerBlockItem(dialogSearchResult=");
            sb.append(this.a);
            sb.append(", isActive=");
            return q0.a(sb, this.b, ')');
        }
    }
}

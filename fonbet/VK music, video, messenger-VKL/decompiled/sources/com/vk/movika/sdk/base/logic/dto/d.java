package com.vk.movika.sdk.base.logic.dto;

import com.vk.movika.sdk.base.model.o;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.gzs;
import xsna.n23;

/* loaded from: classes3.dex */
public abstract class d {

    public static abstract class a extends d {
        public final com.vk.movika.sdk.base.logic.e a;

        /* renamed from: com.vk.movika.sdk.base.logic.dto.d$a$a, reason: collision with other inner class name */
        public static final class C1299a extends a {
        }

        public static final class b extends a {
            public final com.vk.movika.sdk.base.model.f b;

            public b(com.vk.movika.sdk.base.logic.e eVar, com.vk.movika.sdk.base.model.f fVar) {
                super(eVar);
                this.b = fVar;
            }
        }

        public static final class c extends a {
            public final boolean b;
            public final gzs<String> c;

            public c(com.vk.movika.sdk.base.logic.e eVar, gzs gzsVar) {
                super(eVar);
                this.b = true;
                this.c = gzsVar;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.d$a$d, reason: collision with other inner class name */
        public static final class C1300d extends a {
        }

        public static final class e extends a {
        }

        public static final class f extends a {
            public final com.vk.movika.sdk.base.logic.e b;
            public final List<com.vk.movika.sdk.base.logic.processor.e> c;
            public final List<com.vk.movika.sdk.base.model.k> d;
            public final boolean e;

            /* JADX WARN: Multi-variable type inference failed */
            public f(com.vk.movika.sdk.base.logic.e eVar, List<? extends com.vk.movika.sdk.base.logic.processor.e> list, List<? extends com.vk.movika.sdk.base.model.k> list2, boolean z) {
                super(eVar);
                this.b = eVar;
                this.c = list;
                this.d = list2;
                this.e = z;
            }

            @Override // com.vk.movika.sdk.base.logic.dto.d.a
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e;
            }

            @Override // com.vk.movika.sdk.base.logic.dto.d.a
            public final int hashCode() {
                return Boolean.hashCode(this.e) + fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                return "Interactive(newState=" + this.b + ", appliedCommands=" + this.c + ", blames=" + this.d + ", isAuto=" + this.e + ")";
            }
        }

        public static final class g extends a {
            public final boolean b;

            public g(com.vk.movika.sdk.base.logic.e eVar, boolean z) {
                super(eVar);
                this.b = z;
            }
        }

        public static final class h extends a {
            public final boolean b;

            public h(com.vk.movika.sdk.base.logic.e eVar, boolean z) {
                super(eVar);
                this.b = z;
            }
        }

        public static final class i extends a {
            public final String b;

            public i(String str, com.vk.movika.sdk.base.logic.e eVar) {
                super(eVar);
                this.b = str;
            }
        }

        public static final class j extends a {
            public final o b;

            public j(com.vk.movika.sdk.base.logic.e eVar, o oVar) {
                super(eVar);
                this.b = oVar;
            }
        }

        public static final class k extends a {
            public final String b;

            public k(String str, com.vk.movika.sdk.base.logic.e eVar) {
                super(eVar);
                this.b = str;
            }
        }

        public static final class l extends a {
        }

        public a(com.vk.movika.sdk.base.logic.e eVar) {
            this.a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static abstract class b extends d {

        public static final class a extends b {
            public final boolean a;
            public final Long b;
            public final boolean c;

            public a(Long l, boolean z, boolean z2) {
                this.a = z;
                this.b = l;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.a) * 31;
                Long l = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Playback(isPause=");
                sb.append(this.a);
                sb.append(", time=");
                sb.append(this.b);
                sb.append(", isContainersLocked=");
                return n23.b(sb, this.c, ")");
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.d$b$b, reason: collision with other inner class name */
        public static final class C1301b extends b {
            public final boolean a;

            public C1301b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1301b) && this.a == ((C1301b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("SetLoop(isLoopEnabled=", ")", this.a);
            }
        }
    }
}

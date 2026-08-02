package com.vk.movika.sdk.base.model.actions;

import xsna.epx;
import xsna.qoy;
import xsna.xq;

/* loaded from: classes3.dex */
public interface e extends com.vk.movika.sdk.base.model.actions.a {

    public static final class a implements e {
        public final boolean a;
        public final Boolean b;

        public a(boolean z, Boolean bool) {
            this.a = z;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "Default(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }

    public static final class b implements e {
        public final String a;
        public final boolean b;
        public final Boolean c;

        public b(boolean z, Boolean bool, String str) {
            this.a = str;
            this.b = z;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return b + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Id(branchId=");
            sb.append(this.a);
            sb.append(", shouldOpenNow=");
            sb.append(this.b);
            sb.append(", isDetachContainer=");
            return xq.d(sb, this.c, ")");
        }
    }

    public static final class c implements e {
        public final boolean a;
        public final Boolean b;

        public c(boolean z, Boolean bool) {
            this.a = z;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "MaxWeight(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }

    public static final class d implements e {
        public final boolean a;
        public final Boolean b;

        public d(boolean z, Boolean bool) {
            this.a = z;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "MinWeight(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }

    /* renamed from: com.vk.movika.sdk.base.model.actions.e$e, reason: collision with other inner class name */
    public static final class C1305e implements e {
        public final boolean a;
        public final Boolean b;

        public C1305e(boolean z, Boolean bool) {
            this.a = z;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1305e)) {
                return false;
            }
            C1305e c1305e = (C1305e) obj;
            return this.a == c1305e.a && epx.f(this.b, c1305e.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "Random(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }

    public static final class f implements e {
        public final boolean a;
        public final Boolean b;

        public f(boolean z, Boolean bool) {
            this.a = z;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "WeightlessRandom(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }
}

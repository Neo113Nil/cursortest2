package com.ironsource;

import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface Ae {

    public static final class a implements Ae {
        private final C4498pe a;
        private final C4278d9 b;

        public a(C4498pe c4498pe, C4278d9 c4278d9) {
            this.a = c4498pe;
            this.b = c4278d9;
        }

        public final C4498pe a() {
            return this.a;
        }

        public final C4278d9 b() {
            return this.b;
        }

        public final C4498pe c() {
            return this.a;
        }

        public final C4278d9 d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4278d9 c4278d9 = this.b;
            return hashCode + (c4278d9 == null ? 0 : c4278d9.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public final a a(C4498pe c4498pe, C4278d9 c4278d9) {
            return new a(c4498pe, c4278d9);
        }

        public static /* synthetic */ a a(a aVar, C4498pe c4498pe, C4278d9 c4278d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4498pe = aVar.a;
            }
            if ((i & 2) != 0) {
                c4278d9 = aVar.b;
            }
            return aVar.a(c4498pe, c4278d9);
        }

        public /* synthetic */ a(C4498pe c4498pe, C4278d9 c4278d9, int i, zcl zclVar) {
            this(c4498pe, (i & 2) != 0 ? null : c4278d9);
        }
    }

    public static final class b implements Ae {
        private final C4623we a;
        private final C4278d9 b;

        public b(C4623we c4623we, C4278d9 c4278d9) {
            this.a = c4623we;
            this.b = c4278d9;
        }

        public final C4623we a() {
            return this.a;
        }

        public final C4278d9 b() {
            return this.b;
        }

        public final C4278d9 c() {
            return this.b;
        }

        public final C4623we d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4278d9 c4278d9 = this.b;
            return hashCode + (c4278d9 == null ? 0 : c4278d9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public final b a(C4623we c4623we, C4278d9 c4278d9) {
            return new b(c4623we, c4278d9);
        }

        public static /* synthetic */ b a(b bVar, C4623we c4623we, C4278d9 c4278d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4623we = bVar.a;
            }
            if ((i & 2) != 0) {
                c4278d9 = bVar.b;
            }
            return bVar.a(c4623we, c4278d9);
        }
    }
}

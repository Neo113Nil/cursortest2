package com.ironsource;

import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public abstract class Bg {

    public static final class a extends Bg {
        private final Ag a;

        public a(Ag ag) {
            super(null);
            this.a = ag;
        }

        public final Ag a() {
            return this.a;
        }

        public final Ag b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public final a a(Ag ag) {
            return new a(ag);
        }

        public static /* synthetic */ a a(a aVar, Ag ag, int i, Object obj) {
            if ((i & 1) != 0) {
                ag = aVar.a;
            }
            return aVar.a(ag);
        }
    }

    public static final class b extends Bg {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ Bg(zcl zclVar) {
        this();
    }

    private Bg() {
    }
}

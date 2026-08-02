package com.ironsource;

import xsna.epx;
import xsna.zr;

/* loaded from: classes13.dex */
public interface X0 {

    public static final class a implements X0 {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
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
            return zr.a("Invalid(reason=", this.a, ")");
        }

        public final a a(String str) {
            return new a(str);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }
    }

    public static final class b implements X0 {
        public static final b a = new b();

        private b() {
        }
    }
}

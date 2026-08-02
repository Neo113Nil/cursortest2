package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface X0 {

    public static final class a implements X0 {
        private final String a;

        public a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.a = reason;
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
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Invalid(reason=" + this.a + ")";
        }

        public final a a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new a(reason);
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

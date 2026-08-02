package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface Ae {

    public static final class a implements Ae {
        private final C2602pe a;
        private final C2364c9 b;

        public a(C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
            this.b = c2364c9;
        }

        public final C2602pe a() {
            return this.a;
        }

        public final C2364c9 b() {
            return this.b;
        }

        public final C2602pe c() {
            return this.a;
        }

        public final C2364c9 d() {
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
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C2364c9 c2364c9 = this.b;
            return hashCode + (c2364c9 == null ? 0 : c2364c9.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public final a a(C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, c2364c9);
        }

        public static /* synthetic */ a a(a aVar, C2602pe c2602pe, C2364c9 c2364c9, int i, Object obj) {
            if ((i & 1) != 0) {
                c2602pe = aVar.a;
            }
            if ((i & 2) != 0) {
                c2364c9 = aVar.b;
            }
            return aVar.a(c2602pe, c2364c9);
        }

        public /* synthetic */ a(C2602pe c2602pe, C2364c9 c2364c9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c2602pe, (i & 2) != 0 ? null : c2364c9);
        }
    }

    public static final class b implements Ae {
        private final C2727we a;
        private final C2364c9 b;

        public b(C2727we sdkInitResponse, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.a = sdkInitResponse;
            this.b = c2364c9;
        }

        public final C2727we a() {
            return this.a;
        }

        public final C2364c9 b() {
            return this.b;
        }

        public final C2364c9 c() {
            return this.b;
        }

        public final C2727we d() {
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
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C2364c9 c2364c9 = this.b;
            return hashCode + (c2364c9 == null ? 0 : c2364c9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public final b a(C2727we sdkInitResponse, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c2364c9);
        }

        public static /* synthetic */ b a(b bVar, C2727we c2727we, C2364c9 c2364c9, int i, Object obj) {
            if ((i & 1) != 0) {
                c2727we = bVar.a;
            }
            if ((i & 2) != 0) {
                c2364c9 = bVar.b;
            }
            return bVar.a(c2727we, c2364c9);
        }
    }
}

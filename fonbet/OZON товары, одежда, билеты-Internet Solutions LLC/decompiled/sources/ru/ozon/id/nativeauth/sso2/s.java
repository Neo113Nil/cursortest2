package ru.ozon.id.nativeauth.sso2;

import B90.C2618u;
import C.o0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface s {

    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97465a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1650072165;
        }

        @NotNull
        public final String toString() {
            return "Logout";
        }
    }

    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IOException f97466a;

        public b(@NotNull IOException throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f97466a = throwable;
        }

        @NotNull
        public final Throwable a() {
            return this.f97466a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f97466a.equals(((b) obj).f97466a);
        }

        public final int hashCode() {
            return this.f97466a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "NetworkFail(throwable=" + this.f97466a + ")";
        }
    }

    public static final class c implements s {

        /* renamed from: a, reason: collision with root package name */
        private final String f97467a;

        public c(String str) {
            this.f97467a = str;
        }

        public final String a() {
            return this.f97467a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f97467a, ((c) obj).f97467a);
        }

        public final int hashCode() {
            String str = this.f97467a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ServerFail(traceId="), this.f97467a, ")");
        }
    }

    public static final class d implements s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<u> f97468a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull List<? extends u> resultOfDomains) {
            Intrinsics.checkNotNullParameter(resultOfDomains, "resultOfDomains");
            this.f97468a = resultOfDomains;
        }

        @NotNull
        public final List<u> a() {
            return this.f97468a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f97468a, ((d) obj).f97468a);
        }

        public final int hashCode() {
            return this.f97468a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("SuccessCall(resultOfDomains="), this.f97468a, ")");
        }
    }
}

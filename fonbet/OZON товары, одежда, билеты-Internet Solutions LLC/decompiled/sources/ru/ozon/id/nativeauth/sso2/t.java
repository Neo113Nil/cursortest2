package ru.ozon.id.nativeauth.sso2;

import C.o0;
import We.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface t {

    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97469a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 438925052;
        }

        @NotNull
        public final String toString() {
            return "LoginOrSwitchUser";
        }
    }

    public static final class b implements t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f97470a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2037799247;
        }

        @NotNull
        public final String toString() {
            return "OnAppStart";
        }
    }

    public interface c extends t {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97471a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final G f97472b;

            public a(@NotNull G request, @NotNull String domain) {
                Intrinsics.checkNotNullParameter(domain, "domain");
                Intrinsics.checkNotNullParameter(request, "request");
                this.f97471a = domain;
                this.f97472b = request;
            }

            @Override // ru.ozon.id.nativeauth.sso2.t.c
            @NotNull
            public final String a() {
                return this.f97471a;
            }

            @NotNull
            public final G b() {
                return this.f97472b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f97471a, aVar.f97471a) && Intrinsics.d(this.f97472b, aVar.f97472b);
            }

            public final int hashCode() {
                return this.f97472b.hashCode() + (this.f97471a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "OnRequestNative(domain=" + this.f97471a + ", request=" + this.f97472b + ")";
            }
        }

        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97473a;

            public b(@NotNull String domain) {
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f97473a = domain;
            }

            @Override // ru.ozon.id.nativeauth.sso2.t.c
            @NotNull
            public final String a() {
                return this.f97473a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f97473a, ((b) obj).f97473a);
            }

            public final int hashCode() {
                return this.f97473a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("OnServerLogoutNative(domain="), this.f97473a, ")");
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.sso2.t$c$c, reason: collision with other inner class name */
        public static final class C2140c implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97474a;

            public C2140c(@NotNull String domain) {
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f97474a = domain;
            }

            @Override // ru.ozon.id.nativeauth.sso2.t.c
            @NotNull
            public final String a() {
                return this.f97474a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2140c) && Intrinsics.d(this.f97474a, ((C2140c) obj).f97474a);
            }

            public final int hashCode() {
                return this.f97474a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("OnServerLogoutNonNative(domain="), this.f97474a, ")");
            }
        }

        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97475a;

            public d(@NotNull String domain) {
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f97475a = domain;
            }

            @Override // ru.ozon.id.nativeauth.sso2.t.c
            @NotNull
            public final String a() {
                return this.f97475a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.d(this.f97475a, ((d) obj).f97475a);
            }

            public final int hashCode() {
                return this.f97475a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("OnWebViewRequest(domain="), this.f97475a, ")");
            }
        }

        @NotNull
        String a();
    }
}

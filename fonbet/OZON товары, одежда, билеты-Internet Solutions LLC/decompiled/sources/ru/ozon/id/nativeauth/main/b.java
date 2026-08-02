package ru.ozon.id.nativeauth.main;

import C.o0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97311a = new a();
    }

    /* renamed from: ru.ozon.id.nativeauth.main.b$b, reason: collision with other inner class name */
    public static final class C2136b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2136b f97312a = new C2136b();
    }

    public interface c extends b {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97313a;

            /* renamed from: b, reason: collision with root package name */
            private final String f97314b;

            public a(String incidentId, String str) {
                Intrinsics.checkNotNullParameter(incidentId, "incidentId");
                this.f97313a = incidentId;
                this.f97314b = str;
            }

            public final String a() {
                return this.f97314b;
            }

            @NotNull
            public final String b() {
                return this.f97313a;
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.main.b$c$b, reason: collision with other inner class name */
        public static class C2137b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f97315a;

            /* renamed from: b, reason: collision with root package name */
            private final String f97316b;

            /* renamed from: c, reason: collision with root package name */
            private final String f97317c;

            /* renamed from: d, reason: collision with root package name */
            private final String f97318d;

            /* renamed from: e, reason: collision with root package name */
            private final Function0<Unit> f97319e;

            /* renamed from: f, reason: collision with root package name */
            private final Function0<Unit> f97320f;

            /* renamed from: g, reason: collision with root package name */
            private final boolean f97321g;

            /* renamed from: h, reason: collision with root package name */
            private final String f97322h;

            public C2137b() {
                throw null;
            }

            public C2137b(String str, String str2, String str3, Function0 function0, String str4, int i11) {
                Integer valueOf = Integer.valueOf(R.drawable.ic_ozon_id_errors_state);
                function0 = (i11 & 16) != 0 ? null : function0;
                boolean z11 = (i11 & 64) == 0;
                str4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4;
                this.f97315a = valueOf;
                this.f97316b = str;
                this.f97317c = str2;
                this.f97318d = str3;
                this.f97319e = function0;
                this.f97320f = null;
                this.f97321g = z11;
                this.f97322h = str4;
            }

            public final Function0<Unit> a() {
                return this.f97319e;
            }

            public final String b() {
                return this.f97318d;
            }

            public final String c() {
                return this.f97317c;
            }

            public final Integer d() {
                return this.f97315a;
            }

            public final Function0<Unit> e() {
                return this.f97320f;
            }

            public final boolean f() {
                return this.f97321g;
            }

            public final String g() {
                return this.f97316b;
            }

            public final String h() {
                return this.f97322h;
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.main.b$c$c, reason: collision with other inner class name */
        public static final class C2138c implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C2138c f97323a = new C2138c();
        }

        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f97324a = new d();
        }

        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f97325a;

            public e() {
                this(null, 3);
            }

            public final String a() {
                return this.f97325a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    return Intrinsics.d(this.f97325a, ((e) obj).f97325a);
                }
                return false;
            }

            public final int hashCode() {
                String str = this.f97325a;
                return Boolean.hashCode(false) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("ServerIssue(traceId="), this.f97325a, ", isResponseEmpty=false)");
            }

            public e(String str) {
                this.f97325a = str;
            }

            public /* synthetic */ e(String str, int i11) {
                this((i11 & 1) != 0 ? null : str);
            }
        }
    }
}

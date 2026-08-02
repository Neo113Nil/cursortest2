package com.ironsource;

import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4035d7 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.d7$b */
    public static final class b implements InterfaceC4035d7 {

        @NotNull
        private final String a;

        public b(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("Success(response=", this.a, ")");
        }

        @NotNull
        public final b a(@NotNull String str) {
            str.getClass();
            return new b(str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.d7$a */
    public interface a extends InterfaceC4035d7 {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.d7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4035d7.a
            @NotNull
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4035d7.a
            public boolean b() {
                return true;
            }
        }

        @NotNull
        String a();

        boolean b();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.d7$a$a, reason: collision with other inner class name */
        public static final class C1199a implements a {

            @NotNull
            private final Exception a;

            public C1199a(@NotNull Exception exc) {
                exc.getClass();
                this.a = exc;
            }

            @Override // com.ironsource.InterfaceC4035d7.a
            @NotNull
            public String a() {
                String message = this.a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - ".concat(message);
            }

            @Override // com.ironsource.InterfaceC4035d7.a
            public boolean b() {
                return true;
            }

            @NotNull
            public final Exception c() {
                return this.a;
            }

            @NotNull
            public final Exception d() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1199a) && Intrinsics.c(this.a, ((C1199a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Exception(exception=" + this.a + ")";
            }

            public static /* synthetic */ C1199a a(C1199a c1199a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c1199a.a;
                }
                return c1199a.a(exc);
            }

            @NotNull
            public final C1199a a(@NotNull Exception exc) {
                exc.getClass();
                return new C1199a(exc);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.d7$a$b */
        public static final class b implements a {
            private final int a;

            @Nullable
            private final String b;

            public b(int i, @Nullable String str) {
                this.a = i;
                this.b = str;
            }

            @Override // com.ironsource.InterfaceC4035d7.a
            @NotNull
            public String a() {
                int i = this.a;
                String str = this.b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }

            @Override // com.ironsource.InterfaceC4035d7.a
            public boolean b() {
                return this.a != 400;
            }

            public final int c() {
                return this.a;
            }

            @Nullable
            public final String d() {
                return this.b;
            }

            public final int e() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && Intrinsics.c(this.b, bVar.b);
            }

            @Nullable
            public final String f() {
                return this.b;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return com.appsflyer.internal.i.g(this.a, "HttpError(errorCode=", ", errorMessage=", this.b, ")");
            }

            public static /* synthetic */ b a(b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.b;
                }
                return bVar.a(i, str);
            }

            @NotNull
            public final b a(int i, @Nullable String str) {
                return new b(i, str);
            }
        }
    }
}

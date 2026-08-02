package ru.ozon.android.messenger.utils;

import C.o0;
import N3.C3660k;
import T7.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class i<R> {

    public static abstract class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91946a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f91947b;

        /* renamed from: ru.ozon.android.messenger.utils.i$a$a, reason: collision with other inner class name */
        public static final class C1724a extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91948c;

            /* renamed from: d, reason: collision with root package name */
            private final Exception f91949d;

            /* JADX WARN: Multi-variable type inference failed */
            public C1724a() {
                this(3, null, 0 == true ? 1 : 0);
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            public final Throwable b() {
                return this.f91949d;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91948c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1724a)) {
                    return false;
                }
                C1724a c1724a = (C1724a) obj;
                return Intrinsics.d(this.f91948c, c1724a.f91948c) && Intrinsics.d(this.f91949d, c1724a.f91949d);
            }

            public final int hashCode() {
                int hashCode = this.f91948c.hashCode() * 31;
                Exception exc = this.f91949d;
                return hashCode + (exc == null ? 0 : exc.hashCode());
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return "ApiError(message=" + this.f91948c + ", cause=" + this.f91949d + ")";
            }

            public /* synthetic */ C1724a(int i11, Exception exc, String str) {
                this((i11 & 1) != 0 ? "Api exception or error code" : str, (i11 & 2) != 0 ? null : exc);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1724a(@NotNull String message, Exception exc) {
                super(message, exc);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f91948c = message;
                this.f91949d = exc;
            }
        }

        public static final class b extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final b f91950c = new b("Data is missing in cache", null);
        }

        public static final class c extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91951c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c() {
                super("ChatId is required", null);
                Intrinsics.checkNotNullParameter("ChatId is required", "message");
                this.f91951c = "ChatId is required";
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91951c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.d(this.f91951c, ((c) obj).f91951c);
            }

            public final int hashCode() {
                return this.f91951c.hashCode();
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("ChatNotFound(message="), this.f91951c, ")");
            }
        }

        public static final class d extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91952c;

            /* renamed from: d, reason: collision with root package name */
            private final Throwable f91953d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull String message, Throwable th2) {
                super(message, th2);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f91952c = message;
                this.f91953d = th2;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            public final Throwable b() {
                return this.f91953d;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91952c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.d(this.f91952c, dVar.f91952c) && Intrinsics.d(this.f91953d, dVar.f91953d);
            }

            public final int hashCode() {
                int hashCode = this.f91952c.hashCode() * 31;
                Throwable th2 = this.f91953d;
                return hashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return "DatabaseError(message=" + this.f91952c + ", cause=" + this.f91953d + ")";
            }
        }

        public static final class e extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91954c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f91954c = message;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            public final Throwable b() {
                return null;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91954c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    return Intrinsics.d(this.f91954c, ((e) obj).f91954c);
                }
                return false;
            }

            public final int hashCode() {
                return this.f91954c.hashCode() * 31;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("GeneralError(message="), this.f91954c, ", cause=null)");
            }
        }

        public static final class f extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(@NotNull String message, Throwable th2) {
                super(message, th2);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        public static final class g extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91955c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f91955c = message;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            public final Throwable b() {
                return null;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91955c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof g) {
                    return Intrinsics.d(this.f91955c, ((g) obj).f91955c);
                }
                return false;
            }

            public final int hashCode() {
                return this.f91955c.hashCode() * 31;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("RpcError(message="), this.f91955c, ", cause=null)");
            }
        }

        public static final class h extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91956c;

            public h() {
                this(0);
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91956c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.d(this.f91956c, ((h) obj).f91956c);
            }

            public final int hashCode() {
                return this.f91956c.hashCode();
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("SocketConnectionError(message="), this.f91956c, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(int i11) {
                super("Socket closed or canceled", null);
                Intrinsics.checkNotNullParameter("Socket closed or canceled", "message");
                this.f91956c = "Socket closed or canceled";
            }
        }

        /* renamed from: ru.ozon.android.messenger.utils.i$a$i, reason: collision with other inner class name */
        public static final class C1725i extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final C1725i f91957c = new C1725i("Timeout error", null);
        }

        public static final class j extends a {
            public j() {
                super("Unknown error", null);
            }
        }

        public static final class k extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f91958c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(@NotNull String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f91958c = message;
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String c() {
                return this.f91958c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && Intrinsics.d(this.f91958c, ((k) obj).f91958c);
            }

            public final int hashCode() {
                return this.f91958c.hashCode();
            }

            @Override // ru.ozon.android.messenger.utils.i.a
            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("UserNotificationError(message="), this.f91958c, ")");
            }
        }

        public a(String str, Throwable th2) {
            super(0);
            this.f91946a = str;
            this.f91947b = th2;
        }

        public Throwable b() {
            return this.f91947b;
        }

        @NotNull
        public String c() {
            return this.f91946a;
        }

        @NotNull
        public String toString() {
            String c11 = c();
            Throwable b11 = b();
            String localizedMessage = b11 != null ? b11.getLocalizedMessage() : null;
            Throwable b12 = b();
            StringBuilder d11 = C3660k.d("Message: ", c11, "; ", localizedMessage, ",\ncause: ");
            d11.append(b12);
            return d11.toString();
        }
    }

    public static final class b<R> extends i<R> {

        /* renamed from: a, reason: collision with root package name */
        private final R f91959a;

        public b(R r11) {
            super(0);
            this.f91959a = r11;
        }

        public final R b() {
            return this.f91959a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91959a, ((b) obj).f91959a);
        }

        public final int hashCode() {
            R r11 = this.f91959a;
            if (r11 == null) {
                return 0;
            }
            return r11.hashCode();
        }

        @NotNull
        public final String toString() {
            return E.c(this.f91959a, ")", new StringBuilder("Success(data="));
        }
    }

    public /* synthetic */ i(int i11) {
        this();
    }

    public final R a() {
        if (this instanceof b) {
            return (R) ((b) this).b();
        }
        return null;
    }

    private i() {
    }
}

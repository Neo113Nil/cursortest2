package com.ironsource;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2434g7 {

    /* renamed from: com.ironsource.g7$a */
    public interface a extends InterfaceC2434g7 {

        /* renamed from: com.ironsource.g7$a$a, reason: collision with other inner class name */
        public static final class C0209a implements a {
            private final Exception a;

            public C0209a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            public final C0209a a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C0209a(exception);
            }

            @Override // com.ironsource.InterfaceC2434g7.a
            public boolean b() {
                return true;
            }

            public final Exception c() {
                return this.a;
            }

            public final Exception d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0209a) && Intrinsics.areEqual(this.a, ((C0209a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.a + ")";
            }

            public static /* synthetic */ C0209a a(C0209a c0209a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c0209a.a;
                }
                return c0209a.a(exc);
            }

            @Override // com.ironsource.InterfaceC2434g7.a
            public String a() {
                String message = this.a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* renamed from: com.ironsource.g7$a$b */
        public static final class b implements a {
            private final int a;
            private final String b;

            public b(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final b a(int i, String str) {
                return new b(i, str);
            }

            @Override // com.ironsource.InterfaceC2434g7.a
            public boolean b() {
                return this.a != 400;
            }

            public final int c() {
                return this.a;
            }

            public final String d() {
                return this.b;
            }

            public final int e() {
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
                return this.a == bVar.a && Intrinsics.areEqual(this.b, bVar.b);
            }

            public final String f() {
                return this.b;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
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

            @Override // com.ironsource.InterfaceC2434g7.a
            public String a() {
                int i = this.a;
                String str = this.b;
                if (str == null) {
                    str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* renamed from: com.ironsource.g7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC2434g7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC2434g7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* renamed from: com.ironsource.g7$b */
    public static final class b implements InterfaceC2434g7 {
        private final String a;

        public b(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a = response;
        }

        public final b a(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }
    }
}

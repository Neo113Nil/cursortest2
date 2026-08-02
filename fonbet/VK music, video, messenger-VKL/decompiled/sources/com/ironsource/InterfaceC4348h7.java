package com.ironsource;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.epx;
import xsna.gq;
import xsna.zr;

/* renamed from: com.ironsource.h7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4348h7 {

    /* renamed from: com.ironsource.h7$a */
    public interface a extends InterfaceC4348h7 {

        /* renamed from: com.ironsource.h7$a$a, reason: collision with other inner class name */
        public static final class C0220a implements a {
            private final Exception a;

            public C0220a(Exception exc) {
                this.a = exc;
            }

            public final C0220a a(Exception exc) {
                return new C0220a(exc);
            }

            @Override // com.ironsource.InterfaceC4348h7.a
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
                return (obj instanceof C0220a) && epx.f(this.a, ((C0220a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.a + ")";
            }

            public static /* synthetic */ C0220a a(C0220a c0220a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c0220a.a;
                }
                return c0220a.a(exc);
            }

            @Override // com.ironsource.InterfaceC4348h7.a
            public String a() {
                String message = this.a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - ".concat(message);
            }
        }

        /* renamed from: com.ironsource.h7$a$b */
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

            @Override // com.ironsource.InterfaceC4348h7.a
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
                return this.a == bVar.a && epx.f(this.b, bVar.b);
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
                return gq.b(this.a, "HttpError(errorCode=", ", errorMessage=", this.b, ")");
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

            @Override // com.ironsource.InterfaceC4348h7.a
            public String a() {
                int i = this.a;
                String str = this.b;
                if (str == null) {
                    str = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                return com.vk.movika.sdk.base.model.history.b.b(i, "HTTP Error - Code: ", ", Message: ", str);
            }
        }

        /* renamed from: com.ironsource.h7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4348h7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4348h7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* renamed from: com.ironsource.h7$b */
    public static final class b implements InterfaceC4348h7 {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        public final b a(String str) {
            return new b(str);
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
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return zr.a("Success(response=", this.a, ")");
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }
    }
}

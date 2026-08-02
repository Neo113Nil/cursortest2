package og;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: og.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC8733a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f78319a = 0;

    /* renamed from: og.a$a, reason: collision with other inner class name */
    public static final class C1328a extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1328a f78320b = new C1328a(0);
    }

    /* renamed from: og.a$b */
    public static final class b extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f78321b = new b(0);
    }

    /* renamed from: og.a$c */
    public static final class c extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f78322b = new c(0);
    }

    /* renamed from: og.a$d */
    public static final class d {
        public static e a(int i11, Exception exc) {
            int i12 = AbstractC8733a.f78319a;
            String str = (i11 & 1) != 0 ? null : "Failed to bind remote service.";
            if ((i11 & 2) != 0) {
                exc = null;
            }
            return new e(str, exc);
        }
    }

    /* renamed from: og.a$e */
    public static final class e extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        private final String f78323b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f78324c;

        public e(String str, Throwable th2) {
            super(0);
            this.f78323b = str;
            this.f78324c = th2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.d(this.f78323b, eVar.f78323b) && Intrinsics.d(this.f78324c, eVar.f78324c);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f78324c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f78323b;
        }

        public final int hashCode() {
            String str = this.f78323b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Throwable th2 = this.f78324c;
            return hashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String toString() {
            return "InternalError(message=" + this.f78323b + ", cause=" + this.f78324c + ")";
        }
    }

    /* renamed from: og.a$f */
    public static final class f extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        private final String f78325b;

        public f() {
            super(0);
            this.f78325b = "Failed to validate Merchant token.";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return Intrinsics.d(this.f78325b, ((f) obj).f78325b);
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f78325b;
        }

        public final int hashCode() {
            String str = this.f78325b;
            return (str == null ? 0 : str.hashCode()) * 31;
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("InvalidMerchantData(message="), this.f78325b, ", cause=null)");
        }
    }

    /* renamed from: og.a$g */
    public static final class g extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f78326b = new g(0);
    }

    /* renamed from: og.a$h */
    public static final class h extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f78327b = new h(0);
    }

    /* renamed from: og.a$i */
    public static final class i extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f78328b = new i(0);
    }

    /* renamed from: og.a$j */
    public static final class j extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f78329b = new j(0);
    }

    /* renamed from: og.a$k */
    public static final class k extends AbstractC8733a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f78330b = new k(0);
    }

    public AbstractC8733a(int i11) {
    }
}

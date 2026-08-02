package Q5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1510a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9362a;

    /* renamed from: Q5.a$a, reason: collision with other inner class name */
    public static final class C0181a extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0181a f9363b = new C0181a();

        public C0181a() {
            super("https://ingress.ap1.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0181a);
        }

        public int hashCode() {
            return -263348459;
        }

        public String toString() {
            return "AP1";
        }
    }

    /* renamed from: Q5.a$b */
    public static final class b extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f9364b = new b();

        public b() {
            super("https://ingress.ap2.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -263348458;
        }

        public String toString() {
            return "AP2";
        }
    }

    /* renamed from: Q5.a$c */
    public static final class c extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final c f9365b = new c();

        public c() {
            super("https://ingress.ap3.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -263348457;
        }

        public String toString() {
            return "AP3";
        }
    }

    /* renamed from: Q5.a$d */
    public static final class d extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final d f9366b = new d();

        public d() {
            super("https://ingress.eu1.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -263344460;
        }

        public String toString() {
            return "EU1";
        }
    }

    /* renamed from: Q5.a$e */
    public static final class e extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final e f9367b = new e();

        public e() {
            super("https://ingress.eu2.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -263344459;
        }

        public String toString() {
            return "EU2";
        }
    }

    /* renamed from: Q5.a$f */
    public static final class f extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final f f9368b = new f();

        public f() {
            super("https://ingress.staging.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -2087423026;
        }

        public String toString() {
            return "STAGING";
        }
    }

    /* renamed from: Q5.a$g */
    public static final class g extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final g f9369b = new g();

        public g() {
            super("https://ingress.us1.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -263329146;
        }

        public String toString() {
            return "US1";
        }
    }

    /* renamed from: Q5.a$h */
    public static final class h extends AbstractC1510a {

        /* renamed from: b, reason: collision with root package name */
        public static final h f9370b = new h();

        public h() {
            super("https://ingress.us2.rum-ingress-coralogix.com", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -263329145;
        }

        public String toString() {
            return "US2";
        }
    }

    public /* synthetic */ AbstractC1510a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f9362a;
    }

    public AbstractC1510a(String str) {
        this.f9362a = str;
    }
}

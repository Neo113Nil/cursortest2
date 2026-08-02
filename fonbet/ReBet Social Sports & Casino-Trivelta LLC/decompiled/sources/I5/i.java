package I5;

import Q5.m;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5419a = b.f5421a;

    public static final class a implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5420b = new a();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return 1936599656;
        }

        public String toString() {
            return "Anr";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f5421a = new b();

        public final List a() {
            return CollectionsKt.listOf((Object[]) new i[]{f.f5424b, j.f5428b, e.f5423b, k.f5429b, c.f5422b, C0116i.f5427b, a.f5420b, g.f5425b, h.f5426b, m.f5431b, l.f5430b});
        }
    }

    public static final class c implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5422b = new c();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -991467506;
        }

        public String toString() {
            return "Custom";
        }
    }

    public static final class d {
        public static String a(i iVar) {
            String simpleName = Reflection.getOrCreateKotlinClass(iVar.getClass()).getSimpleName();
            return simpleName == null ? "Unknown" : simpleName;
        }

        public static Q5.m b(i iVar) {
            if (Intrinsics.areEqual(iVar, e.f5423b)) {
                return m.c.f9443b;
            }
            if (Intrinsics.areEqual(iVar, k.f5429b)) {
                return m.f.f9446b;
            }
            if (Intrinsics.areEqual(iVar, c.f5422b)) {
                return m.b.f9442b;
            }
            if (Intrinsics.areEqual(iVar, C0116i.f5427b)) {
                return m.e.f9445b;
            }
            if (Intrinsics.areEqual(iVar, a.f5420b)) {
                return m.a.f9441b;
            }
            if (Intrinsics.areEqual(iVar, g.f5425b)) {
                return m.d.f9444b;
            }
            if (Intrinsics.areEqual(iVar, m.f5431b)) {
                return m.g.f9447b;
            }
            return null;
        }
    }

    public static final class e implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5423b = new e();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return 1355247051;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class f implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final f f5424b = new f();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return 646705178;
        }

        public String toString() {
            return "Internal";
        }
    }

    public static final class g implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final g f5425b = new g();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return 2062805421;
        }

        public String toString() {
            return "Lifecycle";
        }
    }

    public static final class h implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final h f5426b = new h();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -961259201;
        }

        public String toString() {
            return "Measurement";
        }
    }

    /* renamed from: I5.i$i, reason: collision with other inner class name */
    public static final class C0116i implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final C0116i f5427b = new C0116i();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0116i);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -1711480826;
        }

        public String toString() {
            return "MobileVitals";
        }
    }

    public static final class j implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final j f5428b = new j();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -2127736783;
        }

        public String toString() {
            return "Navigation";
        }
    }

    public static final class k implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final k f5429b = new k();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return 44831025;
        }

        public String toString() {
            return "Network";
        }
    }

    public static final class l implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final l f5430b = new l();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -111883389;
        }

        public String toString() {
            return "Screenshot";
        }
    }

    public static final class m implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final m f5431b = new m();

        @Override // I5.i
        public Q5.m a() {
            return d.b(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        @Override // I5.i
        public String getName() {
            return d.a(this);
        }

        public int hashCode() {
            return -1292119734;
        }

        public String toString() {
            return "UserInteraction";
        }
    }

    Q5.m a();

    String getName();
}

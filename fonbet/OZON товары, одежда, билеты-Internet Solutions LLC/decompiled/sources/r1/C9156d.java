package r1;

import B0.C2454a;
import C.o0;
import Sc.C;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9156d {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f82683k = new b();

    /* renamed from: l, reason: collision with root package name */
    private static int f82684l;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82685a;

    /* renamed from: b, reason: collision with root package name */
    private final float f82686b;

    /* renamed from: c, reason: collision with root package name */
    private final float f82687c;

    /* renamed from: d, reason: collision with root package name */
    private final float f82688d;

    /* renamed from: e, reason: collision with root package name */
    private final float f82689e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l f82690f;

    /* renamed from: g, reason: collision with root package name */
    private final long f82691g;

    /* renamed from: h, reason: collision with root package name */
    private final int f82692h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f82693i;

    /* renamed from: j, reason: collision with root package name */
    private final int f82694j;

    /* renamed from: r1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f82695a;

        /* renamed from: b, reason: collision with root package name */
        private final float f82696b;

        /* renamed from: c, reason: collision with root package name */
        private final float f82697c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82698d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82699e;

        /* renamed from: f, reason: collision with root package name */
        private final long f82700f;

        /* renamed from: g, reason: collision with root package name */
        private final int f82701g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f82702h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final ArrayList<C1407a> f82703i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private C1407a f82704j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f82705k;

        /* renamed from: r1.d$a$a, reason: collision with other inner class name */
        private static final class C1407a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private String f82706a;

            /* renamed from: b, reason: collision with root package name */
            private float f82707b;

            /* renamed from: c, reason: collision with root package name */
            private float f82708c;

            /* renamed from: d, reason: collision with root package name */
            private float f82709d;

            /* renamed from: e, reason: collision with root package name */
            private float f82710e;

            /* renamed from: f, reason: collision with root package name */
            private float f82711f;

            /* renamed from: g, reason: collision with root package name */
            private float f82712g;

            /* renamed from: h, reason: collision with root package name */
            private float f82713h;

            /* renamed from: i, reason: collision with root package name */
            @NotNull
            private List<? extends g> f82714i;

            /* renamed from: j, reason: collision with root package name */
            @NotNull
            private ArrayList f82715j;

            public C1407a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            @NotNull
            public final List<n> a() {
                return this.f82715j;
            }

            @NotNull
            public final List<g> b() {
                return this.f82714i;
            }

            @NotNull
            public final String c() {
                return this.f82706a;
            }

            public final float d() {
                return this.f82708c;
            }

            public final float e() {
                return this.f82709d;
            }

            public final float f() {
                return this.f82707b;
            }

            public final float g() {
                return this.f82710e;
            }

            public final float h() {
                return this.f82711f;
            }

            public final float i() {
                return this.f82712g;
            }

            public final float j() {
                return this.f82713h;
            }

            public C1407a(String str, float f7, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i11) {
                str = (i11 & 1) != 0 ? "" : str;
                f7 = (i11 & 2) != 0 ? 0.0f : f7;
                f11 = (i11 & 4) != 0 ? 0.0f : f11;
                f12 = (i11 & 8) != 0 ? 0.0f : f12;
                f13 = (i11 & 16) != 0 ? 1.0f : f13;
                f14 = (i11 & 32) != 0 ? 1.0f : f14;
                f15 = (i11 & 64) != 0 ? 0.0f : f15;
                f16 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0f : f16;
                list = (i11 & 256) != 0 ? m.a() : list;
                ArrayList arrayList = new ArrayList();
                this.f82706a = str;
                this.f82707b = f7;
                this.f82708c = f11;
                this.f82709d = f12;
                this.f82710e = f13;
                this.f82711f = f14;
                this.f82712g = f15;
                this.f82713h = f16;
                this.f82714i = list;
                this.f82715j = arrayList;
            }
        }

        public a(String str, float f7, float f11, float f12, float f13, long j11, int i11, boolean z11, int i12) {
            str = (i12 & 1) != 0 ? "" : str;
            long j12 = (i12 & 32) != 0 ? C7807Z.f72259m : j11;
            int i13 = (i12 & 64) != 0 ? 5 : i11;
            boolean z12 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11;
            this.f82695a = str;
            this.f82696b = f7;
            this.f82697c = f11;
            this.f82698d = f12;
            this.f82699e = f13;
            this.f82700f = j12;
            this.f82701g = i13;
            this.f82702h = z12;
            ArrayList<C1407a> arrayList = new ArrayList<>();
            this.f82703i = arrayList;
            C1407a c1407a = new C1407a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.f82704j = c1407a;
            arrayList.add(c1407a);
        }

        private static l d(C1407a c1407a) {
            return new l(c1407a.c(), c1407a.f(), c1407a.d(), c1407a.e(), c1407a.g(), c1407a.h(), c1407a.i(), c1407a.j(), c1407a.b(), c1407a.a());
        }

        @NotNull
        public final void a(@NotNull String str, float f7, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List list) {
            if (this.f82705k) {
                A1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            this.f82703i.add(new C1407a(str, f7, f11, f12, f13, f14, f15, f16, list, UserVerificationMethods.USER_VERIFY_NONE));
        }

        @NotNull
        public final void b(float f7, float f11, float f12, float f13, float f14, float f15, float f16, int i11, int i12, int i13, @NotNull String str, @NotNull List list, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2) {
            if (this.f82705k) {
                A1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            ((ArrayList) ((C1407a) o0.b(1, this.f82703i)).a()).add(new p(f7, f11, f12, f13, f14, f15, f16, i11, i12, i13, str, list, abstractC7799Q, abstractC7799Q2));
        }

        @NotNull
        public final C9156d e() {
            if (this.f82705k) {
                A1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            while (this.f82703i.size() > 1) {
                f();
            }
            C9156d c9156d = new C9156d(this.f82695a, this.f82696b, this.f82697c, this.f82698d, this.f82699e, d(this.f82704j), this.f82700f, this.f82701g, this.f82702h);
            this.f82705k = true;
            return c9156d;
        }

        @NotNull
        public final void f() {
            if (this.f82705k) {
                A1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            ArrayList<C1407a> arrayList = this.f82703i;
            C1407a remove = arrayList.remove(arrayList.size() - 1);
            ((ArrayList) ((C1407a) o0.b(1, arrayList)).a()).add(d(remove));
        }
    }

    /* renamed from: r1.d$b */
    public static final class b {
    }

    public C9156d(String str, float f7, float f11, float f12, float f13, l lVar, long j11, int i11, boolean z11) {
        int i12;
        synchronized (f82683k) {
            i12 = f82684l;
            f82684l = i12 + 1;
        }
        this.f82685a = str;
        this.f82686b = f7;
        this.f82687c = f11;
        this.f82688d = f12;
        this.f82689e = f13;
        this.f82690f = lVar;
        this.f82691g = j11;
        this.f82692h = i11;
        this.f82693i = z11;
        this.f82694j = i12;
    }

    public final boolean a() {
        return this.f82693i;
    }

    public final float b() {
        return this.f82687c;
    }

    public final float c() {
        return this.f82686b;
    }

    public final int d() {
        return this.f82694j;
    }

    @NotNull
    public final String e() {
        return this.f82685a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9156d)) {
            return false;
        }
        C9156d c9156d = (C9156d) obj;
        if (Intrinsics.d(this.f82685a, c9156d.f82685a) && Z1.h.b(this.f82686b, c9156d.f82686b) && Z1.h.b(this.f82687c, c9156d.f82687c) && this.f82688d == c9156d.f82688d && this.f82689e == c9156d.f82689e && Intrinsics.d(this.f82690f, c9156d.f82690f) && C7807Z.p(this.f82691g, c9156d.f82691g)) {
            return this.f82692h == c9156d.f82692h && this.f82693i == c9156d.f82693i;
        }
        return false;
    }

    @NotNull
    public final l f() {
        return this.f82690f;
    }

    public final int g() {
        return this.f82692h;
    }

    public final long h() {
        return this.f82691g;
    }

    public final int hashCode() {
        int hashCode = (this.f82690f.hashCode() + Pk0.b.a(this.f82689e, Pk0.b.a(this.f82688d, Pk0.b.a(this.f82687c, Pk0.b.a(this.f82686b, this.f82685a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Boolean.hashCode(this.f82693i) + C2454a.a(this.f82692h, Pk0.c.a(hashCode, 31, this.f82691g), 31);
    }

    public final float i() {
        return this.f82689e;
    }

    public final float j() {
        return this.f82688d;
    }
}

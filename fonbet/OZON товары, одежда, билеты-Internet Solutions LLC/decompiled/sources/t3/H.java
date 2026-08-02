package t3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: f, reason: collision with root package name */
    public static final H f98988f = new H(new a());

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.A<Integer> f98989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98990b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98991c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f98992d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98993e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.common.collect.A<Integer> f98994a = com.google.common.collect.A.D(1, 5);

        /* renamed from: b, reason: collision with root package name */
        private boolean f98995b = true;

        /* renamed from: c, reason: collision with root package name */
        private boolean f98996c = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f98997d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f98998e = true;
    }

    H(a aVar) {
        this.f98989a = aVar.f98994a;
        this.f98990b = aVar.f98995b;
        this.f98991c = aVar.f98996c;
        this.f98992d = aVar.f98997d;
        this.f98993e = aVar.f98998e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h11 = (H) obj;
        return this.f98989a.equals(h11.f98989a) && this.f98991c == h11.f98991c && this.f98990b == h11.f98990b && this.f98992d == h11.f98992d && this.f98993e == h11.f98993e;
    }

    public final int hashCode() {
        return Objects.hash(this.f98989a, null, null, Boolean.valueOf(this.f98990b), Boolean.valueOf(this.f98991c), Boolean.valueOf(this.f98992d), Boolean.valueOf(this.f98993e));
    }
}

package O;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8154d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f8155a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8157c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public final int a() {
        return b.f(this.f8156b);
    }

    public final int b() {
        return this.f8157c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f8156b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8157c == cVar.f8157c && Intrinsics.areEqual(this.f8155a, cVar.f8155a)) {
            return b.e(this.f8156b, cVar.f8156b);
        }
        return false;
    }

    public final String f() {
        return this.f8155a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f8155a.hashCode() * 31) + b.g(this.f8156b)) * 31) + this.f8157c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, c cVar);

    public String toString() {
        return this.f8155a + " (id=" + this.f8157c + ", model=" + ((Object) b.h(this.f8156b)) + ')';
    }

    public c(String name, long j10, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8155a = name;
        this.f8156b = j10;
        this.f8157c = i10;
        if (name.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}

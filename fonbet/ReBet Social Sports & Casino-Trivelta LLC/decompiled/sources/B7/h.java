package B7;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f853c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final h f854d = new h(-1, false);

    /* renamed from: e, reason: collision with root package name */
    public static final h f855e = new h(-2, false);

    /* renamed from: f, reason: collision with root package name */
    public static final h f856f = new h(-1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f857a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f858b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f854d;
        }

        public final h b() {
            return h.f856f;
        }

        public final h c() {
            return h.f855e;
        }

        public a() {
        }
    }

    public h(int i10, boolean z10) {
        this.f857a = i10;
        this.f858b = z10;
    }

    public static final h d() {
        return f853c.a();
    }

    public static final h e() {
        return f853c.b();
    }

    public static final h g() {
        return f853c.c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f857a == hVar.f857a && this.f858b == hVar.f858b;
    }

    public final boolean f() {
        return this.f858b;
    }

    public final int h() {
        if (j()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f857a;
    }

    public int hashCode() {
        return com.facebook.common.util.b.b(Integer.valueOf(this.f857a), Boolean.valueOf(this.f858b));
    }

    public final boolean i() {
        return this.f857a != -2;
    }

    public final boolean j() {
        return this.f857a == -1;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f857a), Boolean.valueOf(this.f858b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

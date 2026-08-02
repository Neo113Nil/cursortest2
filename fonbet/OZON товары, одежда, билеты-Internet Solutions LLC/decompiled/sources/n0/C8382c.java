package n0;

import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import l1.C7844u;
import l1.C7848y;
import l1.s0;
import n1.C8408a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8382c {

    /* renamed from: a, reason: collision with root package name */
    private C7848y f76150a;

    /* renamed from: b, reason: collision with root package name */
    private C7844u f76151b;

    /* renamed from: c, reason: collision with root package name */
    private C8408a f76152c;

    /* renamed from: d, reason: collision with root package name */
    private C7786D f76153d;

    public C8382c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8382c)) {
            return false;
        }
        C8382c c8382c = (C8382c) obj;
        return Intrinsics.d(this.f76150a, c8382c.f76150a) && Intrinsics.d(this.f76151b, c8382c.f76151b) && Intrinsics.d(this.f76152c, c8382c.f76152c) && Intrinsics.d(this.f76153d, c8382c.f76153d);
    }

    @NotNull
    public final s0 g() {
        C7786D c7786d = this.f76153d;
        if (c7786d != null) {
            return c7786d;
        }
        C7786D a11 = C7790H.a();
        this.f76153d = a11;
        return a11;
    }

    public final int hashCode() {
        C7848y c7848y = this.f76150a;
        int hashCode = (c7848y == null ? 0 : c7848y.hashCode()) * 31;
        C7844u c7844u = this.f76151b;
        int hashCode2 = (hashCode + (c7844u == null ? 0 : c7844u.hashCode())) * 31;
        C8408a c8408a = this.f76152c;
        int hashCode3 = (hashCode2 + (c8408a == null ? 0 : c8408a.hashCode())) * 31;
        C7786D c7786d = this.f76153d;
        return hashCode3 + (c7786d != null ? c7786d.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f76150a + ", canvas=" + this.f76151b + ", canvasDrawScope=" + this.f76152c + ", borderPath=" + this.f76153d + ')';
    }

    public C8382c(int i11) {
        this.f76150a = null;
        this.f76151b = null;
        this.f76152c = null;
        this.f76153d = null;
    }
}

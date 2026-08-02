package x1;

import B0.C2454a;
import B90.C2618u;
import Kk.C3532b;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10625A {

    /* renamed from: a, reason: collision with root package name */
    private final long f104803a;

    /* renamed from: b, reason: collision with root package name */
    private final long f104804b;

    /* renamed from: c, reason: collision with root package name */
    private final long f104805c;

    /* renamed from: d, reason: collision with root package name */
    private final long f104806d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f104807e;

    /* renamed from: f, reason: collision with root package name */
    private final float f104808f;

    /* renamed from: g, reason: collision with root package name */
    private final int f104809g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f104810h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f104811i;

    /* renamed from: j, reason: collision with root package name */
    private final long f104812j;

    /* renamed from: k, reason: collision with root package name */
    private final long f104813k;

    private C10625A() {
        throw null;
    }

    public C10625A(long j11, long j12, long j13, long j14, boolean z11, float f7, int i11, boolean z12, ArrayList arrayList, long j15, long j16) {
        this.f104803a = j11;
        this.f104804b = j12;
        this.f104805c = j13;
        this.f104806d = j14;
        this.f104807e = z11;
        this.f104808f = f7;
        this.f104809g = i11;
        this.f104810h = z12;
        this.f104811i = arrayList;
        this.f104812j = j15;
        this.f104813k = j16;
    }

    public final boolean a() {
        return this.f104810h;
    }

    public final boolean b() {
        return this.f104807e;
    }

    @NotNull
    public final List<C10631f> c() {
        return this.f104811i;
    }

    public final long d() {
        return this.f104803a;
    }

    public final long e() {
        return this.f104813k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10625A)) {
            return false;
        }
        C10625A c10625a = (C10625A) obj;
        return w.c(this.f104803a, c10625a.f104803a) && this.f104804b == c10625a.f104804b && C7459e.d(this.f104805c, c10625a.f104805c) && C7459e.d(this.f104806d, c10625a.f104806d) && this.f104807e == c10625a.f104807e && Float.compare(this.f104808f, c10625a.f104808f) == 0 && this.f104809g == c10625a.f104809g && this.f104810h == c10625a.f104810h && Intrinsics.d(this.f104811i, c10625a.f104811i) && C7459e.d(this.f104812j, c10625a.f104812j) && C7459e.d(this.f104813k, c10625a.f104813k);
    }

    public final long f() {
        return this.f104806d;
    }

    public final long g() {
        return this.f104805c;
    }

    public final float h() {
        return this.f104808f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104813k) + Pk0.c.a(C2618u.b(this.f104811i, C3532b.a(C2454a.a(this.f104809g, Pk0.b.a(this.f104808f, C3532b.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Long.hashCode(this.f104803a) * 31, 31, this.f104804b), 31, this.f104805c), 31, this.f104806d), 31, this.f104807e), 31), 31), 31, this.f104810h), 31), 31, this.f104812j);
    }

    public final long i() {
        return this.f104812j;
    }

    public final int j() {
        return this.f104809g;
    }

    public final long k() {
        return this.f104804b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) w.d(this.f104803a));
        sb2.append(", uptime=");
        sb2.append(this.f104804b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C7459e.m(this.f104805c));
        sb2.append(", position=");
        sb2.append((Object) C7459e.m(this.f104806d));
        sb2.append(", down=");
        sb2.append(this.f104807e);
        sb2.append(", pressure=");
        sb2.append(this.f104808f);
        sb2.append(", type=");
        int i11 = this.f104809g;
        sb2.append((Object) (i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", activeHover=");
        sb2.append(this.f104810h);
        sb2.append(", historical=");
        sb2.append(this.f104811i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C7459e.m(this.f104812j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) C7459e.m(this.f104813k));
        sb2.append(')');
        return sb2.toString();
    }
}

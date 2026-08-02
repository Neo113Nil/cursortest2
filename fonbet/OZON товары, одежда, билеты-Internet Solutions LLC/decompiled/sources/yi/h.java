package yi;

import B0.C2454a;
import C.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f106689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f106690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q f106691c;

    /* renamed from: d, reason: collision with root package name */
    private final int f106692d;

    /* renamed from: e, reason: collision with root package name */
    private final float f106693e;

    /* renamed from: f, reason: collision with root package name */
    private final Y.c f106694f;

    public h(int i11, @NotNull g lens, @NotNull q captureMode, int i12, float f7, Y.c cVar) {
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        this.f106689a = i11;
        this.f106690b = lens;
        this.f106691c = captureMode;
        this.f106692d = i12;
        this.f106693e = f7;
        this.f106694f = cVar;
    }

    @NotNull
    public final q a() {
        return this.f106691c;
    }

    public final int b() {
        return this.f106692d;
    }

    @NotNull
    public final g c() {
        return this.f106690b;
    }

    public final int d() {
        return this.f106689a;
    }

    public final Y.c e() {
        return this.f106694f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f106689a == hVar.f106689a && this.f106690b == hVar.f106690b && this.f106691c == hVar.f106691c && this.f106692d == hVar.f106692d && Float.compare(this.f106693e, hVar.f106693e) == 0 && Intrinsics.d(this.f106694f, hVar.f106694f);
    }

    public final float f() {
        return this.f106693e;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f106693e, C2454a.a(this.f106692d, (this.f106691c.hashCode() + ((this.f106690b.hashCode() + (Integer.hashCode(this.f106689a) * 31)) * 31)) * 31, 31), 31);
        Y.c cVar = this.f106694f;
        return a11 + (cVar == null ? 0 : cVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CameraSetup(lensFacing=" + this.f106689a + ", lens=" + this.f106690b + ", captureMode=" + this.f106691c + ", flashMode=" + this.f106692d + ", zoomLevel=" + this.f106693e + ", surfaceProvider=" + this.f106694f + ")";
    }

    public h() {
        this(1, g.WIDE, q.PHOTO, 2, 1.0f, null);
    }
}

package yi;

import C.o0;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106681a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f106682b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f106683c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f106684d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f106685e;

    /* renamed from: f, reason: collision with root package name */
    private final float f106686f;

    /* renamed from: g, reason: collision with root package name */
    private final float f106687g;

    /* renamed from: h, reason: collision with root package name */
    private final String f106688h;

    public f() {
        this(0);
    }

    public static f a(f fVar, boolean z11, boolean z12, boolean z13, boolean z14, float f7, float f11, String str, int i11) {
        boolean z15 = (i11 & 1) != 0 ? fVar.f106681a : true;
        if ((i11 & 2) != 0) {
            z11 = fVar.f106682b;
        }
        if ((i11 & 4) != 0) {
            z12 = fVar.f106683c;
        }
        if ((i11 & 8) != 0) {
            z13 = fVar.f106684d;
        }
        if ((i11 & 16) != 0) {
            z14 = fVar.f106685e;
        }
        if ((i11 & 32) != 0) {
            f7 = fVar.f106686f;
        }
        if ((i11 & 64) != 0) {
            f11 = fVar.f106687g;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = fVar.f106688h;
        }
        String str2 = str;
        fVar.getClass();
        float f12 = f11;
        float f13 = f7;
        boolean z16 = z14;
        boolean z17 = z13;
        return new f(z15, z11, z12, z17, z16, f13, f12, str2);
    }

    public final String b() {
        return this.f106688h;
    }

    public final boolean c() {
        return this.f106683c;
    }

    public final boolean d() {
        return this.f106682b;
    }

    public final boolean e() {
        return this.f106685e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f106681a == fVar.f106681a && this.f106682b == fVar.f106682b && this.f106683c == fVar.f106683c && this.f106684d == fVar.f106684d && this.f106685e == fVar.f106685e && Float.compare(this.f106686f, fVar.f106686f) == 0 && Float.compare(this.f106687g, fVar.f106687g) == 0 && Intrinsics.d(this.f106688h, fVar.f106688h);
    }

    public final boolean f() {
        return this.f106684d;
    }

    public final float g() {
        return this.f106686f;
    }

    public final float h() {
        return this.f106687g;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f106687g, Pk0.b.a(this.f106686f, C3532b.a(C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.f106681a) * 31, 31, this.f106682b), 31, this.f106683c), 31, this.f106684d), 31, this.f106685e), 31), 31);
        String str = this.f106688h;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return this.f106681a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraHardwareState(isReady=");
        sb2.append(this.f106681a);
        sb2.append(", hasFrontCamera=");
        sb2.append(this.f106682b);
        sb2.append(", hasBackCamera=");
        sb2.append(this.f106683c);
        sb2.append(", hasUltraWide=");
        sb2.append(this.f106684d);
        sb2.append(", hasTelephoto=");
        sb2.append(this.f106685e);
        sb2.append(", maxZoom=");
        sb2.append(this.f106686f);
        sb2.append(", ultraWideMinZoom=");
        sb2.append(this.f106687g);
        sb2.append(", error=");
        return o0.c(sb2, this.f106688h, ")");
    }

    public /* synthetic */ f(int i11) {
        this(false, false, false, false, false, 1.0f, 1.0f, null);
    }

    public f(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f7, float f11, String str) {
        this.f106681a = z11;
        this.f106682b = z12;
        this.f106683c = z13;
        this.f106684d = z14;
        this.f106685e = z15;
        this.f106686f = f7;
        this.f106687g = f11;
        this.f106688h = str;
    }
}

package zi;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yi.q f109288a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f109289b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f109290c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f109291d;

    public t() {
        this(0);
    }

    public static t a(t tVar, yi.q captureMode, boolean z11, boolean z12, boolean z13, int i11) {
        if ((i11 & 1) != 0) {
            captureMode = tVar.f109288a;
        }
        if ((i11 & 2) != 0) {
            z11 = tVar.f109289b;
        }
        if ((i11 & 4) != 0) {
            z12 = tVar.f109290c;
        }
        if ((i11 & 8) != 0) {
            z13 = tVar.f109291d;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        return new t(captureMode, z11, z12, z13);
    }

    @NotNull
    public final yi.q b() {
        return this.f109288a;
    }

    public final boolean c() {
        return this.f109291d;
    }

    public final boolean d() {
        return this.f109289b;
    }

    public final boolean e() {
        return this.f109290c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f109288a == tVar.f109288a && this.f109289b == tVar.f109289b && this.f109290c == tVar.f109290c && this.f109291d == tVar.f109291d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109291d) + C3532b.a(C3532b.a(this.f109288a.hashCode() * 31, 31, this.f109289b), 31, this.f109290c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControlsState(captureMode=");
        sb2.append(this.f109288a);
        sb2.append(", isRecording=");
        sb2.append(this.f109289b);
        sb2.append(", isSwitchCameraModeAllowed=");
        sb2.append(this.f109290c);
        sb2.append(", hasBothCameras=");
        return Pk0.a.a(")", sb2, this.f109291d);
    }

    public t(@NotNull yi.q captureMode, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        this.f109288a = captureMode;
        this.f109289b = z11;
        this.f109290c = z12;
        this.f109291d = z13;
    }

    public /* synthetic */ t(int i11) {
        this(yi.q.PHOTO, false, false, true);
    }
}

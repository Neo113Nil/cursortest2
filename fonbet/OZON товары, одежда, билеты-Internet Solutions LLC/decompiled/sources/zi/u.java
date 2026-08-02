package zi;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f109292a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f109293b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f109294c;

    public u() {
        this(0);
    }

    public static u a(u uVar, boolean z11, boolean z12, boolean z13, int i11) {
        if ((i11 & 1) != 0) {
            z11 = uVar.f109292a;
        }
        if ((i11 & 2) != 0) {
            z12 = uVar.f109293b;
        }
        if ((i11 & 4) != 0) {
            z13 = uVar.f109294c;
        }
        uVar.getClass();
        return new u(z11, z12, z13);
    }

    public final boolean b() {
        return this.f109294c;
    }

    public final boolean c() {
        return this.f109293b;
    }

    public final boolean d() {
        return this.f109292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f109292a == uVar.f109292a && this.f109293b == uVar.f109293b && this.f109294c == uVar.f109294c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109294c) + C3532b.a(Boolean.hashCode(this.f109292a) * 31, 31, this.f109293b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewState(isRecording=");
        sb2.append(this.f109292a);
        sb2.append(", isFlashOn=");
        sb2.append(this.f109293b);
        sb2.append(", showFlash=");
        return Pk0.a.a(")", sb2, this.f109294c);
    }

    public /* synthetic */ u(int i11) {
        this(false, false, true);
    }

    public u(boolean z11, boolean z12, boolean z13) {
        this.f109292a = z11;
        this.f109293b = z12;
        this.f109294c = z13;
    }
}

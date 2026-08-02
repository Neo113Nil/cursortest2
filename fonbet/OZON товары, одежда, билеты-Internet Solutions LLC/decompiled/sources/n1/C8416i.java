package n1;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import l1.C7787E;
import l1.t0;
import org.jetbrains.annotations.NotNull;

/* renamed from: n1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8416i extends AbstractC8413f {

    /* renamed from: a, reason: collision with root package name */
    private final float f76288a;

    /* renamed from: b, reason: collision with root package name */
    private final float f76289b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76290c;

    /* renamed from: d, reason: collision with root package name */
    private final int f76291d;

    /* renamed from: e, reason: collision with root package name */
    private final t0 f76292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8416i(float f7, float f11, int i11, int i12, C7787E c7787e, int i13) {
        super(0);
        f11 = (i13 & 2) != 0 ? 4.0f : f11;
        i11 = (i13 & 4) != 0 ? 0 : i11;
        i12 = (i13 & 8) != 0 ? 0 : i12;
        c7787e = (i13 & 16) != 0 ? null : c7787e;
        this.f76288a = f7;
        this.f76289b = f11;
        this.f76290c = i11;
        this.f76291d = i12;
        this.f76292e = c7787e;
    }

    public final int a() {
        return this.f76290c;
    }

    public final int b() {
        return this.f76291d;
    }

    public final float c() {
        return this.f76289b;
    }

    public final t0 d() {
        return this.f76292e;
    }

    public final float e() {
        return this.f76288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8416i)) {
            return false;
        }
        C8416i c8416i = (C8416i) obj;
        if (this.f76288a == c8416i.f76288a && this.f76289b == c8416i.f76289b) {
            if (this.f76290c == c8416i.f76290c) {
                return this.f76291d == c8416i.f76291d && Intrinsics.d(this.f76292e, c8416i.f76292e);
            }
        }
        return false;
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f76291d, C2454a.a(this.f76290c, Pk0.b.a(this.f76289b, Float.hashCode(this.f76288a) * 31, 31), 31), 31);
        t0 t0Var = this.f76292e;
        return a11 + (t0Var != null ? t0Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f76288a);
        sb2.append(", miter=");
        sb2.append(this.f76289b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i11 = this.f76290c;
        sb2.append((Object) (i11 == 0 ? "Butt" : i11 == 1 ? "Round" : i11 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i12 = this.f76291d;
        if (i12 == 0) {
            str = "Miter";
        } else if (i12 == 1) {
            str = "Round";
        } else if (i12 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=");
        sb2.append(this.f76292e);
        sb2.append(')');
        return sb2.toString();
    }
}

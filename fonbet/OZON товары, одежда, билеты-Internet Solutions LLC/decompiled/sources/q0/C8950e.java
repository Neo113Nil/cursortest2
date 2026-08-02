package q0;

import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8950e {

    /* renamed from: a, reason: collision with root package name */
    private final long f81305a;

    /* renamed from: b, reason: collision with root package name */
    private final long f81306b;

    /* renamed from: c, reason: collision with root package name */
    private final long f81307c;

    /* renamed from: d, reason: collision with root package name */
    private final long f81308d;

    /* renamed from: e, reason: collision with root package name */
    private final long f81309e;

    public C8950e(long j11, long j12, long j13, long j14, long j15) {
        this.f81305a = j11;
        this.f81306b = j12;
        this.f81307c = j13;
        this.f81308d = j14;
        this.f81309e = j15;
    }

    public final long a() {
        return this.f81305a;
    }

    public final long b() {
        return this.f81308d;
    }

    public final long c() {
        return this.f81306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8950e)) {
            return false;
        }
        C8950e c8950e = (C8950e) obj;
        return C7807Z.p(this.f81305a, c8950e.f81305a) && C7807Z.p(this.f81306b, c8950e.f81306b) && C7807Z.p(this.f81307c, c8950e.f81307c) && C7807Z.p(this.f81308d, c8950e.f81308d) && C7807Z.p(this.f81309e, c8950e.f81309e);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f81309e) + Pk0.c.a(Pk0.c.a(Pk0.c.a(Long.hashCode(this.f81305a) * 31, 31, this.f81306b), 31, this.f81307c), 31, this.f81308d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        Bi.a.e(this.f81305a, ", textColor=", sb2);
        Bi.a.e(this.f81306b, ", iconColor=", sb2);
        Bi.a.e(this.f81307c, ", disabledTextColor=", sb2);
        Bi.a.e(this.f81308d, ", disabledIconColor=", sb2);
        sb2.append((Object) C7807Z.v(this.f81309e));
        sb2.append(')');
        return sb2.toString();
    }
}

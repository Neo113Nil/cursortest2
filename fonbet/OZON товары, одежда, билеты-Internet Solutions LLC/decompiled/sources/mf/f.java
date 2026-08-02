package mf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74797a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f74798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74799c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f74800d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74801e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74802f;

    public f(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14) {
        this.f74797a = z11;
        this.f74798b = num;
        this.f74799c = z12;
        this.f74800d = num2;
        this.f74801e = z13;
        this.f74802f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f74797a == fVar.f74797a && Intrinsics.d(this.f74798b, fVar.f74798b) && this.f74799c == fVar.f74799c && Intrinsics.d(this.f74800d, fVar.f74800d) && this.f74801e == fVar.f74801e && this.f74802f == fVar.f74802f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z11 = this.f74797a;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = i11 * 31;
        Integer num = this.f74798b;
        int hashCode = (i12 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z12 = this.f74799c;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode + i13) * 31;
        Integer num2 = this.f74800d;
        int hashCode2 = (i14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z13 = this.f74801e;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode2 + i15) * 31;
        boolean z14 = this.f74802f;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f74797a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f74798b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f74799c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f74800d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f74801e);
        sb2.append(", unknownValues=");
        return Pk0.a.a(")", sb2, this.f74802f);
    }

    public f() {
        this(false, null, false, null, false, false);
    }
}

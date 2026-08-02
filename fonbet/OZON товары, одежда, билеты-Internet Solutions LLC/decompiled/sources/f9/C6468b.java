package f9;

import N3.C3660k;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;

/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C6468b extends l {

    /* renamed from: a, reason: collision with root package name */
    private final m f62989a;

    /* renamed from: b, reason: collision with root package name */
    private final zbok f62990b;

    /* renamed from: c, reason: collision with root package name */
    private final zbkx f62991c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f62992d;

    C6468b(m mVar, zbok zbokVar, zbkx zbkxVar, boolean z11) {
        this.f62989a = mVar;
        this.f62990b = zbokVar;
        if (zbkxVar == null) {
            throw new NullPointerException("Null lineBoxParcels");
        }
        this.f62991c = zbkxVar;
        this.f62992d = z11;
    }

    @Override // f9.l
    public final zbkx a() {
        return this.f62991c;
    }

    @Override // f9.l
    public final zbok b() {
        return this.f62990b;
    }

    @Override // f9.l
    public final m c() {
        return this.f62989a;
    }

    @Override // f9.l
    public final boolean d() {
        return this.f62992d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f62989a.equals(lVar.c()) && this.f62990b.equals(lVar.b()) && this.f62991c.equals(lVar.a()) && this.f62992d == lVar.d();
    }

    public final int hashCode() {
        return ((((((this.f62989a.hashCode() ^ 1000003) * 1000003) ^ this.f62990b.hashCode()) * 1000003) ^ this.f62991c.hashCode()) * 1000003) ^ (true != this.f62992d ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f62989a.toString();
        String obj2 = this.f62990b.toString();
        String obj3 = this.f62991c.toString();
        StringBuilder d11 = C3660k.d("VkpResults{status=", obj, ", textParcel=", obj2, ", lineBoxParcels=");
        d11.append(obj3);
        d11.append(", fromColdCall=");
        return Pk0.a.a("}", d11, this.f62992d);
    }
}

package v;

import Ve.Om;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c1;
import java.util.ArrayList;
import java.util.List;
import v.L;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10088d extends L.h {

    /* renamed from: a, reason: collision with root package name */
    private final String f101225a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f101226b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.O0 f101227c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.b1<?> f101228d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f101229e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.T0 f101230f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f101231g;

    C10088d(String str, Class cls, androidx.camera.core.impl.O0 o02, androidx.camera.core.impl.b1 b1Var, Size size, androidx.camera.core.impl.T0 t02, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f101225a = str;
        this.f101226b = cls;
        if (o02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f101227c = o02;
        if (b1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f101228d = b1Var;
        this.f101229e = size;
        this.f101230f = t02;
        this.f101231g = arrayList;
    }

    @Override // v.L.h
    final List<c1.b> a() {
        return this.f101231g;
    }

    @Override // v.L.h
    @NonNull
    final androidx.camera.core.impl.O0 b() {
        return this.f101227c;
    }

    @Override // v.L.h
    final androidx.camera.core.impl.T0 c() {
        return this.f101230f;
    }

    @Override // v.L.h
    final Size d() {
        return this.f101229e;
    }

    @Override // v.L.h
    @NonNull
    final androidx.camera.core.impl.b1<?> e() {
        return this.f101228d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L.h)) {
            return false;
        }
        L.h hVar = (L.h) obj;
        if (!this.f101225a.equals(hVar.f()) || !this.f101226b.equals(hVar.g()) || !this.f101227c.equals(hVar.b()) || !this.f101228d.equals(hVar.e())) {
            return false;
        }
        Size size = this.f101229e;
        if (size == null) {
            if (hVar.d() != null) {
                return false;
            }
        } else if (!size.equals(hVar.d())) {
            return false;
        }
        androidx.camera.core.impl.T0 t02 = this.f101230f;
        if (t02 == null) {
            if (hVar.c() != null) {
                return false;
            }
        } else if (!t02.equals(hVar.c())) {
            return false;
        }
        ArrayList arrayList = this.f101231g;
        return arrayList == null ? hVar.a() == null : arrayList.equals(hVar.a());
    }

    @Override // v.L.h
    @NonNull
    final String f() {
        return this.f101225a;
    }

    @Override // v.L.h
    @NonNull
    final Class<?> g() {
        return this.f101226b;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f101225a.hashCode() ^ 1000003) * 1000003) ^ this.f101226b.hashCode()) * 1000003) ^ this.f101227c.hashCode()) * 1000003) ^ this.f101228d.hashCode()) * 1000003;
        Size size = this.f101229e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.T0 t02 = this.f101230f;
        int hashCode3 = (hashCode2 ^ (t02 == null ? 0 : t02.hashCode())) * 1000003;
        ArrayList arrayList = this.f101231g;
        return hashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb2.append(this.f101225a);
        sb2.append(", useCaseType=");
        sb2.append(this.f101226b);
        sb2.append(", sessionConfig=");
        sb2.append(this.f101227c);
        sb2.append(", useCaseConfig=");
        sb2.append(this.f101228d);
        sb2.append(", surfaceResolution=");
        sb2.append(this.f101229e);
        sb2.append(", streamSpec=");
        sb2.append(this.f101230f);
        sb2.append(", captureTypes=");
        return Om.a("}", sb2, this.f101231g);
    }
}

package l1;

import android.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.P, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7798P extends z0 {

    /* renamed from: b, reason: collision with root package name */
    private final float f72238b;

    /* renamed from: c, reason: collision with root package name */
    private final float f72239c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72240d;

    public C7798P(float f7, int i11, float f11) {
        this.f72238b = f7;
        this.f72239c = f11;
        this.f72240d = i11;
    }

    @Override // l1.z0
    @NotNull
    protected final RenderEffect b() {
        return D0.f72196a.a(null, this.f72238b, this.f72239c, this.f72240d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7798P)) {
            return false;
        }
        C7798P c7798p = (C7798P) obj;
        return this.f72238b == c7798p.f72238b && this.f72239c == c7798p.f72239c && this.f72240d == c7798p.f72240d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72240d) + Pk0.b.a(this.f72239c, Float.hashCode(this.f72238b) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f72238b + ", radiusY=" + this.f72239c + ", edgeTreatment=" + ((Object) L0.a(this.f72240d)) + ')';
    }
}

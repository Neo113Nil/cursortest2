package we0;

import B4.V;
import Kk.C3532b;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.InterfaceC10542A;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10542A f104490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PointF f104491b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f104492c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f104493d;

    /* renamed from: e, reason: collision with root package name */
    private final float f104494e;

    /* renamed from: f, reason: collision with root package name */
    private final float f104495f;

    /* renamed from: g, reason: collision with root package name */
    private final float f104496g;

    public z(@NotNull InterfaceC10542A content, @NotNull PointF contentAnchor, boolean z11, boolean z12, float f7, float f11, float f12) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
        this.f104490a = content;
        this.f104491b = contentAnchor;
        this.f104492c = z11;
        this.f104493d = z12;
        this.f104494e = f7;
        this.f104495f = f11;
        this.f104496g = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [we0.A] */
    public static z a(z zVar, InterfaceC10542A.c cVar, PointF pointF, boolean z11, float f7, float f11, int i11) {
        InterfaceC10542A.c cVar2 = cVar;
        if ((i11 & 1) != 0) {
            cVar2 = zVar.f104490a;
        }
        InterfaceC10542A.c content = cVar2;
        if ((i11 & 2) != 0) {
            pointF = zVar.f104491b;
        }
        PointF contentAnchor = pointF;
        boolean z12 = zVar.f104492c;
        if ((i11 & 8) != 0) {
            z11 = zVar.f104493d;
        }
        boolean z13 = z11;
        float f12 = zVar.f104494e;
        if ((i11 & 32) != 0) {
            f7 = zVar.f104495f;
        }
        float f13 = f7;
        if ((i11 & 64) != 0) {
            f11 = zVar.f104496g;
        }
        zVar.getClass();
        zVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
        return new z(content, contentAnchor, z12, z13, f12, f13, f11);
    }

    public final float b() {
        return this.f104494e;
    }

    public final float c() {
        return this.f104496g;
    }

    @NotNull
    public final InterfaceC10542A d() {
        return this.f104490a;
    }

    @NotNull
    public final PointF e() {
        return this.f104491b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f104490a, zVar.f104490a) && Intrinsics.d(this.f104491b, zVar.f104491b) && this.f104492c == zVar.f104492c && this.f104493d == zVar.f104493d && Float.compare(this.f104494e, zVar.f104494e) == 0 && Float.compare(this.f104495f, zVar.f104495f) == 0 && Float.compare(this.f104496g, zVar.f104496g) == 0;
    }

    public final float f() {
        return this.f104495f;
    }

    public final boolean g() {
        return this.f104492c;
    }

    public final boolean h() {
        return this.f104493d;
    }

    public final int hashCode() {
        return Pk0.b.a(this.f104496g, Pk0.b.a(this.f104495f, Pk0.b.a(this.f104494e, C3532b.a(C3532b.a((this.f104491b.hashCode() + (this.f104490a.hashCode() * 31)) * 31, 31, this.f104492c), 31, this.f104493d), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlacemarkDisplayOptions(content=");
        sb2.append(this.f104490a);
        sb2.append(", contentAnchor=");
        sb2.append(this.f104491b);
        sb2.append(", isFlat=");
        sb2.append(this.f104492c);
        sb2.append(", isVisible=");
        sb2.append(this.f104493d);
        sb2.append(", alpha=");
        sb2.append(this.f104494e);
        sb2.append(", zIndex=");
        sb2.append(this.f104495f);
        sb2.append(", azimuth=");
        return V.b(this.f104496g, ", tappableArea=null)", sb2);
    }

    public /* synthetic */ z(InterfaceC10542A interfaceC10542A, PointF pointF, boolean z11, boolean z12, float f7, float f11, float f12, int i11) {
        this(interfaceC10542A, (i11 & 2) != 0 ? new PointF(0.5f, 0.5f) : pointF, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? 1.0f : f7, (i11 & 32) != 0 ? 0.0f : f11, (i11 & 64) != 0 ? 0.0f : f12);
    }
}

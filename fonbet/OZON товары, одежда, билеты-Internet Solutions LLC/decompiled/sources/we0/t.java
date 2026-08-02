package we0;

import Kk.C3532b;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.InterfaceC10542A;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10542A.c f104468a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PointF f104469b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f104470c;

    public t(@NotNull InterfaceC10542A.c content, @NotNull PointF contentAnchor, boolean z11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
        this.f104468a = content;
        this.f104469b = contentAnchor;
        this.f104470c = z11;
    }

    public static t a(t tVar, boolean z11) {
        InterfaceC10542A.c content = tVar.f104468a;
        tVar.getClass();
        PointF contentAnchor = tVar.f104469b;
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
        return new t(content, contentAnchor, z11);
    }

    @NotNull
    public final InterfaceC10542A b() {
        return this.f104468a;
    }

    @NotNull
    public final PointF c() {
        return this.f104469b;
    }

    public final boolean d() {
        return this.f104470c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f104468a.equals(tVar.f104468a) && this.f104469b.equals(tVar.f104469b) && this.f104470c == tVar.f104470c && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + Pk0.b.a(0.0f, Pk0.b.a(0.0f, Pk0.b.a(1.0f, C3532b.a(C3532b.a((this.f104469b.hashCode() + (this.f104468a.hashCode() * 961)) * 31, 31, false), 31, this.f104470c), 31), 31), 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapClusterDisplayOptions(content=");
        sb2.append(this.f104468a);
        sb2.append(", userData=null, contentAnchor=");
        sb2.append(this.f104469b);
        sb2.append(", isFlat=false, isVisible=");
        return Pk0.a.a(", alpha=1.0, zIndex=0.0, azimuth=0.0, onTap=null, isClickable=true)", sb2, this.f104470c);
    }
}

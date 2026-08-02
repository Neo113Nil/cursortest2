package r4;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import c4.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: b, reason: collision with root package name */
    public final View f22297b;

    public f(ImageView imageView) {
        this.f22297b = imageView;
    }

    @Override // r4.j
    public final Object a(t frame) {
        i b10 = k.b(this);
        if (b10 != null) {
            return b10;
        }
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        ViewTreeObserver viewTreeObserver = this.f22297b.getViewTreeObserver();
        m mVar = new m(this, viewTreeObserver, lVar);
        viewTreeObserver.addOnPreDrawListener(mVar);
        lVar.u(new l(this, viewTreeObserver, mVar));
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f22297b, ((f) obj).f22297b);
    }

    public final int hashCode() {
        return (this.f22297b.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f22297b + ", subtractPadding=true)";
    }
}

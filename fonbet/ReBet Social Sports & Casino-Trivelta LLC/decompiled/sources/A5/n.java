package A5;

import android.opengl.GLSurfaceView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends y {

    /* renamed from: x, reason: collision with root package name */
    public final GLSurfaceView f141x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GLSurfaceView glSurfaceView) {
        super(glSurfaceView);
        Intrinsics.checkNotNullParameter(glSurfaceView, "glSurfaceView");
        this.f141x = glSurfaceView;
    }

    @Override // A5.y, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f141x, ((n) obj).f141x);
    }

    @Override // A5.y, A5.H
    public int hashCode() {
        return this.f141x.hashCode();
    }

    @Override // A5.y, A5.H
    public String toString() {
        return "GLSurfaceViewMetadata(glSurfaceView=" + this.f141x + ")";
    }
}

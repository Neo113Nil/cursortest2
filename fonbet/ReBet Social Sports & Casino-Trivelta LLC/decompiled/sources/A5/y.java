package A5;

import android.view.SurfaceView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class y extends H {

    /* renamed from: w, reason: collision with root package name */
    public final SurfaceView f190w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(SurfaceView surfaceView) {
        super(surfaceView, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        this.f190w = surfaceView;
    }

    @Override // A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f190w, ((y) obj).f190w);
    }

    @Override // A5.H
    public int hashCode() {
        return this.f190w.hashCode();
    }

    @Override // A5.H
    public String toString() {
        return "SurfaceViewMetadata()";
    }
}

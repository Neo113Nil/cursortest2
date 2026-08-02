package y4;

import android.view.SurfaceView;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final /* synthetic */ class e extends C7735q implements Function2<y, SurfaceView, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f106000a = new e(2, y.class, "setVideoSurfaceView", "setVideoSurfaceView(Landroid/view/SurfaceView;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(y yVar, SurfaceView surfaceView) {
        y p02 = yVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        p02.g(surfaceView);
        return Unit.f71690a;
    }
}

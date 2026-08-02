package y4;

import android.content.Context;
import android.view.SurfaceView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

/* loaded from: classes8.dex */
final /* synthetic */ class d extends C7735q implements Function1<Context, SurfaceView> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f105999a = new d(1, SurfaceView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final SurfaceView invoke(Context context) {
        return new SurfaceView(context);
    }
}

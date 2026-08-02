package y4;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final /* synthetic */ class g extends C7735q implements Function1<Context, TextureView> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f106002a = new g(1, TextureView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final TextureView invoke(Context context) {
        Context p02 = context;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return new TextureView(p02);
    }
}

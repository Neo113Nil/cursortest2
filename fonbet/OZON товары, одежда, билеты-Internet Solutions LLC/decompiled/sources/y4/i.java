package y4;

import android.view.TextureView;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final /* synthetic */ class i extends C7735q implements Function2<y, TextureView, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f106004a = new i(2, y.class, "clearVideoTextureView", "clearVideoTextureView(Landroid/view/TextureView;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(y yVar, TextureView textureView) {
        y p02 = yVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        p02.s(textureView);
        return Unit.f71690a;
    }
}

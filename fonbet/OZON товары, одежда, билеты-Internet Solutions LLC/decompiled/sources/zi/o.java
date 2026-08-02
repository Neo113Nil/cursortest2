package zi;

import Ae.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel", f = "CameraScreenViewModel.kt", l = {502}, m = "handleCameraEvent")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    m f109261d;

    /* renamed from: e, reason: collision with root package name */
    yi.e f109262e;

    /* renamed from: f, reason: collision with root package name */
    x0 f109263f;

    /* renamed from: g, reason: collision with root package name */
    Object f109264g;

    /* renamed from: h, reason: collision with root package name */
    t f109265h;

    /* renamed from: i, reason: collision with root package name */
    u f109266i;

    /* renamed from: j, reason: collision with root package name */
    l f109267j;

    /* renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f109268k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ m f109269l;

    /* renamed from: m, reason: collision with root package name */
    int f109270m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(m mVar, kotlin.coroutines.d<? super o> dVar) {
        super(dVar);
        this.f109269l = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f109268k = obj;
        this.f109270m |= LinearLayoutManager.INVALID_OFFSET;
        return m.h0(this.f109269l, null, this);
    }
}

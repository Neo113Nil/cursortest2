package yi;

import C.InterfaceC2688h;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl", f = "CameraStateProvider.kt", l = {472}, m = "emitUpdatedCapabilities")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f106732d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2688h f106733e;

    /* renamed from: f, reason: collision with root package name */
    h f106734f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f106735g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ k f106736h;

    /* renamed from: i, reason: collision with root package name */
    int f106737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f106736h = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object y11;
        this.f106735g = obj;
        this.f106737i |= LinearLayoutManager.INVALID_OFFSET;
        y11 = this.f106736h.y(null, null, this);
        return y11;
    }
}

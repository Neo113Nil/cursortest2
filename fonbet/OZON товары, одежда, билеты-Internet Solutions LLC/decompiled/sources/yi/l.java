package yi;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import yi.c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl", f = "CameraStateProvider.kt", l = {498, 506, 508}, m = "emitDiscoveryResult")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f106727d;

    /* renamed from: e, reason: collision with root package name */
    c.b f106728e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f106729f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f106730g;

    /* renamed from: h, reason: collision with root package name */
    int f106731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f106730g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object x11;
        this.f106729f = obj;
        this.f106731h |= LinearLayoutManager.INVALID_OFFSET;
        x11 = this.f106730g.x(null, this);
        return x11;
    }
}

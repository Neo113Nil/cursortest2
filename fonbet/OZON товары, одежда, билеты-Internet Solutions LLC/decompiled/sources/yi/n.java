package yi;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl", f = "CameraStateProvider.kt", l = {162, 166, 167, 175}, m = "initialize")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f106738d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f106739e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f106740f;

    /* renamed from: g, reason: collision with root package name */
    int f106741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f106740f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f106739e = obj;
        this.f106741g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f106740f.j(this);
    }
}

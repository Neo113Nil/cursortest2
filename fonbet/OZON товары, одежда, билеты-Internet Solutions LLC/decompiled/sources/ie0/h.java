package ie0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient", f = "GeoProxyClient.kt", l = {324}, m = "getProviders$mapsdk_fullFirebaseOpenglRelease")
/* loaded from: classes7.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f66329d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f66330e;

    /* renamed from: f, reason: collision with root package name */
    int f66331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66330e = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66329d = obj;
        this.f66331f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f66330e.g(null, null, null, null, this);
    }
}

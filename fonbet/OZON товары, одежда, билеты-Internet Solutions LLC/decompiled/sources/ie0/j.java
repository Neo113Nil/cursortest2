package ie0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient", f = "GeoProxyClient.kt", l = {241, 244}, m = "getSuggestions")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f66337d;

    /* renamed from: e, reason: collision with root package name */
    String f66338e;

    /* renamed from: f, reason: collision with root package name */
    He0.b f66339f;

    /* renamed from: g, reason: collision with root package name */
    List f66340g;

    /* renamed from: h, reason: collision with root package name */
    String f66341h;

    /* renamed from: i, reason: collision with root package name */
    int f66342i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f66343j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g f66344k;

    /* renamed from: l, reason: collision with root package name */
    int f66345l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66344k = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66343j = obj;
        this.f66345l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f66344k.j(null, null, 0, null, null, this);
    }
}

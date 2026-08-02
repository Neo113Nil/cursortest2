package zf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor", f = "PeriodicPingInteractor.kt", l = {156}, m = "ping")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f109042d;

    /* renamed from: e, reason: collision with root package name */
    Object f109043e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f109044f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f109045g;

    /* renamed from: h, reason: collision with root package name */
    int f109046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f109045g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f109044f = obj;
        this.f109046h |= LinearLayoutManager.INVALID_OFFSET;
        return k.d(this.f109045g, null, this);
    }
}

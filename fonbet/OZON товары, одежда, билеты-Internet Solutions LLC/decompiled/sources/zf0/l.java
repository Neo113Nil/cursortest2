package zf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor", f = "PeriodicPingInteractor.kt", l = {204}, m = "awaitEnabled")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f109035d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f109036e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f109037f;

    /* renamed from: g, reason: collision with root package name */
    int f109038g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f109037f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object e11;
        this.f109036e = obj;
        this.f109038g |= LinearLayoutManager.INVALID_OFFSET;
        e11 = this.f109037f.e(this);
        return e11;
    }
}

package k30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.health.MobileHealthInteractor", f = "MobileHealthInteractor.kt", l = {418}, m = "checkLogs")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f70438d;

    /* renamed from: e, reason: collision with root package name */
    int f70439e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f70440f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ g f70441g;

    /* renamed from: h, reason: collision with root package name */
    int f70442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f70441g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c11;
        this.f70440f = obj;
        this.f70442h |= LinearLayoutManager.INVALID_OFFSET;
        c11 = this.f70441g.c(0, this);
        return c11;
    }
}

package j30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.graylog.GraylogInteractor", f = "GraylogInteractor.kt", l = {420}, m = "checkLogs")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f69365d;

    /* renamed from: e, reason: collision with root package name */
    int f69366e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f69367f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f69368g;

    /* renamed from: h, reason: collision with root package name */
    int f69369h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f69368g = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69367f = obj;
        this.f69369h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f69368g.g(0, this);
    }
}

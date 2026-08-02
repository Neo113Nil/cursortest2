package j30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.graylog.GraylogInteractor", f = "GraylogInteractor.kt", l = {339}, m = "logInternal")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f69424d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f69425e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f69426f;

    /* renamed from: g, reason: collision with root package name */
    int f69427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f69426f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m11;
        this.f69425e = obj;
        this.f69427g |= LinearLayoutManager.INVALID_OFFSET;
        m11 = this.f69426f.m(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        return m11;
    }
}

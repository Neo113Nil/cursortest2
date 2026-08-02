package t20;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.core.base.ClearAppDataExecutor", f = "ClearAppDataExecutor.kt", l = {13}, m = "execute")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f98971d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f98972e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f98973f;

    /* renamed from: g, reason: collision with root package name */
    int f98974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98973f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98972e = obj;
        this.f98974g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f98973f.a(this);
    }
}

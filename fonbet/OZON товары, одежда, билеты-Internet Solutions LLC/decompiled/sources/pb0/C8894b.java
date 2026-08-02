package pb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.antibot.callback.FullScreenAntibotCallback", f = "FullScreenAntibotCallback.kt", l = {66, 69}, m = "startAntibotActivity")
/* renamed from: pb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8894b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f80394d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8893a f80395e;

    /* renamed from: f, reason: collision with root package name */
    int f80396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8894b(C8893a c8893a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f80395e = c8893a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f80394d = obj;
        this.f80396f |= LinearLayoutManager.INVALID_OFFSET;
        return C8893a.c(this.f80395e, this);
    }
}

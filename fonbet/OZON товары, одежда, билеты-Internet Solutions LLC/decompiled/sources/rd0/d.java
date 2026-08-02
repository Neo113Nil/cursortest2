package rd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.user.GetUserUseCase", f = "GetUserUseCase.kt", l = {48}, m = "getUser")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f83327d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9255b f83328e;

    /* renamed from: f, reason: collision with root package name */
    int f83329f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C9255b c9255b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f83328e = c9255b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83327d = obj;
        this.f83329f |= LinearLayoutManager.INVALID_OFFSET;
        return C9255b.a(this.f83328e, null, this);
    }
}

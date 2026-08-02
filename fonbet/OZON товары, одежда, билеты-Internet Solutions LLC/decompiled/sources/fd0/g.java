package fd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessViewModel", f = "RequestPhoneAccessViewModel.kt", l = {138}, m = "callAction")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    n f63102d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f63103e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f63104f;

    /* renamed from: g, reason: collision with root package name */
    int f63105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63104f = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f63103e = obj;
        this.f63105g |= LinearLayoutManager.INVALID_OFFSET;
        return n.d0(this.f63104f, null, null, null, this);
    }
}

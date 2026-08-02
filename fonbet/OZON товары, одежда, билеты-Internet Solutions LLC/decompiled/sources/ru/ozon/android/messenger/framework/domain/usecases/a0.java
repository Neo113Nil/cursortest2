package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.h;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SetStateUseCase", f = "SetStateUseCase.kt", l = {16}, m = "invoke")
/* loaded from: classes10.dex */
final class a0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h.a f89042d;

    /* renamed from: e, reason: collision with root package name */
    String f89043e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89044f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b0 f89045g;

    /* renamed from: h, reason: collision with root package name */
    int f89046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(b0 b0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89045g = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89044f = obj;
        this.f89046h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89045g.a(null, null, false, this);
    }
}

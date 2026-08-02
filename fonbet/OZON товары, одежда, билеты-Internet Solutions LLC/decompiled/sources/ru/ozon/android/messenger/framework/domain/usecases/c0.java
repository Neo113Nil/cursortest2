package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.StartOrGetChatUseCase", f = "StartOrGetChatUseCase.kt", l = {17}, m = "invoke")
/* loaded from: classes10.dex */
final class c0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e0 f89061d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f89062e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e0 f89063f;

    /* renamed from: g, reason: collision with root package name */
    int f89064g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(e0 e0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89063f = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89062e = obj;
        this.f89064g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89063f.b(null, this);
    }
}

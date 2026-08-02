package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.InitializeChatUseCase", f = "InitializeChatUseCase.kt", l = {23}, m = "invoke")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9406x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9407y f89147d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f89148e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9407y f89149f;

    /* renamed from: g, reason: collision with root package name */
    int f89150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9406x(C9407y c9407y, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89149f = c9407y;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89148e = obj;
        this.f89150g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89149f.a(this);
    }
}

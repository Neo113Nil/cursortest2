package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.GetRemoteMessagesUseCase", f = "GetRemoteMessagesUseCase.kt", l = {14}, m = "invoke")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9398o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9397n f89104d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.b f89105e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89106f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9397n f89107g;

    /* renamed from: h, reason: collision with root package name */
    int f89108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9398o(C9397n c9397n, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89107g = c9397n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89106f = obj;
        this.f89108h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89107g.a(null, this);
    }
}

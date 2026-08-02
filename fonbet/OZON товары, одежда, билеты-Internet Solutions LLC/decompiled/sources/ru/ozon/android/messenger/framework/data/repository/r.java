package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {80}, m = "getOriginalText")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88605d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88606e;

    /* renamed from: f, reason: collision with root package name */
    int f88607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88606e = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88605d = obj;
        this.f88607f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88606e.w(null, this);
    }
}

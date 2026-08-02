package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {131}, m = "saveFastAnswerAction")
/* loaded from: classes10.dex */
final class B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9351a f88256d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88257e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9351a f88258f;

    /* renamed from: g, reason: collision with root package name */
    int f88259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88258f = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88257e = obj;
        this.f88259g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88258f.a(null, this);
    }
}

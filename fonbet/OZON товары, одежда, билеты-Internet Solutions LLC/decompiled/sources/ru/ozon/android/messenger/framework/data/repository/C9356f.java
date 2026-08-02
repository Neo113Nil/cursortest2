package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {98}, m = "executeChatWithSuccessAction")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9356f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9351a f88516d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88517e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9351a f88518f;

    /* renamed from: g, reason: collision with root package name */
    int f88519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9356f(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88518f = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88517e = obj;
        this.f88519g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88518f.g(null, this);
    }
}

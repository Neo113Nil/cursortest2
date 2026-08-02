package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {109}, m = "executeGetSuspiciousLinkModalAction")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9364n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9351a f88585d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88586e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9351a f88587f;

    /* renamed from: g, reason: collision with root package name */
    int f88588g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9364n(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88587f = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88586e = obj;
        this.f88588g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88587f.u(null, this);
    }
}

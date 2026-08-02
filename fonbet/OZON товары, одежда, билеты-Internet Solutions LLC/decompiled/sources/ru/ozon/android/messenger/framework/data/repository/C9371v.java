package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {74}, m = "openRateMessengerSuccessModalAction")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9371v extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88617d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88618e;

    /* renamed from: f, reason: collision with root package name */
    int f88619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9371v(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88618e = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88617d = obj;
        this.f88619f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88618e.k(null, this);
    }
}

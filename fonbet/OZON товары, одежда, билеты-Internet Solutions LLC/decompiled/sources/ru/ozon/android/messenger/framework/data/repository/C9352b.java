package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {57}, m = "activateCoupon")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9352b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9351a f88492d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88493e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9351a f88494f;

    /* renamed from: g, reason: collision with root package name */
    int f88495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9352b(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88494f = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88493e = obj;
        this.f88495g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88494f.n(null, this);
    }
}

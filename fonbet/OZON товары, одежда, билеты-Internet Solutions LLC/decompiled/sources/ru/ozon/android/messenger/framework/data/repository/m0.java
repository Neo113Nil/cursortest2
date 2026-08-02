package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UpdateGlobalCounterRepository", f = "UpdateGlobalCounterRepository.kt", l = {66}, m = "stop")
/* loaded from: classes10.dex */
final class m0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    n0 f88580d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f88581e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88582f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f88583g;

    /* renamed from: h, reason: collision with root package name */
    int f88584h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(n0 n0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88583g = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88582f = obj;
        this.f88584h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88583g.e(this);
    }
}

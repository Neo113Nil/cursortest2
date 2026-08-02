package ru.ozon.android.messenger.framework.data.repository;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UpdateGlobalCounterRepository", f = "UpdateGlobalCounterRepository.kt", l = {66, 43}, m = "start")
/* loaded from: classes10.dex */
final class j0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    n0 f88556d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3394a f88557e;

    /* renamed from: f, reason: collision with root package name */
    n0 f88558f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88559g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n0 f88560h;

    /* renamed from: i, reason: collision with root package name */
    int f88561i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j0(n0 n0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88560h = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88559g = obj;
        this.f88561i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88560h.d(this);
    }
}

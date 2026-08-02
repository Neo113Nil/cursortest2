package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {166}, m = "executeGetActionCurtainModalAction")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9360j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88553d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88554e;

    /* renamed from: f, reason: collision with root package name */
    int f88555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9360j(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88554e = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88553d = obj;
        this.f88555f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88554e.t(null, this);
    }
}

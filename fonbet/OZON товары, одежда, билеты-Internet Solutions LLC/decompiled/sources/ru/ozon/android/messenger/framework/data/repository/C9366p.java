package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {92}, m = "executeReplyChatMessage")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9366p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9351a f88598d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88599e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9351a f88600f;

    /* renamed from: g, reason: collision with root package name */
    int f88601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9366p(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88600f = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88599e = obj;
        this.f88601g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88600f.v(null, this);
    }
}

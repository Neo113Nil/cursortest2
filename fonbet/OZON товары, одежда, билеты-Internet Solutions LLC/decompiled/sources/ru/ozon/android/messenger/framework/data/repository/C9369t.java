package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl", f = "ActionRepositoryImpl.kt", l = {68}, m = "openDisclaimerModalAction")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9369t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88611d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88612e;

    /* renamed from: f, reason: collision with root package name */
    int f88613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9369t(C9351a c9351a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88612e = c9351a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88611d = obj;
        this.f88613f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88612e.c(null, this);
    }
}

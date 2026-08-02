package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", l = {189}, m = "getUndeliveredMessageItemVO")
/* loaded from: classes10.dex */
final class L extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    I f88363d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88364e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I f88365f;

    /* renamed from: g, reason: collision with root package name */
    int f88366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(I i11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88365f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88364e = obj;
        this.f88366g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88365f.o(null, this);
    }
}

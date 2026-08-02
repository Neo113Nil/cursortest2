package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", l = {246}, m = "loadLastUndeliveredMessagesGroupedByChatId")
/* loaded from: classes10.dex */
final class N extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    I f88371d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88372e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I f88373f;

    /* renamed from: g, reason: collision with root package name */
    int f88374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(I i11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88373f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88372e = obj;
        this.f88374g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88373f.b(this);
    }
}

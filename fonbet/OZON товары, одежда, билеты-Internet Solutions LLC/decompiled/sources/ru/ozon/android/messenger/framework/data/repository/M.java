package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", l = {194}, m = "getUndeliveredMessageModelToSend")
/* loaded from: classes10.dex */
final class M extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    I f88367d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88368e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I f88369f;

    /* renamed from: g, reason: collision with root package name */
    int f88370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(I i11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88369f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88368e = obj;
        this.f88370g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88369f.D(null, this);
    }
}

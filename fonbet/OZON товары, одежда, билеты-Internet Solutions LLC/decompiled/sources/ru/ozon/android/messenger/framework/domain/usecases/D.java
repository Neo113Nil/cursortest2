package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.OldSendMessageUseCase", f = "OldSendMessageUseCase.kt", l = {17}, m = "invoke")
/* loaded from: classes10.dex */
final class D extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    E f88955d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88956e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ E f88957f;

    /* renamed from: g, reason: collision with root package name */
    int f88958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(E e11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88957f = e11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88956e = obj;
        this.f88958g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88957f.a(null, null, null, this);
    }
}

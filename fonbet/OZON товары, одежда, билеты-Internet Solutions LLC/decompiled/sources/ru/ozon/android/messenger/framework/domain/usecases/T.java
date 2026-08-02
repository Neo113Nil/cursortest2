package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.model.g;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {113, 116}, m = "handleSendMessage")
/* loaded from: classes10.dex */
final class T extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    P f89014d;

    /* renamed from: e, reason: collision with root package name */
    g.a f89015e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89016f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ P f89017g;

    /* renamed from: h, reason: collision with root package name */
    int f89018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(P p11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89017g = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f89016f = obj;
        this.f89018h |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f89017g.h(null, this);
        return h11;
    }
}

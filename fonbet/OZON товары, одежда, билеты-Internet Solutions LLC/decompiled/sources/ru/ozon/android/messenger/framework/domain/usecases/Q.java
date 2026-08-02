package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {85, 89}, m = "handleResend")
/* loaded from: classes10.dex */
final class Q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f89008d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f89009e;

    /* renamed from: f, reason: collision with root package name */
    int f89010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(P p11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89009e = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f89008d = obj;
        this.f89010f |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f89009e.f(null, this);
        return f7;
    }
}

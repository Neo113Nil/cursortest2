package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {98, 104}, m = "handleResendMessageAfterConfirmation")
/* loaded from: classes10.dex */
final class S extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f89011d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f89012e;

    /* renamed from: f, reason: collision with root package name */
    int f89013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(P p11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89012e = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f89011d = obj;
        this.f89013f |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f89012e.g(null, this);
        return g10;
    }
}

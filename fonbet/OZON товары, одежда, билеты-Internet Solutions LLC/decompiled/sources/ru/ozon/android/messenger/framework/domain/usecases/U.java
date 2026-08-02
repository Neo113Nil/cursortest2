package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {160}, m = "resendMessageAfterConfirmationInternal")
/* loaded from: classes10.dex */
final class U extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    P f89019d;

    /* renamed from: e, reason: collision with root package name */
    String f89020e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89021f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ P f89022g;

    /* renamed from: h, reason: collision with root package name */
    int f89023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(P p11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89022g = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f89021f = obj;
        this.f89023h |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f89022g.j(null, this);
        return j11;
    }
}

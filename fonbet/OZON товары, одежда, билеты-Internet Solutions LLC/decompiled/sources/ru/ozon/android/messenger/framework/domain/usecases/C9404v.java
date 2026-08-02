package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.HandleChatEventsUseCase", f = "HandleChatEventsUseCase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "handleNewMessage")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9404v extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f89142d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9402t f89143e;

    /* renamed from: f, reason: collision with root package name */
    int f89144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9404v(C9402t c9402t, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89143e = c9402t;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f89142d = obj;
        this.f89144f |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f89143e.i(null, this);
        return i11;
    }
}

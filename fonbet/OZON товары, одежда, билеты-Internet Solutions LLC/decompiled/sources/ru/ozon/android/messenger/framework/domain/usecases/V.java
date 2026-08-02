package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 129, 131, 133, 146}, m = "resendUndeliveredMessageInternal")
/* loaded from: classes10.dex */
final class V extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    P f89024d;

    /* renamed from: e, reason: collision with root package name */
    String f89025e;

    /* renamed from: f, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f89026f;

    /* renamed from: g, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.s f89027g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f89028h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ P f89029i;

    /* renamed from: j, reason: collision with root package name */
    int f89030j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(P p11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89029i = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object k11;
        this.f89028h = obj;
        this.f89030j |= LinearLayoutManager.INVALID_OFFSET;
        k11 = this.f89029i.k(null, this);
        return k11;
    }
}

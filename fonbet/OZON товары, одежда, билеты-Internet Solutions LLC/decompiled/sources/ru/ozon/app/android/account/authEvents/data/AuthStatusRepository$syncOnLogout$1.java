package ru.ozon.app.android.account.authEvents.data;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.authEvents.data.AuthStatusRepository", f = "AuthStatusRepository.kt", l = {14}, m = "syncOnLogout-IoAF18A")
/* loaded from: classes11.dex */
final class AuthStatusRepository$syncOnLogout$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthStatusRepository$syncOnLogout$1(AuthStatusRepository authStatusRepository, d<? super AuthStatusRepository$syncOnLogout$1> dVar) {
        super(dVar);
        this.this$0 = authStatusRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m454syncOnLogoutIoAF18A = this.this$0.m454syncOnLogoutIoAF18A(this);
        return m454syncOnLogoutIoAF18A == a.COROUTINE_SUSPENDED ? m454syncOnLogoutIoAF18A : r.a(m454syncOnLogoutIoAF18A);
    }
}

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
@e(c = "ru.ozon.app.android.account.authEvents.data.AuthStatusRepository", f = "AuthStatusRepository.kt", l = {10}, m = "syncAuthStatus-gIAlu-s")
/* loaded from: classes11.dex */
final class AuthStatusRepository$syncAuthStatus$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthStatusRepository$syncAuthStatus$1(AuthStatusRepository authStatusRepository, d<? super AuthStatusRepository$syncAuthStatus$1> dVar) {
        super(dVar);
        this.this$0 = authStatusRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m452syncAuthStatusgIAlus = this.this$0.m452syncAuthStatusgIAlus(null, this);
        return m452syncAuthStatusgIAlus == a.COROUTINE_SUSPENDED ? m452syncAuthStatusgIAlus : r.a(m452syncAuthStatusgIAlus);
    }
}

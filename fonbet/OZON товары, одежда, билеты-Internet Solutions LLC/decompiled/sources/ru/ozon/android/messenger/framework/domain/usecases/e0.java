package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89070a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f89071b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W<ru.ozon.android.messenger.framework.presentation.models.responses.m> f89072c;

    public e0(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull W<ru.ozon.android.messenger.framework.presentation.models.responses.m> sendRequestWhenChatInitializedUseCase) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(sendRequestWhenChatInitializedUseCase, "sendRequestWhenChatInitializedUseCase");
        this.f89070a = chatRepository;
        this.f89071b = iVar;
        this.f89072c = sendRequestWhenChatInitializedUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ru.ozon.android.messenger.framework.data.requests.i iVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c0 c0Var;
        int i11;
        e0 e0Var;
        ru.ozon.android.messenger.utils.i iVar2;
        ru.ozon.android.messenger.framework.analytics.i iVar3;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i12 = c0Var.f89064g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c0Var.f89064g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c0Var.f89062e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0Var.f89064g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    d0 d0Var = new d0(this, iVar, null);
                    c0Var.f89061d = this;
                    c0Var.f89064g = 1;
                    obj = this.f89072c.a(d0Var, c0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                    e0Var = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e0Var = c0Var.f89061d;
                    Sc.s.b(obj);
                }
                iVar2 = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar2 instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.m mVar = (ru.ozon.android.messenger.framework.presentation.models.responses.m) ((i.b) iVar2).b();
                    if (mVar instanceof m.a) {
                        m.a aVar2 = (m.a) mVar;
                        if (aVar2.c() != null && (iVar3 = e0Var.f89071b) != null) {
                            ru.ozon.android.messenger.framework.analytics.h.f(iVar3, aVar2.c());
                        }
                    }
                }
                return iVar2;
            }
        }
        c0Var = new c0(this, cVar);
        Object obj2 = c0Var.f89062e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c0Var.f89064g;
        if (i11 != 0) {
        }
        iVar2 = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar2 instanceof i.b) {
        }
        return iVar2;
    }
}

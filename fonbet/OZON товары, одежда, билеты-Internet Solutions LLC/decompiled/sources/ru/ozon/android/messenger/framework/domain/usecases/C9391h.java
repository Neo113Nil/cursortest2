package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9391h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89084a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f89085b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W<ru.ozon.android.messenger.framework.presentation.models.responses.a> f89086c;

    public C9391h(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull W<ru.ozon.android.messenger.framework.presentation.models.responses.a> sendRequestWhenChatInitializedUseCase) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sendRequestWhenChatInitializedUseCase, "sendRequestWhenChatInitializedUseCase");
        this.f89084a = repository;
        this.f89085b = iVar;
        this.f89086c = sendRequestWhenChatInitializedUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ru.ozon.android.messenger.framework.data.requests.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9389f c9389f;
        int i11;
        C9391h c9391h;
        ru.ozon.android.messenger.utils.i iVar;
        ru.ozon.android.messenger.framework.analytics.i iVar2;
        if (cVar instanceof C9389f) {
            c9389f = (C9389f) cVar;
            int i12 = c9389f.f89076g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9389f.f89076g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9389f.f89074e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9389f.f89076g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9390g c9390g = new C9390g(this, aVar, null);
                    c9389f.f89073d = this;
                    c9389f.f89076g = 1;
                    obj = this.f89086c.a(c9390g, c9389f);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9391h = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9391h = c9389f.f89073d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.a aVar3 = (ru.ozon.android.messenger.framework.presentation.models.responses.a) ((i.b) iVar).b();
                    if (aVar3.a() != null && (iVar2 = c9391h.f89085b) != null) {
                        ru.ozon.android.messenger.framework.analytics.h.f(iVar2, aVar3.a());
                    }
                }
                return iVar;
            }
        }
        c9389f = new C9389f(this, cVar);
        Object obj2 = c9389f.f89074e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9389f.f89076g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
        return iVar;
    }
}

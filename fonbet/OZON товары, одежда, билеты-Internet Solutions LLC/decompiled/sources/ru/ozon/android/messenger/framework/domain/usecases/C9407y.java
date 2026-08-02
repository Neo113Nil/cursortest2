package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9407y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89151a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f89152b;

    public C9407y(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, ru.ozon.android.messenger.framework.analytics.i iVar) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f89151a = chatRepository;
        this.f89152b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9406x c9406x;
        int i11;
        C9407y c9407y;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9406x) {
            c9406x = (C9406x) cVar;
            int i12 = c9406x.f89150g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9406x.f89150g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9406x.f89148e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9406x.f89150g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.data.local.r rVar = ru.ozon.android.messenger.framework.data.local.r.INITIALIZING;
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = this.f89151a;
                    bVar.f(rVar);
                    ru.ozon.android.messenger.framework.data.requests.c cVar2 = new ru.ozon.android.messenger.framework.data.requests.c(this.f89152b != null);
                    c9406x.f89147d = this;
                    c9406x.f89150g = 1;
                    obj = bVar.x(cVar2, c9406x);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9407y = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9407y = c9406x.f89147d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.i iVar2 = (ru.ozon.android.messenger.framework.presentation.models.responses.i) ((i.b) iVar).b();
                    ru.ozon.android.messenger.framework.analytics.g gVar = new ru.ozon.android.messenger.framework.analytics.g(iVar2.a(), iVar2.c(), iVar2.b());
                    ru.ozon.android.messenger.framework.analytics.i iVar3 = c9407y.f89152b;
                    if (iVar3 != null) {
                        iVar3.appendPageState(gVar);
                    }
                    iVar = new i.b(iVar2);
                } else if (!(iVar instanceof i.a)) {
                    throw new Sc.o();
                }
                if (iVar instanceof i.b) {
                    c9407y.f89151a.f(ru.ozon.android.messenger.framework.data.local.r.INITIALIZED);
                }
                if (iVar instanceof i.a) {
                    c9407y.f89151a.f(ru.ozon.android.messenger.framework.data.local.r.INITIALIZE_FAILED);
                }
                return iVar;
            }
        }
        c9406x = new C9406x(this, cVar);
        Object obj2 = c9406x.f89148e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9406x.f89150g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (!(iVar instanceof i.b)) {
        }
        if (iVar instanceof i.b) {
        }
        if (iVar instanceof i.a) {
        }
        return iVar;
    }
}

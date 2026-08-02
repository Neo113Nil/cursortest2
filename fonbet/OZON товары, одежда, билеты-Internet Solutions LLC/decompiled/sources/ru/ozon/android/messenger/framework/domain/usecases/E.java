package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88959a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f88960b;

    public E(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, ru.ozon.android.messenger.framework.analytics.i iVar) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f88959a = chatRepository;
        this.f88960b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        D d11;
        int i11;
        E e11;
        ru.ozon.android.messenger.utils.i iVar;
        ru.ozon.android.messenger.framework.analytics.i iVar2;
        if (cVar2 instanceof D) {
            d11 = (D) cVar2;
            int i12 = d11.f88958g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d11.f88958g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d11.f88956e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d11.f88958g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    d11.f88955d = this;
                    d11.f88958g = 1;
                    obj = this.f88959a.F(str, d11, cVar, qVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    e11 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e11 = d11.f88955d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.l lVar = (ru.ozon.android.messenger.framework.presentation.models.responses.l) ((i.b) iVar).b();
                    if (lVar.d() != null && (iVar2 = e11.f88960b) != null) {
                        ru.ozon.android.messenger.framework.analytics.h.d(iVar2, lVar.d());
                    }
                }
                return iVar;
            }
        }
        d11 = new D(this, cVar2);
        Object obj2 = d11.f88956e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d11.f88958g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
        return iVar;
    }
}

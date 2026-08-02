package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.h;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89059a;

    public b0(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f89059a = chatRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull h.a aVar, @NotNull String str, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a0 a0Var;
        int i11;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i12 = a0Var.f89046h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a0Var.f89046h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a0Var.f89044f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = a0Var.f89046h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.data.requests.h hVar = new ru.ozon.android.messenger.framework.data.requests.h(aVar, str, z11);
                    a0Var.f89042d = aVar;
                    a0Var.f89043e = str;
                    a0Var.f89046h = 1;
                    obj = this.f89059a.B(hVar, a0Var);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = a0Var.f89043e;
                    aVar = a0Var.f89042d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.a) {
                    Lm0.a.f17149a.w("Unable to set " + aVar + " to chat " + str + ". Reason " + ((i.a) iVar).b(), new Object[0]);
                }
                return iVar;
            }
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.f89044f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a0Var.f89046h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.a) {
        }
        return iVar;
    }
}

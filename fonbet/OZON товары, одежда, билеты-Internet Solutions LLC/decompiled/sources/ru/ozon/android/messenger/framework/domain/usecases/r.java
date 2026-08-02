package ru.ozon.android.messenger.framework.domain.usecases;

import Ae.InterfaceC2395h;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89123a;

    public r(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89123a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9400q c9400q;
        int i11;
        if (cVar instanceof C9400q) {
            c9400q = (C9400q) cVar;
            int i12 = c9400q.f89122h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9400q.f89122h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9400q.f89120f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9400q.f89122h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c9400q.f89118d = xVarArr;
                    c9400q.f89119e = str;
                    c9400q.f89122h = 1;
                    obj = this.f89123a.getEvents();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c9400q.f89119e;
                    xVarArr = c9400q.f89118d;
                    Sc.s.b(obj);
                }
                return new C9399p((InterfaceC2395h) obj, xVarArr, str);
            }
        }
        c9400q = new C9400q(this, cVar);
        Object obj3 = c9400q.f89120f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9400q.f89122h;
        if (i11 != 0) {
        }
        return new C9399p((InterfaceC2395h) obj3, xVarArr, str);
    }
}

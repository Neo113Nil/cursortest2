package xb;

import Sc.r;
import Sc.s;
import We.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.I;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10695c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f105262a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Za.c f105263b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f105264c;

    public C10695c(E okHttpClient, Za.c hostInfoProvider) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f105262a = okHttpClient;
        this.f105263b = hostInfoProvider;
        this.f105264c = dispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10693a c10693a;
        int i11;
        if (cVar instanceof C10693a) {
            c10693a = (C10693a) cVar;
            int i12 = c10693a.f105257f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10693a.f105257f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10693a.f105255d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10693a.f105257f;
                if (i11 != 0) {
                    s.b(obj);
                    C10694b c10694b = new C10694b(list, this, null);
                    c10693a.f105257f = 1;
                    obj = C10727i.f(this.f105264c, c10694b, c10693a);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        c10693a = new C10693a(this, cVar);
        Object obj2 = c10693a.f105255d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10693a.f105257f;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }
}

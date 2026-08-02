package vc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import W2.f;
import W2.i;
import W2.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f102828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f.a<String> f102829b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull InterfaceC4008j<? extends InterfaceC3917k<W2.f>> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f102828a = dataStore;
        this.f102829b = i.c("UNIQUE_APPLICATION_ID");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10303a c10303a;
        int i11;
        c cVar2;
        String str;
        if (cVar instanceof C10303a) {
            c10303a = (C10303a) cVar;
            int i12 = c10303a.f102824g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10303a.f102824g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10303a.f102822e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10303a.f102824g;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC2395h<W2.f> data = this.f102828a.getValue().getData();
                    c10303a.f102821d = this;
                    c10303a.f102824g = 1;
                    obj = C2399j.u(data, c10303a);
                    if (obj != aVar) {
                        cVar2 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) c10303a.f102821d;
                    s.b(obj);
                    return str2;
                }
                cVar2 = (c) c10303a.f102821d;
                s.b(obj);
                str = (String) ((W2.f) obj).c(cVar2.f102829b);
                if (str == null) {
                    str = P4.f.b("toString(...)");
                    InterfaceC3917k<W2.f> value = cVar2.f102828a.getValue();
                    b bVar = new b(cVar2, str, null);
                    c10303a.f102821d = str;
                    c10303a.f102824g = 2;
                    if (j.a(value, bVar, c10303a) == aVar) {
                        return aVar;
                    }
                }
                return str;
            }
        }
        c10303a = new C10303a(this, cVar);
        Object obj2 = c10303a.f102822e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10303a.f102824g;
        if (i11 != 0) {
        }
        str = (String) ((W2.f) obj2).c(cVar2.f102829b);
        if (str == null) {
        }
        return str;
    }
}

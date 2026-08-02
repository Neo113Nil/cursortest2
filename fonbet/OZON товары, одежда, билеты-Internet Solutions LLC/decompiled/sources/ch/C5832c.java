package ch;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

/* renamed from: ch.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5832c {
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC5830a interfaceC5830a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5831b c5831b;
        int i11;
        int i12;
        if (cVar instanceof C5831b) {
            c5831b = (C5831b) cVar;
            int i13 = c5831b.f57182e;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5831b.f57182e = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5831b.f57181d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5831b.f57182e;
                if (i11 != 0) {
                    s.b(obj);
                    if (interfaceC5830a == null) {
                        i12 = 0;
                        return new Integer(i12);
                    }
                    c5831b.f57182e = 1;
                    obj = interfaceC5830a.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                i12 = ((Number) obj).intValue();
                return new Integer(i12);
            }
        }
        c5831b = new C5831b(cVar);
        Object obj2 = c5831b.f57181d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5831b.f57182e;
        if (i11 != 0) {
        }
        i12 = ((Number) obj2).intValue();
        return new Integer(i12);
    }
}

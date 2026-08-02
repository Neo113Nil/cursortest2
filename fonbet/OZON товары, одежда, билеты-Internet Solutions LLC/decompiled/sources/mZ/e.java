package mZ;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:20)(2:14|(2:16|17)(1:19))))|30|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        r5 = Sc.r.INSTANCE;
        r5 = Sc.s.a(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8119d c8119d;
        int i11;
        Throwable b11;
        if (cVar instanceof C8119d) {
            c8119d = (C8119d) cVar;
            int i12 = c8119d.f74690e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8119d.f74690e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8119d.f74689d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8119d.f74690e;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    c8119d.f74690e = 1;
                    obj = function1.invoke(c8119d);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                r.Companion companion2 = r.INSTANCE;
                b11 = r.b(obj);
                if (b11 != null) {
                    return obj;
                }
                if (b11 instanceof CancellationException) {
                    throw b11;
                }
                C8116a.f74679a.c("Network error", b11);
                return s.a(b11);
            }
        }
        c8119d = new C8119d(cVar);
        Object obj2 = c8119d.f74689d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8119d.f74690e;
        if (i11 != 0) {
        }
        r.Companion companion22 = r.INSTANCE;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
    }
}

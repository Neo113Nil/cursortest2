package ke0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import ie0.g;
import java.util.List;
import kotlin.coroutines.jvm.internal.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f71519a = new a();

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(String str, Double d11, Double d12, String str2, @NotNull c cVar) {
            C7672a c7672a;
            int i11;
            if (cVar instanceof C7672a) {
                c7672a = (C7672a) cVar;
                int i12 = c7672a.f71518f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c7672a.f71518f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    C7672a c7672a2 = c7672a;
                    Object obj = c7672a2.f71516d;
                    Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c7672a2.f71518f;
                    if (i11 != 0) {
                        s.b(obj);
                        g gVar = g.f66321a;
                        c7672a2.f71518f = 1;
                        obj = gVar.g(str, d11, d12, str2, c7672a2);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    List list = (List) obj;
                    list.isEmpty();
                    return list;
                }
            }
            c7672a = new C7672a(this, cVar);
            C7672a c7672a22 = c7672a;
            Object obj3 = c7672a22.f71516d;
            Object obj22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c7672a22.f71518f;
            if (i11 != 0) {
            }
            List list2 = (List) obj3;
            list2.isEmpty();
            return list2;
        }
    }
}

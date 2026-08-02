package ig;

import androidx.appcompat.widget.c1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Continuation[] f11244a = new Continuation[0];

    /* renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f11245b = new com.android.billingclient.api.a("NULL", 9);

    /* renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f11246c = new com.android.billingclient.api.a("UNINITIALIZED", 9);

    /* renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f11247d = new com.android.billingclient.api.a("DONE", 9);

    public static /* synthetic */ hg.g a(r rVar, CoroutineContext coroutineContext, int i5, gg.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f19227a;
        }
        if ((i10 & 2) != 0) {
            i5 = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = gg.a.f10048a;
        }
        return rVar.c(coroutineContext, i5, aVar);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation frame) {
        Object c2 = jg.y.c(coroutineContext, obj2);
        try {
            y yVar = new y(frame, coroutineContext);
            Object c8 = !c1.v(function2) ? lf.d.c(function2, obj, yVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, yVar);
            jg.y.a(coroutineContext, c2);
            if (c8 == lf.a.f20034a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return c8;
        } catch (Throwable th2) {
            jg.y.a(coroutineContext, c2);
            throw th2;
        }
    }
}

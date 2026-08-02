package xh;

import android.app.Application;
import android.content.Context;
import eg.e1;
import eg.m1;
import eg.o;
import eg.x;
import ig.u;
import jg.t;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25477b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f25476a = i5;
        this.f25477b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25476a) {
            case 0:
                Context context = (Context) this.f25477b;
                ji.a single = (ji.a) obj;
                fi.a it = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it, "it");
                return (Application) context;
            case 1:
                Context context2 = (Context) this.f25477b;
                ji.a single2 = (ji.a) obj;
                fi.a it2 = (fi.a) obj2;
                Intrinsics.checkNotNullParameter(single2, "$this$single");
                Intrinsics.checkNotNullParameter(it2, "it");
                return context2;
            default:
                u uVar = (u) this.f25477b;
                int intValue = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                f key = element.getKey();
                CoroutineContext.Element r5 = uVar.f11287b.r(key);
                if (key != x.f9237b) {
                    if (element != r5) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    e1 e1Var = (e1) r5;
                    Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                    e1 e1Var2 = (e1) element;
                    while (true) {
                        e1 e1Var3 = null;
                        if (e1Var2 == null) {
                            e1Var2 = null;
                        } else if (e1Var2 != e1Var && (e1Var2 instanceof t)) {
                            o oVar = (o) m1.f9203b.get((t) e1Var2);
                            if (oVar != null) {
                                e1Var3 = oVar.getParent();
                            }
                            e1Var2 = e1Var3;
                        }
                    }
                    if (e1Var2 != e1Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + e1Var2 + ", expected child of " + e1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(intValue);
        }
    }
}

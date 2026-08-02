package bo.app;

import Ph.P;
import Ph.Q;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ed extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f25432a;

    /* renamed from: b, reason: collision with root package name */
    public int f25433b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd f25435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(hd hdVar, Continuation continuation) {
        super(2, continuation);
        this.f25435d = hdVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ed edVar = new ed(this.f25435d, continuation);
        edVar.f25434c = obj;
        return edVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ed edVar = new ed(this.f25435d, (Continuation) obj2);
        edVar.f25434c = (P) obj;
        return edVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if (Ph.AbstractC1440a0.a(50, r13) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (Ph.AbstractC1440a0.a(r5, r13) != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b4 -> B:18:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        P p10 = (P) this.f25434c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25433b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                linkedHashMap = this.f25435d.f25527e;
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((c7) ((Map.Entry) it.next()).getValue()).f25327e.isEmpty()) {
                            this.f25434c = p10;
                            this.f25432a = null;
                            this.f25433b = 2;
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.f25520n, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.ed.c();
                    }
                }, 12, (Object) null);
                return Unit.INSTANCE;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        if (Q.i(p10)) {
            if (this.f25435d.f25533k.get() >= 5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.f25520n, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.s1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.ed.a();
                    }
                }, 12, (Object) null);
            } else {
                try {
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.f25520n, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.t1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ed.b();
                        }
                    }, 8, (Object) null);
                    long j10 = hd.f25522p;
                    this.f25434c = p10;
                    this.f25432a = SpillingKt.nullOutSpilledVariable(e10);
                    this.f25433b = 1;
                }
                hd.a(this.f25435d);
                linkedHashMap = this.f25435d.f25527e;
                if (!linkedHashMap.isEmpty()) {
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.f25520n, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.ed.c();
            }
        }, 12, (Object) null);
        return Unit.INSTANCE;
    }
}

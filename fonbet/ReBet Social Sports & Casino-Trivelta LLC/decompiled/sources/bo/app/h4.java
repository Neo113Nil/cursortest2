package bo.app;

import Ph.P;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f25505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f25506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f25507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(k4 k4Var, Intent intent, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.f25505b = k4Var;
        this.f25506c = intent;
        this.f25507d = pendingResult;
    }

    public static final String a() {
        return "Retrieving connectivity event data in background";
    }

    public static final String b() {
        return "Failed to process connectivity event.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h4 h4Var = new h4(this.f25505b, this.f25506c, this.f25507d, continuation);
        h4Var.f25504a = obj;
        return h4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25504a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.S2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.h4.a();
            }
        }, 6, (Object) null);
        try {
            k4 k4Var = this.f25505b;
            cb cbVar = k4Var.f25649j;
            k4Var.f25649j = com.braze.support.b.a(this.f25506c, k4Var.f25648i);
            k4 k4Var2 = this.f25505b;
            cb cbVar2 = k4Var2.f25649j;
            if (cbVar != cbVar2) {
                k4Var2.f25641b.b(new db(cbVar, cbVar2), db.class);
            }
            this.f25505b.b();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.T2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.h4.b();
                }
            }, 4, (Object) null);
            k4 k4Var3 = this.f25505b;
            k4Var3.a(k4Var3.f25641b, e10);
        }
        this.f25507d.finish();
        return Unit.INSTANCE;
    }
}

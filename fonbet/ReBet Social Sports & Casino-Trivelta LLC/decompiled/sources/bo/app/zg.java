package bo.app;

import Ph.AbstractC1457j;
import Ph.P;
import bo.app.zg;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ah f26365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(ah ahVar, Continuation continuation) {
        super(2, continuation);
        this.f26365b = ahVar;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zg zgVar = new zg(this.f26365b, continuation);
        zgVar.f26364a = obj;
        return zgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zg zgVar = new zg(this.f26365b, (Continuation) obj2);
        zgVar.f26364a = (P) obj;
        return zgVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f26364a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            if (this.f26365b.a().f25285a.a() == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) p10, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Xd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zg.a();
                    }
                }, 6, (Object) null);
                xg a10 = this.f26365b.a();
                a10.getClass();
                AbstractC1457j.b(null, new a(a10, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) p10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Yd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zg.b();
                    }
                }, 7, (Object) null);
            }
            z4 z4Var = this.f26365b.f25266h;
            if (z4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                z4Var = null;
            }
            if (z4Var.f25285a.a() == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) p10, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Zd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zg.c();
                    }
                }, 6, (Object) null);
                z4 z4Var2 = this.f26365b.f25266h;
                if (z4Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                    z4Var2 = null;
                }
                z4Var2.getClass();
                AbstractC1457j.b(null, new a(z4Var2, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger2, (Object) p10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ae
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zg.d();
                    }
                }, 7, (Object) null);
            }
            this.f26365b.f25257A.e();
            this.f26365b.f25267i.c();
            this.f26365b.f25272n.m();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.be
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zg.e();
                }
            }, 4, (Object) null);
        }
        try {
            this.f26365b.f25271m.f();
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29473W, (Throwable) e11, false, new Function0() { // from class: c3.ce
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zg.f();
                }
            }, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}

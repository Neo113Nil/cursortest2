package bo.app;

import Ph.P;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ba extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a9 f25295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(String str, String str2, a9 a9Var, Continuation continuation) {
        super(2, continuation);
        this.f25293b = str;
        this.f25294c = str2;
        this.f25295d = a9Var;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ba baVar = new ba(this.f25293b, this.f25294c, this.f25295d, continuation);
        baVar.f25292a = obj;
        return baVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ba) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25292a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f25293b;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ba.a();
                }
            }, 6, (Object) null);
            y8 m10 = k1.f25630g.m(this.f25294c);
            if (m10 != null) {
                ((e2) this.f25295d).a(m10);
            }
        } else {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
            final String str2 = this.f25293b;
            BrazeLogger.brazelog$default(brazeLogger, (Object) p10, priority, (Throwable) null, false, new Function0() { // from class: c3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ba.a(str2);
                }
            }, 6, (Object) null);
            y8 i10 = k1.f25630g.i(this.f25294c, this.f25293b);
            if (i10 != null) {
                ((e2) this.f25295d).a(i10);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(String str) {
        return "Logging click on in-app message with button id: " + str;
    }
}

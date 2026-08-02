package bo.app;

import com.braze.BrazeUser;
import com.braze.models.outgoing.AttributionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionData f25966b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(BrazeUser brazeUser, AttributionData attributionData, Continuation continuation) {
        super(2, continuation);
        this.f25965a = brazeUser;
        this.f25966b = attributionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r2(this.f25965a, this.f25966b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r2(this.f25965a, this.f25966b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        JSONObject key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25965a.userCache;
        AttributionData attributionData = this.f25966b;
        synchronized (xgVar) {
            if (attributionData != null) {
                try {
                    key = attributionData.getKey();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                key = null;
            }
            xgVar.b(key);
        }
        return Unit.INSTANCE;
    }
}

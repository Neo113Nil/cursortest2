package bo.app;

import com.braze.BrazeUser;
import com.braze.support.ValidationUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f25449a = brazeUser;
        this.f25450b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f3(this.f25449a, this.f25450b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f3(this.f25449a, this.f25450b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25449a.userCache;
        String key = this.f25450b;
        synchronized (xgVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            xgVar.a(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
        }
        return Unit.INSTANCE;
    }
}

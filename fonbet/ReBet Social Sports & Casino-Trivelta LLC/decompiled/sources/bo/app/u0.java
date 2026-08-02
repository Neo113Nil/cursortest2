package bo.app;

import com.braze.Braze;
import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f26093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f26093a = braze;
        this.f26094b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u0(this.f26093a, this.f26094b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u0(this.f26093a, this.f26094b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((ah) this.f26093a.getUdm$android_sdk_base_release()).f25268j.I()) {
            return (FeatureFlag) CollectionsKt.firstOrNull((List) ((ah) this.f26093a.getUdm$android_sdk_base_release()).f25281w.c(this.f26094b));
        }
        return null;
    }
}

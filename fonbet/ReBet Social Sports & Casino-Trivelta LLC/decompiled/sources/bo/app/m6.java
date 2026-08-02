package bo.app;

import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import zendesk.core.Constants;

/* loaded from: classes.dex */
public final class m6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(String str, Continuation continuation) {
        super(2, continuation);
        this.f25743a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m6(this.f25743a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m6(this.f25743a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URLConnection openConnection = new URL(this.f25743a).openConnection();
        openConnection.setRequestProperty(Constants.ACCEPT_HEADER, "text/event-stream");
        openConnection.setDoInput(true);
        openConnection.connect();
        return openConnection;
    }
}
